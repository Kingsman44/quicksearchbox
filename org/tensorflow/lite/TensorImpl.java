package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
public final class TensorImpl {

    /* renamed from: a */
    public long f193256a;

    /* renamed from: b */
    public int[] f193257b;

    /* renamed from: c */
    public final int f193258c;

    private TensorImpl(long j) {
        int i;
        this.f193256a = j;
        int dtype = dtype(j);
        switch (dtype) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 9:
                i = 8;
                break;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + dtype + " is not recognized in Java.");
        }
        this.f193258c = i;
        this.f193257b = shape(j);
        shapeSignature(j);
        quantizationScale(j);
        quantizationZeroPoint(j);
    }

    /* renamed from: a */
    static int m107467a(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return m107467a(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native ByteBuffer buffer(long j);

    /* renamed from: c */
    public static TensorImpl m107468c(long j, int i) {
        return new TensorImpl(create(j, i, 0));
    }

    private static native long create(long j, int i, int i2);

    private static native long createSignatureInputTensor(long j, String str);

    private static native long createSignatureOutputTensor(long j, String str);

    private static native void delete(long j);

    private static native int dtype(long j);

    /* renamed from: e */
    static void m107469e(Object obj, int i, int[] iArr) {
        int length;
        if (iArr != null && i != (length = iArr.length)) {
            int length2 = Array.getLength(obj);
            int i2 = iArr[i];
            if (i2 == 0) {
                iArr[i] = length2;
            } else if (i2 != length2) {
                throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(length2), Integer.valueOf(i)}));
            }
            int i3 = i + 1;
            if (i3 != length) {
                for (int i4 = 0; i4 < length2; i4++) {
                    m107469e(Array.get(obj, i4), i3, iArr);
                }
            }
        }
    }

    public static native boolean hasDelegateBufferHandle(long j);

    private static native int index(long j);

    public static native String name(long j);

    public static native int numBytes(long j);

    private static native float quantizationScale(long j);

    private static native int quantizationZeroPoint(long j);

    public static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    private static native int[] shapeSignature(long j);

    public static native void writeDirectBuffer(long j, Buffer buffer);

    public static native void writeMultiDimensionalArray(long j, Object obj);

    public static native void writeScalar(long j, Object obj);

    /* renamed from: b */
    public final ByteBuffer mo64494b() {
        return buffer(this.f193256a).order(ByteOrder.nativeOrder());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo64495d() {
        delete(this.f193256a);
        this.f193256a = 0;
    }

    /* renamed from: f */
    public final void mo64496f() {
        this.f193257b = shape(this.f193256a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r9.f193258c == 5) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (java.lang.String.class.equals(r0) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bc, code lost:
        if (java.lang.String.class.equals(r0) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d6, code lost:
        throw new java.lang.IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(java.lang.String.valueOf(r10.getClass().getName())));
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ec A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64497g(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof java.nio.ByteBuffer
            if (r0 != 0) goto L_0x0114
            java.lang.Class r0 = r10.getClass()
            boolean r1 = r0.isArray()
            r2 = 6
            r3 = 4
            r4 = 3
            r5 = 7
            r6 = 5
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0070
        L_0x0015:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0020
            java.lang.Class r0 = r0.getComponentType()
            goto L_0x0015
        L_0x0020:
            java.lang.Class r1 = java.lang.Float.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x002a
            goto L_0x00d7
        L_0x002a:
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0035
        L_0x0032:
            r2 = 2
            goto L_0x00d8
        L_0x0035:
            java.lang.Class r1 = java.lang.Short.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0040
        L_0x003d:
            r2 = 7
            goto L_0x00d8
        L_0x0040:
            java.lang.Class r1 = java.lang.Byte.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0052
            int r0 = r9.f193258c
            if (r0 != r6) goto L_0x004f
        L_0x004c:
            r2 = 5
            goto L_0x00d8
        L_0x004f:
            r2 = 3
            goto L_0x00d8
        L_0x0052:
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x005d
        L_0x005a:
            r2 = 4
            goto L_0x00d8
        L_0x005d:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0067
            goto L_0x00d8
        L_0x0067:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00bf
            goto L_0x004c
        L_0x0070:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00d7
            boolean r1 = r10 instanceof java.nio.FloatBuffer
            if (r1 == 0) goto L_0x007d
            goto L_0x00d7
        L_0x007d:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0032
            boolean r1 = r10 instanceof java.nio.IntBuffer
            if (r1 == 0) goto L_0x008a
            goto L_0x0032
        L_0x008a:
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x003d
            boolean r1 = r10 instanceof java.nio.ShortBuffer
            if (r1 == 0) goto L_0x0097
            goto L_0x003d
        L_0x0097:
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00a0
            goto L_0x004f
        L_0x00a0:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x005a
            boolean r1 = r10 instanceof java.nio.LongBuffer
            if (r1 == 0) goto L_0x00ad
            goto L_0x005a
        L_0x00ad:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00b6
            goto L_0x00d8
        L_0x00b6:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00bf
            goto L_0x004c
        L_0x00bf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "DataType error: cannot resolve DataType of "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        L_0x00d7:
            r2 = 1
        L_0x00d8:
            int r0 = r9.f193258c
            if (r2 == r0) goto L_0x0114
            java.lang.String r0 = org.tensorflow.lite.C72665b.m107477a(r2)
            int r1 = r9.f193258c
            java.lang.String r1 = org.tensorflow.lite.C72665b.m107477a(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            return
        L_0x00ed:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r4]
            int r3 = r9.f193258c
            java.lang.String r3 = org.tensorflow.lite.C72664a.m107475a(r3)
            r4 = 0
            r1[r4] = r3
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getName()
            r1[r8] = r10
            java.lang.String r10 = org.tensorflow.lite.C72664a.m107475a(r2)
            r1[r7] = r10
            java.lang.String r10 = "Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s)."
            java.lang.String r10 = java.lang.String.format(r10, r1)
            r0.<init>(r10)
            throw r0
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.TensorImpl.mo64497g(java.lang.Object):void");
    }

    /* renamed from: h */
    public final int[] mo64498h(Object obj) {
        int a = m107467a(obj);
        if (this.f193258c == 5) {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                if (Byte.TYPE.equals(cls)) {
                    a--;
                }
            }
        }
        int[] iArr = new int[a];
        m107469e(obj, 0, iArr);
        return iArr;
    }
}
