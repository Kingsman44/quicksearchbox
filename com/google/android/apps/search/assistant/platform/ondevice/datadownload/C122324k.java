package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.C29690f;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.k */
/* compiled from: PG */
public final /* synthetic */ class C122324k implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122165am f339190a;

    /* renamed from: b */
    public final /* synthetic */ Locale f339191b;

    public /* synthetic */ C122324k(C122165am amVar, Locale locale) {
        this.f339190a = amVar;
        this.f339191b = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f339190a.mo105557j((C29690f) obj, this.f339191b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
