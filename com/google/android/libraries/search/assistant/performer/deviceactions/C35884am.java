package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.am */
/* compiled from: PG */
public final /* synthetic */ class C35884am implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f94008a;

    public /* synthetic */ C35884am(String str) {
        this.f94008a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f94008a;
        C59104x c = C35887ap.f94011a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "WellbeingPerformer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(51836)).mo56389s("Error calling Sunshine ContentResolver API: %s", str);
        return Optional.empty();
    }
}
