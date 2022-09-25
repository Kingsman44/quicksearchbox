package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p098j.C2050bp;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9837d.C129617e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9837d.C129620h;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.scrim.ScrimView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.impl.C147783f;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69731k;
import p5462h.p5482l.C69734n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.q */
/* compiled from: PG */
public final class C129601q {

    /* renamed from: a */
    private final C147783f f355708a;

    public C129601q(C147783f fVar) {
        this.f355708a = fVar;
    }

    /* renamed from: f */
    public static final List m211607f(View view, View view2) {
        C69731k i;
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (C69664n.m101066l(view2 != null ? view2.getParent() : null, view.getParent())) {
                return arrayList;
            }
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (!(viewGroup == null || (i = C69734n.m101141i(C2050bp.m5609a(viewGroup), new C129594j(view2))) == null)) {
                    C69734n.m101147o(i, arrayList);
                }
            }
            ViewParent parent2 = view2 != null ? view2.getParent() : null;
            view2 = parent2 instanceof View ? (View) parent2 : null;
        }
    }

    /* renamed from: g */
    public static final C69731k m211608g(ViewGroup viewGroup) {
        View childAt = viewGroup.getChildAt(0);
        C69664n.m101059e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        return C2050bp.m5609a((ViewGroup) childAt);
    }

    /* renamed from: h */
    public static final View m211609h(View view) {
        C69664n.m101061g(view, "<this>");
        Object c = C129620h.m211642c(view, R.string.assistant_scrim);
        View view2 = null;
        if (c == null) {
            View b = C129620h.m211641b(view, C129617e.f355742a);
            if (true != (b instanceof ScrimView)) {
                b = null;
            }
            c = (ScrimView) b;
        }
        ViewGroup viewGroup = c instanceof ViewGroup ? (ViewGroup) c : null;
        if (viewGroup != null) {
            view2 = viewGroup.getChildAt(0);
        }
        return view2 == null ? view : view2;
    }

    /* renamed from: i */
    public static final ViewGroup m211610i(View view) {
        View a = C129620h.m211640a(view);
        ViewGroup viewGroup = a instanceof ViewGroup ? (ViewGroup) a : null;
        if (viewGroup != null) {
            return viewGroup;
        }
        throw new IllegalArgumentException("The view that animates shelf, should have shelfView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109123a(android.view.View r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129588d
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.d r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129588d) r0
            int r1 = r0.f355683c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355683c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.d r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.d
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f355681a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355683c
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            p5462h.C69714l.m101134b(r11)
            goto L_0x00b9
        L_0x0028:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0030:
            p5462h.C69714l.m101134b(r11)
            android.view.View r10 = m211609h(r10)
            r0.f355683c = r3
            com.google.android.libraries.animation.impl.f r11 = r9.f355708a
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.n r2 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.n
            r2.<init>(r10)
            com.google.android.libraries.animation.c r3 = new com.google.android.libraries.animation.c
            r3.<init>(r2)
            java.lang.Float r2 = new java.lang.Float
            r4 = 0
            r2.<init>(r4)
            java.lang.Float r4 = new java.lang.Float
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r5)
            com.google.common.b.pg r2 = com.google.common.p4522b.C58714pg.m90504g(r2, r4)
            com.google.android.libraries.animation.t r4 = new com.google.android.libraries.animation.t
            r4.<init>(r2)
            android.content.Context r2 = r10.getContext()
            java.lang.String r5 = "context"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            com.google.android.libraries.assistant.p1614t.C19394d.m36983a(r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            r6 = 2130970628(0x7f040804, float:1.7549971E38)
            android.view.animation.Interpolator r2 = com.google.android.libraries.assistant.p1614t.C19393c.m36982a(r2, r6)
            r4.mo124468c(r2)
            int r2 = r10.getBottom()
            int r6 = r10.getTop()
            float r7 = r10.getTranslationY()
            com.google.android.libraries.animation.p r8 = new com.google.android.libraries.animation.p
            float r2 = (float) r2
            float r6 = (float) r6
            float r2 = r2 - r6
            r8.<init>(r2, r7)
            r4.f398763c = r8
            com.google.android.libraries.animation.a r2 = r3.mo124447a(r4)
            com.google.android.libraries.animation.impl.b r3 = new com.google.android.libraries.animation.impl.b
            r3.<init>(r11, r2)
            android.content.Context r10 = r10.getContext()
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r5)
            com.google.android.libraries.assistant.p1614t.C19394d.m36983a(r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r5)
            r11 = 2130970611(0x7f0407f3, float:1.7549937E38)
            int r10 = com.google.android.libraries.assistant.p1614t.C19392b.m36981a(r10, r11)
            long r10 = (long) r10
            j$.time.Duration r10 = com.google.common.p4580v.p4582b.C60943b.m93086b(r10)
            java.lang.Object r10 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9837d.C129616d.m211636a(r3, r10, r0)
            h.c.a.a r11 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r10 == r11) goto L_0x00b6
            h.q r10 = p5462h.C69788q.f186170a
        L_0x00b6:
            if (r10 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129601q.mo109123a(android.view.View, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109124b(android.view.View r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129589e
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.e r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129589e) r0
            int r1 = r0.f355686c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355686c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.e r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.e
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f355684a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355686c
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            p5462h.C69714l.m101134b(r11)
            goto L_0x00b9
        L_0x0028:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0030:
            p5462h.C69714l.m101134b(r11)
            android.view.View r10 = m211609h(r10)
            r0.f355686c = r3
            com.google.android.libraries.animation.impl.f r11 = r9.f355708a
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.o r2 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.o
            r2.<init>(r10)
            com.google.android.libraries.animation.c r3 = new com.google.android.libraries.animation.c
            r3.<init>(r2)
            java.lang.Float r2 = new java.lang.Float
            r4 = 0
            r2.<init>(r4)
            java.lang.Float r4 = new java.lang.Float
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r5)
            com.google.common.b.pg r2 = com.google.common.p4522b.C58714pg.m90504g(r2, r4)
            com.google.android.libraries.animation.t r4 = new com.google.android.libraries.animation.t
            r4.<init>(r2)
            android.content.Context r2 = r10.getContext()
            java.lang.String r5 = "context"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            com.google.android.libraries.assistant.p1614t.C19394d.m36983a(r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            r6 = 2130970627(0x7f040803, float:1.754997E38)
            android.view.animation.Interpolator r2 = com.google.android.libraries.assistant.p1614t.C19393c.m36982a(r2, r6)
            r4.mo124468c(r2)
            float r2 = r10.getTranslationY()
            int r6 = r10.getBottom()
            int r7 = r10.getTop()
            com.google.android.libraries.animation.p r8 = new com.google.android.libraries.animation.p
            float r6 = (float) r6
            float r7 = (float) r7
            float r6 = r6 - r7
            r8.<init>(r2, r6)
            r4.f398763c = r8
            com.google.android.libraries.animation.a r2 = r3.mo124447a(r4)
            com.google.android.libraries.animation.impl.b r3 = new com.google.android.libraries.animation.impl.b
            r3.<init>(r11, r2)
            android.content.Context r10 = r10.getContext()
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r5)
            com.google.android.libraries.assistant.p1614t.C19394d.m36983a(r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r5)
            r11 = 2130970616(0x7f0407f8, float:1.7549947E38)
            int r10 = com.google.android.libraries.assistant.p1614t.C19392b.m36981a(r10, r11)
            long r10 = (long) r10
            j$.time.Duration r10 = com.google.common.p4580v.p4582b.C60943b.m93086b(r10)
            java.lang.Object r10 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9837d.C129616d.m211636a(r3, r10, r0)
            h.c.a.a r11 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r10 == r11) goto L_0x00b6
            h.q r10 = p5462h.C69788q.f186170a
        L_0x00b6:
            if (r10 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129601q.mo109124b(android.view.View, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109125c(android.view.View r11, java.util.Map r12, p5462h.p5466c.C69577g r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129592h
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.h r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129592h) r0
            int r1 = r0.f355691c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355691c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.h r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.h
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f355689a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355691c
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            p5462h.C69714l.m101134b(r13)
            goto L_0x00dc
        L_0x0028:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0030:
            p5462h.C69714l.m101134b(r13)
            android.content.Context r11 = r11.getContext()
            java.lang.String r13 = "root.context"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r13)
            r0.f355691c = r3
            com.google.android.libraries.animation.impl.f r13 = r10.f355708a
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r12.size()
            r2.<init>(r3)
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0051:
            boolean r3 = r12.hasNext()
            java.lang.String r4 = "context"
            if (r3 == 0) goto L_0x00b3
            java.lang.Object r3 = r12.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.l r6 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.l
            r6.<init>(r5)
            com.google.android.libraries.animation.c r7 = new com.google.android.libraries.animation.c
            r7.<init>(r6)
            r6 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r6)
            r9 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            com.google.common.b.pg r8 = com.google.common.p4522b.C58714pg.m90504g(r8, r9)
            com.google.android.libraries.animation.t r9 = new com.google.android.libraries.animation.t
            r9.<init>(r8)
            android.content.Context r5 = r5.getContext()
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r4)
            com.google.android.libraries.assistant.p1614t.C19394d.m36983a(r5)
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r4)
            r4 = 2130970625(0x7f040801, float:1.7549965E38)
            android.view.animation.Interpolator r4 = com.google.android.libraries.assistant.p1614t.C19393c.m36982a(r5, r4)
            r9.mo124468c(r4)
            com.google.android.libraries.animation.p r4 = new com.google.android.libraries.animation.p
            r4.<init>(r6, r3)
            r9.f398763c = r4
            com.google.android.libraries.animation.a r3 = r7.mo124447a(r9)
            r2.add(r3)
            goto L_0x0051
        L_0x00b3:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.f r12 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.f
            r12.<init>(r2)
            com.google.android.libraries.animation.impl.b r2 = new com.google.android.libraries.animation.impl.b
            r2.<init>(r13, r12)
            com.google.android.libraries.assistant.p1614t.C19394d.m36983a(r11)
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r4)
            r12 = 2130970615(0x7f0407f7, float:1.7549945E38)
            int r11 = com.google.android.libraries.assistant.p1614t.C19392b.m36981a(r11, r12)
            long r11 = (long) r11
            j$.time.Duration r11 = com.google.common.p4580v.p4582b.C60943b.m93086b(r11)
            java.lang.Object r11 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9837d.C129616d.m211636a(r2, r11, r0)
            h.c.a.a r12 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r11 == r12) goto L_0x00d9
            h.q r11 = p5462h.C69788q.f186170a
        L_0x00d9:
            if (r11 != r1) goto L_0x00dc
            return r1
        L_0x00dc:
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129601q.mo109125c(android.view.View, java.util.Map, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109126d(android.view.View r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129593i
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.i r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129593i) r0
            int r1 = r0.f355694c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355694c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.i r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.i
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f355692a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355694c
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            p5462h.C69714l.m101134b(r12)
            goto L_0x00e2
        L_0x0028:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0030:
            p5462h.C69714l.m101134b(r12)
            android.view.View r12 = m211609h(r11)
            android.view.ViewGroup r2 = m211610i(r11)
            android.content.Context r11 = r11.getContext()
            java.lang.String r4 = "root.context"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)
            java.util.List r12 = m211607f(r12, r2)
            h.l.k r2 = m211608g(r2)
            java.util.List r12 = p5462h.p5463a.C69540x.m100833O(r12, r2)
            r0.f355694c = r3
            com.google.android.libraries.animation.impl.f r2 = r10.f355708a
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p5462h.p5463a.C69540x.m100804k(r12, r4)
            r3.<init>(r4)
            java.util.Iterator r12 = r12.iterator()
        L_0x0063:
            boolean r4 = r12.hasNext()
            java.lang.String r5 = "context"
            if (r4 == 0) goto L_0x00b9
            java.lang.Object r4 = r12.next()
            android.view.View r4 = (android.view.View) r4
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.m r6 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.m
            r6.<init>(r4)
            com.google.android.libraries.animation.c r7 = new com.google.android.libraries.animation.c
            r7.<init>(r6)
            r6 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r6)
            r9 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            com.google.common.b.pg r8 = com.google.common.p4522b.C58714pg.m90504g(r8, r9)
            com.google.android.libraries.animation.t r9 = new com.google.android.libraries.animation.t
            r9.<init>(r8)
            android.content.Context r8 = r4.getContext()
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r5)
            com.google.android.libraries.assistant.p1614t.C19394d.m36983a(r8)
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r5)
            r5 = 2130970625(0x7f040801, float:1.7549965E38)
            android.view.animation.Interpolator r5 = com.google.android.libraries.assistant.p1614t.C19393c.m36982a(r8, r5)
            r9.mo124468c(r5)
            float r4 = r4.getAlpha()
            com.google.android.libraries.animation.p r5 = new com.google.android.libraries.animation.p
            r5.<init>(r4, r6)
            r9.f398763c = r5
            com.google.android.libraries.animation.a r4 = r7.mo124447a(r9)
            r3.add(r4)
            goto L_0x0063
        L_0x00b9:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.f r12 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.f
            r12.<init>(r3)
            com.google.android.libraries.animation.impl.b r3 = new com.google.android.libraries.animation.impl.b
            r3.<init>(r2, r12)
            com.google.android.libraries.assistant.p1614t.C19394d.m36983a(r11)
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r5)
            r12 = 2130970615(0x7f0407f7, float:1.7549945E38)
            int r11 = com.google.android.libraries.assistant.p1614t.C19392b.m36981a(r11, r12)
            long r11 = (long) r11
            j$.time.Duration r11 = com.google.common.p4580v.p4582b.C60943b.m93086b(r11)
            java.lang.Object r11 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9837d.C129616d.m211636a(r3, r11, r0)
            h.c.a.a r12 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r11 == r12) goto L_0x00df
            h.q r11 = p5462h.C69788q.f186170a
        L_0x00df:
            if (r11 != r1) goto L_0x00e2
            return r1
        L_0x00e2:
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129601q.mo109126d(android.view.View, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109127e(android.view.View r10, int r11, p5462h.p5466c.C69577g r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129600p
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.p r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129600p) r0
            int r1 = r0.f355707e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355707e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.p r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.p
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f355705c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355707e
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            int r10 = r0.f355704b
            java.lang.Object r11 = r0.f355703a
            p5462h.C69714l.m101134b(r12)
            goto L_0x00bd
        L_0x002c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0034:
            p5462h.C69714l.m101134b(r12)
            android.view.ViewGroup r10 = m211610i(r10)
            android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
            int r12 = r12.height
            int r2 = r10.getHeight()
            r0.f355703a = r10
            r0.f355704b = r12
            r0.f355707e = r3
            com.google.android.libraries.animation.impl.f r3 = r9.f355708a
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.g r4 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.g
            r4.<init>(r10)
            com.google.android.libraries.animation.c r5 = new com.google.android.libraries.animation.c
            r5.<init>(r4)
            java.lang.Float r4 = new java.lang.Float
            r6 = 0
            r4.<init>(r6)
            java.lang.Float r6 = new java.lang.Float
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r7)
            com.google.common.b.pg r4 = com.google.common.p4522b.C58714pg.m90504g(r4, r6)
            com.google.android.libraries.animation.t r6 = new com.google.android.libraries.animation.t
            r6.<init>(r4)
            android.content.Context r4 = r10.getContext()
            java.lang.String r7 = "context"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r7)
            com.google.android.libraries.assistant.p1614t.C19394d.m36983a(r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r7)
            r8 = 2130970623(0x7f0407ff, float:1.7549961E38)
            android.view.animation.Interpolator r4 = com.google.android.libraries.assistant.p1614t.C19393c.m36982a(r4, r8)
            r6.mo124468c(r4)
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.k r4 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.k
            r4.<init>(r11, r2)
            r6.f398763c = r4
            com.google.android.libraries.animation.a r11 = r5.mo124447a(r6)
            com.google.android.libraries.animation.impl.b r2 = new com.google.android.libraries.animation.impl.b
            r2.<init>(r3, r11)
            android.content.Context r11 = r10.getContext()
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r7)
            com.google.android.libraries.assistant.p1614t.C19394d.m36983a(r11)
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r7)
            r3 = 2130970613(0x7f0407f5, float:1.7549941E38)
            int r11 = com.google.android.libraries.assistant.p1614t.C19392b.m36981a(r11, r3)
            long r3 = (long) r11
            j$.time.Duration r11 = com.google.common.p4580v.p4582b.C60943b.m93086b(r3)
            java.lang.Object r11 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9837d.C129616d.m211636a(r2, r11, r0)
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r11 == r0) goto L_0x00b9
            h.q r11 = p5462h.C69788q.f186170a
        L_0x00b9:
            if (r11 == r1) goto L_0x00d5
            r11 = r10
            r10 = r12
        L_0x00bd:
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            if (r12 == 0) goto L_0x00cd
            r12.height = r10
            r11.setLayoutParams(r12)
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x00cd:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r10.<init>(r11)
            throw r10
        L_0x00d5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b.C129601q.mo109127e(android.view.View, int, h.c.g):java.lang.Object");
    }
}
