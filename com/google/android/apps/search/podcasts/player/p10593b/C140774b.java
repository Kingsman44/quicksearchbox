package com.google.android.apps.search.podcasts.player.p10593b;

import com.google.android.gms.cast.framework.C143409aq;
import com.google.android.gms.cast.framework.C143411as;
import com.google.android.gms.cast.framework.C143466m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.podcasts.player.b.b */
/* compiled from: PG */
public final class C140774b implements C143411as {

    /* renamed from: a */
    private static final C59071e f382255a = C59071e.m91331h();

    /* renamed from: b */
    private final Executor f382256b;

    /* renamed from: c */
    private final Runnable f382257c;

    public C140774b(Executor executor, Runnable runnable) {
        this.f382256b = executor;
        this.f382257c = runnable;
    }

    /* renamed from: a */
    public final void mo115866a() {
        this.f382256b.execute(this.f382257c);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo6038g(C143409aq aqVar, int i) {
        C143466m mVar = (C143466m) aqVar;
        mo115866a();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo6039h(C143409aq aqVar) {
        C143466m mVar = (C143466m) aqVar;
    }

    /* renamed from: i */
    public final /* synthetic */ void mo6040i(C143409aq aqVar, int i) {
        C143466m mVar = (C143466m) aqVar;
        C59052c cVar = (C59052c) f382255a.mo56226d();
        cVar.mo56379ah(new C59094n(41627));
        cVar.mo56387q("Cast session resume failed, error %d", i);
        mo115866a();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo6041j(C143409aq aqVar, boolean z) {
        C143466m mVar = (C143466m) aqVar;
        mo115866a();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo6042k(C143409aq aqVar, String str) {
        C143466m mVar = (C143466m) aqVar;
    }

    /* renamed from: l */
    public final /* synthetic */ void mo6043l(C143409aq aqVar, int i) {
        C143466m mVar = (C143466m) aqVar;
        C59052c cVar = (C59052c) f382255a.mo56226d();
        cVar.mo56379ah(new C59094n(41630));
        cVar.mo56387q("Cast session start failed, error: %d", i);
        mo115866a();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ void mo6044m(C143409aq aqVar, String str) {
        C143466m mVar = (C143466m) aqVar;
        mo115866a();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void mo6045n(C143409aq aqVar) {
        C143466m mVar = (C143466m) aqVar;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ void mo6046o(C143409aq aqVar, int i) {
        C143466m mVar = (C143466m) aqVar;
        mo115866a();
    }
}
