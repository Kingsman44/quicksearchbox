package com.google.android.apps.gsa.staticplugins.p7909eg.p7910a;

import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.p8889z.p8890a.C118849l;
import com.google.android.apps.gsa.search.core.p6788g.p6789a.C85772b;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.speech.C90530b;
import com.google.android.apps.gsa.shared.speech.C90605m;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.staticplugins.p7909eg.p7911b.C100511f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67186ad;
import com.google.speech.p5224k.p5225a.C67194al;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.a.g */
/* compiled from: PG */
public final class C100501g implements C84295m {

    /* renamed from: a */
    public final C100511f f280965a;

    /* renamed from: b */
    public final C90908be f280966b;

    /* renamed from: c */
    public final C85772b f280967c;

    /* renamed from: d */
    public final AtomicBoolean f280968d = new AtomicBoolean(false);

    /* renamed from: e */
    final int f280969e;

    /* renamed from: f */
    private final C100498d f280970f;

    /* renamed from: g */
    private final C90605m f280971g = new C90605m();

    /* renamed from: h */
    private final long f280972h;

    /* renamed from: i */
    private final C118849l f280973i;

    /* renamed from: j */
    private final C90908be f280974j;

    /* renamed from: k */
    private final C90908be f280975k;

    /* renamed from: l */
    private final boolean f280976l;

    /* renamed from: m */
    private final C68214a f280977m;

    /* renamed from: n */
    private final C89859i f280978n;

    public C100501g(C100498d dVar, long j, C118849l lVar, C100511f fVar, C90908be beVar, C90908be beVar2, C90908be beVar3, C85772b bVar, boolean z, int i, C68214a aVar, C89859i iVar) {
        this.f280970f = dVar;
        this.f280972h = j;
        this.f280973i = lVar;
        this.f280965a = fVar;
        this.f280974j = beVar;
        this.f280966b = beVar2;
        this.f280975k = beVar3;
        this.f280967c = bVar;
        this.f280976l = z;
        this.f280969e = i;
        this.f280977m = aVar;
        this.f280978n = iVar;
    }

    /* renamed from: a */
    public final void mo77831a(C90523o oVar) {
        if (!this.f280968d.getAndSet(true)) {
            C89886e b = ((C89911f) this.f280977m.mo27525b()).mo83756b(oVar);
            b.mo83725d(this.f280972h);
            b.mo83721a();
            this.f280970f.mo91940d(this.f280975k);
        }
    }

    /* renamed from: c */
    public final void mo77832c(C90523o oVar) {
        if (!this.f280968d.get()) {
            C89886e b = ((C89911f) this.f280977m.mo27525b()).mo83756b(oVar);
            b.mo83725d(this.f280972h);
            b.mo83721a();
        }
    }

    /* renamed from: d */
    public final void mo77833d(C66611ci ciVar) {
        Object obj;
        if (!this.f280968d.get()) {
            C62940bt r0 = C62942bv.checkIsLite(C67186ad.f182611f);
            ciVar.mo58887l(r0);
            Object l = ciVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C67186ad adVar = (C67186ad) obj;
            if ((adVar.f182613a & 1) != 0) {
                if (((C90530b) this.f280971g.mo84745a()).f253083a.equals(C63088z.f170246b)) {
                    C89859i iVar = this.f280978n;
                    C89856f fVar = new C89856f();
                    fVar.f246201a = C89849ae.TTS_RESPONSE_FIRST_BYTE;
                    iVar.mo74236a(fVar.mo83699a());
                }
                this.f280971g.mo84746b(adVar.f182614b);
            }
            if ((adVar.f182613a & 16) != 0) {
                C90605m mVar = this.f280971g;
                C67194al alVar = adVar.f182616d;
                if (alVar == null) {
                    alVar = C67194al.f182643d;
                }
                mVar.mo84747c(alVar);
            }
            if (adVar.f182615c) {
                C89859i iVar2 = this.f280978n;
                C89856f fVar2 = new C89856f();
                fVar2.f246201a = C89849ae.TTS_RESPONSE_LAST_BYTE;
                iVar2.mo74236a(fVar2.mo83699a());
                C90606n a = this.f280971g.mo84745a();
                if (this.f280976l) {
                    this.f280973i.mo104041b(((C90530b) a).f253083a.mo59174N());
                    this.f280970f.mo91940d(this.f280966b);
                    return;
                }
                this.f280974j.run();
                C90530b bVar = (C90530b) a;
                this.f280973i.mo104050k(bVar.f253083a.mo59174N(), this.f280969e);
                C58833ax axVar = bVar.f253084b;
                if (axVar.mo56113h()) {
                    this.f280965a.f281010a = (C58485gu) axVar.mo56107c();
                    this.f280965a.mo91944b(new C100499e(this));
                }
                this.f280973i.mo104040a(new C100500f(this));
                this.f280970f.mo91940d((C90908be) null);
            }
        }
    }
}
