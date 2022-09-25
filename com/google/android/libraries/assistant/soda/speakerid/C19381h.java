package com.google.android.libraries.assistant.soda.speakerid;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C66782aw;
import com.google.speech.p5218j.C66824bb;
import com.google.speech.p5218j.C66825bc;
import com.google.speech.p5218j.C66828bf;
import com.google.speech.p5218j.C66829bg;
import com.google.speech.p5218j.C66999hh;

/* renamed from: com.google.android.libraries.assistant.soda.speakerid.h */
/* compiled from: PG */
public final /* synthetic */ class C19381h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ SodaEnrollmentManagerImpl f54223a;

    /* renamed from: b */
    public final /* synthetic */ C66999hh f54224b;

    public /* synthetic */ C19381h(SodaEnrollmentManagerImpl sodaEnrollmentManagerImpl, C66999hh hhVar) {
        this.f54223a = sodaEnrollmentManagerImpl;
        this.f54224b = hhVar;
    }

    public final C60870cx apply(Object obj) {
        SodaEnrollmentManagerImpl sodaEnrollmentManagerImpl = this.f54223a;
        C66999hh hhVar = this.f54224b;
        Void voidR = (Void) obj;
        C66828bf bfVar = (C66828bf) C66829bg.f181726e.createBuilder();
        C66782aw h = sodaEnrollmentManagerImpl.mo24508h();
        bfVar.copyOnWrite();
        C66829bg bgVar = (C66829bg) bfVar.instance;
        h.getClass();
        bgVar.f181731d = h;
        bgVar.f181728a |= 1;
        C66824bb bbVar = (C66824bb) C66825bc.f181714c.createBuilder();
        bbVar.copyOnWrite();
        C66825bc bcVar = (C66825bc) bbVar.instance;
        hhVar.getClass();
        bcVar.f181717b = hhVar;
        bcVar.f181716a |= 1;
        bfVar.copyOnWrite();
        C66829bg bgVar2 = (C66829bg) bfVar.instance;
        C66825bc bcVar2 = (C66825bc) bbVar.build();
        bcVar2.getClass();
        bgVar2.f181730c = bcVar2;
        bgVar2.f181729b = 2;
        C60870cx g = sodaEnrollmentManagerImpl.mo24507g((C66829bg) bfVar.build());
        sodaEnrollmentManagerImpl.f54187d.set(true);
        return g;
    }
}
