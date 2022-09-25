package com.google.android.libraries.web.postmessage.internal;

import com.google.apps.tiktok.concurrent.C46459k;
import org.json.JSONObject;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.postmessage.internal.r */
/* compiled from: PG */
public final /* synthetic */ class C43971r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43976w f114470a;

    public /* synthetic */ C43971r(C43976w wVar) {
        this.f114470a = wVar;
    }

    public final void accept(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        C43968o g = this.f114470a.mo46971g();
        if (g != null) {
            C46459k.m82829b(g.mo46960a(jSONObject.toString()), "Failed to send message to JS", new Object[0]);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
