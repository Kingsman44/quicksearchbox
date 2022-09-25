package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.y;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52286mc;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.ap */
/* compiled from: PG */
public final /* synthetic */ class C76786ap implements Function {

    /* renamed from: a */
    public final /* synthetic */ y f212168a;

    public /* synthetic */ C76786ap(y yVar) {
        this.f212168a = yVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        y yVar = this.f212168a;
        String str = (String) obj;
        C58974d dVar = C76795ay.f212177a;
        C52286mc mcVar = (C52286mc) C52289mf.f137258j.createBuilder();
        mcVar.copyOnWrite();
        ((C52289mf) mcVar.instance).f137268i = false;
        mcVar.copyOnWrite();
        str.getClass();
        ((C52289mf) mcVar.instance).f137262c = str;
        String str2 = true != yVar.f() ? "APP_UNIQUE_ENDPOINT" : "PHONE_NUMBER";
        mcVar.copyOnWrite();
        ((C52289mf) mcVar.instance).f137263d = str2;
        C51098gh a = C77280f.m124015a(yVar);
        mcVar.copyOnWrite();
        C52289mf mfVar = (C52289mf) mcVar.instance;
        a.getClass();
        mfVar.f137261b = a;
        mfVar.f137260a = 6;
        return (C52289mf) mcVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
