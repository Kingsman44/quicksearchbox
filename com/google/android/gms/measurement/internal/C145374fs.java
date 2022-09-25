package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.measurement.p10848a.C145125ac;
import com.google.android.gms.measurement.p10848a.C145126ad;
import com.google.android.gms.measurement.p10848a.C145127ae;
import com.google.android.gms.measurement.p10848a.C145128af;
import com.google.android.gms.measurement.p10848a.C145129ag;
import com.google.android.gms.measurement.p10848a.C145130ah;
import com.google.android.gms.measurement.p10848a.C145131ai;
import com.google.android.gms.measurement.p10848a.C145132aj;
import com.google.android.gms.measurement.p10848a.C145133ak;
import com.google.android.gms.measurement.p10848a.C145134al;
import com.google.android.gms.measurement.p10848a.C145135am;
import com.google.android.gms.measurement.p10848a.C145136an;
import com.google.android.gms.measurement.p10848a.C145141as;
import com.google.android.gms.measurement.p10848a.C145142at;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68893aw;

/* renamed from: com.google.android.gms.measurement.internal.fs */
/* compiled from: PG */
final class C145374fs implements Callable {

    /* renamed from: a */
    final /* synthetic */ EventParcel f392993a;

    /* renamed from: b */
    final /* synthetic */ String f392994b;

    /* renamed from: c */
    final /* synthetic */ C145379fx f392995c;

