package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.assistant.p3897e.p3917i.p3918a.C51490jq;
import com.google.assistant.p3897e.p3917i.p3918a.C51491jr;
import com.google.assistant.p3897e.p3917i.p3918a.C51492js;
import com.google.assistant.p3897e.p3917i.p3918a.C51493jt;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.m */
/* compiled from: PG */
public final /* synthetic */ class C103633m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C81252aq f288687a;

    /* renamed from: b */
    public final /* synthetic */ C86054o f288688b;

    public /* synthetic */ C103633m(C81252aq aqVar, C86054o oVar) {
        this.f288687a = aqVar;
        this.f288688b = oVar;
    }

    public final Object apply(Object obj) {
        C58833ax axVar;
        C81252aq aqVar = this.f288687a;
        C86054o oVar = this.f288688b;
        C51491jr jrVar = (C51491jr) obj;
        C51490jq jqVar = (C51490jq) C51491jr.f134160c.createBuilder();
        Optional ofNullable = Optional.ofNullable(oVar.mo79659F());
        Objects.requireNonNull(aqVar);
        if (!((Boolean) ofNullable.flatMap(new C103631k(aqVar)).orElse(false)).booleanValue()) {
            axVar = C58836b.f156633a;
        } else {
            C51492js jsVar = (C51492js) C51493jt.f134164e.createBuilder();
            boolean booleanValue = ((Boolean) aqVar.mo74949j(ofNullable).orElse(false)).booleanValue();
            jsVar.copyOnWrite();
            C51493jt jtVar = (C51493jt) jsVar.instance;
            jtVar.f134166a |= 1;
            jtVar.f134167b = booleanValue;
            boolean booleanValue2 = ((Boolean) aqVar.mo74951l(ofNullable).orElse(false)).booleanValue();
            jsVar.copyOnWrite();
            C51493jt jtVar2 = (C51493jt) jsVar.instance;
            jtVar2.f134166a |= 2;
            jtVar2.f134168c = booleanValue2;
            boolean booleanValue3 = ((Boolean) aqVar.mo74950k(ofNullable).orElse(false)).booleanValue();
            jsVar.copyOnWrite();
            C51493jt jtVar3 = (C51493jt) jsVar.instance;
            jtVar3.f134166a |= 4;
            jtVar3.f134169d = booleanValue3;
            axVar = C58833ax.m90834k((C51493jt) jsVar.build());
        }
        if (axVar.mo56113h()) {
            C51493jt jtVar4 = (C51493jt) axVar.mo56107c();
            jqVar.copyOnWrite();
            C51491jr jrVar2 = (C51491jr) jqVar.instance;
            jtVar4.getClass();
            jrVar2.f134163b = jtVar4;
            jrVar2.f134162a |= 1;
        }
        return (C51491jr) jqVar.build();
    }
}
