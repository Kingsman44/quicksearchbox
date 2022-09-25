package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52308my;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.assistant.p3897e.p3921j.C52373pi;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.dm */
/* compiled from: PG */
public final /* synthetic */ class C77095dm implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C52373pi f212762a;

    /* renamed from: b */
    public final /* synthetic */ C52308my f212763b;

    /* renamed from: c */
    public final /* synthetic */ af f212764c;

    public /* synthetic */ C77095dm(C52373pi piVar, C52308my myVar, af afVar) {
        this.f212762a = piVar;
        this.f212763b = myVar;
        this.f212764c = afVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C52373pi piVar = this.f212762a;
        C52308my myVar = this.f212763b;
        af afVar = this.f212764c;
        C58485gu guVar = (C58485gu) obj;
        C58974d dVar = C77123en.f212843a;
        if (!guVar.isEmpty()) {
            String str = (String) guVar.get(0);
            piVar.copyOnWrite();
            C52374pj pjVar = (C52374pj) piVar.instance;
            C52374pj pjVar2 = C52374pj.f137434e;
            str.getClass();
            pjVar.f137437b = 6;
            pjVar.f137438c = str;
        }
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        String str2 = afVar.b().i;
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        str2.getClass();
        evVar.f132943a |= 1;
        evVar.f132944b = str2;
        ggVar.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar.instance;
        C51058ev evVar2 = (C51058ev) esVar.build();
        evVar2.getClass();
        ghVar.f133013c = evVar2;
        ghVar.f133012b = 1;
        myVar.copyOnWrite();
        C51098gh ghVar2 = (C51098gh) ggVar.build();
        C52321nk nkVar = C52321nk.f137326j;
        ghVar2.getClass();
        ((C52321nk) myVar.instance).f137333f = ghVar2;
        myVar.copyOnWrite();
        C52374pj pjVar3 = (C52374pj) piVar.build();
        pjVar3.getClass();
        ((C52321nk) myVar.instance).f137331d = pjVar3;
        return (C52321nk) myVar.build();
    }
}
