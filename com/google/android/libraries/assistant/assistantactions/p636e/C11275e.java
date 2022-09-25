package com.google.android.libraries.assistant.assistantactions.p636e;

import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45631ak;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45634an;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45639as;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45640at;
import com.google.assistant.p3897e.p3921j.C52625yr;
import com.google.assistant.p3897e.p3921j.C52629yv;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.assistantactions.e.e */
/* compiled from: PG */
public final /* synthetic */ class C11275e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C45631ak f36696a;

    public /* synthetic */ C11275e(C45631ak akVar) {
        this.f36696a = akVar;
    }

    public final void accept(Object obj) {
        C45631ak akVar = this.f36696a;
        C52629yv yvVar = (C52629yv) obj;
        C45639as asVar = (C45639as) C45640at.f120065g.createBuilder();
        if ((yvVar.f138182a & 8) != 0) {
            String str = yvVar.f138186e;
            asVar.copyOnWrite();
            C45640at atVar = (C45640at) asVar.instance;
            str.getClass();
            atVar.f120067a |= 16;
            atVar.f120071e = str;
        }
        if ((yvVar.f138182a & 4) != 0) {
            String str2 = yvVar.f138185d;
            asVar.copyOnWrite();
            C45640at atVar2 = (C45640at) asVar.instance;
            str2.getClass();
            atVar2.f120067a |= 4;
            atVar2.f120070d = str2;
        }
        if ((yvVar.f138182a & 2) != 0) {
            String str3 = yvVar.f138184c;
            asVar.copyOnWrite();
            C45640at atVar3 = (C45640at) asVar.instance;
            str3.getClass();
            atVar3.f120067a |= 2;
            atVar3.f120069c = str3;
        }
        if ((yvVar.f138182a & 16) != 0) {
            String str4 = yvVar.f138187f;
            asVar.copyOnWrite();
            C45640at atVar4 = (C45640at) asVar.instance;
            str4.getClass();
            atVar4.f120067a |= 32;
            atVar4.f120072f = str4;
        }
        if ((yvVar.f138182a & 1) != 0) {
            C52625yr yrVar = yvVar.f138183b;
            if (yrVar == null) {
                yrVar = C52625yr.f138170e;
            }
            C45634an a = C11277g.m26766a(yrVar);
            asVar.copyOnWrite();
            C45640at atVar5 = (C45640at) asVar.instance;
            a.getClass();
            atVar5.f120068b = a;
            atVar5.f120067a |= 1;
        }
        akVar.mo49719i((C45640at) asVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
