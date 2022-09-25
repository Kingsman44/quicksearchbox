package com.google.android.apps.search.weather.suggestions.p10696c;

import com.google.common.base.C58838bb;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4575r.C60763t;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54237az;
import com.google.p5269w.p5270a.C67959a;
import com.google.p5269w.p5270a.C67960b;
import com.google.p5269w.p5270a.C67961c;
import com.google.p5269w.p5270a.C67962d;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.weather.suggestions.c.b */
/* compiled from: PG */
public final /* synthetic */ class C142136b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C142136b f385592a = new C142136b();

    private /* synthetic */ C142136b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        long j;
        long j2;
        C54228aq aqVar = (C54228aq) obj;
        C54237az azVar = aqVar.f142348t;
        if (azVar == null) {
            azVar = C54237az.f142392e;
        }
        String str = azVar.f142394a;
        List i = C58869cf.m90936b(new C58903m(':')).mo56155i(str);
        int i2 = 0;
        if (i.size() == 2) {
            C58838bb.m90868c(((String) i.get(0)).startsWith("0x"));
            C58838bb.m90868c(((String) i.get(1)).startsWith("0x"));
            j = C142135a.m230749a(((String) i.get(0)).substring(2));
            j2 = C142135a.m230749a(((String) i.get(1)).substring(2));
        } else {
            int length = str.length();
            if (length != 0) {
                if (str.charAt(0) == '-') {
                    i2 = 1;
                }
                if (length - i2 <= 20) {
                    while (i2 < length) {
                        char charAt = str.charAt(i2);
                        if (charAt >= '0' && charAt <= '9') {
                            i2++;
                        }
                    }
                    try {
                        if (str.indexOf(45) == 0) {
                            j2 = Long.parseLong(str);
                        } else {
                            j2 = C60763t.m92766c(str, 10);
                        }
                        j = 0;
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("malformed cdocid \"" + str + "\"", e);
                    }
                }
            }
            throw new IllegalArgumentException("malformed feature id \"" + str + "\"");
        }
        int i3 = azVar.f142395b;
        int i4 = azVar.f142396c;
        String str2 = azVar.f142397d;
        C67959a aVar = (C67959a) C67962d.f184173g.createBuilder();
        String str3 = aqVar.f142331b;
        aVar.copyOnWrite();
        C67962d dVar = (C67962d) aVar.instance;
        str3.getClass();
        dVar.f184175a |= 1;
        dVar.f184176b = str3;
        aVar.copyOnWrite();
        C67962d dVar2 = (C67962d) aVar.instance;
        dVar2.f184175a |= 2;
        dVar2.f184177c = ((float) i3) / 1.0E7f;
        aVar.copyOnWrite();
        C67962d dVar3 = (C67962d) aVar.instance;
        dVar3.f184175a |= 4;
        dVar3.f184178d = ((float) i4) / 1.0E7f;
        C67960b bVar = (C67960b) C67961c.f184168d.createBuilder();
        bVar.copyOnWrite();
        C67961c cVar = (C67961c) bVar.instance;
        cVar.f184170a = 2 | cVar.f184170a;
        cVar.f184172c = j2;
        bVar.copyOnWrite();
        C67961c cVar2 = (C67961c) bVar.instance;
        cVar2.f184170a |= 1;
        cVar2.f184171b = j;
        C67961c cVar3 = (C67961c) bVar.build();
        aVar.copyOnWrite();
        C67962d dVar4 = (C67962d) aVar.instance;
        cVar3.getClass();
        dVar4.f184179e = cVar3;
        dVar4.f184175a |= 8;
        aVar.copyOnWrite();
        C67962d dVar5 = (C67962d) aVar.instance;
        str2.getClass();
        dVar5.f184175a |= 16;
        dVar5.f184180f = str2;
        return (C67962d) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
