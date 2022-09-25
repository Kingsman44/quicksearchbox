package com.google.android.apps.gsa.shared.logger.p7055e.p7056a;

import com.google.android.apps.gsa.shared.logger.p7055e.C89887a;
import com.google.android.apps.gsa.shared.logger.p7055e.C89905b;
import com.google.android.apps.gsa.shared.logger.p7055e.C89909c;
import com.google.android.apps.gsa.shared.logger.p7055e.C89910d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.C59791fs;
import com.google.common.p4552o.C59792ft;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.shared.logger.e.a.e */
/* compiled from: PG */
public final class C89904e implements C89910d {

    /* renamed from: a */
    private static final C89903d f246322a = new C89903d();

    /* renamed from: b */
    private final ConcurrentMap f246323b = new ConcurrentHashMap();

    /* renamed from: c */
    private final C21370a f246324c;

    /* renamed from: d */
    private long f246325d;

    /* renamed from: e */
    private final EnumSet f246326e = EnumSet.noneOf(C59791fs.class);

    /* renamed from: f */
    private int f246327f = 1;

    static {
        new C89888a("NoOpAggregator", C59791fs.UNKNOWN);
    }

    public C89904e(C21370a aVar) {
        this.f246324c = aVar;
        this.f246325d = aVar.mo26871c();
    }

    /* renamed from: a */
    public final C89905b mo83748a() {
        ArrayList arrayList = new ArrayList(this.f246323b.size());
        for (C89909c b : this.f246323b.values()) {
            C59792ft b2 = b.mo83744b();
            if (b2.f161566d > 0) {
                arrayList.add(b2);
            }
        }
        C89887a aVar = (C89887a) C89905b.f246328e.createBuilder();
        long j = this.f246325d;
        aVar.copyOnWrite();
        C89905b bVar = (C89905b) aVar.instance;
        bVar.f246330a |= 1;
        bVar.f246332c = j;
        aVar.mo83726a(arrayList);
        this.f246325d = this.f246324c.mo26871c();
        return (C89905b) aVar.build();
    }

    /* renamed from: c */
    public final List mo83750c() {
        ArrayList arrayList = new ArrayList(this.f246323b.size());
        for (C89909c a : this.f246323b.values()) {
            C59792ft a2 = a.mo83743a();
            if (a2.f161566d > 0) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final boolean mo83751d(C59791fs fsVar) {
        return this.f246326e.contains(fsVar);
    }

    /* renamed from: e */
    public final void mo83752e(C59791fs fsVar) {
        this.f246326e.add(fsVar);
    }

    /* renamed from: f */
    public final void mo83753f() {
        this.f246327f = 3;
    }

    /* renamed from: b */
    public final C89909c mo83749b(String str, C59791fs fsVar) {
        int i = this.f246327f;
        if (i == 0) {
            throw null;
        } else if (i == 1 || !this.f246326e.contains(fsVar)) {
            return f246322a;
        } else {
            C89888a aVar = new C89888a(str, fsVar);
            C89902c cVar = new C89902c(aVar);
            C89909c cVar2 = (C89909c) this.f246323b.putIfAbsent(aVar, cVar);
            return cVar2 != null ? cVar2 : cVar;
        }
    }
}
