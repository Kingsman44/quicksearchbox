package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c;

import android.net.Uri;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122801af;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9291g.C122883a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122960l;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122964p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122965q;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123026bt;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123027bu;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123047cn;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123137b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.C123549w;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.C123550x;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.c.r */
/* compiled from: PG */
public final class C123163r implements C123148c, C122883a {

    /* renamed from: a */
    public static final C59071e f340836a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.c.r");

    /* renamed from: b */
    public final C42813k f340837b;

    /* renamed from: c */
    public final C60887da f340838c;

    /* renamed from: d */
    public final Optional f340839d;

    /* renamed from: e */
    public final boolean f340840e;

    /* renamed from: f */
    public final C122859d f340841f;

    /* renamed from: g */
    boolean f340842g = false;

    /* renamed from: h */
    int f340843h = 0;

    /* renamed from: i */
    public final C122964p f340844i;

    /* renamed from: j */
    public final C122801af f340845j;

    /* renamed from: k */
    private final C122960l f340846k;

    /* renamed from: l */
    private final C122960l f340847l;

    /* renamed from: m */
    private final Set f340848m;

    /* renamed from: n */
    private C123026bt f340849n;

    /* renamed from: o */
    private C122959k f340850o;

    /* renamed from: p */
    private C122959k f340851p;

    public C123163r(C122960l lVar, C122960l lVar2, String str, C42813k kVar, C123137b bVar, C122965q qVar, C122801af afVar, C123027bu buVar, C122859d dVar, boolean z, C60887da daVar, Set set, Optional optional) {
        this.f340846k = lVar;
        this.f340847l = lVar2;
        this.f340837b = kVar;
        this.f340838c = daVar;
        this.f340848m = set;
        boolean a = bVar.mo105893a(str);
        this.f340845j = afVar;
        this.f340844i = new C122964p(qVar);
        this.f340839d = optional;
        this.f340841f = dVar;
        this.f340840e = z;
        this.f340849n = buVar.mo105837a(C123154i.f340825a, Optional.empty(), C60826bg.f164896a);
        this.f340849n = buVar.mo105837a(new C123152g(this, a), Optional.empty(), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final synchronized C60870cx mo105896a() {
        return this.f340849n.mo105834b();
    }

    /* renamed from: b */
    public final C60870cx mo105728b() {
        C60870cx a = mo105896a();
        C123157l lVar = C123157l.f340828a;
        return C60922j.m93044g(a, C47810es.m84963c(lVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo105899c(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C28595b bVar = (C28595b) it.next();
            if (bVar.f77798b.equals(str)) {
                try {
                    this.f340845j.mo105746b(str, Long.toString(this.f340837b.mo45887a(Uri.parse(bVar.f77799c))));
                    return;
                } catch (IOException e) {
                    ((C59052c) ((C59052c) ((C59052c) f340836a.mo56226d()).mo56382g(e)).mo56372aa(35094)).mo56389s("Failed to open resource %s", str);
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo105900d() {
        C122959k kVar = this.f340851p;
        if (kVar != null) {
            kVar.mo105793b();
        }
        this.f340851p = null;
    }

    /* renamed from: e */
    public final synchronized void mo105901e() {
        C123047cn.m202382b(this.f340849n.mo105833a(), C123149d.f340819a, C60826bg.f164896a);
        C123047cn.m202382b(this.f340849n.mo105834b(), C123150e.f340820a, C60826bg.f164896a);
        for (C123550x xVar : this.f340848m) {
            xVar.f341402a.ifPresent(C123549w.f341401a);
        }
    }

    /* renamed from: f */
    public final synchronized C122959k mo105902f() {
        C122959k kVar = this.f340851p;
        if (kVar != null) {
            return kVar;
        }
        C122959k e = this.f340847l.mo105802e();
        this.f340851p = e;
        e.mo105795d(new C123158m(this));
        return e;
    }

    /* renamed from: g */
    public final synchronized C122959k mo105903g() {
        C122959k kVar = this.f340850o;
        if (kVar != null) {
            return kVar;
        }
        C122959k e = this.f340846k.mo105802e();
        this.f340850o = e;
        e.mo105795d(new C123155j(this));
        return e;
    }
}
