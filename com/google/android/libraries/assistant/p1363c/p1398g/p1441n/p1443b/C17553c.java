package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import android.content.Context;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.c */
/* compiled from: PG */
public final /* synthetic */ class C17553c implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Context f50606a;

    public /* synthetic */ C17553c(Context context) {
        this.f50606a = context;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Context context = this.f50606a;
        Optional empty = Optional.empty();
        try {
            return Optional.m71637of(File.createTempFile("textToSpeech", ".wav", context.getCacheDir()));
        } catch (IOException e) {
            C59104x c = C17565o.f50627a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(42784)).mo56386p("Failed to create the temporary file.");
            return empty;
        }
    }
}
