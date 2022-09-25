package com.google.android.apps.gsa.search.core.p6513aj;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86109e;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89963ab;
import com.google.android.apps.gsa.shared.util.C90771bo;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.aj.ab */
/* compiled from: PG */
final class C84517ab implements C86109e {

    /* renamed from: a */
    final Context f230026a;

    /* renamed from: b */
    private final C68214a f230027b;

    public C84517ab(C68214a aVar, Context context) {
        this.f230027b = aVar;
        this.f230026a = context;
    }

    /* renamed from: a */
    public final void mo70818a(C86124t tVar, C86117m mVar) {
        if (!tVar.mo79746e(C89963ab.f246485b) && C90771bo.m148273b(this.f230026a, UserHandleCompat.m148154a())) {
            ((C118561t) this.f230027b.mo27525b()).mo103751b(C118522by.UPDATE_GSERVICES_CONFIG, C118472ag.f328819i);
        }
    }

    /* renamed from: b */
    public final void mo70819b(C86124t tVar) {
        mo70818a(tVar, C86117m.f232762a);
    }
}
