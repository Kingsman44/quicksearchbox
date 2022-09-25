package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.shared.p5809c.C73849a;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83919f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.p7388al.C93949w;
import com.google.android.apps.gsa.staticplugins.p7388al.C93950x;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.bp */
/* compiled from: PG */
public final class C94210bp extends C84036z {

    /* renamed from: a */
    public C93949w f263225a;

    /* renamed from: b */
    private final Bundle f263226b;

    /* renamed from: c */
    private final C94319fq f263227c;

    /* renamed from: d */
    private final C94195ba f263228d;

    /* renamed from: e */
    private final C94234cm f263229e;

    /* renamed from: f */
    private final C90021c f263230f;

    /* renamed from: g */
    private final C68214a f263231g;

    /* renamed from: h */
    private final C83880an f263232h;

    public C94210bp(C83880an anVar, Bundle bundle, C94195ba baVar, C94319fq fqVar, C94234cm cmVar, C90021c cVar, C68214a aVar) {
        this.f263226b = bundle;
        this.f263227c = fqVar;
        this.f263228d = baVar;
        this.f263229e = cmVar;
        this.f263230f = cVar;
        this.f263231g = aVar;
        this.f263232h = anVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        C83919f fVar;
        if (!C73849a.m108439a(this.f263230f)) {
            return C58485gu.m89845m();
        }
        C89859i iVar = (C89859i) this.f263231g.mo27525b();
        C89849ae aeVar = C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_START;
        C9439b a = C9439b.m23955a(this.f263232h.mo77235i().f158062c);
        if (a == null) {
            a = C9439b.UNKNOWN_ENTRY;
        }
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160049N = a.f32835aq;
        cbVar.f160115b |= 8192;
        C89856f fVar2 = new C89856f();
        fVar2.f246201a = aeVar;
        fVar2.f246203c = (C59687cb) ajVar.build();
        iVar.mo74236a(fVar2.mo83699a());
        if (!this.f263226b.containsKey("DeviceScanConfig")) {
            fVar = C83919f.f228563e;
        } else {
            fVar = (C83919f) ProtoParsers.m95522e(this.f263226b, "DeviceScanConfig", C83919f.f228563e, C62921ba.m95368a());
        }
        C93949w a2 = C93950x.m154994a(fVar);
        this.f263225a = a2;
        C94319fq fqVar = this.f263227c;
        Bundle bundle = this.f263226b;
        bundle.getClass();
        a2.getClass();
        C94316fn fnVar = (C94316fn) fqVar.f263562a.mo17428b();
        fnVar.getClass();
        C94299ex exVar = (C94299ex) fqVar.f263563b.mo17428b();
        exVar.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) fqVar.f263564c).f184585a);
        a3.getClass();
        return C58485gu.m89849q(a2, new C94318fp(bundle, a2, fnVar, exVar, a3), this.f263229e.mo88403a(new C94208bn(this)), this.f263228d.mo88397a(new C94209bo(this)));
    }
}
