package androidx.mediarouter.p175a;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: androidx.mediarouter.a.br */
/* compiled from: PG */
final class C3709br extends Handler {

    /* renamed from: a */
    public final WeakReference f11913a;

    public C3709br(C3706bo boVar) {
        this.f11913a = new WeakReference(boVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f5, code lost:
        new java.lang.StringBuilder("Unhandled message from server: ").append(r1);
        android.util.Log.d("MediaRouteProviderProxy", "Unhandled message from server: ".concat(java.lang.String.valueOf(r17)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b1, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b2, code lost:
        if (r10 == false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f3, code lost:
        if (androidx.mediarouter.p175a.C3713bv.f11930a == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.ref.WeakReference r2 = r0.f11913a
            java.lang.Object r2 = r2.get()
            androidx.mediarouter.a.bo r2 = (androidx.mediarouter.p175a.C3706bo) r2
            if (r2 == 0) goto L_0x020a
            int r3 = r1.what
            int r4 = r1.arg1
            int r5 = r1.arg2
            java.lang.Object r6 = r1.obj
            android.os.Bundle r7 = r17.peekData()
            java.lang.String r8 = "MediaRouteProviderProxy"
            r10 = 1
            r11 = 0
            switch(r3) {
                case 0: goto L_0x01b5;
                case 1: goto L_0x020a;
                case 2: goto L_0x0168;
                case 3: goto L_0x014d;
                case 4: goto L_0x0128;
                case 5: goto L_0x0111;
                case 6: goto L_0x00e1;
                case 7: goto L_0x004f;
                case 8: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x01f1
        L_0x0023:
            androidx.mediarouter.a.bv r3 = r2.f11911h
            androidx.mediarouter.a.bo r4 = r3.f11935n
            if (r4 != r2) goto L_0x01f1
            androidx.mediarouter.a.bp r2 = r3.mo7822a(r5)
            androidx.mediarouter.a.bw r4 = r3.f11937p
            if (r4 == 0) goto L_0x004a
            boolean r5 = r2 instanceof androidx.mediarouter.p175a.C3748u
            if (r5 == 0) goto L_0x004a
            r5 = r2
            androidx.mediarouter.a.u r5 = (androidx.mediarouter.p175a.C3748u) r5
            androidx.mediarouter.a.cb r4 = r4.f11939a
            androidx.mediarouter.a.ca r4 = r4.f11944b
            androidx.mediarouter.a.ao r4 = (androidx.mediarouter.p175a.C3679ao) r4
            androidx.mediarouter.a.u r6 = r4.f11837s
            if (r6 != r5) goto L_0x004a
            androidx.mediarouter.a.au r5 = r4.mo7733c()
            r6 = 2
            r4.mo7741k(r5, r6)
        L_0x004a:
            r3.mo7830l(r2)
            goto L_0x01f1
        L_0x004f:
            if (r6 == 0) goto L_0x0055
            boolean r3 = r6 instanceof android.os.Bundle
            if (r3 == 0) goto L_0x01f1
        L_0x0055:
            android.os.Bundle r6 = (android.os.Bundle) r6
            int r3 = r2.f11908e
            if (r3 == 0) goto L_0x01b1
            java.lang.String r3 = "groupRoute"
            android.os.Parcelable r3 = r6.getParcelable(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r3 == 0) goto L_0x006a
            androidx.mediarouter.a.l r3 = androidx.mediarouter.p175a.C3739l.m10837l(r3)
            goto L_0x006b
        L_0x006a:
            r3 = 0
        L_0x006b:
            java.lang.String r4 = "dynamicRoutes"
            java.util.ArrayList r4 = r6.getParcelableArrayList(r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r4.size()
            r12 = 0
        L_0x007b:
            if (r12 >= r7) goto L_0x00b1
            java.lang.Object r13 = r4.get(r12)
            android.os.Bundle r13 = (android.os.Bundle) r13
            if (r13 != 0) goto L_0x0087
            r9 = 0
            goto L_0x00ab
        L_0x0087:
            java.lang.String r14 = "mrDescriptor"
            android.os.Bundle r14 = r13.getBundle(r14)
            androidx.mediarouter.a.l r14 = androidx.mediarouter.p175a.C3739l.m10837l(r14)
            java.lang.String r15 = "selectionState"
            int r15 = r13.getInt(r15, r10)
            java.lang.String r9 = "isUnselectable"
            r13.getBoolean(r9, r11)
            java.lang.String r9 = "isGroupable"
            r13.getBoolean(r9, r11)
            java.lang.String r9 = "isTransferable"
            r13.getBoolean(r9, r11)
            androidx.mediarouter.a.q r9 = new androidx.mediarouter.a.q
            r9.<init>(r14, r15)
        L_0x00ab:
            r6.add(r9)
            int r12 = r12 + 1
            goto L_0x007b
        L_0x00b1:
            androidx.mediarouter.a.bv r4 = r2.f11911h
            androidx.mediarouter.a.bo r7 = r4.f11935n
            if (r7 != r2) goto L_0x01b2
            boolean r2 = androidx.mediarouter.p175a.C3713bv.f11930a
            if (r2 == 0) goto L_0x00d2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r7 = ": DynamicRouteDescriptors changed, descriptors="
            r2.append(r7)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r8, r2)
        L_0x00d2:
            androidx.mediarouter.a.bp r2 = r4.mo7822a(r5)
            boolean r4 = r2 instanceof androidx.mediarouter.p175a.C3711bt
            if (r4 == 0) goto L_0x01b2
            androidx.mediarouter.a.bt r2 = (androidx.mediarouter.p175a.C3711bt) r2
            r2.mo7911k(r3, r6)
            goto L_0x01b2
        L_0x00e1:
            boolean r3 = r6 instanceof android.os.Bundle
            if (r3 == 0) goto L_0x010a
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.util.SparseArray r3 = r2.f11910g
            java.lang.Object r3 = r3.get(r4)
            androidx.mediarouter.a.ac r3 = (androidx.mediarouter.p175a.C3667ac) r3
            if (r6 == 0) goto L_0x0103
            java.lang.String r5 = "routeId"
            boolean r5 = r6.containsKey(r5)
            if (r5 == 0) goto L_0x0103
            android.util.SparseArray r2 = r2.f11910g
            r2.remove(r4)
            r3.mo7722b(r6)
            goto L_0x01f1
        L_0x0103:
            java.lang.String r2 = "DynamicGroupRouteController is created without valid route id."
            r3.mo7721a(r2, r6)
            goto L_0x01f1
        L_0x010a:
            java.lang.String r2 = "No further information on the dynamic group controller"
            android.util.Log.w(r8, r2)
            goto L_0x01f1
        L_0x0111:
            if (r6 == 0) goto L_0x0117
            boolean r3 = r6 instanceof android.os.Bundle
            if (r3 == 0) goto L_0x01f1
        L_0x0117:
            android.os.Bundle r6 = (android.os.Bundle) r6
            int r3 = r2.f11908e
            if (r3 == 0) goto L_0x01b1
            androidx.mediarouter.a.bv r3 = r2.f11911h
            androidx.mediarouter.a.x r4 = androidx.mediarouter.p175a.C3751x.m10876a(r6)
            r3.mo7829h(r2, r4)
            goto L_0x01b2
        L_0x0128:
            if (r6 == 0) goto L_0x012e
            boolean r3 = r6 instanceof android.os.Bundle
            if (r3 == 0) goto L_0x01f1
        L_0x012e:
            if (r7 != 0) goto L_0x0132
            r9 = 0
            goto L_0x0138
        L_0x0132:
            java.lang.String r3 = "error"
            java.lang.String r9 = r7.getString(r3)
        L_0x0138:
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.util.SparseArray r3 = r2.f11910g
            java.lang.Object r3 = r3.get(r4)
            androidx.mediarouter.a.ac r3 = (androidx.mediarouter.p175a.C3667ac) r3
            if (r3 == 0) goto L_0x01b1
            android.util.SparseArray r2 = r2.f11910g
            r2.remove(r4)
            r3.mo7721a(r9, r6)
            goto L_0x01b2
        L_0x014d:
            if (r6 == 0) goto L_0x0153
            boolean r3 = r6 instanceof android.os.Bundle
            if (r3 == 0) goto L_0x01f1
        L_0x0153:
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.util.SparseArray r3 = r2.f11910g
            java.lang.Object r3 = r3.get(r4)
            androidx.mediarouter.a.ac r3 = (androidx.mediarouter.p175a.C3667ac) r3
            if (r3 == 0) goto L_0x01b1
            android.util.SparseArray r2 = r2.f11910g
            r2.remove(r4)
            r3.mo7722b(r6)
            goto L_0x01b2
        L_0x0168:
            if (r6 == 0) goto L_0x016e
            boolean r3 = r6 instanceof android.os.Bundle
            if (r3 == 0) goto L_0x01f1
        L_0x016e:
            android.os.Bundle r6 = (android.os.Bundle) r6
            int r3 = r2.f11908e
            if (r3 != 0) goto L_0x01b1
            int r3 = r2.f11909f
            if (r4 != r3) goto L_0x01b1
            if (r5 <= 0) goto L_0x01b1
            r2.f11909f = r11
            r2.f11908e = r5
            androidx.mediarouter.a.bv r3 = r2.f11911h
            androidx.mediarouter.a.x r4 = androidx.mediarouter.p175a.C3751x.m10876a(r6)
            r3.mo7829h(r2, r4)
            androidx.mediarouter.a.bv r3 = r2.f11911h
            androidx.mediarouter.a.bo r4 = r3.f11935n
            if (r4 != r2) goto L_0x01b2
            r3.f11936o = r10
            java.util.ArrayList r2 = r3.f11933d
            int r2 = r2.size()
        L_0x0195:
            if (r11 >= r2) goto L_0x01a7
            java.util.ArrayList r4 = r3.f11933d
            java.lang.Object r4 = r4.get(r11)
            androidx.mediarouter.a.bp r4 = (androidx.mediarouter.p175a.C3707bp) r4
            androidx.mediarouter.a.bo r5 = r3.f11935n
            r4.mo7813e(r5)
            int r11 = r11 + 1
            goto L_0x0195
        L_0x01a7:
            androidx.mediarouter.a.m r2 = r3.f12033i
            if (r2 == 0) goto L_0x01b2
            androidx.mediarouter.a.bo r3 = r3.f11935n
            r3.mo7807c(r2)
            goto L_0x01b2
        L_0x01b1:
            r10 = 0
        L_0x01b2:
            if (r10 == 0) goto L_0x01f1
            goto L_0x020a
        L_0x01b5:
            int r1 = r2.f11909f
            if (r4 != r1) goto L_0x01dd
            r2.f11909f = r11
            androidx.mediarouter.a.bv r1 = r2.f11911h
            androidx.mediarouter.a.bo r3 = r1.f11935n
            if (r3 != r2) goto L_0x01dd
            boolean r3 = androidx.mediarouter.p175a.C3713bv.f11930a
            if (r3 == 0) goto L_0x01da
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r3 = ": Service connection error - Registration failed"
            java.lang.String r5 = r1.toString()
            java.lang.String r3 = r5.concat(r3)
            android.util.Log.d(r8, r3)
        L_0x01da:
            r1.mo7832n()
        L_0x01dd:
            android.util.SparseArray r1 = r2.f11910g
            java.lang.Object r1 = r1.get(r4)
            androidx.mediarouter.a.ac r1 = (androidx.mediarouter.p175a.C3667ac) r1
            if (r1 == 0) goto L_0x020a
            android.util.SparseArray r2 = r2.f11910g
            r2.remove(r4)
            r2 = 0
            r1.mo7721a(r2, r2)
            return
        L_0x01f1:
            boolean r2 = androidx.mediarouter.p175a.C3713bv.f11930a
            if (r2 == 0) goto L_0x020a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unhandled message from server: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = java.lang.String.valueOf(r17)
            java.lang.String r1 = r3.concat(r1)
            android.util.Log.d(r8, r1)
        L_0x020a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.p175a.C3709br.handleMessage(android.os.Message):void");
    }
}
