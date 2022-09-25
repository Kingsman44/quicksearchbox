package com.google.android.libraries.web.contrib.requestblock;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.libraries.web.base.p3348b.p3349a.C43240e;
import com.google.android.libraries.web.coordinator.p3400b.C43731a;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71683ds;
import kotlinx.coroutines.C71803m;
import p5462h.p5463a.C69505av;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.requestblock.g */
/* compiled from: PG */
public final class C43720g implements C44107h, C43240e {

    /* renamed from: a */
    public final C43731a f114046a;

    /* renamed from: b */
    public final Map f114047b = new LinkedHashMap();

    /* renamed from: c */
    public final Map f114048c = new LinkedHashMap();

    /* renamed from: d */
    public final Map f114049d = new LinkedHashMap();

    /* renamed from: e */
    public C43367l f114050e;

    /* renamed from: f */
    public C43714a f114051f;

    /* renamed from: g */
    public C43715b f114052g;

    /* renamed from: h */
    private final Context f114053h;

    /* renamed from: i */
    private final C69585o f114054i;

    /* renamed from: j */
    private final C71422aw f114055j;

    public C43720g(Context context, C69585o oVar, C43731a aVar) {
        C69664n.m101061g(context, "appContext");
        C69664n.m101061g(oVar, "mainImmediateContext");
        this.f114053h = context;
        this.f114054i = oVar;
        this.f114046a = aVar;
        C71422aw b = C71423ax.m104197b(oVar.plus(new C71683ds()));
        this.f114055j = b;
        C71803m.m105043d(b, (C69585o) null, (C71424ay) null, new C43717d(this, (C69577g) null), 3);
    }

    /* renamed from: a */
    public final void mo44356a() {
        C71423ax.m104198c(this.f114055j, (CancellationException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032 A[LOOP:1: B:9:0x0032->B:12:0x0042, LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46325b(com.google.android.libraries.web.p3353c.C43367l r3) {
        /*
            r2 = this;
            java.lang.String r0 = "loadRequest"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            boolean r0 = r2.mo46757j()
            if (r0 == 0) goto L_0x0045
            java.util.Map r0 = r2.f114048c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r0.next()
            com.google.android.libraries.web.contrib.requestblock.e r1 = (com.google.android.libraries.web.contrib.requestblock.C43718e) r1
            boolean r1 = r1.mo46751b(r3)
            if (r1 == 0) goto L_0x0015
            return
        L_0x0028:
            java.util.Map r0 = r2.f114049d
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0032:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r0.next()
            com.google.android.libraries.web.contrib.requestblock.e r1 = (com.google.android.libraries.web.contrib.requestblock.C43718e) r1
            boolean r1 = r1.mo46751b(r3)
            if (r1 == 0) goto L_0x0032
        L_0x0044:
            return
        L_0x0045:
            r2.f114050e = r3
            r2.mo46754g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.contrib.requestblock.C43720g.mo46325b(com.google.android.libraries.web.c.l):void");
    }

    /* renamed from: c */
    public final boolean mo46326c(C43367l lVar) {
        C69664n.m101061g(lVar, "loadRequest");
        Map map = this.f114047b;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry value : map.entrySet()) {
            if (((C43721h) value.getValue()).mo30517a(lVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo46327d(C43367l lVar) {
        C69664n.m101061g(lVar, "loadRequest");
        Map map = this.f114049d;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry value : map.entrySet()) {
            if (((C43718e) value.getValue()).mo46752c(lVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo46328e(C43367l lVar) {
        C69664n.m101061g(lVar, "loadRequest");
        if (mo46757j()) {
            Map map = this.f114048c;
            if (!map.isEmpty()) {
                for (Map.Entry value : map.entrySet()) {
                    if (((C43718e) value.getValue()).mo46752c(lVar)) {
                        return true;
                    }
                }
            }
            return false;
        }
        C69664n.m101058d(this.f114052g);
        return true;
    }

    /* renamed from: f */
    public final void mo46753f(int i) {
        if (!mo46757j()) {
            throw new IllegalStateException("Cannot both use RequestBlockMixin#blockAllRemaining and RequestBlockMixin#register. Please remove the latter.");
        } else if (this.f114049d.isEmpty()) {
            this.f114049d.put(Integer.valueOf(i), new C43718e(C43719f.f114045a));
        } else {
            int intValue = ((Number) this.f114049d.keySet().iterator().next()).intValue();
            if (intValue != i) {
                try {
                    String resourceEntryName = this.f114053h.getResources().getResourceEntryName(intValue);
                    throw new IllegalStateException("Another #blockAllRemaining was registered with the ID " + resourceEntryName + ".");
                } catch (Resources.NotFoundException e) {
                    throw new IllegalStateException("Another #blockAllRemaining was registered with the ID " + i, e);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo46754g() {
        C43714a aVar = this.f114051f;
        C43367l lVar = this.f114050e;
        if (aVar != null && lVar != null) {
            aVar.mo32340a(lVar);
            this.f114050e = null;
        }
    }

    /* renamed from: h */
    public final void mo46755h(int i, C43714a aVar) {
        C43718e eVar = (C43718e) C69505av.m100865g(this.f114048c, Integer.valueOf(i));
        eVar.f114043b = aVar;
        eVar.mo46750a();
    }

    /* renamed from: i */
    public final void mo46756i(int i, C43714a aVar) {
        C43718e eVar = (C43718e) C69505av.m100865g(this.f114049d, Integer.valueOf(i));
        eVar.f114043b = aVar;
        eVar.mo46750a();
    }

    /* renamed from: j */
    public final boolean mo46757j() {
        return this.f114052g == null;
    }
}
