package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ek */
/* compiled from: PG */
public final /* synthetic */ class C35715ek implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f93618a;

    public /* synthetic */ C35715ek(String str) {
        this.f93618a = str;
    }

    public final Object apply(Object obj) {
        return (Intent) ((Optional) obj).orElseThrow(new C35719eo(this.f93618a));
    }
}
