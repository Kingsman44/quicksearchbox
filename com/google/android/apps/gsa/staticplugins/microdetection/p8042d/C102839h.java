package com.google.android.apps.gsa.staticplugins.microdetection.p8042d;

import android.content.Context;
import com.google.android.apps.gsa.hotword.a;
import com.google.android.apps.gsa.hotword.b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90582d;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92496a;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92497b;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59601ay;
import com.google.common.p4552o.C59651be;
import com.google.common.p4552o.C59687cb;
import com.google.speech.micro.GoogleHotwordData;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.d.h */
/* compiled from: PG */
public final class C102839h {

    /* renamed from: a */
    public static final C59071e f287184a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.microdetection.d.h");

    /* renamed from: b */
    public final C102838g f287185b = new C102838g(this);

    /* renamed from: c */
    public final String f287186c;

    /* renamed from: d */
    public final int f287187d;

    /* renamed from: e */
    public final int f287188e;

    /* renamed from: f */
    protected final int f287189f;

    /* renamed from: g */
    public final C90582d f287190g;

    /* renamed from: h */
    public a f287191h;

    /* renamed from: i */
    public List f287192i;

    /* renamed from: j */
    public int f287193j;

    /* renamed from: k */
    public int f287194k;

    /* renamed from: l */
    public final C92504i f287195l;

    /* renamed from: m */
    public C102845n f287196m;

    /* renamed from: n */
    public b f287197n;

    /* renamed from: o */
    public final Context f287198o;

    /* renamed from: p */
    public final C22871g f287199p;

    /* renamed from: q */
    public final C90021c f287200q;

    /* renamed from: r */
    public final C68214a f287201r;

    /* renamed from: s */
    public final C102846o f287202s;

    /* renamed from: t */
    public final C68214a f287203t;

    /* renamed from: u */
    public final boolean f287204u;

    /* renamed from: v */
    public final boolean f287205v;

    /* renamed from: w */
    public final boolean f287206w;

    /* renamed from: x */
    private final boolean f287207x;

    public C102839h(String str, C90582d dVar, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, Context context, C92504i iVar, C22871g gVar, C90021c cVar, C68214a aVar, C102846o oVar, C68214a aVar2) {
        this.f287198o = context;
        this.f287199p = gVar;
        this.f287200q = cVar;
        this.f287186c = str;
        this.f287190g = dVar;
        this.f287187d = i;
        this.f287189f = i2;
        this.f287195l = iVar;
        this.f287204u = z;
        this.f287201r = aVar;
        this.f287202s = oVar;
        this.f287205v = z2;
        this.f287207x = z3;
        this.f287206w = z4;
        this.f287203t = aVar2;
        this.f287188e = Integer.bitCount(16);
    }

    /* renamed from: a */
    public final void mo93501a() {
        if (this.f287200q.mo79746e(C90082eg.f249999cI) && this.f287207x) {
            Context context = this.f287198o;
            C92513g.m152176e(context, context.getPackageName());
            ((C89859i) this.f287203t.mo27525b()).mo83702b(C89849ae.RUN_ENROLLMENT_BROADCAST_NEW_MODEL_DOWNLOAD);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo93502b() {
        C102845n nVar = this.f287196m;
        if (nVar != null) {
            nVar.mo93510f();
            this.f287196m = null;
        }
    }

    /* renamed from: c */
    public final void mo93503c(C89849ae aeVar, GoogleHotwordData googleHotwordData) {
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        String str = this.f287190g.f253249c;
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        str.getClass();
        cbVar.f160115b |= 4096;
        cbVar.f160048M = str;
        C59601ay ayVar = (C59601ay) C59651be.f159929E.createBuilder();
        C90584f a = C90584f.m147800a(this.f287190g.f253248b);
        if (a == null) {
            a = C90584f.OK_GOOGLE;
        }
        ayVar.copyOnWrite();
        C59651be beVar = (C59651be) ayVar.instance;
        beVar.f159945k = a.f253255d;
        beVar.f159935a |= 4096;
        C59651be beVar2 = (C59651be) ayVar.build();
        ajVar.copyOnWrite();
        C59687cb cbVar2 = (C59687cb) ajVar.instance;
        beVar2.getClass();
        cbVar2.f160100al = beVar2;
        cbVar2.f160122c |= 16;
        boolean M = ((C89994f) this.f287201r.mo27525b()).mo83850M();
        ajVar.copyOnWrite();
        C59687cb cbVar3 = (C59687cb) ajVar.instance;
        cbVar3.f160115b |= 134217728;
        cbVar3.f160091ac = M;
        if (googleHotwordData != null) {
            String valueOf = String.valueOf(googleHotwordData.getHotwordModelId());
            ajVar.copyOnWrite();
            C59687cb cbVar4 = (C59687cb) ajVar.instance;
            valueOf.getClass();
            cbVar4.f160115b |= C89885b.S3REQUEST_VALUE;
            cbVar4.f160054S = valueOf;
        }
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.f246203c = (C59687cb) ajVar.build();
        ((C89859i) this.f287203t.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: d */
    public final void mo93504d() {
        mo93502b();
        C92496a aVar = (C92496a) C92497b.f258129f.createBuilder();
        int i = this.f287187d;
        aVar.copyOnWrite();
        C92497b bVar = (C92497b) aVar.instance;
        bVar.f258131a |= 2;
        bVar.f258133c = i;
        int i2 = this.f287188e;
        aVar.copyOnWrite();
        C92497b bVar2 = (C92497b) aVar.instance;
        bVar2.f258131a |= 4;
        bVar2.f258134d = i2;
        aVar.copyOnWrite();
        C92497b bVar3 = (C92497b) aVar.instance;
        bVar3.f258131a |= 8;
        bVar3.f258135e = 0;
        new C90873ag(this.f287195l.mo87262b(this.f287190g, (C92497b) aVar.build(), this.f287185b, false), this.f287199p, "Create Hotword Data", new C102836e(this)).mo85223a(new C102837f(this));
    }

    /* renamed from: e */
    public final boolean mo93505e() {
        return this.f287200q.mo79746e(C90082eg.f250038cv);
    }
}
