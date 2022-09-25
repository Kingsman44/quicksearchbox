package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.w */
/* compiled from: PG */
final class C15349w implements C5592i {

    /* renamed from: a */
    final /* synthetic */ C15351y f46057a;

    /* renamed from: b */
    final /* synthetic */ ImageView f46058b;

    public C15349w(C15351y yVar, ImageView imageView) {
        this.f46057a = yVar;
        this.f46058b = imageView;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        if (apVar != null) {
            C59104x c = C15352z.f46060a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.RenderingUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(apVar)).mo56372aa(46080)).mo56386p("Unable to load image.");
        } else {
            C59104x c2 = C15352z.f46060a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "Morris.RenderingUtils");
            ((C59052c) ((C59052c) c2).mo56372aa(46079)).mo56386p("Unable to load image. Failed without exception.");
        }
        this.f46057a.mo21894a(this.f46058b);
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        this.f46058b.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return false;
    }
}
