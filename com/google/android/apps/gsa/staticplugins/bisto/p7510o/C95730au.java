package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96502v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.au */
/* compiled from: PG */
final class C95730au implements C96502v {

    /* renamed from: a */
    final /* synthetic */ Uri f268018a;

    /* renamed from: b */
    final /* synthetic */ C95731av f268019b;

    public C95730au(C95731av avVar, Uri uri) {
        this.f268019b = avVar;
        this.f268018a = uri;
    }

    /* renamed from: a */
    public final void mo88859a(ByteBuffer byteBuffer, int i, int i2, boolean z) {
        if (this.f268019b.f268275d == 1 || this.f268019b.f268275d == 2) {
            this.f268019b.mo89785l(this.f268018a, byteBuffer.array(), i, i2);
            return;
        }
        C59104x c = C95731av.f268020e.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LocalMicVoiceInpHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15290)).mo56387q("Unexpected voice input during state %b.", this.f268019b.f268275d);
    }
}
