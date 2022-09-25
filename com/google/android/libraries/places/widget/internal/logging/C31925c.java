package com.google.android.libraries.places.widget.internal.logging;

import com.google.android.libraries.places.p2424a.p2425a.C31773d;
import com.google.android.libraries.places.p2424a.p2425a.C31777h;
import com.google.android.libraries.places.p2424a.p2425a.C31778i;
import com.google.android.libraries.places.widget.internal.common.AutocompleteActivityOrigin;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.common.p4552o.p4564j.C60006ab;
import com.google.common.p4552o.p4564j.C60008ad;
import com.google.common.p4552o.p4564j.C60009ae;
import com.google.common.p4552o.p4564j.C60012ah;

/* renamed from: com.google.android.libraries.places.widget.internal.logging.c */
/* compiled from: PG */
public final class C31925c implements C31924b {

    /* renamed from: a */
    private final C31773d f85865a;

    /* renamed from: b */
    private final C31777h f85866b;

    public C31925c(C31777h hVar, C31773d dVar) {
        this.f85866b = hVar;
        this.f85865a = dVar;
    }

    /* renamed from: a */
    public final void mo37694a(AutocompleteWidgetSession autocompleteWidgetSession) {
        C60006ab abVar = (C60006ab) C60008ad.f162175p.createBuilder();
        boolean z = autocompleteWidgetSession.f85856j;
        abVar.copyOnWrite();
        C60008ad adVar = (C60008ad) abVar.instance;
        adVar.f162177a |= 4;
        adVar.f162180d = z;
        boolean z2 = autocompleteWidgetSession.f85850d;
        abVar.copyOnWrite();
        C60008ad adVar2 = (C60008ad) abVar.instance;
        adVar2.f162177a |= 8;
        adVar2.f162181e = z2;
        boolean z3 = autocompleteWidgetSession.f85851e;
        abVar.copyOnWrite();
        C60008ad adVar3 = (C60008ad) abVar.instance;
        adVar3.f162177a |= 16;
        adVar3.f162182f = z3;
        int i = autocompleteWidgetSession.f85855i;
        abVar.copyOnWrite();
        C60008ad adVar4 = (C60008ad) abVar.instance;
        adVar4.f162177a |= 32;
        adVar4.f162183g = i;
        int i2 = autocompleteWidgetSession.f85852f;
        abVar.copyOnWrite();
        C60008ad adVar5 = (C60008ad) abVar.instance;
        adVar5.f162177a |= 64;
        adVar5.f162184h = i2;
        int i3 = autocompleteWidgetSession.f85853g;
        abVar.copyOnWrite();
        C60008ad adVar6 = (C60008ad) abVar.instance;
        adVar6.f162177a |= 128;
        adVar6.f162185i = i3;
        int i4 = autocompleteWidgetSession.f85854h;
        abVar.copyOnWrite();
        C60008ad adVar7 = (C60008ad) abVar.instance;
        adVar7.f162177a |= 256;
        adVar7.f162186j = i4;
        int length = autocompleteWidgetSession.f85858l.length();
        abVar.copyOnWrite();
        C60008ad adVar8 = (C60008ad) abVar.instance;
        adVar8.f162177a |= 512;
        adVar8.f162187k = length;
        int i5 = autocompleteWidgetSession.f85859m;
        abVar.copyOnWrite();
        C60008ad adVar9 = (C60008ad) abVar.instance;
        adVar9.f162177a |= 1024;
        adVar9.f162188l = i5;
        int i6 = autocompleteWidgetSession.f85860n;
        abVar.copyOnWrite();
        C60008ad adVar10 = (C60008ad) abVar.instance;
        adVar10.f162177a |= 2048;
        adVar10.f162189m = i6;
        boolean z4 = autocompleteWidgetSession.f85861o;
        abVar.copyOnWrite();
        C60008ad adVar11 = (C60008ad) abVar.instance;
        adVar11.f162177a |= 4096;
        adVar11.f162190n = z4;
        int i7 = autocompleteWidgetSession.f85862p;
        abVar.copyOnWrite();
        C60008ad adVar12 = (C60008ad) abVar.instance;
        adVar12.f162177a |= 8192;
        adVar12.f162191o = i7;
        if (autocompleteWidgetSession.f85847a == AutocompleteActivityOrigin.FRAGMENT) {
            abVar.copyOnWrite();
            C60008ad adVar13 = (C60008ad) abVar.instance;
            adVar13.f162178b = 1;
            adVar13.f162177a |= 1;
        } else if (autocompleteWidgetSession.f85847a == AutocompleteActivityOrigin.INTENT) {
            abVar.copyOnWrite();
            C60008ad adVar14 = (C60008ad) abVar.instance;
            adVar14.f162178b = 2;
            adVar14.f162177a |= 1;
        } else {
            abVar.copyOnWrite();
            C60008ad adVar15 = (C60008ad) abVar.instance;
            adVar15.f162178b = 0;
            adVar15.f162177a |= 1;
        }
        if (autocompleteWidgetSession.f85848b == AutocompleteActivityMode.FULLSCREEN) {
            abVar.copyOnWrite();
            C60008ad adVar16 = (C60008ad) abVar.instance;
            adVar16.f162179c = 2;
            adVar16.f162177a |= 2;
        } else if (autocompleteWidgetSession.f85848b == AutocompleteActivityMode.OVERLAY) {
            abVar.copyOnWrite();
            C60008ad adVar17 = (C60008ad) abVar.instance;
            adVar17.f162179c = 1;
            adVar17.f162177a |= 2;
        }
        C60008ad adVar18 = (C60008ad) abVar.build();
        C60009ae b = C31778i.m59135b(this.f85865a);
        b.copyOnWrite();
        C60012ah ahVar = (C60012ah) b.instance;
        C60012ah ahVar2 = C60012ah.f162194m;
        ahVar.f162197b = 10;
        ahVar.f162196a |= 2;
        b.copyOnWrite();
        C60012ah ahVar3 = (C60012ah) b.instance;
        adVar18.getClass();
        ahVar3.f162201f = adVar18;
        ahVar3.f162196a |= 16384;
        this.f85866b.mo37382a(C31778i.m59134a((C60012ah) b.build()));
    }
}
