package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.C29690f;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.ao */
/* compiled from: PG */
public final /* synthetic */ class C122167ao implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122167ao f338848a = new C122167ao();

    private /* synthetic */ C122167ao() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Long.valueOf(Collection.EL.stream(((C29690f) obj).f80416g).mapToLong(C122170ar.f338853a).sum());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
