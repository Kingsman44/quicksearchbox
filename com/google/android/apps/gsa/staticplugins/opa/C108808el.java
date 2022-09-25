package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106160a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.el */
/* compiled from: PG */
final class C108808el implements C106160a {

    /* renamed from: a */
    final /* synthetic */ boolean f302550a;

    /* renamed from: b */
    final /* synthetic */ C22869e f302551b;

    /* renamed from: c */
    final /* synthetic */ C109040fj f302552c;

    public C108808el(C109040fj fjVar, boolean z, C22869e eVar) {
        this.f302552c = fjVar;
        this.f302550a = z;
        this.f302551b = eVar;
    }

    /* renamed from: a */
    public final void mo95332a() {
        C59071e eVar = C109040fj.f303210a;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f302550a) {
            C109040fj fjVar = this.f302552c;
            if (!fjVar.f303245aE) {
                fjVar.f303245aE = true;
                C108262cf cfVar = new C108262cf();
                cfVar.f301174d = this.f302552c.mo97534f().getString(R.string.opa_unlock_device_for_response);
                this.f302552c.f303450o.mo95430s(cfVar);
                this.f302552c.f303450o.mo95411av();
                this.f302552c.f303450o.mo95415az();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95333b(int r5) {
        /*
            r4 = this;
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.C109040fj.f303210a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r0 = r4.f302550a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0012
            if (r5 != r2) goto L_0x005d
            com.google.android.apps.gsa.staticplugins.opa.fj r5 = r4.f302552c
            r5.mo97475ak(r2)
            goto L_0x0067
        L_0x0012:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r4.f302552c
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r0.f303450o
            r3 = 16
            r0.mo95434w(r3)
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
            com.google.android.apps.gsa.staticplugins.opa.ey r0 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.UNINITIALIZED
            com.google.android.apps.gsa.opa.ac r0 = com.google.android.apps.gsa.opa.C83572ac.UNINITIALIZED
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r0 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            com.google.android.apps.gsa.staticplugins.opa.chatui.az r0 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108228az.UNINITIALIZED
            int r0 = r5 + -1
            if (r0 == 0) goto L_0x0043
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r4.f302552c
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r0.f303450o
            r3 = 32
            r0.mo95434w(r3)
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r4.f302552c
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r0.f303450o
            r0.mo95436y()
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r4.f302552c
            r3 = 0
            r0.f303340bu = r3
            com.google.android.apps.gsa.staticplugins.opa.ah.o r0 = r0.f303394cz
            r0.f296315b = r1
            goto L_0x0056
        L_0x0043:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r4.f302552c
            r0.mo97475ak(r2)
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r4.f302552c
            r0.mo97467ac()
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r4.f302552c
            byte[] r3 = r0.f303340bu
            if (r3 == 0) goto L_0x0056
            r0.mo97440aB()
        L_0x0056:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r4.f302552c
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r0.f303450o
            r0.mo95415az()
        L_0x005d:
            if (r5 == r2) goto L_0x0067
            com.google.android.apps.gsa.staticplugins.opa.fj r5 = r4.f302552c
            android.app.Activity r5 = r5.f303441f
            r5.finish()
            return
        L_0x0067:
            com.google.android.libraries.gsa.k.e r5 = r4.f302551b
            if (r5 == 0) goto L_0x006f
            r5.run()
            return
        L_0x006f:
            com.google.android.apps.gsa.staticplugins.opa.fj r5 = r4.f302552c
            boolean r0 = r5.f303370cb
            if (r0 == 0) goto L_0x007d
            boolean r5 = r5.mo97526bt()
            if (r5 == 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            return
        L_0x007d:
            com.google.android.apps.gsa.staticplugins.opa.fj r5 = r4.f302552c
            r0 = 6
            r5.mo97498bH(r1, r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C108808el.mo95333b(int):void");
    }
}
