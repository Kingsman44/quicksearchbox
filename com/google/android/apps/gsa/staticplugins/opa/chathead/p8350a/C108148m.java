package com.google.android.apps.gsa.staticplugins.opa.chathead.p8350a;

import android.content.SharedPreferences;
import android.provider.Settings;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.shared.ai;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86123s;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.staticplugins.opa.chathead.C108135a;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.C108154a;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.C108171o;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.C108172p;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.C108174r;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.C108185z;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.p1879c.C22867c;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.a.m */
/* compiled from: PG */
public final class C108148m implements C108135a, C108154a, C86123s {

    /* renamed from: a */
    private static final C58974d f300778a = C58974d.m91136j();

    /* renamed from: b */
    private final C22871g f300779b;

    /* renamed from: c */
    private final C108136a f300780c;

    /* renamed from: d */
    private final C68214a f300781d;

    /* renamed from: e */
    private final C68214a f300782e;

    /* renamed from: f */
    private final C68214a f300783f;

    /* renamed from: g */
    private final C68214a f300784g;

    /* renamed from: h */
    private final C68214a f300785h;

    /* renamed from: i */
    private final AtomicReference f300786i = new AtomicReference(C118826c.f331423b);

    /* renamed from: j */
    private boolean f300787j = false;

    /* renamed from: k */
    private boolean f300788k = false;

    /* renamed from: l */
    private boolean f300789l = false;

    /* renamed from: m */
    private final C83357g f300790m = new C83361k(false, C22867c.class);

    public C108148m(C22871g gVar, C108136a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        this.f300779b = gVar;
        this.f300780c = aVar;
        this.f300781d = aVar2;
        this.f300782e = aVar3;
        this.f300783f = aVar4;
        this.f300784g = aVar5;
        this.f300785h = aVar6;
    }

    /* renamed from: r */
    private final void m179516r() {
        ((C60870cx) this.f300786i.getAndSet(C118826c.f331423b)).cancel(false);
    }

    /* renamed from: s */
    private final void m179517s() {
        ((C108185z) this.f300782e.mo27525b()).mo96528j();
        m179518t(C108139d.f300770a);
    }

    /* renamed from: t */
    private final void m179518t(Consumer consumer) {
        if (!m179521w() || !((C86124t) this.f300781d.mo27525b()).mo79746e(C90037cp.f248406N)) {
            return;
        }
        if ((Settings.canDrawOverlays(this.f300780c.f300764a) && ((ai) this.f300784g.mo27525b()).c()) || ((C86124t) this.f300781d.mo27525b()).mo79746e(C90037cp.f248407O)) {
            consumer.accept((C108150o) this.f300785h.mo27525b());
        }
    }

    /* renamed from: u */
    private final void m179519u() {
        Duration ofSeconds = Duration.ofSeconds(((C86124t) this.f300781d.mo27525b()).mo79743a(C90037cp.f248629y));
        if (!ofSeconds.isZero()) {
            ((C60870cx) this.f300786i.getAndSet(this.f300779b.mo28204d("chatHead.resetTimeout", ofSeconds.toMillis(), new C108146k(this)))).cancel(false);
        }
    }

