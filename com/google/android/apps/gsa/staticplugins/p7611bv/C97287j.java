package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6586bf.C84837d;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.j */
/* compiled from: PG */
public final /* synthetic */ class C97287j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C97289l f271703a;

    public /* synthetic */ C97287j(C97289l lVar) {
        this.f271703a = lVar;
    }

    public final Object apply(Object obj) {
        C97289l lVar = this.f271703a;
        C84837d dVar = (C84837d) obj;
        C86337q b = ((C86338r) lVar.f271705a.f271713g.mo27525b()).mo80076b();
        int b2 = dVar.mo78515b();
        int i = b2 - 1;
        if (b2 != 0) {
            b.putInt("youtube_deletion_state", i);
            b.putLong("youtube_last_refresh_timestamp", lVar.f271705a.f271712f.mo26871c());
            if (dVar.mo78514a().mo56113h()) {
                b.putLong("good_youtube_timestamp", ((Long) dVar.mo78514a().mo56107c()).longValue());
            }
            b.apply();
            return C118826c.f331422a;
        }
        throw null;
    }
}
