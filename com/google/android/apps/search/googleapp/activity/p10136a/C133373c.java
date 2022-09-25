package com.google.android.apps.search.googleapp.activity.p10136a;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import androidx.core.p094f.C1891d;
import com.google.android.apps.search.googleapp.p10117aa.p10118a.C133076a;
import com.google.android.apps.search.googleapp.p10117aa.p10118a.C133077b;
import com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a;
import com.google.android.apps.search.googleapp.p10527u.C139761b;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139771l;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.libraries.performance.primes.metrics.p2410e.C31435u;
import com.google.apps.tiktok.inject.C47231d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Optional;
import p5462h.C69685i;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.activity.a.c */
/* compiled from: PG */
public final class C133373c implements C133376f {

    /* renamed from: a */
    private final boolean f363429a;

    /* renamed from: b */
    private final boolean f363430b;

    /* renamed from: c */
    private final boolean f363431c;

    /* renamed from: d */
    private final boolean f363432d;

    /* renamed from: e */
    private final Map f363433e;

    /* renamed from: f */
    private final C133110a f363434f;

    /* renamed from: g */
    private final C133076a f363435g;

    /* renamed from: h */
    private final C31435u f363436h;

    /* renamed from: i */
    private final Fragment f363437i;

    /* renamed from: j */
    private final Set f363438j = new LinkedHashSet();

    public C133373c(boolean z, boolean z2, boolean z3, boolean z4, Map map, C133110a aVar, C133076a aVar2, C31435u uVar, Fragment fragment) {
        C69664n.m101061g(map, "tabFragmentCreators");
        C69664n.m101061g(uVar, "memoryMetricService");
        C69664n.m101061g(fragment, "parentFragment");
        this.f363429a = z;
        this.f363430b = z2;
        this.f363431c = z3;
        this.f363432d = z4;
        this.f363433e = map;
        this.f363434f = aVar;
        this.f363435g = aVar2;
        this.f363436h = uVar;
        this.f363437i = fragment;
    }

    /* renamed from: h */
    private final Fragment m216472h(C139779t tVar, C139770k kVar) {
        Object obj = this.f363433e.get(tVar);
        C69664n.m101058d(obj);
        Fragment a = ((C139771l) obj).mo111217a(kVar);
        C69664n.m101060f(a, "tabFragmentCreators[tabT…eate(tabFragmentArgument)");
        return a;
    }

    /* renamed from: i */
    private final C139761b m216473i(String str) {
        return (C139761b) m216474j(str, C139761b.class);
    }

    /* renamed from: j */
    private final Object m216474j(String str, Class cls) {
        Fragment c = this.f363437i.getChildFragmentManager().f634a.mo671c(str);
        if (c == null) {
            return null;
        }
        C47231d dVar = c instanceof C47231d ? (C47231d) c : null;
        Object z = dVar != null ? dVar.mo17754z() : null;
        if (cls.isInstance(z)) {
            return cls.cast(z);
        }
        return null;
    }

