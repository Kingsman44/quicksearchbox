package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63088z;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.m */
/* compiled from: PG */
public final class C102525m extends C68247h {

    /* renamed from: a */
    private final C68283d f286138a;

    /* renamed from: c */
    private final C68283d f286139c;

    public C102525m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C102525m.class), aVar);
        this.f286138a = C68236af.m98549d(dVar);
        this.f286139c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C51303cs csVar = (C51303cs) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            csVar.copyOnWrite();
            C51334dw dwVar = (C51334dw) csVar.instance;
            C62962ci ciVar = C51334dw.f133657N;
            str.getClass();
            dwVar.f133685a |= 134217728;
            dwVar.f133709w = str;
        }
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.device.properties";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a = 1 | kaVar.f137059a;
        kaVar.f137060b = "assistant.api.params.DeviceProperties";
        C63088z byteString = ((C51334dw) csVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return C60856cj.m92900i(C58833ax.m90834k((C52232kc) kbVar.build()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286138a.mo60297gq(), this.f286139c.mo60297gq());
    }
}
