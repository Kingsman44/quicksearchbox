package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.tracing.C47591co;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.bm */
/* compiled from: PG */
final class C26171bm extends C46756m {

    /* renamed from: a */
    final /* synthetic */ Context f71087a;

    /* renamed from: b */
    final /* synthetic */ int f71088b;

    /* renamed from: c */
    final /* synthetic */ Consumer f71089c;

    /* renamed from: d */
    final /* synthetic */ C26173bo f71090d;

    public C26171bm(C26173bo boVar, Context context, int i, Consumer consumer) {
        this.f71090d = boVar;
        this.f71087a = context;
        this.f71088b = i;
        this.f71089c = consumer;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lens_translate_filter_downloadbutton_popup_item, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        C26172bn bnVar = (C26172bn) obj;
        TextView textView = (TextView) view.findViewById(R.id.lens_translate_download_popup_title);
        Drawable drawable = this.f71087a.getDrawable(bnVar.f71097f);
        int i = this.f71088b;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(new InsetDrawable(drawable, i, 0, i, 0), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setText(bnVar.f71096e);
        view.setOnClickListener(new C47591co(this.f71090d.f71098a, "Click language download button popup menu", new C26170bl(this.f71089c, bnVar)));
    }
}
