package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131946a;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131947b;
import com.google.assistant.p3897e.p3929l.p3930a.C52669ab;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.e */
/* compiled from: PG */
public final /* synthetic */ class C132003e implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f360343a;

    public /* synthetic */ C132003e(String str) {
        this.f360343a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f360343a;
        C52669ab abVar = (C52669ab) obj;
        if ((abVar.f138267a & 2) != 0) {
            str = C131948aa.m214404b(abVar.f138269c);
        }
        C131946a aVar = (C131946a) C131947b.f360260j.createBuilder();
        String str2 = abVar.f138268b;
        aVar.copyOnWrite();
        C131947b bVar = (C131947b) aVar.instance;
        str2.getClass();
        bVar.f360262a |= 1;
        bVar.f360263b = str2;
        aVar.copyOnWrite();
        C131947b bVar2 = (C131947b) aVar.instance;
        bVar2.f360262a |= 32;
        bVar2.f360268g = true;
        boolean equals = C131948aa.m214404b(abVar.f138268b).equals(str);
        aVar.copyOnWrite();
        C131947b bVar3 = (C131947b) aVar.instance;
        bVar3.f360262a |= 16;
        bVar3.f360267f = equals;
        if ((abVar.f138267a & 2) != 0) {
            String str3 = abVar.f138269c;
            aVar.copyOnWrite();
            C131947b bVar4 = (C131947b) aVar.instance;
            str3.getClass();
            bVar4.f360262a |= 2;
            bVar4.f360264c = str3;
        }
        return (C131947b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
