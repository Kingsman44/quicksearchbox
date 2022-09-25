package com.google.android.libraries.kids.platform.kidonboarding;

import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4109av.p4114c.p4115a.p4116a.C54618k;
import com.google.protobuf.C62921ba;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.d */
/* compiled from: PG */
public final class C24047d implements C45987ay {

    /* renamed from: a */
    public static final C59071e f65713a = C59071e.m91331h();

    /* renamed from: b */
    public final KidOnboardingActivity f65714b;

    /* renamed from: c */
    public final C62921ba f65715c;

    /* renamed from: d */
    public C54618k f65716d;

    /* renamed from: e */
    private final C45989b f65717e;

    public C24047d(C45989b bVar, KidOnboardingActivity kidOnboardingActivity, C62921ba baVar) {
        C69664n.m101061g(bVar, "accountController");
        C69664n.m101061g(baVar, "extensionRegistryLite");
        this.f65717e = bVar;
        this.f65714b = kidOnboardingActivity;
        this.f65715c = baVar;
        bVar.mo50082e(this);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C0154a aVar = new C0154a(this.f65714b.f727a.f739a.f744e);
        AccountId accountId = awVar.f120815a.f120816a;
        C54618k kVar = this.f65716d;
        C24052i iVar = new C24052i();
        C68324h.m98669f(iVar);
        C47247a.m84047b(iVar, accountId);
        C47243l.m84039a(iVar, kVar);
        aVar.mo689v(R.id.kid_creation_fragment, iVar, (String) null);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C69664n.m101061g(th, "error");
        C59052c cVar = (C59052c) ((C59052c) f65713a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(48701));
        cVar.mo56386p("Missing valid account ID.");
        KidOnboardingActivity kidOnboardingActivity = this.f65714b;
        kidOnboardingActivity.setResult(0);
        kidOnboardingActivity.finish();
    }

    /* renamed from: c */
    public final void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
