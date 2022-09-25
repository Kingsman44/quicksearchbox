package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128842q;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.t */
/* compiled from: PG */
final class C128923t implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128914l f354295a;

    /* renamed from: b */
    private final C147785k f354296b;

    public C128923t(C128914l lVar) {
        this.f354295a = lVar;
        C147779b bVar = new C147779b(lVar.f354279m, new C128922s(lVar));
        bVar.f398751e = true;
        this.f354296b = bVar.mo124453a();
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C128842q qVar = (C128842q) obj;
        C69664n.m101061g(qVar, "mode");
        C59052c cVar = (C59052c) C128914l.f354267a.mo56224b();
        cVar.mo56379ah(new C59094n(38051));
        cVar.mo56389s("VoicePlateScrimMode: %s", qVar);
        C128842q qVar2 = C128842q.HIDDEN;
        int ordinal = qVar.ordinal();
        if (ordinal == 0) {
            this.f354296b.mo124460b(0.0f, C128914l.f354270d);
        } else if (ordinal == 1) {
            this.f354296b.mo124460b(0.2f, C128914l.f354269c);
        }
    }
}
