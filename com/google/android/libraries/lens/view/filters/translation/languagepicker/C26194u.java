package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.u */
/* compiled from: PG */
final class C26194u extends C46756m {

    /* renamed from: a */
    final /* synthetic */ C26197x f71175a;

    public C26194u(C26197x xVar) {
        this.f71175a = xVar;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lens_translate_filter_language_header, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        C26134ac acVar = (C26134ac) ((C26133ab) obj);
        C26186m mVar = new C26186m(view);
        mVar.f71159e.setText(acVar.mo31353a());
        TextView textView = mVar.f71159e;
        Context context = this.f71175a.f71177a;
        textView.setContentDescription(context.getString(R.string.lens_translate_language_picker_list_section_title_content_desc, new Object[]{context.getString(acVar.mo31353a())}));
        this.f71175a.mo31420c(mVar.f71159e, true != acVar.mo31354b() ? 16 : 8);
    }
}
