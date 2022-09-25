package android.support.p033v7.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.bh */
/* compiled from: PG */
final class C0538bh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TextView f2110a;

    /* renamed from: b */
    final /* synthetic */ Typeface f2111b;

    /* renamed from: c */
    final /* synthetic */ int f2112c;

    public C0538bh(TextView textView, Typeface typeface, int i) {
        this.f2110a = textView;
        this.f2111b = typeface;
        this.f2112c = i;
    }

    public final void run() {
        this.f2110a.setTypeface(this.f2111b, this.f2112c);
    }
}
