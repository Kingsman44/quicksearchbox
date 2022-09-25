package android.support.p033v7.p039d;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: android.support.v7.d.a */
/* compiled from: PG */
public final class C0418a implements TransformationMethod {

    /* renamed from: a */
    private final Locale f1408a;

    public C0418a(Context context) {
        this.f1408a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f1408a);
        }
        return null;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
