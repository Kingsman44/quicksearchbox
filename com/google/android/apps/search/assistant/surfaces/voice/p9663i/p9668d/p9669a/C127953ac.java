package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a;

import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128046o;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.assistant.p3897e.p3917i.p3918a.C51345eg;
import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.assistant.p3897e.p3917i.p3918a.C51348ej;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C127953ac implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C127960aj f352193a;

    /* renamed from: b */
    public final /* synthetic */ String f352194b;

    public /* synthetic */ C127953ac(C127960aj ajVar, String str) {
        this.f352193a = ajVar;
        this.f352194b = str;
    }

    public final Object apply(Object obj) {
        C127960aj ajVar = this.f352193a;
        String str = this.f352194b;
        C37215b bVar = ajVar.f352202a;
        C37252a c = ajVar.f352204c.mo40779c();
        c.mo40795s("motionSignalId", str);
        bVar.mo19974a(c);
        C51345eg egVar = (C51345eg) C51348ej.f133744d.createBuilder();
        C51347ei eiVar = ajVar.f352203b;
        egVar.copyOnWrite();
        C51348ej ejVar = (C51348ej) egVar.instance;
        ejVar.f133747b = eiVar.f133743i;
        ejVar.f133746a |= 1;
        double applyAsDouble = ajVar.f352206e.applyAsDouble((C128046o) obj);
        egVar.copyOnWrite();
        C51348ej ejVar2 = (C51348ej) egVar.instance;
        ejVar2.f133746a |= 2;
        ejVar2.f133748c = (float) applyAsDouble;
        return (C51348ej) egVar.build();
    }
}
