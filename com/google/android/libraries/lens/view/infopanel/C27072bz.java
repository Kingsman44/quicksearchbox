package com.google.android.libraries.lens.view.infopanel;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.session.C27766bb;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bz */
/* compiled from: PG */
public final class C27072bz implements C26960a {

    /* renamed from: a */
    public final C28443m f73801a;

    /* renamed from: b */
    private final ThumbnailHeaderView f73802b;

    /* renamed from: c */
    private final ImageView f73803c;

    /* renamed from: d */
    private final C27766bb f73804d;

    /* renamed from: e */
    private boolean f73805e = true;

    /* renamed from: f */
    private int f73806f;

    public C27072bz(ThumbnailHeaderView thumbnailHeaderView, C28443m mVar, C28310af afVar, C28306ab abVar, C27766bb bbVar) {
        this.f73802b = thumbnailHeaderView;
        this.f73801a = mVar;
        this.f73804d = bbVar;
        ImageView imageView = (ImageView) thumbnailHeaderView.findViewById(R.id.header_thumbnail);
        imageView.getClass();
        this.f73803c = imageView;
        imageView.setClipToOutline(true);
        abVar.mo33801b(imageView, afVar.mo33805a(C28427h.m53115a(109330)));
    }

    /* renamed from: a */
    public final Rect mo32385a() {
        throw new UnsupportedOperationException("Thumbnail view doesn't support this operation.");
    }

    /* renamed from: b */
    public final void mo32386b(float f) {
        this.f73802b.setAlpha(f);
        this.f73802b.setVisibility(f > 0.0f ? 0 : 4);
    }

    /* renamed from: c */
    public final void mo32387c(int i) {
        this.f73806f = i;
        int i2 = 0;
        if (true != ((C58833ax) this.f73804d.f75782a.mo3842a()).mo56113h()) {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams = this.f73802b.getLayoutParams();
        layoutParams.height = i;
        this.f73802b.setLayoutParams(layoutParams);
        ThumbnailHeaderView thumbnailHeaderView = this.f73802b;
        if (i <= 0) {
            i2 = 4;
        }
        thumbnailHeaderView.setVisibility(i2);
    }

    /* renamed from: d */
    public final void mo32388d(boolean z) {
    }

    /* renamed from: e */
    public final void mo32389e(C58833ax axVar) {
    }

    /* renamed from: f */
    public final void mo32390f(int i) {
    }

    /* renamed from: g */
    public final void mo32391g(Bitmap bitmap) {
        ImageView imageView = this.f73803c;
        if (true != this.f73805e) {
            bitmap = null;
        }
        imageView.setImageBitmap(bitmap);
        mo32387c(this.f73806f);
    }

    /* renamed from: h */
    public final void mo32392h(boolean z) {
        this.f73805e = z;
        mo32391g((Bitmap) ((C58833ax) this.f73804d.f75782a.mo3842a()).mo56111f());
    }
}
