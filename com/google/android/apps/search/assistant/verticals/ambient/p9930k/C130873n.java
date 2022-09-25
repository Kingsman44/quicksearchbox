package com.google.android.apps.search.assistant.verticals.ambient.p9930k;

import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53704bb;
import com.google.assistant.p4016z.C53706bd;
import com.google.assistant.p4016z.C53708bf;
import com.google.common.p4543n.p4551g.C59443c;
import java.util.Map;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.n */
/* compiled from: PG */
public final /* synthetic */ class C130873n implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C130873n f358152a = new C130873n();

    private /* synthetic */ C130873n() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Collector collector = C130881v.f358160a;
        C53692aq aqVar = (C53692aq) entry.getKey();
        C59443c cVar = (C59443c) entry.getValue();
        C53704bb bbVar = (C53704bb) C53708bf.f140992g.createBuilder();
        bbVar.copyOnWrite();
        C53708bf bfVar = (C53708bf) bbVar.instance;
        aqVar.getClass();
        bfVar.f140996c = aqVar;
        bfVar.f140994a |= 2;
        bbVar.copyOnWrite();
        C53708bf bfVar2 = (C53708bf) bbVar.instance;
        bfVar2.f140995b = 1;
        bfVar2.f140994a = 1 | bfVar2.f140994a;
        double a = cVar.mo56958a();
        bbVar.copyOnWrite();
        C53708bf bfVar3 = (C53708bf) bbVar.instance;
        bfVar3.f140994a |= 4;
        bfVar3.f140997d = a;
        double a2 = cVar.mo56958a();
        bbVar.copyOnWrite();
        C53708bf bfVar4 = (C53708bf) bbVar.instance;
        bfVar4.f140994a |= 16;
        bfVar4.f140999f = a2;
        if (cVar.mo56958a() <= 10.0d) {
            C53706bd bdVar = C53706bd.CLOSE;
            bbVar.copyOnWrite();
            C53708bf bfVar5 = (C53708bf) bbVar.instance;
            bfVar5.f140998e = bdVar.f140990e;
            bfVar5.f140994a |= 8;
        } else if (cVar.mo56958a() <= 30.0d) {
            C53706bd bdVar2 = C53706bd.MID;
            bbVar.copyOnWrite();
            C53708bf bfVar6 = (C53708bf) bbVar.instance;
            bfVar6.f140998e = bdVar2.f140990e;
            bfVar6.f140994a |= 8;
        } else {
            C53706bd bdVar3 = C53706bd.LONG;
            bbVar.copyOnWrite();
            C53708bf bfVar7 = (C53708bf) bbVar.instance;
            bfVar7.f140998e = bdVar3.f140990e;
            bfVar7.f140994a |= 8;
        }
        return (C53708bf) bbVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
