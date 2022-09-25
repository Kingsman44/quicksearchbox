package com.google.android.apps.search.googleapp.p10539y.p10542c;

import com.google.android.apps.search.googleapp.compliance.p10144a.C133531a;
import com.google.android.apps.search.googleapp.compliance.p10144a.C133550as;
import com.google.android.apps.search.googleapp.compliance.p10144a.C133567r;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137940a;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137952l;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t;
import com.google.android.libraries.silk.p3205a.p3234w.C41737a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4319x.C56833b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4319x.C56835d;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;

/* renamed from: com.google.android.apps.search.googleapp.y.c.b */
/* compiled from: PG */
public final class C139896b implements C41737a {

    /* renamed from: a */
    private static final C56848d f380309a;

    /* renamed from: b */
    private final C133550as f380310b;

    /* renamed from: c */
    private final C137940a f380311c;

    /* renamed from: d */
    private final boolean f380312d;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        dVar.f151671a |= 1;
        dVar.f151672b = "setting_not_implemented";
        cVar.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar.instance;
        dVar2.f151671a |= 2;
        dVar2.f151673c = "Setting not supported";
        f380309a = (C56848d) cVar.build();
    }

    public C139896b(C133550as asVar, C137940a aVar, boolean z) {
        this.f380310b = asVar;
        this.f380311c = aVar;
        this.f380312d = z;
    }

    /* renamed from: a */
    public final C60870cx mo44331a(C56835d dVar) {
        if (dVar.f151642a != 1) {
            return C60856cj.m92899h(new C41742a(f380309a));
        }
        C56833b bVar = dVar.f151643b;
        if (bVar == null) {
            bVar = C56833b.f151636c;
        }
        boolean booleanValue = bVar.f151638a == 1 ? ((Boolean) bVar.f151639b).booleanValue() : false;
        if (this.f380312d) {
            C133567r rVar = this.f380310b.f363867a;
            C133531a aVar = new C133531a();
            aVar.f363832b = 1;
            aVar.f363831a = 1;
            aVar.mo111243b(false);
            aVar.mo111244c(booleanValue);
            C46459k.m82829b(rVar.mo111269a(aVar.mo111242a()), "Failed to update CUMA settings from silk settings API", new Object[0]);
        }
        C137960t tVar = (C137960t) this.f380311c;
        C71803m.m105043d(tVar.f375337a, (C69585o) null, (C71424ay) null, new C137952l(tVar, booleanValue, (C69577g) null), 3);
        return C60866ct.f164955a;
    }
}
