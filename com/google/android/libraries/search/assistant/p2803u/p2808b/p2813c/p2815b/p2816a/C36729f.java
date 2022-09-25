package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.f */
/* compiled from: PG */
final class C36729f implements C5592i {

    /* renamed from: a */
    final /* synthetic */ ImageView f95698a;

    public C36729f(ImageView imageView) {
        this.f95698a = imageView;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        this.f95698a.setVisibility(8);
        if (apVar != null) {
            ((C59052c) ((C59052c) ((C59052c) C36730g.f95699a.mo56226d()).mo56382g(apVar)).mo56372aa(51546)).mo56389s("Glide image loading failed: %s,", apVar.getMessage());
            return true;
        }
        ((C59052c) ((C59052c) C36730g.f95699a.mo56226d()).mo56372aa(51545)).mo56386p("Glide image loading failed without detailed exception message");
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        return false;
    }
}
