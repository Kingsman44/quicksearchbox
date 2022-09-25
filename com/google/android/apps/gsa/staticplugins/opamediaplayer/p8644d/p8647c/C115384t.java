package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.assistant.p3897e.p3921j.C52171hw;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52575wv;
import com.google.assistant.p3897e.p3921j.C52583xc;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.t */
/* compiled from: PG */
public final /* synthetic */ class C115384t implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f320162a;

    public /* synthetic */ C115384t(String str) {
        this.f320162a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52583xc xcVar;
        String str = this.f320162a;
        C52174hz hzVar = (C52174hz) obj;
        C52171hw hwVar = (C52171hw) hzVar.toBuilder();
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52563wj wjVar = (C52563wj) woVar.toBuilder();
        C52568wo woVar2 = hzVar.f136897d;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        if (woVar2.f137996c == 26) {
            xcVar = (C52583xc) woVar2.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52575wv wvVar = (C52575wv) xcVar.toBuilder();
        wvVar.copyOnWrite();
        C52583xc xcVar2 = (C52583xc) wvVar.instance;
        str.getClass();
        xcVar2.f138065a |= 32;
        xcVar2.f138071g = str;
        wjVar.copyOnWrite();
        C52568wo woVar3 = (C52568wo) wjVar.instance;
        C52583xc xcVar3 = (C52583xc) wvVar.build();
        xcVar3.getClass();
        woVar3.f137997d = xcVar3;
        woVar3.f137996c = 26;
        hwVar.copyOnWrite();
        C52174hz hzVar2 = (C52174hz) hwVar.instance;
        C52568wo woVar4 = (C52568wo) wjVar.build();
        woVar4.getClass();
        hzVar2.f136897d = woVar4;
        hzVar2.f136894a |= 8;
        return (C52174hz) hwVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
