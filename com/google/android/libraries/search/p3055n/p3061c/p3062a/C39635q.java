package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import android.media.AudioFormat;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37661hh;
import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.C37767j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.n.c.a.q */
/* compiled from: PG */
public final class C39635q {

    /* renamed from: a */
    public static final C59071e f104345a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.q");

    /* renamed from: a */
    public static C37662hi m69089a(AudioFormat audioFormat, boolean z) {
        ((C59052c) ((C59052c) f104345a.mo56224b()).mo56372aa(53513)).mo56359L("AudioFormat: sample rate : %s, channel config/mask :  %s, encoding format :  %s", Integer.valueOf(audioFormat.getSampleRate()), Integer.valueOf(audioFormat.getChannelMask()), Integer.valueOf(audioFormat.getEncoding()));
        C37661hh hhVar = (C37661hh) C37662hi.f100030g.createBuilder();
        C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
        C37767j jVar = C37767j.f100200a;
        aVar.copyOnWrite();
        C37773c cVar = (C37773c) aVar.instance;
        jVar.getClass();
        cVar.f100246b = jVar;
        cVar.f100245a = 26;
        hhVar.copyOnWrite();
        C37662hi hiVar = (C37662hi) hhVar.instance;
        C37773c cVar2 = (C37773c) aVar.build();
        cVar2.getClass();
        hiVar.f100037f = cVar2;
        hiVar.f100032a |= 16;
        C37357av avVar = (C37357av) C37360ay.f99224l.createBuilder();
        avVar.copyOnWrite();
        C37360ay ayVar = (C37360ay) avVar.instance;
        ayVar.f99226a |= 1;
        ayVar.f99227b = 1999;
        int sampleRate = audioFormat.getSampleRate();
        avVar.copyOnWrite();
        C37360ay ayVar2 = (C37360ay) avVar.instance;
        ayVar2.f99226a |= 2;
        ayVar2.f99228c = sampleRate;
        int channelMask = audioFormat.getChannelMask();
        avVar.copyOnWrite();
        C37360ay ayVar3 = (C37360ay) avVar.instance;
        ayVar3.f99226a |= 4;
        ayVar3.f99229d = channelMask;
        int encoding = audioFormat.getEncoding();
        avVar.copyOnWrite();
        C37360ay ayVar4 = (C37360ay) avVar.instance;
        ayVar4.f99226a |= 8;
        ayVar4.f99230e = encoding;
        avVar.copyOnWrite();
        C37360ay ayVar5 = (C37360ay) avVar.instance;
        ayVar5.f99226a |= 512;
        ayVar5.f99236k = z;
        hhVar.copyOnWrite();
        C37662hi hiVar2 = (C37662hi) hhVar.instance;
        C37360ay ayVar6 = (C37360ay) avVar.build();
        ayVar6.getClass();
        hiVar2.f100035d = ayVar6;
        hiVar2.f100032a |= 1;
        return (C37662hi) hhVar.build();
    }
}
