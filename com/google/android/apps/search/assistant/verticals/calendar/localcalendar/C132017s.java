package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131947b;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Comparator;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71046cs;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71047ct;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71053cz;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71055da;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.s */
/* compiled from: PG */
public final /* synthetic */ class C132017s implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C132017s f360361a = new C132017s();

    private /* synthetic */ C132017s() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C132020v vVar = (C132020v) obj;
        C58485gu guVar = (C58485gu) obj2;
        Comparator comparator = C132021w.f360364a;
        String substring = vVar.mo110372b().substring(0, Math.min(15, vVar.mo110372b().length()));
        C71053cz czVar = (C71053cz) C71055da.f189501e.createBuilder();
        czVar.copyOnWrite();
        C71055da daVar = (C71055da) czVar.instance;
        substring.getClass();
        daVar.f189503a |= 1;
        daVar.f189504b = substring;
        boolean c = vVar.mo110373c();
        czVar.copyOnWrite();
        C71055da daVar2 = (C71055da) czVar.instance;
        daVar2.f189503a |= 2;
        daVar2.f189505c = c;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C131947b bVar = (C131947b) guVar.get(i);
            C71046cs csVar = (C71046cs) C71047ct.f189475h.createBuilder();
            boolean z = bVar.f360267f;
            csVar.copyOnWrite();
            C71047ct ctVar = (C71047ct) csVar.instance;
            ctVar.f189477a |= 1;
            ctVar.f189478b = z;
            int c2 = C132021w.m214458c(bVar);
            csVar.copyOnWrite();
            C71047ct ctVar2 = (C71047ct) csVar.instance;
            ctVar2.f189480d = c2 - 1;
            ctVar2.f189477a |= 4;
            int i2 = bVar.f360269h;
            csVar.copyOnWrite();
            C71047ct ctVar3 = (C71047ct) csVar.instance;
            ctVar3.f189477a |= 16;
            ctVar3.f189482f = i2;
            int i3 = bVar.f360270i;
            csVar.copyOnWrite();
            C71047ct ctVar4 = (C71047ct) csVar.instance;
            ctVar4.f189477a |= 32;
            ctVar4.f189483g = i3;
            czVar.copyOnWrite();
            C71055da daVar3 = (C71055da) czVar.instance;
            C71047ct ctVar5 = (C71047ct) csVar.build();
            ctVar5.getClass();
            C62971cq cqVar = daVar3.f189506d;
            if (!cqVar.mo58948c()) {
                daVar3.f189506d = C62942bv.mutableCopy(cqVar);
            }
            daVar3.f189506d.add(ctVar5);
        }
        return (C71055da) czVar.build();
    }
}
