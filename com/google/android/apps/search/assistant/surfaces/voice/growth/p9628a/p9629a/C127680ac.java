package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51725bw;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.assistant.p4008y.p4009a.C53543ac;
import com.google.assistant.p4008y.p4009a.C53544ad;
import com.google.assistant.p4008y.p4009a.C53545ae;
import com.google.assistant.p4008y.p4009a.C53548ah;
import com.google.assistant.p4008y.p4009a.C53549ai;
import com.google.assistant.p4008y.p4009a.C53550aj;
import com.google.assistant.p4008y.p4009a.C53556ap;
import com.google.assistant.p4008y.p4009a.C53607p;
import com.google.assistant.p4008y.p4009a.C53608q;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58134e;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58135f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C127680ac implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C127681ad f351531a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f351532b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f351533c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f351534d;

    /* renamed from: e */
    public final /* synthetic */ String f351535e;

    public /* synthetic */ C127680ac(C127681ad adVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, String str) {
        this.f351531a = adVar;
        this.f351532b = cxVar;
        this.f351533c = cxVar2;
        this.f351534d = cxVar3;
        this.f351535e = str;
    }

    public final Object call() {
        DisplayMetrics displayMetrics;
        C127681ad adVar = this.f351531a;
        C60870cx cxVar = this.f351532b;
        C60870cx cxVar2 = this.f351533c;
        C60870cx cxVar3 = this.f351534d;
        String str = this.f351535e;
        if (!((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
            return C58836b.f156633a;
        }
        C51715bm bmVar = (C51715bm) C60856cj.m92909r(cxVar2);
        Locale locale = (Locale) C60856cj.m92909r(cxVar3);
        C51772cy cyVar = bmVar.f135671h;
        if (cyVar == null) {
            cyVar = C51772cy.f135824p;
        }
        boolean z = (cyVar.f135826a & 1024) != 0;
        C53545ae aeVar = (C53545ae) C53548ah.f140519n.createBuilder();
        C53549ai aiVar = (C53549ai) C53550aj.f140536b.createBuilder();
        ArrayList arrayList = new ArrayList(Arrays.asList(",NGA_CONTEXT,TIME_CONTEXT,OVERAPP_CONTEXT,APP_CONTROL_CONTEXT".split(",")));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str2 = (String) arrayList.get(i);
            if (!str2.isEmpty()) {
                try {
                    arrayList2.add(C53556ap.m86864a(str2));
                } catch (IllegalArgumentException e) {
                    C59104x c = C127681ad.f351536a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "OlcReqGen");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(37609)).mo56389s("Unsupported Chalkboard context specified in the AgsaOpaGrowth__supported_chalkboard_contexts flag: %s", str2);
                }
            }
            i++;
        }
        aiVar.mo53996a(arrayList2);
        aeVar.copyOnWrite();
        C53548ah ahVar = (C53548ah) aeVar.instance;
        C53550aj ajVar = (C53550aj) aiVar.build();
        ajVar.getClass();
        ahVar.f140527g = ajVar;
        ahVar.f140521a |= 32;
        C52431rm rmVar = C52431rm.OPA_AGSA;
        aeVar.copyOnWrite();
        C53548ah ahVar2 = (C53548ah) aeVar.instance;
        ahVar2.f140522b = rmVar.f137633ah;
        ahVar2.f140521a |= 1;
        aeVar.copyOnWrite();
        C53548ah ahVar3 = (C53548ah) aeVar.instance;
        ahVar3.f140523c = 2;
        ahVar3.f140521a |= 2;
        aeVar.copyOnWrite();
        C53548ah ahVar4 = (C53548ah) aeVar.instance;
        ahVar4.f140521a |= 1024;
        ahVar4.f140531k = z;
        String languageTag = locale.toLanguageTag();
        aeVar.copyOnWrite();
        C53548ah ahVar5 = (C53548ah) aeVar.instance;
        languageTag.getClass();
        ahVar5.f140521a |= 4;
        ahVar5.f140524d = languageTag;
        String id = TimeZone.getDefault().getID();
        aeVar.copyOnWrite();
        C53548ah ahVar6 = (C53548ah) aeVar.instance;
        id.getClass();
        ahVar6.f140521a |= 16;
        ahVar6.f140526f = id;
        String country = locale.getCountry();
        aeVar.copyOnWrite();
        C53548ah ahVar7 = (C53548ah) aeVar.instance;
        country.getClass();
        ahVar7.f140521a |= 8;
        ahVar7.f140525e = country;
        aeVar.copyOnWrite();
        C53548ah ahVar8 = (C53548ah) aeVar.instance;
        bmVar.getClass();
        ahVar8.f140530j = bmVar;
        ahVar8.f140521a |= 512;
        aeVar.mo53995a(adVar.f351539c);
        aeVar.copyOnWrite();
        C53548ah ahVar9 = (C53548ah) aeVar.instance;
        ahVar9.f140521a |= 128;
        ahVar9.f140529i = false;
        C53543ac acVar = (C53543ac) C53544ad.f140512d.createBuilder();
        C51725bw bwVar = bmVar.f135673j;
        if (bwVar == null) {
            bwVar = C51725bw.f135701e;
        }
        String str3 = bwVar.f135706d;
        acVar.copyOnWrite();
        C53544ad adVar2 = (C53544ad) acVar.instance;
        str3.getClass();
        adVar2.f140514a |= 1;
        adVar2.f140515b = str3;
        Context context = adVar.f351538b;
        C58134e eVar = (C58134e) C58135f.f155417f.createBuilder();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            displayMetrics = null;
        } else {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            displayManager.getDisplay(0).getMetrics(displayMetrics2);
            displayMetrics = displayMetrics2;
        }
        if (displayMetrics != null) {
            int i2 = displayMetrics.densityDpi;
            eVar.copyOnWrite();
            C58135f fVar = (C58135f) eVar.instance;
            fVar.f155419a |= 1;
            fVar.f155420b = i2;
            int i3 = displayMetrics.widthPixels;
            eVar.copyOnWrite();
            C58135f fVar2 = (C58135f) eVar.instance;
            fVar2.f155419a |= 2;
            fVar2.f155421c = i3;
            int i4 = displayMetrics.heightPixels;
            eVar.copyOnWrite();
            C58135f fVar3 = (C58135f) eVar.instance;
            fVar3.f155419a |= 4;
            fVar3.f155422d = i4;
        }
        eVar.mo54677a(Arrays.asList(Build.SUPPORTED_ABIS));
        C58135f fVar4 = (C58135f) eVar.build();
        acVar.copyOnWrite();
        C53544ad adVar3 = (C53544ad) acVar.instance;
        fVar4.getClass();
        adVar3.f140516c = fVar4;
        adVar3.f140514a |= 2;
        C53544ad adVar4 = (C53544ad) acVar.build();
        aeVar.copyOnWrite();
        C53548ah ahVar10 = (C53548ah) aeVar.instance;
        adVar4.getClass();
        ahVar10.f140532l = adVar4;
        ahVar10.f140521a |= 4096;
        C53607p pVar = (C53607p) C53608q.f140706d.createBuilder();
        C53548ah ahVar11 = (C53548ah) aeVar.build();
        pVar.copyOnWrite();
        C53608q qVar = (C53608q) pVar.instance;
        ahVar11.getClass();
        qVar.f140709b = ahVar11;
        qVar.f140708a |= 1;
        pVar.copyOnWrite();
        C53608q qVar2 = (C53608q) pVar.instance;
        str.getClass();
        qVar2.f140708a = 2 | qVar2.f140708a;
        qVar2.f140710c = str;
        C58976aa aaVar2 = C58975e.f156826a;
        return C58833ax.m90834k((C53608q) pVar.build());
    }
}
