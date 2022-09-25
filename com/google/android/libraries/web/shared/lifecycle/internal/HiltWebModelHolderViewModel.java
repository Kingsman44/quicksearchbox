package com.google.android.libraries.web.shared.lifecycle.internal;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2344as;
import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2376g;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.coordinator.internal.fragment.C43749h;
import com.google.android.libraries.web.coordinator.internal.fragment.C43757p;
import com.google.android.libraries.web.lifecycle.p3427c.C43884b;
import com.google.android.libraries.web.lifecycle.p3427c.C43885c;
import com.google.android.libraries.web.lifecycle.p3427c.C43886d;
import com.google.android.libraries.web.lifecycle.p3427c.C43888f;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.apps.tiktok.tracing.contrib.androidx.p3696a.C47615b;
import dagger.C68214a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71574dx;
import p5460g.p5461a.C69464a;
import p5462h.C69788q;
import p5462h.p5463a.C69497an;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class HiltWebModelHolderViewModel extends C2358bf {

    /* renamed from: a */
    public final C68214a f114813a;

    /* renamed from: b */
    public final Map f114814b = new LinkedHashMap();

    /* renamed from: c */
    public final Set f114815c = new LinkedHashSet();

    /* renamed from: d */
    public boolean f114816d;

    /* renamed from: e */
    public C2376g f114817e;

    /* renamed from: f */
    public boolean f114818f;

    /* renamed from: g */
    private final AtomicReference f114819g;

    /* renamed from: h */
    private final AtomicReference f114820h;

    /* renamed from: i */
    private final Map f114821i;

    /* renamed from: j */
    private final C2344as f114822j;

    /* renamed from: k */
    private final C47615b f114823k;

    /* renamed from: l */
    private final C71548cy f114824l = C71574dx.m104480b(new C43885c(C69788q.f186170a));

    /* renamed from: m */
    private HiltWebModelHolderViewModel f114825m;

    public HiltWebModelHolderViewModel(AtomicReference atomicReference, C68214a aVar, AtomicReference atomicReference2, Map map, C2344as asVar, C47615b bVar) {
        C69664n.m101061g(atomicReference, "coordinatorMarker");
        C69664n.m101061g(aVar, "webCoordinatorRetainedStoreLazy");
        C69664n.m101061g(atomicReference2, "reference");
        C69664n.m101061g(map, "webModelFactories");
        C69664n.m101061g(asVar, "savedStateHandle");
        this.f114819g = atomicReference;
        this.f114813a = aVar;
        this.f114820h = atomicReference2;
        this.f114821i = map;
        this.f114822j = asVar;
        this.f114823k = bVar;
        atomicReference2.set(this);
    }

    /* renamed from: a */
    public final C44107h mo47077a(Class cls, String str) {
        Map map;
        C44107h hVar;
        if (!((C43888f) this.f114824l.mo62784e()).mo46882c()) {
            return null;
        }
        Map map2 = (Map) ((Map) ((C43888f) this.f114824l.mo62784e()).mo46881b()).get(str);
        if (map2 != null && (hVar = (C44107h) map2.get(cls)) != null) {
            return hVar;
        }
        C69464a aVar = (C69464a) this.f114821i.get(cls);
        if (aVar != null) {
            Object b = aVar.mo17428b();
            C69664n.m101060f(b, "provider.get()");
            C44107h hVar2 = (C44107h) b;
            Map r = C69505av.m100876r((Map) ((C43888f) this.f114824l.mo62784e()).mo46881b());
            Map map3 = (Map) r.get(str);
            if (map3 == null || (map = C69505av.m100876r(map3)) == null) {
                map = new LinkedHashMap();
            }
            if (map.get(cls) == null) {
                map.put(cls, hVar2);
                C71548cy cyVar = this.f114824l;
                r.put(str, C69505av.m100875q(map));
                cyVar.mo62807f(new C43886d(C69505av.m100875q(r)));
                return hVar2;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        throw new IllegalArgumentException("Cannot create " + cls + ". Did you forget to mark the class with @HiltWebModel?");
    }

    /* renamed from: b */
    public final HiltWebModelHolderViewModel mo47078b() {
        HiltWebModelHolderViewModel hiltWebModelHolderViewModel = this.f114825m;
        if (hiltWebModelHolderViewModel != null) {
            return hiltWebModelHolderViewModel;
        }
        C69664n.m101065k("coordinatorModel");
        return null;
    }

    /* renamed from: c */
    public final void mo47079c() {
        Map map = (Map) ((C43888f) this.f114824l.mo62784e()).mo46880a();
        if (map != null) {
            for (Map values : map.values()) {
                for (C44107h a : values.values()) {
                    a.mo44356a();
                }
            }
        }
        this.f114824l.mo62807f(new C43884b(C69788q.f186170a));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        throw r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo639d() {
        /*
            r3 = this;
            com.google.apps.tiktok.tracing.contrib.androidx.a.b r0 = r3.f114823k
            com.google.apps.tiktok.tracing.bx r0 = r0.mo51503a()
            r3.mo47079c()     // Catch:{ all -> 0x002c }
            java.util.Set r1 = r3.f114815c     // Catch:{ all -> 0x002c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x002c }
        L_0x000f:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x002c }
            if (r2 == 0) goto L_0x001f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x002c }
            h.f.a.a r2 = (p5462h.p5473f.p5474a.C69615a) r2     // Catch:{ all -> 0x002c }
            r2.mo5672a()     // Catch:{ all -> 0x002c }
            goto L_0x000f
        L_0x001f:
            java.util.Set r1 = r3.f114815c     // Catch:{ all -> 0x002c }
            r1.clear()     // Catch:{ all -> 0x002c }
            r1 = 1
            r3.f114818f = r1     // Catch:{ all -> 0x002c }
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            return
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r2 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            goto L_0x0034
        L_0x0033:
            throw r2
        L_0x0034:
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.shared.lifecycle.internal.HiltWebModelHolderViewModel.mo639d():void");
    }

    /* renamed from: e */
    public final void mo47080e(Fragment fragment, boolean z) {
        C69664n.m101061g(fragment, "fragment");
        if (!((C43888f) this.f114824l.mo62784e()).mo46882c()) {
            this.f114824l.mo62807f(new C43886d(C69497an.f185919a));
            Fragment b = C43757p.m77267b(fragment);
            boolean z2 = false;
            this.f114819g.set(Boolean.valueOf(fragment == b));
            if (this.f114825m == null) {
                C69664n.m101061g(fragment, "<this>");
                Bundle arguments = fragment.getArguments();
                if (arguments != null) {
                    z2 = arguments.getBoolean("com.google.android.libraries.web.WebFragment");
                }
                this.f114816d = z2;
                this.f114825m = (HiltWebModelHolderViewModel) new C2368bp(b).mo5770a(HiltWebModelHolderViewModel.class);
                this.f114814b.put(C43269t.class, C43749h.m77260a(b));
            }
            mo47078b().mo47080e(b, z);
            HiltWebModelHolderViewModel b2 = mo47078b();
            Boolean bool = (Boolean) b2.f114822j.mo5755b("webx-cleared");
            if (bool == null || !bool.booleanValue()) {
                for (String g : b2.f114822j.mo5756c()) {
                    b2.f114822j.mo5760g(g);
                }
                b2.f114822j.mo5757d("webx-cleared", true);
            }
        }
        if (this.f114817e == null) {
            HiltWebModelHolderViewModel$attachLifecycleObserver$observer$1 hiltWebModelHolderViewModel$attachLifecycleObserver$observer$1 = new HiltWebModelHolderViewModel$attachLifecycleObserver$observer$1(this, z);
            fragment.getLifecycle().mo5790b(hiltWebModelHolderViewModel$attachLifecycleObserver$observer$1);
            this.f114817e = hiltWebModelHolderViewModel$attachLifecycleObserver$observer$1;
        }
    }
}
