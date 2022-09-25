package com.google.android.libraries.lens.view.p2133i.p2136c;

import android.content.Context;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import com.android.p265e.C5114a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2056af.C25048at;
import com.google.android.libraries.lens.view.p2078at.C25515au;
import com.google.android.libraries.lens.view.p2133i.C26926k;
import com.google.android.libraries.lens.view.p2133i.C26928m;
import com.google.android.libraries.lens.view.p2133i.C26932q;
import com.google.android.libraries.lens.view.p2133i.C26935t;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26897b;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58336bg;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58710pc;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58740qf;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4707j.C62575i;
import com.google.lens.p4707j.C62584r;
import com.google.lens.p4707j.C62586t;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protobuf.p4750c.C62953e;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.i.c.e */
/* compiled from: PG */
public final class C26909e implements C26913i {

    /* renamed from: a */
    private static final C58974d f73343a = C58974d.m91135i("CloudCopyManagerImpl");

    /* renamed from: b */
    private final Context f73344b;

    /* renamed from: c */
    private final C68214a f73345c;

    /* renamed from: d */
    private final C68214a f73346d;

    /* renamed from: e */
    private C58833ax f73347e = C58836b.f156633a;

    /* renamed from: f */
    private C63042fg f73348f = C62953e.f169990a;

    /* renamed from: g */
    private C58485gu f73349g = C58485gu.m89845m();

    /* renamed from: h */
    private Map f73350h = new HashMap();

    /* renamed from: i */
    private String f73351i;

    /* renamed from: j */
    private C26912h f73352j;

    /* renamed from: k */
    private final C25048at f73353k;

    public C26909e(Context context, C68214a aVar, C68214a aVar2, C25048at atVar) {
        this.f73344b = context;
        this.f73345c = aVar;
        this.f73346d = aVar2;
        this.f73353k = atVar;
    }

    /* renamed from: p */
    private static C58485gu m49825p(Iterable iterable) {
        return C58485gu.m89836F(new C58740qf(new C58336bg(C26908d.f73342a, C58710pc.m90487d(C62953e.m95489n()))), iterable);
    }

