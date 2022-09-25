package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.C66266x;
import java.util.HashMap;
import java.util.Map;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;

/* renamed from: com.google.android.libraries.elements.d.e.a.g */
/* compiled from: PG */
public final class C20975g implements C21312s {

    /* renamed from: a */
    public static final Map f58795a = new HashMap();

    /* renamed from: b */
    public static final Map f58796b = new HashMap();

    /* renamed from: c */
    public static final Map f58797c = new HashMap();

    /* renamed from: d */
    private final C70128t f58798d;

    /* renamed from: e */
    private final C70128t f58799e;

    public C20975g(C70128t tVar, C70128t tVar2) {
        this.f58798d = tVar;
        this.f58799e = tVar2;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C66266x.f180208i;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        return C69794a.m101256h(new C20972d(this, (C66266x) obj, rVar)).mo61452j(this.f58799e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26088d(com.google.protos.youtube.elements.C66266x r18, android.view.View r19, android.view.View r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r20
            int r2 = r0.f180210a
            r2 = r2 & 16
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r1 = r0.f180215f
            java.util.Map r2 = f58795a
            java.lang.Object r2 = r2.get(r1)
            com.facebook.litho.g.b.s r2 = (com.facebook.litho.p329g.p331b.C6317s) r2
            if (r2 != 0) goto L_0x0022
            java.util.Map r2 = f58797c
            r2.put(r1, r0)
        L_0x001e:
            r7 = r17
            goto L_0x008c
        L_0x0022:
            android.support.v7.widget.RecyclerView r1 = r2.mo13573a()
            goto L_0x005d
        L_0x0027:
            boolean r2 = r1 instanceof com.facebook.litho.ComponentHost
            if (r2 == 0) goto L_0x0042
            com.facebook.litho.ComponentHost r1 = (com.facebook.litho.ComponentHost) r1
            int r2 = r1.getChildCount()
            if (r2 != r4) goto L_0x0042
            android.view.View r2 = r1.getChildAt(r5)
            boolean r2 = r2 instanceof com.facebook.litho.widget.C6497db
            if (r2 == 0) goto L_0x0042
            android.view.View r1 = r1.getChildAt(r5)
            com.facebook.litho.widget.db r1 = (com.facebook.litho.widget.C6497db) r1
            goto L_0x0058
        L_0x0042:
            if (r19 != 0) goto L_0x0046
        L_0x0044:
            r1 = r3
            goto L_0x0058
        L_0x0046:
            android.view.ViewParent r1 = r19.getParent()
        L_0x004a:
            if (r1 == 0) goto L_0x0044
            boolean r2 = r1 instanceof com.facebook.litho.widget.C6497db
            if (r2 == 0) goto L_0x0053
            com.facebook.litho.widget.db r1 = (com.facebook.litho.widget.C6497db) r1
            goto L_0x0058
        L_0x0053:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x004a
        L_0x0058:
            if (r1 == 0) goto L_0x011f
            android.support.v7.widget.RecyclerView r1 = r1.f19266p
            r2 = r3
        L_0x005d:
            if (r1 != 0) goto L_0x0060
            goto L_0x001e
        L_0x0060:
            java.util.Map r3 = f58796b
            java.lang.Object r6 = r3.get(r1)
            com.google.android.libraries.elements.d.e.a.c r6 = (com.google.android.libraries.elements.p1714d.p1719e.p1720a.C20971c) r6
            if (r6 != 0) goto L_0x0089
            com.google.android.libraries.elements.d.e.a.f r6 = new com.google.android.libraries.elements.d.e.a.f
            r6.<init>(r1, r2)
            com.google.android.libraries.elements.d.e.a.c r2 = new com.google.android.libraries.elements.d.e.a.c
            r7 = r17
            io.b.t r8 = r7.f58798d
            io.b.t r9 = p5488io.p5490b.p5491a.p5493b.C69797b.f186184a
            p5488io.p5490b.p5491a.p5492a.C69795a.m101266a(r9)
            r2.<init>(r6, r8, r9)
            r3.put(r1, r2)
            com.google.android.libraries.elements.d.e.a.e r3 = new com.google.android.libraries.elements.d.e.a.e
            r3.<init>(r2, r1)
            r6.f58791b = r3
            r3 = r2
            goto L_0x008c
        L_0x0089:
            r7 = r17
            r3 = r6
        L_0x008c:
            if (r3 != 0) goto L_0x008f
            return
        L_0x008f:
            int r1 = r0.f180210a
            r1 = r1 & 32
            if (r1 == 0) goto L_0x00a2
            com.google.protos.youtube.elements.t r1 = r0.f180216g
            if (r1 != 0) goto L_0x009b
            com.google.protos.youtube.elements.t r1 = com.google.protos.youtube.elements.C66262t.f180197b
        L_0x009b:
            boolean r1 = r1.f180199a
            if (r1 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r1 = 0
            goto L_0x00a3
        L_0x00a2:
            r1 = 1
        L_0x00a3:
            int r2 = r0.f180211b
            float r6 = r0.f180212c
            int r8 = r0.f180214e
            int r8 = com.google.protos.youtube.elements.C66268z.m96846a(r8)
            if (r8 != 0) goto L_0x00b1
        L_0x00af:
            r8 = 0
            goto L_0x00b5
        L_0x00b1:
            r9 = 2
            if (r8 != r9) goto L_0x00af
            r8 = 1
        L_0x00b5:
            boolean r0 = r0.f180213d
            r3.mo26082a()
            com.google.android.libraries.elements.d.e.a.f r9 = r3.f58784e
            android.support.v7.widget.RecyclerView r10 = r9.f58790a
            boolean r10 = r10.mIsAttached
            if (r10 != 0) goto L_0x00c3
            return
        L_0x00c3:
            r9.f58792c = r3
            if (r2 < 0) goto L_0x00cf
            int r9 = r9.mo26084a()
            if (r2 < r9) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r5 = r2
        L_0x00cf:
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0114
            java.util.concurrent.atomic.AtomicReference r2 = r3.f58782c
            r9 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 * r9
            int r6 = (int) r6
            com.google.android.libraries.elements.d.e.a.b r9 = new com.google.android.libraries.elements.d.e.a.b
            com.google.android.libraries.elements.d.e.a.f r10 = r3.f58784e
            int r10 = r10.mo26084a()
            com.google.android.libraries.elements.d.e.a.f r11 = r3.f58784e
            android.support.v7.widget.RecyclerView r11 = r11.f58790a
            android.support.v7.widget.fo r11 = r11.mLayout
            boolean r12 = r11 instanceof android.support.p033v7.widget.GridLayoutManager
            if (r12 == 0) goto L_0x00f1
            android.support.v7.widget.GridLayoutManager r11 = (android.support.p033v7.widget.GridLayoutManager) r11
            int r4 = r11.mSpanCount
        L_0x00f1:
            r9.<init>(r10, r5, r8, r4)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.b.t r4 = r3.f58780a
            r11 = 0
            long r13 = (long) r6
            r16 = r4
            io.b.l r4 = p5488io.p5490b.C70120l.m102050k(r11, r13, r15, r16)
            io.b.t r5 = r3.f58781b
            io.b.l r4 = r4.mo61653m(r5)
            com.google.android.libraries.elements.d.e.a.a r5 = new com.google.android.libraries.elements.d.e.a.a
            r5.<init>(r3, r9, r1)
            io.b.b.b r1 = r4.mo61654n(r5)
            r2.set(r1)
            goto L_0x0119
        L_0x0114:
            com.google.android.libraries.elements.d.e.a.f r2 = r3.f58784e
            r2.mo26085b(r5, r1)
        L_0x0119:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f58783d
            r1.set(r0)
            return
        L_0x011f:
            r7 = r17
            com.google.android.libraries.elements.interfaces.bc r0 = new com.google.android.libraries.elements.interfaces.bc
            java.lang.String r1 = "Cannot find CollectionType instance in command's ancestors chain. Please put command at right place or add an Element key to both collectionType instance and collection command."
            r0.<init>(r1)
            goto L_0x012a
        L_0x0129:
            throw r0
        L_0x012a:
            goto L_0x0129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.p1719e.p1720a.C20975g.mo26088d(com.google.protos.youtube.elements.x, android.view.View, android.view.View):void");
    }
}
