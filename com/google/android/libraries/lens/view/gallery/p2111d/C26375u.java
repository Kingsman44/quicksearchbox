package com.google.android.libraries.lens.view.gallery.p2111d;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.u */
/* compiled from: PG */
public final class C26375u extends C0673gh implements C26355aq {

    /* renamed from: a */
    public final C26354ap f71744a;

    /* renamed from: b */
    public final View f71745b = this.itemView.findViewById(R.id.lens_gallery_permission_card);

    public C26375u(ViewGroup viewGroup, C26354ap apVar) {
        super(apVar.mo31549a(R.layout.lens_gallery_permission_card, viewGroup));
        this.f71744a = apVar;
    }

    /* renamed from: a */
    public final void mo31534a() {
        this.f71745b.setOnClickListener((View.OnClickListener) null);
        C28306ab.m52929e(this.f71745b);
    }
}
