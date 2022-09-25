package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl;

import com.google.android.apps.gsa.nga.engine.annotators.bw;
import com.google.android.apps.gsa.nga.engine.annotators.bx;
import com.google.android.apps.gsa.nga.engine.annotators.by;
import com.google.android.apps.gsa.nga.engine.annotators.bz;
import com.google.android.apps.gsa.nga.engine.annotators.ca;
import com.google.android.apps.gsa.nga.engine.annotators.cb;
import com.google.android.apps.gsa.nga.engine.annotators.cd;
import com.google.android.apps.gsa.nga.engine.annotators.p;
import com.google.android.apps.gsa.nga.engine.annotators.q;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.p440an.p441a.C8841h;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4813ah.p4814a.p4815a.C63175h;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import java.util.concurrent.Callable;
import p3186j$.time.Instant;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.h */
/* compiled from: PG */
public final /* synthetic */ class C122700h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ TextAnnotatorImpl f339967a;

    /* renamed from: b */
    public final /* synthetic */ String f339968b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f339969c;

    /* renamed from: d */
    public final /* synthetic */ Optional f339970d;

    /* renamed from: e */
    public final /* synthetic */ Instant f339971e;

    /* renamed from: f */
    public final /* synthetic */ String f339972f;

    /* renamed from: g */
    public final /* synthetic */ C63179l f339973g;

    public /* synthetic */ C122700h(TextAnnotatorImpl textAnnotatorImpl, String str, C58485gu guVar, Optional optional, Instant instant, String str2, C63179l lVar) {
        this.f339967a = textAnnotatorImpl;
        this.f339968b = str;
        this.f339969c = guVar;
        this.f339970d = optional;
        this.f339971e = instant;
        this.f339972f = str2;
        this.f339973g = lVar;
    }

    public final Object call() {
        TextAnnotatorImpl textAnnotatorImpl = this.f339967a;
        String str = this.f339968b;
        C58485gu guVar = this.f339969c;
        Optional optional = this.f339970d;
        Instant instant = this.f339971e;
        String str2 = this.f339972f;
        C63179l lVar = this.f339973g;
        String str3 = textAnnotatorImpl.f339791d;
        boolean z = textAnnotatorImpl.f339794g;
        boolean z2 = textAnnotatorImpl.f339796i;
        boolean z3 = textAnnotatorImpl.f339795h;
        bw createBuilder = bx.f.createBuilder();
        createBuilder.a(guVar);
        long epochMilli = instant.toEpochMilli();
        createBuilder.copyOnWrite();
        bx bxVar = createBuilder.instance;
        boolean z4 = z3;
        boolean z5 = true;
        bxVar.a |= 1;
        bxVar.c = epochMilli;
        createBuilder.copyOnWrite();
        bx bxVar2 = createBuilder.instance;
        str2.getClass();
        bxVar2.a |= 2;
        bxVar2.d = str2;
        createBuilder.copyOnWrite();
        bx bxVar3 = createBuilder.instance;
        str3.getClass();
        bxVar3.a |= 4;
        bxVar3.e = str3;
        boolean z6 = (guVar.contains(C80080z.URL) || guVar.contains(C80080z.APP)) ? z4 : false;
        if (z6) {
            C62940bt btVar = q.g;
            C8841h a = C8841h.m23466a(str3);
            p createBuilder2 = q.f.createBuilder();
            String str4 = a.f30255g;
            createBuilder2.copyOnWrite();
            q qVar = createBuilder2.instance;
            str4.getClass();
            qVar.a |= 32;
            qVar.c = str4;
            if (TextAnnotatorImpl.f339788b.contains(a.mo17252b())) {
                createBuilder2.copyOnWrite();
                q qVar2 = createBuilder2.instance;
                qVar2.a |= 64;
                qVar2.d = 15;
            }
            createBuilder.mo58885m(btVar, createBuilder2.build());
        }
        ca createBuilder3 = cb.j.createBuilder();
        createBuilder3.copyOnWrite();
        cb cbVar = createBuilder3.instance;
        str.getClass();
        cbVar.a |= 1;
        cbVar.b = str;
        bx build = createBuilder.build();
        createBuilder3.copyOnWrite();
        cb cbVar2 = createBuilder3.instance;
        build.getClass();
        cbVar2.c = build;
        cbVar2.a |= 2;
        createBuilder3.copyOnWrite();
        cb cbVar3 = createBuilder3.instance;
        cbVar3.a |= 8;
        cbVar3.e = z;
        createBuilder3.copyOnWrite();
        cb cbVar4 = createBuilder3.instance;
        cbVar4.a |= 16;
        cbVar4.f = z2;
        createBuilder3.copyOnWrite();
        cb cbVar5 = createBuilder3.instance;
        cbVar5.a |= 32;
        cbVar5.g = z6;
        if ((lVar.f170585a & 16) != 0) {
            C63175h hVar = lVar.f170589e;
            if (hVar == null) {
                hVar = C63175h.f170573d;
            }
            double d = (double) hVar.f170576b;
            Double.isNaN(d);
            double d2 = d / 1.0E7d;
            C63175h hVar2 = lVar.f170589e;
            if (hVar2 == null) {
                hVar2 = C63175h.f170573d;
            }
            int i = hVar2.f170577c;
            by createBuilder4 = bz.e.createBuilder();
            createBuilder4.copyOnWrite();
            bz bzVar = createBuilder4.instance;
            bzVar.a |= 1;
            bzVar.b = d2;
            createBuilder4.copyOnWrite();
            bz bzVar2 = createBuilder4.instance;
            bzVar2.a |= 2;
            double d3 = (double) i;
            Double.isNaN(d3);
            bzVar2.c = d3 / 1.0E7d;
            float f = lVar.f170590f;
            createBuilder4.copyOnWrite();
            bz bzVar3 = createBuilder4.instance;
            bzVar3.a |= 4;
            bzVar3.d = (double) (f / 1000.0f);
            createBuilder3.copyOnWrite();
            cb cbVar6 = createBuilder3.instance;
            bz build2 = createBuilder4.build();
            build2.getClass();
            cbVar6.d = build2;
            cbVar6.a |= 4;
        }
        Objects.requireNonNull(createBuilder3);
        optional.ifPresent(new C122703k(createBuilder3));
        try {
            cd parseFrom = C62942bv.parseFrom((C62942bv) cd.d, TextAnnotatorImpl.nativeAnnotate(createBuilder3.build().toByteArray()), C62921ba.m95368a());
            if ((parseFrom.a & 1) == 0) {
                return C58485gu.m89842j(parseFrom.b);
            }
            C59104x c = TextAnnotatorImpl.f339787a.mo56225c();
            if (1 != (parseFrom.a & 1)) {
                z5 = false;
            }
            ((C59052c) ((C59052c) c).mo56372aa(34878)).mo56389s("Error in response: %s", Boolean.valueOf(z5));
            throw new C122872ec("TextAnnotatorImpl", "Error in response");
        } catch (C62974ct e) {
            throw new C122872ec("TextAnnotatorImpl", "Failed to annotate because couldn't parse response", e);
        }
    }
}
