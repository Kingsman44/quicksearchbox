package com.google.android.libraries.elements.p1714d;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import com.facebook.litho.C6176cx;
import com.facebook.litho.C6258fa;
import com.facebook.litho.C6276fs;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.C6564z;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.litho.p333i.C6396a;
import com.google.android.libraries.elements.C21366j;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;
import com.youtube.p5283a.p5284a.C68038aa;
import java.util.Map;

/* renamed from: com.google.android.libraries.elements.d.bi */
/* compiled from: PG */
public final class C20825bi extends C6407q {
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: A */
    C21357r f58334A;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: B */
    C21357r f58335B;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: C */
    C21357r f58336C;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: D */
    Map f58337D;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: E */
    C21296cl f58338E;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    C21313t f58339a;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    C21319z f58340b;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: c */
    C68038aa f58341c;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: d */
    boolean f58342d;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: e */
    boolean f58343e;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: f */
    C21259bb f58344f;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: g */
    C21357r f58345g;

    public C20825bi() {
        super("EditableTextMount");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo12793K() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final Object mo12797P(Context context) {
        return new C20809av(context, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo12802V(C6411u uVar, Object obj) {
        C20809av avVar = (C20809av) obj;
        TextWatcher textWatcher = avVar.f58263a;
        if (textWatcher != null) {
            avVar.addTextChangedListener(textWatcher);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo12803W(C6411u uVar, C6564z zVar) {
        C6258fa faVar = new C6258fa();
        C6258fa faVar2 = new C6258fa();
        faVar.f18496a = Integer.valueOf(zVar.mo12882H());
        faVar2.f18496a = Integer.valueOf(zVar.mo12901a());
        C20824bh bhVar = (C20824bh) this.f19000w;
        bhVar.f58333b = (Integer) faVar.f18496a;
        bhVar.f58332a = (Integer) faVar2.f18496a;
    }

    /* renamed from: X */
    public final void mo12804X(C6411u uVar, C6564z zVar, int i, int i2, C6276fs fsVar) {
        C6276fs fsVar2 = fsVar;
        C68038aa aaVar = this.f58341c;
        C21319z zVar2 = this.f58340b;
        C21296cl clVar = this.f58338E;
        C21259bb bbVar = this.f58344f;
        boolean z = this.f58342d;
        C21313t tVar = this.f58339a;
        Map map = this.f58337D;
        String y = aaVar.mo60089m() != null ? aaVar.mo60089m().mo60230y() : null;
        C20809av avVar = new C20809av(uVar.f19009b, true);
        avVar.mo25894b(aaVar, C20808au.m39058k((C21357r) null, (C21357r) null, (C21357r) null, (C21357r) null, clVar, bbVar, z, tVar, map, zVar2));
        if (y != null) {
            avVar.setText(y);
        }
        avVar.measure(C6396a.m17149a(i), C6396a.m17149a(i2));
        fsVar2.f18536b = avVar.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i) == 0) {
            fsVar2.f18535a = 0;
        } else {
            fsVar2.f18535a = Math.min(View.MeasureSpec.getSize(i), avVar.getMeasuredWidth());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo12805Y(C6411u uVar, Object obj) {
        C20809av avVar = (C20809av) obj;
        C68038aa aaVar = this.f58341c;
        C21357r rVar = this.f58334A;
        C21357r rVar2 = this.f58335B;
        C21357r rVar3 = this.f58345g;
        C21357r rVar4 = this.f58336C;
        C21296cl clVar = this.f58338E;
        C21259bb bbVar = this.f58344f;
        boolean z = this.f58342d;
        C21313t tVar = this.f58339a;
        C21319z zVar = this.f58340b;
        Map map = this.f58337D;
        int intValue = ((C20824bh) this.f19000w).f58333b.intValue();
        int intValue2 = ((C20824bh) this.f19000w).f58332a.intValue();
        avVar.setWidth(intValue);
        avVar.setHeight(intValue2);
        avVar.mo25894b(aaVar, C20808au.m39058k(rVar, rVar2, rVar3, rVar4, clVar, bbVar, z, tVar, map, zVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final void mo12806Z(C6411u uVar) {
        boolean z = this.f58342d;
        boolean z2 = this.f58343e;
        if (z && z2) {
            C21366j.m40408a(uVar.f19009b);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aB */
    public final void mo12808aB(Object obj) {
        C20809av avVar = (C20809av) obj;
        TextWatcher textWatcher = avVar.f58263a;
        if (textWatcher != null) {
            avVar.removeTextChangedListener(textWatcher);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public final boolean mo12815af() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: al */
    public final boolean mo12821al() {
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
        C20825bi biVar = (C20825bi) qVar;
        C20825bi biVar2 = (C20825bi) qVar2;
        return true;
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        C20825bi biVar = (C20825bi) qVar;
        C21313t tVar = this.f58339a;
        if (tVar == null ? biVar.f58339a != null : !tVar.equals(biVar.f58339a)) {
            return false;
        }
        C21319z zVar = this.f58340b;
        if (zVar == null ? biVar.f58340b != null : !zVar.equals(biVar.f58340b)) {
            return false;
        }
        C68038aa aaVar = this.f58341c;
        if (aaVar == null ? biVar.f58341c != null : !aaVar.equals(biVar.f58341c)) {
            return false;
        }
        if (this.f58342d != biVar.f58342d || this.f58343e != biVar.f58343e) {
            return false;
        }
        C21259bb bbVar = this.f58344f;
        if (bbVar == null ? biVar.f58344f != null : !bbVar.equals(biVar.f58344f)) {
            return false;
        }
        C21357r rVar = this.f58345g;
        if (rVar == null ? biVar.f58345g != null : !rVar.equals(biVar.f58345g)) {
            return false;
        }
        C21357r rVar2 = this.f58334A;
        if (rVar2 == null ? biVar.f58334A != null : !rVar2.equals(biVar.f58334A)) {
            return false;
        }
        C21357r rVar3 = this.f58335B;
        if (rVar3 == null ? biVar.f58335B != null : !rVar3.equals(biVar.f58335B)) {
            return false;
        }
        C21357r rVar4 = this.f58336C;
        if (rVar4 == null ? biVar.f58336C != null : !rVar4.equals(biVar.f58336C)) {
            return false;
        }
        Map map = this.f58337D;
        if (map == null ? biVar.f58337D != null : !map.equals(biVar.f58337D)) {
            return false;
        }
        C21296cl clVar = this.f58338E;
        return clVar == null ? biVar.f58338E == null : clVar.equals(biVar.f58338E);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C6407q mo13318j() {
        C20825bi biVar = (C20825bi) super.mo13318j();
        biVar.f19000w = new C20824bh();
        return biVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final /* synthetic */ C6176cx mo13459n() {
        return new C20824bh();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo13462r(C6176cx cxVar, C6176cx cxVar2) {
        C20824bh bhVar = (C20824bh) cxVar;
        C20824bh bhVar2 = (C20824bh) cxVar2;
        bhVar.f58332a = bhVar2.f58332a;
        bhVar.f58333b = bhVar2.f58333b;
    }
}
