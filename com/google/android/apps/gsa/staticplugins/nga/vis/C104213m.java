package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.service.voice.VoiceInteractionSession;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.m */
/* compiled from: PG */
public final /* synthetic */ class C104213m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C104213m f289884a = new C104213m();

    private /* synthetic */ C104213m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((VoiceInteractionSession.ActivityId) obj).hashCode());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
