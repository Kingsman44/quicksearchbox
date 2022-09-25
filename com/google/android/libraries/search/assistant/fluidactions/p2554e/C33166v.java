package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45626af;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45634an;
import com.google.assistant.p3897e.p3921j.C52620ym;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52622yo;
import com.google.assistant.p3897e.p3921j.C52625yr;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.v */
/* compiled from: PG */
public final /* synthetic */ class C33166v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52622yo f88723a;

    public /* synthetic */ C33166v(C52622yo yoVar) {
        this.f88723a = yoVar;
    }

    public final void accept(Object obj) {
        C52622yo yoVar = this.f88723a;
        C45626af afVar = (C45626af) obj;
        C52620ym ymVar = (C52620ym) C52621yn.f138154g.createBuilder();
        if ((afVar.f120004a & 2) != 0) {
            String str = afVar.f120006c;
            ymVar.copyOnWrite();
            C52621yn ynVar = (C52621yn) ymVar.instance;
            str.getClass();
            ynVar.f138156a |= 2;
            ynVar.f138158c = str;
        }
        if ((afVar.f120004a & 128) != 0) {
            String str2 = afVar.f120008e;
            ymVar.copyOnWrite();
            C52621yn ynVar2 = (C52621yn) ymVar.instance;
            str2.getClass();
            ynVar2.f138156a |= 16;
            ynVar2.f138161f = str2;
        }
        if ((afVar.f120004a & 64) != 0) {
            String str3 = afVar.f120007d;
            ymVar.copyOnWrite();
            C52621yn ynVar3 = (C52621yn) ymVar.instance;
            str3.getClass();
            ynVar3.f138156a |= 4;
            ynVar3.f138159d = str3;
        }
        if ((afVar.f120004a & 256) != 0) {
            String str4 = afVar.f120009f;
            ymVar.copyOnWrite();
            C52621yn ynVar4 = (C52621yn) ymVar.instance;
            str4.getClass();
            ynVar4.f138156a |= 8;
            ynVar4.f138160e = str4;
        }
        if ((afVar.f120004a & 1) != 0) {
            C45634an anVar = afVar.f120005b;
            if (anVar == null) {
                anVar = C45634an.f120041e;
            }
            C52625yr c = C33169y.m61529c(anVar);
            ymVar.copyOnWrite();
            C52621yn ynVar5 = (C52621yn) ymVar.instance;
            c.getClass();
            ynVar5.f138157b = c;
            ynVar5.f138156a |= 1;
        }
        yoVar.mo53893f((C52621yn) ymVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
