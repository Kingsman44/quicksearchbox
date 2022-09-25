package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.service.voice.VoiceInteractionSession;
import com.google.android.libraries.assistant.p1484g.p1502d.C18158aj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.n */
/* compiled from: PG */
public final /* synthetic */ class C104214n implements Function {

    /* renamed from: a */
    public final /* synthetic */ C104196ao f289885a;

    public /* synthetic */ C104214n(C104196ao aoVar) {
        this.f289885a = aoVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return new C18158aj((VoiceInteractionSession.ActivityId) obj, this.f289885a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
