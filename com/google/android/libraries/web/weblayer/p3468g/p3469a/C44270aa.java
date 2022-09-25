package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import com.google.android.libraries.web.base.p3348b.p3349a.C43239d;
import com.google.android.libraries.web.contrib.p3367d.p3370b.p3371a.C43467a;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47731h;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47732i;
import org.chromium.weblayer.C72566ab;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72637z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.aa */
/* compiled from: PG */
public final class C44270aa implements C43239d {

    /* renamed from: a */
    private final C47732i f115129a;

    /* renamed from: b */
    private final C72566ab f115130b;

    /* renamed from: c */
    private String f115131c;

    public C44270aa(C72601bj bjVar, C47732i iVar) {
        this.f115129a = iVar;
        C72604bm.m107399a();
        bjVar.mo64476g();
        C72566ab abVar = bjVar.f193145c;
        C69664n.m101060f(abVar, "tab.findInPageController");
        this.f115130b = abVar;
    }

    /* renamed from: a */
    public final void mo46320a() {
        this.f115131c = null;
        this.f115130b.mo64433b((C72637z) null);
    }

    /* renamed from: b */
    public final void mo46321b(String str) {
        C69664n.m101061g(str, "query");
        this.f115131c = str;
        this.f115130b.mo64432a(str, true);
    }

    /* renamed from: c */
    public final void mo46322c() {
        C72566ab abVar = this.f115130b;
        String str = this.f115131c;
        if (str != null) {
            abVar.mo64432a(str, true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: d */
    public final void mo46323d() {
        C72566ab abVar = this.f115130b;
        String str = this.f115131c;
        if (str != null) {
            abVar.mo64432a(str, false);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: e */
    public final boolean mo46324e(C43467a aVar) {
        return this.f115130b.mo64433b(new C47731h(this.f115129a, new C44298z(aVar)));
    }
}
