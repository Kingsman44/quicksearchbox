package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1192d.p1193a.p1194a;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15795e;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.p1178a.C15829o;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.C15838a;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36610m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.d.a.a.d */
/* compiled from: PG */
public final class C15867d implements C15838a {

    /* renamed from: a */
    public static final C59071e f47120a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.b.e.d.a.a.d");

    /* renamed from: b */
    public boolean f47121b = false;

    /* renamed from: c */
    public final C60887da f47122c;

    /* renamed from: d */
    public final Context f47123d;

    /* renamed from: e */
    public final C36610m f47124e;

    /* renamed from: f */
    public final C60888db f47125f;

    /* renamed from: g */
    public final C47632e f47126g = new C47632e();

    /* renamed from: h */
    public final C69464a f47127h;

    /* renamed from: i */
    public final C69464a f47128i;

    /* renamed from: j */
    private final C69464a f47129j;

    public C15867d(C60887da daVar, Context context, C36610m mVar, C60888db dbVar, C69464a aVar, C69464a aVar2, C69464a aVar3) {
        this.f47122c = daVar;
        this.f47123d = context;
        this.f47124e = mVar;
        this.f47125f = dbVar;
        this.f47129j = aVar;
        this.f47127h = aVar2;
        this.f47128i = aVar3;
    }

    /* renamed from: a */
    public final C15785a mo22584a() {
        return C15795e.f47028b;
    }

    /* renamed from: b */
    public final C60870cx mo22585b(C15829o oVar) {
        if (!((Boolean) this.f47129j.mo17428b()).booleanValue()) {
            C59104x b = f47120a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ListenerController");
            ((C59052c) ((C59052c) b).mo56372aa(46462)).mo56386p("Skip registering suggestion notification listener");
            return C60866ct.f164955a;
        }
        C59104x b2 = f47120a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ListenerController");
        ((C59052c) ((C59052c) b2).mo56372aa(46461)).mo56386p("Start registering suggestion notification listener");
        C15865b bVar = new C15865b(this);
        return C60856cj.m92903l(C47810es.m84977q(bVar), this.f47122c);
    }
}
