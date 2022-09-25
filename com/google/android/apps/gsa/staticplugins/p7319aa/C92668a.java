package com.google.android.apps.gsa.staticplugins.p7319aa;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.logging.eventprocessor.C86177a;
import com.google.android.apps.gsa.shared.p7066m.C90013bs;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.search.googleapp.discover.p10182e.p10183a.C134238a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60555uf;
import dagger.C68214a;
import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.aa.a */
/* compiled from: PG */
public final class C92668a implements C86177a {

    /* renamed from: a */
    private final C68214a f258679a;

    /* renamed from: b */
    private final C21370a f258680b;

    /* renamed from: c */
    private final List f258681c;

    /* renamed from: d */
    private final C68214a f258682d;

    /* renamed from: e */
    private boolean f258683e = true;

    public C92668a(C68214a aVar, C21370a aVar2, C90021c cVar, C68214a aVar3) {
        this.f258679a = aVar;
        this.f258680b = aVar2;
        this.f258681c = cVar.mo79749o(C90013bs.f247035s);
        this.f258682d = aVar3;
    }

    /* renamed from: c */
    public final void mo79812c(int i) {
        long j = ((SharedPreferences) this.f258679a.mo27525b()).getLong(C90507o.f253034x, 0);
        ((C134238a) this.f258682d.mo27525b()).mo111659b(j);
        if (this.f258683e && this.f258681c.contains(Integer.valueOf(i)) && j == 0) {
            long b = this.f258680b.mo26870b();
            ((SharedPreferences) this.f258679a.mo27525b()).edit().putLong(C90507o.f253034x, b).apply();
            ((C134238a) this.f258682d.mo27525b()).mo111658a(Instant.ofEpochMilli(b));
            this.f258683e = false;
        }
    }

    /* renamed from: d */
    public final void mo79813d(C60321oe oeVar) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo79814e(C60555uf ufVar) {
    }
}
