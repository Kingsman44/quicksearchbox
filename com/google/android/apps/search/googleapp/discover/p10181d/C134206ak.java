package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59770f;
import com.google.common.p4552o.C60547ty;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.ak */
/* compiled from: PG */
public abstract class C134206ak {

    /* renamed from: a */
    final /* synthetic */ C134212aq f365568a;

    public C134206ak(C134212aq aqVar) {
        this.f365568a = aqVar;
    }

    /* renamed from: a */
    public C59582aj mo111622a() {
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        int i = C60547ty.GOOGLE_APP_ACTIVITY.f164058x;
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160062a |= 524288;
        cbVar.f160141v = i;
        return ajVar;
    }

    /* renamed from: b */
    public void mo111623b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo111624c(C89849ae aeVar, C59582aj ajVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.f246203c = (C59687cb) ajVar.build();
        this.f365568a.f365584b.mo74236a(fVar.mo83699a());
    }

    /* renamed from: d */
    public abstract void mo111625d();

    /* renamed from: e */
    public abstract void mo111626e(C59770f fVar);

    /* renamed from: f */
    public abstract void mo111627f(C59770f fVar);

    /* renamed from: g */
    public abstract void mo111628g(Instant instant);

    /* renamed from: h */
    public abstract void mo111629h();

    /* renamed from: i */
    public abstract void mo111630i(boolean z);

    /* renamed from: j */
    public abstract void mo111631j();

    /* renamed from: k */
    public abstract void mo111632k();

    /* renamed from: l */
    public abstract void mo111633l(C89885b bVar);

    /* renamed from: m */
    public abstract void mo111634m();

    /* renamed from: n */
    public abstract boolean mo111635n();

    /* renamed from: o */
    public abstract boolean mo111636o();

    /* renamed from: p */
    public abstract void mo111637p(int i);
}
