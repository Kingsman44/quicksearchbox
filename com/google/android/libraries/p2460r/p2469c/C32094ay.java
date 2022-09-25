package com.google.android.libraries.p2460r.p2469c;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import com.google.android.libraries.p2460r.p2464b.p2468d.C32056a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32059b;
import com.google.android.libraries.p2460r.p2469c.p2471b.C32100d;
import com.google.android.libraries.p2460r.p2469c.p2471b.C32110n;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57408cf;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57410ch;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57448ds;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57450du;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57452dw;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57454dy;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57459ec;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57463eg;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57465ei;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57467ek;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57469em;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57471eo;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57472ep;

/* renamed from: com.google.android.libraries.r.c.ay */
/* compiled from: PG */
final class C32094ay {

    /* renamed from: a */
    public static final float[] f86173a = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: b */
    public final C57472ep f86174b;

    /* renamed from: c */
    public final C32059b f86175c;

    public C32094ay(C32059b bVar) {
        this.f86174b = C57472ep.f153516y;
        this.f86175c = bVar;
    }

    public C32094ay(C57472ep epVar, C32059b bVar) {
        this.f86174b = epVar;
        this.f86175c = bVar;
    }

    /* renamed from: l */
    private final int m59785l(int i) {
        if (!mo37880i()) {
            return 0;
        }
        C57454dy dyVar = this.f86174b.f153531o;
        if (dyVar == null) {
            dyVar = C57454dy.f153470d;
        }
        if (dyVar.f153472a != 0) {
            C57454dy dyVar2 = this.f86174b.f153531o;
            if (dyVar2 == null) {
                dyVar2 = C57454dy.f153470d;
            }
            if (((i - 1) & dyVar2.f153472a) == 0) {
                return 0;
            }
        }
        C57454dy dyVar3 = this.f86174b.f153531o;
        if (dyVar3 == null) {
            dyVar3 = C57454dy.f153470d;
        }
        return dyVar3.f153474c;
    }

