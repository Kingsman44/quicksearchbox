package com.google.android.libraries.assistant.soda.p1611f.p1612a;

import com.google.android.libraries.assistant.soda.data.C19283a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5218j.C66760aa;
import com.google.speech.p5218j.C67007hp;
import com.google.speech.p5218j.C67008hq;
import com.google.speech.p5218j.C67009hr;
import com.google.speech.p5218j.C67010hs;
import com.google.speech.p5218j.C67013hv;
import com.google.speech.p5218j.C67014hw;
import com.google.speech.p5218j.C67017hz;

/* renamed from: com.google.android.libraries.assistant.soda.f.a.a */
/* compiled from: PG */
public final class C19321a implements C19283a {

    /* renamed from: a */
    private C58833ax f54074a = C58836b.f156633a;

    /* renamed from: c */
    private static C67017hz m36811c(String str) {
        C67010hs hsVar = (C67010hs) C67017hz.f182174c.createBuilder();
        C67013hv hvVar = (C67013hv) C67014hw.f182165c.createBuilder();
        hvVar.copyOnWrite();
        C67014hw hwVar = (C67014hw) hvVar.instance;
        hwVar.f182167a |= 1;
        hwVar.f182168b = str;
        hsVar.copyOnWrite();
        C67017hz hzVar = (C67017hz) hsVar.instance;
        C67014hw hwVar2 = (C67014hw) hvVar.build();
        hwVar2.getClass();
        hzVar.f182177b = hwVar2;
        hzVar.f182176a = 1;
        return (C67017hz) hsVar.build();
    }

    /* renamed from: b */
    public final synchronized void mo24458b(C66760aa aaVar) {
        this.f54074a = C58833ax.m90834k(aaVar);
    }

    /* renamed from: s */
    public final synchronized C60870cx mo24441s(C67007hp hpVar) {
        if (hpVar.f182155a != 1) {
            return C60856cj.m92900i(m36811c("Only AuthData requests are supported."));
        } else if (!this.f54074a.mo56113h()) {
            return C60856cj.m92900i(m36811c("No auth tokens provided."));
        } else {
            C66760aa aaVar = (C66760aa) this.f54074a.mo56107c();
            C67010hs hsVar = (C67010hs) C67017hz.f182174c.createBuilder();
            C67008hq hqVar = (C67008hq) C67009hr.f182157c.createBuilder();
            hqVar.copyOnWrite();
            C67009hr hrVar = (C67009hr) hqVar.instance;
            aaVar.getClass();
            hrVar.f182160b = aaVar;
            hrVar.f182159a |= 1;
            hsVar.copyOnWrite();
            C67017hz hzVar = (C67017hz) hsVar.instance;
            C67009hr hrVar2 = (C67009hr) hqVar.build();
            hrVar2.getClass();
            hzVar.f182177b = hrVar2;
            hzVar.f182176a = 2;
            return C60856cj.m92900i((C67017hz) hsVar.build());
        }
    }
}
