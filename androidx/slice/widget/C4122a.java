package androidx.slice.widget;

import android.content.Context;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* renamed from: androidx.slice.widget.a */
/* compiled from: PG */
public final class C4122a extends FrameLayout {

    /* renamed from: a */
    private final LinearLayout f13220a;

    public C4122a(Context context) {
        super(context);
        TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics());
        LinearLayout linearLayout = new LinearLayout(context);
        this.f13220a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(linearLayout);
    }
}
