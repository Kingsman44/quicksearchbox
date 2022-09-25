package androidx.p111g.p112a;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.g.a.d */
/* compiled from: PG */
final class C2256d implements TextWatcher, SpanWatcher {

    /* renamed from: a */
    final Object f6345a;

    /* renamed from: b */
    public final AtomicInteger f6346b = new AtomicInteger(0);

    public C2256d(Object obj) {
        this.f6345a = obj;
    }

    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f6345a).afterTextChanged(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f6345a).beforeTextChanged(charSequence, i, i2, i3);
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f6346b.get() <= 0 || !(obj instanceof C2255c)) {
            ((SpanWatcher) this.f6345a).onSpanAdded(spannable, obj, i, i2);
        }
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (this.f6346b.get() <= 0 || !(obj instanceof C2255c)) {
            ((SpanWatcher) this.f6345a).onSpanChanged(spannable, obj, i, i2, i3, i4);
        }
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f6346b.get() <= 0 || !(obj instanceof C2255c)) {
            ((SpanWatcher) this.f6345a).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f6345a).onTextChanged(charSequence, i, i2, i3);
    }
}
