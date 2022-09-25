package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.os.Handler;
import android.view.View;
import com.google.android.apps.search.assistant.verticals.newsplayer.media.C132446a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.tracing.C47591co;
import java.text.DecimalFormat;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.ax */
/* compiled from: PG */
final class C132477ax {

    /* renamed from: a */
    int f361581a;

    /* renamed from: b */
    int f361582b;

    /* renamed from: c */
    final /* synthetic */ C132478ay f361583c;

    /* renamed from: d */
    private final MaterialButton f361584d;

    public C132477ax(C132478ay ayVar, View view) {
        this.f361583c = ayVar;
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.assistant_news_player_speed);
        this.f361584d = materialButton;
        materialButton.setOnClickListener(new C47591co(ayVar.f361593h, "speedButton clicked", new C132472as(this)));
        C132446a q = ayVar.f361586a.mo110715q();
        q.f361493a.mo1040h(new C132476aw(this), (Handler) null);
    }

    /* renamed from: b */
    static final float m215379b(int i) {
        return ((float) (i + 1)) * 0.25f;
    }

    /* renamed from: c */
    static final String m215380c(int i) {
        return new DecimalFormat("0.##X").format((double) m215379b(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo110762a(float f) {
        int round = Math.round(f / 0.25f) - 1;
        this.f361581a = round;
        this.f361584d.setText(m215380c(round));
    }
}
