package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1120a.p1121a;

import android.app.DirectAction;
import android.os.Bundle;
import com.google.assistant.p3897e.p3917i.p3918a.C51554m;
import com.google.assistant.p3897e.p3917i.p3918a.C51581n;
import com.google.assistant.p3897e.p3917i.p3918a.C51608o;
import com.google.assistant.p3897e.p3917i.p3918a.C51626p;
import com.google.assistant.p3897e.p3917i.p3918a.C51627q;
import com.google.assistant.p3897e.p3917i.p3918a.C51628r;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52801c;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52802d;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C15535a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C15535a f46513a = new C15535a();

    private /* synthetic */ C15535a() {
    }

    public final Object apply(Object obj) {
        Optional empty;
        C58485gu guVar = (C58485gu) obj;
        int size = guVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                empty = Optional.empty();
                break;
            }
            DirectAction directAction = (DirectAction) guVar.get(i);
            i++;
            if (directAction.getId().equals("app_action")) {
                Bundle extras = directAction.getExtras();
                if (extras == null) {
                    empty = Optional.empty();
                } else {
                    Bundle bundle = extras.getBundle("metadata");
                    if (bundle == null) {
                        empty = Optional.empty();
                    } else {
                        try {
                            empty = Optional.m71637of((C52829f) C52801c.m86708a(bundle, "app_action_metadata", C52829f.f138611c));
                        } catch (C52802d e) {
                            ((C59052c) ((C59052c) ((C59052c) C15536b.f46514a.mo56226d()).mo56382g(e)).mo56372aa(46149)).mo56386p("Fails to parse AppActionsContext");
                            empty = Optional.empty();
                        }
                    }
                }
            }
        }
        if (!empty.isPresent()) {
            return C52232kc.f137062d;
        }
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.AppActionsContextParams";
        C51554m mVar = (C51554m) C51581n.f134439b.createBuilder();
        C51608o oVar = (C51608o) C51626p.f134543e.createBuilder();
        C51627q qVar = (C51627q) C51628r.f134549b.createBuilder();
        qVar.mo53666a(((C52829f) empty.get()).f138613a);
        oVar.copyOnWrite();
        C51626p pVar = (C51626p) oVar.instance;
        C51628r rVar = (C51628r) qVar.build();
        rVar.getClass();
        pVar.f134547c = rVar;
        pVar.f134545a |= 2;
        mVar.mo53635a(oVar);
        C63088z byteString = ((C51581n) mVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "app_actions_context_params";
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return (C52232kc) kbVar.build();
    }
}
