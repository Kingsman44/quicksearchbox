package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91948x;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.TextViewWithImages */
/* compiled from: PG */
public class TextViewWithImages extends TextView {

    /* renamed from: a */
    public final Object f292780a;

    /* renamed from: b */
    public final Map f292781b;

    public TextViewWithImages(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo94503a(CharSequence charSequence, C91189au auVar) {
        SpannableStringBuilder spannableStringBuilder;
        Uri parse;
        super.setText(charSequence);
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        for (ImageSpan imageSpan : (ImageSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ImageSpan.class)) {
            if (!(imageSpan.getSource() == null || (imageSpan instanceof C91948x) || (parse = Uri.parse(imageSpan.getSource())) == null)) {
                C60870cx d = auVar.mo85417d(parse);
                auVar.mo85428r(d, "TextViewWithImages.ImageCallback", new C105084u(imageSpan, spannableStringBuilder, this));
                this.f292781b.put(imageSpan.getSource(), d);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        for (C60870cx cancel : this.f292781b.values()) {
            cancel.cancel(false);
        }
        this.f292781b.clear();
        super.onDetachedFromWindow();
    }

    public TextViewWithImages(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextViewWithImages(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f292780a = new Object();
        this.f292781b = new HashMap();
    }
}
