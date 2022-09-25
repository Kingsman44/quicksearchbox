package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.c.f.al;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92449f;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92451h;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.speech.p5208h.C66626cx;
import com.google.speech.p5224k.p5225a.C67242t;
import com.google.speech.p5224k.p5225a.C67244v;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.ad */
/* compiled from: PG */
public final class C116249ad {

    /* renamed from: a */
    public static final C59071e f322344a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.s3request.a.ad");

    /* renamed from: a */
    public static C60870cx m192802a(C92460b bVar, Query query, C58833ax axVar) {
        if (query.f252767f == QueryTriggerType.MAGIC_MIC) {
            return C60856cj.m92900i(C67242t.MAGIC_MIC_PREAMBLE);
        }
        C67242t p = bVar.mo87204p();
        if ((p == C67242t.SEAMLESS_HOTWORD || p == C67242t.SEAMLESS_HOTWORD_BEEP) && axVar.mo56113h() && (axVar.mo56107c() instanceof al)) {
            return C60922j.m93044g(((al) axVar.mo56107c()).f(), new C116248ac(bVar, p), C60826bg.f164896a);
        }
        return C60856cj.m92900i(p);
    }

    /* renamed from: b */
    static C66626cx m192803b(Query query) {
        if (query.mo84326bK()) {
            return C66626cx.WATCH;
        }
        if (query.mo84319bD()) {
            return C66626cx.TV;
        }
        if (query.mo84390cW()) {
            return C66626cx.TABLET;
        }
        if (query.mo84411cr()) {
            return C66626cx.WRIST_WORN;
        }
        return C66626cx.PHONE;
    }

    /* renamed from: c */
    static C67244v m192804c(C92473f fVar, C92460b bVar, C67242t tVar, Query query) {
        HotwordResultMetadata hotwordResultMetadata;
        C92449f fVar2 = new C92449f(fVar.f258028p, fVar.f258025m, fVar.f258005A, fVar.f258027o, fVar.f258034v, fVar.f258026n, fVar.f258036x, tVar, fVar.f258012H, fVar.f258013I);
        if (query.mo84456dj() && (hotwordResultMetadata = query.f252756N) != null) {
            C92451h.m151927a(fVar2, hotwordResultMetadata);
        }
        if (m192805d(query, bVar, tVar)) {
            fVar2.f257854c = true;
        }
        C92451h.m151928b(fVar2, fVar.f258011G);
        return fVar2.mo87150b();
    }

    /* renamed from: d */
    public static boolean m192805d(Query query, C92460b bVar, C67242t tVar) {
        if (query == null || bVar.mo87188F() == null || !query.mo84456dj()) {
            return false;
        }
        if (tVar == C67242t.SEAMLESS_HOTWORD || tVar == C67242t.SEAMLESS_HOTWORD_BEEP) {
            return true;
        }
        return false;
    }
}
