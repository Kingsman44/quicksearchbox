package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.assistant.p3897e.p3917i.p3918a.C51376fk;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.common.base.C58817ah;
import com.google.knowledge.p4671b.C61789ah;
import com.google.knowledge.p4671b.C61790ai;
import com.google.knowledge.p4671b.C61812e;
import com.google.knowledge.p4671b.C61814g;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.n */
/* compiled from: PG */
public final /* synthetic */ class C103634n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f288689a;

    /* renamed from: b */
    public final /* synthetic */ String f288690b;

    public /* synthetic */ C103634n(String str, String str2) {
        this.f288689a = str;
        this.f288690b = str2;
    }

    public final Object apply(Object obj) {
        String str = this.f288689a;
        String str2 = this.f288690b;
        C51379fn fnVar = (C51379fn) obj;
        C51376fk fkVar = (C51376fk) fnVar.toBuilder();
        C61790ai aiVar = fnVar.f133817b;
        if (aiVar == null) {
            aiVar = C61790ai.f166898o;
        }
        C61814g gVar = aiVar.f166903d;
        if (gVar == null) {
            gVar = C61814g.f166984j;
        }
        C61812e eVar = (C61812e) gVar.toBuilder();
        eVar.copyOnWrite();
        C61814g gVar2 = (C61814g) eVar.instance;
        str.getClass();
        gVar2.f166986a |= 1;
        gVar2.f166987b = str;
        eVar.copyOnWrite();
        C61814g gVar3 = (C61814g) eVar.instance;
        str2.getClass();
        gVar3.f166986a |= 2;
        gVar3.f166988c = str2;
        C61814g gVar4 = (C61814g) eVar.build();
        C61790ai aiVar2 = fnVar.f133817b;
        if (aiVar2 == null) {
            aiVar2 = C61790ai.f166898o;
        }
        C61789ah ahVar = (C61789ah) aiVar2.toBuilder();
        ahVar.copyOnWrite();
        C61790ai aiVar3 = (C61790ai) ahVar.instance;
        gVar4.getClass();
        aiVar3.f166903d = gVar4;
        aiVar3.f166900a |= 16;
        C61790ai aiVar4 = (C61790ai) ahVar.build();
        fkVar.copyOnWrite();
        C51379fn fnVar2 = (C51379fn) fkVar.instance;
        aiVar4.getClass();
        fnVar2.f133817b = aiVar4;
        fnVar2.f133816a |= 1;
        return (C51379fn) fkVar.build();
    }
}
