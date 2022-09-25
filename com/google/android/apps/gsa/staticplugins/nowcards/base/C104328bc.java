package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.p097i.C1970e;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.cards.C91692g;
import com.google.android.apps.gsa.sidekick.shared.cards.C91702q;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105051i;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9180bp;
import com.google.android.apps.p489g.p494d.C9215cx;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7845mb;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.bc */
/* compiled from: PG */
public final class C104328bc extends C104311am {

    /* renamed from: c */
    private static final C59071e f290236c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.base.bc");

    /* renamed from: d */
    private final C104348l f290237d;

    /* renamed from: e */
    private final boolean f290238e;

    /* renamed from: f */
    private final C91671j f290239f;

    /* renamed from: g */
    private final C91702q f290240g;

    public C104328bc(Context context, C91692g gVar, C104348l lVar, C91671j jVar, boolean z) {
        super(context, gVar, lVar);
        this.f290239f = jVar;
        this.f290237d = lVar;
        C7718hj hjVar = lVar.f290310e.f32174H;
        this.f290240g = new C91702q(context, hjVar == null ? C7718hj.f26927af : hjVar, gVar);
        this.f290238e = z;
    }

    /* renamed from: a */
    public final void mo86194a(Intent intent) {
        this.f290240g.mo86194a(intent);
    }

    /* renamed from: d */
    public final void mo86197d(Intent intent) {
        this.f290240g.mo86197d(intent);
    }

    /* renamed from: g */
    public final boolean mo86200g(C9141ad adVar) {
        if (!super.mo86200g(adVar)) {
            return this.f290240g.mo86200g(adVar);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo94057h(C9141ad adVar) {
        C59104x c = f290236c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LMPClientActionHandler");
        ((C59052c) ((C59052c) c).mo56372aa(21946)).mo56386p("handleAdDismissSurvey not implemented for legacy.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo94058i(C9141ad adVar) {
        C59104x c = f290236c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LMPClientActionHandler");
        ((C59052c) ((C59052c) c).mo56372aa(21947)).mo56386p("handleBilingualOptOut not implemented for legacy.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo94059j(C9141ad adVar) {
        int i;
        View view;
        C9180bp bpVar = adVar.f31544j;
        if (bpVar == null) {
            bpVar = C9180bp.f31701b;
        }
        this.f290239f.mo86102q(this.f290237d);
        C104310al alVar = (C104310al) this.f290239f;
        C62971cq<C9278v> cqVar = bpVar.f31703a;
        HashSet hashSet = new HashSet();
        for (C9278v E : cqVar) {
            hashSet.add(Long.valueOf(C104307ai.m172339E(E)));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = alVar.f290133d;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            C104348l lVar = (C104348l) arrayList2.get(i2);
            if (hashSet.contains(Long.valueOf(C104307ai.m172339E(lVar.f290310e)))) {
                arrayList.add(lVar);
            }
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            alVar.f290133d.remove((C104348l) arrayList.get(i3));
        }
        C9278v v = alVar.mo94011v(this.f255778a, bpVar.f31703a);
        if (v != null) {
            alVar.mo94046H(this.f255778a, v, this.f290239f.mo86099n());
        }
        this.f255779b.mo86187x();
        ViewGroup p = this.f290239f.mo86101p();
        C7718hj g = this.f290239f.mo86085g();
        if (g == null || (g.f26955a & C89885b.HTTP_VALUE) == 0) {
            i = 0;
        } else {
            C7845mb mbVar = g.f26982w;
            if (mbVar == null) {
                mbVar = C7845mb.f27493p;
            }
            i = mbVar.f27498d;
        }
        if (!(p == null || (view = (View) p.getParent()) == null)) {
            view.setAccessibilityDelegate(new C104321aw(i));
            TextView textView = (TextView) view.findViewById(R.id.cluster_title);
            if (textView != null) {
                C2043bi.m5526T(textView, new C104327bb(false));
            }
        }
        this.f290239f.mo86103r(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo94060k(C9141ad adVar) {
        View view;
        C7718hj[] hjVarArr;
        C9180bp bpVar = adVar.f31544j;
        if (bpVar == null) {
            bpVar = C9180bp.f31701b;
        }
        this.f290239f.mo86102q(this.f290237d);
        this.f290239f.mo86105t(new ArrayList(bpVar.f31703a));
        C104310al alVar = (C104310al) this.f290239f;
        C9278v L = alVar.mo94051L(this.f255778a, bpVar.f31703a);
        if (L != null) {
            alVar.mo94046H(this.f255778a, L, this.f290239f.mo86099n());
        }
        this.f290239f.mo86103r(true);
        ViewGroup p = this.f290239f.mo86101p();
        C1970e c = this.f290239f.mo86081c();
        int i = 0;
        if (!(c == null || (hjVarArr = (C7718hj[]) c.f5889b) == null)) {
            i = hjVarArr.length;
        }
        if (p != null && (view = (View) p.getParent()) != null) {
            view.setAccessibilityDelegate(new C104321aw(i));
            TextView textView = (TextView) view.findViewById(R.id.cluster_title);
            if (textView != null) {
                C2043bi.m5526T(textView, new C104327bb(true));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo94061l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo94062m(C9141ad adVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo94063n(C9141ad adVar) {
        C59104x c = f290236c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LMPClientActionHandler");
        ((C59052c) ((C59052c) c).mo56372aa(21948)).mo56386p("handleReportContent not implemented for legacy.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo94064o(C9141ad adVar) {
        C59104x c = f290236c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LMPClientActionHandler");
        ((C59052c) ((C59052c) c).mo56372aa(21949)).mo56386p("handleSaveForLater not implemented for legacy.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo94065p(C9141ad adVar) {
        int i;
        if (this.f290238e) {
            i = this.f255778a.getResources().getColor(R.color.quantum_white_100);
        } else {
            i = this.f290239f.mo86098m();
        }
        boolean z = this.f290238e;
        C7718hj hjVar = this.f290237d.f290310e.f32174H;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        super.mo94066q(adVar, i, z, hjVar.f26947S);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo94067r(C9141ad adVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo94068s() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo94069t(C9141ad adVar) {
        C59104x c = f290236c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LMPClientActionHandler");
        ((C59052c) ((C59052c) c).mo56372aa(21950)).mo56386p("handleWhyThisAdDialog not implemented for legacy.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo94071v(C9215cx cxVar) {
        C91097g b = this.f255779b.mo86163c().mo86021b();
        if (b != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(cxVar.f31848j));
            intent.setFlags(268435456);
            b.mo65089a(intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo94072w() {
        C91097g b = this.f255779b.mo86163c().mo86021b();
        if (b == null) {
            C59104x c = f290236c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LMPClientActionHandler");
            ((C59052c) ((C59052c) c).mo56372aa(21951)).mo56386p("Tried to open video settings but the intentStarter was null.");
            return;
        }
        b.mo65089a(C105051i.m174275a());
    }
}
