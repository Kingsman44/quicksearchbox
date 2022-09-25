package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78518aa;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78530am;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78531an;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78532ao;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78533ap;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78534aq;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78535ar;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78538au;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78539av;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78554i;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78563r;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78567v;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.bh */
/* compiled from: PG */
abstract class C78385bh {
    /* renamed from: b */
    static C78385bh m125893b(C78540aw awVar) {
        C78534aq aqVar;
        C78531an anVar;
        C78538au auVar;
        C78530am d = C78540aw.m126175d();
        if (awVar.mo73485g()) {
            if (awVar.mo73437c().mo73481b().equals(C78539av.EMPTY)) {
                auVar = awVar.mo73437c();
                if (auVar == null) {
                    throw new NullPointerException("Null topContent");
                }
            } else {
                auVar = C78567v.m126238a(C78533ap.f216279c);
            }
            ((C78518aa) d).f216259c = auVar;
        }
        if (awVar.mo73483e()) {
            if (awVar.mo73435a().mo73464a().equals(C78532ao.EMPTY)) {
                anVar = awVar.mo73435a();
                if (anVar == null) {
                    throw new NullPointerException("Null doubleContent");
                }
            } else {
                anVar = C78554i.m126206a(C78533ap.f216279c);
            }
            ((C78518aa) d).f216258b = anVar;
        }
        if (awVar.mo73484f()) {
            if (awVar.mo73436b().mo73472a().equals(C78535ar.EMPTY)) {
                aqVar = awVar.mo73436b();
                if (aqVar == null) {
                    throw new NullPointerException("Null singleContent");
                }
            } else {
                aqVar = C78563r.m126231b(C78533ap.f216281e);
            }
            ((C78518aa) d).f216257a = aqVar;
        }
        return new C78487m(d.mo73434a());
    }

    /* renamed from: c */
    static C78385bh m125894c() {
        return new C78487m(C78540aw.f216294a);
    }

    /* renamed from: a */
    public abstract C78540aw mo73335a();
}
