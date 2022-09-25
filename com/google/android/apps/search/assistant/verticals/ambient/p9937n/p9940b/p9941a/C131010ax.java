package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.assistant.p3886c.p3887a.C50665a;
import com.google.assistant.p3886c.p3887a.C50666b;
import com.google.assistant.p3886c.p3887a.C50667c;
import com.google.assistant.p3886c.p3887a.C50668d;
import com.google.assistant.p3886c.p3887a.C50669e;
import com.google.assistant.p3886c.p3887a.C50670f;
import com.google.assistant.p3886c.p3887a.C50672h;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.ax */
/* compiled from: PG */
public final /* synthetic */ class C131010ax implements Function {

    /* renamed from: a */
    public final /* synthetic */ C50672h f358409a;

    public /* synthetic */ C131010ax(C50672h hVar) {
        this.f358409a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C50672h hVar = this.f358409a;
        Map.Entry entry = (Map.Entry) obj;
        Duration duration = C131043cc.f358455a;
        C50667c cVar = (C50667c) ((C50668d) entry.getValue()).toBuilder();
        if (((C50668d) cVar.instance).f131809h > 1) {
            cVar.copyOnWrite();
            C50668d dVar = (C50668d) cVar.instance;
            dVar.f131802a |= 64;
            dVar.f131809h = 1;
        }
        if (((C50668d) cVar.instance).f131807f > 1) {
            cVar.copyOnWrite();
            C50668d dVar2 = (C50668d) cVar.instance;
            dVar2.f131802a |= 16;
            dVar2.f131807f = 1;
        }
        if (((C50668d) cVar.instance).f131810i > 1) {
            cVar.copyOnWrite();
            C50668d dVar3 = (C50668d) cVar.instance;
            dVar3.f131802a |= 128;
            dVar3.f131810i = 1;
        }
        if (((C50668d) cVar.instance).f131808g > 1) {
            cVar.copyOnWrite();
            C50668d dVar4 = (C50668d) cVar.instance;
            dVar4.f131802a |= 32;
            dVar4.f131808g = 1;
        }
        C50665a aVar = (C50665a) C50666b.f131787l.createBuilder();
        String str = (String) entry.getKey();
        aVar.copyOnWrite();
        C50666b bVar = (C50666b) aVar.instance;
        str.getClass();
        bVar.f131789a |= 1;
        bVar.f131790b = str;
        C50669e eVar = (C50669e) C50670f.f131811d.createBuilder();
        eVar.copyOnWrite();
        C50670f fVar = (C50670f) eVar.instance;
        C50668d dVar5 = (C50668d) cVar.build();
        dVar5.getClass();
        fVar.f131815c = dVar5;
        fVar.f131813a |= 2;
        eVar.copyOnWrite();
        C50670f fVar2 = (C50670f) eVar.instance;
        hVar.getClass();
        fVar2.f131814b = hVar;
        fVar2.f131813a |= 1;
        aVar.copyOnWrite();
        C50666b bVar2 = (C50666b) aVar.instance;
        C50670f fVar3 = (C50670f) eVar.build();
        fVar3.getClass();
        bVar2.mo53419a();
        bVar2.f131799k.add(fVar3);
        return (C50666b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
