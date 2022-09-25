package com.google.apps.tiktok.inject.p3654a;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2371bs;
import com.google.android.apps.gsa.binaries.satin.app.C73959bo;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import dagger.hilt.android.internal.p5302a.C68308f;

/* renamed from: com.google.apps.tiktok.inject.a.a */
/* compiled from: PG */
public final class C47183a {

    /* renamed from: a */
    public final C47199g f122840a;

    /* renamed from: b */
    public final C47215a f122841b;

    /* renamed from: com.google.apps.tiktok.inject.a.a$a */
    /* compiled from: PG */
    public interface C47184a {
        /* renamed from: nV */
        C73959bo mo51095nV();
    }

    /* renamed from: com.google.apps.tiktok.inject.a.a$b */
    /* compiled from: PG */
    public interface C47185b {
        /* renamed from: b */
        C68308f mo51096b();
    }

    public C47183a(C47199g gVar, C58833ax axVar, C47215a aVar) {
        this.f122840a = gVar;
        if (axVar.mo56113h()) {
            C58838bb.m90883r(axVar.mo56107c() instanceof ComponentActivity);
        }
        this.f122841b = aVar;
    }

    /* renamed from: a */
    public final C47194c mo51094a(AccountId accountId) {
        Object obj;
        C2368bp bpVar = new C2368bp((C2371bs) this.f122841b, (C2363bk) new C47193b(this, accountId));
        if (accountId == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(accountId.mo50068a());
        }
        return (C47194c) bpVar.mo5771b("tt_activity_account_retained:".concat(obj.toString()), C47194c.class);
    }
}
