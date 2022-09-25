package com.google.android.apps.search.googleapp.customtabs.features.appactions;

import android.support.p031v4.app.C0154a;
import com.google.android.libraries.appactions.serviceengine.api.ExecutionAccessor;
import com.google.android.libraries.appactions.serviceengine.impl.C147915h;
import com.google.android.libraries.appactions.serviceengine.impl.ExecutionAccessorImpl;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63063ga;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.appactions.b */
/* compiled from: PG */
public final class C133782b implements C45987ay {

    /* renamed from: a */
    private static final C59071e f364408a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.appactions.b");

    /* renamed from: b */
    private final AppActionExecutionActivity f364409b;

    /* renamed from: c */
    private final C133790i f364410c;

    public C133782b(AppActionExecutionActivity appActionExecutionActivity, C45989b bVar, C133790i iVar) {
        this.f364409b = appActionExecutionActivity;
        this.f364410c = iVar;
        bVar.mo50082e(this);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        ExecutionAccessorImpl executionAccessorImpl;
        C133790i iVar = this.f364410c;
        ExecutionAccessor.ParcelablePart parcelablePart = (ExecutionAccessor.ParcelablePart) this.f364409b.getIntent().getParcelableExtra("com.google.android.googlequicksearchbox.customtabs.appactions.EXECUTION_ACCESSOR");
        if (parcelablePart == null) {
            executionAccessorImpl = null;
        } else {
            C147915h hVar = iVar.f364424a;
            if (parcelablePart instanceof ExecutionAccessorImpl.ImplParcelablePart) {
                ExecutionAccessorImpl.ImplParcelablePart implParcelablePart = (ExecutionAccessorImpl.ImplParcelablePart) parcelablePart;
                executionAccessorImpl = hVar.f398992b.a(implParcelablePart.f398947a);
                executionAccessorImpl.f398943b.clear();
                for (int i = 0; i < implParcelablePart.f398948b.size(); i++) {
                    executionAccessorImpl.f398943b.put(implParcelablePart.f398948b.keyAt(i), (C63063ga) implParcelablePart.f398948b.valueAt(i));
                }
            } else {
                throw new IllegalArgumentException("Input parcelable not created by service engine.");
            }
        }
        if (executionAccessorImpl == null) {
            ((C59052c) ((C59052c) f364408a.mo56225c()).mo56372aa(40128)).mo56386p("No execution passed into AppActionExecutionActivity.");
            this.f364409b.finish();
            return;
        }
        AccountId accountId = awVar.f120815a.f120816a;
        C133786f fVar = new C133786f();
        C68324h.m98669f(fVar);
        C47247a.m84047b(fVar, accountId);
        C0154a aVar = new C0154a(this.f364409b.f727a.f739a.f744e);
        aVar.mo689v(16908290, fVar, "APP_ACTION_EXECUTION_FRAGMENT");
        aVar.mo509f();
        C133787g a = fVar.mo17754z();
        C46439e eVar = a.f364418d;
        C133806y yVar = a.f364419e;
        yVar.f364453c.mo111401c(C37182a.f98140hA.mo40779c(), "aga_cct");
        C60870cx a2 = executionAccessorImpl.mo124528a();
        C60856cj.m92911t(a2, C47810es.m84974n(yVar.f364457g), yVar.f364454d);
        eVar.mo50428h(new C46438d(C60922j.m93044g(a2, C47810es.m84963c(C133803v.f364448a), yVar.f364454d)).f121541a, (Object) null, a.f364421g);
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f364408a.mo56225c()).mo56382g(th)).mo56372aa(40129)).mo56386p("#onAccountError");
        this.f364409b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
