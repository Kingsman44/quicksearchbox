package com.google.android.setupdesign.p3558f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.C45251c;
import com.google.android.setupcompat.C45252d;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.view.RichTextView;

/* renamed from: com.google.android.setupdesign.f.h */
/* compiled from: PG */
public final class C45314h {
    /* renamed from: a */
    public static void m80764a(TextView textView, C45313g gVar) {
        Typeface create;
        Typeface create2;
        boolean z;
        int b;
        int b2;
        Context context = textView.getContext();
        if (!(gVar.f118369a == null || !C45240c.m80574e(context).mo49107l(gVar.f118369a) || (b2 = C45240c.m80574e(context).mo49100b(context, gVar.f118369a)) == 0)) {
            textView.setTextColor(b2);
        }
        if (gVar.f118370b != null && C45240c.m80574e(context).mo49107l(gVar.f118370b)) {
            Context context2 = textView.getContext();
            try {
                TemplateLayout b3 = C45312f.m80762b(C45251c.m80608a(context2));
                if (b3 instanceof GlifLayout) {
                    z = ((GlifLayout) b3).mo49120e();
                    if (!z && (b = C45240c.m80574e(context).mo49100b(context, gVar.f118370b)) != 0) {
                        textView.setLinkTextColor(b);
                    }
                }
            } catch (ClassCastException | IllegalArgumentException unused) {
            }
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(new int[]{R.attr.sucFullDynamicColor});
            int[] iArr = C45252d.f118190a;
            boolean hasValue = obtainStyledAttributes.hasValue(0);
            obtainStyledAttributes.recycle();
            z = hasValue;
            textView.setLinkTextColor(b);
        }
        if (gVar.f118371c != null && C45240c.m80574e(context).mo49107l(gVar.f118371c)) {
            float a = C45240c.m80574e(context).mo49099a(context, gVar.f118371c, 0.0f);
            if (a > 0.0f) {
                textView.setTextSize(0, a);
            }
        }
        if (!(gVar.f118372d == null || !C45240c.m80574e(context).mo49107l(gVar.f118372d) || (create2 = Typeface.create(C45240c.m80574e(context).mo49104h(context, gVar.f118372d), 0)) == null)) {
            textView.setTypeface(create2);
        }
        if ((textView instanceof RichTextView) && gVar.f118373e != null && C45240c.m80574e(context).mo49107l(gVar.f118373e) && (create = Typeface.create(C45240c.m80574e(context).mo49104h(context, gVar.f118373e), 0)) != null) {
            RichTextView richTextView = (RichTextView) textView;
            RichTextView.f118432a = create;
        }
        m80765b(textView, gVar);
        textView.setGravity(gVar.f118376h);
    }

    /* renamed from: b */
    public static void m80765b(TextView textView, C45313g gVar) {
        int i;
        int i2;
        if (gVar.f118374f != null || gVar.f118375g != null) {
            Context context = textView.getContext();
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (gVar.f118374f == null || !C45240c.m80574e(context).mo49107l(gVar.f118374f)) {
                    i = layoutParams2.topMargin;
                } else {
                    i = (int) C45240c.m80574e(context).mo49099a(context, gVar.f118374f, 0.0f);
                }
                if (gVar.f118375g == null || !C45240c.m80574e(context).mo49107l(gVar.f118375g)) {
                    i2 = layoutParams2.bottomMargin;
                } else {
                    i2 = (int) C45240c.m80574e(context).mo49099a(context, gVar.f118375g, 0.0f);
                }
                layoutParams2.setMargins(layoutParams2.leftMargin, i, layoutParams2.rightMargin, i2);
                textView.setLayoutParams(layoutParams);
            }
        }
    }
}
