package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80724cz;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80727db;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.cm */
/* compiled from: PG */
abstract class C78417cm {
    /* renamed from: c */
    static C78417cm m125948c(C80727db dbVar, C128182n nVar) {
        C58480gp e = C58485gu.m89837e();
        C80724cz czVar = dbVar.f221613b;
        if (czVar == null) {
            czVar = C80724cz.f221601d;
        }
        e.mo55395g(czVar.f221604b);
        if ((dbVar.f221612a & 2) != 0) {
            C80724cz czVar2 = dbVar.f221614c;
            if (czVar2 == null) {
                czVar2 = C80724cz.f221601d;
            }
            e.mo55395g(czVar2.f221604b);
        }
        return new C78488n(e.mo55394f(), nVar);
    }

    /* renamed from: a */
    public abstract C128182n mo73364a();

    /* renamed from: b */
    public abstract C58485gu mo73365b();
}
