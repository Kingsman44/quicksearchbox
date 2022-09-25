package com.google.android.libraries.lens.view.gallery.p2111d;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.C6007z;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.common.RoundedImageView;
import com.google.android.libraries.lens.view.gallery.data.C26404w;
import com.google.android.libraries.lens.view.gallery.p2110c.C26336d;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.x */
/* compiled from: PG */
public final class C26378x extends C0673gh implements C26355aq {

    /* renamed from: a */
    public final C26354ap f71753a;

    /* renamed from: b */
    public final C26353ao f71754b;

    /* renamed from: c */
    public final RoundedImageView f71755c;

    /* renamed from: d */
    public int f71756d = 1;

    /* renamed from: e */
    private final C47449e f71757e;

    public C26378x(ViewGroup viewGroup, C26354ap apVar, C47449e eVar, C26353ao aoVar) {
        super(apVar.mo31549a(R.layout.lens_gallery_item, viewGroup));
        this.f71753a = apVar;
        this.f71757e = eVar;
        this.f71754b = aoVar;
        this.f71755c = (RoundedImageView) this.itemView.findViewById(R.id.lens_gallery_item_image_view);
    }

    /* renamed from: a */
    public final void mo31534a() {
        C26353ao aoVar;
        this.itemView.setOnClickListener((View.OnClickListener) null);
        this.itemView.setImportantForAccessibility(0);
        this.itemView.setContentDescription(BuildConfig.FLAVOR);
        C47449e eVar = this.f71757e;
        eVar.mo51286a().mo11876n(this.f71755c);
        this.f71755c.setImageDrawable((Drawable) null);
        C26354ap apVar = this.f71753a;
        RoundedImageView roundedImageView = this.f71755c;
        float f = apVar.f71645b;
        roundedImageView.mo17754z().mo30897a(f, f, f, f);
        int i = this.f71756d;
        if (i != 0) {
            if (i == 2 && (aoVar = this.f71754b) != null) {
                aoVar.mo31548c(new C26352an(aoVar));
            }
            this.f71756d = 1;
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo31573b(C26404w wVar, int i, boolean z, int i2, int i3, C26336d dVar, C21370a aVar, C28443m mVar, C47770dh dhVar) {
        this.itemView.setOnClickListener(new C47591co(dhVar, "Click photo", new C26376v(this, i2, i, aVar, wVar, mVar)));
        int i4 = i2;
        int i5 = i3;
        this.f71753a.mo31552d(this.f71755c, i2, i3);
        this.itemView.setImportantForAccessibility(1);
        if (i == 2) {
            View view = this.itemView;
            view.setContentDescription(view.getContext().getString(R.string.lens_gallery_screenshot_content_description));
        } else {
            View view2 = this.itemView;
            view2.setContentDescription(view2.getContext().getString(R.string.lens_gallery_image_content_description));
        }
        C26353ao aoVar = this.f71754b;
        if (aoVar != null) {
            aoVar.mo31548c(new C26351am(aoVar));
        }
        this.f71755c.mo17754z().mo30898b(true != z ? 1.0f : 1.5f);
        this.f71756d = 2;
        C26404w wVar2 = wVar;
        C6007z a = dVar.mo31531a(wVar).mo12439a(new C26377w(this));
        RoundedImageView roundedImageView = this.f71755c;
        roundedImageView.getClass();
        a.mo12454r(roundedImageView);
    }
}