    /* renamed from: q */
    private final int m49826q(C62586t tVar) {
        C63042fg fgVar = tVar.f168977c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        if (!C62950b.m95474e(fgVar).isAfter(C62950b.m95474e(this.f73348f))) {
            return 1;
        }
        C58485gu p = m49825p(tVar.f168975a);
        C58485gu p2 = m49825p(tVar.f168976b);
        C58480gp e = C58485gu.m89837e();
        HashMap hashMap = new HashMap();
        int size = p.size();
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C62584r rVar = (C62584r) p.get(i2);
            String str = rVar.f168968a;
            C26916l lVar = (C26916l) this.f73350h.get(str);
            C26906b bVar = new C26906b();
            bVar.mo32286b(rVar);
            if (lVar == null || !(lVar.mo32288a() == C26897b.READY_TO_SEND || lVar.mo32288a() == C26897b.SENDING)) {
                bVar.mo32287c(C26897b.READY_TO_SEND);
                i = 3;
            } else {
                bVar.mo32287c(lVar.mo32288a());
            }
            e.mo55395g(str);
            hashMap.put(str, bVar.mo32285a());
        }
        int size2 = p2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C62584r rVar2 = (C62584r) p2.get(i3);
            String str2 = rVar2.f168968a;
            C26916l lVar2 = (C26916l) this.f73350h.get(str2);
            C26906b bVar2 = new C26906b();
            bVar2.mo32286b(rVar2);
            if (lVar2 == null || !(lVar2.mo32288a() == C26897b.NOT_ELIGIBLE || lVar2.mo32288a() == C26897b.SENDING)) {
                bVar2.mo32287c(C26897b.NOT_ELIGIBLE);
                i = 3;
            } else {
                bVar2.mo32287c(lVar2.mo32288a());
            }
            e.mo55395g(str2);
            hashMap.put(str2, bVar2.mo32285a());
        }
        C63042fg fgVar2 = tVar.f168977c;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        this.f73348f = fgVar2;
        this.f73350h = hashMap;
        int i4 = ((C58724pq) this.f73349g).f156474d;
        C58485gu f = e.mo55394f();
        this.f73349g = f;
        if (i4 != ((C58724pq) f).f156474d) {
            return 3;
        }
        return i;
    }

    /* renamed from: a */
    public final int mo32270a() {
        return ((C58724pq) this.f73349g).f156474d;
    }

    /* renamed from: b */
    public final void mo32271b() {
        C26912h hVar = this.f73352j;
        if (hVar != null) {
            ((C26928m) hVar).mo32309a((C26911g) this.f73347e.mo56109e(C26911g.f73354a), 1);
        }
        this.f73347e = C58836b.f156633a;
    }

    /* renamed from: c */
    public final void mo32272c(C62586t tVar) {
        int q = m49826q(tVar);
        if (q != 1) {
            this.f73353k.mo30240a(((C26911g) this.f73347e.mo56109e(C26911g.f73354a)).mo32281b(), ((C58724pq) this.f73349g).f156474d);
        }
        C26912h hVar = this.f73352j;
        if (hVar != null) {
            hVar.mo32300b((C26911g) this.f73347e.mo56109e(C26911g.f73354a), q);
        }
        this.f73347e = C58836b.f156633a;
    }

    /* renamed from: d */
    public final boolean mo32273d() {
        return Instant.now().minus(Duration.ofMillis(10000)).isAfter(C62950b.m95474e(this.f73348f));
    }

    /* renamed from: e */
    public final boolean mo32274e(String str, C26897b bVar) {
        if (!this.f73350h.containsKey(str)) {
            return false;
        }
        C26916l lVar = (C26916l) this.f73350h.get(str);
        lVar.getClass();
        if (lVar.mo32288a() == bVar) {
            return false;
        }
        Map map = this.f73350h;
        C26915k b = lVar.mo32289b();
        b.mo32287c(bVar);
        map.put(str, b.mo32285a());
        C26912h hVar = this.f73352j;
        if (hVar == null) {
            return true;
        }
        int indexOf = this.f73349g.indexOf(str);
        C26935t tVar = ((C26928m) hVar).f73368a.f73397l;
        if (tVar == null) {
            return true;
        }
        tVar.notifyItemChanged(indexOf, bVar);
        return true;
    }

    /* renamed from: f */
    public final boolean mo32275f(int i) {
        if (this.f73347e.mo56113h()) {
            return false;
        }
        this.f73347e = C58833ax.m90834k(C26911g.m49844c(i, Instant.now()));
        return true;
    }

    /* renamed from: h */
    public final void mo32277h(String str, String str2, int i) {
        if (!mo32274e(str, C26897b.READY_TO_SEND)) {
            ((C58970a) ((C58970a) f73343a.mo56225c()).mo56372aa(49271)).mo56386p("Failed to update device state");
        }
        C26912h hVar = this.f73352j;
        if (hVar != null) {
            C26928m mVar = (C26928m) hVar;
            boolean o = mVar.f73368a.f73391f.mo32299o(C26926k.f73366a);
            C26932q qVar = mVar.f73368a;
            if (o && !qVar.f73389d.getParentFragmentManager().mo461ab()) {
                qVar.mo32316a();
            }
        }
        String a = C5114a.m13987a(this.f73344b, R.string.lens_cloud_copy_success_toast_message, "PAYLOAD_TYPE", C62575i.m94798a(i), "DEVICE_NAME", str2);
        if (((FragmentManager) this.f73345c.mo27525b()).f634a.mo671c("device_picker_fragment_tag") != null) {
            this.f73351i = a;
        } else {
            ((C25515au) this.f73346d.mo27525b()).mo30544X(a, -1);
        }
    }

    /* renamed from: i */
    public final void mo32278i(String str, int i) {
        if (!mo32274e(str, C26897b.READY_TO_SEND)) {
            ((C58970a) ((C58970a) f73343a.mo56225c()).mo56372aa(49270)).mo56386p("Failed to update device state");
        }
        mo32276g(C5114a.m13987a(this.f73344b, R.string.lens_cloud_copy_failure_toast_message, "PAYLOAD_TYPE", C62575i.m94798a(i)));
    }

    /* renamed from: j */
    public final C58833ax mo32294j(String str) {
        return C58833ax.m90833j((C26916l) this.f73350h.get(str));
    }

    /* renamed from: k */
    public final String mo32295k(int i) {
        return (String) this.f73349g.get(i);
    }

    /* renamed from: l */
    public final void mo32296l() {
        if (this.f73351i != null) {
            String str = this.f73351i;
            str.getClass();
            ((C25515au) this.f73346d.mo27525b()).mo30544X(str, -1);
            this.f73351i = null;
        }
    }

    /* renamed from: m */
    public final void mo32297m(C26912h hVar) {
        this.f73352j = hVar;
    }

    /* renamed from: n */
    public final void mo32298n(C62586t tVar) {
        int q = m49826q(tVar);
        if (q != 1) {
            this.f73353k.mo30240a(4, ((C58724pq) this.f73349g).f156474d);
        }
        C26912h hVar = this.f73352j;
        if (hVar != null) {
            hVar.mo32300b(C26911g.m49844c(4, Instant.now()), q);
        }
    }

    /* renamed from: o */
    public final boolean mo32299o(Predicate predicate) {
        return Collection.EL.stream(this.f73350h.values()).allMatch(predicate);
    }

    /* renamed from: g */
    public final void mo32276g(String str) {
        View view;
        C26912h hVar = this.f73352j;
        if (hVar == null || (view = ((C26928m) hVar).f73368a.f73389d.getView()) == null) {
            ((C25515au) this.f73346d.mo27525b()).mo30544X(str, -1);
        } else {
            Snackbar.m79661q((Context) null, view, str, -1).mo48343h();
        }
    }
}
