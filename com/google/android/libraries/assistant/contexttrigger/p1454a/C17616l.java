package com.google.android.libraries.assistant.contexttrigger.p1454a;

import com.google.assistant.p3803ag.p3807b.p3808a.C48888ac;
import com.google.assistant.p3803ag.p3807b.p3808a.C48889ad;
import com.google.assistant.p3803ag.p3807b.p3808a.C48892ag;
import com.google.assistant.p3803ag.p3807b.p3808a.C48922x;
import com.google.assistant.p3803ag.p3807b.p3808a.C48924z;
import com.google.common.p4522b.C58480gp;
import com.google.protobuf.C62995dn;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.a.l */
/* compiled from: PG */
public final /* synthetic */ class C17616l implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f50730a;

    /* renamed from: b */
    public final /* synthetic */ C48922x f50731b;

    /* renamed from: c */
    public final /* synthetic */ C58480gp f50732c;

    public /* synthetic */ C17616l(String str, C48922x xVar, C58480gp gpVar) {
        this.f50730a = str;
        this.f50731b = xVar;
        this.f50732c = gpVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f50730a;
        C48922x xVar = this.f50731b;
        C58480gp gpVar = this.f50732c;
        C48892ag agVar = (C48892ag) obj;
        if (!agVar.mo53191d(str)) {
            return agVar;
        }
        str.getClass();
        C62995dn dnVar = agVar.f126521b;
        if (dnVar.containsKey(str)) {
            C48888ac acVar = (C48888ac) dnVar.get(str);
            C48922x a = C48922x.m85306a(acVar.f126513e);
            if (a == null) {
                a = C48922x.UNKNOWN;
            }
            if (a == xVar) {
                return agVar;
            }
            C48924z zVar = (C48924z) acVar.toBuilder();
            zVar.copyOnWrite();
            C48888ac acVar2 = (C48888ac) zVar.instance;
            acVar2.f126513e = xVar.f126599d;
            acVar2.f126509a |= 8;
            zVar.copyOnWrite();
            C48888ac acVar3 = (C48888ac) zVar.instance;
            acVar3.f126514f = a.f126599d;
            acVar3.f126509a |= 16;
            gpVar.mo55395g(str);
            C48889ad adVar = (C48889ad) agVar.toBuilder();
            adVar.mo53186a(str, (C48888ac) zVar.build());
            return (C48892ag) adVar.build();
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
