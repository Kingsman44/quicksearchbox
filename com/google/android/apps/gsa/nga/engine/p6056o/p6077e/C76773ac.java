package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.y;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52373pi;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.assistant.p3897e.p3921j.apk;
import com.google.assistant.p3897e.p3921j.apn;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.ac */
/* compiled from: PG */
public final /* synthetic */ class C76773ac implements Function {

    /* renamed from: a */
    public final /* synthetic */ y f212149a;

    public /* synthetic */ C76773ac(y yVar) {
        this.f212149a = yVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        y yVar = this.f212149a;
        String str = (String) obj;
        C58974d dVar = C76795ay.f212177a;
        apk apk = (apk) apn.f135563g.createBuilder();
        C52373pi piVar = (C52373pi) C52374pj.f137434e.createBuilder();
        piVar.copyOnWrite();
        C52374pj pjVar = (C52374pj) piVar.instance;
        str.getClass();
        pjVar.f137437b = 6;
        pjVar.f137438c = str;
        apk.copyOnWrite();
        C52374pj pjVar2 = (C52374pj) piVar.build();
        pjVar2.getClass();
        ((apn) apk.instance).f135565a = pjVar2;
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        String str2 = yVar.b().i;
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
        apk.copyOnWrite();
        C51098gh ghVar2 = (C51098gh) ggVar.build();
        ghVar2.getClass();
        ((apn) apk.instance).f135567c = ghVar2;
        return (apn) apk.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
