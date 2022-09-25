package com.google.android.libraries.lens.view.gallery.p2111d;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.sampleimages.widget.SampleImageCard;
import com.google.android.libraries.logging.p2185ve.C28306ab;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.y */
/* compiled from: PG */
public final class C26379y extends C0673gh implements C26355aq {

    /* renamed from: a */
    public final C26354ap f71758a;

    /* renamed from: b */
    public final C24974a f71759b;

    /* renamed from: c */
    public final boolean f71760c;

    /* renamed from: d */
    public final float f71761d = this.itemView.getResources().getDimension(R.dimen.lens_gallery_rounded_corner_outer_radius);

    /* renamed from: e */
    public final float f71762e = this.itemView.getResources().getDimension(R.dimen.lens_gallery_rounded_corner_radius);

    /* renamed from: f */
    public final SampleImageCard f71763f = ((SampleImageCard) this.itemView.findViewById(R.id.sample_images_onboarding_shop_card));

    /* renamed from: g */
    public final SampleImageCard f71764g = ((SampleImageCard) this.itemView.findViewById(R.id.sample_images_onboarding_plant_card));

    /* renamed from: h */
    public final SampleImageCard f71765h = ((SampleImageCard) this.itemView.findViewById(R.id.sample_images_onboarding_math_card));

    /* renamed from: i */
    public final SampleImageCard f71766i = ((SampleImageCard) this.itemView.findViewById(R.id.sample_images_onboarding_translate_card));

    /* renamed from: j */
    public final SampleImageCard f71767j = ((SampleImageCard) this.itemView.findViewById(R.id.sample_images_onboarding_arabic_card));

    /* renamed from: k */
    public final SampleImageCard f71768k = ((SampleImageCard) this.itemView.findViewById(R.id.sample_images_onboarding_english_card));

    /* renamed from: l */
    public final SampleImageCard f71769l = ((SampleImageCard) this.itemView.findViewById(R.id.sample_images_onboarding_japanese_card));

    /* renamed from: m */
    public final boolean f71770m;

    public C26379y(ViewGroup viewGroup, C26354ap apVar, C24974a aVar, boolean z) {
        super(apVar.mo31549a(R.layout.sample_images_onboarding, viewGroup));
        this.f71758a = apVar;
        this.f71759b = aVar;
        this.f71760c = z;
        this.f71770m = this.itemView.getResources().getConfiguration().getLayoutDirection() != 1 ? false : true;
    }

    /* renamed from: a */
    public final void mo31534a() {
        this.f71763f.setOnClickListener((View.OnClickListener) null);
        this.f71764g.setOnClickListener((View.OnClickListener) null);
        this.f71765h.setOnClickListener((View.OnClickListener) null);
        this.f71766i.setOnClickListener((View.OnClickListener) null);
        this.f71767j.setOnClickListener((View.OnClickListener) null);
        this.f71768k.setOnClickListener((View.OnClickListener) null);
        this.f71769l.setOnClickListener((View.OnClickListener) null);
        if (this.f71760c) {
            C28306ab.m52929e(this.f71767j);
            C28306ab.m52929e(this.f71768k);
            C28306ab.m52929e(this.f71769l);
        } else {
            C28306ab.m52929e(this.f71763f);
            C28306ab.m52929e(this.f71764g);
            C28306ab.m52929e(this.f71765h);
            C28306ab.m52929e(this.f71766i);
        }
        C28306ab.m52929e(this.itemView);
    }
}
