package com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1745d;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.common.C30910aj;
import com.google.android.libraries.p2203m.p2204a.C28487a;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.c.s */
/* compiled from: PG */
public final class C30572s extends ConstraintLayout {

    /* renamed from: a */
    public final Runnable f82592a;

    public C30572s(Context context, CharSequence charSequence, Drawable drawable, Runnable runnable) {
        super(context);
        this.f82592a = runnable;
        boolean z = true;
        LayoutInflater.from(context).inflate(R.layout.og_tooltip_content, this, true);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.og_slim_card_spacing);
        C2043bi.m5556aj(this, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        String string = C30910aj.m57700a(context) ? context.getString(R.string.og_a11y_close) : null;
        m57132a(R.id.og_tooltip_title, (CharSequence) null);
        m57132a(R.id.og_tooltip_detail, charSequence);
        m57132a(R.id.og_tooltip_dismiss_button, string);
        boolean z2 = !TextUtils.isEmpty((CharSequence) null);
        if (drawable != null) {
            ImageView imageView = (ImageView) findViewById(R.id.image);
            C1745d dVar = (C1745d) imageView.getLayoutParams();
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(z2 ? R.dimen.og_slim_card_icon_size_small : R.dimen.og_slim_card_icon_size_large);
            dVar.height = dimensionPixelSize2;
            dVar.width = dimensionPixelSize2;
            if (z2) {
                C1756o oVar = new C1756o();
                oVar.mo4889i(this);
                oVar.mo4891k(R.id.image, 3, R.id.og_tooltip_title, 3);
                oVar.mo4891k(R.id.image, 4, R.id.og_tooltip_title, 4);
                oVar.mo4888h(this);
                int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.og_slim_card_padding_icon_with_title);
                int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.og_slim_card_spacing);
                C2043bi.m5556aj(this, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3);
            } else {
                z = false;
            }
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            z2 = z;
        }
        TextView textView = (TextView) findViewById(R.id.og_tooltip_detail);
        if (z2) {
            textView.setTextAppearance(C30899a.m57683b(context, R.attr.ogTextAppearanceBody2).resourceId);
            textView.setTextColor(C28487a.m53260a(context, R.attr.slimCardDetailWithTitleTextColor));
        } else {
            textView.setTextAppearance(C30899a.m57683b(context, R.attr.ogTextAppearanceBody1).resourceId);
            textView.setTextColor(C28487a.m53260a(context, R.attr.slimCardDetailTextColor));
        }
        String str = String.valueOf(charSequence) + "\n" + context.getString(R.string.og_open_account_and_settings);
        setContentDescription(z2 ? "null\n".concat(str) : str);
    }

    /* renamed from: a */
    private final void m57132a(int i, CharSequence charSequence) {
        TextView textView = (TextView) findViewById(i);
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }
}
