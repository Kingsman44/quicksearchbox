package com.google.android.libraries.p11016ak.p11019c.p11021b;

import android.speech.tts.TextToSpeech;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.ak.c.b.g */
/* compiled from: PG */
public final /* synthetic */ class C147659g implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C147659g f398514a = new C147659g();

    private /* synthetic */ C147659g() {
    }

    public final Object apply(Object obj) {
        return C58485gu.m89842j((Collection) Collection.EL.stream(((TextToSpeech) obj).getVoices()).filter(C147661i.f398516a).collect(Collectors.toList()));
    }
}
