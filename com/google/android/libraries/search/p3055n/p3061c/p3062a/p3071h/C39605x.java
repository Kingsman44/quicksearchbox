package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.apps.gsa.binaries.satin.app.aqw;
import com.google.android.libraries.assistant.soda.C19244ag;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37660hg;
import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.android.libraries.search.p2904c.p2952o.p2954b.C37909b;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.search.n.c.a.h.x */
/* compiled from: PG */
public final class C39605x {

    /* renamed from: a */
    public static final C59071e f104254a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.h.x");

    /* renamed from: b */
    public final boolean f104255b;

    /* renamed from: c */
    public final Soda f104256c;

    /* renamed from: d */
    public final C37660hg f104257d;

    /* renamed from: e */
    public final Executor f104258e;

    /* renamed from: f */
    public final C37662hi f104259f;

    /* renamed from: g */
    public final C58833ax f104260g;

    /* renamed from: h */
    public final boolean f104261h;

    /* renamed from: i */
    public final int f104262i;

    /* renamed from: j */
    public final int f104263j;

    /* renamed from: k */
    public final AtomicBoolean f104264k = new AtomicBoolean(false);

    /* renamed from: l */
    public final C37909b f104265l;

    /* renamed from: m */
    public C58833ax f104266m;

    /* renamed from: n */
    public C58833ax f104267n;

    /* renamed from: o */
    public C58833ax f104268o;

    /* renamed from: p */
    public C58833ax f104269p;

    /* renamed from: q */
    public final C19244ag f104270q;

    /* renamed from: r */
    public final C19244ag f104271r;

    /* renamed from: s */
    public final aqw f104272s;

    /* renamed from: t */
    private final C39526i f104273t;

    /* renamed from: u */
    private final boolean f104274u;

    public C39605x(C37909b bVar, aqw aqw, boolean z, Soda soda, C37660hg hgVar, C39562b bVar2, C39526i iVar, boolean z2, boolean z3, Executor executor) {
        C58836b bVar3 = C58836b.f156633a;
        this.f104266m = bVar3;
        this.f104267n = bVar3;
        this.f104268o = bVar3;
        this.f104269p = bVar3;
        this.f104270q = new C19244ag();
        this.f104271r = new C19244ag();
        this.f104256c = soda;
        this.f104257d = hgVar;
        this.f104258e = executor;
        C37662hi a = bVar2.mo41899a();
        this.f104259f = a;
        this.f104260g = bVar2.mo41900b();
        this.f104261h = z3;
        C37360ay ayVar = a.f100035d;
        this.f104262i = Integer.bitCount((ayVar == null ? C37360ay.f99224l : ayVar).f99229d);
        C37360ay ayVar2 = a.f100035d;
        this.f104263j = (ayVar2 == null ? C37360ay.f99224l : ayVar2).f99228c;
        this.f104273t = iVar;
        this.f104274u = z2;
        this.f104265l = bVar;
        this.f104272s = aqw;
        this.f104255b = z;
    }

    /* renamed from: a */
    public final C60870cx mo41949a(String str) {
        ((C59052c) ((C59052c) f104254a.mo56224b()).mo56372aa(53720)).mo56389s("stopPushingAudio due to %s", str);
        C39599r rVar = new C39599r(this);
        return C60856cj.m92904m(C47810es.m84978r(rVar), this.f104258e);
    }

    /* renamed from: b */
    public final void mo41950b(int i) {
        if (this.f104274u) {
            this.f104273t.mo41872f(C37176a.f97285if.mo40806d(), C58836b.f156633a, i);
        }
    }
}
