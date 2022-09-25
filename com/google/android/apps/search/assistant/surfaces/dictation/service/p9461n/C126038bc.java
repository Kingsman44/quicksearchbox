package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.binaries.satin.app.sd;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125106cg;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125937z;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.bc */
/* compiled from: PG */
public final class C126038bc {

    /* renamed from: a */
    public static final C59071e f347355a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.n.bc");

    /* renamed from: b */
    public static final Duration f347356b = Duration.ofMillis(500);

    /* renamed from: c */
    public final C125937z f347357c;

    /* renamed from: d */
    public final C126054bs f347358d;

    /* renamed from: e */
    public final C126107dr f347359e;

    /* renamed from: f */
    public final Executor f347360f;

    /* renamed from: g */
    public final C60888db f347361g;

    /* renamed from: h */
    public final C42876ab f347362h;

    /* renamed from: i */
    public final boolean f347363i;

    /* renamed from: j */
    public final Duration f347364j;

    /* renamed from: k */
    public final C126160x f347365k;

    /* renamed from: l */
    public final C126160x f347366l;

    /* renamed from: m */
    public final C126160x f347367m;

    /* renamed from: n */
    public final C126160x f347368n;

    /* renamed from: o */
    public final C126160x f347369o;

    /* renamed from: p */
    public final C126160x f347370p;

    /* renamed from: q */
    public final C126160x f347371q;

    /* renamed from: r */
    public final C126160x f347372r;

    /* renamed from: s */
    public final C126160x f347373s;

    /* renamed from: t */
    public final C126160x f347374t;

    /* renamed from: u */
    public final C126160x f347375u;

    /* renamed from: v */
    public final C58495hd f347376v;

    /* renamed from: w */
    public final AtomicReference f347377w = new AtomicReference(C58485gu.m89845m());

    /* renamed from: x */
    public final AtomicBoolean f347378x = new AtomicBoolean(false);

    /* renamed from: y */
    private final AtomicReference f347379y = new AtomicReference(C58485gu.m89845m());

