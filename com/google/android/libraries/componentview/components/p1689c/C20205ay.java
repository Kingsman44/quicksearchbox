package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19985h;
import com.google.android.libraries.componentview.components.base.p1687a.C19987j;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20116am;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20118ao;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20119ap;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.logging.C28285c;
import com.google.common.p4552o.C60321oe;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.componentview.components.c.ay */
/* compiled from: PG */
public class C20205ay extends C20061bs {

    /* renamed from: b */
    private static final int f56726b = Color.argb(Math.round(221.85f), 0, 0, 0);

    /* renamed from: c */
    private static final int f56727c = Color.argb(Math.round(137.70001f), 0, 0, 0);

    /* renamed from: d */
    private static final int f56728d = Color.argb(Math.round(96.9f), 0, 0, 0);

    /* renamed from: a */
    public EditText f56729a;

    /* renamed from: e */
    private final C20601ca f56730e;

    public C20205ay(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f56730e = caVar;
    }

    /* renamed from: i */
    public static C56425d m38023i(C20119ap apVar) {
        C56424c cVar = (C56424c) C56425d.f150537g.createBuilder();
        cVar.mo58885m(C20119ap.f56376s, apVar);
        cVar.copyOnWrite();
        C56425d dVar = (C56425d) cVar.instance;
        dVar.f150539a |= 1;
        dVar.f150540b = "android-edit-text";
        return (C56425d) cVar.build();
    }

    /* renamed from: A */
    public final void mo25289A(String str) {
        ((EditText) this.f56305p).setText(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        EditText editText = new EditText(context);
        this.f56729a = editText;
        editText.setImeOptions(268435456);
        return this.f56729a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        int i;
        String str;
        int i2;
        C62940bt r0 = C62942bv.checkIsLite(C20119ap.f56376s);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20119ap apVar = (C20119ap) obj;
        ((EditText) this.f56305p).setFocusable(true);
        if (apVar.f56392o) {
            ((EditText) this.f56305p).setSelectAllOnFocus(true);
        }
        if ((apVar.f56378a & 1) != 0) {
            ((EditText) this.f56305p).setText(apVar.f56379b);
        }
        if ((apVar.f56378a & 2048) != 0) {
            ((EditText) this.f56305p).setHint(apVar.f56390m);
            ((EditText) this.f56305p).setHintTextColor(-3355444);
        }
        int a = C20116am.m37975a(apVar.f56381d);
        if (a == 0) {
            a = 1;
        }
        int i3 = a - 1;
        if (i3 != 1) {
            i = i3 != 2 ? i3 != 3 ? -16777216 : f56728d : f56727c;
        } else {
            i = f56726b;
        }
        ((EditText) this.f56305p).setTextColor(i);
        int i4 = 0;
        if ((apVar.f56378a & 16384) != 0 && apVar.f56393p) {
            ((EditText) this.f56305p).setBackgroundColor(0);
        }
        int a2 = C20118ao.m37976a(apVar.f56391n);
        if (a2 == 0) {
            a2 = 1;
        }
        int i5 = a2 - 1;
        int i6 = i5 != 1 ? i5 != 2 ? 1 : 8194 : 2;
        if ((apVar.f56378a & 64) != 0 && ((i2 = apVar.f56385h) == 0 || i2 > 1)) {
            ((EditText) this.f56305p).setSingleLine(false);
            i6 |= C89885b.S3REQUEST_VALUE;
            ((EditText) this.f56305p).setMaxLines(apVar.f56385h);
        }
        ((EditText) this.f56305p).setInputType(i6);
        float f = apVar.f56384g;
        if (f != 0.0f) {
            ((EditText) this.f56305p).setTextSize(f);
        }
        if (!apVar.f56382e) {
            int a3 = C19985h.m37787a(apVar.f56383f);
            if (a3 == 0) {
                a3 = 1;
            }
            switch (a3 - 1) {
                case 1:
                    str = "sans-serif-thin";
                    break;
                case 2:
                    str = "sans-serif-light";
                    break;
                case 3:
                    str = "sans-serif";
                    break;
                case 4:
                    str = "sans-serif-medium";
                    break;
                case 5:
                    str = "sans-serif";
                    i4 = 1;
                    break;
                case 6:
                    str = "sans-serif-black";
                    break;
                default:
                    str = null;
                    break;
            }
        } else {
            int a4 = C19985h.m37787a(apVar.f56383f);
            str = (a4 != 0 && a4 == 3) ? "sans-serif-condensed-light" : "sans-serif-condensed";
        }
        if (str != null) {
            ((EditText) this.f56305p).setTypeface(Typeface.create(str, i4));
        }
        int a5 = C19987j.m37788a(apVar.f56387j);
        if (a5 == 0) {
            a5 = 1;
        }
        int i7 = a5 - 1;
        ((EditText) this.f56305p).setGravity(i7 != 1 ? i7 != 2 ? 8388611 : 8388613 : 17);
        if (apVar.f56386i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setStroke(2, -3355444);
            ((EditText) this.f56305p).setBackground(gradientDrawable);
        }
        if ((apVar.f56378a & 32768) != 0) {
            C19916aq aqVar = apVar.f56394q;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
        float f2 = apVar.f56388k;
        if (!(f2 == 0.0f && apVar.f56389l == 0.0f)) {
            int a6 = (int) (C20482m.m38433a(this.f56304o) * f2);
            float f3 = apVar.f56389l;
            if (f3 == 0.0f) {
                f3 = 1.0f;
            }
            ((EditText) this.f56305p).setLineSpacing((float) a6, f3);
        }
        View view = this.f56305p;
        C2043bi.m5556aj(view, ((EditText) view).getPaddingLeft(), ((EditText) this.f56305p).getPaddingTop() + (((((EditText) this.f56305p).getLineHeight() - ((EditText) this.f56305p).getPaint().getFontMetricsInt((Paint.FontMetricsInt) null)) + 1) / 2), ((EditText) this.f56305p).getPaddingRight(), ((EditText) this.f56305p).getPaddingBottom() + ((((EditText) this.f56305p).getLineHeight() - ((EditText) this.f56305p).getPaint().getFontMetricsInt((Paint.FontMetricsInt) null)) / 2));
    }

    /* renamed from: m */
    public final String mo25290m() {
        return ((EditText) this.f56305p).getText().toString();
    }

    /* renamed from: n */
    public final void mo25291n(TextWatcher textWatcher) {
        ((EditText) this.f56305p).addTextChangedListener(textWatcher);
    }

    /* renamed from: o */
    public final void mo25292o() {
        C60321oe i = C28285c.m52882i(this.f56305p, 5, (Integer) null);
        if (i != null) {
            this.f56730e.mo25490e(i);
        }
    }

    /* renamed from: p */
    public final void mo25192p(float f, float f2, float f3, float f4) {
        if (((EditText) this.f56305p).getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) ((EditText) this.f56305p).getBackground()).setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
            return;
        }
        super.mo25192p(f, f2, f3, f4);
    }
}
