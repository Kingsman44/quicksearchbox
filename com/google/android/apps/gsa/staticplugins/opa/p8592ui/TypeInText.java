package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.staticplugins.opa.C109736nj;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.TypeInText */
/* compiled from: PG */
public class TypeInText extends FlexboxLayout {

    /* renamed from: a */
    private static final Interpolator f314931a = C91107f.m148859b(0.1f, 0.0f, 0.0f, 1.0f);

    /* renamed from: b */
    private static final Interpolator f314932b = C91107f.m148859b(0.16f, 0.16f, 0.2f, 1.0f);

    /* renamed from: c */
    private static final C58869cf f314933c = C58869cf.m90936b(new C58903m(' ')).mo56151a().mo56152f(C58911u.f156751b);

    /* renamed from: d */
    private String f314934d;

    /* renamed from: e */
    private int f314935e;

    public TypeInText(Context context) {
        this(context, (AttributeSet) null);
    }

    public TypeInText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C109736nj.f305727a, 0, 0);
            try {
                this.f314935e = obtainStyledAttributes.getResourceId(91, -1);
                String string = obtainStyledAttributes.getString(47);
                this.f314934d = string;
                if (string != null) {
                    List i = f314933c.mo56155i(string);
                    for (int i2 = 0; i2 < i.size(); i2++) {
                        TextView textView = new TextView(getContext());
                        StringBuilder sb = new StringBuilder();
                        sb.append((String) i.get(i2));
                        if (i2 != i.size() - 1) {
                            sb.append(' ');
                        }
                        textView.setText(sb);
                        int i3 = this.f314935e;
                        if (i3 != -1) {
                            textView.setTextAppearance(i3);
                        }
                        addView(textView);
                    }
                }
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt = getChildAt(i4);
                    AnimationSet animationSet = new AnimationSet(false);
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) getContext().getResources().getDimensionPixelSize(R.dimen.greeting_text_animation_translation_y), 0.0f);
                    translateAnimation.setDuration(666);
                    translateAnimation.setInterpolator(f314931a);
                    animationSet.addAnimation(translateAnimation);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(433);
                    alphaAnimation.setInterpolator(f314932b);
                    animationSet.addAnimation(alphaAnimation);
                    animationSet.setStartOffset((long) (i4 * 133));
                    childAt.startAnimation(animationSet);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        mo117383z();
    }
}
