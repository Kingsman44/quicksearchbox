package com.google.android.apps.gsa.staticplugins.p7374ag;

import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.a */
/* compiled from: PG */
public final class C93806a {

    /* renamed from: a */
    public final C86124t f262030a;

    /* renamed from: b */
    public final C86054o f262031b;

    /* renamed from: c */
    private final C118827a f262032c;

    /* renamed from: d */
    private final C85923cq f262033d;

    public C93806a(C86124t tVar, C118827a aVar, C86054o oVar, C85923cq cqVar) {
        this.f262030a = tVar;
        this.f262032c = aVar;
        this.f262031b = oVar;
        this.f262033d = cqVar;
    }

    /* renamed from: a */
    public final void mo88177a(C118569b bVar) {
        this.f262032c.mo77944g(bVar, C118575h.SEARCH_COOKIE_LOGGED_IN_STATUS).mo104025g(1);
    }

    /* renamed from: b */
    public final boolean mo88178b(String str) {
        Uri parse = Uri.parse(str);
        if (!this.f262033d.mo79556g(parse, false, false) || !"/search".equals(parse.getPath())) {
            return false;
        }
        return true;
    }
}
