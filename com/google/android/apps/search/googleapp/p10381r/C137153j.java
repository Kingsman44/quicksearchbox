package com.google.android.apps.search.googleapp.p10381r;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.p10527u.C139761b;
import com.google.android.apps.search.googleapp.p10527u.C139768i;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.search.googleapp.r.j */
/* compiled from: PG */
public final class C137153j implements C139761b, C139768i {

    /* renamed from: a */
    public final C137152i f373203a;

    /* renamed from: b */
    public final AccountId f373204b;

    public C137153j(C137152i iVar, AccountId accountId) {
        this.f373203a = iVar;
        this.f373204b = accountId;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo111219b(C139779t tVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo111220c(C139775p pVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo111221d() {
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
        Fragment c = this.f373203a.getChildFragmentManager().f634a.mo671c("SIGNED_OUT_SEARCH_CUSTOMIZATION");
        if (c == null) {
            return false;
        }
        C0154a aVar = new C0154a(this.f373203a.getChildFragmentManager());
        aVar.mo516m(c);
        aVar.mo509f();
        return true;
    }

    /* renamed from: h */
    public final /* synthetic */ boolean mo111225h() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo111226i() {
        return false;
    }

    /* renamed from: j */
    public final boolean mo111227j() {
        return false;
    }
}
