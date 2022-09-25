package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128126a;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128150b;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128152c;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128194e;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128218h;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128220j;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128181m;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n;
import com.google.protobuf.C62995dn;
import java.util.Collections;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.c.h */
/* compiled from: PG */
public final /* synthetic */ class C128160h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C128218h f352564a;

    /* renamed from: b */
    public final /* synthetic */ C128182n f352565b;

    /* renamed from: c */
    public final /* synthetic */ Instant f352566c;

    public /* synthetic */ C128160h(C128218h hVar, C128182n nVar, Instant instant) {
        this.f352564a = hVar;
        this.f352565b = nVar;
        this.f352566c = instant;
    }

    public final void accept(Object obj) {
        C128218h hVar = this.f352564a;
        C128182n nVar = this.f352565b;
        Instant instant = this.f352566c;
        String str = (String) obj;
        if (!str.isEmpty()) {
            C128181m a = C128181m.m209263a(nVar.f352634d);
            if (a == null) {
                a = C128181m.UNKNOWN;
            }
            if (a.equals(C128181m.OVER_APP) && nVar.f352632b == 3) {
                String str2 = (String) nVar.f352633c;
                C128194e eVar = C128194e.f352655e;
                str2.getClass();
                Map unmodifiableMap = Collections.unmodifiableMap(((C128220j) hVar.instance).f352704d);
                if (unmodifiableMap.containsKey(str2)) {
                    eVar = (C128194e) unmodifiableMap.get(str2);
                }
                C128150b bVar = C128150b.f352549d;
                str.getClass();
                C62995dn dnVar = eVar.f352660d;
                if (dnVar.containsKey(str)) {
                    bVar = (C128150b) dnVar.get(str);
                }
                long j = bVar.f352552b;
                C128152c cVar = (C128152c) eVar.toBuilder();
                C128126a aVar = (C128126a) bVar.toBuilder();
                aVar.copyOnWrite();
                C128150b bVar2 = (C128150b) aVar.instance;
                bVar2.f352551a |= 1;
                bVar2.f352552b = j + 1;
                long epochMilli = instant.toEpochMilli();
                aVar.copyOnWrite();
                C128150b bVar3 = (C128150b) aVar.instance;
                bVar3.f352551a |= 2;
                bVar3.f352553c = epochMilli;
                cVar.mo108347a(str, (C128150b) aVar.build());
                long j2 = eVar.f352658b;
                cVar.copyOnWrite();
                C128194e eVar2 = (C128194e) cVar.instance;
                eVar2.f352657a |= 1;
                eVar2.f352658b = j2 + 1;
                long epochMilli2 = instant.toEpochMilli();
                cVar.copyOnWrite();
                C128194e eVar3 = (C128194e) cVar.instance;
                eVar3.f352657a |= 2;
                eVar3.f352659c = epochMilli2;
                C128194e eVar4 = (C128194e) cVar.build();
                hVar.mo108368b(str2, eVar4);
                long j3 = eVar4.f352658b;
            }
            C128150b a2 = hVar.mo108367a(str, C128150b.f352549d);
            long j4 = a2.f352552b;
            C128126a aVar2 = (C128126a) a2.toBuilder();
            aVar2.copyOnWrite();
            C128150b bVar4 = (C128150b) aVar2.instance;
            bVar4.f352551a |= 1;
            bVar4.f352552b = j4 + 1;
            long epochMilli3 = instant.toEpochMilli();
            aVar2.copyOnWrite();
            C128150b bVar5 = (C128150b) aVar2.instance;
            bVar5.f352551a |= 2;
            bVar5.f352553c = epochMilli3;
            hVar.mo108369c(str, (C128150b) aVar2.build());
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
