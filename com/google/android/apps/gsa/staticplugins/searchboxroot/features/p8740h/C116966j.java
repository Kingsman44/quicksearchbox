package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.j */
/* compiled from: PG */
public final /* synthetic */ class C116966j implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C116968l f324711a;

    /* renamed from: b */
    public final /* synthetic */ C41642a f324712b;

    public /* synthetic */ C116966j(C116968l lVar, C41642a aVar) {
        this.f324711a = lVar;
        this.f324712b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:208:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r24 = this;
            r1 = r24
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.l r0 = r1.f324711a
            com.google.android.libraries.searchbox.shared.b.a r2 = r1.f324712b
            com.google.android.apps.gsa.searchbox.c.t r2 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r2
            com.google.android.apps.gsa.shared.search.Query r2 = r2.f239556a
            java.lang.String r2 = r2.mo84352bk()
            java.lang.String r2 = com.google.common.base.C58890d.m90988c(r2)
            java.lang.String r3 = r0.f324716c
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3.isEmpty()
            r6 = 1
            r7 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            if (r5 != 0) goto L_0x0042
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x002c
            goto L_0x0042
        L_0x002c:
            int r5 = r3.length()
            r9 = 100
            if (r5 <= r9) goto L_0x0035
            goto L_0x0042
        L_0x0035:
            int r5 = r2.length()
            r9 = 20
            if (r5 <= r9) goto L_0x003e
            goto L_0x0042
        L_0x003e:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
        L_0x0042:
            boolean r5 = r8.booleanValue()
            if (r5 != 0) goto L_0x004b
        L_0x0048:
            r1 = 5
            goto L_0x04e6
        L_0x004b:
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0057
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto L_0x005b
        L_0x0057:
            java.util.List r5 = com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h.C116972p.m194387a(r3)
        L_0x005b:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r10 = com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h.C116972p.m194387a(r3)
            int r11 = r10.size()
            r12 = 2
            if (r11 >= r12) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            r11 = 0
        L_0x006d:
            int r13 = r10.size()
            int r13 = r13 + -1
            if (r11 >= r13) goto L_0x008f
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Object r14 = r10.get(r11)
            r13[r7] = r14
            int r11 = r11 + 1
            java.lang.Object r14 = r10.get(r11)
            r13[r6] = r14
            java.lang.String r14 = "%s_%s"
            java.lang.String r13 = java.lang.String.format(r14, r13)
            r9.add(r13)
            goto L_0x006d
        L_0x008f:
            r10 = 3
            int[][] r11 = new int[r10][]
            java.lang.String[] r13 = new java.lang.String[r6]
            r13[r7] = r3
            java.util.List r3 = java.util.Arrays.asList(r13)
            java.util.Map r13 = r0.f324717d
            int[] r3 = com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h.C116968l.m194372b(r3, r13)
            r11[r7] = r3
            java.util.Map r3 = r0.f324718e
            int[] r3 = com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h.C116968l.m194372b(r5, r3)
            r11[r6] = r3
            java.util.Map r3 = r0.f324719f
            int[] r3 = com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h.C116968l.m194372b(r9, r3)
            r11[r12] = r3
            int[] r3 = new int[r12]
            r3 = {1, 100000} // fill-array
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r5, r3)
            int[][] r3 = (int[][]) r3
            int[] r5 = new int[r12]
            r5 = {1, 100000} // fill-array
            java.lang.Class r9 = java.lang.Float.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r9, r5)
            float[][] r5 = (float[][]) r5
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            r9.put(r13, r3)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r9.put(r13, r5)
            java.lang.Object r13 = r0.f324714a
            monitor-enter(r13)
            org.tensorflow.lite.e r14 = r0.f324715b     // Catch:{ all -> 0x052e }
            if (r14 != 0) goto L_0x00eb
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x052e }
            monitor-exit(r13)     // Catch:{ all -> 0x052e }
            goto L_0x0048
        L_0x00eb:
            r14.mo64502a()     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.NativeInterpreterWrapper r14 = r14.f193259a     // Catch:{ all -> 0x052e }
            r16 = r9
            r8 = -1
            r14.inferenceDurationNanoseconds = r8     // Catch:{ all -> 0x052e }
            r8 = 0
        L_0x00f7:
            if (r8 >= r10) goto L_0x0148
            org.tensorflow.lite.TensorImpl r9 = r14.mo64492a(r8)     // Catch:{ all -> 0x052e }
            r15 = r11[r8]     // Catch:{ all -> 0x052e }
            r17 = 0
            if (r15 != 0) goto L_0x0106
        L_0x0103:
            r22 = r17
            goto L_0x011d
        L_0x0106:
            boolean r12 = r15 instanceof java.nio.Buffer     // Catch:{ all -> 0x052e }
            if (r12 == 0) goto L_0x010b
            goto L_0x0103
        L_0x010b:
            r9.mo64497g(r15)     // Catch:{ all -> 0x052e }
            int[] r12 = r9.mo64498h(r15)     // Catch:{ all -> 0x052e }
            int[] r9 = r9.f193257b     // Catch:{ all -> 0x052e }
            boolean r9 = java.util.Arrays.equals(r9, r12)     // Catch:{ all -> 0x052e }
            if (r9 == 0) goto L_0x011b
            goto L_0x0103
        L_0x011b:
            r22 = r12
        L_0x011d:
            if (r22 == 0) goto L_0x013f
            r12 = r11
            long r10 = r14.f193243b     // Catch:{ all -> 0x052e }
            long r6 = r14.f193242a     // Catch:{ all -> 0x052e }
            r23 = 0
            r17 = r10
            r19 = r6
            r21 = r8
            boolean r6 = org.tensorflow.lite.NativeInterpreterWrapper.resizeInput(r17, r19, r21, r22, r23)     // Catch:{ all -> 0x052e }
            if (r6 == 0) goto L_0x0140
            r6 = 0
            r14.f193246e = r6     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.TensorImpl[] r6 = r14.f193244c     // Catch:{ all -> 0x052e }
            r6 = r6[r8]     // Catch:{ all -> 0x052e }
            if (r6 == 0) goto L_0x0140
            r6.mo64496f()     // Catch:{ all -> 0x052e }
            goto L_0x0140
        L_0x013f:
            r12 = r11
        L_0x0140:
            int r8 = r8 + 1
            r11 = r12
            r6 = 1
            r7 = 0
            r10 = 3
            r12 = 2
            goto L_0x00f7
        L_0x0148:
            r12 = r11
            boolean r6 = r14.f193246e     // Catch:{ all -> 0x052e }
            if (r6 == 0) goto L_0x014f
            r6 = 0
            goto L_0x016a
        L_0x014f:
            r6 = 1
            r14.f193246e = r6     // Catch:{ all -> 0x052e }
            long r6 = r14.f193243b     // Catch:{ all -> 0x052e }
            long r10 = r14.f193242a     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.NativeInterpreterWrapper.allocateTensors(r6, r10)     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.TensorImpl[] r6 = r14.f193245d     // Catch:{ all -> 0x052e }
            int r7 = r6.length     // Catch:{ all -> 0x052e }
            r8 = 0
        L_0x015d:
            if (r8 >= r7) goto L_0x0169
            r10 = r6[r8]     // Catch:{ all -> 0x052e }
            if (r10 == 0) goto L_0x0166
            r10.mo64496f()     // Catch:{ all -> 0x052e }
        L_0x0166:
            int r8 = r8 + 1
            goto L_0x015d
        L_0x0169:
            r6 = 1
        L_0x016a:
            r7 = 0
        L_0x016b:
            r8 = 3
            if (r7 >= r8) goto L_0x0318
            org.tensorflow.lite.TensorImpl r8 = r14.mo64492a(r7)     // Catch:{ all -> 0x052e }
            r10 = r12[r7]     // Catch:{ all -> 0x052e }
            if (r10 != 0) goto L_0x0188
            long r10 = r8.f193256a     // Catch:{ all -> 0x052e }
            boolean r8 = org.tensorflow.lite.TensorImpl.hasDelegateBufferHandle(r10)     // Catch:{ all -> 0x052e }
            if (r8 == 0) goto L_0x0180
            goto L_0x02ec
        L_0x0180:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x052e }
            java.lang.String r2 = "Null inputs are allowed only if the Tensor is bound to a buffer handle."
            r0.<init>(r2)     // Catch:{ all -> 0x052e }
            throw r0     // Catch:{ all -> 0x052e }
        L_0x0188:
            r8.mo64497g(r10)     // Catch:{ all -> 0x052e }
            boolean r11 = r10 instanceof java.nio.Buffer     // Catch:{ all -> 0x052e }
            if (r11 == 0) goto L_0x02bb
            r11 = r10
            java.nio.Buffer r11 = (java.nio.Buffer) r11     // Catch:{ all -> 0x052e }
            r17 = r10
            long r9 = r8.f193256a     // Catch:{ all -> 0x052e }
            int r9 = org.tensorflow.lite.TensorImpl.numBytes(r9)     // Catch:{ all -> 0x052e }
            r10 = r17
            boolean r10 = r10 instanceof java.nio.ByteBuffer     // Catch:{ all -> 0x052e }
            if (r10 == 0) goto L_0x01a5
            int r10 = r11.capacity()     // Catch:{ all -> 0x052e }
            goto L_0x01b1
        L_0x01a5:
            int r10 = r11.capacity()     // Catch:{ all -> 0x052e }
            int r15 = r8.f193258c     // Catch:{ all -> 0x052e }
            int r15 = org.tensorflow.lite.C72664a.m107476b(r15)     // Catch:{ all -> 0x052e }
            int r10 = r10 * r15
        L_0x01b1:
            if (r9 != r10) goto L_0x0295
            boolean r9 = r11 instanceof java.nio.ByteBuffer     // Catch:{ all -> 0x052e }
            if (r9 == 0) goto L_0x01da
            r9 = r11
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9     // Catch:{ all -> 0x052e }
            boolean r10 = r9.isDirect()     // Catch:{ all -> 0x052e }
            if (r10 == 0) goto L_0x01d1
            java.nio.ByteOrder r10 = r9.order()     // Catch:{ all -> 0x052e }
            java.nio.ByteOrder r15 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x052e }
            if (r10 != r15) goto L_0x01d1
            long r8 = r8.f193256a     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.TensorImpl.writeDirectBuffer(r8, r11)     // Catch:{ all -> 0x052e }
            goto L_0x02ec
        L_0x01d1:
            java.nio.ByteBuffer r8 = r8.mo64494b()     // Catch:{ all -> 0x052e }
            r8.put(r9)     // Catch:{ all -> 0x052e }
            goto L_0x02ec
        L_0x01da:
            boolean r9 = r11 instanceof java.nio.LongBuffer     // Catch:{ all -> 0x052e }
            if (r9 == 0) goto L_0x0205
            r9 = r11
            java.nio.LongBuffer r9 = (java.nio.LongBuffer) r9     // Catch:{ all -> 0x052e }
            boolean r10 = r9.isDirect()     // Catch:{ all -> 0x052e }
            if (r10 == 0) goto L_0x01f8
            java.nio.ByteOrder r10 = r9.order()     // Catch:{ all -> 0x052e }
            java.nio.ByteOrder r15 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x052e }
            if (r10 != r15) goto L_0x01f8
            long r8 = r8.f193256a     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.TensorImpl.writeDirectBuffer(r8, r11)     // Catch:{ all -> 0x052e }
            goto L_0x02ec
        L_0x01f8:
            java.nio.ByteBuffer r8 = r8.mo64494b()     // Catch:{ all -> 0x052e }
            java.nio.LongBuffer r8 = r8.asLongBuffer()     // Catch:{ all -> 0x052e }
            r8.put(r9)     // Catch:{ all -> 0x052e }
            goto L_0x02ec
        L_0x0205:
            boolean r9 = r11 instanceof java.nio.FloatBuffer     // Catch:{ all -> 0x052e }
            if (r9 == 0) goto L_0x0230
            r9 = r11
            java.nio.FloatBuffer r9 = (java.nio.FloatBuffer) r9     // Catch:{ all -> 0x052e }
            boolean r10 = r9.isDirect()     // Catch:{ all -> 0x052e }
            if (r10 == 0) goto L_0x0223
            java.nio.ByteOrder r10 = r9.order()     // Catch:{ all -> 0x052e }
            java.nio.ByteOrder r15 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x052e }
            if (r10 != r15) goto L_0x0223
            long r8 = r8.f193256a     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.TensorImpl.writeDirectBuffer(r8, r11)     // Catch:{ all -> 0x052e }
            goto L_0x02ec
        L_0x0223:
            java.nio.ByteBuffer r8 = r8.mo64494b()     // Catch:{ all -> 0x052e }
            java.nio.FloatBuffer r8 = r8.asFloatBuffer()     // Catch:{ all -> 0x052e }
            r8.put(r9)     // Catch:{ all -> 0x052e }
            goto L_0x02ec
        L_0x0230:
            boolean r9 = r11 instanceof java.nio.IntBuffer     // Catch:{ all -> 0x052e }
            if (r9 == 0) goto L_0x025b
            r9 = r11
            java.nio.IntBuffer r9 = (java.nio.IntBuffer) r9     // Catch:{ all -> 0x052e }
            boolean r10 = r9.isDirect()     // Catch:{ all -> 0x052e }
            if (r10 == 0) goto L_0x024e
            java.nio.ByteOrder r10 = r9.order()     // Catch:{ all -> 0x052e }
            java.nio.ByteOrder r15 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x052e }
            if (r10 != r15) goto L_0x024e
            long r8 = r8.f193256a     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.TensorImpl.writeDirectBuffer(r8, r11)     // Catch:{ all -> 0x052e }
            goto L_0x02ec
        L_0x024e:
            java.nio.ByteBuffer r8 = r8.mo64494b()     // Catch:{ all -> 0x052e }
            java.nio.IntBuffer r8 = r8.asIntBuffer()     // Catch:{ all -> 0x052e }
            r8.put(r9)     // Catch:{ all -> 0x052e }
            goto L_0x02ec
        L_0x025b:
            boolean r9 = r11 instanceof java.nio.ShortBuffer     // Catch:{ all -> 0x052e }
            if (r9 == 0) goto L_0x0285
            r9 = r11
            java.nio.ShortBuffer r9 = (java.nio.ShortBuffer) r9     // Catch:{ all -> 0x052e }
            boolean r10 = r9.isDirect()     // Catch:{ all -> 0x052e }
            if (r10 == 0) goto L_0x0279
            java.nio.ByteOrder r10 = r9.order()     // Catch:{ all -> 0x052e }
            java.nio.ByteOrder r15 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x052e }
            if (r10 != r15) goto L_0x0279
            long r8 = r8.f193256a     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.TensorImpl.writeDirectBuffer(r8, r11)     // Catch:{ all -> 0x052e }
            goto L_0x02ec
        L_0x0279:
            java.nio.ByteBuffer r8 = r8.mo64494b()     // Catch:{ all -> 0x052e }
            java.nio.ShortBuffer r8 = r8.asShortBuffer()     // Catch:{ all -> 0x052e }
            r8.put(r9)     // Catch:{ all -> 0x052e }
            goto L_0x02ec
        L_0x0285:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x052e }
            java.lang.String r2 = "Unexpected input buffer type: "
            java.lang.String r3 = r11.toString()     // Catch:{ all -> 0x052e }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x052e }
            r0.<init>(r2)     // Catch:{ all -> 0x052e }
            throw r0     // Catch:{ all -> 0x052e }
        L_0x0295:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x052e }
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x052e }
            long r3 = r8.f193256a     // Catch:{ all -> 0x052e }
            java.lang.String r3 = org.tensorflow.lite.TensorImpl.name(r3)     // Catch:{ all -> 0x052e }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x052e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x052e }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x052e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x052e }
            r4 = 2
            r2[r4] = r3     // Catch:{ all -> 0x052e }
            java.lang.String r3 = "Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes."
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x052e }
            r0.<init>(r2)     // Catch:{ all -> 0x052e }
            throw r0     // Catch:{ all -> 0x052e }
        L_0x02bb:
            int[] r11 = r8.mo64498h(r10)     // Catch:{ all -> 0x052e }
            int[] r15 = r8.f193257b     // Catch:{ all -> 0x052e }
            boolean r15 = java.util.Arrays.equals(r11, r15)     // Catch:{ all -> 0x052e }
            if (r15 == 0) goto L_0x02f0
            int r11 = r8.f193258c     // Catch:{ all -> 0x052e }
            r15 = 5
            if (r11 != r15) goto L_0x02d7
            int[] r11 = r8.f193257b     // Catch:{ all -> 0x052e }
            int r11 = r11.length     // Catch:{ all -> 0x052e }
            if (r11 != 0) goto L_0x02d7
            long r8 = r8.f193256a     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.TensorImpl.writeScalar(r8, r10)     // Catch:{ all -> 0x052e }
            goto L_0x02ec
        L_0x02d7:
            java.lang.Class r9 = r10.getClass()     // Catch:{ all -> 0x052e }
            boolean r9 = r9.isArray()     // Catch:{ all -> 0x052e }
            if (r9 == 0) goto L_0x02e7
            long r8 = r8.f193256a     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.TensorImpl.writeMultiDimensionalArray(r8, r10)     // Catch:{ all -> 0x052e }
            goto L_0x02ec
        L_0x02e7:
            long r8 = r8.f193256a     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.TensorImpl.writeScalar(r8, r10)     // Catch:{ all -> 0x052e }
        L_0x02ec:
            int r7 = r7 + 1
            goto L_0x016b
        L_0x02f0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x052e }
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x052e }
            long r3 = r8.f193256a     // Catch:{ all -> 0x052e }
            java.lang.String r3 = org.tensorflow.lite.TensorImpl.name(r3)     // Catch:{ all -> 0x052e }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x052e }
            int[] r3 = r8.f193257b     // Catch:{ all -> 0x052e }
            java.lang.String r3 = java.util.Arrays.toString(r3)     // Catch:{ all -> 0x052e }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x052e }
            java.lang.String r3 = java.util.Arrays.toString(r11)     // Catch:{ all -> 0x052e }
            r4 = 2
            r2[r4] = r3     // Catch:{ all -> 0x052e }
            java.lang.String r3 = "Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s."
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x052e }
            r0.<init>(r2)     // Catch:{ all -> 0x052e }
            throw r0     // Catch:{ all -> 0x052e }
        L_0x0318:
            long r7 = java.lang.System.nanoTime()     // Catch:{ all -> 0x052e }
            long r10 = r14.f193243b     // Catch:{ all -> 0x052e }
            r12 = r2
            long r1 = r14.f193242a     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.NativeInterpreterWrapper.run(r10, r1)     // Catch:{ all -> 0x052e }
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x052e }
            long r1 = r1 - r7
            if (r6 == 0) goto L_0x033b
            org.tensorflow.lite.TensorImpl[] r6 = r14.f193245d     // Catch:{ all -> 0x052e }
            int r7 = r6.length     // Catch:{ all -> 0x052e }
            r8 = 0
        L_0x032f:
            if (r8 >= r7) goto L_0x033b
            r10 = r6[r8]     // Catch:{ all -> 0x052e }
            if (r10 == 0) goto L_0x0338
            r10.mo64496f()     // Catch:{ all -> 0x052e }
        L_0x0338:
            int r8 = r8 + 1
            goto L_0x032f
        L_0x033b:
            java.util.Set r6 = r16.entrySet()     // Catch:{ all -> 0x052e }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x052e }
        L_0x0343:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x0499
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x052e }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x052e }
            java.lang.Object r8 = r7.getValue()     // Catch:{ all -> 0x052e }
            if (r8 == 0) goto L_0x0343
            java.lang.Object r8 = r7.getKey()     // Catch:{ all -> 0x052e }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x052e }
            int r8 = r8.intValue()     // Catch:{ all -> 0x052e }
            if (r8 < 0) goto L_0x0482
            org.tensorflow.lite.TensorImpl[] r10 = r14.f193245d     // Catch:{ all -> 0x052e }
            int r11 = r10.length     // Catch:{ all -> 0x052e }
            if (r8 >= r11) goto L_0x0482
            r11 = r10[r8]     // Catch:{ all -> 0x052e }
            if (r11 != 0) goto L_0x0378
            r16 = r10
            long r9 = r14.f193243b     // Catch:{ all -> 0x052e }
            int r11 = org.tensorflow.lite.NativeInterpreterWrapper.getOutputTensorIndex(r9, r8)     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.TensorImpl r11 = org.tensorflow.lite.TensorImpl.m107468c(r9, r11)     // Catch:{ all -> 0x052e }
            r16[r8] = r11     // Catch:{ all -> 0x052e }
        L_0x0378:
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x052e }
            if (r7 != 0) goto L_0x038f
            long r7 = r11.f193256a     // Catch:{ all -> 0x052e }
            boolean r7 = org.tensorflow.lite.TensorImpl.hasDelegateBufferHandle(r7)     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x0387
            goto L_0x0343
        L_0x0387:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x052e }
            java.lang.String r1 = "Null outputs are allowed only if the Tensor is bound to a buffer handle."
            r0.<init>(r1)     // Catch:{ all -> 0x052e }
            throw r0     // Catch:{ all -> 0x052e }
        L_0x038f:
            r11.mo64497g(r7)     // Catch:{ all -> 0x052e }
            boolean r8 = r7 instanceof java.nio.Buffer     // Catch:{ all -> 0x052e }
            if (r8 == 0) goto L_0x0447
            r8 = r7
            java.nio.Buffer r8 = (java.nio.Buffer) r8     // Catch:{ all -> 0x052e }
            long r9 = r11.f193256a     // Catch:{ all -> 0x052e }
            int r9 = org.tensorflow.lite.TensorImpl.numBytes(r9)     // Catch:{ all -> 0x052e }
            boolean r7 = r7 instanceof java.nio.ByteBuffer     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x03a8
            int r7 = r8.capacity()     // Catch:{ all -> 0x052e }
            goto L_0x03b4
        L_0x03a8:
            int r7 = r8.capacity()     // Catch:{ all -> 0x052e }
            int r10 = r11.f193258c     // Catch:{ all -> 0x052e }
            int r10 = org.tensorflow.lite.C72664a.m107476b(r10)     // Catch:{ all -> 0x052e }
            int r7 = r7 * r10
        L_0x03b4:
            if (r9 > r7) goto L_0x0421
            boolean r7 = r8 instanceof java.nio.ByteBuffer     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x03c5
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8     // Catch:{ all -> 0x052e }
            java.nio.ByteBuffer r7 = r11.mo64494b()     // Catch:{ all -> 0x052e }
            r8.put(r7)     // Catch:{ all -> 0x052e }
            goto L_0x0343
        L_0x03c5:
            boolean r7 = r8 instanceof java.nio.FloatBuffer     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x03d8
            java.nio.FloatBuffer r8 = (java.nio.FloatBuffer) r8     // Catch:{ all -> 0x052e }
            java.nio.ByteBuffer r7 = r11.mo64494b()     // Catch:{ all -> 0x052e }
            java.nio.FloatBuffer r7 = r7.asFloatBuffer()     // Catch:{ all -> 0x052e }
            r8.put(r7)     // Catch:{ all -> 0x052e }
            goto L_0x0343
        L_0x03d8:
            boolean r7 = r8 instanceof java.nio.LongBuffer     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x03eb
            java.nio.LongBuffer r8 = (java.nio.LongBuffer) r8     // Catch:{ all -> 0x052e }
            java.nio.ByteBuffer r7 = r11.mo64494b()     // Catch:{ all -> 0x052e }
            java.nio.LongBuffer r7 = r7.asLongBuffer()     // Catch:{ all -> 0x052e }
            r8.put(r7)     // Catch:{ all -> 0x052e }
            goto L_0x0343
        L_0x03eb:
            boolean r7 = r8 instanceof java.nio.IntBuffer     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x03fe
            java.nio.IntBuffer r8 = (java.nio.IntBuffer) r8     // Catch:{ all -> 0x052e }
            java.nio.ByteBuffer r7 = r11.mo64494b()     // Catch:{ all -> 0x052e }
            java.nio.IntBuffer r7 = r7.asIntBuffer()     // Catch:{ all -> 0x052e }
            r8.put(r7)     // Catch:{ all -> 0x052e }
            goto L_0x0343
        L_0x03fe:
            boolean r7 = r8 instanceof java.nio.ShortBuffer     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x0411
            java.nio.ShortBuffer r8 = (java.nio.ShortBuffer) r8     // Catch:{ all -> 0x052e }
            java.nio.ByteBuffer r7 = r11.mo64494b()     // Catch:{ all -> 0x052e }
            java.nio.ShortBuffer r7 = r7.asShortBuffer()     // Catch:{ all -> 0x052e }
            r8.put(r7)     // Catch:{ all -> 0x052e }
            goto L_0x0343
        L_0x0411:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x052e }
            java.lang.String r1 = "Unexpected output buffer type: "
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x052e }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x052e }
            r0.<init>(r1)     // Catch:{ all -> 0x052e }
            throw r0     // Catch:{ all -> 0x052e }
        L_0x0421:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x052e }
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x052e }
            long r2 = r11.f193256a     // Catch:{ all -> 0x052e }
            java.lang.String r2 = org.tensorflow.lite.TensorImpl.name(r2)     // Catch:{ all -> 0x052e }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x052e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x052e }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x052e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x052e }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x052e }
            java.lang.String r2 = "Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes."
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x052e }
            r0.<init>(r1)     // Catch:{ all -> 0x052e }
            throw r0     // Catch:{ all -> 0x052e }
        L_0x0447:
            int[] r8 = r11.mo64498h(r7)     // Catch:{ all -> 0x052e }
            int[] r10 = r11.f193257b     // Catch:{ all -> 0x052e }
            boolean r10 = java.util.Arrays.equals(r8, r10)     // Catch:{ all -> 0x052e }
            if (r10 == 0) goto L_0x045a
            long r10 = r11.f193256a     // Catch:{ all -> 0x052e }
            org.tensorflow.lite.TensorImpl.readMultiDimensionalArray(r10, r7)     // Catch:{ all -> 0x052e }
            goto L_0x0343
        L_0x045a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x052e }
            r7 = 3
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ all -> 0x052e }
            long r2 = r11.f193256a     // Catch:{ all -> 0x052e }
            java.lang.String r2 = org.tensorflow.lite.TensorImpl.name(r2)     // Catch:{ all -> 0x052e }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x052e }
            int[] r2 = r11.f193257b     // Catch:{ all -> 0x052e }
            java.lang.String r2 = java.util.Arrays.toString(r2)     // Catch:{ all -> 0x052e }
            r9 = 1
            r1[r9] = r2     // Catch:{ all -> 0x052e }
            java.lang.String r2 = java.util.Arrays.toString(r8)     // Catch:{ all -> 0x052e }
            r8 = 2
            r1[r8] = r2     // Catch:{ all -> 0x052e }
            java.lang.String r2 = "Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x052e }
            r0.<init>(r1)     // Catch:{ all -> 0x052e }
            throw r0     // Catch:{ all -> 0x052e }
        L_0x0482:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x052e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x052e }
            r1.<init>()     // Catch:{ all -> 0x052e }
            java.lang.String r2 = "Invalid output Tensor index: "
            r1.append(r2)     // Catch:{ all -> 0x052e }
            r1.append(r8)     // Catch:{ all -> 0x052e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x052e }
            r0.<init>(r1)     // Catch:{ all -> 0x052e }
            throw r0     // Catch:{ all -> 0x052e }
        L_0x0499:
            r14.inferenceDurationNanoseconds = r1     // Catch:{ all -> 0x052e }
            monitor-exit(r13)     // Catch:{ all -> 0x052e }
            r6 = 0
        L_0x049d:
            r1 = 100000(0x186a0, float:1.4013E-40)
            if (r6 >= r1) goto L_0x04ce
            r1 = 0
            r2 = r3[r1]
            r2 = r2[r6]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.Map r7 = r0.f324720g
            java.lang.String r8 = ""
            java.lang.Object r7 = p3186j$.util.Map.EL.getOrDefault(r7, r2, r8)
            java.lang.String r7 = (java.lang.String) r7
            r8 = r5[r1]
            r1 = r8[r6]
            boolean r8 = r7.startsWith(r12)
            if (r8 == 0) goto L_0x04cb
            int r2 = r2.intValue()
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.a r8 = new com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.a
            r8.<init>(r2, r7, r1)
            r4.add(r8)
        L_0x04cb:
            int r6 = r6 + 1
            goto L_0x049d
        L_0x04ce:
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.h r0 = com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h.C116964h.f324709a
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.i r1 = com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h.C116965i.f324710a
            java.util.Comparator r0 = p3186j$.util.Comparator.CC.comparing(r0, r1)
            java.util.Collections.sort(r4, r0)
            int r0 = r4.size()
            r1 = 5
            int r0 = java.lang.Math.min(r1, r0)
            r2 = 0
            r4.subList(r2, r0)
        L_0x04e6:
            com.google.common.b.gp r0 = new com.google.common.b.gp
            r2 = 4
            r0.<init>(r2)
            java.util.Iterator r2 = r4.iterator()
        L_0x04f0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0524
            java.lang.Object r3 = r2.next()
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.k r3 = (com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h.C116967k) r3
            java.lang.String r4 = r3.mo103069c()
            com.google.android.libraries.searchbox.root.RootSuggestion r13 = new com.google.android.libraries.searchbox.root.RootSuggestion
            r5 = 26
            r6 = 0
            r3 = 473(0x1d9, float:6.63E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89846n(r3)
            java.lang.String r8 = com.google.common.base.C58890d.m90988c(r4)
            java.lang.Integer r9 = com.google.android.libraries.searchbox.shared.suggestion.C41669ai.f108954c
            r11 = 0
            com.google.android.libraries.searchbox.shared.suggestion.e r12 = com.google.android.libraries.searchbox.shared.suggestion.C41679e.f109005p
            r3 = r13
            r10 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.mo55395g(r13)
            int r1 = r1 + -1
            if (r1 > 0) goto L_0x04f0
        L_0x0524:
            com.google.android.libraries.searchbox.root.a r1 = new com.google.android.libraries.searchbox.root.a
            com.google.common.b.gu r0 = r0.mo55394f()
            r1.<init>(r0)
            return r1
        L_0x052e:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x052e }
            goto L_0x0532
        L_0x0531:
            throw r0
        L_0x0532:
            goto L_0x0531
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h.C116966j.mo17947a():java.lang.Object");
    }
}
