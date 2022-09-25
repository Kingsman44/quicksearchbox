package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90061dm;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.p3926e.C51994gt;
import com.google.protos.p4985f.p5042u.C65342d;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ik */
/* compiled from: PG */
public class C108430ik implements Comparable {

    /* renamed from: A */
    public C65342d f301596A;

    /* renamed from: d */
    public final C28292j f301597d;

    /* renamed from: e */
    public String f301598e;

    /* renamed from: f */
    public C21370a f301599f;

    /* renamed from: g */
    public C86124t f301600g;

    /* renamed from: h */
    public String f301601h;

    /* renamed from: i */
    public String f301602i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public long f301603j;

    /* renamed from: k */
    public e f301604k = e.A;

    /* renamed from: l */
    public QueryTriggerType f301605l = QueryTriggerType.OPA_SUGGESTION_CHIP;

    /* renamed from: m */
    public C51994gt f301606m;

    /* renamed from: n */
    public OptionalInt f301607n;

    /* renamed from: o */
    public OptionalInt f301608o;

    /* renamed from: p */
    public OptionalInt f301609p;

    /* renamed from: q */
    public OptionalInt f301610q;

    /* renamed from: r */
    public Optional f301611r;

    /* renamed from: s */
    public boolean f301612s;

    /* renamed from: t */
    public boolean f301613t;

    /* renamed from: u */
    public boolean f301614u = false;

    /* renamed from: v */
    public boolean f301615v = false;

    /* renamed from: w */
    public boolean f301616w = false;

    /* renamed from: x */
    public boolean f301617x = false;

    /* renamed from: y */
    public boolean f301618y = false;

    /* renamed from: z */
    public boolean f301619z = true;

    protected C108430ik(int i, String str) {
        C28292j jVar = new C28292j(i <= 0 ? 27105 : i);
        jVar.f76976d = true;
        this.f301597d = jVar;
        jVar.mo33795i(5);
        jVar.f76976d = true;
        this.f301598e = str;
        this.f301601h = str;
        this.f301607n = OptionalInt.empty();
        this.f301608o = OptionalInt.empty();
        this.f301609p = OptionalInt.empty();
        this.f301610q = OptionalInt.empty();
        this.f301611r = Optional.empty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo96698c() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int c = ((C108430ik) obj).mo96698c();
        int c2 = mo96698c();
        if (c == c2) {
            return 0;
        }
        return c >= c2 ? 1 : -1;
    }

    /* renamed from: f */
    public String mo96708f() {
        return this.f301598e;
    }

    /* renamed from: g */
    public final String mo96876g() {
        C86124t tVar = this.f301600g;
        if (tVar == null || !tVar.mo79746e(C90061dm.f249195c) || this.f301602i.isEmpty()) {
            return mo96708f();
        }
        String str = this.f301598e;
        String str2 = this.f301602i;
        return str + " | " + str2;
    }

    /* renamed from: h */
    public final String mo96877h() {
        C51994gt gtVar = this.f301606m;
        return (gtVar == null || gtVar.f136469c.isEmpty()) ? this.f301598e : this.f301606m.f136469c;
    }
}
