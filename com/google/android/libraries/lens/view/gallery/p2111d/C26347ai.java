package com.google.android.libraries.lens.view.gallery.p2111d;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.ai */
/* compiled from: PG */
public final class C26347ai extends C0673gh implements C26355aq {

    /* renamed from: a */
    public final C26354ap f71623a;

    /* renamed from: b */
    public final TextView f71624b = ((TextView) this.itemView.findViewById(R.id.lens_gallery_section_title));

    /* renamed from: c */
    public final TextView f71625c = ((TextView) this.itemView.findViewById(R.id.lens_gallery_section_expand_button));

    public C26347ai(ViewGroup viewGroup, C26354ap apVar) {
        super(apVar.mo31549a(R.layout.lens_gallery_section_header, viewGroup));
        this.f71623a = apVar;
    }

    /* renamed from: a */
    public final void mo31534a() {
        this.f71624b.setText(BuildConfig.FLAVOR);
        this.f71625c.setOnClickListener((View.OnClickListener) null);
        if (this.f71625c.getVisibility() == 0) {
            C28306ab.m52929e(this.f71625c);
        }
    }

    /* renamed from: b */
    public final void mo31540b(String str) {
        this.f71624b.setText(str);
        this.f71625c.setVisibility(8);
    }
}
