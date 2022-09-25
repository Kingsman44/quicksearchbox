package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.ab.o */
/* compiled from: PG */
public final /* synthetic */ class C32420o implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f86881a;

    /* renamed from: b */
    public final /* synthetic */ String f86882b;

    public /* synthetic */ C32420o(Map map, String str) {
        this.f86881a = map;
        this.f86882b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map map = this.f86881a;
        String str = this.f86882b;
        C32398bm bmVar = (C32398bm) obj;
        C59071e eVar = C32359aa.f86743a;
        C32365ag agVar = (C32365ag) Map.EL.getOrDefault(map, bmVar.f86844l, C32365ag.f86758h);
        C32361ac a = C32359aa.m60168a(agVar, str);
        C32366ah ahVar = (C32366ah) C32367ai.f86767h.createBuilder();
        String str2 = agVar.f86761b;
        ahVar.copyOnWrite();
        C32367ai aiVar = (C32367ai) ahVar.instance;
        str2.getClass();
        aiVar.f86769a |= 1;
        aiVar.f86770b = str2;
        String str3 = agVar.f86762c;
        ahVar.copyOnWrite();
        C32367ai aiVar2 = (C32367ai) ahVar.instance;
        str3.getClass();
        aiVar2.f86769a |= 2;
        aiVar2.f86771c = str3;
        ahVar.copyOnWrite();
        C32367ai aiVar3 = (C32367ai) ahVar.instance;
        bmVar.getClass();
        aiVar3.f86772d = bmVar;
        aiVar3.f86769a |= 4;
        long min = (long) Math.min((int) (bmVar.f86845m * 1000.0d), 4194303);
        long min2 = ((long) Math.min((int) (bmVar.f86848p * 1000.0d), 4194303)) | (((min + min) | (bmVar.f86843k ? 1 : 0)) << 22);
        double d = bmVar.f86845m;
        double d2 = bmVar.f86848p;
        double log = min2 > 1 ? Math.log((double) min2) : 0.0d;
        long min3 = (((long) Math.min((int) bmVar.f86846n, 4194303)) << 22) | ((long) Math.min((int) bmVar.f86849q, 4194303));
        if (log > C59203do.f157270a) {
            double d3 = C32359aa.f86745c;
            log += d3 + d3;
        }
        if (min3 > 1) {
            double exp = Math.exp(log);
            double d4 = (double) min3;
            Double.isNaN(d4);
            log = Math.log(exp + d4);
        }
        ahVar.copyOnWrite();
        C32367ai aiVar4 = (C32367ai) ahVar.instance;
        aiVar4.f86769a |= 32;
        aiVar4.f86774f = log;
        ahVar.copyOnWrite();
        C32367ai aiVar5 = (C32367ai) ahVar.instance;
        a.getClass();
        aiVar5.f86775g = a;
        aiVar5.f86769a |= 64;
        return (C32367ai) ahVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
