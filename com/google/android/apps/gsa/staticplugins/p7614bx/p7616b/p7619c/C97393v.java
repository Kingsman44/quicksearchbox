package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import androidx.annotation.C0826b;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30492e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.v */
/* compiled from: PG */
final class C97393v extends C30282k {

    /* renamed from: a */
    final /* synthetic */ C97359ab f271968a;

    public C97393v(C97359ab abVar) {
        this.f271968a = abVar;
    }

    /* renamed from: a */
    public final void mo18104a() {
        C97359ab abVar = this.f271968a;
        abVar.f271892f.mo28212l("openAccountMenuDialog", new C97377f(abVar));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18106c(Object obj) {
        C58833ax axVar;
        C30492e eVar = (C30492e) obj;
        if (eVar == null) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(eVar.mo36114a());
        }
        if (!((String) axVar.mo56109e(BuildConfig.FLAVOR)).equals(((C58833ax) ((C97369al) this.f271968a.f271888b).f271930a.f63720e).mo56109e(BuildConfig.FLAVOR))) {
            C97359ab.m161115f(axVar, this.f271968a.f271893g);
            if (C22872h.m42744d(C0826b.class)) {
                this.f271968a.f271891e.mo90651m(axVar);
            } else {
                this.f271968a.f271892f.mo28212l("onSelectedAndRecentAccountsChanged", new C97392u(this, axVar));
            }
        }
    }

    /* renamed from: f */
    public final void mo35784f(C58485gu guVar) {
        C97359ab abVar = this.f271968a;
        C97359ab.m161115f((C58833ax) ((C97369al) abVar.f271888b).f271930a.f63720e, abVar.f271893g);
    }
}
