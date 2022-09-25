package com.google.android.apps.gsa.shared.search;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59601ay;
import com.google.common.p4552o.C59651be;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.amo;
import com.google.speech.p5224k.p5225a.C67229g;

/* renamed from: com.google.android.apps.gsa.shared.search.g */
/* compiled from: PG */
public final class C90499g {
    /* renamed from: a */
    public static C59687cb m147581a(Query query, long j) {
        return (C59687cb) m147584d(query, j).build();
    }

    /* renamed from: b */
    public static C59687cb m147582b(Query query, long j, C58833ax axVar) {
        C59582aj d = m147584d(query, j);
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            d.copyOnWrite();
            C59687cb cbVar = (C59687cb) d.instance;
            C59687cb cbVar2 = C59687cb.f160034bf;
            str.getClass();
            cbVar.f160062a |= 16;
            cbVar.f160129j = str;
        }
        return (C59687cb) d.build();
    }

    /* renamed from: c */
    public static boolean m147583c(Query query, long j) {
        long j2 = query.f252747E - j;
        return j2 > 0 && j2 < 10000;
    }

    /* renamed from: d */
    private static C59582aj m147584d(Query query, long j) {
        String str;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        String b = C39191a.m68623b(query.f252749G);
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        b.getClass();
        int i = 4;
        cbVar.f160062a |= 4;
        cbVar.f160127h = b;
        long j2 = query.f252753K;
        if (j2 != 0) {
            String b2 = C39191a.m68623b(j2);
            ajVar.copyOnWrite();
            C59687cb cbVar2 = (C59687cb) ajVar.instance;
            b2.getClass();
            cbVar2.f160062a |= 8;
            cbVar2.f160128i = b2;
        }
        if (query.mo84263a("android.opa.extra.TRIGGERED_BY") != 0) {
            e a = e.a(query.mo84263a("android.opa.extra.TRIGGERED_BY"));
            ajVar.copyOnWrite();
            C59687cb cbVar3 = (C59687cb) ajVar.instance;
            cbVar3.f160043H = a.ca;
            cbVar3.f160115b |= 32;
        }
        String bn = query.mo84355bn();
        int i2 = 2;
        if (bn != null) {
            ajVar.copyOnWrite();
            C59687cb cbVar4 = (C59687cb) ajVar.instance;
            cbVar4.f160115b |= 2;
            cbVar4.f160039D = bn;
        }
        boolean cj = query.mo84403cj();
        ajVar.copyOnWrite();
        C59687cb cbVar5 = (C59687cb) ajVar.instance;
        cbVar5.f160062a |= 536870912;
        cbVar5.f160145z = cj;
        boolean ck = query.mo84404ck();
        ajVar.copyOnWrite();
        C59687cb cbVar6 = (C59687cb) ajVar.instance;
        cbVar6.f160123d |= 64;
        cbVar6.f160075aM = ck;
        amo amo = query.f252760R;
        if (amo != null) {
            ajVar.copyOnWrite();
            C59687cb cbVar7 = (C59687cb) ajVar.instance;
            cbVar7.f160095ag = amo.f159234au;
            cbVar7.f160115b |= LinearLayoutManager.INVALID_OFFSET;
        }
        if (query.mo84420dA()) {
            if (query.mo84456dj()) {
                i = 2;
            } else if (!query.mo84463dq()) {
                if (query.mo84449dd()) {
                    i = 6;
                } else if (query.mo84450de()) {
                    i = 5;
                } else if ("and.opa.longpress".equals(query.mo84355bn())) {
                    i = 7;
                } else if ("and.opa.elmyra".equals(query.mo84355bn()) || "and.opa.lockscreen.elmyra".equals(query.mo84355bn())) {
                    i = 8;
                } else {
                    i = 9;
                    if (!query.mo84338bW() && !query.mo84328bM()) {
                        i = query.mo84460dn() ? 3 : 1;
                    }
                }
            }
            ajVar.copyOnWrite();
            C59687cb cbVar8 = (C59687cb) ajVar.instance;
            cbVar8.f160038C = i - 1;
            cbVar8.f160115b |= 1;
            if (i == 2) {
                HotwordResultMetadata hotwordResultMetadata = query.f252756N;
                if (hotwordResultMetadata != null) {
                    String str2 = (String) hotwordResultMetadata.mo84607i().mo56111f();
                    if (str2 != null) {
                        ajVar.copyOnWrite();
                        C59687cb cbVar9 = (C59687cb) ajVar.instance;
                        cbVar9.f160115b |= C89885b.S3REQUEST_VALUE;
                        cbVar9.f160054S = str2;
                        float c = hotwordResultMetadata.mo84599c();
                        ajVar.copyOnWrite();
                        C59687cb cbVar10 = (C59687cb) ajVar.instance;
                        cbVar10.f160115b = 262144 | cbVar10.f160115b;
                        cbVar10.f160055T = c;
                        float d = hotwordResultMetadata.mo84600d();
                        ajVar.copyOnWrite();
                        C59687cb cbVar11 = (C59687cb) ajVar.instance;
                        cbVar11.f160115b = 524288 | cbVar11.f160115b;
                        cbVar11.f160056U = d;
                    }
                    C59601ay ayVar = (C59601ay) C59651be.f159929E.createBuilder();
                    if (hotwordResultMetadata.mo84608j() == C67229g.UNKNOWN) {
                        i2 = 3;
                    }
                    ayVar.copyOnWrite();
                    C59651be beVar = (C59651be) ayVar.instance;
                    beVar.f159941g = i2 - 1;
                    beVar.f159935a |= 32;
                    boolean l = hotwordResultMetadata.mo84610l();
                    ayVar.copyOnWrite();
                    C59651be beVar2 = (C59651be) ayVar.instance;
                    beVar2.f159935a |= 64;
                    beVar2.f159942h = l;
                    boolean m = hotwordResultMetadata.mo84611m();
                    ayVar.copyOnWrite();
                    C59651be beVar3 = (C59651be) ayVar.instance;
                    beVar3.f159935a |= 128;
                    beVar3.f159943i = m;
                    long f = hotwordResultMetadata.mo84603f();
                    ayVar.copyOnWrite();
                    C59651be beVar4 = (C59651be) ayVar.instance;
                    beVar4.f159935a |= 512;
                    beVar4.f159944j = f;
                    ajVar.mo57010g((C59651be) ayVar.build());
                }
            } else if (i != 1 && j >= 0 && query.mo84316bA() && m147583c(query, j)) {
                HotwordResultMetadata hotwordResultMetadata2 = query.f252756N;
                C59601ay ayVar2 = (C59601ay) C59651be.f159929E.createBuilder();
                ayVar2.copyOnWrite();
                C59651be beVar5 = (C59651be) ayVar2.instance;
                beVar5.f159935a |= 128;
                beVar5.f159943i = true;
                ayVar2.copyOnWrite();
                C59651be beVar6 = (C59651be) ayVar2.instance;
                beVar6.f159935a |= 512;
                beVar6.f159944j = j;
                ajVar.mo57010g((C59651be) ayVar2.build());
                if (!(hotwordResultMetadata2 == null || (str = (String) hotwordResultMetadata2.mo84607i().mo56111f()) == null)) {
                    ajVar.copyOnWrite();
                    C59687cb cbVar12 = (C59687cb) ajVar.instance;
                    cbVar12.f160115b |= C89885b.S3REQUEST_VALUE;
                    cbVar12.f160054S = str;
                    float c2 = hotwordResultMetadata2.mo84599c();
                    ajVar.copyOnWrite();
                    C59687cb cbVar13 = (C59687cb) ajVar.instance;
                    cbVar13.f160115b |= C89885b.HTTP_VALUE;
                    cbVar13.f160055T = c2;
                    float d2 = hotwordResultMetadata2.mo84600d();
                    ajVar.copyOnWrite();
                    C59687cb cbVar14 = (C59687cb) ajVar.instance;
                    cbVar14.f160115b |= 524288;
                    cbVar14.f160056U = d2;
                }
            }
        }
        return ajVar;
    }
}
