package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10448e;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62947c;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.e.a */
/* compiled from: PG */
public final /* synthetic */ class C137981a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Instant f375398a;

    /* renamed from: b */
    public final /* synthetic */ boolean f375399b;

    /* renamed from: c */
    public final /* synthetic */ Instant f375400c;

    public /* synthetic */ C137981a(Instant instant, boolean z, Instant instant2) {
        this.f375398a = instant;
        this.f375399b = z;
        this.f375400c = instant2;
    }

    public final Object apply(Object obj) {
        Instant instant = this.f375398a;
        boolean z = this.f375399b;
        Instant instant2 = this.f375400c;
        C137987g gVar = (C137987g) obj;
        List arrayList = new ArrayList(gVar.f375408a);
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            } else if (Instant.ofEpochMilli(((Long) arrayList.get(i)).longValue()).isAfter(instant)) {
                arrayList = arrayList.subList(i, arrayList.size());
                break;
            } else {
                if (i == arrayList.size() - 1) {
                    arrayList = new ArrayList();
                }
                i++;
            }
        }
        C137986f fVar = (C137986f) gVar.toBuilder();
        fVar.copyOnWrite();
        ((C137987g) fVar.instance).f375408a = C137987g.emptyLongList();
        fVar.copyOnWrite();
        C137987g gVar2 = (C137987g) fVar.instance;
        gVar2.mo114071a();
        C62947c.addAll((Iterable) arrayList, (List) gVar2.f375408a);
        C137987g gVar3 = (C137987g) fVar.build();
        if (!z) {
            return gVar3;
        }
        C137986f fVar2 = (C137986f) gVar3.toBuilder();
        long epochMilli = instant2.toEpochMilli();
        fVar2.copyOnWrite();
        C137987g gVar4 = (C137987g) fVar2.instance;
        gVar4.mo114071a();
        gVar4.f375408a.mo58929f(epochMilli);
        return (C137987g) fVar2.build();
    }
}
