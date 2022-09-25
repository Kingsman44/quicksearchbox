package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.t */
/* compiled from: PG */
public final /* synthetic */ class C35774t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C52289mf f93714a;

    public /* synthetic */ C35774t(C52289mf mfVar) {
        this.f93714a = mfVar;
    }

    public final Object apply(Object obj) {
        return (Intent) ((Optional) obj).orElseThrow(new C35769o(this.f93714a));
    }
}
