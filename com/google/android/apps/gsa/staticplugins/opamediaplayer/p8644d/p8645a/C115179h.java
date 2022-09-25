package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8645a;

import android.os.Bundle;
import com.google.android.apps.gsa.p6486s.C84263c;
import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84271k;
import com.google.android.apps.gsa.p6486s.C84273m;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8646b.C115198a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115471o;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115474r;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23149a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.a.h */
/* compiled from: PG */
public final class C115179h extends C23056g implements C84273m, C115471o {

    /* renamed from: a */
    public static final C59071e f319653a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.a.h");

    /* renamed from: b */
    public final C68214a f319654b;

    /* renamed from: c */
    public final C115474r f319655c;

    /* renamed from: d */
    public final C22871g f319656d;

    /* renamed from: e */
    private final C23149a f319657e;

    /* renamed from: f */
    private final C84274n f319658f;

    /* renamed from: g */
    private final C90464f f319659g;

    /* renamed from: h */
    private C58833ax f319660h = C58836b.f156633a;

    public C115179h(C23052c cVar, C115474r rVar, C84274n nVar, C23149a aVar, C22871g gVar, C68214a aVar2, C90464f fVar) {
        super(cVar);
        this.f319655c = rVar;
        this.f319658f = nVar;
        this.f319656d = gVar;
        this.f319654b = aVar2;
        this.f319657e = aVar;
        this.f319659g = fVar;
    }

    /* renamed from: r */
    private final void m190927r(C60870cx cxVar, C84269i iVar) {
        new C90873ag(cxVar, this.f319656d, "perform-playback-action", new C115173b()).mo85223a(new C115174c(iVar));
    }

    /* renamed from: s */
    private final void m190928s(C84269i iVar, C84271k kVar) {
        m190927r(this.f319658f.mo77788d(iVar, kVar), iVar);
    }

    /* renamed from: a */
    public final void mo77783a(C52176ia iaVar) {
        this.f319656d.mo28212l("update-media-data", new C115178g(this, iaVar));
    }

    /* renamed from: b */
    public final void mo77784b(C84275o oVar) {
        this.f319660h = C58833ax.m90834k(oVar);
        this.f319656d.mo28212l("update-playback-state", new C115177f(this, oVar));
    }

    /* renamed from: e */
    public final void mo101875e() {
        if (!this.f63405W.mo28420E()) {
            ((C23251a) this.f319655c.mo101872c()).mo28730f(C58836b.f156633a, false);
        }
    }

    /* renamed from: f */
    public final void mo101876f() {
        mo101886q(C84269i.FAST_FORWARD);
    }

    /* renamed from: h */
    public final void mo101877h(int i) {
        C58833ax axVar = (C58833ax) ((C23251a) this.f319655c.mo101874e()).f63720e;
        if (axVar.mo56113h() && ((C115466j) axVar.mo56107c()).f320307b != ((long) i)) {
            C84269i iVar = C84269i.PLAY;
            C84263c cVar = new C84263c();
            cVar.mo77755b(i);
            m190928s(iVar, cVar.mo77754a());
        }
    }

    /* renamed from: i */
    public final void mo101878i(float f) {
        if (!this.f63405W.mo28420E()) {
            Bundle bundle = new Bundle();
            bundle.putFloat("com.google.android.apps.gsa.search.core.work.audioplayer.PlaybackSpeed", f);
            this.f319658f.mo77794j(bundle);
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        ((C23251a) this.f319655c.mo101874e()).mo28730f(C58836b.f156633a, false);
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C52176ia iaVar = (C52176ia) C23245b.m43557b(protoParcelable, C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), true);
        iaVar.getClass();
        ((C23251a) this.f319655c.mo101871b()).mo28730f(iaVar, false);
        ((C23251a) this.f319655c.mo101873d()).mo28730f(Float.valueOf(1.0f), false);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        this.f319658f.mo77791g(this);
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f319658f.mo77792h(this);
    }

    /* renamed from: j */
    public final void mo101879j() {
        mo101886q(C84269i.REWIND);
    }

    /* renamed from: k */
    public final void mo101880k(long j) {
        C84269i iVar = C84269i.SEEK;
        C84263c cVar = new C84263c();
        cVar.mo77756c(j);
        m190928s(iVar, cVar.mo77754a());
    }

    /* renamed from: l */
    public final void mo101881l(byte[] bArr) {
        if (!this.f63405W.mo28420E()) {
            C115198a.m190984a(this.f319659g, this.f319660h, bArr);
        }
    }

    /* renamed from: m */
    public final void mo101882m(int i) {
        if (!this.f63405W.mo28420E()) {
            this.f319657e.mo28601d(new C23129y("media_item_info_page"), C23245b.m43556a((C52174hz) ((C52176ia) ((C23251a) this.f319655c.mo101871b()).f63720e).f136914b.get(i)));
        }
    }

    /* renamed from: n */
    public final void mo101883n() {
        if (!this.f63405W.mo28420E()) {
            this.f319657e.mo28601d(new C23129y("media_player_playlist"), C23245b.m43556a((C52176ia) ((C23251a) this.f319655c.mo101871b()).f63720e));
        }
    }

    /* renamed from: o */
    public final void mo101884o() {
        mo101886q(C84269i.PLAY_NEXT);
    }

    /* renamed from: p */
    public final void mo101885p() {
        C58833ax axVar = (C58833ax) ((C23251a) this.f319655c.mo101874e()).f63720e;
        if (!axVar.mo56113h() || !((C115466j) axVar.mo56107c()).f320308c) {
            mo101886q(C84269i.TOGGLE_PLAY_PAUSE);
            return;
        }
        C84269i iVar = C84269i.PLAY;
        C84263c cVar = new C84263c();
        cVar.mo77755b((int) ((C115466j) axVar.mo56107c()).f320307b);
        m190928s(iVar, cVar.mo77754a());
    }

    /* renamed from: q */
    public final void mo101886q(C84269i iVar) {
        m190927r(this.f319658f.mo77787c(iVar), iVar);
    }
}
