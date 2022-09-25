package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9851a;

import com.google.common.p4526f.C59071e;
import java.util.Map;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.a.f */
/* compiled from: PG */
public final /* synthetic */ class C129814f implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ String f356185a;

    public /* synthetic */ C129814f(String str) {
        this.f356185a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f356185a;
        Map map = (Map) obj;
        C59071e eVar = C129817i.f356194a;
        if (((C129816h) map.get(str)) != null) {
            map.remove(str);
        }
        return map;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
