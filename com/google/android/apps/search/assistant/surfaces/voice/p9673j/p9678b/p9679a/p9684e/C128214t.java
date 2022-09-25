package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9684e;

import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123754bu;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123776e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53119cb;
import com.google.assistant.p3994s.p3995a.C53121cd;
import com.google.assistant.p3994s.p3995a.C53122ce;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e.t */
/* compiled from: PG */
public final class C128214t implements C128197c {

    /* renamed from: a */
    public static final C59071e f352690a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e.t");

    /* renamed from: b */
    public final C21370a f352691b;

    /* renamed from: c */
    private final C123587c f352692c;

    /* renamed from: d */
    private final C60888db f352693d;

    public C128214t(C123587c cVar, C21370a aVar, C60888db dbVar) {
        this.f352692c = cVar;
        this.f352691b = aVar;
        this.f352693d = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo95282a(C123733b bVar) {
        C123587c cVar = this.f352692c;
        C53306j jVar = C53306j.INPUT_PLATE;
        C58759qy qyVar = new C58759qy(24);
        C123754bu buVar = (C123754bu) C123755bv.f341837o.createBuilder();
        C53119cb cbVar = (C53119cb) C53122ce.f139215b.createBuilder();
        cbVar.mo53961a(C53121cd.INPUT_SUGGESTIONS);
        C63088z byteString = ((C53122ce) cbVar.build()).toByteString();
        buVar.copyOnWrite();
        C123755bv bvVar = (C123755bv) buVar.instance;
        byteString.getClass();
        bvVar.f341839a |= 64;
        bvVar.f341847i = byteString;
        C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
        eVar.mo58885m(C123733b.f341777e, bVar);
        return C60922j.m93044g(cVar.mo106043c(jVar, qyVar, false, (C123755bv) buVar.build(), (C123777f) eVar.build()), C47810es.m84963c(new C128208n(this)), this.f352693d);
    }
}
