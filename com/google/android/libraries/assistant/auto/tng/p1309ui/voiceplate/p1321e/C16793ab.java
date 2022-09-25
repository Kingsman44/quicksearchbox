package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.ab */
/* compiled from: PG */
final class C16793ab implements C5592i {

    /* renamed from: a */
    final /* synthetic */ C16795ad f49143a;

    public C16793ab(C16795ad adVar) {
        this.f49143a = adVar;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        if (apVar != null) {
            ((C59052c) ((C59052c) ((C59052c) C16795ad.f49144a.mo56226d()).mo56382g(apVar)).mo56372aa(46902)).mo56389s("ERROR: Glide image loading failed with message: %s,", apVar.getMessage());
        } else {
            ((C59052c) ((C59052c) C16795ad.f49144a.mo56226d()).mo56372aa(46901)).mo56386p("ERROR: Glide image loading failed without exception");
        }
        C16795ad adVar = this.f49143a;
        ((ImageView) adVar.mo23020b().findViewById(R.id.third_party_header_icon)).setImageDrawable(adVar.f49152i.getDrawable(R.drawable.f1_voiceplate_3p_provider_fallback_icon, (Resources.Theme) null));
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        return false;
    }
}
