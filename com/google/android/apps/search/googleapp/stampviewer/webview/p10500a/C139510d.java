package com.google.android.apps.search.googleapp.stampviewer.webview.p10500a;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.a.d */
/* compiled from: PG */
final class C139510d implements C5592i {

    /* renamed from: a */
    final /* synthetic */ C139508c f379329a;

    public C139510d(C139508c cVar) {
        this.f379329a = cVar;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        C139508c cVar = this.f379329a;
        cVar.f379325i = false;
        cVar.f379326j = true;
        View view = cVar.f379320d.getView();
        if (!(view == null || this.f379329a.f379327k == null)) {
            ((ImageView) view.findViewById(R.id.googleapp_stamp_viewer_badge_image)).setImageBitmap(this.f379329a.f379327k);
        }
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        C139508c cVar = this.f379329a;
        cVar.f379325i = true;
        cVar.f379326j = true;
        return false;
    }
}
