package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122460o;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123040cg;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123041ch;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123042ci;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.assistant.p3897e.p3921j.amf;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4985f.p5030q.C65185es;
import com.google.protos.p4985f.p5030q.C65190ex;
import com.google.protos.p4985f.p5030q.C65191ey;
import com.google.speech.p5218j.C67033io;
import com.google.speech.p5218j.C67070jy;
import com.google.speech.p5218j.C67091ks;
import java.util.Collections;
import java.util.Iterator;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.cs */
/* compiled from: PG */
public final /* synthetic */ class C122785cs implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340116a;

    /* renamed from: b */
    public final /* synthetic */ C122419bk f340117b;

    /* renamed from: c */
    public final /* synthetic */ C52091ex f340118c;

    /* renamed from: d */
    public final /* synthetic */ C122461p f340119d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f340120e;

    public /* synthetic */ C122785cs(C122870ea eaVar, C122419bk bkVar, C52091ex exVar, C122461p pVar, C60870cx cxVar) {
        this.f340116a = eaVar;
        this.f340117b = bkVar;
        this.f340118c = exVar;
        this.f340119d = pVar;
        this.f340120e = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C65190ex exVar;
        Optional empty;
        C67091ks ksVar;
        C67070jy jyVar;
        int i;
        C122870ea eaVar = this.f340116a;
        C122419bk bkVar = this.f340117b;
        C52091ex exVar2 = this.f340118c;
        C122461p pVar = this.f340119d;
        C60870cx cxVar = this.f340120e;
        C65185es esVar = (C65185es) C65191ey.f176424p.createBuilder();
        Objects.requireNonNull(esVar);
        ((Optional) obj).ifPresent(new C122842dn(esVar));
        C123042ci.m202375a(esVar, bkVar);
        esVar.copyOnWrite();
        exVar2.getClass();
        ((C65191ey) esVar.instance).f176435j = exVar2;
        if (eaVar.f340314o) {
            Iterator it = exVar2.f136712a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    empty = Optional.empty();
                    break;
                }
                C52232kc kcVar = (C52232kc) it.next();
                if (kcVar.f137065b.equals("asst.device.capabilities")) {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    if (kaVar.f137060b.equals("assistant.api.DeviceCapabilities")) {
                        try {
                            C52230ka kaVar2 = kcVar.f137066c;
                            if (kaVar2 == null) {
                                kaVar2 = C52230ka.f137057d;
                            }
                            C51715bm bmVar = (C51715bm) C62942bv.parseFrom((C62942bv) C51715bm.f135662t, kaVar2.f137061c, C62921ba.m95368a());
                            amf amf = bmVar.f135667d;
                            if (amf == null) {
                                amf = amf.f135365e;
                            }
                            if ((amf.f135367a & 2) != 0) {
                                amf amf2 = bmVar.f135667d;
                                if (amf2 == null) {
                                    amf2 = amf.f135365e;
                                }
                                empty = Optional.m71637of(amf2.f135369c);
                            } else {
                                empty = Optional.empty();
                            }
                        } catch (C62974ct e) {
                            ((C59052c) ((C59052c) ((C59052c) C122870ea.f340300a.mo56225c()).mo56382g(e)).mo56372aa(34853)).mo56386p("Failed to parse DeviceCapabilities");
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (empty.isPresent() && C52431rm.OPA_ANDROID_SMART_DISPLAY.name().equals(empty.get())) {
                if ((pVar.f339489a & 1) != 0) {
                    ksVar = pVar.f339492d;
                    if (ksVar == null) {
                        ksVar = C67091ks.f182386h;
                    }
                } else {
                    ksVar = null;
                }
                if (ksVar == null) {
                    C123042ci.m202376b(esVar, 8);
                } else if (!(ksVar.f182394g.size() == 0 || (ksVar.f182388a & 2) == 0 || (jyVar = (C67070jy) Collections.unmodifiableMap(ksVar.f182393f).get(ksVar.f182390c)) == null)) {
                    C58528ij ijVar = (C58528ij) Collection.EL.stream(jyVar.f182317a).map(C123040cg.f340605a).collect(C58370cn.f155947b);
                    Collection.EL.stream(ijVar).map(C123041ch.f340606a).collect(Collectors.joining(", "));
                    if (ijVar.contains(C67033io.GH_INTERVAL_TRUSTED_USER)) {
                        i = 7;
                    } else if (ijVar.contains(C67033io.GH_INTERVAL_USER)) {
                        i = 6;
                    } else if (ijVar.contains(C67033io.GH_INTERVAL_UNLIKELY_USER)) {
                        i = 5;
                    } else {
                        i = ijVar.contains(C67033io.GH_INTERVAL_GUEST) ? 4 : 1;
                    }
                    C123042ci.m202376b(esVar, i);
                }
            }
        }
        int i2 = pVar.f339490b;
        int a = C122460o.m201902a(i2);
        int i3 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i3 == 0) {
            return C60922j.m93044g(cxVar, C47810es.m84963c(new C122844dp(eaVar, esVar, pVar)), C60826bg.f164896a);
        } else if (i3 == 1) {
            if (i2 == 2) {
                exVar = (C65190ex) pVar.f339491c;
            } else {
                exVar = C65190ex.f176421b;
            }
            esVar.copyOnWrite();
            C65191ey eyVar = (C65191ey) esVar.instance;
            exVar.getClass();
            eyVar.f176428c = exVar;
            eyVar.f176427b = 7;
            return C60856cj.m92900i(esVar);
        } else if (i3 == 2) {
            return C60856cj.m92899h(new C122872ec("RequestHandler", "Input not set"));
        } else {
            throw new AssertionError();
        }
    }
}
