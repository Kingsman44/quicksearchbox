package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.support.p033v7.app.C0392m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.as */
/* compiled from: PG */
public final /* synthetic */ class C132472as implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132477ax f361574a;

    public /* synthetic */ C132472as(C132477ax axVar) {
        this.f361574a = axVar;
    }

    public final void onClick(View view) {
        C132477ax axVar = this.f361574a;
        axVar.f361582b = axVar.f361581a;
        View inflate = LayoutInflater.from(axVar.f361583c.f361595j).inflate(R.layout.assistant_news_player_speed, (ViewGroup) null);
        C44581b bVar = new C44581b(axVar.f361583c.f361595j, 0);
        bVar.mo47607z(inflate);
        C0392m create = bVar.create();
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.assistant_news_player_speed_radio_group);
        IntStream.CC.range(0, 8).forEach(new C132473at(axVar, radioGroup));
        radioGroup.setOnCheckedChangeListener(new C132474au(axVar));
        ((Button) inflate.findViewById(R.id.assistant_news_player_speed_save_button)).setOnClickListener(new C132475av(axVar, create));
        create.show();
    }
}
