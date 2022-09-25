package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9851a;

import com.google.common.p4526f.C59071e;
import java.util.Map;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.a.e */
/* compiled from: PG */
public final /* synthetic */ class C129813e implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ String f356184a;

    public /* synthetic */ C129813e(String str) {
        this.f356184a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f356184a;
        Map map = (Map) obj;
        C59071e eVar = C129817i.f356194a;
        map.remove(str);
        return map;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
