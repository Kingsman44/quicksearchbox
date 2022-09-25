package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.e.b.a.o;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77894z;
import com.google.android.apps.gsa.nga.engine.recognition.p6111d.C77616b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.search.p2904c.C37355at;
import com.google.android.libraries.search.p2904c.C37356au;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37409bn;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37520e;
import com.google.android.libraries.search.p2904c.C37702ie;
import com.google.android.libraries.search.p2904c.C37703if;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.c.ac */
/* compiled from: PG */
public final class C77512ac implements C77894z {

    /* renamed from: a */
    private static final C58974d f213576a = C58974d.m91136j();

    /* renamed from: b */
    private final C91142g f213577b;

    /* renamed from: c */
    private final C75050a f213578c;

    /* renamed from: d */
    private final o f213579d;

    /* renamed from: e */
    private final C77616b f213580e;

    public C77512ac(C91142g gVar, C75050a aVar, C77616b bVar, o oVar) {
        this.f213577b = gVar;
        this.f213578c = aVar;
        this.f213580e = bVar;
        this.f213579d = oVar;
    }

    /* renamed from: a */
    public final C37410bo mo72594a(C77566as asVar) {
        boolean z = false;
        if (this.f213577b.mo85405j(C90126fx.f250974a) && !this.f213578c.mo71417a().mo71476v()) {
            z = true;
        }
        C37357av avVar = (C37357av) C37360ay.f99224l.createBuilder();
        int c = asVar.mo72680c();
        avVar.copyOnWrite();
        C37360ay ayVar = (C37360ay) avVar.instance;
        ayVar.f99226a |= 2;
        ayVar.f99228c = c;
        int a = asVar.mo72678a();
        avVar.copyOnWrite();
        C37360ay ayVar2 = (C37360ay) avVar.instance;
        ayVar2.f99226a |= 4;
        ayVar2.f99229d = a;
        long millis = Duration.ofSeconds(this.f213577b.mo85399d(C90126fx.f251609lz)).toMillis();
        avVar.copyOnWrite();
        C37360ay ayVar3 = (C37360ay) avVar.instance;
        ayVar3.f99226a |= 128;
        ayVar3.f99234i = millis;
        int b = asVar.mo72679b();
        avVar.copyOnWrite();
        C37360ay ayVar4 = (C37360ay) avVar.instance;
        ayVar4.f99226a |= 8;
        ayVar4.f99230e = b;
        Optional d = asVar.mo72681d();
        Objects.requireNonNull(avVar);
        d.ifPresent(new C77511ab(avVar));
        if (asVar.mo72684g().isPresent()) {
            int intValue = ((Integer) asVar.mo72684g().get()).intValue();
            avVar.copyOnWrite();
            C37360ay ayVar5 = (C37360ay) avVar.instance;
            ayVar5.f99226a |= 16;
            ayVar5.f99231f = intValue;
        }
        C37355at atVar = (C37355at) C37356au.f99216c.createBuilder();
        if (this.f213577b.mo85405j(C90126fx.f251041bN)) {
            atVar.copyOnWrite();
            C37356au auVar = (C37356au) atVar.instance;
            auVar.f99218a |= 1;
            auVar.f99219b = true;
        }
        avVar.copyOnWrite();
        C37360ay ayVar6 = (C37360ay) avVar.instance;
        C37356au auVar2 = (C37356au) atVar.build();
        auVar2.getClass();
        ayVar6.f99233h = auVar2;
        ayVar6.f99226a |= 64;
        C37409bn bnVar = (C37409bn) C37410bo.f99330k.createBuilder();
        bnVar.copyOnWrite();
        C37410bo boVar = (C37410bo) bnVar.instance;
        C37360ay ayVar7 = (C37360ay) avVar.build();
        ayVar7.getClass();
        boVar.f99337f = ayVar7;
        boVar.f99332a |= 1;
        bnVar.copyOnWrite();
        C37410bo boVar2 = (C37410bo) bnVar.instance;
        boVar2.f99332a |= 64;
        boVar2.f99339h = z;
        boolean k = asVar.mo72688k();
        bnVar.copyOnWrite();
        C37410bo boVar3 = (C37410bo) bnVar.instance;
        boVar3.f99333b = 10;
        boVar3.f99334c = Boolean.valueOf(k);
        boolean j = asVar.mo72687j();
        bnVar.copyOnWrite();
        C37410bo boVar4 = (C37410bo) bnVar.instance;
        boVar4.f99332a |= 128;
        boVar4.f99340i = j;
        C39226b bVar = C39226b.TAG_CLASSIC_ASSISTANT_NGA;
        bnVar.copyOnWrite();
        C37410bo boVar5 = (C37410bo) bnVar.instance;
        boVar5.f99336e = Integer.valueOf(bVar.getNumber());
        boVar5.f99335d = 14;
        if (asVar.mo72682e().isPresent()) {
            C37520e a2 = this.f213579d.a();
            if (asVar.mo72686i().isPresent()) {
                if (asVar.mo72690m() == 4 && (a2 == C37520e.ROUTE_BLUETOOTH_REQUIRED || a2 == C37520e.ROUTE_BLUETOOTH_PREFERRED)) {
                    ((C58970a) ((C58970a) f213576a.mo56224b()).mo56372aa(4295)).mo56386p("Discarding hotword - switching to legacy bluetooth audio");
                    this.f213580e.mo72746b(asVar);
                } else {
                    C37702ie ieVar = (C37702ie) C37703if.f100132c.createBuilder();
                    String uri = ((Uri) asVar.mo72686i().get()).toString();
                    ieVar.copyOnWrite();
                    C37703if ifVar = (C37703if) ieVar.instance;
                    uri.getClass();
                    ifVar.f100134a = 1 | ifVar.f100134a;
                    ifVar.f100135b = uri;
                    bnVar.copyOnWrite();
                    C37410bo boVar6 = (C37410bo) bnVar.instance;
                    C37703if ifVar2 = (C37703if) ieVar.build();
                    ifVar2.getClass();
                    boVar6.f99334c = ifVar2;
                    boVar6.f99333b = 13;
                    return (C37410bo) bnVar.build();
                }
            }
        }
        return (C37410bo) bnVar.build();
    }
}
