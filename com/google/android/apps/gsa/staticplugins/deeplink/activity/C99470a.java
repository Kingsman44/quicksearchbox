package com.google.android.apps.gsa.staticplugins.deeplink.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.permissions.ProxyActivity;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.activity.a */
/* compiled from: PG */
final class C99470a implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ DeeplinkActivity f278353a;

    public C99470a(DeeplinkActivity deeplinkActivity) {
        this.f278353a = deeplinkActivity;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a != C88244um.START_ACTIVITY) {
            int i = serviceEventData.f236959a.f238699b;
            C88244um a2 = C88244um.m142794a(i);
            if (a2 == null) {
                a2 = C88244um.ATTACH_WEBVIEW;
            }
            if (a2 != C88244um.START_ACTIVITY_FOR_RESULT) {
                C88244um a3 = C88244um.m142794a(i);
                if (a3 == null) {
                    a3 = C88244um.ATTACH_WEBVIEW;
                }
                if (a3 == C88244um.HANDLE_DEEPLINK_DONE) {
                    C59071e eVar = DeeplinkActivity.f278340a;
                    this.f278353a.finish();
                    return;
                }
                return;
            }
            DeeplinkActivity deeplinkActivity = this.f278353a;
            Intent intent = (Intent) serviceEventData.mo81912b(Intent.class);
            ((C59052c) ((C59052c) DeeplinkActivity.f278340a.mo56224b()).mo56372aa(19220)).mo56389s("Starting activity for result with intent: %s", intent);
            deeplinkActivity.f278342b.mo65089a(new Intent(deeplinkActivity, ProxyActivity.class).putExtra("android.intent.extra.INTENT", intent).putExtra("receiver", new ResultReceiver() {
                /* access modifiers changed from: protected */
                public final void onReceiveResult(int i, Bundle bundle) {
                    DeeplinkActivity.this.setResult(i, new Intent().putExtras(bundle));
                    DeeplinkActivity.this.finish();
                }
            }));
            return;
        }
        this.f278353a.f278342b.mo65089a((Intent) serviceEventData.mo81912b(Intent.class));
    }
}
