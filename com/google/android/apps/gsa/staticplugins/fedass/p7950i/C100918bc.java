package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.search.fedora.p10099e.C132790au;
import com.google.android.apps.search.fedora.p10099e.C132791av;
import com.google.android.apps.search.fedora.p10099e.C132797e;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132815w;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19403g;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19421y;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19422z;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63259d;
import com.google.speech.p5199c.p5200a.C66460e;
import com.google.speech.p5199c.p5200a.C66461f;
import java.io.File;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.bc */
/* compiled from: PG */
final class C100918bc {

    /* renamed from: a */
    public static final C59071e f281946a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.i.bc");

    /* renamed from: b */
    public final Optional f281947b;

    /* renamed from: c */
    private final C100934q f281948c;

    /* renamed from: d */
    private final C100900al f281949d;

    /* renamed from: e */
    private final C19435g f281950e;

    /* renamed from: f */
    private final Executor f281951f;

    public C100918bc(C100934q qVar, C100900al alVar, C19435g gVar, Optional optional, Executor executor) {
        this.f281948c = qVar;
        this.f281949d = alVar;
        this.f281950e = gVar;
        this.f281947b = optional;
        this.f281951f = executor;
    }

    /* renamed from: a */
    public final C19422z mo92093a(C132800h hVar) {
        Optional b = this.f281949d.mo92089b(hVar);
        Optional flatMap = b.flatMap(C100914az.f281943a);
        Optional flatMap2 = b.flatMap(C100916ba.f281945a);
        boolean a = this.f281948c.mo92102c(hVar).mo24611a();
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar = zVar.f362397c;
        if (wVar == null) {
            wVar = C132815w.f362363x;
        }
        boolean z = wVar.f362376l;
        C132818z zVar2 = hVar.f362336d;
        if (zVar2 == null) {
            zVar2 = C132818z.f362393h;
        }
        C132815w wVar2 = zVar2.f362397c;
        if (wVar2 == null) {
            wVar2 = C132815w.f362363x;
        }
        boolean z2 = wVar2.f362377m;
        C19421y k = C19422z.m37077k();
        k.mo24583i(a);
        k.mo24576b(z);
        k.mo24578d(z2);
        k.mo24581g(b);
        k.mo24577c(flatMap);
        k.mo24579e(flatMap2);
        File c = this.f281949d.mo92090c();
        if (c != null) {
            C19403g gVar = (C19403g) k;
            gVar.f54292a = c;
            File d = this.f281949d.mo92091d();
            if (d != null) {
                gVar.f54293b = d;
                C132790au auVar = (C132790au) C132791av.f362294d.createBuilder();
                C132798f fVar = hVar.f362335c;
                if (fVar == null) {
                    fVar = C132798f.f362315o;
                }
                C132797e eVar = fVar.f362325i;
                if (eVar == null) {
                    eVar = C132797e.f362307g;
                }
                String str = eVar.f362310b;
                auVar.copyOnWrite();
                C132791av avVar = (C132791av) auVar.instance;
                str.getClass();
                avVar.f362296a |= 1;
                avVar.f362297b = str;
                C132798f fVar2 = hVar.f362335c;
                if (fVar2 == null) {
                    fVar2 = C132798f.f362315o;
                }
                C132797e eVar2 = fVar2.f362325i;
                if (eVar2 == null) {
                    eVar2 = C132797e.f362307g;
                }
                int i = eVar2.f362311c;
                auVar.copyOnWrite();
                C132791av avVar2 = (C132791av) auVar.instance;
                avVar2.f362296a |= 2;
                avVar2.f362298c = i;
                k.mo24582h(((C132791av) auVar.build()).toByteString());
                C132818z zVar3 = hVar.f362336d;
                if (zVar3 == null) {
                    zVar3 = C132818z.f362393h;
                }
                k.mo24580f(zVar3.f362401g);
                return k.mo24575a();
            }
            throw new NullPointerException("Null lmBrellaOutputDir");
        }
        throw new NullPointerException("Null asrBrellaOutputDir");
    }

    /* renamed from: b */
    public final void mo92094b(C63259d dVar, Optional optional) {
        C19435g gVar = this.f281950e;
        C66460e eVar = (C66460e) C66461f.f180719g.createBuilder();
        eVar.copyOnWrite();
        C66461f fVar = (C66461f) eVar.instance;
        dVar.getClass();
        fVar.f180725e = dVar;
        fVar.f180721a |= 8;
        gVar.mo24624f((C66461f) eVar.build());
        if (!this.f281947b.isEmpty()) {
            C60856cj.m92911t(C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(new C100912ax(this, dVar)), this.f281951f)).mo51516i(new C100913ay(this, optional), this.f281951f).f164926b, C47810es.m84974n(new C100917bb()), this.f281951f);
        }
    }
}
