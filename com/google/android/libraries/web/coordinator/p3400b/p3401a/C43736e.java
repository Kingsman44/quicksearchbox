package com.google.android.libraries.web.coordinator.p3400b.p3401a;

import com.google.android.libraries.web.browser.C43272a;
import com.google.android.libraries.web.coordinator.p3400b.C43731a;
import com.google.android.libraries.web.lifecycle.C43876a;
import com.google.android.libraries.web.lifecycle.C43878b;
import com.google.android.libraries.web.lifecycle.p3426b.C43879a;
import com.google.android.libraries.web.lifecycle.p3427c.C43885c;
import com.google.android.libraries.web.lifecycle.p3427c.C43888f;
import com.google.android.libraries.web.p3418j.C43841f;
import com.google.android.libraries.web.p3418j.C43843h;
import com.google.android.libraries.web.p3418j.p3419a.C43832u;
import com.google.android.libraries.web.p3418j.p3419a.C43835x;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71683ds;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.C69788q;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.coordinator.b.a.e */
/* compiled from: PG */
public final class C43736e implements C44107h, C43731a, C43878b {

    /* renamed from: a */
    public final Set f114071a = new LinkedHashSet();

    /* renamed from: b */
    public final C71548cy f114072b;

    /* renamed from: c */
    public final C71571du f114073c;

    /* renamed from: d */
    private final C69585o f114074d;

    /* renamed from: e */
    private final C71422aw f114075e;

    /* renamed from: f */
    private final C43879a f114076f = new C43879a();

    /* renamed from: g */
    private final C43835x f114077g = new C43835x(1, new C43735d(this));

    public C43736e(C69585o oVar) {
        C69664n.m101061g(oVar, "mainImmediateContext");
        this.f114074d = oVar;
        this.f114075e = C71423ax.m104197b(oVar.plus(new C71683ds()));
        C71548cy b = C71574dx.m104480b(new C43885c(C69788q.f186170a));
        this.f114072b = b;
        this.f114073c = C71521by.m104365c(b);
    }

    /* renamed from: a */
    public final void mo44356a() {
        C71423ax.m104198c(this.f114075e, (CancellationException) null);
    }

    /* renamed from: b */
    public final C71422aw mo46767b() {
        return this.f114075e;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo46769c() {
        throw null;
    }

    /* renamed from: d */
    public final void mo46770d(C43876a aVar) {
        this.f114071a.add(aVar);
        C43272a aVar2 = (C43272a) ((C43888f) this.f114073c.mo62784e()).mo46880a();
        if (aVar2 != null) {
            aVar.mo46836a(aVar2);
        }
    }

    /* renamed from: e */
    public final C43879a mo46412e() {
        return this.f114076f;
    }

    /* renamed from: f */
    public final C43841f mo46413f(String str, C43843h hVar) {
        C69664n.m101061g(str, "name");
        C69664n.m101061g(hVar, "config");
        return this.f114077g.mo46846a(str, hVar, C43832u.f114265a);
    }
}
