package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6218v.p6219a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6168c.C78252a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6218v.C78840a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6218v.C78846b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.v.a.d */
/* compiled from: PG */
public final class C78844d implements C78252a, C78728n {

    /* renamed from: b */
    private static final Duration f216989b = Duration.ofMillis(700);

    /* renamed from: a */
    public final C83358h f216990a;

    /* renamed from: c */
    private final C22871g f216991c;

    /* renamed from: d */
    private final C83357g f216992d;

    /* renamed from: e */
    private final C83363m f216993e = new C83363m();

    /* renamed from: f */
    private C60870cx f216994f = C60856cj.m92898g();

    public C78844d(C22871g gVar, C83357g gVar2, C83358h hVar) {
        this.f216991c = gVar;
        this.f216992d = gVar2;
        this.f216990a = hVar;
    }

    /* renamed from: e */
    private final C78846b m126656e() {
        return (C78846b) this.f216992d.mo76657c();
    }

    /* renamed from: a */
    public final void mo73197a(String str) {
        this.f216991c.mo28212l("[NGA] onTranscriptionCleared", new C78843c(this, str));
    }

    /* renamed from: b */
    public final void mo73647b(C78846b bVar) {
        this.f216994f.cancel(true);
        this.f216992d.mo76660b(new C78840a(((C78840a) bVar).f216983a, 1));
        m126656e();
    }

    /* renamed from: c */
    public final void mo73648c() {
        this.f216994f.cancel(true);
        this.f216994f = this.f216991c.mo28208h("[NGA] TranscriptionController.timeoutTranscription", f216989b.toMillis(), new C78842b(this));
    }

    /* renamed from: d */
    public final void mo73649d(boolean z) {
        C78840a aVar;
        this.f216994f.cancel(true);
        C83357g gVar = this.f216992d;
        if (z) {
            aVar = new C78840a(m126656e().mo73642a(), 3);
        } else {
            aVar = new C78840a(m126656e().mo73642a(), 2);
        }
        gVar.mo76660b(aVar);
        m126656e();
    }

    /* renamed from: h */
    public final void mo73112h() {
        this.f216993e.mo76661a();
        this.f216994f.cancel(true);
    }

    /* renamed from: i */
    public final void mo73113i() {
        this.f216993e.mo76663c(this.f216990a, new C78841a(this));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }
}
