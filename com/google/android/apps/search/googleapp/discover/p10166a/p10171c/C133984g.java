package com.google.android.apps.search.googleapp.discover.p10166a.p10171c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.discover.loggingsignals.C134469g;
import com.google.android.apps.search.googleapp.discover.p10245w.p10246a.C135209c;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4580v.C60950i;
import com.google.p4283bv.p4354e.C57528m;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57299d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.c.g */
/* compiled from: PG */
public final class C133984g implements C134469g, C133987j {

    /* renamed from: f */
    private static final C59071e f364951f = C59071e.m91331h();

    /* renamed from: a */
    public final C133986i f364952a;

    /* renamed from: b */
    public final C133989l f364953b;

    /* renamed from: c */
    public final C60950i f364954c;

    /* renamed from: d */
    public final C69585o f364955d;

    /* renamed from: e */
    public final Map f364956e = new LinkedHashMap();

    /* renamed from: g */
    private final Optional f364957g;

    /* renamed from: h */
    private final C71422aw f364958h;

    /* renamed from: i */
    private final Set f364959i = new LinkedHashSet();

    /* renamed from: j */
    private final Set f364960j = new LinkedHashSet();

    /* renamed from: k */
    private Instant f364961k = Instant.EPOCH;

    /* renamed from: l */
    private ViewGroup f364962l;

    /* renamed from: m */
    private C57528m f364963m;

    /* renamed from: n */
    private boolean f364964n;

    /* renamed from: o */
    private boolean f364965o;

    public C133984g(C133986i iVar, C133989l lVar, C60950i iVar2, Optional optional, C71422aw awVar, C69585o oVar) {
        C69664n.m101061g(iVar2, "timeSource");
        C69664n.m101061g(optional, "viewActionDebugView");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f364952a = iVar;
        this.f364953b = lVar;
        this.f364954c = iVar2;
        this.f364957g = optional;
        this.f364958h = awVar;
        this.f364955d = oVar;
    }

