package com.google.android.libraries.search.p2904c.p2952o.p2957d.p2958a;

import android.media.AudioRecordingConfiguration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.c.o.d.a.c */
/* compiled from: PG */
public final /* synthetic */ class C37921c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C37921c f100519a = new C37921c();

    private /* synthetic */ C37921c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((AudioRecordingConfiguration) obj).getClientAudioSessionId());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
