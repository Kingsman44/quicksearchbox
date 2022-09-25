package com.google.android.apps.gsa.speech.p7295k.p7297b;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5195a.C66448c;
import com.google.speech.p5195a.C66449d;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5224k.p5225a.C67231i;
import com.google.speech.p5224k.p5225a.C67239q;
import com.google.speech.p5224k.p5225a.C67240r;
import com.google.speech.p5224k.p5225a.C67242t;
import com.google.speech.p5224k.p5225a.C67243u;
import com.google.speech.p5224k.p5225a.C67244v;

/* renamed from: com.google.android.apps.gsa.speech.k.b.f */
/* compiled from: PG */
public final class C92449f {

    /* renamed from: d */
    private static final C59071e f257851d = C59071e.m91332i("com.google.android.apps.gsa.speech.k.b.f");

    /* renamed from: a */
    public String f257852a;

    /* renamed from: b */
    public C67231i f257853b;

    /* renamed from: c */
    public boolean f257854c;

    /* renamed from: e */
    private final C66422b f257855e;

    /* renamed from: f */
    private final boolean f257856f;

    /* renamed from: g */
    private final boolean f257857g;

    /* renamed from: h */
    private final boolean f257858h;

    /* renamed from: i */
    private final C67242t f257859i;

    /* renamed from: j */
    private final boolean f257860j;

    /* renamed from: k */
    private final boolean f257861k;

    /* renamed from: l */
    private final boolean f257862l;

    /* renamed from: m */
    private final int f257863m;

    public C92449f(C66422b bVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, C67242t tVar, boolean z6, int i) {
        this.f257855e = bVar;
        this.f257856f = z;
        this.f257857g = z2;
        this.f257858h = z3;
        this.f257860j = z4;
        this.f257861k = z5;
        this.f257852a = str;
        this.f257859i = tVar;
        this.f257862l = z6;
        this.f257863m = i;
    }

    /* renamed from: a */
    static C66449d m151923a() {
        C66448c cVar = (C66448c) C66449d.f180680d.createBuilder();
        cVar.copyOnWrite();
        C66449d dVar = (C66449d) cVar.instance;
        dVar.f180682a |= 1;
        dVar.f180683b = 250;
        cVar.copyOnWrite();
        C66449d dVar2 = (C66449d) cVar.instance;
        dVar2.f180682a |= 2;
        dVar2.f180684c = 1;
        return (C66449d) cVar.build();
    }

    /* renamed from: b */
    public final C67244v mo87150b() {
        C67239q qVar = (C67239q) C67244v.f182771s.createBuilder();
        C66422b bVar = this.f257855e;
        if (bVar != null) {
            qVar.copyOnWrite();
            C67244v vVar = (C67244v) qVar.instance;
            vVar.f182776c = bVar;
            vVar.f182774a |= 1;
        }
        boolean z = this.f257856f;
        qVar.copyOnWrite();
        C67244v vVar2 = (C67244v) qVar.instance;
        vVar2.f182774a |= 8;
        vVar2.f182779f = z;
        boolean z2 = this.f257857g;
        qVar.copyOnWrite();
        C67244v vVar3 = (C67244v) qVar.instance;
        vVar3.f182774a |= C89885b.HTTP_VALUE;
        vVar3.f182785l = z2;
        int i = 2;
        if (this.f257857g) {
            int i2 = this.f257863m;
            qVar.copyOnWrite();
            C67244v vVar4 = (C67244v) qVar.instance;
            vVar4.f182774a |= 2;
            vVar4.f182777d = i2;
        }
        boolean z3 = this.f257858h;
        qVar.copyOnWrite();
        C67244v vVar5 = (C67244v) qVar.instance;
        vVar5.f182774a |= C89885b.S3REQUEST_VALUE;
        vVar5.f182784k = z3;
        if (this.f257858h) {
            C66449d a = m151923a();
            qVar.copyOnWrite();
            C67244v vVar6 = (C67244v) qVar.instance;
            a.getClass();
            vVar6.f182778e = a;
            vVar6.f182774a |= 4;
        }
        if (true != this.f257861k) {
            i = 0;
        }
        qVar.copyOnWrite();
        C67244v vVar7 = (C67244v) qVar.instance;
        vVar7.f182774a |= 1024;
        vVar7.f182782i = i;
        boolean z4 = this.f257860j;
        qVar.copyOnWrite();
        C67244v vVar8 = (C67244v) qVar.instance;
        vVar8.f182774a |= 33554432;
        vVar8.f182786m = z4;
        ((C59052c) ((C59052c) f257851d.mo56224b()).mo56372aa(12785)).mo56387q("S3PreambleType %d", this.f257859i.f182766u);
        C67240r rVar = (C67240r) C67243u.f182767c.createBuilder();
        C67242t tVar = this.f257859i;
        rVar.copyOnWrite();
        C67243u uVar = (C67243u) rVar.instance;
        uVar.f182770b = tVar.f182766u;
        uVar.f182769a = 1 | uVar.f182769a;
        qVar.copyOnWrite();
        C67244v vVar9 = (C67244v) qVar.instance;
        C67243u uVar2 = (C67243u) rVar.build();
        uVar2.getClass();
        vVar9.f182787n = uVar2;
        vVar9.f182774a |= 536870912;
        boolean z5 = this.f257862l;
        qVar.copyOnWrite();
        C67244v vVar10 = (C67244v) qVar.instance;
        vVar10.f182775b |= 128;
        vVar10.f182791r = z5;
        C67231i iVar = this.f257853b;
        if (iVar != null) {
            qVar.copyOnWrite();
            C67244v vVar11 = (C67244v) qVar.instance;
            vVar11.f182788o = iVar;
            vVar11.f182774a |= 1073741824;
        }
        String str = this.f257852a;
        if (str != null) {
            qVar.copyOnWrite();
            C67244v vVar12 = (C67244v) qVar.instance;
            vVar12.f182774a |= 8192;
            vVar12.f182783j = str;
        }
        boolean z6 = this.f257854c;
        qVar.copyOnWrite();
        C67244v vVar13 = (C67244v) qVar.instance;
        vVar13.f182775b |= 8;
        vVar13.f182789p = z6;
        return (C67244v) qVar.build();
    }
}
