package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.os.Handler;
import android.view.View;
import com.google.android.apps.search.assistant.verticals.newsplayer.media.C132446a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.af */
/* compiled from: PG */
final class C132459af {

    /* renamed from: a */
    final /* synthetic */ C132478ay f361544a;

    /* renamed from: b */
    private final MaterialButton f361545b;

    /* renamed from: c */
    private final View.OnClickListener f361546c;

    /* renamed from: d */
    private final View.OnClickListener f361547d;

    public C132459af(C132478ay ayVar, View view) {
        this.f361544a = ayVar;
        this.f361545b = (MaterialButton) view.findViewById(R.id.assistant_news_player_play_toggle);
        C47770dh dhVar = ayVar.f361593h;
        this.f361546c = new C47591co(dhVar, "play button clicked", new C132456ac(this));
        this.f361547d = new C47591co(dhVar, "pause button clicked", new C132457ad(this));
        C132446a q = ayVar.f361586a.mo110715q();
        q.f361493a.mo1040h(new C132458ae(this), (Handler) null);
    }

    /* renamed from: a */
    public final void mo110748a() {
        this.f361545b.mo47553j(R.drawable.quantum_gm_ic_play_arrow_vd_theme_24);
        this.f361545b.setOnClickListener(this.f361546c);
    }

    /* renamed from: b */
    public final void mo110749b() {
        this.f361545b.mo47553j(R.drawable.quantum_gm_ic_pause_vd_theme_24);
        this.f361545b.setOnClickListener(this.f361547d);
    }
}
