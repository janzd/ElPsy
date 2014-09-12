package elpsy.math;

import java.util.List;

/**
 * A Java class with basic mathematical functions.
 *
 * @author Jan Zdenek
 */
public class CommonMathUtils {

    /**
     * Finds the maximum of an array of integers.
     *
     * @param array	Array of integers
     * @return	Maximum value from the array
     */
    public static int max(int[] array) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    /**
     * Finds the maximum of an array of doubles.
     *
     * @param array	Array of doubles
     * @return	Maximum value from the array
     */
    public static double max(double[] array) {
        double maximum = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    /**
     * Finds the maximum of an array of longs.
     *
     * @param array	Array of longs
     * @return	Maximum value from the array
     */
    public static long max(long[] array) {
        long maximum = Long.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    /**
     * Finds the maximum of an array of floats.
     *
     * @param array	Array of floats
     * @return	Maximum value from the array
     */
    public static float max(float[] array) {
        float maximum = Float.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    /**
     * Finds the maximum of an array of bytes.
     *
     * @param array	Array of bytes
     * @return	Maximum value from the array
     */
    public static byte max(byte[] array) {
        byte maximum = Byte.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    /**
     * Finds the maximum value of a matrix of integers.
     *
     * @param matrix Matrix of integers.
     * @return Maximum value in the matrix.
     */
    public static int max(int[][] matrix) {
        int maximum = Integer.MIN_VALUE;
        for (int[] column : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (maximum < column[j]) {
                    maximum = column[j];
                }
            }
        }
        return maximum;
    }

    /**
     * Finds the maximum value of a matrix of doubles.
     *
     * @param matrix Matrix of doubles.
     * @return Maximum value in the matrix.
     */
    public static double max(double[][] matrix) {
        double maximum = Double.MIN_VALUE;
        for (double[] column : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (maximum < column[j]) {
                    maximum = column[j];
                }
            }
        }
        return maximum;
    }

    /**
     * Finds the maximum value of a matrix of longs.
     *
     * @param matrix Matrix of longs.
     * @return Maximum value in the matrix.
     */
    public static long max(long[][] matrix) {
        long maximum = Long.MIN_VALUE;
        for (long[] column : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (maximum < column[j]) {
                    maximum = column[j];
                }
            }
        }
        return maximum;
    }

    /**
     * Finds the maximum value of a matrix of floats.
     *
     * @param matrix Matrix of floats.
     * @return Maximum value in the matrix.
     */
    public static float max(float[][] matrix) {
        float maximum = Float.MIN_VALUE;
        for (float[] column : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (maximum < column[j]) {
                    maximum = column[j];
                }
            }
        }
        return maximum;
    }

