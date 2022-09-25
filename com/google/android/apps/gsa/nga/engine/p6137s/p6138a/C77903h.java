package com.google.android.apps.gsa.nga.engine.p6137s.p6138a;

import android.content.ComponentName;
import com.google.android.apps.gsa.nga.engine.ag.b;
import com.google.android.apps.gsa.nga.engine.p6044n.C76248a;
import com.google.android.apps.gsa.nga.engine.p6044n.C76401e;
import com.google.android.apps.gsa.nga.engine.p6056o.C77422p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6363s.C81457f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4580v.C60950i;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.s.a.h */
/* compiled from: PG */
public final class C77903h implements C77422p, b {

    /* renamed from: d */
    private static final Duration f214619d = Duration.ofSeconds(1);

    /* renamed from: a */
    public final C60950i f214620a;

    /* renamed from: b */
    public Instant f214621b = Instant.MIN;

    /* renamed from: c */
    public String f214622c;

    /* renamed from: e */
    private final C81457f f214623e;

    public C77903h(C22871g gVar, C81465n nVar, C60950i iVar) {
        this.f214623e = nVar.mo75094a(gVar, C77902g.f214618a);
        this.f214620a = iVar;
    }

    /* renamed from: c */
    public final void mo71390c(C76401e eVar) {
        Optional optional;
        C63624h hVar;
        Optional b = ((C76248a) eVar).f211268a.mo72525b().mo73747b();
        if (b.isEmpty()) {
            optional = Optional.empty();
        } else {
            C61752n nVar = ((C80513b) b.get()).f221016a;
            if (nVar == null) {
                nVar = C61752n.f166808f;
            }
            if (!nVar.f166811b.equals("Open_app")) {
                optional = Optional.empty();
            } else if (nVar.f166812c.size() == 0) {
                optional = Optional.empty();
            } else {
                C61748j jVar = ((C61746h) nVar.f166812c.get(0)).f166797e;
                if (jVar == null) {
                    jVar = C61748j.f166800d;
                }
                if (jVar.f166802a == 15) {
                    hVar = (C63624h) jVar.f166803b;
                } else {
                    hVar = C63624h.f172070b;
                }
                if (hVar.f172072a.size() == 0) {
                    optional = Optional.empty();
                } else {
                    optional = Optional.m71637of(((C63775d) hVar.f172072a.get(0)).f172523d);
                }
            }
        }
        optional.ifPresent(new C77901f(this));
    }

    /* renamed from: d */
    public final /* synthetic */ void mo71391d(C76401e eVar) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo71392e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo71393f() {
    }

    /* renamed from: p */
    public final void mo72887p(Optional optional) {
        if (optional.isEmpty() || this.f214622c == null) {
            return;
        }
        if (this.f214620a.mo57444a().isAfter(this.f214621b.plus(f214619d))) {
            this.f214622c = null;
        } else if (((ComponentName) optional.get()).getPackageName().equals(this.f214622c)) {
            C81457f fVar = this.f214623e;
            fVar.mo75091b(fVar.f222871a);
            this.f214622c = null;
        }
    }
}
