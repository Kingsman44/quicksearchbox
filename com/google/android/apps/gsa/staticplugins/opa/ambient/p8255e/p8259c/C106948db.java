package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe;
import com.google.protobuf.C63063ga;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.db */
/* compiled from: PG */
public final /* synthetic */ class C106948db implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106948db f297897a = new C106948db();

    private /* synthetic */ C106948db() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63063ga gaVar = (C63063ga) ((Map) obj).get("com.google.android.apps.youtube.music.mediabrowser.user_has_premium_entitlement");
        if (gaVar == null) {
            return C14626qe.STATUS_UNKNOWN;
        }
        if (gaVar.f170181a != 4 || !((Boolean) gaVar.f170182b).booleanValue()) {
            return C14626qe.YOUTUBE_FREE_USER;
        }
        return C14626qe.YOUTUBE_PREMIUM_USER;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
