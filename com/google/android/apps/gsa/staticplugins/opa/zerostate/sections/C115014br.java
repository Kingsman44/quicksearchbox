package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114618ac;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114624ai;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114641ay;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114660bq;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114677cg;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114679e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8635i.C114773b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114796at;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114893y;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.br */
/* compiled from: PG */
public class C115014br implements C114757k {

    /* renamed from: a */
    public static final C59071e f319225a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.br");

    /* renamed from: b */
    public final Context f319226b;

    /* renamed from: c */
    public final C87546b f319227c;

    /* renamed from: d */
    public final C115017bu f319228d;

    /* renamed from: e */
    public final C114677cg f319229e;

    /* renamed from: f */
    public final C114641ay f319230f;

    /* renamed from: g */
    public final C114679e f319231g;

    /* renamed from: h */
    public final C114624ai f319232h;

    /* renamed from: i */
    public final C114618ac f319233i;

    /* renamed from: j */
    public final C114660bq f319234j;

    /* renamed from: k */
    public final C91097g f319235k;

    /* renamed from: l */
    public final List f319236l = new ArrayList();

    /* renamed from: m */
    public final C86124t f319237m;

    /* renamed from: n */
    public final C108226ax f319238n;

    /* renamed from: o */
    public final C114893y f319239o;

    /* renamed from: p */
    public final C114796at f319240p;

    /* renamed from: q */
    public final C53306j f319241q;

    /* renamed from: r */
    public final C114773b f319242r;

    /* renamed from: s */
    public final C87571n f319243s;

    /* renamed from: t */
    public final List f319244t = new ArrayList();

    /* renamed from: u */
    public C28293k f319245u;

    /* renamed from: v */
    private final C58881cr f319246v;

    /* renamed from: w */
    private final C114839ci f319247w;

    public C115014br(Context context, C114679e eVar, C114624ai aiVar, C114618ac acVar, C114677cg cgVar, C114641ay ayVar, C114660bq bqVar, C115017bu buVar, C86124t tVar, C87546b bVar, C91097g gVar, C108226ax axVar, C114893y yVar, C114796at atVar, C114839ci ciVar, C114773b bVar2, C87571n nVar, C53306j jVar) {
        this.f319226b = context;
        this.f319228d = buVar;
        this.f319227c = bVar;
        this.f319231g = eVar;
        this.f319232h = aiVar;
        this.f319233i = acVar;
        this.f319229e = cgVar;
        this.f319230f = ayVar;
        this.f319234j = bqVar;
        this.f319235k = gVar;
        this.f319238n = axVar;
        this.f319239o = yVar;
        this.f319240p = atVar;
        this.f319247w = ciVar;
        this.f319237m = tVar;
        this.f319242r = bVar2;
        this.f319243s = nVar;
        this.f319241q = jVar;
        this.f319246v = mo101814h();
    }

    /* renamed from: a */
    public final View mo101577a() {
        C58976aa aaVar = C58975e.f156826a;
        return (View) this.f319246v.mo6453a();
    }

    /* renamed from: b */
    public final C114750d mo101578b(int i) {
        try {
            return (C114750d) this.f319236l.get(i);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final C28293k mo101579c() {
        if (this.f319245u == null) {
            View view = (View) this.f319246v.mo6453a();
        }
        return this.f319245u;
    }

    /* renamed from: d */
    public final void mo101580d() {
        C58976aa aaVar = C58975e.f156826a;
        for (C114750d e : this.f319236l) {
            e.mo101467e();
        }
    }

    /* renamed from: e */
    public final void mo101581e() {
        TextView textView = (TextView) mo101577a().findViewById(R.id.generic_stacked_cards_section_title);
        if (textView.getVisibility() == 8 && textView.getText().length() > 0) {
            this.f319247w.mo101649b(textView).start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101582f() {
        /*
            r5 = this;
            android.view.View r0 = r5.mo101577a()
            r1 = 2131431207(0x7f0b0f27, float:1.8484137E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 != r2) goto L_0x0016
            return
        L_0x0016:
            java.util.List r1 = r5.f319236l
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0035
            java.lang.Object r3 = r1.next()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.d r3 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d) r3
            boolean r4 = r3 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114778ab
            if (r4 == 0) goto L_0x0034
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ab r3 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114778ab) r3
            boolean r3 = r3.mo101493m()
            if (r3 != 0) goto L_0x001c
        L_0x0034:
            return
        L_0x0035:
            android.view.View r1 = r5.mo101577a()
            r3 = 2131431205(0x7f0b0f25, float:1.8484133E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r1 = r1.getVisibility()
            if (r1 == r2) goto L_0x0049
            return
        L_0x0049:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ci r1 = r5.f319247w
            android.animation.AnimatorSet r0 = r1.mo101650c(r0)
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115014br.mo101582f():void");
    }

    /* renamed from: g */
    public final void mo101583g(C58833ax axVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C58881cr mo101814h() {
        return mo101815j(R.layout.generic_stacked_cards_section_view, true != this.f319237m.mo79746e(C90014bt.f247289eO) ? R.layout.zero_state_card_container : R.layout.zero_state_card_container_v2);
    }

    /* renamed from: i */
    public final /* synthetic */ void mo101584i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C58881cr mo101815j(int i, int i2) {
        return C58886cw.m90973a(new C115011bo(this, i, i2));
    }
}
