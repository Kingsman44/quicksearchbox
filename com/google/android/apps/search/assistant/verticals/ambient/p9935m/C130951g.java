package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.assistant.p3886c.C50847s;
import com.google.assistant.p3886c.C50851w;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.all;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.g */
/* compiled from: PG */
public final /* synthetic */ class C130951g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130964t f358297a;

    /* renamed from: b */
    public final /* synthetic */ int f358298b;

    /* renamed from: c */
    public final /* synthetic */ all f358299c;

    public /* synthetic */ C130951g(C130964t tVar, int i, all all) {
        this.f358297a = tVar;
        this.f358298b = i;
        this.f358299c = all;
    }

    public final Object apply(Object obj) {
        C130964t tVar = this.f358297a;
        int i = this.f358298b;
        all all = this.f358299c;
        C50851w wVar = (C50851w) obj;
        C62995dn dnVar = wVar.f132420d;
        Integer valueOf = Integer.valueOf(i);
        if (dnVar.containsKey(valueOf)) {
            C62995dn dnVar2 = wVar.f132420d;
            if (dnVar2.containsKey(valueOf)) {
                Instant e = C62950b.m95474e((C63042fg) dnVar2.get(valueOf));
                Duration duration = C130964t.f358317d;
                if (e != null && Duration.between(e, tVar.f358318e.mo57444a()).compareTo(duration) <= 0) {
                    return wVar;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        tVar.mo110013g(C58485gu.m89846n(valueOf), all, true, false);
        C50847s sVar = (C50847s) wVar.toBuilder();
        C63042fg b = C62950b.m95471b(tVar.f358318e);
        b.getClass();
        sVar.copyOnWrite();
        C50851w wVar2 = (C50851w) sVar.instance;
        C62995dn dnVar3 = wVar2.f132420d;
        if (!dnVar3.f170058b) {
            wVar2.f132420d = dnVar3.mo58980a();
        }
        wVar2.f132420d.put(valueOf, b);
        return (C50851w) sVar.build();
    }
}
