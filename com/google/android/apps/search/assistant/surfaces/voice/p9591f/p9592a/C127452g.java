package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127418e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127420g;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127428e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127430g;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127457e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127459g;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127477i;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.g */
/* compiled from: PG */
public final class C127452g {

    /* renamed from: a */
    private static volatile C70338di f350919a;

    /* renamed from: b */
    private static volatile C70338di f350920b;

    /* renamed from: c */
    private static volatile C70338di f350921c;

    /* renamed from: d */
    private static volatile C70338di f350922d;

    /* renamed from: e */
    private static volatile C70716eu f350923e;

    private C127452g() {
    }

    /* renamed from: a */
    public static C70338di m208414a() {
        C70338di diVar = f350921c;
        if (diVar == null) {
            synchronized (C127452g.class) {
                diVar = f350921c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.entry.api.EntryPointService", "OnDeeplinkEntryEvent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127418e.f350849g);
                    d.f187486b = C70850d.m103697c(C127420g.f350858c);
                    diVar = d.mo62040a();
                    f350921c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m208415b() {
        C70338di diVar = f350922d;
        if (diVar == null) {
            synchronized (C127452g.class) {
                diVar = f350922d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.entry.api.EntryPointService", "OnExternalEntryEvent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127428e.f350867c);
                    d.f187486b = C70850d.m103697c(C127430g.f350871c);
                    diVar = d.mo62040a();
                    f350922d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m208416c() {
        C70338di diVar = f350920b;
        if (diVar == null) {
            synchronized (C127452g.class) {
                diVar = f350920b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.entry.api.EntryPointService", "OnSelfTriggerEntryEvent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127457e.f350939f);
                    d.f187486b = C70850d.m103697c(C127459g.f350947b);
                    diVar = d.mo62040a();
                    f350920b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m208417d() {
        C70338di diVar = f350919a;
        if (diVar == null) {
            synchronized (C127452g.class) {
                diVar = f350919a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.entry.api.EntryPointService", "OnVisEntryEvent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127475g.f350983f);
                    d.f187486b = C70850d.m103697c(C127477i.f350991c);
                    diVar = d.mo62040a();
                    f350919a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70716eu m208418e() {
        C70716eu euVar = f350923e;
        if (euVar == null) {
            synchronized (C127452g.class) {
                euVar = f350923e;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.voice.entry.api.EntryPointService");
                    etVar.mo62433a(m208417d());
                    etVar.mo62433a(m208416c());
                    etVar.mo62433a(m208414a());
                    etVar.mo62433a(m208415b());
                    euVar = new C70716eu(etVar);
                    f350923e = euVar;
                }
            }
        }
        return euVar;
    }
}
