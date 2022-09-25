package com.google.android.apps.gsa.staticplugins.p7374ag;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.d */
/* compiled from: PG */
public final class C93823d {

    /* renamed from: a */
    private final C85923cq f262068a;

    /* renamed from: b */
    private final C86130z f262069b;

    public C93823d(C85923cq cqVar, C86130z zVar) {
        this.f262068a = cqVar;
        this.f262069b = zVar;
    }

    /* renamed from: a */
    public final boolean mo88183a(Uri uri) {
        if (uri.isRelative() || this.f262068a.mo79554e(uri, false)) {
            C86130z zVar = this.f262069b;
            if (zVar.mo79765e(R.array.google_search_logout_redirects).contains(uri.getPath())) {
                return true;
            }
        }
        return false;
    }
}
