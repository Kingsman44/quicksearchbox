package com.google.android.libraries.p11016ak.p11019c.p11021b;

import android.speech.tts.UtteranceProgressListener;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.ak.c.b.z */
/* compiled from: PG */
final class C147678z extends UtteranceProgressListener {

    /* renamed from: a */
    public static final /* synthetic */ int f398544a = 0;

    /* renamed from: b */
    private static final C59071e f398545b = C59071e.m91332i("com.google.android.libraries.ak.c.b.z");

    /* renamed from: c */
    private final C58817ah f398546c;

    public C147678z(C58817ah ahVar) {
        this.f398546c = ahVar;
    }

    /* renamed from: a */
    private final void m240746a(String str, Consumer consumer) {
        C147650ad adVar = (C147650ad) this.f398546c.apply(str);
        if (adVar != null) {
            consumer.accept(adVar);
        }
    }

    public final void onAudioAvailable(String str, byte[] bArr) {
        m240746a(str, new C147675w(bArr));
    }

    public final void onDone(String str) {
        ((C59052c) ((C59052c) f398545b.mo56224b()).mo56372aa(50528)).mo56389s("TTS Done for utterance '%s'", str);
        m240746a(str, new C147677y(str));
    }

    public final void onError(String str) {
        onError(str, 0);
    }

    public final void onRangeStart(String str, int i, int i2, int i3) {
        m240746a(str, new C147674v(i2, i3, i));
    }

    public final void onStart(String str) {
        ((C59052c) ((C59052c) f398545b.mo56224b()).mo56372aa(50530)).mo56389s("TTS Started for utterance '%s'", str);
    }

    public final void onError(String str, int i) {
        ((C59052c) ((C59052c) f398545b.mo56225c()).mo56372aa(50529)).mo56352E("TTS error for utterance '%s. Code: %s", str, i);
        m240746a(str, new C147676x(i));
    }
}
