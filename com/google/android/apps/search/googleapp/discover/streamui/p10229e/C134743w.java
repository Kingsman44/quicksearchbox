package com.google.android.apps.search.googleapp.discover.streamui.p10229e;

import com.google.android.apps.search.googleapp.discover.p10181d.C134220i;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.libraries.elements.interfaces.C21266bi;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentMap;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.e.w */
/* compiled from: PG */
public final class C134743w implements C21266bi {

    /* renamed from: a */
    private boolean f366902a;

    /* renamed from: b */
    private final Map f366903b = new LinkedHashMap();

    /* renamed from: c */
    private int f366904c = 1;

    /* renamed from: d */
    private final C134721a f366905d;

    public C134743w(C134721a aVar, boolean z) {
        C69664n.m101061g(aVar, "callbacks");
        this.f366905d = aVar;
        this.f366902a = z;
    }

    /* renamed from: j */
    private final synchronized C134742v m218557j() {
        int i;
        int i2;
        Collection<C134741u> values = this.f366903b.values();
        i = 0;
        if (!(values instanceof Collection) || !values.isEmpty()) {
            i2 = 0;
            for (C134741u uVar : values) {
                if (uVar == C134741u.LOADED && (i2 = i2 + 1) < 0) {
                    C69540x.m100951i();
                }
            }
        } else {
            i2 = 0;
        }
        Collection<C134741u> values2 = this.f366903b.values();
        if (!(values2 instanceof Collection) || !values2.isEmpty()) {
            for (C134741u uVar2 : values2) {
                if (uVar2 == C134741u.ERROR && (i = i + 1) < 0) {
                    C69540x.m100951i();
                }
            }
        }
        return new C134742v(i2, i);
    }

    /* renamed from: k */
    private final synchronized void m218558k() {
        C134220i iVar;
        if (m218562o()) {
            C134721a aVar = this.f366905d;
            C134742v j = m218557j();
            C134722b bVar = aVar.f366863a;
            if (j.f366901b == 0) {
                iVar = C134220i.IMAGES_FULLY_RENDERED;
            } else if (j.f366900a > 0) {
                iVar = C134220i.SOME_IMAGES_FAILED_TO_RENDER;
            } else {
                iVar = C134220i.ALL_IMAGES_FAILED_TO_RENDER;
            }
            bVar.mo111905a(iVar);
            this.f366904c = 4;
        } else {
            throw new IllegalStateException("Must be loaded before finishing");
        }
    }

    /* renamed from: l */
    private final synchronized void m218559l() {
        this.f366905d.f366863a.mo111905a(C134220i.IMAGE_LOADING_CANCELLED);
        this.f366904c = 4;
    }

    /* renamed from: m */
    private final synchronized void m218560m(int i, C134741u uVar) {
        uVar.name();
        if (m218563p()) {
            Integer valueOf = Integer.valueOf(i);
            this.f366903b.put(valueOf, uVar);
            if (uVar == C134741u.CLEARED) {
                if (this.f366904c != 3) {
                    this.f366903b.remove(valueOf);
                } else if (this.f366902a) {
                    m218559l();
                    return;
                }
            }
            if (m218562o()) {
                m218558k();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        return r1;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m218561n() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f366902a     // Catch:{ all -> 0x0015 }
            r1 = 0
            if (r0 == 0) goto L_0x0013
            int r0 = r4.f366904c     // Catch:{ all -> 0x0015 }
            r2 = 2
            r3 = 1
            if (r0 == r2) goto L_0x0012
            r2 = 3
            if (r0 == r2) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            monitor-exit(r4)
            return r3
        L_0x0012:
            r1 = 1
        L_0x0013:
            monitor-exit(r4)
            return r1
        L_0x0015:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134743w.m218561n():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        return false;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m218562o() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m218561n()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0042
            java.util.Map r0 = r3.f366903b     // Catch:{ all -> 0x0045 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0037
        L_0x0010:
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0045 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0045 }
        L_0x0018:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0045 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0045 }
            com.google.android.apps.search.googleapp.discover.streamui.e.u r1 = (com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134741u) r1     // Catch:{ all -> 0x0045 }
            com.google.android.apps.search.googleapp.discover.streamui.e.u r2 = com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134741u.LOADED     // Catch:{ all -> 0x0045 }
            if (r1 == r2) goto L_0x0018
            com.google.android.apps.search.googleapp.discover.streamui.e.u r2 = com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134741u.CLEARED     // Catch:{ all -> 0x0045 }
            if (r1 == r2) goto L_0x0018
            com.google.android.apps.search.googleapp.discover.streamui.e.u r2 = com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134741u.ERROR     // Catch:{ all -> 0x0045 }
            if (r1 == r2) goto L_0x0018
            goto L_0x0042
        L_0x0037:
            java.util.Map r0 = r3.f366903b     // Catch:{ all -> 0x0045 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0042
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0042:
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x0045:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x0049
        L_0x0048:
            throw r0
        L_0x0049:
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134743w.m218562o():boolean");
    }

