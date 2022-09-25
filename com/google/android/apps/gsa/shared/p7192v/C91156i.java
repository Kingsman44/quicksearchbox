package com.google.android.apps.gsa.shared.p7192v;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.search.googleapp.p10370p.C136866bf;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p5451f.p5452a.p5453a.p5454a.C69447l;

/* renamed from: com.google.android.apps.gsa.shared.v.i */
/* compiled from: PG */
public final /* synthetic */ class C91156i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ long f254499a;

    /* renamed from: b */
    public final /* synthetic */ C86124t f254500b;

    /* renamed from: c */
    public final /* synthetic */ C42876ab f254501c;

    /* renamed from: d */
    public final /* synthetic */ C21370a f254502d;

    /* renamed from: e */
    public final /* synthetic */ C69447l f254503e;

    /* renamed from: f */
    public final /* synthetic */ int f254504f;

    /* renamed from: g */
    public final /* synthetic */ int f254505g;

    public /* synthetic */ C91156i(long j, C86124t tVar, C42876ab abVar, C21370a aVar, C69447l lVar, int i, int i2) {
        this.f254499a = j;
        this.f254500b = tVar;
        this.f254501c = abVar;
        this.f254502d = aVar;
        this.f254503e = lVar;
        this.f254504f = i;
        this.f254505g = i2;
    }

    public final C60870cx apply(Object obj) {
        long j = this.f254499a;
        C86124t tVar = this.f254500b;
        C42876ab abVar = this.f254501c;
        C21370a aVar = this.f254502d;
        C69447l lVar = this.f254503e;
        int i = this.f254504f;
        int i2 = this.f254505g;
        C136866bf bfVar = (C136866bf) obj;
        C58528ij ijVar = C91165r.f254530a;
        if (bfVar.mo113418c(j)) {
            return C60856cj.m92900i(C91165r.m148948w(bfVar, j, lVar, i, i2));
        }
        C60870cx h = C60922j.m93045h(C91165r.m148929d(tVar, abVar, aVar), new C91164q(abVar, j, lVar, i, i2), C60826bg.f164896a);
        C90476a aVar2 = C91018d.f254254a;
        return h;
    }
}
