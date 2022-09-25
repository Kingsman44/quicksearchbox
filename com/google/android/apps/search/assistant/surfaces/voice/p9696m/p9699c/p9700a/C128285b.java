package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9699c.p9700a;

import android.content.Intent;
import com.google.android.libraries.search.assistant.invocation.p2587a.p2588a.C33484b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C128285b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f352851a;

    public /* synthetic */ C128285b(Intent intent) {
        this.f352851a = intent;
    }

    public final Object apply(Object obj) {
        Intent intent = this.f352851a;
        C59104x c = C128286c.f352852a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "tngMaVisIntentStarter");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((C33484b) obj)).mo56372aa(37842)).mo56389s("Failed to start voice activity for intent: %s", intent);
        return false;
    }
}
