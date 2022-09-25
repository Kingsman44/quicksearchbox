package com.google.android.apps.gsa.staticplugins.opa.util;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52341od;
import com.google.assistant.p3897e.p3921j.C52343of;
import com.google.assistant.p3897e.p3921j.aps;
import com.google.assistant.p3897e.p3921j.apu;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.cx */
/* compiled from: PG */
public final class C113869cx {

    /* renamed from: a */
    private final SharedPreferences f315287a;

    public C113869cx(SharedPreferences sharedPreferences) {
        this.f315287a = sharedPreferences;
    }

    /* renamed from: g */
    public static final C51805du m188498g(apu apu, C52343of ofVar) {
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.WarmerWelcomeInput";
        C63088z byteString = apu.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52228jz jzVar2 = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar2.copyOnWrite();
        C52230ka kaVar3 = (C52230ka) jzVar2.instance;
        kaVar3.f137059a |= 1;
        kaVar3.f137060b = "assistant.api.client_input.ChatUiHelpStateUpdate";
        C63088z byteString2 = ofVar.toByteString();
        jzVar2.copyOnWrite();
        C52230ka kaVar4 = (C52230ka) jzVar2.instance;
        byteString2.getClass();
        kaVar4.f137059a |= 2;
        kaVar4.f137061c = byteString2;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "warmer_welcome.TRIGGER";
        dsVar.mo53729a("warmer_welcome_input", (C52230ka) jzVar.build());
        dsVar.mo53729a("chat_ui_help_input", (C52230ka) jzVar2.build());
        return (C51805du) dsVar.build();
    }

    /* renamed from: a */
    public final int mo100728a() {
        return this.f315287a.getInt("opa_warmer_welcome_launch_count", 0);
    }

    /* renamed from: b */
    public final C52343of mo100729b(C52341od odVar) {
        int i = this.f315287a.getInt("chat_ui_help_num_times_completed", 0);
        odVar.copyOnWrite();
        C52343of ofVar = (C52343of) odVar.instance;
        C52343of ofVar2 = C52343of.f137384i;
        ofVar.f137386a |= 16;
        ofVar.f137392g = i;
        int i2 = this.f315287a.getInt("ww_chat_ui_help_num_times_completed", 0);
        odVar.copyOnWrite();
        C52343of ofVar3 = (C52343of) odVar.instance;
        ofVar3.f137386a |= 32;
        ofVar3.f137393h = i2;
        int i3 = this.f315287a.getInt("ww_chat_ui_help_num_times_triggered", 0);
        odVar.copyOnWrite();
        C52343of ofVar4 = (C52343of) odVar.instance;
        ofVar4.f137386a |= 8;
        ofVar4.f137391f = i3;
        int i4 = this.f315287a.getInt("chat_ui_help_num_times_triggered", 0);
        odVar.copyOnWrite();
        C52343of ofVar5 = (C52343of) odVar.instance;
        ofVar5.f137386a |= 4;
        ofVar5.f137390e = i4;
        return (C52343of) odVar.build();
    }

    /* renamed from: c */
    public final void mo100730c() {
        this.f315287a.edit().putInt("opa_warmer_welcome_launch_count", mo100728a() + 1).apply();
    }

    /* renamed from: d */
    public final void mo100731d(apu apu, C52343of ofVar, C107698i iVar) {
        C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
        C63088z byteString = m188498g(apu, ofVar).toByteString();
        oxVar.copyOnWrite();
        C88094oy oyVar = (C88094oy) oxVar.instance;
        byteString.getClass();
        oyVar.f238176a |= 1;
        oyVar.f238177b = byteString;
        C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
        jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
        iVar.mo96219b(jVar.mo82013a());
        mo100730c();
    }

    /* renamed from: e */
    public final boolean mo100732e(C86124t tVar) {
        if (tVar.mo79746e(C90014bt.f247590jy) && mo100728a() - this.f315287a.getInt("ww_chat_ui_help_num_times_triggered", 0) < 3) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo100733f(C86124t tVar, e eVar) {
        if (eVar == e.ba || eVar == e.q) {
            return true;
        }
        if (!mo100732e(tVar) || ((long) this.f315287a.getInt("opa_warm_welcome_launch_count", 0)) >= tVar.mo79743a(C90014bt.f247589jx) || this.f315287a.getInt("opa_warm_welcome_launch_count", 0) > 0) {
            return false;
        }
        if (this.f315287a.getInt("opa_warm_welcome_launch_count", 0) == 0 && mo100728a() == 0 && this.f315287a.getBoolean("assistant_response_received", false)) {
            return false;
        }
        if (eVar == e.ah || eVar == e.ar || eVar == e.bj || eVar == e.bu || eVar == e.bG || eVar == e.bH || eVar == e.ay || eVar == e.bB || eVar == e.aT) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final apu mo100734h(int i) {
        aps aps = (aps) apu.f135583d.createBuilder();
        aps.copyOnWrite();
        apu apu = (apu) aps.instance;
        apu.f135586b = i - 1;
        apu.f135585a |= 1;
        int a = mo100728a();
        aps.copyOnWrite();
        apu apu2 = (apu) aps.instance;
        apu2.f135585a |= 2;
        apu2.f135587c = a + 1;
        return (apu) aps.build();
    }
}