    /**
     * Finds the maximum value of a matrix of bytes.
     *
     * @param matrix Matrix of bytes.
     * @return Maximum value in the matrix.
     */
    public static byte max(byte[][] matrix) {
        byte maximum = Byte.MIN_VALUE;
        for (byte[] column : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (maximum < column[j]) {
                    maximum = column[j];
                }
            }
        }
        return maximum;
    }

    /**
     * Finds the minimum of an array of integers.
     *
     * @param array	Array of integers
     * @return	Minimum value from the array
     */
    public static int min(int[] array) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    /**
     * Finds the minimum of an array of doubles.
     *
     * @param array	Array of doubles
     * @return	Minimum value from the array
     */
    public static double min(double[] array) {
        double minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    /**
     * Finds the minimum of an array of longs.
     *
     * @param array	Array of longs
     * @return	Minimum value from the array
     */
    public static long min(long[] array) {
        long minimum = Long.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    /**
     * Finds the minimum of an array of floats.
     *
     * @param array	Array of floats
     * @return	Minimum value from the array
     */
    public static float min(float[] array) {
        float minimum = Float.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    /**
     * Finds the minimum of an array of bytes.
     *
     * @param array	Array of bytes
     * @return	Minimum value from the array
     */
    public static byte min(byte[] array) {
        byte minimum = Byte.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minimum < array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    /**
     * Finds the minimum value of a matrix of integers.
     *
     * @param matrix Matrix of integers.
     * @return Minimum value in the matrix.
     */
    public static int min(int[][] matrix) {
        int minimum = Integer.MAX_VALUE;
        for (int[] column : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (minimum > column[j]) {
                    minimum = column[j];
                }
            }
        }
        return minimum;
    }

    /**
     * Finds the minimum value of a matrix of doubles.
     *
     * @param matrix Matrix of doubles.
     * @return Minimum value in the matrix.
     */
    public static double min(double[][] matrix) {
        double minimum = Double.MAX_VALUE;
        for (double[] column : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (minimum > column[j]) {
                    minimum = column[j];
                }
            }
        }
        return minimum;
    }

    /**
     * Finds the minimum value of a matrix of longs.
     *
     * @param matrix Matrix of longs.
     * @return Minimum value in the matrix.
     */
    public static long min(long[][] matrix) {
        long minimum = Long.MAX_VALUE;
        for (long[] column : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (minimum > column[j]) {
                    minimum = column[j];
                }
            }
        }
        return minimum;
    }

    /**
     * Finds the minimum value of a matrix of floats.
     *
     * @param matrix Matrix of floats.
     * @return Minimum value in the matrix.
     */
    public static float min(float[][] matrix) {
        float minimum = Float.MAX_VALUE;
        for (float[] column : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (minimum > column[j]) {
                    minimum = column[j];
                }
            }
        }
        return minimum;
    }

    /**
     * Finds the minimum value of a matrix of bytes.
     *
     * @param matrix Matrix of bytes.
     * @return Minimum value in the matrix.
     */
    public static byte min(byte[][] matrix) {
        byte minimum = Byte.MAX_VALUE;
        for (byte[] column : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (minimum > column[j]) {
                    minimum = column[j];
                }
            }
        }
        return minimum;
    }

    /**
     * Multiplies an array of doubles and an array of integers element-wise.
     *
     * @param a	Array of doubles.
     * @param b	Array of integers.
     * @return	Element-wise product of the arrays.
     * @throws ArithmeticException	Throws an exception when the two vectors are
     * not of the same size.
     */
    public static double[] multiplyElementwise(double[] a, int[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            double[] result = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] * b[i];
            }
            return result;
        }

    }

    /**
     * Multiplies two arrays of doubles element-wise.
     *
     * @param a	Array of doubles.
     * @param b	Array of doubles.
     * @return	Element-wise product of the two arrays.
     * @throws ArithmeticException	Throws an exception when the two vectors are
     * not of the same size.
     */
    public static double[] multiplyElementwise(double[] a, double[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            double[] result = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] * b[i];
            }
            return result;
        }

    }

    /**
     * Multiplies two arrays of integers element-wise.
     *
     * @param a	Array of integers.
     * @param b	Array of integers.
     * @return	Element-wise product of the two arrays.
     * @throws ArithmeticException	Throws an exception when the two vectors are
     * not of the same size.
     */
    public static int[] multiplyElementwise(int[] a, int[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            int[] result = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] * b[i];
            }
            return result;
        }

    }

    /**
     * Multiplies two arrays of floats element-wise.
     *
     * @param a	Array of floats.
     * @param b	Array of floats.
     * @return	Element-wise product of the two arrays.
     * @throws ArithmeticException	Throws an exception when the two vectors are
     * not of the same size.
     */
    public static float[] multiplyElementwise(float[] a, float[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            float[] result = new float[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] * b[i];
            }
            return result;
        }

    }

    /**
     * Multiplies two arrays of longs element-wise.
     *
     * @param a	Array of longs.
     * @param b	Array of longs.
     * @return	Element-wise product of the two arrays.
     * @throws ArithmeticException	Throws an exception when the two vectors are
     * not of the same size.
     */
    public static long[] multiplyElementwise(long[] a, long[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            long[] result = new long[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] * b[i];
            }
            return result;
        }

    }

    /**
     * Multiplies two arrays of bytes element-wise.
     *
     * @param a	Array of bytes.
     * @param b	Array of bytes.
     * @return	Element-wise product of the two arrays.
     * @throws ArithmeticException	Throws an exception when the two vectors are
     * not of the same size.
     */
    public static byte[] multiplyElementwise(byte[] a, byte[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            byte[] result = new byte[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = (byte) (a[i] * b[i]);
            }
            return result;
        }

    }

    /**
     * Multiplies two matrices of doubles element-wise.
     *
     * @param a	Matrix of doubles.
     * @param b	Matrix of doubles.
     * @return	Element-wise product of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static double[][] multiplyElementwise(double[][] a, double[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            double[][] result = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] * b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Multiplies two matrices of integers element-wise.
     *
     * @param a	Matrix of integers.
     * @param b	Matrix of integers.
     * @return	Element-wise product of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static int[][] multiplyElementwise(int[][] a, int[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            int[][] result = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] * b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Multiplies two matrices of floats element-wise.
     *
     * @param a	Matrix of floats.
     * @param b	Matrix of floats.
     * @return	Element-wise product of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static float[][] multiplyElementwise(float[][] a, float[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            float[][] result = new float[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] * b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Multiplies two matrices of longs element-wise.
     *
     * @param a	Matrix of longs.
     * @param b	Matrix of longs.
     * @return	Element-wise product of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static long[][] multiplyElementwise(long[][] a, long[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            long[][] result = new long[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] * b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Multiplies two matrices of bytes element-wise.
     *
     * @param a	Matrix of bytes.
     * @param b	Matrix of bytes.
     * @return	Element-wise product of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static int[][] multiplyElementwise(byte[][] a, byte[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            int[][] result = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] * b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Adds up the values in the two arrays of integers element-wise.
     *
     * @param a	Array of integers.
     * @param b	Array of integers.
     * @return	Element-wise sum of arrays.
     * @throws ArithmeticException	Throws an exception when the arrays differ in
     * length.
     */
    public static int[] addElementwise(int[] a, int[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            int[] result = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] + b[i];
            }
            return result;
        }

    }

    /**
     * Adds up the values in the two arrays of doubles element-wise.
     *
     * @param a	Array of doubles.
     * @param b	Array of doubles.
     * @return	Element-wise sum of arrays.
     * @throws ArithmeticException	Throws an exception when the arrays differ in
     * length.
     */
    public static double[] addElementwise(double[] a, double[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            double[] result = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] + b[i];
            }
            return result;
        }

    }

    /**
     * Adds up the values in the two arrays of longs element-wise.
     *
     * @param a	Array of longs.
     * @param b	Array of longs.
     * @return	Element-wise sum of arrays.
     * @throws ArithmeticException	Throws an exception when the arrays differ in
     * length.
     */
    public static long[] addElementwise(long[] a, long[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            long[] result = new long[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] + b[i];
            }
            return result;
        }

    }

    /**
     * Adds up the values in the two arrays of floats element-wise.
     *
     * @param a	Array of floats.
     * @param b	Array of floats.
     * @return	Element-wise sum of arrays.
     * @throws ArithmeticException	Throws an exception when the arrays differ in
     * length.
     */
    public static float[] addElementwise(float[] a, float[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            float[] result = new float[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] + b[i];
            }
            return result;
        }

    }

    /**
     * Adds up the values in the two arrays of bytes element-wise.
     *
     * @param a	Array of bytes.
     * @param b	Array of bytes.
     * @return	Element-wise sum of arrays.
     * @throws ArithmeticException	Throws an exception when the arrays differ in
     * length.
     */
    public static byte[] addElementwise(byte[] a, byte[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            byte[] result = new byte[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = (byte) (a[i] + b[i]);
            }
            return result;
        }

    }

    /**
     * Adds up the values in an array of doubles and an array of integers
     * element-wise.
     *
     * @param a	Array of doubles.
     * @param b	Array of integers.
     * @return	Element-wise sum of arrays.
     * @throws ArithmeticException	Throws an exception when the arrays differ in
     * length.
     */
    public static double[] addElementwise(double[] a, int[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            double[] result = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] + b[i];
            }
            return result;
        }

    }

    /**
     * Adds up two matrices of doubles element-wise.
     *
     * @param a	Matrix of doubles.
     * @param b	Matrix of doubles.
     * @return	Element-wise sum of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static double[][] addElementwise(double[][] a, double[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            double[][] result = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Adds up two matrices of doubles and integers element-wise.
     *
     * @param a	Matrix of doubles.
     * @param b	Matrix of integers.
     * @return	Element-wise sum of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static double[][] addElementwise(double[][] a, int[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            double[][] result = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Adds up two matrices of integers element-wise.
     *
     * @param a	Matrix of integers.
     * @param b	Matrix of integers.
     * @return	Element-wise sum of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static int[][] addElementwise(int[][] a, int[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            int[][] result = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Adds up two matrices of doubles element-wise.
     *
     * @param a	Matrix of doubles.
     * @param b	Matrix of doubles.
     * @return	Element-wise sum of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static float[][] addElementwise(float[][] a, float[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            float[][] result = new float[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Adds up two matrices of longs element-wise.
     *
     * @param a	Matrix of longs.
     * @param b	Matrix of longs.
     * @return	Element-wise sum of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static long[][] addElementwise(long[][] a, long[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            long[][] result = new long[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Adds up two matrices of byte element-wise.
     *
     * @param a	Matrix of bytes.
     * @param b	Matrix of bytes.
     * @return	Element-wise sum of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static byte[][] addElementwise(byte[][] a, byte[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            byte[][] result = new byte[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = (byte) (a[i][j] + b[i][j]);
                }
            }
            return result;
        }

    }

    /**
     * Subtracts the values in the two arrays of integers element-wise.
     *
     * @param a	Array of integers.
     * @param b	Array of integers.
     * @return	Result of element-wise subtraction of arrays.
     * @throws ArithmeticException	Throws exception when the arrays differ in
     * length.
     */
    public static int[] subtractElementwise(int[] a, int[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            int[] result = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] - b[i];
            }
            return result;
        }

    }

    /**
     * Subtracts the values in the two arrays of doubles element-wise.
     *
     * @param a	Array of doubles.
     * @param b	Array of doubles.
     * @return	Result of element-wise subtraction of arrays.
     * @throws ArithmeticException	Throws exception when the arrays differ in
     * length.
     */
    public static double[] subtractElementwise(double[] a, double[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            double[] result = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] - b[i];
            }
            return result;
        }

    }

    /**
     * Subtracts the values in the two arrays of longs element-wise.
     *
     * @param a	Array of longs.
     * @param b	Array of longs.
     * @return	Result of element-wise subtraction of arrays.
     * @throws ArithmeticException	Throws exception when the arrays differ in
     * length.
     */
    public static long[] subtractElementwise(long[] a, long[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            long[] result = new long[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] - b[i];
            }
            return result;
        }

    }

    /**
     * Subtracts the values in the two arrays of floats element-wise.
     *
     * @param a	Array of floats.
     * @param b	Array of floats.
     * @return	Result of element-wise subtraction of arrays.
     * @throws ArithmeticException	Throws exception when the arrays differ in
     * length.
     */
    public static float[] subtractElementwise(float[] a, float[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            float[] result = new float[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] - b[i];
            }
            return result;
        }

    }

    /**
     * Subtracts the values in the two arrays of bytes element-wise.
     *
     * @param a	Array of bytes.
     * @param b	Array of bytes.
     * @return	Result of element-wise subtraction of arrays.
     * @throws ArithmeticException	Throws exception when the arrays differ in
     * length.
     */
    public static byte[] subtractElementwise(byte[] a, byte[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            byte[] result = new byte[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = (byte) (a[i] - b[i]);
            }
            return result;
        }

    }

    /**
     * Subtracts the values in an array of doubles and and array of integers
     * element-wise.
     *
     * @param a	Array of doubles.
     * @param b	Array of integers.
     * @return	Result of element-wise subtraction of arrays.
     * @throws ArithmeticException	Throws exception when the arrays differ in
     * length.
     */
    public static double[] subtractElementwise(double[] a, int[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            double[] result = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] - b[i];
            }
            return result;
        }

    }

    /**
     * Subtracts the values in the two matrices element-wise.
     *
     * @param a	Matrix of doubles.
     * @param b	Matrix of doubles.
     * @return	Element-wise sum of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static double[][] subtractElementwise(double[][] a, double[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            double[][] result = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] - b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Subtracts the values in the two matrices element-wise.
     *
     * @param a	Matrix of integers.
     * @param b	Matrix of integers.
     * @return	Element-wise sum of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static int[][] subtractElementwise(int[][] a, int[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            int[][] result = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] - b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Subtracts the values in the two matrices element-wise.
     *
     * @param a	Matrix of doubles.
     * @param b	Matrix of doubles.
     * @return	Element-wise sum of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static float[][] subtractElementwise(float[][] a, float[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            float[][] result = new float[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] - b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Subtracts the values in the two matrices element-wise.
     *
     * @param a	Matrix of doubles.
     * @param b	Matrix of doubles.
     * @return	Element-wise sum of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static long[][] subtractElementwise(long[][] a, long[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            long[][] result = new long[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] - b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Subtracts the values in the two matrices element-wise.
     *
     * @param a	Matrix of doubles.
     * @param b	Matrix of doubles.
     * @return	Element-wise sum of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static byte[][] subtractElementwise(byte[][] a, byte[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            byte[][] result = new byte[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = (byte) (a[i][j] - b[i][j]);
                }
            }
            return result;
        }

    }

    /**
     * Subtracts the values in the two matrices element-wise.
     *
     * @param a	Matrix of doubles.
     * @param b	Matrix of doubles.
     * @return	Element-wise sum of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static double[][] subtractElementwise(double[][] a, int[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            double[][] result = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] - b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Divides the values in the two arrays of integers element-wise.
     *
     * @param a Array of integer dividends.
     * @param b Array of integer divisors.
     * @return Result of element-wise division of arrays.
     * @throws ArithmeticException Throws exception when the arrays differ in
     * length.
     */
    public static double[] divideElementwise(int[] a, int[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            double[] result = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = (double) a[i] / b[i];
            }
            return result;
        }

    }

    /**
     * Divides the values in the two arrays of doubles element-wise.
     *
     * @param a Array of double dividends.
     * @param b Array of double divisors.
     * @return Result of element-wise division of arrays.
     * @throws ArithmeticException Throws exception when the arrays differ in
     * length.
     */
    public static double[] divideElementwise(double[] a, double[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            double[] result = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] / b[i];
            }
            return result;
        }

    }

    /**
     * Divides the values in the two arrays of longs element-wise.
     *
     * @param a Array of long dividends.
     * @param b Array of long divisors.
     * @return Result of element-wise division of arrays.
     * @throws ArithmeticException Throws exception when the arrays differ in
     * length.
     */
    public static double[] divideElementwise(long[] a, long[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            double[] result = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = (double) a[i] / b[i];
            }
            return result;
        }

    }

    /**
     * Divides the values in the two arrays of floats element-wise.
     *
     * @param a Array of float dividends.
     * @param b Array of float divisors.
     * @return Result of element-wise division of arrays.
     * @throws ArithmeticException Throws exception when the arrays differ in
     * length.
     */
    public static float[] divideElementwise(float[] a, float[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            float[] result = new float[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] / b[i];
            }
            return result;
        }

    }

    /**
     * Divides the values in the two arrays of bytes element-wise.
     *
     * @param a Array of byte dividends.
     * @param b Array of byte divisors.
     * @return Result of element-wise division of arrays.
     * @throws ArithmeticException Throws exception when the arrays differ in
     * length.
     */
    public static float[] divideElementwise(byte[] a, byte[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            float[] result = new float[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = (float) a[i] / b[i];
            }
            return result;
        }

    }

    /**
     * Divides the values in the two matrices element-wise.
     *
     * @param a Matrix of double dividends.
     * @param b Matrix of double divisors.
     * @return	Result of element-wise division of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static double[][] divideElementwise(double[][] a, double[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            double[][] result = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] / b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Divides the values in the two matrices element-wise.
     *
     * @param a Matrix of integer dividends.
     * @param b Matrix of integer divisors.
     * @return	Result of element-wise division of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static double[][] divideElementwise(int[][] a, int[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            double[][] result = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = (double) a[i][j] / b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Divides the values in the two matrices element-wise.
     *
     * @param a Matrix of float dividends.
     * @param b Matrix of float divisors.
     * @return	Result of element-wise division of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static float[][] divideElementwise(float[][] a, float[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            float[][] result = new float[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] / b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Divides the values in the two matrices element-wise.
     *
     * @param a Matrix of double dividends.
     * @param b Matrix of double divisors.
     * @return	Result of element-wise division of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static double[][] divideElementwise(long[][] a, long[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            double[][] result = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = (double) a[i][j] / b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Divides the values in the two matrices element-wise.
     *
     * @param a Matrix of float dividends.
     * @param b Matrix of float divisors.
     * @return	Result of element-wise division of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static float[][] divideElementwise(byte[][] a, byte[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            float[][] result = new float[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = (float) a[i][j] / b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Divides the values in the two matrices element-wise.
     *
     * @param a Matrix of double dividends.
     * @param b Matrix of double divisors.
     * @return	Result of element-wise division of the two matrices.
     * @throws ArithmeticException	Throws an exception when the two matrices are
     * not of the same size.
     */
    public static double[][] divideElementwise(double[][] a, int[][] b) throws ArithmeticException {

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new ArithmeticException();
        } else {
            double[][] result = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[i][j] / b[i][j];
                }
            }
            return result;
        }

    }

    /**
     * Computes the sum of an array of doubles.
     *
     * @param array	Array of doubles to be added up.
     * @return	Sum of the array.
     */
    public static double sum(double[] array) {

        double sum = 0;
        for (double d : array) {
            sum += d;
        }

        return sum;
    }

    /**
     * Computes the sum of an array of integers.
     *
     * @param array	Array of integers to be added up.
     * @return	Sum of the array.
     */
    public static int sum(int[] array) {

        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        return sum;
    }

    /**
     * Computes the sum of an array of floats.
     *
     * @param array	Array of floats to be added up.
     * @return	Sum of the array.
     */
    public static float sum(float[] array) {

        int sum = 0;
        for (float f : array) {
            sum += f;
        }

        return sum;
    }

    /**
     * Computes the sum of an array of longs.
     *
     * @param array	Array of longs to be added up.
     * @return	Sum of the array.
     */
    public static long sum(long[] array) {

        long sum = 0;
        for (long l : array) {
            sum += l;
        }

        return sum;
    }

    /**
     * Computes the sum of an array of bytes.
     *
     * @param array	Array of bytes to be added up.
     * @return	Sum of the array.
     */
    public static int sum(byte[] array) {

        int sum = 0;
        for (byte b : array) {
            sum += b;
        }

        return sum;
    }

    /**
     * Computes the sum of values in a matrix of integers.
     *
     * @param matrix Matrix of integers.
     * @return Sum of the matrix values.
     */
    public static int sum(int[][] matrix) {

        int width = matrix.length;
        int height = matrix[0].length;
        int sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += matrix[j][i];
            }
        }

        return sum;

    }

    /**
     * Computes the sum of values in a matrix of doubles.
     *
     * @param matrix Matrix of doubles.
     * @return Sum of the matrix values.
     */
    public static double sum(double[][] matrix) {

        int width = matrix.length;
        int height = matrix[0].length;
        double sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += matrix[j][i];
            }
        }

        return sum;

    }

    /**
     * Computes the sum of values in a matrix of longs.
     *
     * @param matrix Matrix of longs.
     * @return Sum of the matrix values.
     */
    public static long sum(long[][] matrix) {

        int width = matrix.length;
        int height = matrix[0].length;
        long sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += matrix[j][i];
            }
        }

        return sum;

    }

    /**
     * Computes the sum of values in a matrix of floats.
     *
     * @param matrix Matrix of floats.
     * @return Sum of the matrix values.
     */
    public static float sum(float[][] matrix) {

        int width = matrix.length;
        int height = matrix[0].length;
        float sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += matrix[j][i];
            }
        }

        return sum;

    }

    /**
     * Computes the sum of values in a matrix of bytes.
     *
     * @param matrix Matrix of bytes.
     * @return Sum of the matrix values.
     */
    public static int sum(byte[][] matrix) {

        int width = matrix.length;
        int height = matrix[0].length;
        int sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += matrix[j][i];
            }
        }

        return sum;

    }

    /**
     *
     * @param array
     * @return
     */
    public static int sum(List<Integer> array) {

        int sum = 0;
        for (int f : array) {
            sum += f;
        }

        return sum;
    }

    /**
     * Computes the factorial of a number.
     *
     * @param number	An integer whose factorial to compute.
     * @return	The factorial of the integer.
     */
    public static int factorial(int number) {

        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }

    }

    /**
     * Exponentiates all values in an array of doubles by a given exponent.
     *
     * @param array	Array of doubles to be exponentiated.
     * @param exponent	An exponent.
     * @return	Array with exponentiated values.
     */
    public static double[] exponentiateAll(double[] array, float exponent) {

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.pow(array[i], exponent);
        }

        return array;
    }

    /**
     * Exponentiates all values in an array of integers by a given exponent.
     *
     * @param array	Array of integers to be exponentiated.
     * @param exponent	An exponent.
     * @return	Array with exponentiated values.
     */
    public static double[] exponentiateAll(int[] array, float exponent) {

        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = Math.pow(array[i], exponent);
        }

        return newArray;
    }

    /**
     * Exponentiates all values in an array of floats by a given exponent.
     *
     * @param array	Array of floats to be exponentiated.
     * @param exponent	An exponent.
     * @return	Array with exponentiated values.
     */
    public static float[] exponentiateAll(float[] array, float exponent) {

        float[] newArray = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = (float) Math.pow(array[i], exponent);
        }

        return newArray;
    }

    /**
     * Exponentiates all values in an array of longs by a given exponent.
     *
     * @param array	Array of longs to be exponentiated.
     * @param exponent	An exponent.
     * @return	Array with exponentiated values.
     */
    public static double[] exponentiateAll(long[] array, float exponent) {

        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = Math.pow(array[i], exponent);
        }

        return newArray;
    }

    /**
     * Exponentiates all values in an array of bytes by a given exponent.
     *
     * @param array	Array of bytes to be exponentiated.
     * @param exponent	An exponent.
     * @return	Array with exponentiated values.
     */
    public static float[] exponentiateAll(byte[] array, float exponent) {

        float[] newArray = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = (float) Math.pow(array[i], exponent);
        }

        return newArray;
    }

    /**
     * Exponentiates all values in a matrix of doubles by a given exponent.
     *
     * @param matrix	Matrix of doubles to be exponentiated.
     * @param exponent	An exponent.
     * @return	Matrix with exponentiated values.
     */
    public static double[][] exponentiateAll(double[][] matrix, float exponent) {

        for (double[] column : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                column[j] = Math.pow(column[j], exponent);
            }
        }

        return matrix;

    }

    /**
     * Exponentiates all values in a matrix of integers by a given exponent.
     *
     * @param matrix	Matrix of integers to be exponentiated.
     * @param exponent	An exponent.
     * @return	Matrix with exponentiated values.
     */
    public static double[][] exponentiateAll(int[][] matrix, float exponent) {

        double[][] newMatrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[i][j] = Math.pow(matrix[i][j], exponent);
            }
        }

        return newMatrix;

    }

    /**
     * Exponentiates all values in a matrix of floats by a given exponent.
     *
     * @param matrix	Matrix of floats to be exponentiated.
     * @param exponent	An exponent.
     * @return	Matrix with exponentiated values.
     */
    public static float[][] exponentiateAll(float[][] matrix, float exponent) {

        float[][] newMatrix = new float[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[i][j] = (float) Math.pow(matrix[i][j], exponent);
            }
        }

        return newMatrix;

    }

    /**
     * Exponentiates all values in a matrix of longs by a given exponent.
     *
     * @param matrix	Matrix of longs to be exponentiated.
     * @param exponent	An exponent.
     * @return	Matrix with exponentiated values.
     */
    public static double[][] exponentiateAll(long[][] matrix, float exponent) {

        double[][] newMatrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[i][j] = Math.pow(matrix[i][j], exponent);
            }
        }

        return newMatrix;

    }

    /**
     * Exponentiates all values in a matrix of doubles by a given exponent.
     *
     * @param matrix	Matrix of integers to be exponentiated.
     * @param exponent	An exponent.
     * @return	Matrix with exponentiated values.
     */
    public static float[][] exponentiateAll(byte[][] matrix, float exponent) {

        float[][] newMatrix = new float[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[i][j] = (float) Math.pow(matrix[i][j], exponent);
            }
        }

        return newMatrix;

    }

    /**
     * Computes the determinant of a matrix. The matrix has to be a square
     * matrix; otherwise, an exception is thrown.
     *
     * @param matrix	Matrix input.
     * @return	The determinant of the matrix.
     * @throws ArithmeticException Throws exception when the matrix is not
     * square.
     */
    public static double determinant(double[][] matrix) throws ArithmeticException {

        if (matrix.length != matrix[0].length) {
            throw new ArithmeticException();
        }

        double det = 0;
        int sign = 1;

        if (matrix.length == 1) {
            return matrix[0][0];
        } else {
            double[][] smallerMat = new double[matrix.length - 1][matrix.length - 1];
            for (int i = 0; i < matrix.length; i++) {
                int a = 0;
                int b = 0;
                for (int j = 1; j < matrix.length; j++) {
                    for (int k = 0; k < matrix.length; k++) {
                        if (k < i) {
                            smallerMat[j - 1][k] = matrix[j][k];
                        } else if (k > i) {
                            smallerMat[j - 1][k - 1] = matrix[j][k];
                        }
                    }
                }
                det += sign * matrix[0][i] * determinant(smallerMat);
                sign = -sign;
            }
        }

        return det;
    }

    /**
     * Compute the determinant of a matrix. The matrix has to be a square
     * matrix; otherwise, an exception is thrown.
     *
     * @param matrix	Matrix input.
     * @return	The determinant of the matrix.
     * @throws ArithmeticException Throws exception when the matrix is not
     * square.
     */
    public static double determinant(int[][] matrix) throws ArithmeticException {

        if (matrix.length != matrix[0].length) {
            throw new ArithmeticException();
        }

        double det = 0;
        int sign = 1;

        if (matrix.length == 1) {
            return matrix[0][0];
        } else {
            int[][] smallerMat = new int[matrix.length - 1][matrix.length - 1];
            for (int i = 0; i < matrix.length; i++) {
                int a = 0;
                int b = 0;
                for (int j = 1; j < matrix.length; j++) {
                    for (int k = 0; k < matrix.length; k++) {
                        if (k < i) {
                            smallerMat[j - 1][k] = matrix[j][k];
                        } else if (k > i) {
                            smallerMat[j - 1][k - 1] = matrix[j][k];
                        }
                    }
                }
                det += sign * matrix[0][i] * determinant(smallerMat);
                sign = -sign;
            }
        }

        return det;
    }

    /**
     * Compute the determinant of a matrix. The matrix has to be a square
     * matrix; otherwise, an exception is thrown.
     *
     * @param matrix	Matrix input.
     * @return	The determinant of the matrix.
     * @throws ArithmeticException Throws exception when the matrix is not
     * square.
     */
    public static double determinant(float[][] matrix) throws ArithmeticException {

        if (matrix.length != matrix[0].length) {
            throw new ArithmeticException();
        }

        double det = 0;
        int sign = 1;

        if (matrix.length == 1) {
            return matrix[0][0];
        } else {
            float[][] smallerMat = new float[matrix.length - 1][matrix.length - 1];
            for (int i = 0; i < matrix.length; i++) {
                int a = 0;
                int b = 0;
                for (int j = 1; j < matrix.length; j++) {
                    for (int k = 0; k < matrix.length; k++) {
                        if (k < i) {
                            smallerMat[j - 1][k] = matrix[j][k];
                        } else if (k > i) {
                            smallerMat[j - 1][k - 1] = matrix[j][k];
                        }
                    }
                }
                det += sign * matrix[0][i] * determinant(smallerMat);
                sign = -sign;
            }
        }

        return det;
    }

    /**
     * Compute the determinant of a matrix. The matrix has to be a square
     * matrix; otherwise, an exception is thrown.
     *
     * @param matrix	Matrix input.
     * @return	The determinant of the matrix.
     * @throws ArithmeticException Throws exception when the matrix is not
     * square.
     */
    public static double determinant(long[][] matrix) {

        if (matrix.length != matrix[0].length) {
            throw new ArithmeticException();
        }

        double det = 0;
        int sign = 1;

        if (matrix.length == 1) {
            return matrix[0][0];
        } else {
            long[][] smallerMat = new long[matrix.length - 1][matrix.length - 1];
            for (int i = 0; i < matrix.length; i++) {
                int a = 0;
                int b = 0;
                for (int j = 1; j < matrix.length; j++) {
                    for (int k = 0; k < matrix.length; k++) {
                        if (k < i) {
                            smallerMat[j - 1][k] = matrix[j][k];
                        } else if (k > i) {
                            smallerMat[j - 1][k - 1] = matrix[j][k];
                        }
                    }
                }
                det += sign * matrix[0][i] * determinant(smallerMat);
                sign = -sign;
            }
        }

        return det;
    }

    /**
     * Compute the determinant of a matrix. The matrix has to be a square
     * matrix; otherwise, an exception is thrown.
     *
     * @param matrix	Matrix input.
     * @return	The determinant of the matrix.
     * @throws ArithmeticException Throws exception when the matrix is not
     * square.
     */
    public static double determinant(byte[][] matrix) throws ArithmeticException {

        if (matrix.length != matrix[0].length) {
            throw new ArithmeticException();
        }

        double det = 0;
        int sign = 1;

        if (matrix.length == 1) {
            return matrix[0][0];
        } else {
            byte[][] smallerMat = new byte[matrix.length - 1][matrix.length - 1];
            for (int i = 0; i < matrix.length; i++) {
                int a = 0;
                int b = 0;
                for (int j = 1; j < matrix.length; j++) {
                    for (int k = 0; k < matrix.length; k++) {
                        if (k < i) {
                            smallerMat[j - 1][k] = matrix[j][k];
                        } else if (k > i) {
                            smallerMat[j - 1][k - 1] = matrix[j][k];
                        }
                    }
                }
                det += sign * matrix[0][i] * determinant(smallerMat);
                sign = -sign;
            }
        }

        return det;
    }

    /**
     * Multiplies two matrices using an implementation faster than the
     * straightforward one. The multiplication order is A * B and the results is
     * a matrix.
     *
     * @param a	Matrix of doubles.
     * @param b	Matrix of doubles.
     * @return	Matrix computed by matrix multiplication of the two matrices.
     */
    public static double[][] multiplyMatrices(double[][] a, double[][] b) {

        double[][] c = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < b.length; k++) {
                for (int j = 0; j < b[0].length; j++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }

    /**
     * Multiplies two matrices using an implementation faster than the
     * straightforward one. The multiplication order is A * B and the result is
     * a matrix.
     *
     * @param a	Matrix of integers.
     * @param b	Matrix of integers.
     * @return	Matrix result of matrix multiplication of the two matrices.
     */
    public static double[][] multiplyMatrices(int[][] a, int[][] b) {

        double[][] c = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < b.length; k++) {
                for (int j = 0; j < b[0].length; j++) {
                    c[i][j] += (double) a[i][k] * (double) b[k][j];
                }
            }
        }

        return c;
    }

    /**
     * Multiplies a matrix and a vector. The multiplication order is: matrix *
     * vector. The result of multiplication is a vector.
     *
     * @param matrix	Matrix of doubles.
     * @param vector	Vector of doubles.
     * @return	Vector result of multiplication of the matrix and vector.
     */
    public static double[] multiplyMatrixAndVector(double[][] matrix, double[] vector) {

        double[] res = new double[matrix[0].length];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res[j] += matrix[i][j] * vector[i];
            }
        }

        return res;
    }

    /**
     * Multiplies a matrix and a vector. The multiplication order is: matrix *
     * vector. The result of multiplication is a vector.
     *
     * @param matrix	Matrix of integers.
     * @param vector	Vector of integers.
     * @return	Vector result of multiplication of the matrix and vector.
     */
    public static double[] multiplyMatrixAndVector(int[][] matrix, int[] vector) {

        double[] res = new double[matrix.length];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res[j] += (double) matrix[i][j] * (double) vector[i];
            }
        }

        return res;
    }

    /**
     * Multiplies a vector and a matrix. The multiplication order is: vector *
     * matrix. The result of multiplication is a vector.
     *
     * @param vector	Vector of integers.
     * @param matrix	Matrix of integers.
     * @return	Vector result of multiplication of the vector and matrix.
     */
    public static double[] multiplyVectorAndMatrix(double[] vector, double[][] matrix) {

        double[] res = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                res[i] += matrix[i][j] * vector[j];
            }
        }

        return res;
    }

    /**
     * Multiplies a vector and a matrix. The multiplication order is: vector *
     * matrix. The result of multiplication is a vector.
     *
     * @param vector	Vector of integers.
     * @param matrix	Matrix of integers.
     * @return	Vector result of multiplication of the vector and matrix.
     */
    public static double[] multiplyVectorAndMatrix(int[] vector, int[][] matrix) {

        double[] res = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                res[i] += (double) matrix[i][j] * (double) vector[j];
            }
        }

        return res;
    }

    /**
     * Computes the dot product of two vectors.
     *
     * @param a	Vector of doubles.
     * @param b	Vector of doubles.
     * @return	Dot product of the two vectors.
     * @throws ArithmeticException	Throws an exception when the vectors are not
     * of the same length.
     */
    public static double dotProduct(double[] a, double[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException("The length of the vectors does not match!");
        } else {
            double sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i] * b[i];
            }
            return sum;
        }

    }

    /**
     * Computes the dot product of two vectors.
     *
     * @param a	Vector of integers.
     * @param b	Vector of integers.
     * @return	Dot product of the two vectors.
     * @throws ArithmeticException	Throws an exception when the two vectors are
     * not of the same length.
     */
    public static int dotProduct(int[] a, int[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += (double) a[i] * (double) b[i];
            }
            return sum;
        }

    }

    /**
     * Computes the dot product of two vectors.
     *
     * @param a	Vector of igs.
     * @param b	Vector of floats.
     * @return	Dot product of the two vectors.
     * @throws ArithmeticException	Throws an exception when the two vectors are
     * not of the same length.
     */
    public static float dotProduct(float[] a, float[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            float sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += (double) a[i] * (double) b[i];
            }
            return sum;
        }

    }

    /**
     * Computes the dot product of two vectors.
     *
     * @param a	Vector of integers.
     * @param b	Vector of integers.
     * @return	Dot product of the two vectors.
     * @throws ArithmeticException	Throws an exception when the two vectors are
     * not of the same length.
     */
    public static long dotProduct(long[] a, long[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            long sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += (double) a[i] * (double) b[i];
            }
            return sum;
        }

    }

    /**
     * Computes the dot product of two vectors.
     *
     * @param a	Vector of longs.
     * @param b	Vector of longs.
     * @return	Dot product of the two vectors.
     * @throws ArithmeticException	Throws an exception when the two vectors are
     * not of the same length.
     */
    public static byte dotProduct(byte[] a, byte[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            byte sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += (double) a[i] * (double) b[i];
            }
            return sum;
        }

    }

    /**
     * Computes the dot product of two vectors.
     *
     * @param a	Vector of integers.
     * @param b	Vector of doubles.
     * @return	Dot product of the two vectors.
     * @throws ArithmeticException	Throws an exception when the two vectors are
     * not of the same length.
     */
    public static double dotProduct(double[] a, int[] b) throws ArithmeticException {

        if (a.length != b.length) {
            throw new ArithmeticException();
        } else {
            double sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i] * b[i];
            }
            return sum;
        }

    }

    /**
     * Computes the mean value of a matrix of integers.
     *
     * @param matrix	A matrix of integers whose mean is to be computed.
     * @return	Mean value of the matrix.
     */
    public static double mean(int[][] matrix) {

        int width = matrix.length;
        int height = matrix[0].length;
        double sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += matrix[j][i];
            }
        }
        double mean = sum / (width * height);

        return mean;
    }

    /**
     * Computes the mean value of a matrix of doubles.
     *
     * @param matrix	Matrix of doubles whose mean is to be computed.
     * @return	Mean value of the matrix.
     */
    public static double mean(double[][] matrix) {

        int width = matrix.length;
        int height = matrix[0].length;
        double sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += matrix[j][i];
            }
        }
        double mean = sum / (width * height);

        return mean;
    }

    /**
     * Computes the mean value of a matrix of longs.
     *
     * @param matrix	Matrix of longs whose mean is to be computed.
     * @return	Mean value of the matrix.
     */
    public static double mean(long[][] matrix) {

        int width = matrix.length;
        int height = matrix[0].length;
        double sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += matrix[j][i];
            }
        }
        double mean = sum / (width * height);

        return mean;
    }

    /**
     * Computes the mean value of a matrix of floats.
     *
     * @param matrix	Matrix of floats whose mean is to be computed.
     * @return	Mean value of the matrix.
     */
    public static float mean(float[][] matrix) {

        int width = matrix.length;
        int height = matrix[0].length;
        double sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += matrix[j][i];
            }
        }
        float mean = (float) (sum / (width * height));

        return mean;
    }

    /**
     * Computes the mean value of a matrix of bytes.
     *
     * @param matrix	Matrix of bytes whose mean is to be computed.
     * @return	Mean value of the matrix.
     */
    public static float mean(byte[][] matrix) {

        int width = matrix.length;
        int height = matrix[0].length;
        double sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += matrix[j][i];
            }
        }
        float mean = (float) (sum / (width * height));

        return mean;
    }

    /**
     * Computes the mean value of an array of integers.
     *
     * @param array	Array of integers whose mean is to be computed.
     * @return	Mean value of the array.
     */
    public static double mean(int[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = sum / array.length;

        return mean;
    }

    /**
     * Computes the mean value of an array of doubles.
     *
     * @param array	Array of doubles whose mean is to be computed.
     * @return	Mean value of the array.
     */
    public static double mean(double[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = sum / array.length;

        return mean;
    }

    /**
     * Computes the mean value of an array of longs.
     *
     * @param array	Array of longs whose mean is to be computed.
     * @return	Mean value of the array.
     */
    public static double mean(long[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = sum / array.length;

        return mean;
    }

    /**
     * Computes the mean value of an array of floats.
     *
     * @param array	Array of floats whose mean is to be computed.
     * @return	Mean value of the array.
     */
    public static double mean(float[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = sum / array.length;

        return mean;
    }

    /**
     * Computes the mean value of an array of bytes.
     *
     * @param array	Array of bytes whose mean is to be computed.
     * @return	Mean value of the array.
     */
    public static double mean(byte[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = sum / array.length;

        return mean;
    }

    /**
     * Computes the standard deviation of the values in the matrix.
     *
     * @param matrix	Matrix of integers whose standard deviation is to be
     * computed.
     * @param mean	Mean value of the matrix.
     * @return	Standard deviation of the matrix.
     */
    public static double std(int[][] matrix, double mean) {

        int width = matrix.length;
        int height = matrix[0].length;
        double sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += Math.pow((matrix[j][i] - mean), 2);
            }
        }
        double stDev = Math.sqrt(sum / (width * height - 1));

        return stDev;
    }

    /**
     * Computes the standard deviation of the values in the matrix.
     *
     * @param matrix	Matrix of doubles whose standard deviation is to be
     * computed.
     * @param mean	Mean value of the matrix.
     * @return	Standard deviation of the matrix.
     */
    public static double std(double[][] matrix, double mean) {

        int width = matrix.length;
        int height = matrix[0].length;
        double sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += Math.pow((matrix[j][i] - mean), 2);
            }
        }
        double stDev = Math.sqrt(sum / (width * height - 1));

        return stDev;
    }

    /**
     * Computes the standard deviation of the values in the matrix.
     *
     * @param matrix	Matrix of longs whose standard deviation is to be computed.
     * @param mean	Mean value of the matrix.
     * @return	Standard deviation of the matrix.
     */
    public static double std(long[][] matrix, double mean) {

        int width = matrix.length;
        int height = matrix[0].length;
        double sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += Math.pow((matrix[j][i] - mean), 2);
            }
        }
        double stDev = Math.sqrt(sum / (width * height - 1));

        return stDev;
    }

    /**
     * Computes the standard deviation of the values in the matrix.
     *
     * @param matrix	Matrix of longs whose standard deviation is to be computed.
     * @param mean	Mean value of the matrix.
     * @return	Standard deviation of the matrix.
     */
    public static float std(float[][] matrix, double mean) {

        int width = matrix.length;
        int height = matrix[0].length;
        float sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += Math.pow((matrix[j][i] - mean), 2);
            }
        }
        float stDev = (float) Math.sqrt(sum / (width * height - 1));

        return stDev;
    }

    /**
     * Computes the standard deviation of the values in the matrix.
     *
     * @param matrix	Matrix of doubles whose standard deviation is to be
     * computed.
     * @param mean	Mean value of the matrix.
     * @return	Standard deviation of the matrix.
     */
    public static float std(byte[][] matrix, double mean) {

        int width = matrix.length;
        int height = matrix[0].length;
        float sum = 0;

        for (int j = 0; j < width; j++) {
            for (int i = 0; i < height; i++) {
                sum += Math.pow((matrix[j][i] - mean), 2);
            }
        }
        float stDev = (float) Math.sqrt(sum / (width * height - 1));

        return stDev;
    }

    /**
     * Computes the standard deviation of the values in the matrix.
     *
     * @param matrix	Matrix of doubles whose standard deviation is to be
     * computed.
     * @return	Standard deviation of the matrix.
     */
    public static double std(double[][] matrix) {

        double mean = mean(matrix);
        return std(matrix, mean);

    }

    /**
     * Computes the standard deviation of the values in the matrix.
     *
     * @param matrix	Matrix of integers whose standard deviation is to be
     * computed.
     * @return	Standard deviation of the matrix.
     */
    public static double std(int[][] matrix) {

        double mean = mean(matrix);
        return std(matrix, mean);

    }

    /**
     * Computes the standard deviation of the values in the matrix.
     *
     * @param matrix	Matrix of floats whose standard deviation is to be
     * computed.
     * @return	Standard deviation of the matrix.
     */
    public static float std(float[][] matrix) {

        float mean = mean(matrix);
        return std(matrix, mean);

    }

    /**
     * Computes the standard deviation of the values in the matrix.
     *
     * @param matrix	Matrix of bytes whose standard deviation is to be computed.
     * @return	Standard deviation of the matrix.
     */
    public static double std(byte[][] matrix) {

        float mean = mean(matrix);
        return std(matrix, mean);

    }

    /**
     * Computes the standard deviation of the values in the array.
     *
     * @param array Array of doubles whose standard deviation is to be computed.
     * @param mean	Mean value of the array.
     * @return	Standard deviation of the array.
     */
    public static double std(double[] array, double mean) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += Math.pow((array[i] - mean), 2);
        }
        double stDev = Math.sqrt(sum / (array.length - 1));

        return stDev;
    }

    /**
     * Computes the standard deviation of the values in the array.
     *
     * @param array Array of integers whose standard deviation is to be
     * computed.
     * @param mean	Mean value of the array.
     * @return	Standard deviation of the array.
     */
    public static double std(int[] array, double mean) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += Math.pow((array[i] - mean), 2);
        }
        double stDev = Math.sqrt(sum / (array.length - 1));

        return stDev;
    }

    /**
     * Computes the standard deviation of the values in the array.
     *
     * @param array Array of floats whose standard deviation is to be computed.
     * @param mean	Mean value of the array.
     * @return	Standard deviation of the array.
     */
    public static float std(float[] array, double mean) {

        float sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += Math.pow((array[i] - mean), 2);
        }
        float stDev = (float) Math.sqrt(sum / (array.length - 1));

        return stDev;
    }

    /**
     * Computes the standard deviation of the values in the array.
     *
     * @param array Array of longs whose standard deviation is to be computed.
     * @param mean	Mean value of the array.
     * @return	Standard deviation of the array.
     */
    public static double std(long[] array, double mean) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += Math.pow((array[i] - mean), 2);
        }
        double stDev = Math.sqrt(sum / (array.length - 1));

        return stDev;
    }

    /**
     * Computes the standard deviation of the values in the array.
     *
     * @param array Array of bytes whose standard deviation is to be computed.
     * @param mean	Mean value of the array.
     * @return	Standard deviation of the array.
     */
    public static float std(byte[] array, double mean) {

        float sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += Math.pow((array[i] - mean), 2);
        }
        float stDev = (float) Math.sqrt(sum / (array.length - 1));

        return stDev;
    }

    /**
     * Computes the standard deviation of the values in the array.
     *
     * @param array Array of doubles whose standard deviation is to be computed.
     * @return	Standard deviation of the array.
     */
    public static double std(double[] array) {

        double mean = mean(array);
        return std(array, mean);

    }

    /**
     * Computes the standard deviation of the values in the array.
     *
     * @param array Array of integers whose standard deviation is to be
     * computed.
     * @return	Standard deviation of the array.
     */
    public static double std(int[] array) {

        double mean = mean(array);
        return std(array, mean);

    }

    /**
     * Computes the standard deviation of the values in the array.
     *
     * @param array Array of floats whose standard deviation is to be computed.
     * @return	Standard deviation of the array.
     */
    public static float std(float[] array) {

        double mean = mean(array);
        return std(array, mean);

    }

    /**
     * Computes the standard deviation of the values in the array.
     *
     * @param array Array of longs whose standard deviation is to be computed.
     * @return	Standard deviation of the array.
     */
    public static double std(long[] array) {

        double mean = mean(array);
        return std(array, mean);

    }

    /**
     * Computes the standard deviation of the values in the array.
     *
     * @param array Array of bytes whose standard deviation is to be computed.
     * @return	Standard deviation of the array.
     */
    public static float std(byte[] array) {

        double mean = mean(array);
        return std(array, mean);

    }

    /**
     * Computes the binary logarithm of an integer.
     *
     * @param n	Integer whose binary logarithm is to be computed.
     * @return	Logarithm of the integer with base 2.
     */
    public static int log2(int n) {

        if (n <= 0) {
            throw new IllegalArgumentException();
        }

        return 31 - Integer.numberOfLeadingZeros(n);
    }

    /**
     * Estimates the function value at a specified point on x-axis using the
     * Lagrange interpolation. Points on x-axis and function values at these
     * points define points in 2-D space through which the graph of the function
     * goes. The points are used to estimate the function value of a point on
     * x-axis whose function values is not known.
     *
     * @param points	Points on x-axis at which the function values are known.
     * @param values	Function values in the specified points.
     * @param interpolateAt	Point on x-axis whose function value is to be
     * computed.
     * @return	Estimated function value at the point on x-axis for which
     * function value was sought.
     */
    public static double interpolate(double[] points, double[] values, double interpolateAt) {
        if (points.length != values.length) {
            throw new ArithmeticException("The number of elements in both arrays does not match!");
        } else {
            double value = 0;
            double tempValue = 0;
            for (int i = 0; i < points.length; i++) {
                tempValue = values[i];
                for (int j = 0; j < i; j++) {
                    tempValue *= (interpolateAt - points[j]) / (points[i] - points[j]);
                }
                for (int j = i + 1; j < points.length; j++) {
                    tempValue *= (interpolateAt - points[j]) / (points[i] - points[j]);
                }
                value += tempValue;
            }
            return value;
        }
    }

    /**
     * Estimates the function value at a specified point on x-axis using the
     * Lagrange interpolation. Points on x-axis and function values at these
     * points define points in 2-D space through which the graph of the function
     * goes. The points are used to estimate the function value of a point on
     * x-axis whose function values is not known.
     *
     * @param points	Points on x-axis at which the function values are known.
     * @param values	Function values in the specified points.
     * @param interpolateAt	Point on x-axis whose function value is to be
     * computed.
     * @return	Estimated function value at the point on x-axis for which
     * function value was sought.
     */
    public static double interpolate(int[] points, int[] values, double interpolateAt) {
        if (points.length != values.length) {
            throw new ArithmeticException("The number of elements in both arrays does not match!");
        } else {
            double value = 0;
            double tempValue = 0;
            for (int i = 0; i < points.length; i++) {
                tempValue = values[i];
                for (int j = 0; j < i; j++) {
                    tempValue *= (interpolateAt - points[j]) / (points[i] - points[j]);
                }
                for (int j = i + 1; j < points.length; j++) {
                    tempValue *= (interpolateAt - points[j]) / (points[i] - points[j]);
                }
                value += tempValue;
            }
            return value;
        }
    }

}
