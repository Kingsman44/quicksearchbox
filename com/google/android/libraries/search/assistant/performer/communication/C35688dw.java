package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import android.net.Uri;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.dw */
/* compiled from: PG */
public final /* synthetic */ class C35688dw implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f93577a;

    /* renamed from: b */
    public final /* synthetic */ String f93578b;

    public /* synthetic */ C35688dw(Intent intent, String str) {
        this.f93577a = intent;
        this.f93578b = str;
    }

    public final Object apply(Object obj) {
        Intent intent = this.f93577a;
        String str = this.f93578b;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) C35710ef.f93613a.mo56225c()).mo56372aa(51703)).mo56386p("Failed to get intent data for 3p calling.");
            return Optional.empty();
        }
        intent.setDataAndType(Uri.parse((String) optional.get()), str);
        return Optional.m71637of(intent);
    }
}