    /* renamed from: v */
    private final synchronized void m179520v(C107698i iVar) {
        boolean z;
        boolean a = this.f300780c.mo96479a();
        m179518t(new C108142g(a));
        if (!Settings.canDrawOverlays(this.f300780c.f300764a)) {
            m179518t(C108143h.f300774a);
        } else if (!((ai) this.f300784g.mo27525b()).c()) {
            m179518t(C108144i.f300775a);
        } else if (this.f300780c.f300766c.f253818a.isEnabled()) {
            m179518t(C108145j.f300776a);
        } else if (!this.f300787j) {
            boolean z2 = true;
            this.f300787j = true;
            C83349aj.m132647b(this.f300779b, this.f300790m, true, "chatHeadSetVisible");
            m179519u();
            boolean e = ((C86124t) this.f300781d.mo27525b()).mo79746e(C90037cp.f248619o);
            if (e) {
                z = ((SharedPreferences) this.f300783f.mo27525b()).getBoolean("OPA_CHAT_HEAD_TOOLTIP_DISPLAYED", false);
                if (!z) {
                    ((SharedPreferences) this.f300783f.mo27525b()).edit().putBoolean("OPA_CHAT_HEAD_TOOLTIP_DISPLAYED", true).apply();
                }
            } else {
                z = false;
            }
            if (!a) {
                iVar.mo96219b(new C88489j(C87739bu.SHOW_CHATHEAD_NOTIFICATION).mo82013a());
                C108185z zVar = (C108185z) this.f300782e.mo27525b();
                if (z || !e) {
                    z2 = false;
                }
                zVar.f300865b.mo28212l("ChatHead.show", new C108171o(zVar, z2));
            }
            ((ai) this.f300784g.mo27525b()).a().mo76658d(new C108140e(this));
            ((C86124t) this.f300781d.mo27525b()).mo79738i(this);
        }
    }

    /* renamed from: w */
    private final boolean m179521w() {
        return this.f300780c.mo96480b();
    }

    /* renamed from: a */
    public final void mo78019a() {
        if (!m179521w()) {
            mo96487q(7);
        }
    }

    /* renamed from: b */
    public final C83358h mo96469b() {
        return this.f300790m;
    }

    /* renamed from: c */
    public final void mo96470c() {
        ((SharedPreferences) this.f300783f.mo27525b()).edit().putInt("OPA_CHAT_HEAD_BLUE_BAR_SEEN_COUNT", ((SharedPreferences) this.f300783f.mo27525b()).getInt("OPA_CHAT_HEAD_BLUE_BAR_SEEN_COUNT", 0) + 1).apply();
    }

    /* renamed from: d */
    public final void mo96471d() {
        if (m179521w()) {
            ((SharedPreferences) this.f300783f.mo27525b()).edit().putBoolean("OPA_CHAT_HEAD_HAD_COMPLETED_CONVERSATION", true).apply();
            this.f300789l = true;
        }
    }

