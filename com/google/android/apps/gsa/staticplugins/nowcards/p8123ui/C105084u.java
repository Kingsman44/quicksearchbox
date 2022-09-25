package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ImageSpan;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.u */
/* compiled from: PG */
final class C105084u extends C90953s {

    /* renamed from: a */
    private final ImageSpan f292820a;

    /* renamed from: b */
    private final Spannable f292821b;

    /* renamed from: c */
    private final WeakReference f292822c;

    public C105084u(ImageSpan imageSpan, Spannable spannable, TextViewWithImages textViewWithImages) {
        super("TextViewWithImages");
        this.f292820a = imageSpan;
        this.f292821b = spannable;
        this.f292822c = new WeakReference(textViewWithImages);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        TextViewWithImages textViewWithImages = (TextViewWithImages) this.f292822c.get();
        if (textViewWithImages != null && drawable != null) {
            ImageSpan imageSpan = this.f292820a;
            Spannable spannable = this.f292821b;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            String source = imageSpan.getSource();
            textViewWithImages.f292781b.remove(source);
            synchronized (textViewWithImages.f292780a) {
                int spanStart = spannable.getSpanStart(imageSpan);
                int spanEnd = spannable.getSpanEnd(imageSpan);
                spannable.removeSpan(imageSpan);
                spannable.setSpan(new ImageSpan(drawable, source), spanStart, spanEnd, 33);
                textViewWithImages.setText(spannable);
            }
        }
    }
}
