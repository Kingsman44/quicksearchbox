package com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125133dg;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125390ar;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Collection;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.p.l */
/* compiled from: PG */
final class C126183l implements C70862aj {

    /* renamed from: a */
    private final C126178g f347705a;

    /* renamed from: b */
    private final C125390ar f347706b;

    /* renamed from: c */
    private final C70862aj f347707c;

    public C126183l(C126178g gVar, C125390ar arVar, C70862aj ajVar) {
        this.f347705a = gVar;
        this.f347706b = arVar;
        this.f347707c = ajVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f347707c.mo20121a();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        this.f347707c.mo20122b(th);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C125133dg dgVar = (C125133dg) obj;
        if (dgVar.f345205a == 1 && Collection.EL.stream(((C125065at) dgVar.f345206b).f345042a).anyMatch(C126182k.f347704a)) {
            C126178g gVar = this.f347705a;
            if (gVar.f347688f.compareAndSet(false, true)) {
                ((C59052c) ((C59052c) C126178g.f347682a.mo56224b()).mo56372aa(36867)).mo56386p("First text sent to keyboard [SD]");
                gVar.f347684b.mo19974a(C37176a.f96875at);
            }
            C46459k.m82829b(this.f347706b.mo106953a(), "Failed to update dictation usage time in data store. [SD]", new Object[0]);
        }
        this.f347707c.mo20123c(dgVar);
    }
}
