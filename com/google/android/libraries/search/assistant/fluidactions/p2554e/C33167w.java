package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45634an;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45640at;
import com.google.assistant.p3897e.p3921j.C52622yo;
import com.google.assistant.p3897e.p3921j.C52625yr;
import com.google.assistant.p3897e.p3921j.C52628yu;
import com.google.assistant.p3897e.p3921j.C52629yv;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.w */
/* compiled from: PG */
public final /* synthetic */ class C33167w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52622yo f88724a;

    public /* synthetic */ C33167w(C52622yo yoVar) {
        this.f88724a = yoVar;
    }

    public final void accept(Object obj) {
        C52622yo yoVar = this.f88724a;
        C45640at atVar = (C45640at) obj;
        C52628yu yuVar = (C52628yu) C52629yv.f138180g.createBuilder();
        if ((atVar.f120067a & 16) != 0) {
            String str = atVar.f120071e;
            yuVar.copyOnWrite();
            C52629yv yvVar = (C52629yv) yuVar.instance;
            str.getClass();
            yvVar.f138182a |= 8;
            yvVar.f138186e = str;
        }
        if ((atVar.f120067a & 4) != 0) {
            String str2 = atVar.f120070d;
            yuVar.copyOnWrite();
            C52629yv yvVar2 = (C52629yv) yuVar.instance;
            str2.getClass();
            yvVar2.f138182a |= 4;
            yvVar2.f138185d = str2;
        }
        if ((atVar.f120067a & 2) != 0) {
            String str3 = atVar.f120069c;
            yuVar.copyOnWrite();
            C52629yv yvVar3 = (C52629yv) yuVar.instance;
            str3.getClass();
            yvVar3.f138182a |= 2;
            yvVar3.f138184c = str3;
        }
        if ((atVar.f120067a & 32) != 0) {
            String str4 = atVar.f120072f;
            yuVar.copyOnWrite();
            C52629yv yvVar4 = (C52629yv) yuVar.instance;
            str4.getClass();
            yvVar4.f138182a |= 16;
            yvVar4.f138187f = str4;
        }
        if ((atVar.f120067a & 1) != 0) {
            C45634an anVar = atVar.f120068b;
            if (anVar == null) {
                anVar = C45634an.f120041e;
            }
            C52625yr c = C33169y.m61529c(anVar);
            yuVar.copyOnWrite();
            C52629yv yvVar5 = (C52629yv) yuVar.instance;
            c.getClass();
            yvVar5.f138183b = c;
            yvVar5.f138182a |= 1;
        }
        yoVar.mo53895h((C52629yv) yuVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
