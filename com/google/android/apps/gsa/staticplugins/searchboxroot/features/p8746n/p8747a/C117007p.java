package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.p */
/* compiled from: PG */
public final /* synthetic */ class C117007p implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C117008q f324817a;

    /* renamed from: b */
    public final /* synthetic */ long f324818b;

    public /* synthetic */ C117007p(C117008q qVar, long j) {
        this.f324817a = qVar;
        this.f324818b = j;
    }

    public final void run() {
        C117008q qVar = this.f324817a;
        long j = this.f324818b;
        if (qVar.mo103092d(((C86338r) qVar.f324820b.mo27525b()).getLong("youtube_last_refresh_timestamp", -1))) {
            qVar.mo103091c(2, C58833ax.m90834k(-1L), qVar.f324819a.mo26871c());
            qVar.mo103093e(j, 3);
            return;
        }
        qVar.mo103091c(((C86338r) qVar.f324820b.mo27525b()).getInt("youtube_deletion_state", 0), C58833ax.m90834k(Long.valueOf(((C86338r) qVar.f324820b.mo27525b()).getLong("good_youtube_timestamp", -1))), qVar.f324819a.mo26871c());
        qVar.mo103093e(j, 3);
    }
}
