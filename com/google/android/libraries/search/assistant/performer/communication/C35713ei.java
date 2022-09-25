package com.google.android.libraries.search.assistant.performer.communication;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.assistant.p3897e.p3921j.apn;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ei */
/* compiled from: PG */
public final /* synthetic */ class C35713ei implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ apn f93616a;

    public /* synthetic */ C35713ei(apn apn) {
        this.f93616a = apn;
    }

    public final Object get() {
        C52374pj pjVar = this.f93616a.f135565a;
        if (pjVar == null) {
            pjVar = C52374pj.f137434e;
        }
        return new C35471g("Failed to start 3p video call with".concat(String.valueOf(pjVar.f137437b == 2 ? (String) pjVar.f137438c : BuildConfig.FLAVOR)));
    }
}
