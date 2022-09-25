package com.google.android.apps.search.googleapp.notificationsurvey;

import com.google.android.apps.search.googleapp.p10310h.C136131l;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60888db;
import com.google.p375ai.p378b.C7682ga;
import com.google.p375ai.p378b.C7684gc;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;

/* renamed from: com.google.android.apps.search.googleapp.notificationsurvey.h */
/* compiled from: PG */
public final class C136817h {

    /* renamed from: a */
    public final C60888db f372409a;

    /* renamed from: b */
    public final C46439e f372410b;

    /* renamed from: c */
    public final C46440f f372411c = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C136817h.this.mo113387a();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C136817h.this.mo113387a();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: d */
    public final C28443m f372412d;

    /* renamed from: e */
    public final C136813d f372413e;

    /* renamed from: f */
    public final C57057b f372414f;

    /* renamed from: g */
    public final C7684gc f372415g;

    /* renamed from: h */
    public final C28310af f372416h;

    /* renamed from: i */
    public final C28306ab f372417i;

    /* renamed from: j */
    public final boolean f372418j;

    public C136817h(C136131l lVar, C46439e eVar, C28443m mVar, C60888db dbVar, C136813d dVar, C28310af afVar, C28306ab abVar, boolean z) {
        C57057b bVar = lVar.f370756c;
        this.f372414f = bVar == null ? C57057b.f152311e : bVar;
        this.f372413e = dVar;
        this.f372410b = eVar;
        this.f372412d = mVar;
        this.f372409a = dbVar;
        C7682ga gaVar = lVar.f370755b;
        C7684gc gcVar = (gaVar == null ? C7682ga.f26836d : gaVar).f26840c;
        this.f372415g = gcVar == null ? C7684gc.f26842l : gcVar;
        this.f372416h = afVar;
        this.f372417i = abVar;
        this.f372418j = z;
    }

    /* renamed from: b */
    public static boolean m222496b(C8178yk ykVar) {
        C60214n nVar;
        C60214n nVar2;
        if (ykVar.f28739b == 5) {
            nVar = (C60214n) ykVar.f28740c;
        } else {
            nVar = C60214n.f162914g;
        }
        if ((nVar.f162916a & 2048) == 0) {
            return false;
        }
        if (ykVar.f28739b == 5) {
            nVar2 = (C60214n) ykVar.f28740c;
        } else {
            nVar2 = C60214n.f162914g;
        }
        C60218r rVar = nVar2.f162921f;
        if (rVar == null) {
            rVar = C60218r.f162925d;
        }
        return (rVar.f162927a & 2) == 0;
    }

    /* renamed from: a */
    public final void mo113387a() {
        C47393f.m84236g(new C136811b(), this.f372413e);
    }
}
