package com.google.android.libraries.p579ar.faceviewer.p580a.p582b;

import android.content.Context;
import com.google.android.libraries.p579ar.faceviewer.p580a.p585e.C10590ak;
import com.google.android.libraries.p579ar.faceviewer.p580a.p585e.C10600au;
import com.google.android.libraries.p579ar.faceviewer.p580a.p585e.C10603d;
import com.google.android.libraries.p579ar.faceviewer.p580a.p585e.C10610k;
import com.google.android.libraries.p579ar.faceviewer.p580a.p586f.C10627b;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10648m;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10650a;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10652c;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10653d;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10654e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.youtube.p5162a.p5163a.C65998o;
import com.google.protos.youtube.p5162a.p5163a.C65999p;
import com.google.protos.youtube.p5162a.p5163a.C66003t;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.b.d */
/* compiled from: PG */
public final class C10570d implements C10652c, C10648m {

    /* renamed from: a */
    public static final C59071e f35358a = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.a.b.d");

    /* renamed from: b */
    public final Context f35359b;

    /* renamed from: c */
    public final SettableFuture f35360c;

    /* renamed from: d */
    public final SettableFuture f35361d;

    /* renamed from: e */
    public C10653d f35362e;

    /* renamed from: f */
    public boolean f35363f = false;

    /* renamed from: g */
    public boolean f35364g;

    /* renamed from: h */
    private final Executor f35365h;

    /* renamed from: i */
    private final Executor f35366i;

    /* renamed from: j */
    private boolean f35367j;

    public C10570d(Context context, Executor executor, Executor executor2, String str) {
        SettableFuture settableFuture = new SettableFuture();
        this.f35360c = settableFuture;
        SettableFuture settableFuture2 = new SettableFuture();
        this.f35361d = settableFuture2;
        this.f35359b = context;
        this.f35365h = executor;
        this.f35366i = executor2;
        C60856cj.m92911t(C10575i.m25550a(context, executor, str), new C10568b(this), executor2);
        settableFuture2.mo57358p(C60922j.m93044g(settableFuture, C10567a.f35355a, executor));
    }

    /* renamed from: a */
    public final void mo18630a() {
        this.f35364g = false;
        this.f35367j = true;
        mo18631d();
    }

    /* renamed from: b */
    public final void mo18627b() {
    }

    /* renamed from: c */
    public final void mo18628c(C10653d dVar) {
        this.f35362e = dVar;
        ((C10650a) dVar).f35549e.f35542a.mo18638g(C10654e.ASSET_DOWNLOAD);
        C10650a aVar = (C10650a) dVar;
        C10600au auVar = aVar.f35549e.f35544c.f35565f;
        C60856cj.m92911t(auVar.f35440j.mo18712b(new C10590ak(auVar)), new C10569c(this), aVar.f35547c);
        if (!aVar.f35545a.mo18694c()) {
            this.f35363f = true;
        }
    }

    /* renamed from: d */
    public final void mo18631d() {
        C10653d dVar;
        if (!this.f35367j) {
            this.f35364g = true;
            ((C10650a) this.f35362e).f35549e.f35544c.f35564e.mo18639d();
        } else if (this.f35363f && (dVar = this.f35362e) != null) {
            C10610k kVar = ((C10650a) dVar).f35549e.f35544c.f35565f.f35438h;
            kVar.mo18658c(new C10603d(kVar));
            C10627b bVar = ((C10650a) this.f35362e).f35549e.f35544c.f35566g.f35514b;
            C65998o oVar = (C65998o) C65999p.f179492c.createBuilder();
            C66003t tVar = C66003t.f179498a;
            oVar.copyOnWrite();
            C65999p pVar = (C65999p) oVar.instance;
            tVar.getClass();
            pVar.f179495b = tVar;
            pVar.f179494a = 12;
            bVar.mo18664b((C65999p) oVar.build());
        }
    }
}
