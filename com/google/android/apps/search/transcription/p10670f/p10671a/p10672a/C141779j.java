package com.google.android.apps.search.transcription.p10670f.p10671a.p10672a;

import com.google.android.libraries.search.p2904c.C37338ac;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.transcription.f.a.a.j */
/* compiled from: PG */
final class C141779j implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C141780k.f384746a.mo56225c()).mo56382g(th)).mo56372aa(41921)).mo56386p("Can't acquire audio focus!");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C59052c cVar = (C59052c) ((C59052c) C141780k.f384746a.mo56224b()).mo56372aa(41922);
        C37341af a = C37341af.m66350a(((C37338ac) obj).f99179b);
        if (a == null) {
            a = C37341af.UNKNOWN_ACQUIRING_STATUS;
        }
        cVar.mo56389s("Audio focus acquiring status: %s", a.name());
    }
}
