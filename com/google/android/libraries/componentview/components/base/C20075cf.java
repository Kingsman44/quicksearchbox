package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.componentview.components.base.p1687a.C19902ac;
import com.google.android.libraries.componentview.components.base.p1687a.C19904ae;
import com.google.android.libraries.componentview.components.base.p1687a.C19905af;
import com.google.android.libraries.componentview.components.base.p1687a.C19906ag;
import com.google.android.libraries.componentview.components.base.p1687a.C19911al;
import com.google.android.libraries.componentview.components.base.p1687a.C19913an;
import com.google.android.libraries.componentview.components.base.p1687a.C19915ap;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19990m;
import com.google.android.libraries.componentview.components.base.p1687a.C19991n;
import com.google.android.libraries.componentview.components.base.p1687a.C19993p;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20476g;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1697d.C20483n;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.p4463ce.p4464a.p4470b.p4472b.p4473a.p4474a.C58055a;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.componentview.components.base.cf */
/* compiled from: PG */
public abstract class C20075cf extends C20470a implements View.OnAttachStateChangeListener {

    /* renamed from: t */
    public static final /* synthetic */ int f56301t = 0;

    /* renamed from: a */
    private final C19905af f56302a = ((C19905af) C19906ag.f55692f.createBuilder());

    /* renamed from: n */
    protected C19991n f56303n;

    /* renamed from: o */
    public final Context f56304o;

    /* renamed from: p */
    public View f56305p;

    /* renamed from: q */
    public final C58055a f56306q = new C58055a();

    /* renamed from: r */
    public C20476g f56307r;

    /* renamed from: s */
    public final C20601ca f56308s;

    public C20075cf(Context context, C56425d dVar, C20601ca caVar) {
        super(dVar);
        this.f56304o = context;
        this.f56308s = caVar;
    }

    /* renamed from: i */
    private static boolean m37935i(C19991n nVar) {
        int i = nVar.f56021a;
        if ((i & 1) == 0 || nVar.f56022b <= 0.0f || (i & 2) == 0) {
            return false;
        }
        C19990m a = C19990m.m37789a(nVar.f56024d);
        if (a == null) {
            a = C19990m.SOLID;
        }
        return !a.equals(C19990m.NONE);
    }

