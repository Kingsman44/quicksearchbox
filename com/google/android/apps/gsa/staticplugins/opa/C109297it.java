package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123776e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9684e.C128197c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.it */
/* compiled from: PG */
public final class C109297it implements C128197c {

    /* renamed from: a */
    public static final C59071e f304472a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.it");

    /* renamed from: b */
    public final C21370a f304473b;

    /* renamed from: c */
    private final C118339a f304474c;

    /* renamed from: d */
    private final C22871g f304475d;

    public C109297it(C118339a aVar, C21370a aVar2, C22871g gVar) {
        this.f304474c = aVar;
        this.f304473b = aVar2;
        this.f304475d = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo95282a(C123733b bVar) {
        C118339a aVar = this.f304474c;
        C53306j jVar = C53306j.INPUT_PLATE;
        C58485gu n = C58485gu.m89846n(24);
        C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
        eVar.mo58885m(C123733b.f341777e, bVar);
        return this.f304475d.mo28209i(aVar.mo90815e(jVar, n, false, (C123777f) eVar.build()), "convertProactiveDataListToFreSuggestionList", new C109294iq(this));
    }
}
