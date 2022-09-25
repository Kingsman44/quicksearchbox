package com.google.android.apps.gsa.staticplugins.p8163o;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6745m.C85527a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.j */
/* compiled from: PG */
public final class C105838j extends C86734a implements C85527a {

    /* renamed from: a */
    public final C22871g f295263a;

    /* renamed from: b */
    public final Map f295264b = new HashMap();

    /* renamed from: c */
    private final Map f295265c;

    public C105838j(C22871g gVar, Map map) {
        super(C118575h.WORKER_AUDIO_PLAYER, "audioplayer");
        this.f295263a = gVar;
        this.f295265c = map;
    }

    /* renamed from: a */
    public final C60870cx mo79044a(String str) {
        SettableFuture settableFuture = new SettableFuture();
        this.f295263a.mo28212l("get-or-create-media-session-for-".concat(String.valueOf(str)), new C105835g(this, settableFuture, str));
        return settableFuture;
    }

    /* renamed from: c */
    public final C60870cx mo79045c(String str, String str2, String str3) {
        SettableFuture settableFuture = new SettableFuture();
        this.f295263a.mo28212l("load-child-media-item-list", new C105833e(this, str3, str, str2, settableFuture));
        return settableFuture;
    }

    /* renamed from: d */
    public final void mo79046d(String str) {
        this.f295263a.mo28212l("release-media-session-for-".concat(String.valueOf(str)), new C105836h(this, str));
    }

    /* renamed from: e */
    public final C105846r mo95082e(String str) {
        if (!this.f295264b.containsKey(str)) {
            Map map = this.f295264b;
            C69464a aVar = (C69464a) this.f295265c.get(str);
            aVar.getClass();
            map.put(str, (C105846r) aVar.mo17428b());
        }
        C105846r rVar = (C105846r) this.f295264b.get(str);
        rVar.getClass();
        return rVar;
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        this.f295263a.mo28212l("dispose", new C105834f(this));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
