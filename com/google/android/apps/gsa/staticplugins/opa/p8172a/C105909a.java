package com.google.android.apps.gsa.staticplugins.opa.p8172a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.p8400n.C109725c;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.p3926e.C51815ac;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.assistant.p3897e.p3921j.p3926e.C52067z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.a.a */
/* compiled from: PG */
public final class C105909a implements C105916h {

    /* renamed from: c */
    private static final C59071e f295710c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.a.a");

    /* renamed from: a */
    public C52083ep f295711a = C52083ep.f136689f;

    /* renamed from: b */
    public final C86124t f295712b;

    public C105909a(C86124t tVar) {
        this.f295712b = tVar;
    }

    /* renamed from: a */
    public static C58833ax m176473a(C51809dy dyVar) {
        if ("ui.SHOW_NATIVE_FORM".equals(dyVar.f135936b)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            for (C52232kc kcVar : dwVar.f135932a) {
                if ("show_native_form_args".equals(kcVar.f137065b)) {
                    try {
                        C52230ka kaVar = kcVar.f137066c;
                        if (kaVar == null) {
                            kaVar = C52230ka.f137057d;
                        }
                        return C58833ax.m90834k((C51953ff) C62942bv.parseFrom((C62942bv) C51953ff.f136315l, kaVar.f137061c));
                    } catch (C62974ct e) {
                        ((C59052c) ((C59052c) ((C59052c) f295710c.mo56225c()).mo56382g(e)).mo56372aa(23037)).mo56386p("Failed parse show_native_form_args.");
                        return C58836b.f156633a;
                    }
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final boolean mo95178b(C52081en enVar) {
        C52076ei eiVar;
        C52076ei eiVar2;
        boolean z = false;
        for (C52083ep epVar : enVar.f136684d) {
            if (epVar.f136692b == 4) {
                C51809dy dyVar = ((C52076ei) epVar.f136693c).f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                if ("ui.SHOW_NATIVE_FORM".equals(dyVar.f135936b)) {
                    if (epVar.f136692b == 4) {
                        eiVar2 = (C52076ei) epVar.f136693c;
                    } else {
                        eiVar2 = C52076ei.f136664f;
                    }
                    C51809dy dyVar2 = eiVar2.f136668c;
                    if (dyVar2 == null) {
                        dyVar2 = C51809dy.f135933f;
                    }
                    C58833ax a = m176473a(dyVar2);
                    if (a.mo56113h()) {
                        C51936ep a2 = C51936ep.m86435a(((C51953ff) a.mo56107c()).f136323g);
                        if (a2 == null) {
                            a2 = C51936ep.DEFAULT;
                        }
                        if (a2.equals(C51936ep.CACHE_DISCLAIMER)) {
                        }
                    }
                    this.f295711a = epVar;
                    z = true;
                }
                if (epVar.f136692b == 4) {
                    eiVar = (C52076ei) epVar.f136693c;
                } else {
                    eiVar = C52076ei.f136664f;
                }
                C51809dy dyVar3 = eiVar.f136668c;
                if (dyVar3 == null) {
                    dyVar3 = C51809dy.f135933f;
                }
                z |= "ui.EXIT_NATIVE_FORM".equals(dyVar3.f135936b);
            }
        }
        return z;
    }

    /* renamed from: c */
    public final int mo95179c() {
        return 1;
    }

    /* renamed from: d */
    public final C51809dy mo95180d() {
        C52067z zVar = (C52067z) C51815ac.f135941f.createBuilder();
        zVar.copyOnWrite();
        C51815ac acVar = (C51815ac) zVar.instance;
        acVar.f135943a |= 8;
        acVar.f135947e = true;
        zVar.copyOnWrite();
        C51815ac acVar2 = (C51815ac) zVar.instance;
        acVar2.f135943a |= 4;
        acVar2.f135946d = true;
        zVar.copyOnWrite();
        C51815ac acVar3 = (C51815ac) zVar.instance;
        acVar3.f135943a |= 2;
        acVar3.f135945c = true;
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "keep_screen_contents_args";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.ui.KeepScreenContentsArgs";
        C63088z byteString = ((C51815ac) zVar.build()).toByteString();
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
        return C109725c.m182677a("ui.KEEP_SCREEN_CONTENTS", (C52232kc) kbVar.build());
    }
}
