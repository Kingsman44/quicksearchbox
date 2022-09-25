package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.search.assistant.verticals.newsplayer.media.C132446a;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10068e.C132416a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.media.C47449e;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.g */
/* compiled from: PG */
public final class C132489g {

    /* renamed from: c */
    private static final C59071e f361620c = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.newsplayer.ui.g");

    /* renamed from: a */
    public final View f361621a;

    /* renamed from: b */
    public boolean f361622b = false;

    /* renamed from: d */
    private final C132416a f361623d;

    /* renamed from: e */
    private final C47449e f361624e;

    public C132489g(View view, C132416a aVar, C47449e eVar) {
        this.f361621a = view;
        this.f361623d = aVar;
        this.f361624e = eVar;
        if (view.findViewById(R.id.assistant_news_player_mini_player) != null) {
            view.findViewById(R.id.assistant_news_player_mini_player_play_toggle_button).setOnClickListener(new C132487e(aVar));
            C132446a q = aVar.mo110715q();
            q.f361493a.mo1040h(new C132488f(this), (Handler) null);
        }
    }

    /* renamed from: a */
    public final void mo110774a() {
        C52174hz a = this.f361623d.mo110699a();
        if (a != null && this.f361621a.findViewById(R.id.assistant_news_player_mini_player) != null) {
            TextView textView = (TextView) this.f361621a.findViewById(R.id.assistant_news_player_mini_player_title);
            C52568wo woVar = a.f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            textView.setText(woVar.f137998e);
            TextView textView2 = (TextView) this.f361621a.findViewById(R.id.assistant_news_player_mini_player_container_title);
            C52568wo woVar2 = a.f136897d;
            if (woVar2 == null) {
                woVar2 = C52568wo.f137992v;
            }
            textView2.setText(woVar2.f138000g);
            ImageView imageView = (ImageView) this.f361621a.findViewById(R.id.assistant_news_player_mini_player_logo);
            C52568wo woVar3 = a.f136897d;
            if (woVar3 == null) {
                woVar3 = C52568wo.f137992v;
            }
            C51012dc dcVar = woVar3.f138004k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            String str = dcVar.f132817c;
            if (str.length() == 0) {
                ((C59052c) ((C59052c) f361620c.mo56226d()).mo56372aa(39669)).mo56386p("Not loading empty image url");
                imageView.setImageDrawable((Drawable) null);
                return;
            }
            this.f361624e.mo51286a().mo11864b().mo12448j(str).mo12454r(imageView);
        }
    }

    /* renamed from: b */
    public final void mo110775b() {
        if (this.f361621a.findViewById(R.id.assistant_news_player_mini_player) != null) {
            PlaybackStateCompat f = this.f361623d.mo110715q().f361493a.mo1038f();
            if (f == null || f.f994a != 3) {
                ((MaterialButton) this.f361621a.findViewById(R.id.assistant_news_player_mini_player_play_toggle_button)).mo47553j(R.drawable.quantum_gm_ic_play_arrow_vd_theme_24);
            } else {
                ((MaterialButton) this.f361621a.findViewById(R.id.assistant_news_player_mini_player_play_toggle_button)).mo47553j(R.drawable.quantum_gm_ic_pause_vd_theme_24);
            }
        }
    }
}
