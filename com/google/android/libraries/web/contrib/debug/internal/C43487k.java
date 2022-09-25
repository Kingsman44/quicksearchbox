package com.google.android.libraries.web.contrib.debug.internal;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.k */
/* compiled from: PG */
public final /* synthetic */ class C43487k implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f113589a;

    public /* synthetic */ C43487k(Map map) {
        this.f113589a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map map = this.f113589a;
        C43501y yVar = (C43501y) obj;
        if ((yVar.mo46564c().f113328a & 64) == 0) {
            return BuildConfig.FLAVOR;
        }
        C43367l lVar = yVar.mo46564c().f113335h;
        if (lVar == null) {
            lVar = C43367l.f113293h;
        }
        String b = C43489m.m76739b(lVar.f113296b, map, "URL");
        C43367l lVar2 = yVar.mo46564c().f113335h;
        if (lVar2 == null) {
            lVar2 = C43367l.f113293h;
        }
        String b2 = C43489m.m76739b(lVar2.f113297c, map, "URL");
        C43367l lVar3 = yVar.mo46564c().f113335h;
        if (lVar3 == null) {
            lVar3 = C43367l.f113293h;
        }
        C43366k a = C43366k.m76517a(lVar3.f113299e);
        if (a == null) {
            a = C43366k.UNSPECIFIED;
        }
        String name = a.name();
        return "{current_url:" + b + " original_url:" + b2 + " trigger_type:" + name + "}";
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
