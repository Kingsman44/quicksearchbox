package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import androidx.core.content.C1877c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.p1687a.C19965cl;
import com.google.android.libraries.componentview.components.base.p1687a.C19966cm;
import com.google.android.libraries.componentview.components.base.p1687a.C19968co;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.components.base.p1688b.C20031a;
import com.google.android.libraries.componentview.components.base.p1688b.C20032b;
import com.google.android.libraries.componentview.components.base.p1688b.C20036f;
import com.google.android.libraries.componentview.components.base.p1688b.C20038h;
import com.google.android.libraries.componentview.components.base.p1688b.C20042l;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20476g;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.p1699f.C20524l;
import com.google.android.libraries.componentview.services.application.C20546a;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.componentview.components.base.bp */
/* compiled from: PG */
public class C20058bp extends C20470a {

    /* renamed from: a */
    public final Context f56234a;

    /* renamed from: b */
    public final C20524l f56235b;

    /* renamed from: c */
    public final C20601ca f56236c;

    /* renamed from: d */
    public final C20546a f56237d;

    /* renamed from: e */
    public C19968co f56238e;

    /* renamed from: f */
    public SpannableString f56239f;

    /* renamed from: g */
    public boolean f56240g = false;

    /* renamed from: h */
    public boolean f56241h = false;

    /* renamed from: i */
    public boolean f56242i = false;

    /* renamed from: j */
    public boolean f56243j = false;

    /* renamed from: k */
    public final C20566at f56244k;

    public C20058bp(Context context, C56425d dVar, C20524l lVar, C20601ca caVar, C20546a aVar, C20566at atVar) {
        super(dVar);
        this.f56234a = context.getApplicationContext();
        this.f56235b = lVar;
        this.f56236c = caVar;
        this.f56237d = aVar;
        this.f56244k = atVar;
    }

    /* renamed from: g */
    public static final String m37897g(C19968co coVar) {
        return "Span Component with text : ".concat(String.valueOf(coVar.f55921b));
    }

    /* renamed from: i */
    private final C56425d m37898i(C56425d dVar) {
        C62940bt r0 = C62942bv.checkIsLite(C19968co.f55916C);
        dVar.mo58887l(r0);
        if (dVar.f169962ag.mo58857o(r0.f169971d)) {
            return dVar;
        }
        if ((dVar.f150539a & 2) == 0) {
            return null;
        }
        C56425d dVar2 = dVar.f150541c;
        if (dVar2 == null) {
            dVar2 = C56425d.f150537g;
        }
        return m37898i(dVar2);
    }

    /* renamed from: b */
    public final C60870cx mo25099b() {
        return null;
    }