    /* renamed from: p */
    private final synchronized boolean m218563p() {
        return this.f366904c != 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000e, code lost:
        return true;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m218564q() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f366904c     // Catch:{ all -> 0x000f }
            r1 = 1
            if (r0 == r1) goto L_0x000d
            r2 = 2
            if (r0 != r2) goto L_0x000a
            goto L_0x000d
        L_0x000a:
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x000d:
            monitor-exit(r3)
            return r1
        L_0x000f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134743w.m218564q():boolean");
    }

    /* renamed from: a */
    public final void mo26752a(int i) {
        m218560m(i, C134741u.ERROR);
    }

    /* renamed from: b */
    public final void mo26753b(int i) {
    }

    /* renamed from: c */
    public final void mo26754c(int i) {
        m218560m(i, C134741u.CLEARED);
    }

    /* renamed from: d */
    public final synchronized void mo26755d(int i) {
        if (m218563p()) {
            this.f366903b.put(Integer.valueOf(i), C134741u.LOADING);
        }
    }

    /* renamed from: e */
    public final void mo26756e(int i) {
        m218560m(i, C134741u.LOADED);
    }

    /* renamed from: f */
    public final synchronized void mo26757f(int i) {
        if (m218564q()) {
            Map map = this.f366903b;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() == C134741u.VISIBLE) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            C134722b bVar = this.f366905d.f366863a;
            C134727g gVar = bVar.f366866b;
            C134766q qVar = bVar.f366865a;
            Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(gVar.f366882a, qVar, new C134726f(qVar));
            C69664n.m101060f(computeIfAbsent, "surface: TngDiscoverSurf…erLaunchStatus(surface) }");
            C134725e eVar = (C134725e) computeIfAbsent;
            synchronized (eVar) {
                if (eVar.mo111917c() && (eVar.f366880f instanceof C134730j)) {
                    eVar.f366880f = C134729i.f366884a;
                    bVar.f366867c.mo19974a(C37182a.f97758Q);
                }
            }
            this.f366903b.put(Integer.valueOf(i), C134741u.VISIBLE);
        }
    }

    /* renamed from: g */
    public final synchronized void mo111944g() {
        if (this.f366904c == 1) {
            this.f366904c = 2;
        }
        if (m218562o()) {
            m218558k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo111945h() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m218564q()     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0014
            java.util.Map r0 = r1.f366903b     // Catch:{ all -> 0x0016 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0014
            r0 = 3
            r1.f366904c = r0     // Catch:{ all -> 0x0016 }
            monitor-exit(r1)
            return
        L_0x0014:
            monitor-exit(r1)
            return
        L_0x0016:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134743w.mo111945h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo111946i() {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            r3.f366902a = r0     // Catch:{ all -> 0x0039 }
            boolean r0 = r3.m218562o()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x000d
            r3.m218558k()     // Catch:{ all -> 0x0039 }
        L_0x000d:
            java.util.Map r0 = r3.f366903b     // Catch:{ all -> 0x0039 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0016
            goto L_0x0037
        L_0x0016:
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0039 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0039 }
        L_0x001e:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0039 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0039 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0039 }
            com.google.android.apps.search.googleapp.discover.streamui.e.u r2 = com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134741u.CLEARED     // Catch:{ all -> 0x0039 }
            if (r1 != r2) goto L_0x001e
            r3.m218559l()     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)
            return
        L_0x0037:
            monitor-exit(r3)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x003d
        L_0x003c:
            throw r0
        L_0x003d:
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134743w.mo111946i():void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        StringBuilder sb;
        int i5 = this.f366904c;
        boolean z = this.f366902a;
        Map map = this.f366903b;
        int i6 = 0;
        if (map.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (Map.Entry value : map.entrySet()) {
                if (value.getValue() == C134741u.VISIBLE) {
                    i++;
                }
            }
        }
        Map map2 = this.f366903b;
        if (map2.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 0;
            for (Map.Entry value2 : map2.entrySet()) {
                if (value2.getValue() == C134741u.LOADING) {
                    i2++;
                }
            }
        }
        Map map3 = this.f366903b;
        if (map3.isEmpty()) {
            i3 = 0;
        } else {
            i3 = 0;
            for (Map.Entry value3 : map3.entrySet()) {
                if (value3.getValue() == C134741u.CLEARED) {
                    i3++;
                }
            }
        }
        Map map4 = this.f366903b;
        if (map4.isEmpty()) {
            i4 = 0;
        } else {
            i4 = 0;
            for (Map.Entry value4 : map4.entrySet()) {
                if (value4.getValue() == C134741u.ERROR) {
                    i4++;
                }
            }
        }
        Map map5 = this.f366903b;
        if (!map5.isEmpty()) {
            for (Map.Entry value5 : map5.entrySet()) {
                if (value5.getValue() == C134741u.LOADED) {
                    i6++;
                }
            }
        }
        sb = new StringBuilder();
        sb.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "TRACKING_FINISHED" : "USER_SCROLLED" : "RENDERING_FINISHED" : "RENDERING_STARTED");
        sb.append(" | hasBeenVisible: ");
        sb.append(z);
        sb.append(" | visible:");
        sb.append(i);
        sb.append(" | loading:");
        sb.append(i2);
        sb.append(" | cleared:");
        sb.append(i3);
        sb.append(" | errors:");
        sb.append(i4);
        sb.append(" | loaded:");
        sb.append(i6);
        return sb.toString();
    }
}
