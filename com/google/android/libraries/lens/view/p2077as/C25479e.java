package com.google.android.libraries.lens.view.p2077as;

import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2099c.C25941f;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;

/* renamed from: com.google.android.libraries.lens.view.as.e */
/* compiled from: PG */
public final class C25479e {

    /* renamed from: a */
    public final C25477c f69427a;

    /* renamed from: b */
    public final C25941f f69428b;

    /* renamed from: c */
    private final int f69429c;

    public C25479e(C25477c cVar, C25941f fVar, C26244b bVar) {
        this.f69427a = cVar;
        this.f69428b = fVar;
        this.f69429c = true != bVar.mo31462g(C26239a.EDUCATION_SELECTION_STATE_ENABLED) ? R.id.selection_state_guidance_text : R.id.homework_selection_state_guidance_text;
    }

    /* renamed from: a */
    public final TextView mo30512a() {
        TextView textView = (TextView) this.f69427a.requireView().findViewById(this.f69429c);
        textView.getClass();
        return textView;
    }
}
