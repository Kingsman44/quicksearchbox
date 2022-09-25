package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import com.google.assistant.p3897e.p3921j.apn;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.eh */
/* compiled from: PG */
public final /* synthetic */ class C35712eh implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ apn f93615a;

    public /* synthetic */ C35712eh(apn apn) {
        this.f93615a = apn;
    }

    public final Object apply(Object obj) {
        return (Intent) ((Optional) obj).orElseThrow(new C35713ei(this.f93615a));
    }
}
