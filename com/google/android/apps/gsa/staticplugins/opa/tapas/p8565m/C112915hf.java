package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8532b.C111790b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3897e.p3917i.p3918a.C51588ng;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51593nl;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.hf */
/* compiled from: PG */
final class C112915hf implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C113415ez f312943a;

    /* renamed from: b */
    final /* synthetic */ C113408es f312944b;

    /* renamed from: c */
    final /* synthetic */ C112916hg f312945c;

    /* renamed from: d */
    final /* synthetic */ C112917hh f312946d;

    public C112915hf(C112917hh hhVar, C113415ez ezVar, C113408es esVar, C112916hg hgVar) {
        this.f312946d = hhVar;
        this.f312943a = ezVar;
        this.f312944b = esVar;
        this.f312945c = hgVar;
    }

    public final void onClick(View view) {
        this.f312946d.f312952b.mo99739a(11, this.f312943a, this.f312944b, Optional.m71637of(Arrays.asList(new Integer[]{23220})));
        int j = C112917hh.m186846j(this.f312945c.f312947a);
        int j2 = C112917hh.m186846j(this.f312945c.f312948b);
        int j3 = C112917hh.m186846j(this.f312945c.f312949c);
        long millis = TimeUnit.HOURS.toMillis((long) j);
        long millis2 = TimeUnit.MINUTES.toMillis((long) j2);
        long millis3 = TimeUnit.SECONDS.toMillis((long) j3);
        C58976aa aaVar = C58975e.f156826a;
        C111790b bVar = this.f312946d.f312951a;
        C51588ng ngVar = (C51588ng) C51592nk.f134462k.createBuilder();
        ngVar.copyOnWrite();
        C51592nk nkVar = (C51592nk) ngVar.instance;
        nkVar.f134464a |= 4;
        nkVar.f134469f = millis + millis2 + millis3;
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "timer.CREATE_TIMER";
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "timer_params";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.TimerParams";
        C51593nl nlVar = (C51593nl) C51594nm.f134474f.createBuilder();
        nlVar.mo53650d((C51592nk) ngVar.build());
        nlVar.copyOnWrite();
        C51594nm nmVar = (C51594nm) nlVar.instance;
        nmVar.f134476a = 1 | nmVar.f134476a;
        nmVar.f134478c = false;
        C63088z byteString = ((C51594nm) nlVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        dvVar.mo53732b(kbVar);
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        C51807dw dwVar = (C51807dw) dvVar.build();
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        bVar.mo99229a(C58485gu.m89846n((C51809dy) dxVar.build()));
    }
}
