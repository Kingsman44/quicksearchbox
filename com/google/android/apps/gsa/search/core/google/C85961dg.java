package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.shared.p7066m.C90117fo;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7191w.C91144a;
import com.google.common.base.C58839bc;

/* renamed from: com.google.android.apps.gsa.search.core.google.dg */
/* compiled from: PG */
public final class C85961dg {

    /* renamed from: a */
    public final C58839bc f232469a = new C85960df(this);

    /* renamed from: b */
    private final C86124t f232470b;

    /* renamed from: c */
    private final C85923cq f232471c;

    /* renamed from: d */
    private final C86130z f232472d;

    public C85961dg(C86124t tVar, C85923cq cqVar, C86130z zVar) {
        this.f232470b = tVar;
        this.f232471c = cqVar;
        this.f232472d = zVar;
    }

    /* renamed from: a */
    public final boolean mo79625a(String str) {
        Uri parse = Uri.parse(str);
        if ((this.f232471c.mo79556g(parse, false, false) && this.f232472d.mo79768h(parse.getPath())) || !this.f232471c.mo79554e(parse, true)) {
            return false;
        }
        if ("1".equals(C91144a.m148924a(parse, "gsas")) || C90772bp.m148274A(this.f232470b.mo79745c(C90117fo.f250748d), str)) {
            return true;
        }
        return false;
    }
}
