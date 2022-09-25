package com.google.android.libraries.lens.view.filters;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2052ac.C24974a;

/* renamed from: com.google.android.libraries.lens.view.filters.y */
/* compiled from: PG */
public final class C26237y {

    /* renamed from: a */
    private final GuidanceTextView f71292a;

    /* renamed from: b */
    private final C24974a f71293b;

    public C26237y(GuidanceTextView guidanceTextView, C24974a aVar) {
        this.f71292a = guidanceTextView;
        this.f71293b = aVar;
    }

    /* renamed from: b */
    static void m48444b(String str, View view) {
        GuidanceTextView guidanceTextView;
        if (view instanceof GuidanceTextView) {
            guidanceTextView = (GuidanceTextView) view;
        } else if (!str.isEmpty()) {
            ViewStub viewStub = (ViewStub) view;
            viewStub.setLayoutResource(R.layout.filter_guidance);
            guidanceTextView = (GuidanceTextView) viewStub.inflate();
        } else {
            return;
        }
        C26237y a = guidanceTextView.mo17754z();
        ((TextView) a.f71292a.findViewById(R.id.filter_guidance_text)).setText(str);
        a.mo31453a();
    }

    /* renamed from: a */
    public final void mo31453a() {
        GuidanceTextView guidanceTextView = this.f71292a;
        int i = 8;
        if (!TextUtils.isEmpty(((TextView) this.f71292a.findViewById(R.id.filter_guidance_text)).getText()) && (C24974a.m46225a(this.f71293b.f68122a) || this.f71292a.getResources().getConfiguration().orientation != 2)) {
            i = 0;
        }
        guidanceTextView.setVisibility(i);
    }
}
