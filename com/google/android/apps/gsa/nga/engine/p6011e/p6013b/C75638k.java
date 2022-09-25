package com.google.android.apps.gsa.nga.engine.p6011e.p6013b;

import android.content.Context;
import android.media.AudioAttributes;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5913am.p5914a.C74862a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75157e;
import com.google.android.apps.gsa.nga.engine.p6011e.C75371a;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80642f;
import com.google.android.apps.gsa.nga.shared.p6337e.C81020a;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.nga.engine.e.b.k */
/* compiled from: PG */
public final class C75638k implements C75371a, C75157e {

    /* renamed from: a */
    public final Context f209962a;

    /* renamed from: b */
    public final C91142g f209963b;

    /* renamed from: c */
    public final C22871g f209964c;

    /* renamed from: d */
    public final C118843f f209965d;

    /* renamed from: e */
    public final C68214a f209966e;

    /* renamed from: f */
    private final C22871g f209967f;

    /* renamed from: g */
    private final C68214a f209968g;

    /* renamed from: h */
    private final C75050a f209969h;

    /* renamed from: i */
    private final C74862a f209970i;

    /* renamed from: j */
    private final C80642f f209971j;

    /* renamed from: k */
    private final C75630c f209972k;

    public C75638k(Context context, C91142g gVar, C75630c cVar, C22871g gVar2, C22871g gVar3, C118843f fVar, C68214a aVar, C68214a aVar2, C75050a aVar3, C74862a aVar4, C80642f fVar2) {
        this.f209962a = context;
        this.f209963b = gVar;
        this.f209972k = cVar;
        this.f209967f = gVar2;
        this.f209964c = gVar3;
        this.f209965d = fVar;
        this.f209968g = aVar;
        this.f209969h = aVar3;
        this.f209966e = aVar2;
        this.f209970i = aVar4;
        this.f209971j = fVar2;
    }

    /* renamed from: h */
    private final boolean m121872h() {
        return this.f209963b.mo85405j(C90126fx.f251027b) && this.f209970i.f209052b.isTouchExplorationEnabled();
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        if (boVar.mo71473s()) {
            mo71767e();
        } else if (boVar2.mo71469o() && boVar.mo71471q()) {
            mo71767e();
            mo71724d();
        }
    }

    /* renamed from: b */
    public final void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final C60870cx mo71723c() {
        if (mo71768f()) {
            return C60866ct.f164955a;
        }
        long d = this.f209963b.mo85399d(C90126fx.f251529kY);
        int d2 = (int) this.f209963b.mo85399d(C90126fx.f251528kX);
        int i = (int) d;
        if (i == 1) {
            return mo71769g(R.raw.listening_alt, "R.raw.listening_alt", (long) d2);
        }
        if (i == 2) {
            return mo71769g(R.raw.listening_mono, "R.raw.listening_mono", (long) d2);
        }
        if (i != 3) {
            return mo71769g(R.raw.listening, "R.raw.listening", (long) d2);
        }
        return mo71769g(R.raw.open, "R.raw.open", (long) d2);
    }

    /* renamed from: d */
    public final void mo71724d() {
        int i;
        if (mo71768f()) {
            i = 6;
        } else {
            i = (int) this.f209963b.mo85399d(C90126fx.f251174do);
        }
        long d = this.f209963b.mo85399d(C90126fx.f251204eR);
        if (C81020a.m128964a(i, this.f209968g, (int) d, this.f209965d, this.f209969h.mo71417a().mo71478x(), this.f209969h.mo71417a().mo71467m(), this.f209963b, this.f209971j.mo74382h(this.f209969h.mo71417a().mo71465k()))) {
            this.f209967f.mo28212l("[NGA] triggerSpeakNowFeedback", new C75636i(this));
        }
    }

    /* renamed from: e */
    public final void mo71767e() {
        if (this.f209963b.mo85405j(C90126fx.f251080c)) {
            if (!this.f209970i.mo71256a() || !this.f209970i.f209054d.get()) {
                return;
            }
        } else if (!m121872h()) {
            return;
        }
        mo71769g(R.raw.success, "R.raw.success", 0);
    }

    /* renamed from: f */
    public final boolean mo71768f() {
        if (this.f209963b.mo85405j(C90126fx.f251080c)) {
            return this.f209970i.mo71256a() && this.f209970i.f209053c.get();
        }
        return m121872h();
    }

    /* renamed from: g */
    public final C60870cx mo71769g(int i, String str, long j) {
        AudioAttributes y = this.f209965d.mo71764y();
        if (y == null) {
            return C60866ct.f164955a;
        }
        return this.f209964c.mo28208h("[NGA] play earcon", j, new C75635h(this, this.f209964c.mo28209i(this.f209972k.mo71765a(i, y), "[NGA] Create audio player for earcon", new C75634g(str))));
    }
}
