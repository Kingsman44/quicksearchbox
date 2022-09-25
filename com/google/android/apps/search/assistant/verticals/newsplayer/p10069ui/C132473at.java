package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.support.p033v7.widget.C0516an;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.IntConsumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.at */
/* compiled from: PG */
public final /* synthetic */ class C132473at implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ C132477ax f361575a;

    /* renamed from: b */
    public final /* synthetic */ RadioGroup f361576b;

    public /* synthetic */ C132473at(C132477ax axVar, RadioGroup radioGroup) {
        this.f361575a = axVar;
        this.f361576b = radioGroup;
    }

    public final void accept(int i) {
        C132477ax axVar = this.f361575a;
        RadioGroup radioGroup = this.f361576b;
        C0516an anVar = new C0516an(axVar.f361583c.f361595j, (AttributeSet) null);
        anVar.setText(C132477ax.m215380c(i));
        anVar.setId(i);
        anVar.setMinHeight(axVar.f361583c.f361595j.getResources().getDimensionPixelSize(R.dimen.assistant_news_player_speed_dialog_radio_button_height));
        radioGroup.addView(anVar);
        anVar.setChecked(i == axVar.f361582b);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
