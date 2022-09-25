package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c;

import com.google.android.apps.gsa.nga.shared.p6345h.C81294by;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128126a;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128150b;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128152c;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128194e;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60887da;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.c.f */
/* compiled from: PG */
public final class C128158f {

    /* renamed from: a */
    public final C42876ab f352561a;

    /* renamed from: b */
    public final C60950i f352562b;

    /* renamed from: c */
    public final C60887da f352563c;

    public C128158f(C42876ab abVar, C60950i iVar, C60887da daVar) {
        this.f352561a = abVar;
        this.f352562b = iVar;
        this.f352563c = daVar;
    }

    /* renamed from: a */
    public static C128194e m209256a(List list, Instant instant) {
        C128152c cVar = (C128152c) C128194e.f352655e.createBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C81294by) it.next()).f222539b;
            C128126a aVar = (C128126a) C128150b.f352549d.createBuilder();
            aVar.copyOnWrite();
            C128150b bVar = (C128150b) aVar.instance;
            bVar.f352551a |= 1;
            bVar.f352552b = 1;
            long epochMilli = instant.toEpochMilli();
            aVar.copyOnWrite();
            C128150b bVar2 = (C128150b) aVar.instance;
            bVar2.f352551a |= 2;
            bVar2.f352553c = epochMilli;
            cVar.mo108347a(str, (C128150b) aVar.build());
        }
        int size = Collections.unmodifiableMap(((C128194e) cVar.instance).f352660d).size();
        cVar.copyOnWrite();
        C128194e eVar = (C128194e) cVar.instance;
        eVar.f352657a |= 1;
        eVar.f352658b = (long) size;
        long epochMilli2 = instant.toEpochMilli();
        cVar.copyOnWrite();
        C128194e eVar2 = (C128194e) cVar.instance;
        eVar2.f352657a |= 2;
        eVar2.f352659c = epochMilli2;
        return (C128194e) cVar.build();
    }
}