    /* renamed from: a */
    public final int mo37870a(int i) {
        int a = C57463eg.m88358a(this.f86174b.f153539w);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            return 8388611;
        }
        if (i2 == 2) {
            return 8388613;
        }
        if (i2 != 3) {
            return i;
        }
        return 1;
    }

    /* renamed from: b */
    public final int mo37871b(int i) {
        int a = C57465ei.m88359a(this.f86174b.f153540x);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            return 48;
        }
        if (i2 == 2) {
            return 16;
        }
        if (i2 != 3) {
            return i;
        }
        return 80;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32094ay)) {
            return false;
        }
        C32094ay ayVar = (C32094ay) obj;
        return this.f86174b.equals(ayVar.f86174b) && this.f86175c.equals(ayVar.f86175c);
    }

    /* renamed from: f */
    public final C57408cf mo37876f() {
        C57467ek ekVar = this.f86174b.f153526j;
        if (ekVar == null) {
            ekVar = C57467ek.f153507d;
        }
        if (ekVar.f153509a == 2) {
            return (C57408cf) ekVar.f153510b;
        }
        return C57408cf.f153369c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo37877g(C32138p pVar) {
        Context context = pVar.f86298b;
        View e = pVar.mo37939e();
        View view = pVar.f86300d;
        C57459ec ecVar = this.f86174b.f153532p;
        if (ecVar == null) {
            ecVar = C57459ec.f153490f;
        }
        C32116bd bdVar = new C32116bd(new C32115bc());
        if (pVar instanceof C32121bi) {
            bdVar = ((C32121bi) pVar).mo37923p();
        }
        int a = (int) C32056a.m59733a((float) (ecVar.f153495d + m59785l(2)), context);
        int a2 = (int) C32056a.m59733a((float) (ecVar.f153496e + m59785l(5)), context);
        int a3 = ((int) C32056a.m59733a((float) (ecVar.f153493b + m59785l(3)), context)) + bdVar.f86238a;
        int a4 = ((int) C32056a.m59733a((float) (ecVar.f153494c + m59785l(9)), context)) + bdVar.f86239b;
        int i = true != this.f86175c.mo37843b() ? a : a2;
        if (true != this.f86175c.mo37843b()) {
            a = a2;
        }
        view.setPadding(i, a3, a, a4);
        int i2 = this.f86174b.f153533q;
        if (i2 > 0) {
            view.setMinimumHeight((int) C32056a.m59733a((float) i2, context));
        } else {
            view.setMinimumHeight(0);
        }
        C57408cf cfVar = this.f86174b.f153525i;
        if (cfVar == null) {
            cfVar = C57408cf.f153369c;
        }
        view.setBackground(mo37874e(cfVar));
        C57452dw dwVar = this.f86174b.f153537u;
        if (dwVar == null) {
            dwVar = C57452dw.f153466c;
        }
        if ((dwVar.f153468a & 2) != 0) {
            C57452dw dwVar2 = this.f86174b.f153537u;
            if (dwVar2 == null) {
                dwVar2 = C57452dw.f153466c;
            }
            C57450du duVar = dwVar2.f153469b;
            if (duVar == null) {
                duVar = C57450du.f153462c;
            }
            C2043bi.m5548ab(e, (float) duVar.f153465b);
        } else {
            C2043bi.m5548ab(e, 0.0f);
        }
        if (e != view) {
            C2043bi.m5548ab(view, 0.0f);
        }
        view.setAlpha(this.f86174b.f153536t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo37878h(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        C57459ec ecVar = this.f86174b.f153530n;
        if (ecVar == null) {
            ecVar = C57459ec.f153490f;
        }
        int a = (int) C32056a.m59733a((float) ecVar.f153495d, context);
        int a2 = (int) C32056a.m59733a((float) ecVar.f153496e, context);
        marginLayoutParams.setMargins(a, (int) C32056a.m59733a((float) ecVar.f153493b, context), a2, (int) C32056a.m59733a((float) ecVar.f153494c, context));
        marginLayoutParams.setMarginStart(a);
        marginLayoutParams.setMarginEnd(a2);
    }

    public final int hashCode() {
        return this.f86174b.hashCode();
    }

    /* renamed from: i */
    public final boolean mo37880i() {
        C57454dy dyVar = this.f86174b.f153531o;
        if (dyVar == null) {
            dyVar = C57454dy.f153470d;
        }
        return dyVar.f153474c > 0;
    }

    /* renamed from: j */
    public final boolean mo37881j() {
        C57467ek ekVar = this.f86174b.f153526j;
        if (ekVar == null) {
            ekVar = C57467ek.f153507d;
        }
        return ekVar.f153509a == 2;
    }

    /* renamed from: k */
    public final boolean mo37882k() {
        C57472ep epVar = this.f86174b;
        int i = 0;
        if ((epVar.f153517a & 65536) == 0) {
            return false;
        }
        C57448ds dsVar = epVar.f153535s;
        if (dsVar == null) {
            dsVar = C57448ds.f153453f;
        }
        if (dsVar.f153459e) {
            i = this.f86175c.mo37842a();
        }
        return C32110n.m59818b(dsVar, i);
    }

    /* renamed from: c */
    public final int mo37872c(Context context) {
        int i;
        C57472ep epVar = this.f86174b;
        int i2 = epVar.f153520d;
        int a = C57471eo.m88361a(i2);
        int i3 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i3 == 0) {
            return (int) C32056a.m59733a((float) (i2 == 9 ? ((Integer) epVar.f153521e).intValue() : 0), context);
        } else if (i3 != 1) {
            return -3;
        } else {
            if (i2 != 24 || (i = C57469em.m88360a(((Integer) epVar.f153521e).intValue())) == 0) {
                i = 1;
            }
            int i4 = i - 1;
            if (i4 != 1) {
                return i4 != 2 ? -3 : -1;
            }
            return -2;
        }
    }

    /* renamed from: d */
    public final int mo37873d(Context context) {
        int i;
        C57472ep epVar = this.f86174b;
        int i2 = epVar.f153518b;
        int i3 = 0;
        int i4 = i2 != 0 ? i2 != 8 ? i2 != 23 ? 0 : 2 : 1 : 3;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        } else if (i5 == 0) {
            if (i2 == 8) {
                i3 = ((Integer) epVar.f153519c).intValue();
            }
            return (int) C32056a.m59733a((float) i3, context);
        } else if (i5 != 1) {
            return -3;
        } else {
            if (i2 != 23 || (i = C57469em.m88360a(((Integer) epVar.f153519c).intValue())) == 0) {
                i = 1;
            }
            int i6 = i - 1;
            if (i6 != 1) {
                return i6 != 2 ? -3 : -1;
            }
            return -2;
        }
    }

    /* renamed from: e */
    public final Drawable mo37874e(C57408cf cfVar) {
        C57410ch chVar;
        int i = cfVar.f153371a;
        int i2 = 0;
        int i3 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        } else if (i4 == 0) {
            if (i == 1) {
                i2 = ((Integer) cfVar.f153372b).intValue();
            }
            return new ColorDrawable(i2);
        } else if (i4 != 1) {
            return null;
        } else {
            if (i == 2) {
                chVar = (C57410ch) cfVar.f153372b;
            } else {
                chVar = C57410ch.f153373d;
            }
            return new C32100d(chVar, this.f86175c.f86114e);
        }
    }
}
