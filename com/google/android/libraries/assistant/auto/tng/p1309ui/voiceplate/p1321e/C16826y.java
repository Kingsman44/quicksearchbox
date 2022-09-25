package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.util.TypedValue;
import android.view.View;
import android.widget.ScrollView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.y */
/* compiled from: PG */
public final class C16826y {

    /* renamed from: a */
    public final ScrollView f49267a;

    /* renamed from: b */
    public final View f49268b;

    /* renamed from: c */
    public final float f49269c;

    /* renamed from: d */
    public final float f49270d;

    public C16826y(ScrollView scrollView, View view) {
        this.f49267a = scrollView;
        this.f49268b = view;
        TypedValue typedValue = new TypedValue();
        view.getResources().getValue(R.dimen.voiceplate_scroll_button_enabled, typedValue, true);
        TypedValue typedValue2 = new TypedValue();
        view.getResources().getValue(R.dimen.voiceplate_scroll_button_disabled, typedValue2, true);
        this.f49269c = typedValue.getFloat();
        this.f49270d = typedValue2.getFloat();
    }

    /* renamed from: a */
    public final void mo23047a() {
        View findViewById = this.f49268b.findViewById(R.id.scrollbar_up_button);
        View findViewById2 = this.f49268b.findViewById(R.id.scrollbar_down_button);
        findViewById.setVisibility(8);
        findViewById2.setVisibility(8);
    }
}
