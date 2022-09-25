package com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10187b.C134267a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import java.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.c.d */
/* compiled from: PG */
public final /* synthetic */ class C134272d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C134279k f365772a;

    /* renamed from: b */
    public final /* synthetic */ C134267a f365773b;

    /* renamed from: c */
    public final /* synthetic */ StringBuffer f365774c;

    public /* synthetic */ C134272d(C134279k kVar, C134267a aVar, StringBuffer stringBuffer) {
        this.f365772a = kVar;
        this.f365773b = aVar;
        this.f365774c = stringBuffer;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C134279k kVar = this.f365772a;
        C134267a aVar = this.f365773b;
        StringBuffer stringBuffer = this.f365774c;
        Map.Entry entry = (Map.Entry) obj;
        C47633f g = C47633f.m84733g(((C134269a) entry.getValue()).mo111527a());
        Objects.requireNonNull(aVar);
        C47633f e = g.mo51515h(new C134274f(aVar), kVar.f365783b).mo51513e(Exception.class, new C134275g(entry), kVar.f365783b);
        Objects.requireNonNull(stringBuffer);
        return e.mo51515h(new C134276h(stringBuffer), kVar.f365783b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
