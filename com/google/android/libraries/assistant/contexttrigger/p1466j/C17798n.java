package com.google.android.libraries.assistant.contexttrigger.p1466j;

import com.google.assistant.p3803ag.p3807b.p3808a.C48888ac;
import com.google.assistant.p3803ag.p3807b.p3808a.C48889ad;
import com.google.assistant.p3803ag.p3807b.p3808a.C48892ag;
import com.google.assistant.p3803ag.p3807b.p3808a.C48922x;
import com.google.assistant.p3803ag.p3807b.p3808a.C48924z;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.protobuf.C62995dn;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.j.n */
/* compiled from: PG */
public final /* synthetic */ class C17798n implements Function {

    /* renamed from: a */
    public final /* synthetic */ List f51084a;

    /* renamed from: b */
    public final /* synthetic */ List f51085b;

    /* renamed from: c */
    public final /* synthetic */ C58480gp f51086c;

    public /* synthetic */ C17798n(List list, List list2, C58480gp gpVar) {
        this.f51084a = list;
        this.f51085b = list2;
        this.f51086c = gpVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        List list = this.f51084a;
        List list2 = this.f51085b;
        C58480gp gpVar = this.f51086c;
        C48892ag agVar = (C48892ag) obj;
        C48889ad adVar = (C48889ad) agVar.toBuilder();
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            String str = (String) G.next();
            if (agVar.mo53191d(str)) {
                str.getClass();
                C62995dn dnVar = agVar.f126521b;
                if (dnVar.containsKey(str)) {
                    C48888ac acVar = (C48888ac) dnVar.get(str);
                    C48922x a = C48922x.m85306a(acVar.f126513e);
                    if (a == null) {
                        a = C48922x.UNKNOWN;
                    }
                    if (a != C48922x.ACTIVE) {
                        C48924z zVar = (C48924z) acVar.toBuilder();
                        zVar.copyOnWrite();
                        C48888ac acVar2 = (C48888ac) zVar.instance;
                        acVar2.f126514f = a.f126599d;
                        acVar2.f126509a |= 16;
                        C48922x xVar = C48922x.ACTIVE;
                        zVar.copyOnWrite();
                        C48888ac acVar3 = (C48888ac) zVar.instance;
                        acVar3.f126513e = xVar.f126599d;
                        acVar3.f126509a |= 8;
                        adVar.mo53186a(str, (C48888ac) zVar.build());
                        gpVar.mo55395g(str);
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
        C58801sm G2 = ((C58485gu) list2).listIterator(0);
        while (G2.hasNext()) {
            String str2 = (String) G2.next();
            if (agVar.mo53191d(str2)) {
                str2.getClass();
                C62995dn dnVar2 = agVar.f126521b;
                if (dnVar2.containsKey(str2)) {
                    C48888ac acVar4 = (C48888ac) dnVar2.get(str2);
                    C48922x a2 = C48922x.m85306a(acVar4.f126513e);
                    if (a2 == null) {
                        a2 = C48922x.UNKNOWN;
                    }
                    if (a2 != C48922x.NOT_ACTIVE) {
                        C48924z zVar2 = (C48924z) acVar4.toBuilder();
                        zVar2.copyOnWrite();
                        C48888ac acVar5 = (C48888ac) zVar2.instance;
                        acVar5.f126514f = a2.f126599d;
                        acVar5.f126509a |= 16;
                        C48922x xVar2 = C48922x.NOT_ACTIVE;
                        zVar2.copyOnWrite();
                        C48888ac acVar6 = (C48888ac) zVar2.instance;
                        acVar6.f126513e = xVar2.f126599d;
                        acVar6.f126509a |= 8;
                        adVar.mo53186a(str2, (C48888ac) zVar2.build());
                        gpVar.mo55395g(str2);
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
        return (C48892ag) adVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
