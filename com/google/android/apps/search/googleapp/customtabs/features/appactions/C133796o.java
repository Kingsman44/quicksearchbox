package com.google.android.apps.search.googleapp.customtabs.features.appactions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.google.android.apps.search.googleapp.customtabs.features.appactions.p10158a.C133780e;
import com.google.android.apps.search.googleapp.customtabs.features.appactions.p10158a.C133781f;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133731q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.appactions.serviceengine.api.ExecutionAccessor;
import com.google.android.libraries.appactions.serviceengine.impl.ExecutionAccessorImpl;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.search.logging.p3042e.C39190a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.appactions.o */
/* compiled from: PG */
public final /* synthetic */ class C133796o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133798q f364432a;

    public /* synthetic */ C133796o(C133798q qVar) {
        this.f364432a = qVar;
    }

    public final C60870cx apply(Object obj) {
        C133798q qVar = this.f364432a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60866ct.f164955a;
        }
        C133780e eVar = (C133780e) optional.get();
        qVar.f364437e.mo41592d(new C58759qy(C39190a.CCT_INSTACART_CHIP));
        if (qVar.f364434b) {
            return C60866ct.f164955a;
        }
        C133731q qVar2 = qVar.f364439g;
        RemoteViews remoteViews = eVar.f364399a;
        int[] iArr = {R.id.googleapp_app_actions_bottombar_button};
        C133781f fVar = eVar.f364400b;
        Context context = fVar.f364403b;
        AccountId accountId = fVar.f364404c;
        ExecutionAccessor a = eVar.f364401c.mo124572a();
        Intent intent = new Intent(context, AppActionExecutionActivity.class);
        C45963aa.m82131a(intent, accountId);
        ExecutionAccessorImpl executionAccessorImpl = (ExecutionAccessorImpl) a;
        intent.putExtra("com.google.android.googlequicksearchbox.customtabs.appactions.EXECUTION_ACCESSOR", new ExecutionAccessorImpl.ImplParcelablePart(executionAccessorImpl.f398942a, executionAccessorImpl.f398943b));
        PendingIntent activity = PendingIntent.getActivity(context, 0, C147798a.m240896b(intent, 201326592, 0), 201326592);
        C58893dc.m90996a(activity);
        return qVar2.mo111362e(remoteViews, iArr, activity);
    }
}
