package androidx.mediarouter.p175a;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.mediarouter.a.ag */
/* compiled from: PG */
final class C3671ag extends Handler {

    /* renamed from: a */
    final /* synthetic */ C3679ao f11800a;

    /* renamed from: b */
    private final ArrayList f11801b = new ArrayList();

    /* renamed from: c */
    private final List f11802c = new ArrayList();

    public C3671ag(C3679ao aoVar) {
        this.f11800a = aoVar;
    }

    /* renamed from: a */
    public final void mo7725a(int i, Object obj, int i2) {
        Message obtainMessage = obtainMessage(i, obj);
        obtainMessage.arg1 = i2;
        obtainMessage.sendToTarget();
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014c A[Catch:{ all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015a A[Catch:{ all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0187 A[Catch:{ all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0188 A[Catch:{ all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018c A[Catch:{ all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0190 A[Catch:{ all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0194 A[Catch:{ all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0198 A[Catch:{ all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019c A[Catch:{ all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a0 A[Catch:{ all -> 0x01ad }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r13) {
        /*
            r12 = this;
            int r0 = r13.what
            java.lang.Object r1 = r13.obj
            int r13 = r13.arg1
            r2 = 259(0x103, float:3.63E-43)
            if (r0 != r2) goto L_0x0025
            androidx.mediarouter.a.ao r0 = r12.f11800a
            androidx.mediarouter.a.au r0 = r0.mo7735e()
            java.lang.String r0 = r0.f11863c
            r3 = r1
            androidx.mediarouter.a.au r3 = (androidx.mediarouter.p175a.C3685au) r3
            java.lang.String r3 = r3.f11863c
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0023
            androidx.mediarouter.a.ao r0 = r12.f11800a
            r3 = 1
            r0.mo7746p(r3)
        L_0x0023:
            r0 = 259(0x103, float:3.63E-43)
        L_0x0025:
            r2 = 264(0x108, float:3.7E-43)
            r3 = 262(0x106, float:3.67E-43)
            if (r0 == r3) goto L_0x0087
            if (r0 == r2) goto L_0x006c
            switch(r0) {
                case 257: goto L_0x0061;
                case 258: goto L_0x0056;
                case 259: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x00c0
        L_0x0032:
            androidx.mediarouter.a.ao r4 = r12.f11800a
            androidx.mediarouter.a.cl r4 = r4.f11821c
            r5 = r1
            androidx.mediarouter.a.au r5 = (androidx.mediarouter.p175a.C3685au) r5
            androidx.mediarouter.a.at r6 = r5.f11861a
            androidx.mediarouter.p175a.C3687aw.m10684i()
            androidx.mediarouter.a.v r6 = r6.f11857a
            if (r6 == r4) goto L_0x00c0
            androidx.mediarouter.a.ch r4 = (androidx.mediarouter.p175a.C3726ch) r4
            int r5 = r4.mo7847p(r5)
            if (r5 < 0) goto L_0x00c0
            java.util.ArrayList r6 = r4.f11972q
            java.lang.Object r5 = r6.get(r5)
            androidx.mediarouter.a.cg r5 = (androidx.mediarouter.p175a.C3725cg) r5
            r4.mo7844A(r5)
            goto L_0x00c0
        L_0x0056:
            androidx.mediarouter.a.ao r4 = r12.f11800a
            androidx.mediarouter.a.cl r4 = r4.f11821c
            r5 = r1
            androidx.mediarouter.a.au r5 = (androidx.mediarouter.p175a.C3685au) r5
            r4.mo7852u(r5)
            goto L_0x00c0
        L_0x0061:
            androidx.mediarouter.a.ao r4 = r12.f11800a
            androidx.mediarouter.a.cl r4 = r4.f11821c
            r5 = r1
            androidx.mediarouter.a.au r5 = (androidx.mediarouter.p175a.C3685au) r5
            r4.mo7851t(r5)
            goto L_0x00c0
        L_0x006c:
            r4 = r1
            androidx.core.i.e r4 = (androidx.core.p097i.C1970e) r4
            java.lang.Object r4 = r4.f5889b
            androidx.mediarouter.a.au r4 = (androidx.mediarouter.p175a.C3685au) r4
            java.util.List r5 = r12.f11802c
            r5.add(r4)
            androidx.mediarouter.a.ao r5 = r12.f11800a
            androidx.mediarouter.a.cl r5 = r5.f11821c
            r5.mo7851t(r4)
            androidx.mediarouter.a.ao r5 = r12.f11800a
            androidx.mediarouter.a.cl r5 = r5.f11821c
            r5.mo7853v(r4)
            goto L_0x00c0
        L_0x0087:
            r4 = r1
            androidx.core.i.e r4 = (androidx.core.p097i.C1970e) r4
            java.lang.Object r4 = r4.f5889b
            androidx.mediarouter.a.au r4 = (androidx.mediarouter.p175a.C3685au) r4
            androidx.mediarouter.a.ao r5 = r12.f11800a
            androidx.mediarouter.a.cl r5 = r5.f11821c
            r5.mo7853v(r4)
            androidx.mediarouter.a.ao r5 = r12.f11800a
            androidx.mediarouter.a.au r5 = r5.f11834p
            if (r5 == 0) goto L_0x00c0
            boolean r4 = r4.mo7761h()
            if (r4 == 0) goto L_0x00c0
            java.util.List r4 = r12.f11802c
            java.util.Iterator r4 = r4.iterator()
        L_0x00a7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00bb
            java.lang.Object r5 = r4.next()
            androidx.mediarouter.a.au r5 = (androidx.mediarouter.p175a.C3685au) r5
            androidx.mediarouter.a.ao r6 = r12.f11800a
            androidx.mediarouter.a.cl r6 = r6.f11821c
            r6.mo7852u(r5)
            goto L_0x00a7
        L_0x00bb:
            java.util.List r4 = r12.f11802c
            r4.clear()
        L_0x00c0:
            androidx.mediarouter.a.ao r4 = r12.f11800a     // Catch:{ all -> 0x01ad }
            java.util.ArrayList r4 = r4.f11825g     // Catch:{ all -> 0x01ad }
            int r4 = r4.size()     // Catch:{ all -> 0x01ad }
        L_0x00c8:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x00ee
            androidx.mediarouter.a.ao r5 = r12.f11800a     // Catch:{ all -> 0x01ad }
            java.util.ArrayList r5 = r5.f11825g     // Catch:{ all -> 0x01ad }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x01ad }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ all -> 0x01ad }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x01ad }
            androidx.mediarouter.a.aw r5 = (androidx.mediarouter.p175a.C3687aw) r5     // Catch:{ all -> 0x01ad }
            if (r5 != 0) goto L_0x00e6
            androidx.mediarouter.a.ao r5 = r12.f11800a     // Catch:{ all -> 0x01ad }
            java.util.ArrayList r5 = r5.f11825g     // Catch:{ all -> 0x01ad }
            r5.remove(r4)     // Catch:{ all -> 0x01ad }
            goto L_0x00c8
        L_0x00e6:
            java.util.ArrayList r6 = r12.f11801b     // Catch:{ all -> 0x01ad }
            java.util.ArrayList r5 = r5.f11886d     // Catch:{ all -> 0x01ad }
            r6.addAll(r5)     // Catch:{ all -> 0x01ad }
            goto L_0x00c8
        L_0x00ee:
            java.util.ArrayList r4 = r12.f11801b     // Catch:{ all -> 0x01ad }
            int r4 = r4.size()     // Catch:{ all -> 0x01ad }
            r5 = 0
        L_0x00f5:
            if (r5 >= r4) goto L_0x01a7
            java.util.ArrayList r6 = r12.f11801b     // Catch:{ all -> 0x01ad }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x01ad }
            androidx.mediarouter.a.ab r6 = (androidx.mediarouter.p175a.C3666ab) r6     // Catch:{ all -> 0x01ad }
            androidx.mediarouter.a.aw r7 = r6.f11793a     // Catch:{ all -> 0x01ad }
            androidx.mediarouter.a.aa r8 = r6.f11794b     // Catch:{ all -> 0x01ad }
            r9 = 65280(0xff00, float:9.1477E-41)
            r9 = r9 & r0
            r10 = 256(0x100, float:3.59E-43)
            if (r9 == r10) goto L_0x013a
            r6 = 512(0x200, float:7.175E-43)
            if (r9 == r6) goto L_0x0123
            r6 = 768(0x300, float:1.076E-42)
            if (r9 == r6) goto L_0x0115
            goto L_0x01a3
        L_0x0115:
            r6 = 769(0x301, float:1.078E-42)
            if (r0 == r6) goto L_0x011b
            goto L_0x01a3
        L_0x011b:
            r6 = r1
            androidx.mediarouter.a.bk r6 = (androidx.mediarouter.p175a.C3702bk) r6     // Catch:{ all -> 0x01ad }
            r8.mo7716h(r6)     // Catch:{ all -> 0x01ad }
            goto L_0x01a3
        L_0x0123:
            r6 = r1
            androidx.mediarouter.a.at r6 = (androidx.mediarouter.p175a.C3684at) r6     // Catch:{ all -> 0x01ad }
            switch(r0) {
                case 513: goto L_0x0135;
                case 514: goto L_0x0130;
                case 515: goto L_0x012b;
                default: goto L_0x0129;
            }     // Catch:{ all -> 0x01ad }
        L_0x0129:
            goto L_0x01a3
        L_0x012b:
            r8.mo7710b()     // Catch:{ all -> 0x01ad }
            goto L_0x01a3
        L_0x0130:
            r8.mo7711c()     // Catch:{ all -> 0x01ad }
            goto L_0x01a3
        L_0x0135:
            r8.mo7709a()     // Catch:{ all -> 0x01ad }
            goto L_0x01a3
        L_0x013a:
            if (r0 == r2) goto L_0x0143
            if (r0 != r3) goto L_0x013f
            goto L_0x0143
        L_0x013f:
            r9 = r1
            androidx.mediarouter.a.au r9 = (androidx.mediarouter.p175a.C3685au) r9     // Catch:{ all -> 0x01ad }
            goto L_0x014a
        L_0x0143:
            r9 = r1
            androidx.core.i.e r9 = (androidx.core.p097i.C1970e) r9     // Catch:{ all -> 0x01ad }
            java.lang.Object r9 = r9.f5889b     // Catch:{ all -> 0x01ad }
            androidx.mediarouter.a.au r9 = (androidx.mediarouter.p175a.C3685au) r9     // Catch:{ all -> 0x01ad }
        L_0x014a:
            if (r0 == r2) goto L_0x0151
            if (r0 != r3) goto L_0x014f
            goto L_0x0151
        L_0x014f:
            r10 = 0
            goto L_0x0158
        L_0x0151:
            r10 = r1
            androidx.core.i.e r10 = (androidx.core.p097i.C1970e) r10     // Catch:{ all -> 0x01ad }
            java.lang.Object r10 = r10.f5888a     // Catch:{ all -> 0x01ad }
            androidx.mediarouter.a.au r10 = (androidx.mediarouter.p175a.C3685au) r10     // Catch:{ all -> 0x01ad }
        L_0x0158:
            if (r9 == 0) goto L_0x01a3
            int r11 = r6.f11796d     // Catch:{ all -> 0x01ad }
            r11 = r11 & 2
            if (r11 != 0) goto L_0x0183
            androidx.mediarouter.a.z r6 = r6.f11795c     // Catch:{ all -> 0x01ad }
            boolean r6 = r9.mo7765l(r6)     // Catch:{ all -> 0x01ad }
            if (r6 == 0) goto L_0x0169
            goto L_0x0183
        L_0x0169:
            boolean r6 = androidx.mediarouter.p175a.C3687aw.m10687q()     // Catch:{ all -> 0x01ad }
            if (r6 == 0) goto L_0x01a3
            boolean r6 = r9.mo7761h()     // Catch:{ all -> 0x01ad }
            if (r6 == 0) goto L_0x01a3
            if (r0 != r3) goto L_0x01a3
            r6 = 3
            if (r13 != r6) goto L_0x01a3
            if (r10 == 0) goto L_0x01a3
            boolean r10 = r10.mo7761h()     // Catch:{ all -> 0x01ad }
            if (r10 != 0) goto L_0x01a3
            goto L_0x0184
        L_0x0183:
            r6 = r13
        L_0x0184:
            switch(r0) {
                case 257: goto L_0x01a0;
                case 258: goto L_0x019c;
                case 259: goto L_0x0198;
                case 260: goto L_0x0194;
                case 261: goto L_0x0187;
                case 262: goto L_0x0190;
                case 263: goto L_0x018c;
                case 264: goto L_0x0188;
                default: goto L_0x0187;
            }     // Catch:{ all -> 0x01ad }
        L_0x0187:
            goto L_0x01a3
        L_0x0188:
            r8.mo7719k(r7, r9, r6)     // Catch:{ all -> 0x01ad }
            goto L_0x01a3
        L_0x018c:
            r8.mo7720l(r9, r6)     // Catch:{ all -> 0x01ad }
            goto L_0x01a3
        L_0x0190:
            r8.mo7719k(r7, r9, r6)     // Catch:{ all -> 0x01ad }
            goto L_0x01a3
        L_0x0194:
            r8.mo7718j(r9)     // Catch:{ all -> 0x01ad }
            goto L_0x01a3
        L_0x0198:
            r8.mo7713e(r9)     // Catch:{ all -> 0x01ad }
            goto L_0x01a3
        L_0x019c:
            r8.mo7714f(r9)     // Catch:{ all -> 0x01ad }
            goto L_0x01a3
        L_0x01a0:
            r8.mo7712d(r9)     // Catch:{ all -> 0x01ad }
        L_0x01a3:
            int r5 = r5 + 1
            goto L_0x00f5
        L_0x01a7:
            java.util.ArrayList r13 = r12.f11801b
            r13.clear()
            return
        L_0x01ad:
            r13 = move-exception
            java.util.ArrayList r0 = r12.f11801b
            r0.clear()
            goto L_0x01b5
        L_0x01b4:
            throw r13
        L_0x01b5:
            goto L_0x01b4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.p175a.C3671ag.handleMessage(android.os.Message):void");
    }
}
