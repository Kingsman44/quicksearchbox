package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59052c;
import p001a.p014d.p015a.p016a.C0063h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.dt */
/* compiled from: PG */
public final /* synthetic */ class C123393dt implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C123393dt f341154a = new C123393dt();

    private /* synthetic */ C123393dt() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C0063h hVar = (C0063h) obj;
        if (hVar.f170a == 2 && !((String) hVar.f171b).isEmpty()) {
            ((C59052c) ((C59052c) TeleportQueryCleanerImpl.f341027a.mo56225c()).mo56372aa(35015)).mo56389s("Could not cleanup query: %s", hVar.f170a == 2 ? (String) hVar.f171b : BuildConfig.FLAVOR);
            return BuildConfig.FLAVOR;
        } else if (hVar.f170a == 1) {
            return (String) hVar.f171b;
        } else {
            return BuildConfig.FLAVOR;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
