package com.google.android.apps.gsa.p8867w.p8879i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138715a;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138717c;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138718d;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138719e;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138720f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p408c.p414c.p416b.C8460ac;
import com.google.p395al.p408c.p414c.p416b.C8470am;
import com.google.p395al.p408c.p414c.p416b.C8513w;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.w.i.s */
/* compiled from: PG */
public final class C118818s implements C138717c {

    /* renamed from: a */
    public final C86338r f331393a;

    /* renamed from: b */
    private final C92541i f331394b;

    /* renamed from: c */
    private final C69464a f331395c;

    /* renamed from: d */
    private final bm f331396d;

    public C118818s(C86338r rVar, C92541i iVar, C69464a aVar, bm bmVar) {
        this.f331393a = rVar;
        this.f331394b = iVar;
        this.f331395c = aVar;
        this.f331396d = bmVar;
    }

    /* renamed from: g */
    private final Map m197193g() {
        C8513w a = this.f331394b.mo87316a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C8470am amVar : a.f29533c) {
            for (C8460ac acVar : amVar.f29409a) {
                linkedHashMap.put(acVar.f29383c, acVar.f29382b);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final C60870cx mo103998a() {
        C138719e eVar = (C138719e) C138720f.f377293d.createBuilder();
        boolean u = this.f331396d.u();
        eVar.copyOnWrite();
        C138720f fVar = (C138720f) eVar.instance;
        fVar.f377295a |= 1;
        fVar.f377296b = u;
        boolean e = ((C90021c) this.f331395c.mo17428b()).mo79746e(C90059dk.f249113bW);
        eVar.copyOnWrite();
        C138720f fVar2 = (C138720f) eVar.instance;
        fVar2.f377295a |= 2;
        fVar2.f377297c = e;
        return C60856cj.m92900i((C138720f) eVar.build());
    }

    /* renamed from: b */
    public final C60870cx mo103999b() {
        return C60856cj.m92900i(new C138718d("en-US", C58485gu.m89845m(), C58495hd.m89898l(m197193g())));
    }

    /* renamed from: c */
    public final C60870cx mo104000c(C138715a aVar) {
        return C60856cj.m92900i(Boolean.valueOf(this.f331393a.getBoolean(aVar.f377289d, false)));
    }

    /* renamed from: d */
    public final C60870cx mo104001d() {
        return C60856cj.m92900i(new C138718d(this.f331393a.getString("spoken-language-bcp-47", BuildConfig.FLAVOR), C58485gu.m89842j(this.f331393a.getStringSet("additional-spoken-language-bcp-47", new HashSet())), C58495hd.m89898l(m197193g())));
    }

    /* renamed from: e */
    public final C60870cx mo104002e(C138715a aVar, boolean z) {
        C86337q b = this.f331393a.mo80076b();
        b.mo80067b(aVar.f377289d, z);
        b.apply();
        return C60866ct.f164955a;
    }

    /* renamed from: f */
    public final C60870cx mo104003f(String str, List list) {
        boolean equals = str.equals(this.f331393a.getString("spoken-language-bcp-47", (String) null));
        HashSet hashSet = new HashSet(list);
        boolean z = !this.f331393a.getStringSet("additional-spoken-language-bcp-47", new HashSet()).equals(hashSet);
        if ((!equals) || z) {
            C86337q b = this.f331393a.mo80076b();
            b.mo80073h("spoken-language-bcp-47", str);
            b.mo80074i("additional-spoken-language-bcp-47", hashSet);
            b.mo80067b("spoken-language-default", false);
            b.apply();
        }
        return C60866ct.f164955a;
    }
}
