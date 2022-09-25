package com.google.android.apps.search.googleapp.launcher.p10341b.p10343b;

import android.content.Context;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136443b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10345d.C136460b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.android.libraries.search.logging.p3034a.C38769r;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4561g.C59800a;
import com.google.common.p4552o.p4561g.C59801b;
import com.google.common.p4552o.p4561g.C59802c;
import com.google.common.p4552o.p4561g.C59803d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.b.b */
/* compiled from: PG */
public final class C136445b {

    /* renamed from: a */
    public final boolean f371479a;

    /* renamed from: b */
    public final boolean f371480b;

    /* renamed from: c */
    public final C136460b f371481c;

    /* renamed from: d */
    public final C21370a f371482d;

    /* renamed from: e */
    public final Duration f371483e;

    /* renamed from: f */
    public Optional f371484f = Optional.empty();

    /* renamed from: g */
    private final Executor f371485g;

    /* renamed from: h */
    private C60870cx f371486h;

    /* renamed from: i */
    private final Context f371487i;

    /* renamed from: com.google.android.apps.search.googleapp.launcher.b.b.b$a */
    /* compiled from: PG */
    public interface C136446a {
        /* renamed from: nT */
        C38769r mo113052nT();
    }

    public C136445b(boolean z, boolean z2, long j, C136460b bVar, C21370a aVar, Context context, Executor executor) {
        this.f371479a = z;
        this.f371480b = z2;
        this.f371483e = Duration.ofHours(j);
        this.f371481c = bVar;
        this.f371482d = aVar;
        this.f371487i = context;
        this.f371485g = new C60904dr(executor);
    }

    /* renamed from: d */
    private static boolean m221746d(int i) {
        return i >= 0 && i != Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final C38768q mo113049a() {
        return ((C136446a) C47245e.m84045a(this.f371487i, C136446a.class, (AccountId) this.f371484f.get())).mo113052nT().mo41618a(C38828b.GOOGLE_APP);
    }

    /* renamed from: b */
    public final void mo113050b(int i, int i2, C136443b bVar) {
        C59743a aVar;
        if (this.f371479a) {
            C59802c cVar = (C59802c) C59803d.f161615f.createBuilder();
            if (m221746d(i)) {
                cVar.copyOnWrite();
                C59803d dVar = (C59803d) cVar.instance;
                dVar.f161617a |= 1;
                dVar.f161618b = i;
            }
            if (m221746d(i2)) {
                cVar.copyOnWrite();
                C59803d dVar2 = (C59803d) cVar.instance;
                dVar2.f161617a |= 2;
                dVar2.f161619c = i2;
            }
            boolean e = bVar.mo113044e();
            cVar.copyOnWrite();
            C59803d dVar3 = (C59803d) cVar.instance;
            dVar3.f161617a |= 4;
            dVar3.f161620d = e;
            boolean h = bVar.mo113047h();
            cVar.copyOnWrite();
            C59803d dVar4 = (C59803d) cVar.instance;
            dVar4.f161617a |= 8;
            dVar4.f161621e = h;
            if (bVar.mo113048i()) {
                if (bVar.mo113043d()) {
                    aVar = C59743a.ACETONE_SERVICE_SHARED_OVERLAY_GOOGLE_ACTIVE;
                } else {
                    aVar = C59743a.ACETONE_SERVICE_SHARED_OVERLAY_OEM_ACTIVE;
                }
            } else if (bVar.mo113045f()) {
                aVar = C59743a.ACETONE_SERVICE_GOOGLE_OVERLAY;
            } else {
                aVar = C59743a.ACETONE_SERVICE_NO_OVERLAY;
            }
            C38768q a = mo113049a();
            C62940bt btVar = C59801b.f161611d;
            C59800a aVar2 = (C59800a) C59801b.f161610c.createBuilder();
            aVar2.copyOnWrite();
            C59801b bVar2 = (C59801b) aVar2.instance;
            C59803d dVar5 = (C59803d) cVar.build();
            dVar5.getClass();
            bVar2.f161614b = dVar5;
            bVar2.f161613a |= 1;
            a.mo41590b(aVar, btVar, (C59801b) aVar2.build());
        }
    }

    /* renamed from: c */
    public final void mo113051c(int i, int i2, C136443b bVar) {
        if (!this.f371484f.isEmpty() && this.f371479a) {
            C60870cx cxVar = this.f371486h;
            if (cxVar == null || cxVar.isDone()) {
                C60870cx d = this.f371481c.f371526a.mo46042d();
                C136444a aVar = new C136444a(this, i, i2, bVar);
                this.f371486h = C60922j.m93044g(d, C47810es.m84963c(aVar), this.f371485g);
            }
        }
    }
}
