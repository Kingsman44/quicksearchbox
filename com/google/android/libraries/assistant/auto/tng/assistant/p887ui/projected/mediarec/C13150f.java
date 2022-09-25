package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.f */
/* compiled from: PG */
final class C13150f implements C5592i {

    /* renamed from: a */
    final /* synthetic */ ImageView f40750a;

    public C13150f(ImageView imageView) {
        this.f40750a = imageView;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        if (apVar != null) {
            ((C59052c) ((C59052c) ((C59052c) C13153i.f40751a.mo56226d()).mo56382g(apVar)).mo56372aa(44591)).mo56389s("ERROR: Glide image loading failed with message: %s,", apVar.getMessage());
        } else {
            ((C59052c) ((C59052c) C13153i.f40751a.mo56226d()).mo56372aa(44590)).mo56386p("ERROR: Glide image loading failed without exception");
        }
        this.f40750a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f40750a.setImageResource(R.drawable.quantum_gm_ic_music_note_white_48);
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        C59071e eVar = C13153i.f40751a;
        return false;
    }
}
