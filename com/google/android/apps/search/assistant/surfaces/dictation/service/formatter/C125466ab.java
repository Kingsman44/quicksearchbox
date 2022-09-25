package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.nga.engine.dictation.C75369t;
import com.google.android.apps.gsa.nga.engine.dictation.q;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71001ba;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71002bb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.ab */
/* compiled from: PG */
public final /* synthetic */ class C125466ab implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C125466ab f345999a = new C125466ab();

    private /* synthetic */ C125466ab() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        q qVar = (q) obj;
        C59071e eVar = C125470af.f346003a;
        C71001ba baVar = (C71001ba) C71002bb.f189353d.createBuilder();
        int a = C75369t.m121810a(qVar.b);
        if (a == 0) {
            a = 1;
        }
        baVar.copyOnWrite();
        C71002bb bbVar = (C71002bb) baVar.instance;
        bbVar.f189356b = a - 1;
        bbVar.f189355a |= 1;
        int i = qVar.a;
        baVar.copyOnWrite();
        C71002bb bbVar2 = (C71002bb) baVar.instance;
        bbVar2.f189355a |= 2;
        bbVar2.f189357c = i;
        return (C71002bb) baVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
