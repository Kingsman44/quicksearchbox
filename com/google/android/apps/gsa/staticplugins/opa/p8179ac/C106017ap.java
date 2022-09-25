package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.amq;
import com.google.assistant.p3897e.p3921j.amt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.ap */
/* compiled from: PG */
public final /* synthetic */ class C106017ap implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106023av f295966a;

    /* renamed from: b */
    public final /* synthetic */ List f295967b;

    /* renamed from: c */
    public final /* synthetic */ int f295968c;

    /* renamed from: d */
    public final /* synthetic */ boolean f295969d;

    public /* synthetic */ C106017ap(C106023av avVar, List list, int i, boolean z) {
        this.f295966a = avVar;
        this.f295967b = list;
        this.f295968c = i;
        this.f295969d = z;
    }

    public final void run() {
        C106023av avVar = this.f295966a;
        List list = this.f295967b;
        int i = this.f295968c;
        boolean z = this.f295969d;
        C106025ax axVar = avVar.f295980a;
        amq amq = (amq) amt.f135394e.createBuilder();
        amq.copyOnWrite();
        amt amt = (amt) amq.instance;
        C62971cq cqVar = amt.f135397b;
        if (!cqVar.mo58948c()) {
            amt.f135397b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) amt.f135397b);
        amq.copyOnWrite();
        amt amt2 = (amt) amq.instance;
        amt2.f135396a |= 1;
        amt2.f135398c = i;
        amq.copyOnWrite();
        amt amt3 = (amt) amq.instance;
        amt3.f135396a |= 2;
        amt3.f135399d = z;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.ThirdPartyContinuousMatchInput";
        C63088z byteString = ((amt) amq.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "third_party.ENTER_CONTINUOUS_MATCH_MODE";
        dsVar.mo53729a("third_party_continuous_match_input", (C52230ka) jzVar.build());
        axVar.mo95243y((C51805du) dsVar.build());
    }
}
