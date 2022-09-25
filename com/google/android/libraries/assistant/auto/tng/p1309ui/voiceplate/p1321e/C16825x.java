package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12995m;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.x */
/* compiled from: PG */
final class C16825x implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C12995m f49265a;

    /* renamed from: b */
    final /* synthetic */ C16826y f49266b;

    public C16825x(C16826y yVar, C12995m mVar) {
        this.f49266b = yVar;
        this.f49265a = mVar;
    }

    public final void onGlobalLayout() {
        if (this.f49266b.f49267a.isInTouchMode() || this.f49265a.f40397b) {
            this.f49266b.f49267a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C16826y yVar = this.f49266b;
            if (yVar.f49267a.canScrollVertically(1) || yVar.f49267a.canScrollVertically(-1)) {
                View findViewById = yVar.f49268b.findViewById(R.id.scrollbar_up_button);
                View findViewById2 = yVar.f49268b.findViewById(R.id.scrollbar_down_button);
                findViewById.setVisibility(0);
                findViewById2.setVisibility(0);
                findViewById.setAlpha(yVar.f49270d);
                findViewById2.setAlpha(yVar.f49269c);
                findViewById.setOnClickListener(new C16823v(yVar));
                findViewById2.setOnClickListener(new C16824w(yVar));
                yVar.f49267a.setOnScrollChangeListener(new C16822u(yVar, findViewById2, findViewById));
                return;
            }
            yVar.mo23047a();
        }
    }
}
