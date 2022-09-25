package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.view.ContextThemeWrapper;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.cg */
/* compiled from: PG */
final class C15052cg implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C15056ck f45136a;

    public C15052cg(C15056ck ckVar) {
        this.f45136a = ckVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C15056ck.f45140a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.MediaFullRend");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(45956)).mo56386p("Media player updateBackground failed or there is no album art provided.");
        ImageView imageView = this.f45136a.f45160h;
        imageView.getClass();
        imageView.setVisibility(4);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Optional optional = (Optional) obj;
        if (this.f45136a.f45156d == null || !optional.isPresent()) {
            C59104x c = C15056ck.f45140a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MediaFullRend");
            ((C59052c) ((C59052c) c).mo56372aa(45957)).mo56386p("backgroundBitmapFutureCallback called but there was a problem");
            ImageView imageView = this.f45136a.f45160h;
            imageView.getClass();
            imageView.setVisibility(4);
            return;
        }
        ContextThemeWrapper contextThemeWrapper = this.f45136a.f45171s;
        contextThemeWrapper.getClass();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(contextThemeWrapper.getResources(), (Bitmap) optional.get());
        ContextThemeWrapper contextThemeWrapper2 = this.f45136a.f45171s;
        contextThemeWrapper2.getClass();
        bitmapDrawable.setAlpha(contextThemeWrapper2.getResources().getInteger(R.integer.media_player_background_alpha));
        bitmapDrawable.setTintMode(PorterDuff.Mode.DARKEN);
        ContextThemeWrapper contextThemeWrapper3 = this.f45136a.f45171s;
        contextThemeWrapper3.getClass();
        bitmapDrawable.setTint(C1878d.m5128a(contextThemeWrapper3, R.color.media_player_fullscreen_background_tint));
        ImageView imageView2 = this.f45136a.f45160h;
        imageView2.getClass();
        imageView2.setImageDrawable(bitmapDrawable);
        C15056ck ckVar = this.f45136a;
        ImageView imageView3 = ckVar.f45160h;
        imageView3.getClass();
        ContextThemeWrapper contextThemeWrapper4 = ckVar.f45171s;
        contextThemeWrapper4.getClass();
        imageView3.setBackgroundColor(contextThemeWrapper4.getResources().getColor(17170443));
        ImageView imageView4 = this.f45136a.f45160h;
        imageView4.getClass();
        imageView4.setVisibility(0);
    }
}
