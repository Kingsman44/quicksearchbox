package com.google.android.libraries.lens.view.gallery.p2111d;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.ab */
/* compiled from: PG */
public final class C26340ab extends C0673gh implements C26355aq {

    /* renamed from: a */
    public final C26354ap f71599a;

    /* renamed from: b */
    public final ViewGroup f71600b;

    /* renamed from: c */
    public final Button f71601c = ((Button) this.itemView.findViewById(R.id.sample_images_storage_denial_open_gallery_button));

    /* renamed from: d */
    public final Button f71602d = ((Button) this.itemView.findViewById(R.id.sample_images_storage_denial_open_settings_button));

    /* renamed from: e */
    public final View f71603e = this.itemView.findViewById(R.id.sample_images_storage_denial_shop_card);

    /* renamed from: f */
    public final View f71604f = this.itemView.findViewById(R.id.sample_images_storage_denial_plant_card);

    /* renamed from: g */
    public final View f71605g = this.itemView.findViewById(R.id.sample_images_storage_denial_math_card);

    /* renamed from: h */
    public final boolean f71606h;

    /* renamed from: i */
    public final View f71607i = this.itemView.findViewById(R.id.sample_images_storage_denial_arabic_card);

    /* renamed from: j */
    public final View f71608j = this.itemView.findViewById(R.id.sample_images_storage_denial_english_card);

    /* renamed from: k */
    public final View f71609k = this.itemView.findViewById(R.id.sample_images_storage_denial_japanese_card);

    public C26340ab(ViewGroup viewGroup, C26354ap apVar, boolean z) {
        super(apVar.mo31549a(R.layout.sample_images_storage_denial, viewGroup));
        this.f71599a = apVar;
        this.f71600b = viewGroup;
        this.f71606h = z;
    }

    /* renamed from: a */
    public final void mo31534a() {
        this.f71601c.setOnClickListener((View.OnClickListener) null);
        this.f71602d.setOnClickListener((View.OnClickListener) null);
        this.f71603e.setOnClickListener((View.OnClickListener) null);
        this.f71604f.setOnClickListener((View.OnClickListener) null);
        this.f71605g.setOnClickListener((View.OnClickListener) null);
        this.f71607i.setOnClickListener((View.OnClickListener) null);
        this.f71608j.setOnClickListener((View.OnClickListener) null);
        this.f71609k.setOnClickListener((View.OnClickListener) null);
        if (this.f71606h) {
            C28306ab.m52929e(this.f71607i);
            C28306ab.m52929e(this.f71608j);
            C28306ab.m52929e(this.f71609k);
        } else {
            C28306ab.m52929e(this.f71603e);
            C28306ab.m52929e(this.f71604f);
            C28306ab.m52929e(this.f71605g);
        }
        if (this.f71601c.getVisibility() == 0) {
            C28306ab.m52929e(this.f71601c);
        } else {
            C28306ab.m52929e(this.f71602d);
        }
        C28306ab.m52929e(this.itemView);
    }
}