    /* renamed from: k */
    private final String m216475k(C139779t tVar) {
        if (tVar != C139779t.GOOGLE_APP_BROWSER || !this.f363432d || !this.f363434f.mo110979b()) {
            int i = tVar.f379907i;
            return "top_level_destination_" + i;
        }
        String str = (String) this.f363435g.f362834a.get();
        str.getClass();
        return C133077b.m216050a(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        throw r7;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m216476l(com.google.android.apps.search.googleapp.p10527u.C139779t r6, com.google.android.apps.search.googleapp.p10527u.C139770k r7) {
        /*
            r5 = this;
            java.lang.String r0 = "CustomNavigationController: add a tab content fragment"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)
            android.support.v4.app.Fragment r1 = r5.f363437i     // Catch:{ all -> 0x0049 }
            android.support.v4.app.FragmentManager r1 = r1.getChildFragmentManager()     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "parentFragment.childFragmentManager"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = r5.m216475k(r6)     // Catch:{ all -> 0x0049 }
            android.support.v4.app.a r3 = new android.support.v4.app.a     // Catch:{ all -> 0x0049 }
            r3.<init>((android.support.p031v4.app.FragmentManager) r1)     // Catch:{ all -> 0x0049 }
            android.support.v4.app.cc r4 = r1.f634a     // Catch:{ all -> 0x0049 }
            android.support.v4.app.Fragment r4 = r4.mo671c(r2)     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0025
            r3.mo516m(r4)     // Catch:{ all -> 0x0049 }
        L_0x0025:
            android.support.v4.app.Fragment r6 = r5.m216472h(r6, r7)     // Catch:{ all -> 0x0049 }
            r7 = 2131432063(0x7f0b127f, float:1.8485873E38)
            r4 = 1
            r3.mo511h(r7, r6, r2, r4)     // Catch:{ all -> 0x0049 }
            boolean r6 = r5.f363430b     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0041
            r3.f824t = r4     // Catch:{ all -> 0x0049 }
            r3.mo686s(r2)     // Catch:{ all -> 0x0049 }
            r6 = 0
            r3.mo505b(r6)     // Catch:{ all -> 0x0049 }
            r1.mo467ah()     // Catch:{ all -> 0x0049 }
            goto L_0x0044
        L_0x0041:
            r3.mo509f()     // Catch:{ all -> 0x0049 }
        L_0x0044:
            r6 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r6)
            return
        L_0x0049:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004b }
        L_0x004b:
            r7 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.activity.p10136a.C133373c.m216476l(com.google.android.apps.search.googleapp.u.t, com.google.android.apps.search.googleapp.u.k):void");
    }

    /* renamed from: a */
    public final Bundle mo111109a() {
        if (this.f363438j.isEmpty()) {
            return null;
        }
        return C1891d.m5154a(new C69685i("CustomNavController_SavedState", new ArrayList(this.f363438j)));
    }

    /* renamed from: b */
    public final /* synthetic */ Optional mo111110b(C139779t tVar) {
        return C133374d.m216484a(this, tVar);
    }

    /* renamed from: c */
    public final Optional mo111111c(C139779t tVar, Class cls) {
        C69664n.m101061g(tVar, "tabType");
        Optional ofNullable = Optional.ofNullable(m216474j(m216475k(tVar), cls));
        C69664n.m101060f(ofNullable, "ofNullable(tryCastingCon…gmentTag(tabType), type))");
        return ofNullable;
    }

    /* renamed from: d */
    public final void mo111112d(C139779t tVar, C139770k kVar) {
        C69664n.m101061g(kVar, "tabFragmentArgument");
        FragmentManager childFragmentManager = this.f363437i.getChildFragmentManager();
        if (childFragmentManager.f634a.mo671c(m216475k(tVar)) == null) {
            m216476l(tVar, kVar);
            C133375e.m216486b(this.f363431c, this.f363436h);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0164  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111113e(com.google.android.apps.search.googleapp.p10527u.C139767h r18, com.google.android.apps.search.googleapp.p10527u.C139779t r19, com.google.android.apps.search.googleapp.p10527u.C139779t r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "eventData"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r4)
            java.lang.String r4 = "currentTabType"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r4)
            java.lang.String r4 = "destinationTabType"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r4)
            java.lang.String r4 = r0.m216475k(r2)
            com.google.android.apps.search.googleapp.u.b r4 = r0.m216473i(r4)
            if (r4 == 0) goto L_0x0028
            boolean r5 = r1.f379878h
            if (r5 != 0) goto L_0x0028
            r4.mo111219b(r3)
        L_0x0028:
            java.lang.String r5 = "newBuilder()"
            r6 = 1
            if (r3 != r2) goto L_0x0076
            boolean r2 = r1.f379873c
            if (r2 != 0) goto L_0x0076
            com.google.android.apps.search.googleapp.u.t r2 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0075
            com.google.android.apps.search.googleapp.search.e.e r2 = com.google.android.apps.search.googleapp.activity.p10136a.C133375e.m216485a(r18)
            p5462h.p5473f.p5475b.C69664n.m101058d(r4)
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.googleapp.search.e.g r3 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r3
            int r3 = r3.f373769a
            r3 = r3 & r6
            if (r3 == 0) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            boolean r1 = r1.f379878h
            if (r1 != 0) goto L_0x0072
        L_0x004e:
            com.google.android.apps.search.googleapp.u.p r1 = com.google.android.apps.search.googleapp.p10527u.C139775p.f379888c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.googleapp.u.o r1 = (com.google.android.apps.search.googleapp.p10527u.C139774o) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)
            com.google.android.apps.search.googleapp.u.n r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.protobuf.bv r2 = r2.build()
            java.lang.String r3 = "queryOptions.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.android.apps.search.googleapp.search.e.g r2 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r2
            r1.mo115231b(r2)
            com.google.android.apps.search.googleapp.u.p r1 = r1.mo115230a()
            r4.mo111220c(r1)
        L_0x0072:
            r4.mo111221d()
        L_0x0075:
            return
        L_0x0076:
            boolean r2 = r1.f379873c
            r4 = 0
            if (r2 != 0) goto L_0x0090
            android.support.v4.app.Fragment r2 = r0.f363437i
            android.support.v4.app.FragmentManager r2 = r2.getChildFragmentManager()
            java.lang.String r7 = r0.m216475k(r3)
            android.support.v4.app.cc r2 = r2.f634a
            android.support.v4.app.Fragment r2 = r2.mo671c(r7)
            if (r2 != 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r2 = 0
            goto L_0x0091
        L_0x0090:
            r2 = 1
        L_0x0091:
            java.lang.String r7 = "eventData.tabFragmentArgument"
            if (r2 == 0) goto L_0x00a5
            boolean r8 = r0.f363430b
            if (r8 != 0) goto L_0x00a5
            com.google.android.apps.search.googleapp.u.k r8 = r1.f379877g
            if (r8 != 0) goto L_0x009f
            com.google.android.apps.search.googleapp.u.k r8 = com.google.android.apps.search.googleapp.p10527u.C139770k.f379882c
        L_0x009f:
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r7)
            r0.m216476l(r3, r8)
        L_0x00a5:
            com.google.android.apps.search.googleapp.u.k r8 = r1.f379877g
            if (r8 != 0) goto L_0x00ab
            com.google.android.apps.search.googleapp.u.k r8 = com.google.android.apps.search.googleapp.p10527u.C139770k.f379882c
        L_0x00ab:
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r7)
            boolean r7 = r1.f379873c
            java.lang.String r9 = r0.m216475k(r3)
            boolean r10 = r0.f363430b
            r11 = 2131432063(0x7f0b127f, float:1.8485873E38)
            if (r10 == 0) goto L_0x0164
            android.support.v4.app.Fragment r10 = r0.f363437i
            android.support.v4.app.FragmentManager r10 = r10.getChildFragmentManager()
            java.lang.String r12 = "parentFragment.childFragmentManager"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r12)
            android.support.v4.app.cc r12 = r10.f634a
            android.support.v4.app.Fragment r12 = r12.mo671c(r9)
            r13 = 2130772071(0x7f010067, float:1.714725E38)
            r14 = 2130772072(0x7f010068, float:1.7147252E38)
            if (r12 == 0) goto L_0x00f4
            android.support.v4.app.a r7 = new android.support.v4.app.a
            r7.<init>((android.support.p031v4.app.FragmentManager) r10)
            r7.f824t = r6
            r7.mo691x(r14, r13, r4, r4)
            java.util.Map r12 = r0.f363433e
            java.lang.Object r12 = r12.get(r3)
            p5462h.p5473f.p5475b.C69664n.m101058d(r12)
            com.google.android.apps.search.googleapp.u.l r12 = (com.google.android.apps.search.googleapp.p10527u.C139771l) r12
            android.support.v4.app.Fragment r8 = r12.mo111217a(r8)
            r7.mo689v(r11, r8, r9)
            r7.mo505b(r4)
            goto L_0x015f
        L_0x00f4:
            android.support.v4.app.cc r12 = r10.f634a
            java.util.List r12 = r12.mo677i()
            java.util.Iterator r12 = r12.iterator()
        L_0x00fe:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x012a
            java.lang.Object r15 = r12.next()
            android.support.v4.app.Fragment r15 = (android.support.p031v4.app.Fragment) r15
            java.lang.String r15 = r15.getTag()
            if (r15 == 0) goto L_0x00fe
            boolean r16 = p5462h.p5473f.p5475b.C69664n.m101066l(r15, r9)
            if (r16 != 0) goto L_0x0122
            java.util.Set r11 = r0.f363438j
            r11.add(r15)
            r10.mo447N(r15)
            r11 = 2131432063(0x7f0b127f, float:1.8485873E38)
            goto L_0x00fe
        L_0x0122:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "findFragmentByTag didn't manage to find a child fragment."
            r1.<init>(r2)
            throw r1
        L_0x012a:
            if (r7 == 0) goto L_0x0139
            java.util.Set r7 = r0.f363438j
            r7.remove(r9)
            android.support.v4.app.bi r7 = new android.support.v4.app.bi
            r7.<init>(r10, r9)
            r10.mo437D(r7, r4)
        L_0x0139:
            java.util.Set r7 = r0.f363438j
            boolean r7 = r7.contains(r9)
            if (r7 == 0) goto L_0x0145
            r10.mo445L(r9)
            goto L_0x015f
        L_0x0145:
            android.support.v4.app.Fragment r7 = r0.m216472h(r3, r8)
            android.support.v4.app.a r8 = new android.support.v4.app.a
            r8.<init>((android.support.p031v4.app.FragmentManager) r10)
            r8.f824t = r6
            r8.mo691x(r14, r13, r4, r4)
            r8.mo686s(r9)
            r11 = 2131432063(0x7f0b127f, float:1.8485873E38)
            r8.mo689v(r11, r7, r9)
            r8.mo505b(r4)
        L_0x015f:
            r10.mo467ah()
            goto L_0x025b
        L_0x0164:
            android.support.v4.app.Fragment r4 = r0.f363437i
            android.view.View r4 = r4.getView()
            java.lang.String r7 = "Required value was null."
            if (r4 == 0) goto L_0x0315
            android.view.View r4 = r4.findViewById(r11)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.support.v4.app.Fragment r8 = r0.f363437i
            android.support.v4.app.FragmentManager r8 = r8.getChildFragmentManager()
            android.support.v4.app.cc r8 = r8.f634a
            java.util.List r8 = r8.mo677i()
            java.lang.String r10 = "parentFragment.childFragmentManager.fragments"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r10)
            java.util.Iterator r8 = r8.iterator()
        L_0x0189:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x025b
            java.lang.Object r10 = r8.next()
            android.support.v4.app.Fragment r10 = (android.support.p031v4.app.Fragment) r10
            java.lang.String r11 = r10.getTag()
            if (r11 == 0) goto L_0x0189
            java.lang.String r12 = "top_level_destination_"
            boolean r11 = p5462h.p5483m.C69764m.m101234m(r11, r12)
            if (r11 != r6) goto L_0x0189
            java.lang.String r11 = r10.getTag()
            boolean r11 = p5462h.p5473f.p5475b.C69664n.m101066l(r9, r11)
            if (r11 == 0) goto L_0x01eb
            boolean r11 = r0.f363429a
            if (r11 == 0) goto L_0x01d9
            android.view.View r11 = r10.getView()
            if (r11 == 0) goto L_0x01d9
            android.view.View r11 = r10.getView()
            if (r11 == 0) goto L_0x01d3
            android.view.ViewParent r11 = r11.getParent()
            if (r11 != 0) goto L_0x01d9
            android.view.View r11 = r10.getView()
            if (r11 == 0) goto L_0x01cd
            r4.addView(r11)
            goto L_0x01d9
        L_0x01cd:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x01d3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x01d9:
            android.support.v4.app.Fragment r11 = r0.f363437i
            android.support.v4.app.FragmentManager r11 = r11.getChildFragmentManager()
            android.support.v4.app.a r12 = new android.support.v4.app.a
            r12.<init>((android.support.p031v4.app.FragmentManager) r11)
            r12.mo519p(r10)
            r12.mo509f()
            goto L_0x0189
        L_0x01eb:
            android.support.v4.app.Fragment r11 = r0.f363437i
            android.support.v4.app.FragmentManager r11 = r11.getChildFragmentManager()
            android.support.v4.app.a r12 = new android.support.v4.app.a
            r12.<init>((android.support.p031v4.app.FragmentManager) r11)
            r12.mo515l(r10)
            r12.mo509f()
            java.lang.String r11 = r10.getTag()
            if (r11 == 0) goto L_0x0255
            com.google.android.apps.search.googleapp.u.b r11 = r0.m216473i(r11)
            boolean r12 = r0.f363429a
            if (r12 == 0) goto L_0x023a
            if (r11 == 0) goto L_0x023a
            boolean r12 = r11.mo111223f()
            if (r12 == 0) goto L_0x023a
            android.view.View r12 = r10.getView()
            if (r12 == 0) goto L_0x023a
            android.view.View r12 = r10.getView()
            if (r12 == 0) goto L_0x0234
            android.view.ViewParent r12 = r12.getParent()
            if (r12 == 0) goto L_0x023a
            android.view.View r12 = r10.getView()
            if (r12 == 0) goto L_0x022e
            r4.removeView(r12)
            goto L_0x023a
        L_0x022e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x0234:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x023a:
            if (r11 == 0) goto L_0x0189
            boolean r11 = r11.mo111225h()
            if (r11 != r6) goto L_0x0189
            android.support.v4.app.Fragment r11 = r0.f363437i
            android.support.v4.app.FragmentManager r11 = r11.getChildFragmentManager()
            android.support.v4.app.a r12 = new android.support.v4.app.a
            r12.<init>((android.support.p031v4.app.FragmentManager) r11)
            r12.mo516m(r10)
            r12.mo509f()
            goto L_0x0189
        L_0x0255:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x025b:
            boolean r4 = r0.f363431c
            com.google.android.libraries.performance.primes.metrics.e.u r7 = r0.f363436h
            com.google.android.apps.search.googleapp.activity.p10136a.C133375e.m216486b(r4, r7)
            java.lang.String r4 = r0.m216475k(r3)
            com.google.android.apps.search.googleapp.u.b r4 = r0.m216473i(r4)
            if (r4 == 0) goto L_0x0314
            boolean r7 = r0.f363432d
            if (r7 == 0) goto L_0x02e6
            com.google.android.apps.search.googleapp.u.t r7 = com.google.android.apps.search.googleapp.p10527u.C139779t.GOOGLE_APP_BROWSER
            if (r3 != r7) goto L_0x02e6
            com.google.android.apps.search.googleapp.aa.b.a r7 = r0.f363434f
            boolean r7 = r7.mo110979b()
            if (r7 == 0) goto L_0x02e6
            com.google.android.apps.search.googleapp.u.p r2 = com.google.android.apps.search.googleapp.p10527u.C139775p.f379888c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.googleapp.u.o r2 = (com.google.android.apps.search.googleapp.p10527u.C139774o) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            com.google.android.apps.search.googleapp.u.n r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.android.apps.search.googleapp.googleappbrowser.a.b r3 = com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135456b.f369035c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.search.googleapp.googleappbrowser.a.a r3 = (com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135455a) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            java.lang.String r5 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r5)
            com.google.android.apps.search.googleapp.u.k r1 = r1.f379877g
            if (r1 != 0) goto L_0x02a1
            com.google.android.apps.search.googleapp.u.k r1 = com.google.android.apps.search.googleapp.p10527u.C139770k.f379882c
        L_0x02a1:
            int r5 = r1.f379884a
            r7 = 4
            if (r5 != r7) goto L_0x02ab
            java.lang.Object r1 = r1.f379885b
            com.google.android.apps.search.googleapp.googleappbrowser.a.h r1 = (com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h) r1
            goto L_0x02ad
        L_0x02ab:
            com.google.android.apps.search.googleapp.googleappbrowser.a.h r1 = com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h.f369059n
        L_0x02ad:
            boolean r1 = r1.f369070j
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.search.googleapp.googleappbrowser.a.b r5 = (com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135456b) r5
            int r7 = r5.f369037a
            r6 = r6 | r7
            r5.f369037a = r6
            r5.f369038b = r1
            com.google.protobuf.bv r1 = r3.build()
            java.lang.String r3 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            com.google.android.apps.search.googleapp.googleappbrowser.a.b r1 = (com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135456b) r1
            java.lang.String r3 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)
            com.google.android.apps.search.googleapp.u.o r3 = r2.f379887a
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.android.apps.search.googleapp.u.p r3 = (com.google.android.apps.search.googleapp.p10527u.C139775p) r3
            r1.getClass()
            r3.f379891b = r1
            r1 = 7
            r3.f379890a = r1
            com.google.android.apps.search.googleapp.u.p r1 = r2.mo115230a()
            r4.mo111220c(r1)
            goto L_0x0311
        L_0x02e6:
            if (r2 == 0) goto L_0x0311
            java.util.Set r2 = r0.f363438j
            java.lang.String r3 = r0.m216475k(r3)
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0311
            com.google.android.apps.search.googleapp.u.p r2 = com.google.android.apps.search.googleapp.p10527u.C139775p.f379888c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.googleapp.u.o r2 = (com.google.android.apps.search.googleapp.p10527u.C139774o) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            com.google.android.apps.search.googleapp.u.n r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.android.apps.search.googleapp.search.e.g r1 = com.google.android.apps.search.googleapp.activity.p10136a.C133375e.m216487c(r18)
            r2.mo115231b(r1)
            com.google.android.apps.search.googleapp.u.p r1 = r2.mo115230a()
            r4.mo111220c(r1)
        L_0x0311:
            r4.mo111221d()
        L_0x0314:
            return
        L_0x0315:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            goto L_0x031c
        L_0x031b:
            throw r1
        L_0x031c:
            goto L_0x031b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.activity.p10136a.C133373c.mo111113e(com.google.android.apps.search.googleapp.u.h, com.google.android.apps.search.googleapp.u.t, com.google.android.apps.search.googleapp.u.t):void");
    }

    /* renamed from: f */
    public final void mo111114f(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("CustomNavController_SavedState");
        if (stringArrayList != null) {
            this.f363438j.clear();
            C69540x.m100811r(this.f363438j, stringArrayList);
        }
    }

    /* renamed from: g */
    public final boolean mo111115g(C139779t tVar) {
        if (this.f363430b && C139779t.HOME_SCREEN.equals(tVar)) {
            return true;
        }
        return this.f363437i.getChildFragmentManager().f634a.mo671c(m216475k(C139779t.HOME_SCREEN)) != null;
    }
}
