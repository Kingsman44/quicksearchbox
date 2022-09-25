package com.google.android.apps.search.googleapp.collections;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.p10527u.C139761b;
import com.google.android.apps.search.googleapp.p10527u.C139768i;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.search.googleapp.collections.x */
/* compiled from: PG */
public final class C133527x implements C139768i, C139761b {

    /* renamed from: a */
    public final AccountId f363816a;

    /* renamed from: b */
    public final C133514l f363817b;

    /* renamed from: c */
    public final Fragment f363818c;

    /* renamed from: d */
    public final C28310af f363819d;

    /* renamed from: e */
    public final C139680b f363820e;

    /* renamed from: f */
    public final WebConfig f363821f;

    /* renamed from: g */
    public final C38553h f363822g;

    public C133527x(AccountId accountId, C133514l lVar, Fragment fragment, C38553h hVar, C28310af afVar, C139680b bVar, WebConfig webConfig) {
        this.f363816a = accountId;
        this.f363817b = lVar;
        this.f363818c = fragment;
        this.f363822g = hVar;
        this.f363819d = afVar;
        this.f363820e = bVar;
        this.f363821f = webConfig;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C133512j mo111218a() {
        C43264o oVar = (C43264o) this.f363818c.getChildFragmentManager().f634a.mo671c("web-coordinator");
        if (oVar == null) {
            return null;
        }
        return (C133512j) oVar.mo17754z().mo46379a();
    }

    /* renamed from: b */
    public final void mo111219b(C139779t tVar) {
        C133512j a = mo111218a();
        if (a != null) {
            C133521s a2 = a.mo17754z();
            if (tVar == C139779t.COLLECTIONS) {
                a2.f363805j.mo111204a("https://www.google.com/collections");
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo111220c(C139775p pVar) {
    }

    /* renamed from: d */
    public final void mo111221d() {
        C133512j a = mo111218a();
        if (a != null) {
            C133521s a2 = a.mo17754z();
            if (a2.f363809n.equals(C43369n.FAILED) || a2.f363809n.equals(C43369n.CANCELLED)) {
                a2.mo111215e();
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo111222e() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo111223f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo111224g() {
        C43861g gVar;
        C133512j a = mo111218a();
        if (a == null || (gVar = (C43861g) a.mo17754z().f363799d.getChildFragmentManager().f634a.mo671c("WEB_FRAGMENT")) == null) {
            return false;
        }
        return gVar.mo17754z().mo46876d();
    }

    /* renamed from: h */
    public final /* synthetic */ boolean mo111225h() {
        return false;
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo111226i() {
        return true;
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo111227j() {
        return true;
    }
}
