package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45625ae;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45626af;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45631ak;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45634an;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52625yr;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.t */
/* compiled from: PG */
public final /* synthetic */ class C33164t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C45631ak f88721a;

    public /* synthetic */ C33164t(C45631ak akVar) {
        this.f88721a = akVar;
    }

    public final void accept(Object obj) {
        C45631ak akVar = this.f88721a;
        C52621yn ynVar = (C52621yn) obj;
        C45625ae aeVar = (C45625ae) C45626af.f120002i.createBuilder();
        if ((ynVar.f138156a & 2) != 0) {
            String str = ynVar.f138158c;
            aeVar.copyOnWrite();
            C45626af afVar = (C45626af) aeVar.instance;
            str.getClass();
            afVar.f120004a |= 2;
            afVar.f120006c = str;
        }
        if ((ynVar.f138156a & 16) != 0) {
            String str2 = ynVar.f138161f;
            aeVar.copyOnWrite();
            C45626af afVar2 = (C45626af) aeVar.instance;
            str2.getClass();
            afVar2.f120004a |= 128;
            afVar2.f120008e = str2;
        }
        if ((ynVar.f138156a & 4) != 0) {
            String str3 = ynVar.f138159d;
            aeVar.copyOnWrite();
            C45626af afVar3 = (C45626af) aeVar.instance;
            str3.getClass();
            afVar3.f120004a |= 64;
            afVar3.f120007d = str3;
        }
        if ((ynVar.f138156a & 8) != 0) {
            String str4 = ynVar.f138160e;
            aeVar.copyOnWrite();
            C45626af afVar4 = (C45626af) aeVar.instance;
            str4.getClass();
            afVar4.f120004a |= 256;
            afVar4.f120009f = str4;
        }
        if ((ynVar.f138156a & 1) != 0) {
            C52625yr yrVar = ynVar.f138157b;
            if (yrVar == null) {
                yrVar = C52625yr.f138170e;
            }
            C45634an a = C33169y.m61527a(yrVar);
            aeVar.copyOnWrite();
            C45626af afVar5 = (C45626af) aeVar.instance;
            a.getClass();
            afVar5.f120005b = a;
            afVar5.f120004a |= 1;
        }
        akVar.mo49717g((C45626af) aeVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
