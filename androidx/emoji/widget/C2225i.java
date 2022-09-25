package androidx.emoji.widget;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import androidx.emoji.p108a.C2205o;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji.widget.i */
/* compiled from: PG */
final class C2225i implements TextWatcher, SpanWatcher {

    /* renamed from: a */
    final Object f6283a;

    /* renamed from: b */
    public final AtomicInteger f6284b = new AtomicInteger(0);

    public C2225i(Object obj) {
        this.f6283a = obj;
    }

    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f6283a).afterTextChanged(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f6283a).beforeTextChanged(charSequence, i, i2, i3);
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f6284b.get() <= 0 || !(obj instanceof C2205o)) {
            ((SpanWatcher) this.f6283a).onSpanAdded(spannable, obj, i, i2);
        }
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (this.f6284b.get() <= 0 || !(obj instanceof C2205o)) {
            ((SpanWatcher) this.f6283a).onSpanChanged(spannable, obj, i, i2, i3, i4);
        }
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f6284b.get() <= 0 || !(obj instanceof C2205o)) {
            ((SpanWatcher) this.f6283a).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f6283a).onTextChanged(charSequence, i, i2, i3);
    }
}
