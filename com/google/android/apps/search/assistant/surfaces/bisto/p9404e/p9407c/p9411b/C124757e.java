package com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9407c.p9411b;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124679cr;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124681ct;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49900dd;
import com.google.assistant.p3861at.C49901de;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.e.c.b.e */
/* compiled from: PG */
public final /* synthetic */ class C124757e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124774v f344164a;

    /* renamed from: b */
    public final /* synthetic */ C124681ct f344165b;

    public /* synthetic */ C124757e(C124774v vVar, C124681ct ctVar) {
        this.f344164a = vVar;
        this.f344165b = ctVar;
    }

    public final C60870cx apply(Object obj) {
        C124774v vVar = this.f344164a;
        C124681ct ctVar = this.f344165b;
        C124679cr crVar = (C124679cr) obj;
        C60870cx cxVar = C60866ct.f164955a;
        C124719q qVar = C124719q.GACS_DEVICE;
        C124719q a = C124719q.m204380a(crVar.f343961d);
        if (a == null) {
            a = C124719q.UNKNOWN_DEVICE_CATEGORY;
        }
        if (qVar.equals(a) && crVar.f343963f) {
            if ((crVar.f343958a & 128) != 0) {
                C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
                String str = crVar.f343966i;
                dfVar.copyOnWrite();
                C49903dg dgVar = (C49903dg) dfVar.instance;
                str.getClass();
                dgVar.f129714a |= 1;
                dgVar.f129715b = str;
                C49875cf cfVar = C49875cf.ASSISTANT_SDK;
                dfVar.copyOnWrite();
                C49903dg dgVar2 = (C49903dg) dfVar.instance;
                dgVar2.f129716c = cfVar.f129621v;
                dgVar2.f129714a |= 2;
                dfVar.copyOnWrite();
                C49903dg dgVar3 = (C49903dg) dfVar.instance;
                dgVar3.f129717d = 2;
                dgVar3.f129714a |= 8;
                C49900dd ddVar = (C49900dd) C49901de.f129708c.createBuilder();
                ddVar.copyOnWrite();
                C49901de deVar = (C49901de) ddVar.instance;
                deVar.f129710a |= 1;
                deVar.f129711b = true;
                dfVar.copyOnWrite();
                C49903dg dgVar4 = (C49903dg) dfVar.instance;
                C49901de deVar2 = (C49901de) ddVar.build();
                deVar2.getClass();
                dgVar4.f129718e = deVar2;
                dgVar4.f129714a |= 16;
                cxVar = vVar.mo106608i((C49903dg) dfVar.build());
            } else {
                cxVar = C60866ct.f164955a;
            }
        }
        return C60922j.m93045h(cxVar, C47810es.m84966f(new C124759g(vVar, ctVar)), vVar.f344197c);
    }
}