    /* renamed from: t */
    private final void m217312t(View view) {
        C69664n.m101061g(view, "view");
        Integer num = (Integer) view.getTag(R.id.googleapp_tag_view_actions_content_key);
        int intValue = num != null ? num.intValue() : -1;
        ViewGroup viewGroup = this.f364962l;
        if (!(intValue == -1 || viewGroup == null)) {
            C133989l lVar = this.f364953b;
            C69664n.m101061g(view, "view");
            Rect a = C133988k.m217337a(view);
            Rect a2 = C133988k.m217337a(viewGroup);
            float f = 0.0f;
            float height = a2.intersect(a) ? ((float) (a2.height() * a2.width())) / ((float) (a.height() * a.width())) : 0.0f;
            boolean z = true;
            if (((double) height) <= lVar.f364973a) {
                Rect a3 = C133988k.m217337a(view);
                Rect a4 = C133988k.m217337a(viewGroup);
                int height2 = a4.height() * a4.width();
                if (a4.intersect(a3)) {
                    f = ((float) (a4.height() * a4.width())) / ((float) height2);
                }
                if (((double) f) <= lVar.f364974b) {
                    z = false;
                }
            }
            if (z) {
                this.f364960j.add(Integer.valueOf(intValue));
            }
            this.f364957g.ifPresent(new C133983f(this, intValue, view, z));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            int childCount = viewGroup2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup2.getChildAt(i);
                C69664n.m101060f(childAt, "childView");
                m217312t(childAt);
            }
        }
    }

    /* renamed from: a */
    public final Object mo111490a(List list, C69577g gVar) {
        Object a = C71803m.m105040a(this.f364955d, new C133981d(list, this, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: b */
    public final List mo111491b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f364956e.entrySet()) {
            C133975a aVar = (C133975a) entry.getValue();
            if (this.f364953b.mo111509a(aVar.f364922a)) {
                arrayList.add(aVar);
                Duration duration = Duration.ZERO;
                C69664n.m101060f(duration, "ZERO");
                entry.setValue(C133975a.m217301a(aVar, duration));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo111492c() {
        ViewGroup viewGroup;
        if (this.f364964n && !this.f364965o && (viewGroup = this.f364962l) != null && viewGroup.getChildCount() > 0 && !this.f364959i.isEmpty() && !this.f364961k.isAfter(Instant.EPOCH)) {
            this.f364961k = this.f364954c.mo57444a();
            ViewGroup viewGroup2 = this.f364962l;
            if (viewGroup2 != null) {
                m217312t(viewGroup2);
            }
        }
    }

    /* renamed from: d */
    public final void mo111493d() {
        mo111508s();
        mo111492c();
    }

    /* renamed from: e */
    public final void mo111494e() {
    }

    /* renamed from: f */
    public final void mo111495f() {
        this.f364962l = null;
    }

    /* renamed from: g */
    public final void mo111496g() {
        this.f364964n = false;
        mo111508s();
        C46459k.m82829b(C135209c.m219302a(C71663i.m104692e(this.f364958h, (C71424ay) null, new C133980c(this, (C69577g) null), 3)), "Error computing view actions", new Object[0]);
    }

    /* renamed from: h */
    public final void mo111497h() {
        this.f364964n = true;
        mo111492c();
    }

    /* renamed from: i */
    public final void mo111498i(int i, int i2) {
        mo111508s();
        mo111492c();
    }

    /* renamed from: j */
    public final void mo111499j() {
    }

    /* renamed from: k */
    public final void mo111500k(int i, int i2, int i3, int i4) {
        this.f364965o = false;
        mo111492c();
    }

    /* renamed from: l */
    public final void mo111501l() {
        this.f364965o = true;
        mo111508s();
    }

    /* renamed from: m */
    public final void mo111502m() {
    }

    /* renamed from: n */
    public final void mo111503n(int i, View view) {
        C133988k.m217338b(view, -1);
        this.f364959i.remove(Integer.valueOf(i));
    }

    /* renamed from: o */
    public final void mo111504o(int i, View view, C57299d dVar) {
        C69664n.m101061g(dVar, "actionPayload");
        C133988k.m217338b(view, i);
        Set set = this.f364959i;
        Integer valueOf = Integer.valueOf(i);
        set.add(valueOf);
        C57528m mVar = this.f364963m;
        if (mVar == null) {
            mVar = C57528m.UNKNOWN_SURFACE;
            C59052c cVar = (C59052c) f364951f.mo56225c();
            cVar.mo56379ah(new C59094n(40227));
            cVar.mo56386p("No surface set.");
        }
        Map map = this.f364956e;
        Duration duration = Duration.ZERO;
        C69664n.m101060f(duration, "ZERO");
        Map.EL.putIfAbsent(map, valueOf, new C133975a(duration, dVar, mVar));
    }

    /* renamed from: p */
    public final void mo111505p() {
        this.f364960j.clear();
        this.f364957g.ifPresent(C133982e.f364946a);
    }

    /* renamed from: q */
    public final void mo111506q(C60218r rVar) {
        C69664n.m101061g(rVar, "rootEventId");
    }

    /* renamed from: r */
    public final void mo111507r(ViewGroup viewGroup, C57528m mVar) {
        C69664n.m101061g(mVar, "surface");
        this.f364962l = viewGroup;
        this.f364963m = mVar;
    }

    /* renamed from: s */
    public final void mo111508s() {
        if (!C69664n.m101066l(this.f364961k, Instant.EPOCH)) {
            Duration between = Duration.between(this.f364961k, this.f364954c.mo57444a());
            for (Number intValue : this.f364960j) {
                int intValue2 = intValue.intValue();
                java.util.Map map = this.f364956e;
                Integer valueOf = Integer.valueOf(intValue2);
                if (map.containsKey(valueOf)) {
                    java.util.Map map2 = this.f364956e;
                    Object obj = map2.get(valueOf);
                    C69664n.m101058d(obj);
                    C133975a aVar = (C133975a) obj;
                    C69664n.m101060f(between, "duration");
                    C69664n.m101061g(between, "additionalDuration");
                    Duration plus = aVar.f364922a.plus(between);
                    C69664n.m101060f(plus, "duration + additionalDuration");
                    map2.put(valueOf, C133975a.m217301a(aVar, plus));
                } else {
                    C59052c cVar = (C59052c) f364951f.mo56226d();
                    cVar.mo56379ah(new C59094n(40230));
                    cVar.mo56387q("Missing content data for tracked contentKey=%s", intValue2);
                }
            }
            this.f364961k = Instant.EPOCH;
            mo111505p();
        }
    }
}
