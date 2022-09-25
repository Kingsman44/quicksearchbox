package com.google.android.apps.search.googleapp.urlhandler.internal;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.customtabs.p10152d.C133749j;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.C139787a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139788a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.j */
/* compiled from: PG */
public final class C139809j {

    /* renamed from: f */
    private static final C59071e f380003f = C59071e.m91332i("com.google.android.apps.search.googleapp.urlhandler.internal.j");

    /* renamed from: a */
    public final C89859i f380004a;

    /* renamed from: b */
    public final C139787a f380005b;

    /* renamed from: c */
    public final C38750am f380006c;

    /* renamed from: d */
    public final C133749j f380007d;

    /* renamed from: e */
    public final boolean f380008e;

    public C139809j(C89859i iVar, C139787a aVar, C38750am amVar, C133749j jVar, boolean z) {
        this.f380004a = iVar;
        this.f380005b = aVar;
        this.f380006c = amVar;
        this.f380007d = jVar;
        this.f380008e = z;
    }

    /* renamed from: a */
    public static C89857g m227319a(C89849ae aeVar, C139811l lVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C139823j jVar = lVar.f380012b;
        if (jVar == null) {
            jVar = C139823j.f380066m;
        }
        long j = jVar.f380071d;
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160123d |= 65536;
        cbVar.f160085aW = j;
        fVar.f246203c = (C59687cb) ajVar.build();
        return fVar.mo83699a();
    }

    /* renamed from: b */
    public static C139789b m227320b(C139823j jVar) {
        C139788a aVar = (C139788a) C139789b.f379928d.createBuilder();
        long j = jVar.f380071d;
        aVar.copyOnWrite();
        C139789b bVar = (C139789b) aVar.instance;
        bVar.f379930a |= 1;
        bVar.f379931b = j;
        aVar.copyOnWrite();
        C139789b bVar2 = (C139789b) aVar.instance;
        bVar2.f379930a |= 2;
        bVar2.f379932c = true;
        return (C139789b) aVar.build();
    }

    /* renamed from: c */
    public final void mo115285c(C139823j jVar) {
        C89849ae aeVar;
        C89857g gVar;
        if (!jVar.f380076i) {
            C139851q a = C139851q.m227396a(jVar.f380069b);
            if (a == null) {
                a = C139851q.UNKNOWN;
            }
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                aeVar = C89849ae.SRP_RESULT_CLICK;
            } else if (ordinal == 2) {
                aeVar = C89849ae.SUGGEST_RESULT_CLICK;
            } else if (ordinal == 3) {
                aeVar = C89849ae.NOW_CARD_CLICK_CCT;
            } else if (ordinal == 4) {
                aeVar = C89849ae.SRP_RESULT_CLICK_AMP;
            } else if (ordinal != 5) {
                aeVar = null;
            } else {
                aeVar = C89849ae.NOW_CARD_CLICK_AMP;
            }
            if (aeVar == null) {
                gVar = null;
            } else {
                C89856f fVar = new C89856f();
                fVar.f246201a = aeVar;
                if ((jVar.f380068a & 2) != 0) {
                    fVar.f246204d = jVar.f380070c;
                }
                gVar = fVar.mo83699a();
            }
            if (gVar == null) {
                C59052c cVar = (C59052c) ((C59052c) f380003f.mo56226d()).mo56372aa(41431);
                C139851q a2 = C139851q.m227396a(jVar.f380069b);
                if (a2 == null) {
                    a2 = C139851q.UNKNOWN;
                }
                cVar.mo56387q("Missing start event for source: %s", a2.f380143m);
            } else {
                this.f380004a.mo74236a(gVar);
            }
            if ((jVar.f380068a & 2) != 0) {
                C139787a aVar = this.f380005b;
                C139851q a3 = C139851q.m227396a(jVar.f380069b);
                if (a3 == null) {
                    a3 = C139851q.UNKNOWN;
                }
                aVar.mo115244g(a3, Duration.ofNanos(jVar.f380070c));
                return;
            }
            C139787a aVar2 = this.f380005b;
            C139851q a4 = C139851q.m227396a(jVar.f380069b);
            if (a4 == null) {
                a4 = C139851q.UNKNOWN;
            }
            C69664n.m101061g(a4, "source");
            aVar2.mo115244g(a4, (Duration) null);
        }
    }
}
