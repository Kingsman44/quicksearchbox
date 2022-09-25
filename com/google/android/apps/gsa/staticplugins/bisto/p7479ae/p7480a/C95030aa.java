package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.android.libraries.search.p2904c.p2907ab.C37334a;
import com.google.android.libraries.search.p2904c.p2907ab.C37336c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.aa */
/* compiled from: PG */
final class C95030aa extends C95034ae {

    /* renamed from: a */
    final /* synthetic */ C95038ai f265869a;

    public C95030aa(C95038ai aiVar) {
        this.f265869a = aiVar;
    }

    /* renamed from: a */
    public final void mo88946a(byte[] bArr) {
        this.f265869a.mo88957j(bArr);
    }

    /* renamed from: c */
    public final C37336c mo88949c(boolean z) {
        C59104x c = C95038ai.f265878a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VoiceInputManager");
        ((C59052c) ((C59052c) c).mo56372aa(18147)).mo56386p("getWriteableAudioBufferData in ACTIVE");
        C37336c cVar = this.f265869a.f265886i;
        cVar.getClass();
        C37336c f = C95038ai.m156960f(((C37334a) cVar).f99173a);
        this.f265869a.f265886i = f;
        return f;
    }

    /* renamed from: d */
    public final C60870cx mo88950d(boolean z) {
        if (z) {
            this.f265869a.f265881d.mo88997c();
        }
        this.f265869a.mo88956i("CLOSING");
        return this.f265869a.f265885h.mo88950d(false);
    }

    /* renamed from: e */
    public final void mo88948e() {
        this.f265869a.mo88956i("CLOSED");
    }

    /* renamed from: f */
    public final String mo88951f() {
        return "ACTIVE";
    }
}
