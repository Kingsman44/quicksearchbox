package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.C125522a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125689v;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125691x;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.g */
/* compiled from: PG */
public final /* synthetic */ class C125742g implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C125522a f346543a;

    public /* synthetic */ C125742g(C125522a aVar) {
        this.f346543a = aVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C125522a aVar = this.f346543a;
        String str = (String) obj;
        C125708c cVar = (C125708c) obj2;
        C69664n.m101061g(str, "text");
        C69664n.m101061g(cVar, "context");
        C125691x xVar = (C125691x) aVar;
        return C71663i.m104688a(C71803m.m105042c(xVar.f346426c, (C69585o) null, (C71424ay) null, new C125689v(str, xVar, cVar, (C69577g) null), 3));
    }
}
