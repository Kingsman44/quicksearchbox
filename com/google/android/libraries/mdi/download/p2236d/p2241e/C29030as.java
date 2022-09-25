package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.common.base.C58817ah;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.mdi.download.d.e.as */
/* compiled from: PG */
public final /* synthetic */ class C29030as implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Set f78798a;

    /* renamed from: b */
    public final /* synthetic */ C29398ev f78799b;

    /* renamed from: c */
    public final /* synthetic */ AtomicLong f78800c;

    /* renamed from: d */
    public final /* synthetic */ Set f78801d;

    /* renamed from: e */
    public final /* synthetic */ boolean f78802e;

    /* renamed from: f */
    public final /* synthetic */ C29033av f78803f;

    /* renamed from: g */
    public final /* synthetic */ C28816c f78804g;

    /* renamed from: h */
    public final /* synthetic */ Set f78805h;

    public /* synthetic */ C29030as(Set set, C29398ev evVar, AtomicLong atomicLong, Set set2, boolean z, C29033av avVar, C28816c cVar, Set set3) {
        this.f78798a = set;
        this.f78799b = evVar;
        this.f78800c = atomicLong;
        this.f78801d = set2;
        this.f78802e = z;
        this.f78803f = avVar;
        this.f78804g = cVar;
        this.f78805h = set3;
    }

    public final Object apply(Object obj) {
        Set set = this.f78798a;
        C29398ev evVar = this.f78799b;
        AtomicLong atomicLong = this.f78800c;
        Set set2 = this.f78801d;
        boolean z = this.f78802e;
        C29033av avVar = this.f78803f;
        C28816c cVar = this.f78804g;
        Set set3 = this.f78805h;
        Long l = (Long) obj;
        if (!set.contains(evVar)) {
            atomicLong.getAndAdd(l.longValue());
            set.add(evVar);
        }
        if (!set2.contains(evVar)) {
            if (z) {
                avVar.f78814b += l.longValue();
            }
            avVar.f78813a += l.longValue();
            set2.add(evVar);
        }
        if (!cVar.mo34484b().f79685e) {
            return null;
        }
        set3.getClass();
        if (set3.contains(evVar)) {
            return null;
        }
        if (z) {
            avVar.f78816d += l.longValue();
            avVar.f78818f++;
        }
        avVar.f78815c += l.longValue();
        set3.add(evVar);
        return null;
    }
}
