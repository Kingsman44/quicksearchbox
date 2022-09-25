package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.C29690f;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.ai */
/* compiled from: PG */
public final /* synthetic */ class C122161ai implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122165am f338830a;

    /* renamed from: b */
    public final /* synthetic */ Locale f338831b;

    public /* synthetic */ C122161ai(C122165am amVar, Locale locale) {
        this.f338830a = amVar;
        this.f338831b = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f338830a.mo105556i((C29690f) obj, this.f338831b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
