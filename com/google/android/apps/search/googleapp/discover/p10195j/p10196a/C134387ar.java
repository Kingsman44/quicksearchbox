package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C134004r;
import com.google.android.apps.search.googleapp.discover.scrolllock.LauncherHorizontalScrollLocker;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60901do;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57077as;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57078at;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64194ap;
import com.google.protos.youtube.elements.C66059au;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.ar */
/* compiled from: PG */
public final class C134387ar implements C21312s {

    /* renamed from: a */
    private final C134004r f366089a;

    public C134387ar(C134004r rVar) {
        this.f366089a = rVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        C62940bt btVar = C64194ap.f173567c;
        C69664n.m101060f(btVar, "scrollLockCommand");
        return btVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C64194ap apVar = (C64194ap) obj;
        C69664n.m101061g(apVar, "command");
        C69664n.m101061g(rVar, "eventData");
        C134004r rVar2 = this.f366089a;
        C57078at atVar = apVar.f173569a;
        if (atVar == null) {
            atVar = C57078at.f152372c;
        }
        C69664n.m101060f(atVar, "command.getScrollLockData()");
        C69664n.m101061g(atVar, "scrollLockData");
        Thread.currentThread().getName();
        String str = atVar.f152374a;
        int a = C57077as.m88258a(atVar.f152375b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            LauncherHorizontalScrollLocker launcherHorizontalScrollLocker = rVar2.f365023b;
            C69664n.m101060f(str, "scrollLockData.scrollSourceId");
            C69664n.m101061g(str, "scrollSourceId");
            launcherHorizontalScrollLocker.f366563d.add(str);
        } else if (i != 2) {
            C59052c cVar = (C59052c) C134004r.f365022a.mo56226d();
            cVar.mo56379ah(new C59094n(40202));
            cVar.mo56386p("ScrollLockData lock type is unspecified!");
        } else {
            LauncherHorizontalScrollLocker launcherHorizontalScrollLocker2 = rVar2.f365023b;
            C69664n.m101060f(str, "scrollLockData.scrollSourceId");
            C69664n.m101061g(str, "scrollSourceId");
            if (launcherHorizontalScrollLocker2.f366563d.contains(str)) {
                if (!launcherHorizontalScrollLocker2.f366562c) {
                    launcherHorizontalScrollLocker2.f366563d.remove(str);
                } else {
                    C60872cz d = launcherHorizontalScrollLocker2.f366561b.mo29164d(C60901do.f165001a, 20, TimeUnit.MILLISECONDS);
                    C69664n.m101060f(d, "lightweightExecutor.sche…0, TimeUnit.MILLISECONDS)");
                    launcherHorizontalScrollLocker2.f366560a.mo50445g(C46438d.m82810b(d), new C46436b(str), launcherHorizontalScrollLocker2.f366564e);
                }
            }
        }
        C69794a aVar = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar;
    }
}
