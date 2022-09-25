package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125064as;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125510p;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125374ab;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126324be;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.bd */
/* compiled from: PG */
public final /* synthetic */ class C126217bd implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C126223bj f347788a;

    public /* synthetic */ C126217bd(C126223bj bjVar) {
        this.f347788a = bjVar;
    }

    public final Object apply(Object obj) {
        C126223bj bjVar = this.f347788a;
        C125510p pVar = (C125510p) obj;
        bjVar.f347806f.mo107442m(pVar.mo106998d());
        C125374ab abVar = bjVar.f347819s.f345896a;
        if (!abVar.f345792k.getAndSet(true)) {
            abVar.f345785d.mo107146a();
        }
        bjVar.f347803c.mo107491a(pVar.mo106996b(), pVar.mo106995a(), BuildConfig.FLAVOR, bjVar.f347817q);
        bjVar.mo107471h(C126324be.m206557g(pVar));
        C125064as asVar = (C125064as) pVar.mo106996b().toBuilder();
        asVar.mo106793a(pVar.mo106995a().f345042a);
        bjVar.f347805e.mo107294r((C125065at) asVar.build(), true);
        return null;
    }
}
