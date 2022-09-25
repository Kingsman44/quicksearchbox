package com.google.common.p4522b;

import p3186j$.util.Objects;

/* renamed from: com.google.common.b.hw */
/* compiled from: PG */
public final class C58514hw extends C58470gf {

    /* renamed from: a */
    public C58706oz f156157a;

    /* renamed from: b */
    public boolean f156158b;

    /* renamed from: c */
    public boolean f156159c;

    public C58514hw() {
        this(4);
    }

    /* renamed from: a */
    public final C58517hz mo55467a() {
        Objects.requireNonNull(this.f156157a);
        C58706oz ozVar = this.f156157a;
        if (ozVar.f156439c == 0) {
            return C58732py.f156492a;
        }
        if (this.f156159c) {
            this.f156157a = new C58706oz(ozVar);
            this.f156159c = false;
        }
        this.f156158b = true;
        return new C58732py(this.f156157a);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.common.b.ol, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55468b(java.lang.Iterable r4) {
        /*
            r3 = this;
            com.google.common.b.oz r0 = r3.f156157a
            p3186j$.util.Objects.requireNonNull(r0)
            boolean r0 = r4 instanceof com.google.common.p4522b.C58692ol
            if (r0 == 0) goto L_0x006d
            boolean r0 = r4 instanceof com.google.common.p4522b.C58732py
            if (r0 == 0) goto L_0x0013
            r0 = r4
            com.google.common.b.py r0 = (com.google.common.p4522b.C58732py) r0
            com.google.common.b.oz r0 = r0.f156493b
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0039
            com.google.common.b.oz r4 = r3.f156157a
            int r1 = r4.f156439c
            int r2 = r0.f156439c
            int r1 = java.lang.Math.max(r1, r2)
            r4.mo55804m(r1)
            int r4 = r0.mo55792a()
        L_0x0027:
            if (r4 < 0) goto L_0x006c
            java.lang.Object r1 = r0.mo55802k(r4)
            int r2 = r0.mo55794c(r4)
            r3.mo55469f(r1, r2)
            int r4 = r0.mo55796e(r4)
            goto L_0x0027
        L_0x0039:
            java.util.Set r0 = r4.mo54975m()
            com.google.common.b.oz r1 = r3.f156157a
            int r2 = r1.f156439c
            int r0 = r0.size()
            int r0 = java.lang.Math.max(r2, r0)
            r1.mo55804m(r0)
            java.util.Set r4 = r4.mo54975m()
            java.util.Iterator r4 = r4.iterator()
        L_0x0054:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r4.next()
            com.google.common.b.ok r0 = (com.google.common.p4522b.C58691ok) r0
            java.lang.Object r1 = r0.mo55768b()
            int r0 = r0.mo55767a()
            r3.mo55469f(r1, r0)
            goto L_0x0054
        L_0x006c:
            return
        L_0x006d:
            super.mo55374d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58514hw.mo55468b(java.lang.Iterable):void");
    }

    /* renamed from: c */
    public final /* synthetic */ void mo55373c(Object obj) {
        mo55469f(obj, 1);
    }

    /* renamed from: f */
    public final void mo55469f(Object obj, int i) {
        Objects.requireNonNull(this.f156157a);
        if (i != 0) {
            if (this.f156158b) {
                this.f156157a = new C58706oz(this.f156157a);
                this.f156159c = false;
            }
            this.f156158b = false;
            obj.getClass();
            C58706oz ozVar = this.f156157a;
            ozVar.mo55798g(obj, i + ozVar.mo55793b(obj));
        }
    }

    public C58514hw(int i) {
        this.f156158b = false;
        this.f156159c = false;
        this.f156157a = new C58706oz(i);
    }
}
