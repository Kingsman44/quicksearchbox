package com.google.android.apps.search.transcription.voiceime;

import com.google.android.apps.search.transcription.voiceime.p10680a.C141959b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.concurrent.atomic.DesugarAtomicLong;

/* renamed from: com.google.android.apps.search.transcription.voiceime.ai */
/* compiled from: PG */
final class C141970ai implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f385232a;

    /* renamed from: b */
    final /* synthetic */ C141972ak f385233b;

    public C141970ai(C141972ak akVar, long j) {
        this.f385233b = akVar;
        this.f385232a = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C141972ak.f385237b.mo56225c()).mo56382g(th)).mo56372aa(41975)).mo56386p("Failed to load ProtoDataStore");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        DesugarAtomicLong.getAndUpdate(this.f385233b.f385247l, new C141968ag((C141959b) obj));
        this.f385233b.mo116933c(this.f385232a, C141969ah.f385231a);
    }
}
