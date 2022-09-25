package com.google.assistant.p3838ao.p3839a.p3846f;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3838ao.p3839a.p3845e.C49615f;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4850an.p4855d.p4862g.C63565b;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.assistant.ao.a.f.d */
/* compiled from: PG */
public final class C49640d extends C49637a {

    /* renamed from: a */
    public static final C58528ij f128127a = C58528ij.m90011K("Search_email", "SearchEmail");

    /* renamed from: b */
    public static final C58528ij f128128b = new C58759qy("Search_photos");

    /* renamed from: c */
    public static final C58528ij f128129c = C58528ij.m90011K("isAssistedBrowse", "assisted_browse");

    /* renamed from: d */
    public static final C58528ij f128130d = C58528ij.m90012L("recipient", "body", "sender");

    /* renamed from: e */
    private static final C58528ij f128131e = C58528ij.m90011K("Open_app", "OpenApp");

    /* renamed from: f */
    private static final C58528ij f128132f = new C58759qy("FindOnApp");

    /* renamed from: g */
    private static final C58528ij f128133g = new C58759qy("FindOnSite");

    /* renamed from: h */
    private final C49615f f128134h;

    /* renamed from: i */
    private final Instant f128135i;

    public C49640d(C49615f fVar, Instant instant) {
        super(instant);
        this.f128134h = fVar;
        C63042fg fgVar = fVar.f128034b;
        this.f128135i = C62950b.m95474e(fgVar == null ? C63042fg.f170152c : fgVar);
    }

    /* renamed from: l */
    private final boolean m85597l(Predicate predicate) {
        C63624h hVar;
        C61752n nVar = this.f128134h.f128037e;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        for (C61746h hVar2 : nVar.f166812c) {
            if ("app".equals(hVar2.f166796d)) {
                C61748j jVar = hVar2.f166797e;
                if (jVar == null) {
                    jVar = C61748j.f166800d;
                }
                if (jVar.f166802a == 15) {
                    hVar = (C63624h) jVar.f166803b;
                } else {
                    hVar = C63624h.f172070b;
                }
                for (C63775d dVar : hVar.f172072a) {
                    if (predicate.test(dVar.f172523d)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: m */
    private final boolean m85598m() {
        C58528ij ijVar = f128132f;
        C61752n nVar = this.f128134h.f128037e;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        return ((C58759qy) ijVar).f156534a.equals(nVar.f166811b);
    }

    /* renamed from: c */
    public final Instant mo53282c() {
        return this.f128135i;
    }

    /* renamed from: d */
    public final Optional mo53283d() {
        C61758t tVar;
        if (!m85598m() || !m85597l(C49638b.f128125a)) {
            return Optional.empty();
        }
        C61752n nVar = this.f128134h.f128037e;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        if (!m85598m()) {
            return Optional.empty();
        }
        for (C61746h hVar : nVar.f166812c) {
            if ("query".equals(hVar.f166796d)) {
                C61748j jVar = hVar.f166797e;
                if (jVar == null) {
                    jVar = C61748j.f166800d;
                }
                if (jVar.f166802a == 3) {
                    tVar = (C61758t) jVar.f166803b;
                } else {
                    tVar = C61758t.f166824c;
                }
                return Optional.m71637of(tVar.f166826a == 1 ? (String) tVar.f166827b : BuildConfig.FLAVOR);
            }
        }
        return Optional.empty();
    }

    /* renamed from: e */
    public final String mo53284e() {
        return this.f128134h.f128035c;
    }

    /* renamed from: f */
    public final boolean mo53285f() {
        return m85598m() && m85597l(C49638b.f128125a);
    }

    /* renamed from: g */
    public final boolean mo53286g() {
        C63565b bVar;
        C61758t tVar;
        C58528ij ijVar = f128127a;
        C61752n nVar = this.f128134h.f128037e;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        if (!ijVar.contains(nVar.f166811b)) {
            return false;
        }
        C61752n nVar2 = this.f128134h.f128037e;
        if (nVar2 == null) {
            nVar2 = C61752n.f166808f;
        }
        for (C61746h hVar : nVar2.f166812c) {
            if (f128130d.contains(hVar.f166796d)) {
                C61748j jVar = hVar.f166797e;
                if (jVar == null) {
                    jVar = C61748j.f166800d;
                }
                if (jVar.f166802a == 9) {
                    bVar = (C63565b) jVar.f166803b;
                } else {
                    bVar = C63565b.f171933j;
                }
                if (bVar.f171936b.isEmpty()) {
                    C61748j jVar2 = hVar.f166797e;
                    if (jVar2 == null) {
                        jVar2 = C61748j.f166800d;
                    }
                    if (jVar2.f166802a == 3) {
                        tVar = (C61758t) jVar2.f166803b;
                    } else {
                        tVar = C61758t.f166824c;
                    }
                    if (!(tVar.f166826a == 1 ? (String) tVar.f166827b : BuildConfig.FLAVOR).isEmpty()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo53287h() {
        C61758t tVar;
        C61752n nVar = this.f128134h.f128037e;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        boolean z = false;
        for (C61746h hVar : nVar.f166812c) {
            if (f128129c.contains(hVar.f166796d)) {
                C61748j jVar = hVar.f166797e;
                if (jVar == null) {
                    jVar = C61748j.f166800d;
                }
                if (jVar.f166802a == 3) {
                    tVar = (C61758t) jVar.f166803b;
                } else {
                    tVar = C61758t.f166824c;
                }
                if (tVar.f166826a != 4 || !((Boolean) tVar.f166827b).booleanValue()) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    /* renamed from: i */
    public final boolean mo53288i() {
        C58528ij ijVar = f128131e;
        C61752n nVar = this.f128134h.f128037e;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        return ijVar.contains(nVar.f166811b) && m85597l(C49639c.f128126a);
    }

    /* renamed from: j */
    public final boolean mo53289j() {
        C58528ij ijVar = f128128b;
        C61752n nVar = this.f128134h.f128037e;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        return ((C58759qy) ijVar).f156534a.equals(nVar.f166811b);
    }

    /* renamed from: k */
    public final boolean mo53290k() {
        if (m85598m()) {
            return true;
        }
        C58528ij ijVar = f128133g;
        C61752n nVar = this.f128134h.f128037e;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        return ((C58759qy) ijVar).f156534a.equals(nVar.f166811b);
    }

    public final String toString() {
        return String.format("AssistantQuery: %s", new Object[]{this.f128134h.f128035c});
    }
}
