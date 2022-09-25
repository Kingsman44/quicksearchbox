package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2562a.p2563a.p2564a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.PictureDrawable;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p299c.C5882c;
import com.bumptech.glide.load.p299c.p305f.C5915e;
import com.p232a.p233a.C4734bp;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.a.a.a.a */
/* compiled from: PG */
final class C33237a implements C5915e {

    /* renamed from: a */
    private final Context f88874a;

    public C33237a(Context context) {
        this.f88874a = context;
    }

    /* renamed from: a */
    public final C5679av mo12371a(C5679av avVar, C5960s sVar) {
        C4734bp bpVar = (C4734bp) avVar.mo12160c();
        float a = bpVar.mo9618a();
        float b = bpVar.mo9619b();
        PictureDrawable pictureDrawable = new PictureDrawable(bpVar.mo9624i());
        Bitmap createBitmap = Bitmap.createBitmap((int) b, (int) a, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawPicture(pictureDrawable.getPicture());
        return new C5882c(new BitmapDrawable(this.f88874a.getResources(), createBitmap));
    }
}