    public C145374fs(C145379fx fxVar, EventParcel eventParcel, String str) {
        this.f392995c = fxVar;
        this.f392993a = eventParcel;
        this.f392994b = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C145493kc kcVar;
        C145131ai aiVar;
        C145133ak akVar;
        C145382g gVar;
        String str;
        long j;
        C145234an anVar;
        String str2;
        byte[] bArr;
        C145228ah ahVar;
        this.f392995c.f393008a.mo121217m();
        C145421hl hlVar = this.f392995c.f393008a.f393360h;
        C145488jy.m236409I(hlVar);
        EventParcel eventParcel = this.f392993a;
        String str3 = this.f392994b;
        hlVar.mo120904g();
        C145361ff.m236188u();
        C143919bh.m233958a(eventParcel);
        C143919bh.m233969l(str3);
        if (!hlVar.f393011w.f392937g.mo120776m(str3, C145313dl.f392712S)) {
            hlVar.f393011w.mo120965ar().f392802j.mo120895b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        } else if ("_iap".equals(eventParcel.f392536a) || "_iapx".equals(eventParcel.f392536a)) {
            C145131ai aiVar2 = (C145131ai) C145132aj.f392233b.createBuilder();
            C145228ah ahVar2 = hlVar.f393327l.f393355c;
            C145488jy.m236409I(ahVar2);
            ahVar2.mo120819r();
            C145228ah ahVar3 = hlVar.f393327l.f393355c;
            C145488jy.m236409I(ahVar3);
            C145382g f = ahVar3.mo120808f(str3);
            if (f == null) {
                hlVar.f393011w.mo120965ar().f392802j.mo120895b("Log and bundle not available. package_name", str3);
                bArr = new byte[0];
                ahVar = hlVar.f393327l.f393355c;
            } else if (!f.mo121023R()) {
                hlVar.f393011w.mo120965ar().f392802j.mo120895b("Log and bundle disabled. package_name", str3);
                bArr = new byte[0];
                ahVar = hlVar.f393327l.f393355c;
            } else {
                C145133ak akVar2 = (C145133ak) C145134al.f392236S.createBuilder();
                akVar2.copyOnWrite();
                C145134al alVar = (C145134al) akVar2.instance;
                alVar.f392256a |= 1;
                alVar.f392258c = 1;
                akVar2.copyOnWrite();
                C145134al alVar2 = (C145134al) akVar2.instance;
                alVar2.f392256a |= 64;
                alVar2.f392266k = "android";
                if (!TextUtils.isEmpty(f.mo121036l())) {
                    String l = f.mo121036l();
                    akVar2.copyOnWrite();
                    C145134al alVar3 = (C145134al) akVar2.instance;
                    l.getClass();
                    alVar3.f392256a |= 4096;
                    alVar3.f392272q = l;
                }
                if (!TextUtils.isEmpty(f.mo121038n())) {
                    String n = f.mo121038n();
                    C143919bh.m233958a(n);
                    akVar2.copyOnWrite();
                    C145134al alVar4 = (C145134al) akVar2.instance;
                    alVar4.f392256a |= 2048;
                    alVar4.f392271p = n;
                }
                if (!TextUtils.isEmpty(f.mo121039o())) {
                    String o = f.mo121039o();
                    C143919bh.m233958a(o);
                    akVar2.copyOnWrite();
                    C145134al alVar5 = (C145134al) akVar2.instance;
                    alVar5.f392256a |= 8192;
                    alVar5.f392273r = o;
                }
                if (f.mo121025a() != -2147483648L) {
                    int a = (int) f.mo121025a();
                    akVar2.copyOnWrite();
                    C145134al alVar6 = (C145134al) akVar2.instance;
                    alVar6.f392256a |= 33554432;
                    alVar6.f392242E = a;
                }
                long f2 = f.mo121030f();
                akVar2.copyOnWrite();
                C145134al alVar7 = (C145134al) akVar2.instance;
                alVar7.f392256a |= 16384;
                alVar7.f392274s = f2;
                long d = f.mo121028d();
                akVar2.copyOnWrite();
                C145134al alVar8 = (C145134al) akVar2.instance;
                alVar8.f392257b |= 16;
                alVar8.f392250M = d;
                String q = f.mo121041q();
                String k = f.mo121035k();
                if (!TextUtils.isEmpty(q)) {
                    akVar2.copyOnWrite();
                    C145134al alVar9 = (C145134al) akVar2.instance;
                    q.getClass();
                    alVar9.f392256a |= 4194304;
                    alVar9.f392238A = q;
                } else if (!TextUtils.isEmpty(k)) {
                    akVar2.copyOnWrite();
                    C145134al alVar10 = (C145134al) akVar2.instance;
                    k.getClass();
                    alVar10.f392257b |= 4;
                    alVar10.f392247J = k;
                }
                C145224ad e = hlVar.f393327l.mo121212e(str3);
                long c = f.mo121027c();
                akVar2.copyOnWrite();
                C145134al alVar11 = (C145134al) akVar2.instance;
                alVar11.f392256a |= 524288;
                alVar11.f392279x = c;
                if (hlVar.f393011w.mo120980r() && hlVar.f393011w.f392937g.mo120777n(((C145134al) akVar2.instance).f392272q) && e.mo120786f(C145223ac.AD_STORAGE)) {
                    if (!TextUtils.isEmpty((CharSequence) null)) {
                        akVar2.copyOnWrite();
                        C145134al alVar12 = (C145134al) akVar2.instance;
                        throw null;
                    }
                }
                String e2 = e.mo120784e();
                akVar2.copyOnWrite();
                C145134al alVar13 = (C145134al) akVar2.instance;
                alVar13.f392257b |= 128;
                alVar13.f392252O = e2;
                if (e.mo120786f(C145223ac.AD_STORAGE) && f.mo121022Q()) {
                    Pair b = hlVar.f393327l.f393361i.mo121170b(f.mo121036l(), e);
                    if (f.mo121022Q() && !TextUtils.isEmpty((CharSequence) b.first)) {
                        try {
                            String str4 = (String) b.first;
                            Long.toString(eventParcel.f392539d);
                            String a2 = C145421hl.m236339a();
                            akVar2.copyOnWrite();
                            C145134al alVar14 = (C145134al) akVar2.instance;
                            a2.getClass();
                            alVar14.f392256a |= 65536;
                            alVar14.f392276u = a2;
                            if (b.second != null) {
                                boolean booleanValue = ((Boolean) b.second).booleanValue();
                                akVar2.copyOnWrite();
                                C145134al alVar15 = (C145134al) akVar2.instance;
                                alVar15.f392256a |= C89885b.S3REQUEST_VALUE;
                                alVar15.f392277v = booleanValue;
                            }
                        } catch (SecurityException e3) {
                            hlVar.f393011w.mo120965ar().f392802j.mo120895b("Resettable device id encryption failed", e3.getMessage());
                            bArr = new byte[0];
                            ahVar = hlVar.f393327l.f393355c;
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            C145228ah ahVar4 = hlVar.f393327l.f393355c;
                            C145488jy.m236409I(ahVar4);
                            ahVar4.mo120821t();
                            throw th2;
                        }
                    }
                }
                hlVar.f393011w.mo120968c().mo121002k();
                String str5 = Build.MODEL;
                akVar2.copyOnWrite();
                C145134al alVar16 = (C145134al) akVar2.instance;
                str5.getClass();
                alVar16.f392256a |= 256;
                alVar16.f392268m = str5;
                hlVar.f393011w.mo120968c().mo121002k();
                String str6 = Build.VERSION.RELEASE;
                akVar2.copyOnWrite();
                C145134al alVar17 = (C145134al) akVar2.instance;
                str6.getClass();
                alVar17.f392256a |= 128;
                alVar17.f392267l = str6;
                C145232al c2 = hlVar.f393011w.mo120968c();
                c2.mo121002k();
                int i = (int) c2.f392585a;
                akVar2.copyOnWrite();
                C145134al alVar18 = (C145134al) akVar2.instance;
                alVar18.f392256a |= 1024;
                alVar18.f392270o = i;
                C145232al c3 = hlVar.f393011w.mo120968c();
                c3.mo121002k();
                String str7 = c3.f392586b;
                akVar2.copyOnWrite();
                C145134al alVar19 = (C145134al) akVar2.instance;
                str7.getClass();
                alVar19.f392256a |= 512;
                alVar19.f392269n = str7;
                try {
                    if (e.mo120786f(C145223ac.ANALYTICS_STORAGE) && f.mo121037m() != null) {
                        C143919bh.m233958a(f.mo121037m());
                        Long.toString(eventParcel.f392539d);
                        String a3 = C145421hl.m236339a();
                        akVar2.copyOnWrite();
                        C145134al alVar20 = (C145134al) akVar2.instance;
                        a3.getClass();
                        alVar20.f392256a |= C89885b.HTTP_VALUE;
                        alVar20.f392278w = a3;
                    }
                    if (!TextUtils.isEmpty(f.mo121040p())) {
                        String p = f.mo121040p();
                        C143919bh.m233958a(p);
                        akVar2.copyOnWrite();
                        C145134al alVar21 = (C145134al) akVar2.instance;
                        alVar21.f392256a |= 16777216;
                        alVar21.f392241D = p;
                    }
                    String l2 = f.mo121036l();
                    C145228ah ahVar5 = hlVar.f393327l.f393355c;
                    C145488jy.m236409I(ahVar5);
                    List p2 = ahVar5.mo120817p(l2);
                    Iterator it = p2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            kcVar = null;
                            break;
                        }
                        kcVar = (C145493kc) it.next();
                        if ("_lte".equals(kcVar.f393383c)) {
                            break;
                        }
                    }
                    if (kcVar == null) {
                        C144006f fVar = hlVar.f393011w.f392924A;
                        C145493kc kcVar2 = new C145493kc(l2, "auto", "_lte", System.currentTimeMillis(), 0L);
                        p2.add(kcVar2);
                        C145228ah ahVar6 = hlVar.f393327l.f393355c;
                        C145488jy.m236409I(ahVar6);
                        ahVar6.mo120797B(kcVar2);
                    }
                    C145491ka kaVar = hlVar.f393327l.f393359g;
                    C145488jy.m236409I(kaVar);
                    kaVar.f393011w.mo120965ar().f392803k.mo120894a("Checking account type status for ad personalization signals");
                    C145131ai aiVar3 = aiVar2;
                    if (kaVar.f393011w.mo120968c().mo120833a()) {
                        String l3 = f.mo121036l();
                        C143919bh.m233958a(l3);
                        if (f.mo121022Q()) {
                            C145351ew ewVar = kaVar.f393327l.f393353a;
                            C145488jy.m236409I(ewVar);
                            if (ewVar.mo120941f(l3)) {
                                kaVar.f393011w.mo120965ar().f392802j.mo120894a("Turning off ad personalization due to account type");
                                Iterator it2 = p2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if ("_npa".equals(((C145493kc) it2.next()).f393383c)) {
                                            it2.remove();
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                C144006f fVar2 = kaVar.f393011w.f392924A;
                                p2.add(new C145493kc(l3, "auto", "_npa", System.currentTimeMillis(), 1L));
                            }
                        }
                    }
                    C145142at[] atVarArr = new C145142at[p2.size()];
                    int i2 = 0;
                    while (i2 < p2.size()) {
                        C145141as asVar = (C145141as) C145142at.f392296g.createBuilder();
                        String str8 = ((C145493kc) p2.get(i2)).f393383c;
                        asVar.copyOnWrite();
                        C145142at atVar = (C145142at) asVar.instance;
                        str8.getClass();
                        atVar.f392298a |= 2;
                        atVar.f392300c = str8;
                        long j2 = ((C145493kc) p2.get(i2)).f393384d;
                        asVar.copyOnWrite();
                        C145142at atVar2 = (C145142at) asVar.instance;
                        atVar2.f392298a |= 1;
                        atVar2.f392299b = j2;
                        C145491ka kaVar2 = hlVar.f393327l.f393359g;
                        C145488jy.m236409I(kaVar2);
                        kaVar2.mo121243s(asVar, ((C145493kc) p2.get(i2)).f393385e);
                        atVarArr[i2] = (C145142at) asVar.build();
                        i2++;
                    }
                    List asList = Arrays.asList(atVarArr);
                    akVar2.copyOnWrite();
                    C145134al alVar22 = (C145134al) akVar2.instance;
                    alVar22.mo120679b();
                    C62947c.addAll((Iterable) asList, (List) alVar22.f392260e);
                    C145326dy b2 = C145326dy.m236124b(eventParcel);
                    C145495ke o2 = hlVar.f393011w.mo120977o();
                    Bundle bundle = b2.f392808d;
                    C145228ah ahVar7 = hlVar.f393327l.f393355c;
                    C145488jy.m236409I(ahVar7);
                    o2.mo121251G(bundle, ahVar7.mo120807e(str3));
                    hlVar.f393011w.mo120977o().mo121252H(b2, hlVar.f393011w.f392937g.mo120767c(str3));
                    Bundle bundle2 = b2.f392808d;
                    bundle2.putLong("_c", 1);
                    hlVar.f393011w.mo120965ar().f392802j.mo120894a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", eventParcel.f392538c);
                    if (hlVar.f393011w.mo120977o().mo121271aa(((C145134al) akVar2.instance).f392272q)) {
                        hlVar.f393011w.mo120977o().mo121254K(bundle2, "_dbg", 1L);
                        hlVar.f393011w.mo120977o().mo121254K(bundle2, "_r", 1L);
                    }
                    C145228ah ahVar8 = hlVar.f393327l.f393355c;
                    C145488jy.m236409I(ahVar8);
                    C145234an j3 = ahVar8.mo120811j(str3, eventParcel.f392536a);
                    if (j3 == null) {
                        gVar = f;
                        akVar = akVar2;
                        str = str3;
                        aiVar = aiVar3;
                        anVar = new C145234an(str3, eventParcel.f392536a, 0, 0, 0, eventParcel.f392539d, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j = 0;
                    } else {
                        gVar = f;
                        akVar = akVar2;
                        str = str3;
                        aiVar = aiVar3;
                        long j4 = j3.f392601f;
                        anVar = j3.mo120838c(eventParcel.f392539d);
                        j = j4;
                    }
                    C145228ah ahVar9 = hlVar.f393327l.f393355c;
                    C145488jy.m236409I(ahVar9);
                    ahVar9.mo120826y(anVar);
                    C145233am amVar = new C145233am(hlVar.f393011w, eventParcel.f392538c, str, eventParcel.f392536a, eventParcel.f392539d, j, bundle2);
                    C145125ac acVar = (C145125ac) C145126ad.f392211g.createBuilder();
                    long j5 = amVar.f392593d;
                    acVar.copyOnWrite();
                    C145126ad adVar = (C145126ad) acVar.instance;
                    adVar.f392213a |= 2;
                    adVar.f392216d = j5;
                    String str9 = amVar.f392591b;
                    acVar.copyOnWrite();
                    C145126ad adVar2 = (C145126ad) acVar.instance;
                    str9.getClass();
                    adVar2.f392213a |= 1;
                    adVar2.f392215c = str9;
                    long j6 = amVar.f392594e;
                    acVar.copyOnWrite();
                    C145126ad adVar3 = (C145126ad) acVar.instance;
                    adVar3.f392213a |= 4;
                    adVar3.f392217e = j6;
                    C145235ao aoVar = new C145235ao(amVar.f392595f);
                    while (aoVar.hasNext()) {
                        String a4 = aoVar.next();
                        C145129ag agVar = (C145129ag) C145130ah.f392224h.createBuilder();
                        agVar.copyOnWrite();
                        C145130ah ahVar10 = (C145130ah) agVar.instance;
                        a4.getClass();
                        ahVar10.f392226a |= 1;
                        ahVar10.f392227b = a4;
                        Object obj = amVar.f392595f.f392535a.get(a4);
                        if (obj != null) {
                            C145491ka kaVar3 = hlVar.f393327l.f393359g;
                            C145488jy.m236409I(kaVar3);
                            kaVar3.mo121242r(agVar, obj);
                            acVar.mo120663b(agVar);
                        }
                    }
                    C145133ak akVar3 = akVar;
                    akVar3.mo120673d(acVar);
                    C145135am amVar2 = (C145135am) C145136an.f392282b.createBuilder();
                    C145127ae aeVar = (C145127ae) C145128af.f392219d.createBuilder();
                    long j7 = anVar.f392598c;
                    aeVar.copyOnWrite();
                    C145128af afVar = (C145128af) aeVar.instance;
                    afVar.f392221a |= 2;
                    afVar.f392223c = j7;
                    String str10 = eventParcel.f392536a;
                    aeVar.copyOnWrite();
                    C145128af afVar2 = (C145128af) aeVar.instance;
                    str10.getClass();
                    afVar2.f392221a |= 1;
                    afVar2.f392222b = str10;
                    amVar2.copyOnWrite();
                    C145136an anVar2 = (C145136an) amVar2.instance;
                    C145128af afVar3 = (C145128af) aeVar.build();
                    afVar3.getClass();
                    C62971cq cqVar = anVar2.f392284a;
                    if (!cqVar.mo58948c()) {
                        anVar2.f392284a = C62942bv.mutableCopy(cqVar);
                    }
                    anVar2.f392284a.add(afVar3);
                    akVar3.copyOnWrite();
                    C145134al alVar23 = (C145134al) akVar3.instance;
                    C145136an anVar3 = (C145136an) amVar2.build();
                    anVar3.getClass();
                    alVar23.f392248K = anVar3;
                    alVar23.f392257b |= 8;
                    C145507w wVar = hlVar.f393327l.f393358f;
                    C145488jy.m236409I(wVar);
                    String l4 = gVar.mo121036l();
                    List emptyList = Collections.emptyList();
                    List unmodifiableList = Collections.unmodifiableList(((C145134al) akVar3.instance).f392260e);
                    Long valueOf = Long.valueOf(((C145126ad) acVar.instance).f392216d);
                    akVar3.mo120672c(wVar.mo121309a(l4, emptyList, unmodifiableList, valueOf, valueOf));
                    C145126ad adVar4 = (C145126ad) acVar.instance;
                    if ((adVar4.f392213a & 2) != 0) {
                        long j8 = adVar4.f392216d;
                        akVar3.copyOnWrite();
                        C145134al alVar24 = (C145134al) akVar3.instance;
                        alVar24.f392256a |= 4;
                        alVar24.f392262g = j8;
                        long j9 = ((C145126ad) acVar.instance).f392216d;
                        akVar3.copyOnWrite();
                        C145134al alVar25 = (C145134al) akVar3.instance;
                        alVar25.f392256a |= 8;
                        alVar25.f392263h = j9;
                    }
                    long g = gVar.mo121031g();
                    if (g != 0) {
                        akVar3.copyOnWrite();
                        C145134al alVar26 = (C145134al) akVar3.instance;
                        alVar26.f392256a |= 32;
                        alVar26.f392265j = g;
                    } else {
                        g = 0;
                    }
                    long i3 = gVar.mo121033i();
                    if (i3 != 0) {
                        akVar3.copyOnWrite();
                        C145134al alVar27 = (C145134al) akVar3.instance;
                        alVar27.f392256a |= 16;
                        alVar27.f392264i = i3;
                    } else if (g != 0) {
                        akVar3.copyOnWrite();
                        C145134al alVar28 = (C145134al) akVar3.instance;
                        alVar28.f392256a |= 16;
                        alVar28.f392264i = g;
                    }
                    String s = gVar.mo121043s();
                    if (C68893aw.m99823c()) {
                        str2 = null;
                        if (hlVar.f393011w.f392937g.mo120776m((String) null, C145313dl.f392728ah) && s != null) {
                            akVar3.copyOnWrite();
                            C145134al alVar29 = (C145134al) akVar3.instance;
                            alVar29.f392257b |= 8192;
                            alVar29.f392253P = s;
                        }
                    } else {
                        str2 = null;
                    }
                    gVar.mo121045u();
                    int h = (int) gVar.mo121032h();
                    akVar3.copyOnWrite();
                    C145134al alVar30 = (C145134al) akVar3.instance;
                    alVar30.f392256a |= 1048576;
                    alVar30.f392280y = h;
                    hlVar.f393011w.f392937g.mo120770f();
                    akVar3.copyOnWrite();
                    C145134al alVar31 = (C145134al) akVar3.instance;
                    alVar31.f392256a |= 32768;
                    alVar31.f392275t = 74009;
                    C144006f fVar3 = hlVar.f393011w.f392924A;
                    long currentTimeMillis = System.currentTimeMillis();
                    akVar3.copyOnWrite();
                    C145134al alVar32 = (C145134al) akVar3.instance;
                    alVar32.f392256a |= 2;
                    alVar32.f392261f = currentTimeMillis;
                    boolean booleanValue2 = Boolean.TRUE.booleanValue();
                    akVar3.copyOnWrite();
                    C145134al alVar33 = (C145134al) akVar3.instance;
                    alVar33.f392256a |= 8388608;
                    alVar33.f392239B = booleanValue2;
                    if (hlVar.f393011w.f392937g.mo120776m(str2, C145313dl.f392733am)) {
                        hlVar.f393327l.mo121220p(((C145134al) akVar3.instance).f392272q, akVar3);
                    }
                    C145131ai aiVar4 = aiVar;
                    aiVar4.mo120669a(akVar3);
                    C145382g gVar2 = gVar;
                    gVar2.mo121017L(((C145134al) akVar3.instance).f392262g);
                    gVar2.mo121015J(((C145134al) akVar3.instance).f392263h);
                    C145228ah ahVar11 = hlVar.f393327l.f393355c;
                    C145488jy.m236409I(ahVar11);
                    ahVar11.mo120825x(gVar2);
                    C145228ah ahVar12 = hlVar.f393327l.f393355c;
                    C145488jy.m236409I(ahVar12);
                    ahVar12.mo120824w();
                    C145228ah ahVar13 = hlVar.f393327l.f393355c;
                    C145488jy.m236409I(ahVar13);
                    ahVar13.mo120821t();
                    try {
                        C145491ka kaVar4 = hlVar.f393327l.f393359g;
                        C145488jy.m236409I(kaVar4);
                        return kaVar4.mo121245w(((C145132aj) aiVar4.build()).toByteArray());
                    } catch (IOException e4) {
                        hlVar.f393011w.mo120965ar().f392795c.mo120896c("Data loss. Failed to bundle and serialize. appId", C145325dx.m236116a(str), e4);
                        return str2;
                    }
                } catch (SecurityException e5) {
                    hlVar.f393011w.mo120965ar().f392802j.mo120895b("app instance id encryption failed", e5.getMessage());
                    byte[] bArr2 = new byte[0];
                    C145228ah ahVar14 = hlVar.f393327l.f393355c;
                    C145488jy.m236409I(ahVar14);
                    ahVar14.mo120821t();
                    return bArr2;
                }
            }
            C145488jy.m236409I(ahVar);
            ahVar.mo120821t();
            return bArr;
        } else {
            hlVar.f393011w.mo120965ar().f392802j.mo120896c("Generating a payload for this event is not available. package_name, event_name", str3, eventParcel.f392536a);
            return null;
        }
    }
}
