package com.google.android.apps.search.assistant.libraries.p8956c.p8958b;

import com.google.android.libraries.assistant.p1533o.C18446ai;
import com.google.android.libraries.assistant.p1533o.C18447aj;
import com.google.android.libraries.assistant.p1533o.C18448ak;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.libraries.c.b.a */
/* compiled from: PG */
public final class C119258a {

    /* renamed from: a */
    public static final C59071e f332585a = C59071e.m91332i("com.google.android.apps.search.assistant.libraries.c.b.a");

    /* renamed from: a */
    public static C18448ak m197954a(C18446ai aiVar, Duration duration, Optional optional, C18447aj ajVar) {
        if (optional.isPresent()) {
            long millis = ((Duration) optional.get()).plus(duration).toMillis();
            aiVar.copyOnWrite();
            C18448ak akVar = (C18448ak) aiVar.instance;
            C18448ak akVar2 = C18448ak.f52353e;
            akVar.f52355a |= 1;
            akVar.f52358d = millis;
        }
        long millis2 = duration.toMillis();
        aiVar.copyOnWrite();
        C18448ak akVar3 = C18448ak.f52353e;
        ((C18448ak) aiVar.instance).f52356b = millis2;
        aiVar.copyOnWrite();
        ((C18448ak) aiVar.instance).f52357c = ajVar.getNumber();
        return (C18448ak) aiVar.build();
    }
}
