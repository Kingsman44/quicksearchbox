package com.facebook.litho.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.C2129p;
import com.facebook.litho.C6095af;
import com.facebook.litho.C6128bi;
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
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.facebook.litho.widget.ej */
/* compiled from: PG */
public final class C6532ej extends C6407q {
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: A */
    public int f19445A = 1;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: B */
    public C6493cy f19446B;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: C */
    public boolean f19447C;
    @C6117a(mo12871a = 10)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    public C6407q f19448a;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    public boolean f19449b;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: c */
    public boolean f19450c;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: d */
    public boolean f19451d;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: e */
    public int f19452e;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: f */
    public boolean f19453f;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: g */
    public C2129p f19454g;

    public C6532ej() {
        super("VerticalScroll");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo12793K() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final Object mo12797P(Context context) {
        return (LithoScrollView) LayoutInflater.from(context).inflate(R.layout.litho_scroll_view, (ViewGroup) null, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo12799R(C6411u uVar) {
        C6281fx fxVar = new C6281fx();
        C6281fx fxVar2 = new C6281fx();
        C6407q qVar = this.f19448a;
        int i = this.f19452e;
        boolean z = this.f19451d;
        C6533ek ekVar = new C6533ek();
        ekVar.f19455a = i;
        fxVar.f18496a = ekVar;
        C6095af b = ComponentTree.m15673b(C6411u.m17308a(uVar), qVar);
        b.f17998d = z;
        fxVar2.f18496a = b.mo12841a();
        C6531ei eiVar = (C6531ei) this.f18999v;
        eiVar.f19444b = (C6533ek) fxVar.f18496a;
        eiVar.f19443a = (ComponentTree) fxVar2.f18496a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo12803W(C6411u uVar, C6564z zVar) {
        boolean z;
        C6407q qVar = this.f19448a;
        boolean z2 = this.f19450c;
        boolean z3 = this.f19449b;
        ComponentTree componentTree = ((C6531ei) this.f18999v).f19443a;
        C6530eh ehVar = (C6530eh) this.f19000w;
        Integer num = ehVar.f19442b;
        Integer num2 = ehVar.f19441a;
        int H = (zVar.mo12882H() - zVar.mo12879E()) - zVar.mo12880F();
        int a = (zVar.mo12901a() - zVar.mo12881G()) - zVar.mo12878D();
        if (num == null || num.intValue() != H) {
            z = z2;
        } else if (!z2) {
            return;
        } else {
            if (num2 == null || num2.intValue() != a) {
                z = true;
            } else {
                return;
            }
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(zVar.mo12882H(), 1073741824);
        C6534el.m17781a(uVar, makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(zVar.mo12901a(), 1073741824), new C6276fs(), componentTree, qVar, z, z3);
    }

    /* renamed from: X */
    public final void mo12804X(C6411u uVar, C6564z zVar, int i, int i2, C6276fs fsVar) {
        C6258fa faVar = new C6258fa();
        C6258fa faVar2 = new C6258fa();
        C6407q qVar = this.f19448a;
        boolean z = this.f19450c;
        boolean z2 = this.f19449b;
        C6534el.m17781a(uVar, i, i2, fsVar, ((C6531ei) this.f18999v).f19443a, qVar, z, z2);
        faVar.f18496a = Integer.valueOf(fsVar.f18535a);
        faVar2.f18496a = Integer.valueOf(fsVar.f18536b);
        C6530eh ehVar = (C6530eh) this.f19000w;
        ehVar.f19442b = (Integer) faVar.f18496a;
        ehVar.f19441a = (Integer) faVar2.f18496a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo12805Y(C6411u uVar, Object obj) {
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        boolean z = this.f19447C;
        boolean z2 = this.f19453f;
        boolean z3 = this.f19451d;
        C2129p pVar = this.f19454g;
        C6493cy cyVar = this.f19446B;
        int i = this.f19445A;
        C6531ei eiVar = (C6531ei) this.f18999v;
        ComponentTree componentTree = eiVar.f19443a;
        C6533ek ekVar = eiVar.f19444b;
        lithoScrollView.f19032e.mo12729B(componentTree);
        lithoScrollView.f19035h = z3;
        lithoScrollView.f19033f = ekVar;
        C6432ar arVar = new C6432ar(lithoScrollView, ekVar);
        lithoScrollView.getViewTreeObserver().addOnPreDrawListener(arVar);
        lithoScrollView.f19034g = arVar;
        if (cyVar != null) {
            lithoScrollView.f19036i = new C6551p();
            lithoScrollView.f19036i.f19515a = cyVar;
        }
        lithoScrollView.setScrollbarFadingEnabled(true);
        lithoScrollView.f6033c.mo5279a(z2);
        lithoScrollView.setVerticalFadingEdgeEnabled(false);
        lithoScrollView.setFadingEdgeLength(0);
        lithoScrollView.setVerticalScrollBarEnabled(z);
        lithoScrollView.f6034d = pVar;
        lithoScrollView.setOverScrollMode(i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo12810aa(C6411u uVar, Object obj) {
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        lithoScrollView.f6034d = null;
        lithoScrollView.f19032e.mo12729B((ComponentTree) null);
        lithoScrollView.f19033f = null;
        lithoScrollView.getViewTreeObserver().removeOnPreDrawListener(lithoScrollView.f19034g);
        lithoScrollView.f19034g = null;
        C6551p pVar = lithoScrollView.f19036i;
        if (pVar != null) {
            pVar.f19515a = null;
            lithoScrollView.f19036i = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo12812ac(C6279fv fvVar, C6279fv fvVar2) {
        C6531ei eiVar = (C6531ei) fvVar;
        C6531ei eiVar2 = (C6531ei) fvVar2;
        eiVar2.f19443a = eiVar.f19443a;
        eiVar2.f19444b = eiVar.f19444b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public final boolean mo12815af() {
        return true;
    }

    /* renamed from: ah */
    public final boolean mo12817ah() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ai */
    public final boolean mo12818ai() {
        return true;
    }

    /* renamed from: am */
    public final boolean mo12822am() {
        return true;
    }

    /* renamed from: ao */
    public final int mo12824ao() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public final boolean mo12828as(C6407q qVar, C6407q qVar2) {
        C6407q qVar3;
        boolean z;
        C6532ej ejVar = (C6532ej) qVar;
        C6532ej ejVar2 = (C6532ej) qVar2;
        Boolean bool = null;
        if (ejVar == null) {
            qVar3 = null;
        } else {
            qVar3 = ejVar.f19448a;
        }
        C6128bi biVar = new C6128bi(qVar3, ejVar2.f19448a);
        C6128bi biVar2 = new C6128bi(ejVar == null ? null : Boolean.valueOf(ejVar.f19447C), Boolean.valueOf(ejVar2.f19447C));
        if (ejVar == null) {
            z = null;
        } else {
            z = true;
        }
        C6128bi biVar3 = new C6128bi(z, true);
        C6128bi biVar4 = new C6128bi(ejVar == null ? null : Boolean.valueOf(ejVar.f19450c), Boolean.valueOf(ejVar2.f19450c));
        C6128bi biVar5 = new C6128bi(ejVar == null ? null : Boolean.valueOf(ejVar.f19453f), Boolean.valueOf(ejVar2.f19453f));
        if (ejVar != null) {
            bool = Boolean.valueOf(ejVar.f19451d);
        }
        C6128bi biVar6 = new C6128bi(bool, Boolean.valueOf(ejVar2.f19451d));
        if (!((C6407q) biVar.f18143a).mo13057a((C6407q) biVar.f18144b) || !((Boolean) biVar2.f18143a).equals(biVar2.f18144b) || !((Boolean) biVar3.f18143a).equals(biVar3.f18144b) || !((Boolean) biVar4.f18143a).equals(biVar4.f18144b) || !((Boolean) biVar5.f18143a).equals(biVar5.f18144b) || !((Boolean) biVar6.f18143a).equals(biVar6.f18144b)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        C6532ej ejVar = (C6532ej) qVar;
        C6407q qVar2 = this.f19448a;
        if (qVar2 == null ? ejVar.f19448a != null : !qVar2.mo13057a(ejVar.f19448a)) {
            return false;
        }
        if (this.f19449b != ejVar.f19449b || this.f19450c != ejVar.f19450c || this.f19451d != ejVar.f19451d || this.f19452e != ejVar.f19452e || this.f19453f != ejVar.f19453f) {
            return false;
        }
        C2129p pVar = this.f19454g;
        if (pVar == null ? ejVar.f19454g != null : !pVar.equals(ejVar.f19454g)) {
            return false;
        }
        if (this.f19445A != ejVar.f19445A) {
            return false;
        }
        C6493cy cyVar = this.f19446B;
        if (cyVar == null ? ejVar.f19446B == null : cyVar.equals(ejVar.f19446B)) {
            return this.f19447C == ejVar.f19447C;
        }
        return false;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C6407q mo13318j() {
        C6532ej ejVar = (C6532ej) super.mo13318j();
        C6407q qVar = ejVar.f19448a;
        ejVar.f19448a = qVar != null ? qVar.mo13318j() : null;
        ejVar.f18999v = new C6531ei();
        ejVar.f19000w = new C6530eh();
        return ejVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final /* synthetic */ C6176cx mo13459n() {
        return new C6530eh();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final /* synthetic */ C6279fv mo13319o() {
        return new C6531ei();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo13462r(C6176cx cxVar, C6176cx cxVar2) {
        C6530eh ehVar = (C6530eh) cxVar;
        C6530eh ehVar2 = (C6530eh) cxVar2;
        ehVar.f19441a = ehVar2.f19441a;
        ehVar.f19442b = ehVar2.f19442b;
    }
}
