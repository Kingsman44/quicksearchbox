package com.google.android.libraries.p2460r.p2469c;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p2460r.p2464b.p2468d.C32056a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32059b;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57368at;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57369au;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57397bv;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57461ee;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57472ep;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57474er;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57476et;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57478ev;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57481ey;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57482ez;

/* renamed from: com.google.android.libraries.r.c.bi */
/* compiled from: PG */
abstract class C32121bi extends C32138p {

    /* renamed from: a */
    private C32116bd f86251a = new C32116bd(new C32115bc());

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32121bi(android.content.Context r3, com.google.android.libraries.p2460r.p2469c.C32127e r4) {
        /*
            r2 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            r1 = 0
            r0.setBreakStrategy(r1)
            r2.<init>(r3, r4, r0)
            com.google.android.libraries.r.c.bc r3 = new com.google.android.libraries.r.c.bc
            r3.<init>()
            com.google.android.libraries.r.c.bd r4 = new com.google.android.libraries.r.c.bd
            r4.<init>(r3)
            r2.f86251a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p2460r.p2469c.C32121bi.<init>(android.content.Context, com.google.android.libraries.r.c.e):void");
    }

    /* renamed from: r */
    private final float m59831r() {
        TextView textView = (TextView) this.f86300d;
        C57461ee eeVar = mo37940f().f86174b.f153527k;
        if (eeVar == null) {
            eeVar = C57461ee.f153497g;
        }
        return C32056a.m59734b((float) eeVar.f153501c, textView.getContext()) - ((float) textView.getLineHeight());
    }

    /* renamed from: s */
    private final void m59832s(String str, C32117be beVar, TextView textView) {
        C32120bh bhVar = new C32120bh(this, textView, beVar);
        C32059b bVar = this.f86299c.f86274c.f86117a;
        bVar.f86115f.mo37850a(str, beVar.f86243c, bhVar);
    }

    /* renamed from: t */
    private static void m59833t(TextView textView, boolean z) {
        if (z) {
            textView.setTypeface(textView.getTypeface(), 2);
        } else {
            textView.setTypeface(Typeface.create(textView.getTypeface(), 0));
        }
    }

    /* renamed from: u */
    private final void m59834u() {
        float f;
        TextView textView = (TextView) this.f86300d;
        C32094ay f2 = mo37940f();
        textView.setTextColor(f2.f86174b.f153524h);
        C57461ee eeVar = f2.f86174b.f153527k;
        if (eeVar == null) {
            eeVar = C57461ee.f153497g;
        }
        if ((eeVar.f153499a & 4) != 0) {
            textView.setIncludeFontPadding(false);
            textView.setLineSpacing((float) mo37923p().f86240c, 1.0f);
        }
        C57461ee eeVar2 = f2.f86174b.f153527k;
        int i = 1;
        if (((eeVar2 == null ? C57461ee.f153497g : eeVar2).f153499a & 32) != 0) {
            if (((eeVar2 == null ? C57461ee.f153497g : eeVar2).f153499a & 1) != 0) {
                if (eeVar2 == null) {
                    eeVar2 = C57461ee.f153497g;
                }
                f = (float) eeVar2.f153500b;
            } else {
                f = textView.getTextSize() / textView.getContext().getResources().getDisplayMetrics().scaledDensity;
            }
            C57461ee eeVar3 = f2.f86174b.f153527k;
            if (eeVar3 == null) {
                eeVar3 = C57461ee.f153497g;
            }
            textView.setLetterSpacing(eeVar3.f153503e / f);
        }
        int i2 = f2.f86174b.f153534r;
        if (i2 > 0) {
            textView.setMaxLines(i2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        TextView textView2 = (TextView) this.f86300d;
        C57472ep epVar = f2.f86174b;
        int a = C57476et.m88363a(epVar.f153528l);
        if (a == 0) {
            a = 2;
        }
        int i3 = a - 1;
        if (i3 == 2) {
            i = 8388613;
        } else if (i3 != 3) {
            i = 8388611;
        }
        int a2 = C57478ev.m88364a(epVar.f153529m);
        if (a2 == 0) {
            a2 = 2;
        }
        int i4 = a2 - 1;
        textView2.setGravity((i4 != 2 ? i4 != 3 ? 48 : 16 : 80) | i);
    }

    /* renamed from: a */
    public void mo37854a() {
        TextView textView = (TextView) this.f86300d;
        textView.setTextAlignment(1);
        textView.setText(BuildConfig.FLAVOR);
    }

    /* renamed from: c */
    public abstract void mo37863c(C32148z zVar, C57397bv bvVar);

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ void mo37855m(Object obj, C32148z zVar) {
        C57369au auVar = (C57369au) obj;
        if (this.f86303g == null) {
            C57461ee eeVar = mo37940f().f86174b.f153527k;
            if (eeVar == null) {
                eeVar = C57461ee.f153497g;
            }
            C32118bf bfVar = new C32118bf(eeVar);
            this.f86303g = bfVar;
            TextView textView = (TextView) this.f86300d;
            textView.setTextSize((float) bfVar.f86245a);
            if (!bfVar.f86247c.isEmpty()) {
                mo37924q(textView, new C32117be(bfVar.f86247c, bfVar.f86246b, zVar));
            } else {
                m59833t(textView, bfVar.f86246b);
            }
        }
        m59834u();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final C32116bd mo37923p() {
        int i;
        int i2;
        C57461ee eeVar = mo37940f().f86174b.f153527k;
        if (eeVar == null) {
            eeVar = C57461ee.f153497g;
        }
        int i3 = eeVar.f153499a & 4;
        if (i3 == 0) {
            return this.f86251a;
        }
        if (i3 != 0) {
            float r = m59831r();
            if (r == 0.0f) {
                return this.f86251a;
            }
            float f = ((float) this.f86251a.f86240c) + r;
            i2 = Math.round(f);
            i = Math.round(f);
            float f2 = f - ((float) i);
            if (f2 < 0.0f) {
                i--;
            } else if (f2 > 0.0f) {
                i++;
            }
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = i / 2;
        C32115bc bcVar = new C32115bc();
        bcVar.f86235a = i4;
        bcVar.f86236b = i - i4;
        bcVar.f86237c = i2;
        C32116bd bdVar = new C32116bd(bcVar);
        this.f86251a = bdVar;
        return bdVar;
    }

    /* renamed from: q */
    public final void mo37924q(TextView textView, C32117be beVar) {
        C57482ez ezVar;
        int i;
        int size = beVar.f86242b.size();
        int i2 = beVar.f86241a;
        if (size <= i2) {
            ezVar = null;
        } else {
            ezVar = (C57482ez) beVar.f86242b.get(i2);
        }
        if (ezVar == null) {
            beVar.f86244d.mo37967i(2, C57404cb.ERR_MISSING_FONTS, "Could not load specified typefaces.");
            m59833t(textView, beVar.f86243c);
            return;
        }
        int i3 = ezVar.f153553a;
        int i4 = i3 != 0 ? i3 != 1 ? i3 != 2 ? 0 : 2 : 1 : 3;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        } else if (i5 == 0) {
            if (i3 != 1 || (i = C57481ey.m88365a(((Integer) ezVar.f153554b).intValue())) == 0) {
                i = 1;
            }
            int i6 = i - 1;
            if (i6 == 1) {
                textView.setTextAppearance(R.style.gm_font_weight_light);
            } else if (i6 == 2) {
                textView.setTextAppearance(R.style.gm_font_weight_regular);
            } else if (i6 == 3) {
                textView.setTextAppearance(R.style.gm_font_weight_medium);
            } else if (i6 == 4 || i6 == 5) {
                m59832s(i6 != 4 ? i6 != 5 ? "UNDEFINED" : "GOOGLE_SANS_MEDIUM" : "GOOGLE_SANS_REGULAR", beVar, textView);
                return;
            } else {
                beVar.mo37919a();
                mo37924q(textView, beVar);
                return;
            }
            m59833t(textView, beVar.f86243c);
        } else if (i5 == 1) {
            m59832s(i3 == 2 ? (String) ezVar.f153554b : BuildConfig.FLAVOR, beVar, textView);
        }
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ Object mo37852v(C57369au auVar) {
        if (auVar.f153257b == 2) {
            return auVar;
        }
        throw new C32083an(C57404cb.ERR_MISSING_ELEMENT_CONTENTS, String.format("Missing TextElement; has %s", new Object[]{C57368at.m88332a(C57368at.m88333b(auVar.f153257b))}));
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo37853w(Object obj, C32148z zVar) {
        C57397bv bvVar;
        C57369au auVar = (C57369au) obj;
        if (auVar.f153257b == 2) {
            bvVar = (C57397bv) auVar.f153258c;
        } else {
            bvVar = C57397bv.f153317c;
        }
        mo37863c(zVar, bvVar);
        C57474er erVar = this.f86302f.f153265j;
        if (erVar == null) {
            erVar = C57474er.f153542d;
        }
        if ((erVar.f153544a & 1) != 0) {
            m59834u();
        } else if (this.f86251a.f86240c != 0 && Math.round(m59831r()) != 0) {
            m59834u();
            mo37940f().mo37877g(this);
        }
    }
}
