package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6078a;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.ag.af;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76565ai;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import java.net.URISyntaxException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.a.e */
/* compiled from: PG */
public final class C76766e {

    /* renamed from: a */
    private static final C58869cf f212138a = C58869cf.m90936b(new C58903m(',')).mo56152f(C58911u.f156751b).mo56151a();

    /* renamed from: b */
    private final af f212139b;

    /* renamed from: c */
    private final C91142g f212140c;

    public C76766e(af afVar, C91142g gVar) {
        this.f212139b = afVar;
        this.f212140c = gVar;
    }

    /* renamed from: a */
    public final Optional mo72327a(String str, C74965n nVar) {
        if (str.equals(nVar.mo71340o().orElse(null))) {
            return nVar.mo71339n().map(C76762a.f212134a);
        }
        return Optional.empty();
    }

    /* renamed from: b */
    public final Optional mo72328b(String str, String str2, boolean z, boolean z2) {
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            parseUri.setPackage(str2);
            if (!z2 || parseUri.getFlags() == 0) {
                parseUri.addFlags(true != z ? 268468224 : 805306368);
            }
            return Optional.m71637of(parseUri);
        } catch (URISyntaxException e) {
            e.getMessage();
            return Optional.empty();
        }
    }

    /* renamed from: c */
    public final Optional mo72329c(C76590bg bgVar, String str, C74965n nVar, boolean z) {
        Optional map = bgVar.mo72265g(C76565ai.f211802a, str).map(C76763b.f212135a);
        if (map.isPresent()) {
            if (this.f212139b.r((String) map.get())) {
                return map;
            }
            return Optional.empty();
        } else if (!z || nVar == null) {
            return Optional.empty();
        } else {
            return nVar.mo71340o();
        }
    }

    /* renamed from: d */
    public final boolean mo72330d(String str) {
        return Collection.EL.stream(f212138a.mo56155i(this.f212140c.mo85403h(C90126fx.f251029bB))).anyMatch(new C76765d(str));
    }

    /* renamed from: e */
    public final Optional mo72331e(C74965n nVar, String str, String str2, boolean z) {
        return mo72328b(str, str2, z, false).map(new C76764c(nVar));
    }
}
