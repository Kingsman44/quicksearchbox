package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.s;
import com.google.android.apps.gsa.assistant.shared.l.t;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83902bh;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83904bj;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108924e;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109789ai;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110340az;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110370cb;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110419f;
import com.google.android.apps.gsa.staticplugins.opa.util.C113759ab;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.i */
/* compiled from: PG */
public final class C110211i extends C84036z implements C83904bj {

    /* renamed from: a */
    public final C110212j f307094a;

    /* renamed from: b */
    public final C110192ac f307095b;

    /* renamed from: c */
    public final C110191ab f307096c;

    /* renamed from: d */
    public final C110202am f307097d;

    /* renamed from: e */
    public final C110203an f307098e;

    /* renamed from: f */
    public final C110340az f307099f;

    /* renamed from: g */
    public final C69464a f307100g;

    /* renamed from: h */
    public final SharedPreferences f307101h;

    /* renamed from: i */
    public final C89994f f307102i;

    /* renamed from: j */
    public final C86124t f307103j;

    /* renamed from: k */
    public final C110419f f307104k;

    /* renamed from: l */
    public final C83893b f307105l;

    /* renamed from: m */
    public final C109789ai f307106m;

    /* renamed from: n */
    public final C110370cb f307107n;

    /* renamed from: o */
    private final C113759ab f307108o;

    /* renamed from: p */
    private final C84026u f307109p;

    /* renamed from: q */
    private final C108924e f307110q;

    public C110211i(Bundle bundle, C109789ai aiVar, C110212j jVar, C110192ac acVar, C110191ab abVar, C110203an anVar, C108924e eVar, C113759ab abVar2, C84026u uVar, C110340az azVar, C110370cb cbVar, C69464a aVar, SharedPreferences sharedPreferences, C89994f fVar, C86124t tVar, C110419f fVar2, C83893b bVar) {
        this.f307106m = aiVar;
        this.f307094a = jVar;
        this.f307095b = acVar;
        this.f307096c = abVar;
        C110201al alVar = (C110201al) C110202am.f307077c.createBuilder();
        s createBuilder = t.d.createBuilder();
        Bundle bundle2 = bundle;
        String string = bundle.getString("dreamliner_seq_args");
        createBuilder.copyOnWrite();
        t tVar2 = createBuilder.instance;
        string.getClass();
        tVar2.a |= 1;
        tVar2.b = string;
        createBuilder.copyOnWrite();
        t tVar3 = createBuilder.instance;
        tVar3.c = 1;
        tVar3.a |= 2;
        t build = createBuilder.build();
        alVar.copyOnWrite();
        C110202am amVar = (C110202am) alVar.instance;
        build.getClass();
        amVar.f307080b = build;
        amVar.f307079a |= 1;
        this.f307097d = (C110202am) alVar.build();
        this.f307098e = anVar;
        this.f307110q = eVar;
        this.f307108o = abVar2;
        this.f307109p = uVar;
        this.f307099f = azVar;
        this.f307107n = cbVar;
        this.f307100g = aVar;
        this.f307101h = sharedPreferences;
        this.f307102i = fVar;
        this.f307103j = tVar;
        this.f307104k = fVar2;
        this.f307105l = bVar;
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        C83902bh d = C83903bi.m133648d();
        d.mo77306c(-1);
        d.mo77305b(R.anim.slide_out_left);
        return d.mo77304a();
    }

    /* renamed from: h */
    public final C58485gu mo77495h() {
        return C58485gu.m89847o(this.f307109p.mo77487a(this.f307108o.mo100603a(), C110206d.f307089a), C83875ai.m133539d(this.f307110q, new C110210h(this)));
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        C83902bh d = C83903bi.m133648d();
        d.mo77306c(1);
        return d.mo77304a();
    }
}
