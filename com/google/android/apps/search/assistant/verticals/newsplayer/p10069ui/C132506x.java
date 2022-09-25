package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.support.p033v7.app.C0392m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.assistant.p3897e.p3921j.C52568wo;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.x */
/* compiled from: PG */
final class C132506x {

    /* renamed from: a */
    private final TextView f361641a;

    /* renamed from: b */
    private final TextView f361642b;

    /* renamed from: c */
    private final TextView f361643c;

    /* renamed from: d */
    private final TextView f361644d;

    /* renamed from: e */
    private final TextView f361645e;

    /* renamed from: f */
    private final View f361646f;

    public C132506x(C132478ay ayVar, View view) {
        View inflate = LayoutInflater.from(ayVar.f361595j).inflate(R.layout.assistant_news_player_info, (ViewGroup) null);
        this.f361641a = (TextView) inflate.findViewById(R.id.assistant_news_player_info_title);
        this.f361642b = (TextView) inflate.findViewById(R.id.assistant_news_player_info_container_title);
        this.f361643c = (TextView) inflate.findViewById(R.id.assistant_news_player_info_description);
        this.f361644d = (TextView) inflate.findViewById(R.id.assistant_news_player_info_story_notes);
        this.f361645e = (TextView) inflate.findViewById(R.id.assistant_news_player_info_description_unavailable);
        this.f361646f = inflate.findViewById(R.id.assistant_news_player_info_scroll_space);
        C44581b bVar = new C44581b(ayVar.f361595j, 2132148321);
        bVar.mo47607z(inflate);
        C0392m create = bVar.create();
        view.setOnClickListener(new C47591co(ayVar.f361593h, "infoButton clicked", new C132504v(create)));
        ((Button) inflate.findViewById(R.id.assistant_news_player_info_close_button)).setOnClickListener(new C132505w(create));
    }

    /* renamed from: a */
    public final void mo110786a(C52568wo woVar) {
        this.f361641a.setText(woVar.f137998e);
        this.f361642b.setText(woVar.f138000g);
        this.f361643c.setText(woVar.f138002i);
        int i = 0;
        this.f361642b.setVisibility(true != C132503u.m215419a(woVar.f138000g) ? 0 : 8);
        this.f361644d.setVisibility(true != C132503u.m215419a(woVar.f138002i) ? 0 : 8);
        this.f361643c.setVisibility(true != C132503u.m215419a(woVar.f138002i) ? 0 : 8);
        this.f361646f.setVisibility(true != C132503u.m215419a(woVar.f138002i) ? 0 : 8);
        TextView textView = this.f361645e;
        if (!C132503u.m215419a(woVar.f138000g) || !C132503u.m215419a(woVar.f138002i)) {
            i = 8;
        }
        textView.setVisibility(i);
    }
}