    /* renamed from: e */
    public final void mo96472e() {
        if (m179521w()) {
            this.f300789l = false;
            mo96487q(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r4.f300788k != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r0 != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96473f(com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i r5) {
        /*
            r4 = this;
            boolean r0 = r4.m179521w()
            if (r0 == 0) goto L_0x0068
            dagger.a r0 = r4.f300781d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248618n
            long r0 = r0.mo79743a(r1)
            int r1 = (int) r0
            r0 = 1
            if (r1 < 0) goto L_0x0026
            com.google.android.apps.gsa.staticplugins.opa.chathead.p8350a.C108147l.m179515a()
            r2 = 4
            if (r1 < r2) goto L_0x001f
            goto L_0x0026
        L_0x001f:
            int[] r2 = com.google.android.apps.gsa.staticplugins.opa.chathead.p8350a.C108147l.m179515a()
            r1 = r2[r1]
            goto L_0x0034
        L_0x0026:
            com.google.common.f.a.d r1 = f300778a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Invalid DisplayMode flag value"
            r3 = 23930(0x5d7a, float:3.3533E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            r1 = 1
        L_0x0034:
            int r2 = r1 + -1
            if (r1 == 0) goto L_0x0066
            r1 = 0
            if (r2 == r0) goto L_0x004e
            r0 = 2
            if (r2 == r0) goto L_0x004b
            r0 = 3
            if (r2 == r0) goto L_0x0042
            goto L_0x005e
        L_0x0042:
            boolean r0 = r4.f300789l
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f300788k
            if (r0 == 0) goto L_0x0061
            goto L_0x005e
        L_0x004b:
            boolean r0 = r4.f300789l
            goto L_0x005c
        L_0x004e:
            dagger.a r0 = r4.f300783f
            java.lang.Object r0 = r0.mo27525b()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r2 = "OPA_CHAT_HEAD_HAD_COMPLETED_CONVERSATION"
            boolean r0 = r0.getBoolean(r2, r1)
        L_0x005c:
            if (r0 == 0) goto L_0x0061
        L_0x005e:
            r4.m179520v(r5)
        L_0x0061:
            r4.f300788k = r1
            r4.f300789l = r1
            return
        L_0x0066:
            r5 = 0
            throw r5
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chathead.p8350a.C108148m.mo96473f(com.google.android.apps.gsa.staticplugins.opa.az.i):void");
    }

    /* renamed from: g */
    public final void mo96474g() {
        if (this.f300787j) {
            m179517s();
        }
    }

    /* renamed from: h */
    public final void mo96475h(View view, Runnable runnable) {
        C108150o oVar = (C108150o) this.f300785h.mo27525b();
        C28292j jVar = new C28292j(116624);
        jVar.mo33795i(5);
        C28293k e = C28293k.m52908e(jVar, new C28293k[0]);
        jVar.mo33794h(1);
        C89949q.m146521e(C28285c.m52875b(e, 116624), false);
        view.setOnClickListener(new C108149n(jVar, runnable));
        mo96470c();
    }

    /* renamed from: i */
    public final boolean mo96476i() {
        return this.f300780c.mo96481c();
    }

    /* renamed from: j */
    public final boolean mo96477j() {
        if (((C108185z) this.f300782e.mo27525b()).f300872i.get()) {
            return false;
        }
        if (this.f300787j) {
            m179518t(C108138c.f300769a);
            C108185z zVar = (C108185z) this.f300782e.mo27525b();
            zVar.f300865b.mo28212l("startNudge", new C108172p(zVar));
        }
        return m179521w();
    }

    /* renamed from: k */
    public final boolean mo96478k() {
        if (!((C86124t) this.f300781d.mo27525b()).mo79746e(C90037cp.f248574cw) || !this.f300780c.mo96481c() || ((long) ((SharedPreferences) this.f300783f.mo27525b()).getInt("OPA_CHAT_HEAD_BLUE_BAR_SEEN_COUNT", 0)) >= ((C86124t) this.f300781d.mo27525b()).mo79743a(C90037cp.f248573cv) || ((ai) this.f300784g.mo27525b()).c()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final void mo96482l() {
        this.f300788k = true;
        m179518t(C108137b.f300768a);
        m179517s();
        C108136a aVar = this.f300780c;
        C87565h hVar = new C87565h();
        hVar.f236560f = 2;
        hVar.f236556b = e.bR;
        hVar.f236512P = 268468224;
        aVar.f300765b.mo81689c(aVar.f300764a, hVar.mo81685a(), 268468224);
    }

    /* renamed from: m */
    public final void mo96483m() {
        m179517s();
        mo96487q(2);
        ((C108185z) this.f300782e.mo27525b()).mo96531p();
        if (((C86124t) this.f300781d.mo27525b()).mo79746e(C90037cp.f248622r)) {
            if (((C86124t) this.f300781d.mo27525b()).mo79746e(C90037cp.f248403K)) {
                ((SharedPreferences) this.f300783f.mo27525b()).edit().putInt("OPA_CHAT_HEAD_BLUE_BAR_SEEN_COUNT", 0).apply();
            }
            mo96484n();
        }
    }

    /* renamed from: n */
    public final void mo96484n() {
        ((ai) this.f300784g.mo27525b()).b(false);
        ((C108185z) this.f300782e.mo27525b()).mo96531p();
    }

    /* renamed from: o */
    public final void mo96485o() {
        m179519u();
    }

    /* renamed from: p */
    public final void mo96486p() {
        m179516r();
    }

    /* renamed from: q */
    public final void mo96487q(int i) {
        if (this.f300787j) {
            this.f300787j = false;
            m179516r();
            C83349aj.m132647b(this.f300779b, this.f300790m, false, "chatHeadSetNotVisible");
            ((C86124t) this.f300781d.mo27525b()).mo79740k(this);
            ((ai) this.f300784g.mo27525b()).a().mo76659e(new C108140e(this));
            C108185z zVar = (C108185z) this.f300782e.mo27525b();
            zVar.f300865b.mo28212l("ChatHead.hide", new C108174r(zVar));
            m179518t(new C108141f(i));
        }
    }
}
