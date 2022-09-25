package com.google.android.libraries.lens.view.filters.translation.tooltip;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.translation.C26111cv;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.tooltip.d */
/* compiled from: PG */
public final class C26223d {

    /* renamed from: a */
    public final TranslationTooltipView f71263a;

    /* renamed from: b */
    public final int f71264b;

    /* renamed from: com.google.android.libraries.lens.view.filters.translation.tooltip.d$a */
    /* compiled from: PG */
    public final class C26224a implements C47388b {
    }

    public C26223d(TranslationTooltipView translationTooltipView, C28306ab abVar, C28443m mVar, C47770dh dhVar) {
        this.f71263a = translationTooltipView;
        this.f71264b = translationTooltipView.getContext().getResources().getInteger(17694720);
        abVar.mo33801b(translationTooltipView, abVar.f76990a.mo33805a(C28427h.m53115a(153642)));
        abVar.mo33801b(translationTooltipView.findViewById(R.id.partial_translate_tooltip_dismiss_button), abVar.f76990a.mo33805a(C28427h.m53115a(153643)));
        translationTooltipView.findViewById(R.id.partial_translate_tooltip_dismiss_button).setOnClickListener(new C47591co(dhVar, "Click translate tooltip dismiss", new C26221b(mVar)));
    }

    /* renamed from: a */
    public final void mo31443a(Runnable runnable) {
        if (this.f71263a.getVisibility() == 0) {
            this.f71263a.animate().alpha(0.0f).setDuration((long) this.f71264b).setListener(new C26222c(this, runnable));
        } else if (runnable != null) {
            ((C26111cv) runnable).f70950a.mo31301d();
        }
    }
}
