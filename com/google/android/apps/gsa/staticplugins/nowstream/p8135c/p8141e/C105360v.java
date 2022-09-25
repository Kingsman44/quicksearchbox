package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91391c;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C8142xb;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.e.v */
/* compiled from: PG */
public abstract class C105360v {

    /* renamed from: a */
    private C60870cx f293961a;

    /* renamed from: b */
    protected final C8142xb f293962b;

    /* renamed from: c */
    protected final C91391c f293963c;

    /* renamed from: d */
    public final String f293964d;

    /* renamed from: e */
    public final AtomicBoolean f293965e = new AtomicBoolean(false);

    /* renamed from: f */
    public final C22871g f293966f;

    /* renamed from: g */
    public final C105359u f293967g;

    /* renamed from: h */
    public final C22871g f293968h;

    public C105360v(String str, C91391c cVar, C8142xb xbVar, C22871g gVar, C22871g gVar2, C105359u uVar) {
        this.f293964d = str;
        this.f293963c = cVar;
        this.f293962b = xbVar;
        this.f293966f = gVar;
        this.f293967g = uVar;
        this.f293968h = gVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo94733b();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C60870cx mo94758d(C60870cx cxVar, C7642eo eoVar) {
        C60870cx h = C60922j.m93045h(cxVar, new C105354p(this, eoVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: e */
    public final void mo94759e() {
        C22871g gVar = this.f293968h;
        String str = this.f293964d;
        this.f293961a = gVar.mo28207g(str.concat(", background"), new C105358t(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C91396h mo94760f(boolean z, C7642eo eoVar, C7669fo foVar, int i) {
        C90748e.m148224b();
        return (C91396h) C90877ak.m148473g(this.f293963c.mo85730f(this.f293962b, z, eoVar, foVar, i), 20, TimeUnit.SECONDS);
    }

    /* renamed from: g */
    public final void mo94761g() {
        this.f293965e.set(true);
        C60870cx cxVar = this.f293961a;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
    }
}
