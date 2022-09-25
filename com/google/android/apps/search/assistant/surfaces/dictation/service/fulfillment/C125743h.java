package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125697d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125702i;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.h */
/* compiled from: PG */
public final /* synthetic */ class C125743h implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C125702i f346544a;

    public /* synthetic */ C125743h(C125702i iVar) {
        this.f346544a = iVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C125702i iVar = this.f346544a;
        String str = (String) obj;
        C125708c cVar = (C125708c) obj2;
        C69664n.m101061g(str, "text");
        C69664n.m101061g(cVar, "context");
        return C71663i.m104688a(C71803m.m105042c(iVar.f346455c, (C69585o) null, (C71424ay) null, new C125697d(iVar, str, cVar, (C69577g) null), 3));
    }
}
