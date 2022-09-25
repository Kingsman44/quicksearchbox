package com.google.android.apps.gsa.nga.engine.recognition.p6109b;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p6011e.C75371a;
import com.google.android.apps.gsa.nga.engine.recognition.C77548aa;
import com.google.android.apps.gsa.nga.engine.recognition.C77553af;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.engine.recognition.C77570aw;
import com.google.android.apps.gsa.nga.engine.recognition.C77623f;
import com.google.android.apps.gsa.nga.engine.recognition.C77891w;
import com.google.android.apps.gsa.nga.engine.recognition.C77892x;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80561f;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.recognizer.p5233a.C67464l;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.b.d */
/* compiled from: PG */
public final class C77576d implements C77553af, C77892x {

    /* renamed from: a */
    public final C75371a f213714a;

    /* renamed from: b */
    public C60870cx f213715b;

    /* renamed from: c */
    public final C22871g f213716c;

    /* renamed from: d */
    public final C91142g f213717d;

    /* renamed from: e */
    public final C68214a f213718e;

    /* renamed from: f */
    public final C118843f f213719f;

    /* renamed from: g */
    public final C75050a f213720g;

    public C77576d(C75371a aVar, C22871g gVar, C118843f fVar, C68214a aVar2, C75050a aVar3, C91142g gVar2) {
        this.f213714a = aVar;
        this.f213716c = gVar;
        this.f213718e = aVar2;
        this.f213719f = fVar;
        this.f213720g = aVar3;
        this.f213717d = gVar2;
    }

    /* renamed from: m */
    private final void m124502m() {
        this.f213716c.mo28212l("[NGA] EarconHandler cancel", new C77573a(this));
    }

    /* renamed from: a */
    public final void mo72712a(C77548aa aaVar) {
        m124502m();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo72619c(C67464l lVar, ac acVar, boolean z) {
    }

    /* renamed from: e */
    public final void mo72620e(C77557aj ajVar) {
        m124502m();
    }

    /* renamed from: f */
    public final void mo72621f(C77570aw awVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo72713g(C80561f fVar, C37514du duVar) {
    }

    /* renamed from: gG */
    public final void mo72714gG(C77623f fVar) {
        long d = this.f213717d.mo85399d(C90126fx.f251527kW);
        if (d > 0 && fVar.mo72752a() * 1000.0f > ((float) d)) {
            m124502m();
        }
    }

    /* renamed from: gK */
    public final void mo72622gK(C77891w wVar) {
    }

    /* renamed from: h */
    public final void mo72715h(Optional optional) {
        this.f213716c.mo28212l("[NGA] EarconHandler play", new C77574b(this));
    }

    /* renamed from: i */
    public final /* synthetic */ void mo72716i(C80561f fVar, C37561eb ebVar) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo72717j(C80561f fVar, int i) {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo72718k(C77548aa aaVar) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo72719l(C77548aa aaVar) {
    }
}
