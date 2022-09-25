package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.e */
/* compiled from: PG */
public final /* synthetic */ class C122555e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C122563m f339684a;

    /* renamed from: b */
    public final /* synthetic */ C122093b f339685b;

    public /* synthetic */ C122555e(C122563m mVar, C122093b bVar) {
        this.f339684a = mVar;
        this.f339685b = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C122563m mVar = this.f339684a;
        C122093b bVar = this.f339685b;
        String str = bVar.f338732b;
        int i = bVar.f338733c;
        if (mVar.f339710g) {
            return C60856cj.m92899h(new C122872ec("InStreamContextFetcher", "Request for a context when the stream has ended."));
        }
        return C2169h.m6027a(new C122551a(mVar, bVar));
    }
}
