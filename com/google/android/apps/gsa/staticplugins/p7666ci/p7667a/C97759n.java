package com.google.android.apps.gsa.staticplugins.p7666ci.p7667a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.p8839t.C118366g;
import com.google.android.apps.gsa.p8839t.C118451i;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85492i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60836bq;
import dagger.C68214a;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.a.n */
/* compiled from: PG */
public final class C97759n {

    /* renamed from: a */
    public static final C59071e f272950a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ci.a.n");

    /* renamed from: b */
    public final C22871g f272951b;

    /* renamed from: c */
    public final C85492i f272952c;

    /* renamed from: d */
    public final C118366g f272953d;

    /* renamed from: e */
    public final C118451i f272954e;

    /* renamed from: f */
    public final C68214a f272955f;

    /* renamed from: g */
    public final C21370a f272956g;

    /* renamed from: h */
    public final long f272957h;

    /* renamed from: i */
    public final C86124t f272958i;

    /* renamed from: j */
    public final C60836bq f272959j = new C60836bq();

    /* renamed from: k */
    public final ConcurrentHashMap f272960k;

    public C97759n(C22871g gVar, C85492i iVar, C118366g gVar2, C118451i iVar2, C68214a aVar, C21370a aVar2, C86124t tVar) {
        this.f272951b = gVar;
        this.f272952c = iVar;
        this.f272953d = gVar2;
        this.f272954e = iVar2;
        this.f272955f = aVar;
        this.f272956g = aVar2;
        this.f272957h = tVar.mo79743a(C90069du.f249714H);
        this.f272958i = tVar;
        this.f272960k = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static void m162033a(Throwable th, C2164c cVar, C53306j jVar) {
        C59104x c = f272950a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PCP.ClientSyncHelper");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(30306)).mo56389s("Unable to read last update time for {%s}. Still starts client sync.", jVar.name());
        cVar.mo5437b(true);
    }
}
