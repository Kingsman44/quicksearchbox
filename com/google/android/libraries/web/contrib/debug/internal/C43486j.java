package com.google.android.libraries.web.contrib.debug.internal;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.j */
/* compiled from: PG */
public final /* synthetic */ class C43486j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C43486j f113588a = new C43486j();

    private /* synthetic */ C43486j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C43501y yVar = (C43501y) obj;
        if ((yVar.mo46564c().f113328a & 4) == 0) {
            return BuildConfig.FLAVOR;
        }
        C43363h hVar = yVar.mo46564c().f113331d;
        if (hVar == null) {
            hVar = C43363h.f113275f;
        }
        C43362g a = C43362g.m76515a(hVar.f113278b);
        if (a == null) {
            a = C43362g.UNSPECIFIED;
        }
        String name = a.name();
        C43363h hVar2 = yVar.mo46564c().f113331d;
        if (hVar2 == null) {
            hVar2 = C43363h.f113275f;
        }
        String str = hVar2.f113279c;
        return "{type:" + name + " description:" + str + "}";
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
