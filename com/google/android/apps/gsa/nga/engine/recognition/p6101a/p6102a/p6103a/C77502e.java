package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6102a.p6103a;

import android.media.AudioManager;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b.C75135h;
import com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b.C75136i;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6102a.C77497a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37325aa;
import com.google.android.libraries.search.p2904c.C37345aj;
import com.google.android.libraries.search.p2904c.C37346ak;
import com.google.android.libraries.search.p2904c.p2913d.p2914a.C37482d;
import com.google.android.libraries.search.p2904c.p2913d.p2914a.C37488j;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2936b.C37737f;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.a.a.e */
/* compiled from: PG */
public final class C77502e implements AudioManager.OnAudioFocusChangeListener, C75155d, C77497a {

    /* renamed from: a */
    public static final C58974d f213556a = C58974d.m91136j();

    /* renamed from: b */
    public final C76455a f213557b;

    /* renamed from: c */
    private final C22871g f213558c;

    /* renamed from: d */
    private C37325aa f213559d;

    /* renamed from: e */
    private final C37482d f213560e;

    /* renamed from: f */
    private final C75136i f213561f;

    public C77502e(C76455a aVar, C22871g gVar, C37482d dVar, C75136i iVar) {
        this.f213557b = aVar;
        this.f213558c = gVar;
        this.f213560e = dVar;
        this.f213561f = iVar;
    }

    /* renamed from: d */
    private final synchronized void m124320d() {
        C37482d dVar = this.f213560e;
        C37345aj ajVar = (C37345aj) C37346ak.f99197g.createBuilder();
        ajVar.copyOnWrite();
        C37346ak akVar = (C37346ak) ajVar.instance;
        akVar.f99199a |= 1;
        akVar.f99200b = 4;
        ajVar.copyOnWrite();
        C37346ak akVar2 = (C37346ak) ajVar.instance;
        akVar2.f99199a = 4 | akVar2.f99199a;
        akVar2.f99202d = false;
        C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
        C37737f fVar = C37737f.f100170a;
        aVar.copyOnWrite();
        C37773c cVar = (C37773c) aVar.instance;
        fVar.getClass();
        cVar.f100246b = fVar;
        cVar.f100245a = 14;
        ajVar.copyOnWrite();
        C37346ak akVar3 = (C37346ak) ajVar.instance;
        C37773c cVar2 = (C37773c) aVar.build();
        cVar2.getClass();
        akVar3.f99203e = cVar2;
        akVar3.f99199a |= 8;
        C37325aa a = dVar.mo40984a((C37346ak) ajVar.build());
        this.f213559d = a;
        ((C37488j) a).f99526f.mo40982a(this);
        new C90873ag(((C37488j) this.f213559d).f99524d, this.f213558c, "[NGA] AudioFocusManagerImpl.logAcquireAudioFocus", new C77498a(this)).mo85223a(C77499b.f213553a);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71137a(C75077bo boVar, C75077bo boVar2) {
    }

    /* renamed from: b */
    public final void mo71138b(bl blVar) {
        if (blVar == bl.a) {
            m124320d();
        } else if (blVar == bl.b || blVar == bl.c) {
            mo72591c();
        }
    }

    /* renamed from: c */
    public final synchronized void mo72591c() {
        C37325aa aaVar = this.f213559d;
        if (aaVar != null) {
            C60870cx b = aaVar.mo40883b();
            this.f213559d = null;
            new C90873ag(b, this.f213558c, "[NGA] AudioFocusManagerImpl.logAbandonAudioFocus", C77500c.f213554a).mo85223a(C77501d.f213555a);
        }
    }

    public final void onAudioFocusChange(int i) {
        if (i == -1) {
            C75136i iVar = this.f213561f;
            iVar.f209532b.mo28212l("[NGA] onAudioFocusLoss", new C75135h(iVar));
        }
    }
}
