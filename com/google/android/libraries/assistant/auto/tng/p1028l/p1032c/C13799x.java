package com.google.android.libraries.assistant.auto.tng.p1028l.p1032c;

import com.google.common.base.C58817ah;
import com.google.speech.p5218j.C67037is;
import com.google.speech.p5218j.C67038it;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67095kw;
import com.google.speech.recognizer.p5233a.C67461i;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.c.x */
/* compiled from: PG */
public final /* synthetic */ class C13799x implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C13799x f42000a = new C13799x();

    private /* synthetic */ C13799x() {
    }

    public final Object apply(Object obj) {
        C67463k kVar;
        C67087ko koVar = (C67087ko) obj;
        C67038it itVar = koVar.f182372e;
        if (itVar == null) {
            itVar = C67038it.f182220d;
        }
        if (itVar.f182224c == null) {
            C67095kw kwVar = C67095kw.f182399i;
        }
        C67461i iVar = (C67461i) C67464l.f183356e.createBuilder();
        C67038it itVar2 = koVar.f182372e;
        if (itVar2 == null) {
            itVar2 = C67038it.f182220d;
        }
        C67037is a = C67037is.m97413a(itVar2.f182223b);
        if (a == null) {
            a = C67037is.START_OF_SPEECH;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            kVar = C67463k.START_OF_SPEECH;
        } else if (ordinal == 1) {
            kVar = C67463k.END_OF_SPEECH;
        } else if (ordinal == 2) {
            kVar = C67463k.END_OF_AUDIO;
        } else if (ordinal != 3) {
            kVar = C67463k.END_OF_SPEECH;
        } else {
            kVar = C67463k.END_OF_UTTERANCE;
        }
        iVar.copyOnWrite();
        C67464l lVar = (C67464l) iVar.instance;
        lVar.f183359b = kVar.f183355e;
        lVar.f183358a |= 1;
        C67038it itVar3 = koVar.f182372e;
        if (itVar3 == null) {
            itVar3 = C67038it.f182220d;
        }
        C67095kw kwVar2 = itVar3.f182224c;
        if (kwVar2 == null) {
            kwVar2 = C67095kw.f182399i;
        }
        long j = kwVar2.f182404d;
        iVar.copyOnWrite();
        C67464l lVar2 = (C67464l) iVar.instance;
        lVar2.f183358a |= 2;
        lVar2.f183360c = j;
        return (C67464l) iVar.build();
    }
}
