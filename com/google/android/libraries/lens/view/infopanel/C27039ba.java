package com.google.android.libraries.lens.view.infopanel;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.lifecycle.C2333ah;
import com.bumptech.glide.load.p299c.p302c.C5889g;
import com.bumptech.glide.p287f.C5593j;
import com.bumptech.glide.p287f.p289b.C5577a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.infopanel.ba */
/* compiled from: PG */
public final /* synthetic */ class C27039ba implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C27051bm f73697a;

    public /* synthetic */ C27039ba(C27051bm bmVar) {
        this.f73697a = bmVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C27051bm bmVar = this.f73697a;
        C58833ax axVar = (C58833ax) obj;
        ImageView imageView = (ImageView) bmVar.f73725e.requireView().findViewById(R.id.multimodal_panel_thumbnail);
        ImageView imageView2 = (ImageView) bmVar.f73725e.requireView().findViewById(R.id.multimodal_panel_background);
        if (!axVar.mo56113h()) {
            imageView.setImageBitmap((Bitmap) null);
            imageView2.setImageBitmap((Bitmap) null);
            return;
        }
        C5577a aVar = new C5577a(300, true);
        imageView.setImageBitmap((Bitmap) axVar.mo56111f());
        bmVar.f73722b.mo51286a().mo11868f((Bitmap) axVar.mo56111f()).mo11982o(C5593j.m14517a(new C27047bi())).mo12452n(C5889g.m15222c(aVar)).mo12454r(imageView2);
    }
}
