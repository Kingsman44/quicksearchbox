package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.bq */
/* compiled from: PG */
public final /* synthetic */ class C35921bq implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f94075a;

    public /* synthetic */ C35921bq(Intent intent) {
        this.f94075a = intent;
    }

    public final Object apply(Object obj) {
        ((C59052c) ((C59052c) ((C59052c) C35922br.f94076a.mo56225c()).mo56382g((Exception) obj)).mo56372aa(51854)).mo56389s("Unable to open url: startActivity failed for intent: %s", this.f94075a);
        return C36180b.m64579c(C52235kf.UNKNOWN, "Unable to open url.");
    }
}
