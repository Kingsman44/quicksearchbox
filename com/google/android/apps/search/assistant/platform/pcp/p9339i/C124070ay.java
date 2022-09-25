package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import p3186j$.util.function.Function;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69241g;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.ay */
/* compiled from: PG */
public final /* synthetic */ class C124070ay implements Function {

    /* renamed from: a */
    public final /* synthetic */ C124081bi f342678a;

    /* renamed from: b */
    public final /* synthetic */ int f342679b;

    public /* synthetic */ C124070ay(C124081bi biVar, int i) {
        this.f342678a = biVar;
        this.f342679b = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        long j;
        C124081bi biVar = this.f342678a;
        int i = this.f342679b;
        C124086bm a = C124086bm.m203508a(biVar.f342710b, (AccountId) obj);
        Map map = a.f342724b;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            C69241g gVar = (C69241g) a.f342724b.get(valueOf);
            gVar.getClass();
            if ((gVar.f185345a & 2) != 0) {
                C69241g gVar2 = (C69241g) a.f342724b.get(valueOf);
                gVar2.getClass();
                j = (long) gVar2.f185347c;
                return Long.valueOf(j);
            }
        }
        C59104x d = C124086bm.f342723a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.DataTypeConfig");
        ((C59052c) ((C59052c) d).mo56372aa(35396)).mo56387q("Config not found freshness for data type %s", i);
        j = a.f342725c;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
