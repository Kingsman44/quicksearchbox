package com.google.android.libraries.web.contrib.debug.internal;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* compiled from: PG */
public final class DebugWebFragmentObserver implements C43773b {

    /* renamed from: a */
    private final Fragment f113568a;

    /* renamed from: b */
    private final AccountId f113569b;

    /* renamed from: c */
    private final C43269t f113570c;

    /* renamed from: d */
    private final WebModelProvider f113571d;

    public DebugWebFragmentObserver(Fragment fragment, AccountId accountId, C43269t tVar, WebModelProvider webModelProvider) {
        this.f113568a = fragment;
        this.f113569b = accountId;
        this.f113571d = webModelProvider;
        this.f113570c = tVar;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f113571d.mo47072a(C43492p.class);
        if (((DebugFeatureContract) this.f113570c.mo46384b().mo46298a(DebugFeatureContract.class)).mo46545f() && this.f113568a.getChildFragmentManager().f634a.mo671c("dumping_fragment") == null) {
            C0154a aVar = new C0154a(this.f113568a.getChildFragmentManager());
            AccountId accountId = this.f113569b;
            C43494r rVar = new C43494r();
            C68324h.m98669f(rVar);
            C47247a.m84047b(rVar, accountId);
            aVar.mo685r(rVar, "dumping_fragment");
            aVar.mo509f();
        }
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
