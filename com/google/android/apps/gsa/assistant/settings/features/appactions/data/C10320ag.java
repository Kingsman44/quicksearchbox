package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.assistant.p3861at.C49814aa;
import com.google.assistant.p3861at.C49820af;
import com.google.assistant.p3861at.C49821ag;
import com.google.assistant.p3861at.C49823ah;
import com.google.assistant.p3861at.C49826ak;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.ag */
/* compiled from: PG */
public final /* synthetic */ class C10320ag implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f34969a;

    /* renamed from: b */
    public final /* synthetic */ C49826ak f34970b;

    /* renamed from: c */
    public final /* synthetic */ Optional f34971c;

    /* renamed from: d */
    public final /* synthetic */ C49814aa f34972d;

    public /* synthetic */ C10320ag(String str, C49826ak akVar, Optional optional, C49814aa aaVar) {
        this.f34969a = str;
        this.f34970b = akVar;
        this.f34971c = optional;
        this.f34972d = aaVar;
    }

    public final Object apply(Object obj) {
        String str = this.f34969a;
        C49826ak akVar = this.f34970b;
        Optional optional = this.f34971c;
        C49814aa aaVar = this.f34972d;
        C10341ba baVar = (C10341ba) obj;
        long longValue = ((Long) optional.get()).longValue();
        C49823ah ahVar = (C49823ah) akVar.toBuilder();
        C63088z zVar = aaVar.f128673c;
        ahVar.copyOnWrite();
        C49826ak akVar2 = (C49826ak) ahVar.instance;
        zVar.getClass();
        akVar2.f129464a |= 256;
        akVar2.f129473j = zVar;
        C49821ag agVar = akVar.f129475l;
        if (agVar == null) {
            agVar = C49821ag.f129197d;
        }
        C49820af afVar = (C49820af) agVar.toBuilder();
        long j = aaVar.f128675e;
        afVar.copyOnWrite();
        C49821ag agVar2 = (C49821ag) afVar.instance;
        agVar2.f129199a |= 2;
        agVar2.f129201c = j;
        C49821ag agVar3 = (C49821ag) afVar.build();
        ahVar.copyOnWrite();
        C49826ak akVar3 = (C49826ak) ahVar.instance;
        agVar3.getClass();
        akVar3.f129475l = agVar3;
        akVar3.f129464a |= 512;
        return new C10336aw((C58485gu) Collection.EL.stream(baVar.mo18438a()).map(new C10351i(str, (C49826ak) ahVar.build(), longValue)).collect(C58370cn.f155946a));
    }
}