    /* renamed from: e */
    public final void mo25237e() {
        Object obj;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        String str;
        Drawable drawable;
        C56425d dVar = this.f57588z;
        C62940bt r2 = C62942bv.checkIsLite(C19968co.f55916C);
        dVar.mo58887l(r2);
        Object l = dVar.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj = r2.f169969b;
        } else {
            obj = r2.mo58889c(l);
        }
        C19968co coVar = (C19968co) obj;
        this.f56238e = coVar;
        if (!C20482m.m38447o(coVar.f55921b)) {
            this.f56239f = new SpannableString(this.f56238e.f55921b);
        } else if (this.f56238e.f55934o.size() > 0) {
            C62971cq<C56425d> cqVar = this.f56238e.f55934o;
            Context context = this.f56234a;
            C20524l lVar = this.f56235b;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (C56425d i : cqVar) {
                C56425d i2 = m37898i(i);
                if (i2 == null) {
                    C20598by G = mo25418G();
                    G.mo25535e(C19742a.INVALID_CHILD);
                    G.mo25536f("Found a span containing non-span children.");
                    C20520h.m38498c("SpanComponent", G.mo25531a(), this.f56236c, new Object[0]);
                } else {
                    C20058bp bpVar = r6;
                    C20058bp bpVar2 = new C20058bp(context, i2, lVar, this.f56236c, this.f56237d, this.f56244k);
                    bpVar.mo25237e();
                    C20058bp bpVar3 = bpVar;
                    if (bpVar3.f56240g) {
                        this.f56240g = true;
                    }
                    spannableStringBuilder.append(bpVar3.f56239f);
                }
            }
            this.f56239f = SpannableString.valueOf(spannableStringBuilder);
        } else {
            this.f56239f = new SpannableString(BuildConfig.FLAVOR);
        }
        C19968co coVar2 = this.f56238e;
        if ((coVar2.f55920a & C89885b.NOW_VALUE) != 0) {
            C19966cm cmVar = coVar2.f55943x;
            if (cmVar == null) {
                cmVar = C19966cm.f55909d;
            }
            int a = C19965cl.m37784a(cmVar.f55911a);
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (i3 == 1) {
                drawable = C1877c.m5125a(this.f56234a, R.drawable.quantum_ic_amp_white_18);
                drawable.setColorFilter(-5855578, PorterDuff.Mode.MULTIPLY);
            } else if (i3 != 2) {
                C20598by G2 = mo25418G();
                G2.mo25535e(C19742a.UNSUPPORTED_ENUM_TYPE);
                G2.mo25536f("Unable to add image span, unsupported icon type specified: ".concat(Integer.toString(i3)));
                G2.mo25534d(m37897g(this.f56238e));
                C20520h.m38498c("SpanComponent", G2.mo25531a(), this.f56236c, new Object[0]);
                return;
            } else {
                drawable = C1877c.m5125a(this.f56234a, R.drawable.quantum_ic_g_translate_white_18);
                drawable.setColorFilter(-5855578, PorterDuff.Mode.MULTIPLY);
            }
            Context context2 = this.f56234a;
            float f = cmVar.f55912b;
            drawable.setBounds(0, 0, (int) (C20482m.m38434b(context2) * f), (int) (C20482m.m38434b(this.f56234a) * cmVar.f55913c));
            this.f56239f.setSpan(new C20031a(drawable), 0, this.f56239f.length(), 33);
            return;
        }
        SpannableString spannableString = this.f56239f;
        Object[] spans = spannableString.getSpans(0, spannableString.length(), Object.class);
        int length = spans.length;
        if (length > 0) {
            iArr2 = new int[length];
            iArr = new int[length];
            iArr3 = new int[length];
            for (int i4 = 0; i4 < spans.length; i4++) {
                Object obj2 = spans[i4];
                iArr2[i4] = this.f56239f.getSpanStart(obj2);
                iArr[i4] = this.f56239f.getSpanEnd(obj2);
                iArr3[i4] = this.f56239f.getSpanFlags(obj2);
                this.f56239f.removeSpan(obj2);
            }
        } else {
            iArr2 = null;
            iArr3 = null;
            iArr = null;
        }
        C19968co coVar3 = this.f56238e;
        if ((coVar3.f55920a & 32768) != 0) {
            C19983f fVar = coVar3.f55937r;
            if (fVar == null) {
                fVar = C19983f.f56002g;
            }
            if (!fVar.f56005b.isEmpty()) {
                str = fVar.f56005b;
            } else {
                str = fVar.f56006c;
            }
            if (TextUtils.isEmpty(str)) {
                C20598by G3 = mo25418G();
                G3.mo25535e(C19742a.EMPTY_RESOURCE);
                G3.mo25536f("Span has action proto but no url!  This could crash the app.");
                G3.mo25534d(m37897g(this.f56238e));
                C20520h.m38498c("SpanComponent", G3.mo25531a(), this.f56236c, new Object[0]);
            } else {
                this.f56240g = true;
                SpanComponent$3 spanComponent$3 = new SpanComponent$3(this, str, fVar);
                SpannableString spannableString2 = this.f56239f;
                spannableString2.setSpan(spanComponent$3, 0, spannableString2.length(), 33);
            }
        }
        C19968co coVar4 = this.f56238e;
        if ((coVar4.f55920a & 1048576) != 0) {
            String str2 = coVar4.f55942w;
            C58485gu n = C58485gu.m89846n(str2);
            this.f56237d.mo25477b(Integer.toString(str2.hashCode()), n);
            this.f56240g = true;
            SpanComponent$4 spanComponent$4 = new SpanComponent$4(this, str2, str2, n);
            SpannableString spannableString3 = this.f56239f;
            spannableString3.setSpan(spanComponent$4, 0, spannableString3.length(), 33);
        }
        if (this.f56238e.f55944y) {
            this.f56240g = true;
            C20057bo boVar = new C20057bo(this);
            SpannableString spannableString4 = this.f56239f;
            spannableString4.setSpan(boVar, 0, spannableString4.length(), 33);
        }
        C20056bn bnVar = new C20056bn(this);
        SpannableString spannableString5 = this.f56239f;
        spannableString5.setSpan(bnVar, 0, spannableString5.length(), 33);
        C19968co coVar5 = this.f56238e;
        if (coVar5.f55938s) {
            if (coVar5.f55933n || coVar5.f55932m) {
                C20598by G4 = mo25418G();
                G4.mo25535e(C19742a.CONFLICT_ATTRIBUTE_SETTING);
                G4.mo25536f("Illegal arguments: border should not be set with untruncatable or more_link.");
                G4.mo25534d(m37897g(this.f56238e));
                C20520h.m38498c("SpanComponent", G4.mo25531a(), this.f56236c, new Object[0]);
            } else {
                C20032b bVar = new C20032b(this.f56234a, coVar5.f55939t);
                SpannableString spannableString6 = this.f56239f;
                spannableString6.setSpan(bVar, 0, spannableString6.length(), 33);
                this.f56243j = true;
            }
        }
        C19968co coVar6 = this.f56238e;
        float f2 = coVar6.f55926g;
        if (f2 != 0.0f) {
            if (coVar6.f55925f) {
                this.f56239f.setSpan(new SuperscriptSpan(), 0, this.f56239f.length(), 33);
                this.f56239f.setSpan(new RelativeSizeSpan(f2), 0, this.f56239f.length(), 33);
            }
            C19968co coVar7 = this.f56238e;
            if (coVar7.f55924e) {
                this.f56239f.setSpan(new RelativeSizeSpan(coVar7.f55926g), 0, this.f56239f.length(), 33);
                this.f56239f.setSpan(new SubscriptSpan(), 0, this.f56239f.length(), 33);
            }
        }
        if (!BuildConfig.FLAVOR.equals(this.f56238e.f55935p) || this.f56238e.f55936q != 0.0f) {
            float f3 = this.f56238e.f55936q;
            if (f3 == 0.0f) {
                f3 = 20.0f;
            }
            C20038h hVar = new C20038h((int) (C20482m.m38434b(this.f56234a) * f3), this.f56238e.f55935p);
            SpannableString spannableString7 = this.f56239f;
            spannableString7.setSpan(hVar, 0, spannableString7.length(), 33);
        }
        C19968co coVar8 = this.f56238e;
        if (coVar8.f55932m) {
            this.f56242i = true;
        }
        if (coVar8.f55933n) {
            this.f56241h = true;
        }
        if (coVar8.f55940u) {
            C20042l lVar2 = new C20042l();
            SpannableString spannableString8 = this.f56239f;
            spannableString8.setSpan(lVar2, 0, spannableString8.length(), 33);
        }
        float f4 = this.f56238e.f55941v;
        if (f4 > 0.0f) {
            C20036f fVar2 = new C20036f(this.f56234a, f4);
            SpannableString spannableString9 = this.f56239f;
            spannableString9.setSpan(fVar2, 0, spannableString9.length(), 33);
        }
        if (this.f56238e.f55945z) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f56239f);
            for (int i5 = 0; i5 < spannableStringBuilder2.length(); i5++) {
                if (spannableStringBuilder2.charAt(i5) == ' ') {
                    spannableStringBuilder2.replace(i5, i5 + 1, " ");
                }
            }
            this.f56239f = SpannableString.valueOf(spannableStringBuilder2);
        }
        if (iArr2 != null) {
            for (int i6 = 0; i6 < spans.length; i6++) {
                this.f56239f.setSpan(spans[i6], iArr2[i6], iArr[i6], iArr3[i6]);
            }
        }
    }

    /* renamed from: kD */
    public final void mo25181kD(float f, float f2, float f3, float f4) {
    }

    /* renamed from: kH */
    public final View mo25098kH() {
        return null;
    }

    /* renamed from: ky */
    public final C20476g mo25200ky() {
        return null;
    }
}
