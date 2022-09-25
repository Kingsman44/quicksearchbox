package com.google.android.libraries.lens.view.frozenimage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.view.gallery.p2112e.C26416i;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p10982ad.C147444h;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.frozenimage.q */
/* compiled from: PG */
public final class C26285q {

    /* renamed from: a */
    public final C26272d f71425a;

    /* renamed from: b */
    public final C26275g f71426b;

    /* renamed from: c */
    public final C28310af f71427c;

    /* renamed from: d */
    public final C28443m f71428d;

    /* renamed from: e */
    public final C28306ab f71429e;

    /* renamed from: f */
    public FrozenImageView f71430f;

    /* renamed from: g */
    C147444h f71431g;

    /* renamed from: h */
    public C26416i f71432h;

    /* renamed from: i */
    private Bitmap f71433i;

    public C26285q(C26272d dVar, C26275g gVar, C28310af afVar, C28443m mVar, C28306ab abVar) {
        this.f71425a = dVar;
        this.f71426b = gVar;
        this.f71427c = afVar;
        this.f71428d = mVar;
        this.f71429e = abVar;
    }

    /* renamed from: a */
    public final void mo31483a() {
        if (!((C58833ax) this.f71426b.f71411a.mo3842a()).mo56113h()) {
            this.f71433i = null;
            this.f71430f.setImageBitmap((Bitmap) null);
            this.f71430f.setImageDrawable((Drawable) null);
        }
    }

    /* renamed from: b */
    public final void mo31484b() {
        C58833ax axVar = (C58833ax) this.f71426b.f71411a.mo3842a();
        if (!axVar.mo56113h()) {
            this.f71433i = null;
            this.f71431g.mo124184j(new C26277i(this)).mo124172b(0.0f);
        } else if (((C25533p) axVar.mo56107c()).mo30569a().mo29791a() || ((C25533p) axVar.mo56107c()).mo30569a() != C24226r.GALLERY) {
            this.f71431g.mo124186l(1.0f);
        } else {
            this.f71431g.mo124179e(1.0f);
        }
    }

    /* renamed from: c */
    public final void mo31485c(Bitmap bitmap) {
        Bitmap bitmap2 = this.f71433i;
        boolean z = bitmap2 != null && bitmap.sameAs(bitmap2);
        this.f71433i = bitmap;
        if (!z || this.f71432h != null) {
            this.f71430f.setImageBitmap(bitmap);
            if (this.f71432h == null) {
                this.f71430f.setVisibility(0);
                mo31484b();
                return;
            }
            this.f71431g.mo124186l(1.0f);
            C26416i iVar = this.f71432h;
            iVar.getClass();
            iVar.f71884o = true;
            if (iVar.f71883n == 1.0f) {
                ImageView imageView = iVar.f71876g;
                imageView.getClass();
                imageView.setVisibility(0);
                iVar.f71870a.setVisibility(8);
                return;
            }
            ImageView imageView2 = iVar.f71870a;
            ImageView imageView3 = iVar.f71876g;
            imageView3.getClass();
            imageView2.setImageDrawable(imageView3.getDrawable());
        }
    }
}