    public C126038bc(C125937z zVar, C126054bs bsVar, C126107dr drVar, sd sdVar, Executor executor, C60888db dbVar, C42876ab abVar, boolean z, boolean z2, long j, long j2, long j3, C62910ar arVar, long j4) {
        Executor executor2 = executor;
        C42876ab abVar2 = abVar;
        this.f347359e = drVar;
        this.f347361g = dbVar;
        this.f347362h = abVar2;
        this.f347363i = z;
        this.f347364j = C62950b.m95473d(arVar);
        if (z2) {
            C46459k.m82829b(abVar2.mo46039a(C126036ba.f347351a, executor2), "Clear edu storage failed. [SD]", new Object[0]);
        }
        this.f347357c = zVar;
        this.f347358d = bsVar;
        this.f347360f = executor2;
        sd sdVar2 = sdVar;
        C126160x a = sdVar2.a(C63124b.TRY_DICTATION, 0, j3, true);
        this.f347366l = a;
        C126160x a2 = sdVar2.a(C63124b.STICKY_MIC, 2, j, true);
        this.f347365k = a2;
        sd sdVar3 = sdVar;
        C126160x a3 = sdVar3.a(C63124b.HEYG_TYPE, j2, 3, true);
        this.f347367m = a3;
        C126160x a4 = sdVar3.a(C63124b.ACTION_BUTTONS, 0, 3, true);
        this.f347368n = a4;
        C126160x a5 = sdVar3.a(C63124b.VOICE_CORRECTION, 0, 3, true);
        this.f347369o = a5;
        C126160x a6 = sdVar3.a(C63124b.ACTION_BUTTON_SAY_PREFIX, 0, 10, false);
        this.f347370p = a6;
        C126160x a7 = sdVar3.a(C63124b.OVERLAY_LEARNING_CENTER, 3, 3, true);
        this.f347371q = a7;
        C126160x a8 = sdVar3.a(C63124b.STOP_CHIP, 5, 3, false);
        this.f347372r = a8;
        C126160x a9 = sdVar3.a(C63124b.CLEAR_ALL_CHIP, 0, 3, false);
        this.f347373s = a9;
        C126160x a10 = sdVar3.a(C63124b.SPELL_IT_OUT, 0, 3, true);
        this.f347374t = a10;
        C126160x a11 = sdVar.a(C63124b.EMOJI_SUGGESTION_CHIP, j4, Long.MAX_VALUE, false);
        this.f347375u = a11;
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C63124b.TRY_DICTATION, a);
        gzVar.mo55429h(C63124b.STICKY_MIC, a2);
        gzVar.mo55429h(C63124b.HEYG_TYPE, a3);
        gzVar.mo55429h(C63124b.ACTION_BUTTONS, a4);
        gzVar.mo55429h(C63124b.VOICE_CORRECTION, a5);
        gzVar.mo55429h(C63124b.ACTION_BUTTON_SAY_PREFIX, a6);
        gzVar.mo55429h(C63124b.OVERLAY_LEARNING_CENTER, a7);
        gzVar.mo55429h(C63124b.STOP_CHIP, a8);
        gzVar.mo55429h(C63124b.CLEAR_ALL_CHIP, a9);
        gzVar.mo55429h(C63124b.SPELL_IT_OUT, a10);
        gzVar.mo55429h(C63124b.EMOJI_SUGGESTION_CHIP, a11);
        this.f347376v = gzVar.mo55427f(false);
    }

    /* renamed from: b */
    public static C60870cx m206090b(C126160x xVar) {
        C60870cx e = xVar.mo107387e();
        C125949ag agVar = new C125949ag(xVar);
        return C60922j.m93045h(e, C47810es.m84966f(agVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public static C60870cx m206091c(C60870cx cxVar, C126160x xVar, Supplier supplier) {
        C125966ax axVar = new C125966ax(xVar, supplier);
        return C60922j.m93045h(cxVar, C47810es.m84966f(axVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public static C60870cx m206092d(C126160x xVar, Supplier supplier) {
        C60870cx e = xVar.mo107387e();
        C125954al alVar = new C125954al(supplier);
        return C60922j.m93044g(e, C47810es.m84963c(alVar), C60826bg.f164896a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo107263a(C125106cg cgVar) {
        C125106cg cgVar2 = C125106cg.KEYBOARD_TIP_EVENT_UNSPECIFIED;
        switch (cgVar.ordinal()) {
            case 0:
            case 16:
                return C60866ct.f164955a;
            case 1:
                return this.f347366l.mo107384b();
            case 2:
            case 3:
                return this.f347366l.mo107388f(C126153q.f347622a);
            case 4:
                return this.f347367m.mo107384b();
            case 5:
                return this.f347367m.mo107388f(C126153q.f347622a);
            case 6:
                return this.f347365k.mo107384b();
            case 7:
                return this.f347365k.mo107388f(C126153q.f347622a);
            case 8:
                return this.f347369o.mo107384b();
            case 9:
                return this.f347369o.mo107388f(C126153q.f347622a);
            case 10:
                return this.f347368n.mo107384b();
            case 11:
                return this.f347368n.mo107388f(C126153q.f347622a);
            case 12:
                return this.f347371q.mo107384b();
            case 13:
                return this.f347371q.mo107388f(C126153q.f347622a);
            case 14:
                return this.f347374t.mo107384b();
            case 15:
                return this.f347374t.mo107388f(C126153q.f347622a);
            default:
                return C60866ct.f164955a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo107264e(C51809dy dyVar, C125034a aVar) {
        C125044j jVar = (C125044j) C126055bt.f347419d.getOrDefault(dyVar.f135936b, C125044j.UNKNOWN);
        if (aVar.equals(C125034a.TRIGGER_VOICE) && ((C58485gu) this.f347379y.get()).contains(jVar)) {
            C46459k.m82829b(this.f347370p.mo107388f(C126153q.f347622a), "Error while dismissing 'say' prefix feature. [SD]", new Object[0]);
        }
        DesugarAtomicReference.updateAndGet(this.f347377w, new C125963au(dyVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo107265f(C58485gu guVar) {
        this.f347379y.set((C58485gu) Collection.EL.stream(guVar).map(C125944ab.f347163a).collect(C58370cn.f155946a));
    }
}
