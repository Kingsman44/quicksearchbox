package com.google.android.libraries.search.silk.p3162a.p3164b;

import android.content.Context;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.android.libraries.silk.p3205a.p3214c.C41717a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4299d.C56674b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4299d.C56676d;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import com.google.p4283bv.p4412k.p4413a.C57836d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.silk.a.b.l */
/* compiled from: PG */
public final class C40562l implements C41717a {

    /* renamed from: a */
    public static final C56848d f106445a;

    /* renamed from: b */
    public static final C56848d f106446b;

    /* renamed from: c */
    public static final C56848d f106447c;

    /* renamed from: d */
    public static final C56848d f106448d;

    /* renamed from: e */
    public static final C56848d f106449e;

    /* renamed from: f */
    public final Context f106450f;

    /* renamed from: g */
    public final C37419bx f106451g;

    /* renamed from: h */
    public final C60888db f106452h;

    /* renamed from: i */
    public final Executor f106453i;

    /* renamed from: j */
    public final C58833ax f106454j;

    /* renamed from: k */
    public C37404bi f106455k;

    /* renamed from: l */
    public C60872cz f106456l;

    /* renamed from: m */
    public C60870cx f106457m;

    /* renamed from: n */
    public C60870cx f106458n;

    /* renamed from: o */
    public C2164c f106459o;

    /* renamed from: p */
    public C57836d f106460p;

    /* renamed from: q */
    public C37402bg f106461q;

    /* renamed from: r */
    public int f106462r = 1;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        dVar.f151671a |= 1;
        dVar.f151672b = "permission_denied";
        cVar.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar.instance;
        dVar2.f151671a |= 2;
        dVar2.f151673c = "App does not have RECORD_AUDIO permission.";
        f106445a = (C56848d) cVar.build();
        C56847c cVar2 = (C56847c) C56848d.f151669d.createBuilder();
        cVar2.copyOnWrite();
        C56848d dVar3 = (C56848d) cVar2.instance;
        dVar3.f151671a |= 1;
        dVar3.f151672b = "not_ready_to_record";
        cVar2.copyOnWrite();
        C56848d dVar4 = (C56848d) cVar2.instance;
        dVar4.f151671a |= 2;
        dVar4.f151673c = "Service is not ready, call prepareToRecord() before calling record().";
        f106446b = (C56848d) cVar2.build();
        C56847c cVar3 = (C56847c) C56848d.f151669d.createBuilder();
        cVar3.copyOnWrite();
        C56848d dVar5 = (C56848d) cVar3.instance;
        dVar5.f151671a |= 1;
        dVar5.f151672b = "already_recording";
        cVar3.copyOnWrite();
        C56848d dVar6 = (C56848d) cVar3.instance;
        dVar6.f151671a |= 2;
        dVar6.f151673c = "Cannot start a new recording while there's an ongoing recording.";
        f106447c = (C56848d) cVar3.build();
        C56847c cVar4 = (C56847c) C56848d.f151669d.createBuilder();
        cVar4.copyOnWrite();
        C56848d dVar7 = (C56848d) cVar4.instance;
        dVar7.f151671a |= 1;
        dVar7.f151672b = "could_not_close_listening_session";
        cVar4.copyOnWrite();
        C56848d dVar8 = (C56848d) cVar4.instance;
        dVar8.f151671a |= 2;
        dVar8.f151673c = "Failed closing listening session.";
        f106448d = (C56848d) cVar4.build();
        C56847c cVar5 = (C56847c) C56848d.f151669d.createBuilder();
        cVar5.copyOnWrite();
        C56848d dVar9 = (C56848d) cVar5.instance;
        dVar9.f151671a |= 1;
        dVar9.f151672b = "could_not_open_listening_session";
        cVar5.copyOnWrite();
        C56848d dVar10 = (C56848d) cVar5.instance;
        dVar10.f151671a |= 2;
        dVar10.f151673c = "Listening session could not be opened.";
        f106449e = (C56848d) cVar5.build();
    }

    public C40562l(Context context, C37419bx bxVar, C60888db dbVar, Executor executor, C58833ax axVar) {
        this.f106450f = context;
        this.f106451g = bxVar;
        this.f106452h = dbVar;
        this.f106453i = new C60904dr(executor);
        this.f106454j = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo42514a(C56674b bVar) {
        C57836d dVar = bVar.f151282a;
        if (dVar == null) {
            dVar = C57836d.f154528b;
        }
        C40556f fVar = new C40556f(this, dVar);
        return C60856cj.m92905n(C47810es.m84965e(fVar), this.f106453i);
    }

    /* renamed from: b */
    public final C60870cx mo42515b(C56676d dVar) {
        C40551a aVar = new C40551a(this, dVar.f151286a);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(aVar), this.f106453i);
        C40561k kVar = new C40561k(this);
        C60856cj.m92911t(n, C47810es.m84974n(kVar), this.f106453i);
        return n;
    }

    /* renamed from: c */
    public final C60870cx mo42516c() {
        return C60856cj.m92903l(new C40560j(this), this.f106453i);
    }

    /* renamed from: d */
    public final void mo42517d() {
        C37402bg bgVar;
        int i = this.f106462r;
        if (i != 0) {
            if (i == 3 && (bgVar = this.f106461q) != null) {
                bgVar.mo20354a();
            }
            this.f106455k = null;
            this.f106456l = null;
            this.f106457m = null;
            this.f106458n = null;
            this.f106460p = null;
            this.f106462r = 1;
            return;
        }
        throw null;
    }
}
