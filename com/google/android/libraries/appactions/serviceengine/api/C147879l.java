package com.google.android.libraries.appactions.serviceengine.api;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.api.l */
/* compiled from: PG */
public final /* synthetic */ class C147879l implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147879l f398927a = new C147879l();

    private /* synthetic */ C147879l() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        switch (((Integer) obj).intValue()) {
            case 1:
                return "aga_gab";
            case 2:
                return "aga_cct";
            case 3:
                return "chrome";
            case 4:
                return "messages";
            case 5:
                return "tasks";
            case 6:
                return "toast";
            case 7:
                return "yt";
            default:
                return "unknown";
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
