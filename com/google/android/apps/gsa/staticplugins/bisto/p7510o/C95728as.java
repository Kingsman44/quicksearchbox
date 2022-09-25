package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.apps.gsa.staticplugins.bisto.util.C96502v;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.as */
/* compiled from: PG */
final class C95728as implements C96502v {

    /* renamed from: a */
    final /* synthetic */ C95729at f268012a;

    public C95728as(C95729at atVar) {
        this.f268012a = atVar;
    }

    /* renamed from: a */
    public final void mo88859a(ByteBuffer byteBuffer, int i, int i2, boolean z) {
        if (!this.f268012a.mo89685G()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C95723an h = this.f268012a.mo89690h();
        if (h == null) {
            C59104x c = C95729at.f268013l.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LclMicExtVoiceInHandler");
            ((C59052c) ((C59052c) c).mo56372aa(15270)).mo56386p("audio data received when there is no active voice session");
            return;
        }
        this.f268012a.mo89697w(new C95727ar(this, byteBuffer, i, i2, h.f267981c.get(), h));
    }
}
