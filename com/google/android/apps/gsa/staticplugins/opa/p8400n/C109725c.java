package com.google.android.apps.gsa.staticplugins.opa.p8400n;

import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.n.c */
/* compiled from: PG */
public final class C109725c {
    /* renamed from: a */
    public static C51809dy m182677a(String str, C52232kc... kcVarArr) {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = str;
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        dvVar.mo53731a(C58485gu.m89844l(kcVarArr));
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        C51807dw dwVar = (C51807dw) dvVar.build();
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: b */
    public static C51809dy m182678b(String str, C52232kc... kcVarArr) {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "opa_android.OP";
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "opa_android_op_args";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "opa_android_ops_proto.OpaAndroidArgs";
        C109723a aVar = (C109723a) C109724b.f305681c.createBuilder();
        aVar.copyOnWrite();
        C109724b bVar = (C109724b) aVar.instance;
        bVar.f305683a |= 1;
        bVar.f305684b = str;
        C63088z byteString = ((C109724b) aVar.build()).toByteString();
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
        dvVar.mo53733c((C52232kc) kbVar.build());
        dvVar.mo53731a(C58485gu.m89844l(kcVarArr));
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        C51807dw dwVar = (C51807dw) dvVar.build();
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: c */
    public static C58833ax m182679c(C51809dy dyVar) {
        if (!"opa_android.OP".equals(dyVar.f135936b)) {
            return C58836b.f156633a;
        }
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        for (C52232kc kcVar : dwVar.f135932a) {
            if ("opa_android_op_args".equals(kcVar.f137065b)) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    return C58833ax.m90834k(((C109724b) C62942bv.parseFrom((C62942bv) C109724b.f305681c, kaVar.f137061c)).f305684b);
                } catch (C62974ct unused) {
                    return C58836b.f156633a;
                }
            }
        }
        return C58836b.f156633a;
    }
}
