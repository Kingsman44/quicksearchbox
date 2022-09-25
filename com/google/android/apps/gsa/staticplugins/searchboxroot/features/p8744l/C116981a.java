package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8744l;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6519al.p6534ag.C84675a;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.p6812m.C86180b;
import com.google.android.apps.gsa.searchbox.p6942a.C88533b;
import com.google.android.apps.gsa.searchbox.p6944c.p6949c.C88596l;
import com.google.android.apps.gsa.shared.p6990an.C89231v;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.l.a */
/* compiled from: PG */
public final class C116981a extends C88596l {

    /* renamed from: b */
    private final C68214a f324752b;

    /* renamed from: c */
    private final C68214a f324753c;

    /* renamed from: d */
    private final C84675a f324754d;

    public C116981a(C68214a aVar, C68214a aVar2, C84675a aVar3) {
        this.f324752b = aVar;
        this.f324753c = aVar2;
        this.f324754d = aVar3;
    }

    /* renamed from: a */
    public final int mo82254a() {
        return 123;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        ((C88533b) this.f239439a.mo27525b()).mo82170a(query.f252749G, 105, qrVar != null ? (C60456qs) qrVar.build() : null);
        DoodleData b = new C86180b((C86127w) this.f324752b.mo27525b(), (C85929cw) this.f324753c.mo27525b()).mo79817b();
        if (b != null) {
            this.f324754d.mo78416h(b);
        }
        return new C89231v();
    }
}
