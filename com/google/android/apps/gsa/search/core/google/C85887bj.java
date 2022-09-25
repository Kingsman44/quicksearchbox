package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.p6796f.C85980b;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.google.p6796f.C85983e;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.googlequicksearchbox.R;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.google.bj */
/* compiled from: PG */
public final class C85887bj implements C85983e {

    /* renamed from: a */
    private final C86130z f232217a;

    /* renamed from: b */
    private final C85923cq f232218b;

    /* renamed from: c */
    private final C68214a f232219c;

    public C85887bj(C86130z zVar, C85923cq cqVar, C68214a aVar) {
        this.f232217a = zVar;
        this.f232218b = cqVar;
        this.f232219c = aVar;
    }

    /* renamed from: d */
    public final void mo79436d(C85981c cVar, Query query) {
        String c = this.f232217a.mo79764c(R.string.google_on_device_action_gen_204_pattern);
        cVar.mo79640f(Uri.parse(String.format(C85980b.f232491a, c, new Object[]{this.f232218b.mo83212j(), this.f232218b.mo83211i()})));
        ((C85924cr) this.f232219c.mo27525b()).mo79559b(query, cVar, true, false);
        cVar.mo79638d("q", query.f252768g.toString());
        cVar.mo79638d("client", "searchbox");
    }
}
