package android.support.p033v7.widget;

import android.content.res.TypedArray;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.p111g.p113b.C2267j;

/* renamed from: android.support.v7.widget.ah */
/* compiled from: PG */
final class C0510ah {

    /* renamed from: a */
    public final C2267j f2055a;

    /* renamed from: b */
    private final TextView f2056b;

    public C0510ah(TextView textView) {
        this.f2056b = textView;
        this.f2055a = new C2267j(textView);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2496a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f2056b.getContext().obtainStyledAttributes(attributeSet, C0338a.f1073i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            this.f2055a.f6359a.mo5631a(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
