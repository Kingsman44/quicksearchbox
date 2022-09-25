package com.google.android.libraries.search.rendering.xuikit.bubbles;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.binaries.satin.app.apk;
import com.google.android.apps.gsa.binaries.satin.app.apv;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p2459q.C32047d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40111d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40113f;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40164aj;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40165ak;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40133e;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40137i;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40140l;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40142n;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40201l;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3128d.C40219b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3128d.C40220c;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40247a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40248b;
import com.google.common.p4526f.C59052c;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.j */
/* compiled from: PG */
public final class C40256j {

    /* renamed from: a */
    public final Map f105736a = DesugarCollections.synchronizedMap(new HashMap(10));

    /* renamed from: b */
    public final Context f105737b;

    /* renamed from: c */
    public final C40258l f105738c;

    /* renamed from: d */
    public final C68214a f105739d;

    public C40256j(Context context, C40258l lVar, C68214a aVar) {
        this.f105737b = context;
        this.f105738c = lVar;
        this.f105739d = aVar;
    }

    /* renamed from: a */
    public final void mo42356a(C40113f fVar) {
        C40247a aVar;
        C40258l lVar = this.f105738c;
        C40111d d = fVar.mo42195d();
        synchronized (lVar.f105742b) {
            if (lVar.f105742b.containsKey(d)) {
                C40253g gVar = (C40253g) lVar.f105742b.get(d);
                if (gVar.f105731h != C40246f.CREATED) {
                    ((C59052c) ((C59052c) C40253g.f105724a.mo56225c()).mo56372aa(53206)).mo56389s("animateToScreenCenter() called on bubble with state [%s]", gVar.f105731h);
                } else {
                    C40165ak akVar = gVar.f105730g;
                    C40137i iVar = akVar.f105512s;
                    if (iVar != null) {
                        if (akVar.f105513t != null) {
                            C40248b b = iVar.f105431l.mo42221b();
                            C40248b d2 = iVar.mo42243d(b);
                            if (((C40247a) d2).f105717a == iVar.f105431l.f105403b.f397999e) {
                                aVar = new C40247a(b.mo42347a() - (((float) iVar.mo42241b()) / 4.0f), b.mo42348b());
                            } else {
                                aVar = new C40247a(b.mo42347a() + (((float) iVar.mo42241b()) / 4.0f), b.mo42348b());
                            }
                            iVar.f105431l.mo42223d(C40137i.f105421b, aVar);
                            iVar.f105425f.mo42219c(new C40133e(iVar, d2), Duration.ofMillis(200));
                            C40142n nVar = akVar.f105513t;
                            nVar.f105444b.mo42219c(new C40140l(nVar.mo42250a(1.0f, 1.08f)), Duration.ofMillis(200));
                        }
                    }
                    ((C59052c) ((C59052c) C40165ak.f105489a.mo56225c()).mo56372aa(53248)).mo56386p("Invalid state. Called playAttentionSeekingAnimation without calling onCreate.");
                }
            } else {
                apk apk = lVar.f105744d;
                C40253g gVar2 = new C40253g((apv) apk.f199132a.b.f198027a.f199222au.mo17428b(), (C40164aj) apk.f199132a.b.f198027a.f199176aA.mo17428b(), (Context) apk.f199132a.a.g.mo17428b(), (C21370a) apk.f199132a.a.i.mo17428b(), fVar);
                try {
                    if (gVar2.f105731h == C40246f.DESTROYED) {
                        C32047d.m59724a(gVar2.f105726c);
                        C40165ak a = gVar2.f105725b.mo42269a(gVar2.f105728e);
                        gVar2.f105730g = a;
                        C40219b bVar = a.f105498e;
                        ((C40201l) bVar).f105618a.onCreate((Bundle) null);
                        ((C40201l) bVar).f105618a.onStart();
                        ((C40201l) bVar).f105619b.onCreate((Bundle) null);
                        ((C40201l) bVar).f105619b.onStart();
                        apv apv = gVar2.f105732i;
                        gVar2.f105729f = new C40107c(new C40254h((C40256j) apv.f199142a.b.f198027a.f199221at.mo17428b()), gVar2.f105728e.mo42195d(), a);
                        C40107c cVar = gVar2.f105729f;
                        C40165ak akVar2 = cVar.f105345a;
                        akVar2.f105510q = cVar;
                        akVar2.mo42279j(akVar2.f105499f.f105672b);
                        gVar2.f105727d.mo26870b();
                        gVar2.f105731h = C40246f.CREATED;
                        if (lVar.f105742b.size() == 1) {
                            lVar.f105743c.mo26870b();
                        }
                        if (lVar.f105742b.size() >= 10) {
                            lVar.mo42358b((C40111d) lVar.f105742b.keySet().iterator().next());
                        }
                        lVar.f105742b.put(d, gVar2);
                    } else {
                        String format = String.format("create() called on bubble with state [%s]", new Object[]{gVar2.f105731h});
                        ((C59052c) ((C59052c) C40253g.f105724a.mo56225c()).mo56372aa(53207)).mo56389s("%s", format);
                        throw new C40220c(format);
                    }
                } catch (C40220c e) {
                    ((C59052c) ((C59052c) ((C59052c) C40258l.f105741a.mo56225c()).mo56382g(e)).mo56372aa(53210)).mo56386p("Error Creating Bubble");
                    gVar2.mo42354a();
                }
            }
        }
        this.f105736a.put(fVar.mo42195d(), fVar);
    }
}
