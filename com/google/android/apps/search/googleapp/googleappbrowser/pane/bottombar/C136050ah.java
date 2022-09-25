package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.view.View;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.C135674p;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10308a.C136039a;
import com.google.android.apps.search.googleapp.promomanager.p10377f.p10379b.C137105g;
import com.google.apps.tiktok.inject.C47231d;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.ah */
/* compiled from: PG */
final class C136050ah implements C136039a {

    /* renamed from: a */
    final /* synthetic */ C136053ak f370510a;

    public C136050ah(C136053ak akVar) {
        this.f370510a = akVar;
    }

    /* renamed from: c */
    private final void m220945c() {
        C136070b bVar;
        C137105g gVar;
        C136108z zVar = this.f370510a.f370514b;
        if (zVar != null && zVar.isAdded() && (bVar = (C136070b) zVar.getChildFragmentManager().f634a.mo671c("DefaultBottomBar")) != null) {
            for (C136043aa aaVar : bVar.mo17754z().f370640d) {
                if (aaVar instanceof C47231d) {
                    Object z = ((C47231d) aaVar).mo17754z();
                    if ((z instanceof C135674p) && (gVar = ((C135674p) z).f369553h) != null) {
                        gVar.mo113524b();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo112532a(View view, float f) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo112533b(View view, int i) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo112536e(View view) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo112537f(View view) {
    }

    /* renamed from: g */
    public final void mo112538g(View view) {
        m220945c();
    }

    /* renamed from: h */
    public final void mo112539h(View view) {
        m220945c();
    }

    /* renamed from: i */
    public final /* synthetic */ void mo112540i(View view) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo112541j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo112542k(View view) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo112543l(View view) {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo112544m(View view) {
    }

    /* renamed from: n */
    public final /* synthetic */ void mo112545n(View view) {
    }

    /* renamed from: o */
    public final /* synthetic */ void mo112546o(View view) {
    }

    /* renamed from: p */
    public final /* synthetic */ void mo112547p(float f) {
    }

    /* renamed from: q */
    public final /* synthetic */ void mo112548q(float f) {
    }

    /* renamed from: r */
    public final /* synthetic */ void mo112549r(float f) {
    }

    /* renamed from: s */
    public final /* synthetic */ void mo112550s(float f) {
    }

    /* renamed from: t */
    public final /* synthetic */ void mo112551t() {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo112552u() {
    }
}
