package com.google.android.apps.search.assistant.verticals.ambient.p9930k;

import com.google.assistant.p4016z.C53706bd;
import java.util.Comparator;
import java.util.Map;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.q */
/* compiled from: PG */
public final /* synthetic */ class C130876q implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C130876q f358155a = new C130876q();

    private /* synthetic */ C130876q() {
    }

    public final int compare(Object obj, Object obj2) {
        Collector collector = C130881v.f358160a;
        C53706bd bdVar = (C53706bd) ((Map.Entry) obj).getKey();
        C53706bd bdVar2 = (C53706bd) ((Map.Entry) obj2).getKey();
        if (bdVar == bdVar2) {
            return 0;
        }
        if (bdVar == C53706bd.UNKNOWN) {
            return 1;
        }
        if (bdVar2 == C53706bd.UNKNOWN) {
            return -1;
        }
        return bdVar.f140990e - bdVar2.f140990e;
    }
}
