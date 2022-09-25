package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;

@Deprecated
/* compiled from: PG */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    private final int f3081a = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);

    /* renamed from: b */
    private final int f3082b = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3 = getResources().getDisplayMetrics().widthPixels;
        int i4 = this.f3081a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(i3 - (i4 + i4), this.f3082b), 1073741824), i2);
    }
}
