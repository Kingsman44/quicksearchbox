package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6157b.p6158a;

import com.google.android.apps.gsa.nga.engine.p6098r.p6099a.C77481h;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6157b.C78177a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.C78850a;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80711cm;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80712cn;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80845ax;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80852bd;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.b.a.h */
/* compiled from: PG */
public final class C78185h implements C78177a {

    /* renamed from: a */
    public final C78850a f215258a;

    /* renamed from: b */
    public final C22871g f215259b;

    /* renamed from: c */
    public final C22871g f215260c;

    /* renamed from: d */
    public final C77481h f215261d;

    /* renamed from: e */
    private final C83358h f215262e;

    /* renamed from: f */
    private final C60836bq f215263f = new C60836bq();

    public C78185h(C78850a aVar, C22871g gVar, C83358h hVar, C22871g gVar2, C77481h hVar2) {
        this.f215258a = aVar;
        this.f215259b = gVar;
        this.f215262e = hVar;
        this.f215260c = gVar2;
        this.f215261d = hVar2;
    }

    /* renamed from: a */
    public final C60870cx mo73116a(Duration duration) {
        if (!mo73117b()) {
            return C60856cj.m92898g();
        }
        return this.f215263f.mo57305b(new C78178a(this, duration), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final boolean mo73117b() {
        return ((C80852bd) ((C83361k) this.f215262e).f227199b.get()).mo74696b().contains(C80845ax.GO_BACK);
    }

    /* renamed from: c */
    public final void mo73118c(boolean z) {
        C78850a aVar = this.f215258a;
        C80711cm cmVar = (C80711cm) C80712cn.f221586c.createBuilder();
        cmVar.copyOnWrite();
        C80712cn cnVar = (C80712cn) cmVar.instance;
        cnVar.f221588a |= 1;
        cnVar.f221589b = z;
        aVar.mo73657g((C80712cn) cmVar.build());
    }

    /* renamed from: d */
    public final C60870cx mo73119d() {
        return this.f215259b.mo28201a("[NGA] revert unfocusability", new C78179b(this));
    }
}
