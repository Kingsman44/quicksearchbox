package com.google.android.apps.search.transcription.p10670f.p10671a.p10672a;

import com.google.android.libraries.search.p2904c.C37344ai;
import com.google.android.libraries.search.p2904c.C37348am;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.transcription.f.a.a.i */
/* compiled from: PG */
final class C141778i implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C141780k.f384746a.mo56225c()).mo56382g(th)).mo56372aa(41919)).mo56386p("Can't release audio focus!");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C59052c cVar = (C59052c) ((C59052c) C141780k.f384746a.mo56224b()).mo56372aa(41920);
        C37344ai a = C37344ai.m66353a(((C37348am) obj).f99208b);
        if (a == null) {
            a = C37344ai.UNKNOWN_RELEASING_STATUS;
        }
        cVar.mo56389s("Audio focus releasing status: %s", a.name());
    }
}
