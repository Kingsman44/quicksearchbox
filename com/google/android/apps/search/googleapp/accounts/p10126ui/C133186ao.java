package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10127a.C133170d;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133241x;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.ao */
/* compiled from: PG */
public final class C133186ao implements C46852f {

    /* renamed from: a */
    private static final C59071e f363031a = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.ao");

    /* renamed from: b */
    private final Fragment f363032b;

    /* renamed from: c */
    private final C133170d f363033c;

    /* renamed from: d */
    private final C133255c f363034d;

    /* renamed from: e */
    private final AccountId f363035e;

    /* renamed from: f */
    private final C133241x f363036f;

    /* renamed from: g */
    private final C30305n f363037g;

    /* renamed from: h */
    private final C139695b f363038h;

    public C133186ao(Fragment fragment, AccountId accountId, C133255c cVar, C133241x xVar, C30305n nVar, C139695b bVar, C133170d dVar) {
        this.f363032b = fragment;
        this.f363035e = accountId;
        this.f363036f = xVar;
        this.f363033c = dVar;
        this.f363034d = cVar;
        this.f363037g = nVar;
        this.f363038h = bVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f363031a.mo56226d()).mo56382g(th)).mo56372aa(40019)).mo56386p("Can't get Deactivated accounts state for Mavatar!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        if (com.google.common.p4522b.C58528ij.m90015O("and.gsa.launcher.icon", "and.gsa.launcher.shortcut.text", "and.gsa.launcher.shortcut.voice", "and.opa.pixel_launcher.qsb", "and.gsa.launcher.homescreen.appssearch", "and.gsa.launcher.shelf.appssearch", "and.gsa.launcher.homescreen.fallback", "and.gsa.launcher.allapps.appssearch", "and.gsa.widget.text", "and.gsa.widget.logo").contains((java.lang.String) r12.f363038h.mo115169a().orElse(com.evernote.android.state.BuildConfig.FLAVOR)) != false) goto L_0x0074;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo20961j(java.lang.Object r13) {
        /*
            r12 = this;
            com.google.android.apps.search.googleapp.accounts.ui.b.t r13 = (com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133237t) r13
            com.google.common.b.hd r0 = r13.mo111041a()
            com.google.android.apps.search.googleapp.accounts.ui.a.d r1 = r12.f363033c
            r1.f363002a = r0
            com.google.apps.tiktok.account.AccountId r0 = r12.f363035e
            boolean r0 = r1.mo111007a(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0090
            android.support.v4.app.Fragment r0 = r12.f363032b
            android.support.v4.app.am r0 = r0.getActivity()
            r2 = 1
            if (r0 != 0) goto L_0x0024
            boolean r0 = r13.mo111042b()
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            android.support.v4.app.Fragment r3 = r12.f363032b
            android.support.v4.app.am r3 = r3.getActivity()
            if (r3 == 0) goto L_0x0073
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r4 = "AGSA_CLASSIC_INTENT_EXTRA"
            boolean r3 = r3.hasExtra(r4)
            if (r3 != 0) goto L_0x0073
            com.google.android.apps.search.googleapp.t.c.b r3 = r12.f363038h
            j$.util.Optional r3 = r3.mo115169a()
            java.lang.String r4 = ""
            java.lang.Object r3 = r3.orElse(r4)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 4
            java.lang.String[] r11 = new java.lang.String[r4]
            java.lang.String r4 = "and.gsa.launcher.homescreen.fallback"
            r11[r1] = r4
            java.lang.String r4 = "and.gsa.launcher.allapps.appssearch"
            r11[r2] = r4
            r4 = 2
            java.lang.String r5 = "and.gsa.widget.text"
            r11[r4] = r5
            r4 = 3
            java.lang.String r5 = "and.gsa.widget.logo"
            r11[r4] = r5
            java.lang.String r5 = "and.gsa.launcher.icon"
            java.lang.String r6 = "and.gsa.launcher.shortcut.text"
            java.lang.String r7 = "and.gsa.launcher.shortcut.voice"
            java.lang.String r8 = "and.opa.pixel_launcher.qsb"
            java.lang.String r9 = "and.gsa.launcher.homescreen.appssearch"
            java.lang.String r10 = "and.gsa.launcher.shelf.appssearch"
            com.google.common.b.ij r4 = com.google.common.p4522b.C58528ij.m90015O(r5, r6, r7, r8, r9, r10, r11)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            if (r0 != 0) goto L_0x0078
            if (r2 == 0) goto L_0x0090
        L_0x0078:
            com.google.apps.tiktok.account.AccountId r0 = r12.f363035e
            com.google.android.apps.search.googleapp.accounts.ui.ag r2 = new com.google.android.apps.search.googleapp.accounts.ui.ag
            r2.<init>()
            dagger.hilt.android.internal.managers.C68324h.m98669f(r2)
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r2, r0)
            android.support.v4.app.Fragment r0 = r12.f363032b
            android.support.v4.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.lang.String r3 = "RestrictedAccountLogoutDialogFragment"
            r2.showNow(r0, r3)
        L_0x0090:
            boolean r13 = r13.mo111043c()
            if (r13 == 0) goto L_0x00b7
            com.google.android.apps.search.googleapp.accounts.ui.b.x r13 = r12.f363036f
            com.google.common.util.concurrent.cx r13 = r13.mo111047a(r1)
            java.lang.String r0 = "Failed to reset openAccountMenuOnStart to false"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r13, r0, r1)
            android.support.v4.app.Fragment r13 = r12.f363032b
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r0 = r12.f363037g
            com.google.android.libraries.onegoogle.accountmenu.c.c r13 = com.google.android.libraries.onegoogle.accountmenu.p2353c.C30333c.m56496b(r13, r0)
            com.google.android.apps.search.googleapp.accounts.ui.d.c r0 = r12.f363034d
            r0.mo111051b()
            com.google.android.libraries.onegoogle.accountmenu.c.b r13 = r13.mo35898a()
            r13.mo35896b()
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.accounts.p10126ui.C133186ao.mo20961j(java.lang.Object):void");
    }
}
