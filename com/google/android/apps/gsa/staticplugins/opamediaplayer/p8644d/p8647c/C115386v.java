package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85322b;
import com.google.assistant.p3897e.p3921j.C52171hw;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52568wo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.v */
/* compiled from: PG */
public final /* synthetic */ class C115386v implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f320164a;

    /* renamed from: b */
    public final /* synthetic */ C85322b f320165b;

    public /* synthetic */ C115386v(String str, C85322b bVar) {
        this.f320164a = str;
        this.f320165b = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f320164a;
        C85322b bVar = this.f320165b;
        C52174hz hzVar = (C52174hz) obj;
        if (!hzVar.f136895b.equals(str)) {
            return hzVar;
        }
        C52171hw hwVar = (C52171hw) hzVar.toBuilder();
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52563wj wjVar = (C52563wj) woVar.toBuilder();
        String c = bVar.mo78859c();
        wjVar.copyOnWrite();
        C52568wo woVar2 = (C52568wo) wjVar.instance;
        c.getClass();
        woVar2.f137994a |= 1;
        woVar2.f137998e = c;
        String b = bVar.mo78858b();
        wjVar.copyOnWrite();
        C52568wo woVar3 = (C52568wo) wjVar.instance;
        b.getClass();
        woVar3.f137994a |= 8;
        woVar3.f138000g = b;
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
