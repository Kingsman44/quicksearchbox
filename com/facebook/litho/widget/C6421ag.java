package com.facebook.litho.widget;

import android.content.Context;
import android.view.View;
import com.facebook.litho.C6095af;
import com.facebook.litho.C6176cx;
import com.facebook.litho.C6258fa;
import com.facebook.litho.C6276fs;
import com.facebook.litho.C6279fv;
import com.facebook.litho.C6281fx;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.C6564z;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.yoga.C6570f;
import com.google.android.libraries.elements.p1714d.C20925du;

/* renamed from: com.facebook.litho.widget.ag */
/* compiled from: PG */
public final class C6421ag extends C6407q {
    @C6117a(mo12871a = 10)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    public C6407q f19058a;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    public boolean f19059b;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: c */
    public int f19060c = -1;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: d */
    public int f19061d = 1;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: e */
    public C6493cy f19062e;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.BOOL)

    /* renamed from: f */
    public boolean f19063f = true;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: g */
    public C20925du f19064g;

    public C6421ag() {
        super("HorizontalScroll");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo12793K() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final Object mo12797P(Context context) {
        return new C6423ai(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo12799R(C6411u uVar) {
        C6281fx fxVar = new C6281fx();
        C6281fx fxVar2 = new C6281fx();
        C6407q qVar = this.f19058a;
        fxVar.f18496a = new C6424aj(this.f19060c);
        C6095af b = ComponentTree.m15673b(C6411u.m17308a(uVar), qVar);
        b.f17998d = false;
        fxVar2.f18496a = b.mo12841a();
        C6420af afVar = (C6420af) this.f18999v;
        afVar.f19057b = (C6424aj) fxVar.f18496a;
        afVar.f19056a = (ComponentTree) fxVar2.f18496a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo12803W(C6411u uVar, C6564z zVar) {
        C6258fa faVar = new C6258fa();
        C6258fa faVar2 = new C6258fa();
        C6258fa faVar3 = new C6258fa();
        C6407q qVar = this.f19058a;
        boolean z = this.f19059b;
        ComponentTree componentTree = ((C6420af) this.f18999v).f19056a;
        C6419ae aeVar = (C6419ae) this.f19000w;
        Integer num = aeVar.f19055e;
        Integer num2 = aeVar.f19054d;
        int H = (zVar.mo12882H() - zVar.mo12879E()) - zVar.mo12880F();
        if (num == null || num2 == null) {
            C6276fs fsVar = new C6276fs();
            componentTree.mo12721p(qVar, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(zVar.mo12901a(), 1073741824), fsVar);
            int i = fsVar.f18535a;
            if (true != z) {
                H = 0;
            }
            int max = Math.max(i, H);
            int i2 = fsVar.f18536b;
            faVar.f18496a = Integer.valueOf(max);
            faVar2.f18496a = Integer.valueOf(i2);
        } else {
            int intValue = num.intValue();
            if (true != z) {
                H = 0;
            }
            faVar.f18496a = Integer.valueOf(Math.max(intValue, H));
            faVar2.f18496a = num2;
        }
        faVar3.f18496a = zVar.mo12886L();
        C6419ae aeVar2 = (C6419ae) this.f19000w;
        aeVar2.f19052b = (Integer) faVar.f18496a;
        aeVar2.f19051a = (Integer) faVar2.f18496a;
        aeVar2.f19053c = (C6570f) faVar3.f18496a;
    }

    /* renamed from: X */
    public final void mo12804X(C6411u uVar, C6564z zVar, int i, int i2, C6276fs fsVar) {
        C6258fa faVar = new C6258fa();
        C6258fa faVar2 = new C6258fa();
        C6407q qVar = this.f19058a;
        ComponentTree componentTree = ((C6420af) this.f18999v).f19056a;
        C6276fs fsVar2 = new C6276fs();
        componentTree.mo12721p(qVar, View.MeasureSpec.makeMeasureSpec(0, 0), i2, fsVar2);
        int i3 = fsVar2.f18535a;
        int i4 = fsVar2.f18536b;
        faVar.f18496a = Integer.valueOf(i3);
        faVar2.f18496a = Integer.valueOf(i4);
        if (View.MeasureSpec.getMode(i) != 0) {
            i3 = View.MeasureSpec.getSize(i);
        }
        fsVar.f18535a = i3;
        fsVar.f18536b = i4;
        C6419ae aeVar = (C6419ae) this.f19000w;
        aeVar.f19055e = (Integer) faVar.f18496a;
        aeVar.f19054d = (Integer) faVar2.f18496a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo12805Y(C6411u uVar, Object obj) {
        C6423ai aiVar = (C6423ai) obj;
        boolean z = this.f19063f;
        C20925du duVar = this.f19064g;
        C6493cy cyVar = this.f19062e;
        int i = this.f19061d;
        C6420af afVar = (C6420af) this.f18999v;
        C6424aj ajVar = afVar.f19057b;
        ComponentTree componentTree = afVar.f19056a;
        int intValue = ((C6419ae) this.f19000w).f19052b.intValue();
        int intValue2 = ((C6419ae) this.f19000w).f19051a.intValue();
        C6570f fVar = ((C6419ae) this.f19000w).f19053c;
        aiVar.setHorizontalScrollBarEnabled(z);
        aiVar.setOverScrollMode(i);
        aiVar.f19068a.mo12729B(componentTree);
        aiVar.f19071d = ajVar;
        aiVar.f19072e = duVar;
        aiVar.f19069b = intValue;
        aiVar.f19070c = intValue2;
        if (cyVar != null) {
            aiVar.f19073f = new C6551p();
            aiVar.f19073f.f19515a = cyVar;
        }
        aiVar.getViewTreeObserver().addOnPreDrawListener(new C6422ah(aiVar, ajVar, fVar));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo12810aa(C6411u uVar, Object obj) {
        C6423ai aiVar = (C6423ai) obj;
        aiVar.f19068a.mo12729B((ComponentTree) null);
        aiVar.f19069b = 0;
        aiVar.f19070c = 0;
        aiVar.f19071d = null;
        aiVar.f19072e = null;
        aiVar.setScrollX(0);
        C6551p pVar = aiVar.f19073f;
        if (pVar != null) {
            pVar.f19515a = null;
            aiVar.f19073f = null;
        }
        aiVar.setScrollX(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo12812ac(C6279fv fvVar, C6279fv fvVar2) {
        C6420af afVar = (C6420af) fvVar;
        C6420af afVar2 = (C6420af) fvVar2;
        afVar2.f19056a = afVar.f19056a;
        afVar2.f19057b = afVar.f19057b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public final boolean mo12815af() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ai */
    public final boolean mo12818ai() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: al */
    public final boolean mo12821al() {
        return true;
    }

    /* renamed from: ao */
    public final int mo12824ao() {
        return 3;
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        C6421ag agVar = (C6421ag) qVar;
        C6407q qVar2 = this.f19058a;
        if (qVar2 == null ? agVar.f19058a != null : !qVar2.mo13057a(agVar.f19058a)) {
            return false;
        }
        if (this.f19059b != agVar.f19059b || this.f19060c != agVar.f19060c) {
            return false;
        }
        C20925du duVar = this.f19064g;
        if (duVar == null ? agVar.f19064g != null : !duVar.equals(agVar.f19064g)) {
            return false;
        }
        if (this.f19061d != agVar.f19061d) {
            return false;
        }
        C6493cy cyVar = this.f19062e;
        if (cyVar == null ? agVar.f19062e == null : cyVar.equals(agVar.f19062e)) {
            return this.f19063f == agVar.f19063f;
        }
        return false;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C6407q mo13318j() {
        C6421ag agVar = (C6421ag) super.mo13318j();
        C6407q qVar = agVar.f19058a;
        agVar.f19058a = qVar != null ? qVar.mo13318j() : null;
        agVar.f18999v = new C6420af();
        agVar.f19000w = new C6419ae();
        return agVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final /* synthetic */ C6176cx mo13459n() {
        return new C6419ae();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final /* synthetic */ C6279fv mo13319o() {
        return new C6420af();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo13462r(C6176cx cxVar, C6176cx cxVar2) {
        C6419ae aeVar = (C6419ae) cxVar;
        C6419ae aeVar2 = (C6419ae) cxVar2;
        aeVar.f19051a = aeVar2.f19051a;
        aeVar.f19052b = aeVar2.f19052b;
        aeVar.f19053c = aeVar2.f19053c;
        aeVar.f19054d = aeVar2.f19054d;
        aeVar.f19055e = aeVar2.f19055e;
    }
}
