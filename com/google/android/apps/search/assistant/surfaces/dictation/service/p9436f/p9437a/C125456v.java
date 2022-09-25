package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126057bv;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126181j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.p9477a.C126186a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.v */
/* compiled from: PG */
final class C125456v implements C35472h {

    /* renamed from: a */
    private static final C59071e f345957a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.v");

    /* renamed from: b */
    private final C126181j f345958b;

    /* renamed from: c */
    private final C70862aj f345959c;

    /* renamed from: d */
    private final C125931t f345960d;

    /* renamed from: e */
    private final C126057bv f345961e;

    /* renamed from: f */
    private final C125422z f345962f;

    public C125456v(C126181j jVar, C70862aj ajVar, C125422z zVar, C125931t tVar, C126057bv bvVar) {
        this.f345958b = jVar;
        this.f345959c = ajVar;
        this.f345962f = zVar;
        this.f345960d = tVar;
        this.f345961e = bvVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        if (this.f345960d.mo107193l()) {
            this.f345958b.mo107443n(dyVar);
            C126186a.m206399b(7, this.f345959c);
            return C126309ar.m206527f(this.f345962f.mo106968b(C63122a.SUCCESS_SEARCH), C36180b.f94544a);
        }
        ((C59052c) ((C59052c) f345957a.mo56226d()).mo56372aa(36566)).mo56386p("search action is not supported [SD]");
        this.f345958b.mo107441l(dyVar);
        this.f345961e.mo107295s();
        return C60856cj.m92900i(C36180b.f94544a);
    }
}
