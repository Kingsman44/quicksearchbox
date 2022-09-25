package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.util.concurrent.C60856cj;
import java.util.Locale;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.ak */
/* compiled from: PG */
public final /* synthetic */ class C122163ak implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122165am f338833a;

    /* renamed from: b */
    public final /* synthetic */ Locale f338834b;

    public /* synthetic */ C122163ak(C122165am amVar, Locale locale) {
        this.f338833a = amVar;
        this.f338834b = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122165am amVar = this.f338833a;
        Locale locale = this.f338834b;
        C29690f fVar = (C29690f) obj;
        C29689e a = C29689e.m54781a(fVar.f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        return a.equals(C29689e.PENDING) ? C60856cj.m92900i(Optional.m71637of(fVar)) : amVar.mo105556i(fVar, locale);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
