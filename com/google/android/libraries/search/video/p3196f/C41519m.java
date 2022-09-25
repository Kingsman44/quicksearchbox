package com.google.android.libraries.search.video.p3196f;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.LinearLayoutManager;
import android.widget.TextView;
import com.bumptech.glide.p287f.p288a.C5561c;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.video.f.m */
/* compiled from: PG */
public final class C41519m extends C5561c {

    /* renamed from: a */
    final /* synthetic */ C41520n f108502a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41519m(C41520n nVar) {
        super(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        this.f108502a = nVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable((Bitmap) obj);
        int dimensionPixelSize = this.f108502a.f108505c.getResources().getDimensionPixelSize(R.dimen.lightbox_video_platform_logo_size);
        bitmapDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        TextView textView = this.f108502a.f108514l;
        textView.getClass();
        textView.setCompoundDrawables(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
        ((C59052c) ((C59052c) C41520n.f108503a.mo56226d()).mo56372aa(53908)).mo56386p("Failed to load platform logo.");
    }
}