    /* renamed from: m */
    private static float[] m37936m(float f, float f2, float f3, float f4) {
        return new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    /* renamed from: t */
    protected static PaintDrawable m37937t(ColorDrawable colorDrawable, float f, float f2, float f3, float f4) {
        PaintDrawable paintDrawable = new PaintDrawable(colorDrawable.getColor());
        paintDrawable.setCornerRadii(m37936m(f, f2, f3, f4));
        return paintDrawable;
    }

    /* renamed from: v */
    public static void m37938v(C20470a aVar) {
        while ((aVar instanceof C20483n) && !(aVar instanceof C20018ao)) {
            aVar = ((C20483n) aVar).f57601m;
        }
        if (aVar instanceof C20018ao) {
            C20018ao aoVar = (C20018ao) aVar;
            View kH = aVar.mo25098kH();
            if (kH != null) {
                aoVar.mo25194o(kH.getLayoutParams());
            }
        }
    }

    /* renamed from: b */
    public C60870cx mo25099b() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract View mo25110e(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo25111g(C56425d dVar);

    /* renamed from: kD */
    public final void mo25181kD(float f, float f2, float f3, float f4) {
        float max = Math.max(f, ((C19906ag) this.f56302a.instance).f55695b);
        float max2 = Math.max(f2, ((C19906ag) this.f56302a.instance).f55696c);
        float max3 = Math.max(f3, ((C19906ag) this.f56302a.instance).f55698e);
        float max4 = Math.max(f4, ((C19906ag) this.f56302a.instance).f55697d);
        if (this.f56303n != null) {
            mo25193q(max, max2, max3, max4);
        } else {
            mo25192p(max, max2, max3, max4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: kE */
    public void mo25188kE(int i) {
        if (this.f56305p.getBackground() != null) {
            this.f56305p.getBackground().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            return;
        }
        this.f56305p.setBackgroundColor(i);
    }

    /* renamed from: kH */
    public final View mo25098kH() {
        return this.f56305p;
    }

    /* renamed from: ky */
    public final C20476g mo25200ky() {
        return this.f56307r;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo25192p(float f, float f2, float f3, float f4) {
        Drawable background = this.f56305p.getBackground();
        if (background == null) {
            return;
        }
        if (f <= 0.0f && f2 <= 0.0f && f3 <= 0.0f && f4 <= 0.0f) {
            return;
        }
        if (background instanceof ColorDrawable) {
            this.f56305p.setBackground(m37937t((ColorDrawable) background, f, f2, f3, f4));
        } else if (background instanceof PaintDrawable) {
            PaintDrawable paintDrawable = (PaintDrawable) background;
            if (paintDrawable.getShape() == null || (paintDrawable.getShape() instanceof RoundRectShape)) {
                paintDrawable.setCornerRadii(m37936m(f, f2, f3, f4));
                return;
            }
            C20598by G = mo25418G();
            G.mo25535e(C19742a.ILLEGAL_UNEXPECTED_OR_OTHERWISE_SUSPICIOUS_CORNER_ROUNDING_INVOCATION_CIRCUMSTANCES);
            String valueOf = String.valueOf(paintDrawable.getShape());
            G.mo25536f("Rounding corners for PaintDrawable instances that carry a shape is not supported: " + valueOf + ".");
            C20520h.m38498c("ViewComponent", G.mo25531a(), this.f56308s, new Object[0]);
        } else {
            C20598by G2 = mo25418G();
            G2.mo25535e(C19742a.ILLEGAL_UNEXPECTED_OR_OTHERWISE_SUSPICIOUS_CORNER_ROUNDING_INVOCATION_CIRCUMSTANCES);
            String valueOf2 = String.valueOf(background.getClass());
            G2.mo25536f("Expected [Color|Paint]Drawable in ViewComponent.roundCorners(), but found " + valueOf2 + ".");
            C20520h.m38498c("ViewComponent", G2.mo25531a(), this.f56308s, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo25193q(float f, float f2, float f3, float f4) {
        C19991n nVar = this.f56303n;
        if (nVar != null) {
            GradientDrawable s = mo25247s(nVar);
            if (f > 0.0f || f2 > 0.0f || f3 > 0.0f || f4 > 0.0f) {
                s.setCornerRadii(m37936m(f, f2, f3, f4));
            }
            Drawable background = this.f56305p.getBackground();
            if (background != null && (background instanceof ColorDrawable)) {
                s.setColor(((ColorDrawable) background).getColor());
            }
            this.f56305p.setBackground(s);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract C20476g mo25238r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final GradientDrawable mo25247s(C19991n nVar) {
        Context context = this.f56304o;
        int a = (int) (C20482m.m38433a(context) * nVar.f56022b);
        int i = nVar.f56023c;
        GradientDrawable gradientDrawable = new GradientDrawable();
        int[] iArr = C20074ce.f56299a;
        C19990m a2 = C19990m.m37789a(nVar.f56024d);
        if (a2 == null) {
            a2 = C19990m.SOLID;
        }
        int i2 = iArr[a2.ordinal()];
        if (i2 == 2) {
            float f = (float) a;
            gradientDrawable.setStroke(a, i, f, 1.5f * f);
        } else if (i2 == 3) {
            float f2 = ((float) a) * 2.5f;
            gradientDrawable.setStroke(a, i, f2, f2);
        } else if (i2 == 4) {
            gradientDrawable.setStroke(a, i);
        }
        return gradientDrawable;
    }

    /* renamed from: u */
    public final void mo25248u(C56425d dVar) {
        this.f56306q.f155195a.add(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo25249w(C19916aq aqVar) {
        C19991n nVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        LayerDrawable layerDrawable;
        C19991n nVar2;
        C19916aq aqVar2 = aqVar;
        if ((aqVar2.f55705a & 1) != 0) {
            C19995r rVar = aqVar2.f55710f;
            if (rVar == null) {
                rVar = C19995r.f56032g;
            }
            mo25188kE(Integer.valueOf(C20566at.m38590a(rVar)).intValue());
        }
        int i6 = 0;
        if ((aqVar2.f55705a & 32768) != 0) {
            C19902ac acVar = aqVar2.f55720p;
            if (acVar == null) {
                acVar = C19902ac.f55675h;
            }
            if (!acVar.f55682f.isEmpty()) {
                int[] iArr = new int[acVar.f55682f.size()];
                for (int i7 = 0; i7 < acVar.f55682f.size(); i7++) {
                    iArr[i7] = ((C19995r) acVar.f55682f.get(i7)).f56039f;
                }
                float size = 1.0f / ((float) (acVar.f55682f.size() + 1));
                int size2 = acVar.f55682f.size();
                float[] fArr = new float[size2];
                for (int i8 = 1; i8 <= size2; i8++) {
                    fArr[i8 - 1] = ((float) i8) * size;
                }
                if (!acVar.f55683g.isEmpty()) {
                    for (int i9 = 0; i9 < acVar.f55683g.size(); i9++) {
                        fArr[i9] = ((Float) acVar.f55683g.get(i9)).floatValue();
                    }
                }
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                if ((acVar.f55677a & 16) != 0) {
                    int i10 = C20074ce.f56300b[tileMode.ordinal()];
                    if (i10 != 1) {
                        tileMode = i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.REPEAT;
                    } else {
                        tileMode = Shader.TileMode.MIRROR;
                    }
                }
                C20073cd cdVar = new C20073cd(acVar, iArr, fArr, tileMode);
                PaintDrawable paintDrawable = new PaintDrawable();
                paintDrawable.setShaderFactory(cdVar);
                paintDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                this.f56305p.setBackground(paintDrawable);
            }
        }
        float f = aqVar2.f55711g;
        if (f != 0.0f) {
            mo25251y((int) (C20482m.m38433a(this.f56304o) * f));
        }
        if (aqVar2.f55708d == 13) {
            nVar = (C19991n) aqVar2.f55709e;
        } else {
            nVar = C19991n.f56019e;
        }
        if (m37935i(nVar)) {
            if (aqVar2.f55708d == 13) {
                nVar2 = (C19991n) aqVar2.f55709e;
            } else {
                nVar2 = C19991n.f56019e;
            }
            this.f56303n = nVar2;
        } else if (aqVar2.f55708d == 15) {
            C19993p pVar = (C19993p) aqVar2.f55709e;
            ArrayList arrayList = new ArrayList();
            Drawable background = this.f56305p.getBackground();
            if (background != null) {
                arrayList.add(background);
            }
            C19991n nVar3 = pVar.f56030d;
            if (nVar3 == null) {
                nVar3 = C19991n.f56019e;
            }
            if (m37935i(nVar3)) {
                int size3 = arrayList.size();
                C19991n nVar4 = pVar.f56030d;
                if (nVar4 == null) {
                    nVar4 = C19991n.f56019e;
                }
                arrayList.add(mo25247s(nVar4));
                i2 = size3;
            } else {
                i2 = -1;
            }
            C19991n nVar5 = pVar.f56028b;
            if (nVar5 == null) {
                nVar5 = C19991n.f56019e;
            }
            if (m37935i(nVar5)) {
                i3 = arrayList.size();
                C19991n nVar6 = pVar.f56028b;
                if (nVar6 == null) {
                    nVar6 = C19991n.f56019e;
                }
                arrayList.add(mo25247s(nVar6));
            } else {
                i3 = -1;
            }
            C19991n nVar7 = pVar.f56027a;
            if (nVar7 == null) {
                nVar7 = C19991n.f56019e;
            }
            if (m37935i(nVar7)) {
                i4 = arrayList.size();
                C19991n nVar8 = pVar.f56027a;
                if (nVar8 == null) {
                    nVar8 = C19991n.f56019e;
                }
                arrayList.add(mo25247s(nVar8));
            } else {
                i4 = -1;
            }
            C19991n nVar9 = pVar.f56029c;
            if (nVar9 == null) {
                nVar9 = C19991n.f56019e;
            }
            if (m37935i(nVar9)) {
                int size4 = arrayList.size();
                C19991n nVar10 = pVar.f56029c;
                if (nVar10 == null) {
                    nVar10 = C19991n.f56019e;
                }
                arrayList.add(mo25247s(nVar10));
                i5 = size4;
            } else {
                i5 = -1;
            }
            LayerDrawable layerDrawable2 = new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[arrayList.size()]));
            if (i2 >= 0) {
                Context context = this.f56304o;
                C19991n nVar11 = pVar.f56030d;
                if (nVar11 == null) {
                    nVar11 = C19991n.f56019e;
                }
                int i11 = -((int) (C20482m.m38433a(context) * nVar11.f56022b));
                layerDrawable = layerDrawable2;
                layerDrawable2.setLayerInset(i2, 0, i11, i11, i11);
            } else {
                layerDrawable = layerDrawable2;
            }
            if (i3 >= 0) {
                Context context2 = this.f56304o;
                C19991n nVar12 = pVar.f56028b;
                if (nVar12 == null) {
                    nVar12 = C19991n.f56019e;
                }
                int i12 = -((int) (C20482m.m38433a(context2) * nVar12.f56022b));
                layerDrawable.setLayerInset(i3, i12, i12, 0, i12);
            }
            if (i4 >= 0) {
                Context context3 = this.f56304o;
                C19991n nVar13 = pVar.f56027a;
                if (nVar13 == null) {
                    nVar13 = C19991n.f56019e;
                }
                int i13 = -((int) (C20482m.m38433a(context3) * nVar13.f56022b));
                layerDrawable.setLayerInset(i4, i13, 0, i13, i13);
            }
            if (i5 >= 0) {
                Context context4 = this.f56304o;
                C19991n nVar14 = pVar.f56029c;
                if (nVar14 == null) {
                    nVar14 = C19991n.f56019e;
                }
                int i14 = -((int) (C20482m.m38433a(context4) * nVar14.f56022b));
                layerDrawable.setLayerInset(i5, i14, i14, i14, 0);
            }
            this.f56305p.setBackground(layerDrawable);
        }
        if ((aqVar2.f55705a & 32) != 0) {
            View view = this.f56305p;
            Context context5 = this.f56304o;
            C19904ae aeVar = aqVar2.f55712h;
            if (aeVar == null) {
                aeVar = C19904ae.f55685f;
            }
            int a = (int) (C20482m.m38433a(context5) * aeVar.f55691e);
            Context context6 = this.f56304o;
            C19904ae aeVar2 = aqVar2.f55712h;
            if (aeVar2 == null) {
                aeVar2 = C19904ae.f55685f;
            }
            int a2 = (int) (C20482m.m38433a(context6) * aeVar2.f55688b);
            Context context7 = this.f56304o;
            C19904ae aeVar3 = aqVar2.f55712h;
            if (aeVar3 == null) {
                aeVar3 = C19904ae.f55685f;
            }
            int a3 = (int) (C20482m.m38433a(context7) * aeVar3.f55689c);
            Context context8 = this.f56304o;
            C19904ae aeVar4 = aqVar2.f55712h;
            if (aeVar4 == null) {
                aeVar4 = C19904ae.f55685f;
            }
            C2043bi.m5556aj(view, a, a2, a3, (int) (C20482m.m38433a(context8) * aeVar4.f55690d));
        }
        int i15 = aqVar2.f55716l;
        if (i15 != 0) {
            this.f56305p.setMinimumWidth((int) (C20482m.m38433a(this.f56304o) * ((float) i15)));
        }
        int i16 = aqVar2.f55717m;
        if (i16 != 0) {
            this.f56305p.setMinimumHeight((int) (C20482m.m38433a(this.f56304o) * ((float) i16)));
        }
        View view2 = this.f56305p;
        if ((aqVar2.f55705a & 64) != 0) {
            view2.setContentDescription(aqVar2.f55713i);
        }
        if ((aqVar2.f55705a & 128) != 0) {
            view2.setFocusable(aqVar2.f55714j);
        }
        if ((aqVar2.f55705a & 256) != 0) {
            int a4 = C19911al.m37775a(aqVar2.f55715k);
            if (a4 == 0) {
                a4 = 1;
            }
            C20482m.m38448p(view2, a4);
        }
        if ((aqVar2.f55705a & 2048) != 0) {
            View view3 = this.f56305p;
            int a5 = C19915ap.m37777a(aqVar2.f55718n);
            if (a5 == 0) {
                a5 = 1;
            }
            switch (a5 - 1) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                default:
                    i = 7;
                    break;
            }
            view3.setTextDirection(i);
        }
        if ((aqVar2.f55705a & 4096) != 0) {
            View view4 = this.f56305p;
            int a6 = C19913an.m37776a(aqVar2.f55719o);
            if (a6 == 0) {
                a6 = 1;
            }
            int i17 = a6 - 1;
            if (i17 != 0) {
                if (i17 == 1) {
                    i6 = 3;
                } else if (i17 != 3) {
                    if (i17 == 4) {
                        i6 = 1;
                    }
                }
                view4.setLayoutDirection(i6);
            }
            i6 = 2;
            view4.setLayoutDirection(i6);
        }
        int i18 = aqVar2.f55706b;
        if (i18 == 2) {
            float a7 = (float) ((int) (C20482m.m38433a(this.f56304o) * ((Float) aqVar2.f55707c).floatValue()));
            C19905af afVar = this.f56302a;
            afVar.copyOnWrite();
            C19906ag agVar = (C19906ag) afVar.instance;
            C19906ag agVar2 = C19906ag.f55692f;
            agVar.f55694a = 1 | agVar.f55694a;
            agVar.f55695b = a7;
            C19905af afVar2 = this.f56302a;
            afVar2.copyOnWrite();
            C19906ag agVar3 = (C19906ag) afVar2.instance;
            agVar3.f55694a |= 2;
            agVar3.f55696c = a7;
            C19905af afVar3 = this.f56302a;
            afVar3.copyOnWrite();
            C19906ag agVar4 = (C19906ag) afVar3.instance;
            agVar4.f55694a = 8 | agVar4.f55694a;
            agVar4.f55698e = a7;
            C19905af afVar4 = this.f56302a;
            afVar4.copyOnWrite();
            C19906ag agVar5 = (C19906ag) afVar4.instance;
            agVar5.f55694a |= 4;
            agVar5.f55697d = a7;
        } else if (i18 == 7) {
            C19906ag agVar6 = (C19906ag) aqVar2.f55707c;
            C19905af afVar5 = this.f56302a;
            Context context9 = this.f56304o;
            float f2 = agVar6.f55695b;
            float a8 = C20482m.m38433a(context9);
            afVar5.copyOnWrite();
            C19906ag agVar7 = (C19906ag) afVar5.instance;
            agVar7.f55694a = 1 | agVar7.f55694a;
            agVar7.f55695b = (float) ((int) (a8 * f2));
            C19905af afVar6 = this.f56302a;
            Context context10 = this.f56304o;
            float f3 = agVar6.f55696c;
            float a9 = C20482m.m38433a(context10);
            afVar6.copyOnWrite();
            C19906ag agVar8 = (C19906ag) afVar6.instance;
            agVar8.f55694a = 2 | agVar8.f55694a;
            agVar8.f55696c = (float) ((int) (a9 * f3));
            C19905af afVar7 = this.f56302a;
            Context context11 = this.f56304o;
            float f4 = agVar6.f55698e;
            float a10 = C20482m.m38433a(context11);
            afVar7.copyOnWrite();
            C19906ag agVar9 = (C19906ag) afVar7.instance;
            agVar9.f55694a = 8 | agVar9.f55694a;
            agVar9.f55698e = (float) ((int) (a10 * f4));
            C19905af afVar8 = this.f56302a;
            Context context12 = this.f56304o;
            float f5 = agVar6.f55697d;
            float a11 = C20482m.m38433a(context12);
            afVar8.copyOnWrite();
            C19906ag agVar10 = (C19906ag) afVar8.instance;
            agVar10.f55694a |= 4;
            agVar10.f55697d = (float) ((int) (a11 * f5));
        }
        if ((aqVar2.f55705a & 65536) != 0) {
            this.f56305p.setDuplicateParentStateEnabled(aqVar2.f55721q);
        }
        if ((aqVar2.f55705a & C89885b.S3REQUEST_VALUE) != 0) {
            this.f56305p.setForceDarkAllowed(aqVar2.f55722r);
        }
    }

    /* renamed from: x */
    public final void mo25250x() {
        View e = mo25110e(this.f56304o);
        this.f56305p = e;
        e.setClickable(false);
        this.f56305p.setTextDirection(0);
        C56425d dVar = this.f57588z;
        this.f56306q.f155195a.clear();
        mo25111g(dVar);
        mo25252z(dVar);
        this.f56307r = mo25238r();
        C56425d dVar2 = this.f57588z;
        if ((dVar2.f150539a & 4) != 0) {
            C56429h hVar = dVar2.f150542d;
            if (hVar == null) {
                hVar = C56429h.f150547k;
            }
            if ((hVar.f150549a & 1) != 0) {
                View view = this.f56305p;
                C56429h hVar2 = this.f57588z.f150542d;
                if (hVar2 == null) {
                    hVar2 = C56429h.f150547k;
                }
                C60214n nVar = hVar2.f150550b;
                if (nVar == null) {
                    nVar = C60214n.f162914g;
                }
                C20482m.m38441i(view, nVar.f162918c);
            }
        }
        this.f56305p.addOnAttachStateChangeListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo25251y(int i) {
        this.f56305p.setElevation((float) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo25252z(C56425d dVar) {
        this.f56306q.f155195a.add(dVar);
        if (this.f56306q.mo54637a("click")) {
            this.f56305p.setOnClickListener(new C20072cc(this));
        }
    }
}
