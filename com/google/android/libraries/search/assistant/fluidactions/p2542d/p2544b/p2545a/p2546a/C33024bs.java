package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bs */
/* compiled from: PG */
public final /* synthetic */ class C33024bs implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C33025bt f88429a;

    /* renamed from: b */
    public final /* synthetic */ C52490tr f88430b;

    public /* synthetic */ C33024bs(C33025bt btVar, C52490tr trVar) {
        this.f88429a = btVar;
        this.f88430b = trVar;
    }

    public final Object apply(Object obj) {
        C33025bt btVar = this.f88429a;
        C52490tr trVar = this.f88430b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return false;
        }
        C51937eq eqVar = (C51937eq) C51941eu.f136271l.createBuilder();
        String str = trVar.f137800d;
        eqVar.copyOnWrite();
        C51941eu euVar = (C51941eu) eqVar.instance;
        str.getClass();
        euVar.f136273a |= 8;
        euVar.f136279g = str;
        C50969bn a = ((C32987ai) optional.get()).mo38448a();
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        a.getClass();
        euVar2.f136278f = a;
        euVar2.f136277e = 16;
        btVar.f88434d = C33136x.m61489f((C51941eu) eqVar.build(), btVar.f88434d, Optional.empty());
        return Boolean.valueOf(((C32987ai) optional.get()).mo38451d());
    }
}
