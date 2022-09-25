package com.google.android.libraries.elements.p1714d;

import android.graphics.drawable.Drawable;
import com.facebook.litho.C6269fl;
import com.facebook.litho.C6270fm;
import com.facebook.litho.C6374h;
import com.facebook.litho.C6381hf;
import com.facebook.litho.C6395i;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.litho.widget.C6495d;
import com.facebook.litho.widget.C6522e;
import com.facebook.litho.widget.C6541f;
import com.facebook.yoga.C6565a;
import com.google.android.libraries.elements.interfaces.C21251au;
import com.google.android.libraries.elements.p1714d.p1719e.p1723b.C21025d;
import java.util.List;

/* renamed from: com.google.android.libraries.elements.d.an */
/* compiled from: PG */
public final class C20801an extends C6407q {
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.DIMEN_OFFSET)

    /* renamed from: A */
    public Float f58236A;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.DIMEN_OFFSET)

    /* renamed from: B */
    public Float f58237B;
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.DIMEN_OFFSET)

    /* renamed from: C */
    public float f58238C;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.COLOR)

    /* renamed from: D */
    public Integer f58239D;
    @C6117a(mo12871a = 13)

    /* renamed from: E */
    C21251au f58240E;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: F */
    public int f58241F;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: G */
    public int f58242G;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: H */
    int f58243H;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    public C6565a f58244a;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    public C6565a f58245b;
    @C6117a(mo12871a = 6)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: c */
    List f58246c;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: d */
    public Drawable f58247d;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.COLOR)

    /* renamed from: e */
    Integer f58248e;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: f */
    String f58249f;
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.DIMEN_OFFSET)

    /* renamed from: g */
    public float f58250g;

    private C20801an() {
        super("Container");
    }

    /* renamed from: b */
    public static C20800am m39050b(C6411u uVar) {
        C20800am amVar = new C20800am();
        amVar.mo25885e(uVar, new C20801an());
        return amVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public final void mo12811ab(C6381hf hfVar) {
        if (hfVar != null) {
            this.f58240E = (C21251au) hfVar.mo13397c(C21251au.class);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C6407q mo12835c(C6411u uVar) {
        C6374h hVar;
        int i = this.f58243H;
        List<C6407q> list = this.f58246c;
        C21251au auVar = this.f58240E;
        Drawable drawable = this.f58247d;
        Integer num = this.f58248e;
        C6565a aVar = this.f58245b;
        int i2 = this.f58242G;
        int i3 = this.f58241F;
        C6565a aVar2 = this.f58244a;
        Integer num2 = this.f58239D;
        float f = this.f58238C;
        float f2 = this.f58250g;
        Float f3 = this.f58236A;
        Float f4 = this.f58237B;
        String str = this.f58249f;
        int i4 = i - 1;
        if (i != 0) {
            Float f5 = f4;
            if (i4 == 1) {
                C6374h b = C6395i.m17143b(uVar);
                b.f18849a.f18924d = true;
                hVar = b;
            } else if (i4 == 2) {
                hVar = C6270fm.m16828b(uVar);
            } else if (i4 != 3) {
                hVar = C6395i.m17143b(uVar);
            } else {
                C6269fl b2 = C6270fm.m16828b(uVar);
                b2.f18513a.f18518d = true;
                hVar = b2;
            }
            if (list != null) {
                for (C6407q j : list) {
                    hVar.mo13264f(j.mo13318j());
                }
            }
            if (aVar != null) {
                hVar.mo13262d(aVar);
            }
            if (i2 != 0) {
                hVar.mo13267i(i2);
            }
            if (i3 != 0) {
                hVar.mo13266h(i3);
            }
            if (aVar2 != null) {
                hVar.mo13261c(aVar2);
            }
            if (!(str == null || auVar == null)) {
                auVar.f59572c = str;
            }
            if (drawable != null) {
                hVar.mo13444q(drawable);
            } else if (num != null) {
                C21025d dVar = new C21025d();
                dVar.f58923a = num.intValue();
                dVar.f58924b = 0;
                hVar.mo13444q(dVar);
            }
            if (f <= 0.5f) {
                return hVar.mo13259a();
            }
            C6374h b3 = C6395i.m17143b(uVar);
            b3.mo13390j(hVar);
            C6495d dVar2 = new C6495d();
            dVar2.mo13580c(uVar, new C6522e());
            int intValue = num2 != null ? num2.intValue() : 922746880;
            C6522e eVar = dVar2.f19263a;
            eVar.f19411f = intValue;
            eVar.f19409d = 50331648;
            eVar.f19406a = f2;
            eVar.f19410e = f;
            dVar2.mo13435S(3);
            dVar2.mo13434R(9, 0);
            if (f3 == null && f5 == null) {
                double d = (double) f;
                b3.mo13432P(7, (int) Math.ceil(d));
                b3.mo13432P(2, (int) Math.ceil((double) (f / 2.0f)));
                Double.isNaN(d);
                b3.mo13432P(4, (int) Math.ceil(d * 1.5d));
            } else {
                float f6 = 0.0f;
                float floatValue = f3 == null ? 0.0f : f3.floatValue();
                if (f5 != null) {
                    f6 = f5.floatValue();
                }
                b3.mo13432P(1, C6541f.m17805b(f, floatValue));
                b3.mo13432P(3, C6541f.m17806c(f, floatValue));
                b3.mo13432P(2, C6541f.m17807d(f, f6));
                b3.mo13432P(4, C6541f.m17804a(f, f6));
                C6522e eVar2 = dVar2.f19263a;
                eVar2.f19407b = floatValue;
                eVar2.f19408c = f6;
            }
            C6374h b4 = C6395i.m17143b(uVar);
            b4.mo13390j(b3);
            b4.mo13390j(dVar2);
            return b4.f18849a;
        }
        throw null;
    }
}
