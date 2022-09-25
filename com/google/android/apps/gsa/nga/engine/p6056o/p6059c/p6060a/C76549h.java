package com.google.android.apps.gsa.nga.engine.p6056o.p6059c.p6060a;

import android.os.Trace;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.a.h */
/* compiled from: PG */
public final /* synthetic */ class C76549h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76550i f211781a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f211782b;

    /* renamed from: c */
    public final /* synthetic */ C76590bg f211783c;

    public /* synthetic */ C76549h(C76550i iVar, C74965n nVar, C76590bg bgVar) {
        this.f211781a = iVar;
        this.f211782b = nVar;
        this.f211783c = bgVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76550i iVar = this.f211781a;
        C74965n nVar = this.f211782b;
        C76590bg bgVar = this.f211783c;
        if (!((Boolean) obj).booleanValue()) {
            C83320io k = nVar.mo71336k();
            if (iVar.f211784a.mo71711a().mo72252d().isPresent()) {
                iVar.f211784a.mo71711a().mo72252d().get();
            }
            iVar.f211785b.ifPresent(new C76547f(k));
            return C60856cj.m92900i(C80401n.f220656k);
        }
        String str = nVar.mo71336k().f227136c;
        String str2 = nVar.mo71336k().f227135b;
        int g = iVar.mo71711a().mo72256g();
        int i = g - 1;
        if (g != 0) {
            Trace.beginSection(str + " " + str2 + " EVENT_TYPE_" + i);
            try {
                return iVar.f211784a.mo71712b(bgVar, nVar);
            } finally {
                Trace.endSection();
            }
        } else {
            throw null;
        }
    }
}
