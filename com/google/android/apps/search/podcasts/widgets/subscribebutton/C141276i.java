package com.google.android.apps.search.podcasts.widgets.subscribebutton;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.material.chip.Chip;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.inject.C47274n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.subscribebutton.i */
/* compiled from: PG */
public final class C141276i {

    /* renamed from: a */
    public final SubscribeButtonView f383549a;

    /* renamed from: b */
    public final C140997s f383550b;

    /* renamed from: c */
    public final C28306ab f383551c;

    /* renamed from: d */
    public final C46485f f383552d;

    /* renamed from: e */
    public boolean f383553e;

    /* renamed from: f */
    private final Chip f383554f;

    public C141276i(SubscribeButtonView subscribeButtonView, C47274n nVar, C140997s sVar, C28306ab abVar, C46485f fVar) {
        C69664n.m101061g(sVar, "events");
        C69664n.m101061g(abVar, "visualElements");
        C69664n.m101061g(fVar, "accountNavigation");
        this.f383549a = subscribeButtonView;
        this.f383550b = sVar;
        this.f383551c = abVar;
        this.f383552d = fVar;
        LayoutInflater.from(nVar).inflate(R.layout.podcasts_subscription_chips, subscribeButtonView, true);
        View findViewById = subscribeButtonView.findViewById(R.id.podcasts_subscribe_chip);
        C69664n.m101060f(findViewById, "subscribeButtonView.find….podcasts_subscribe_chip)");
        this.f383554f = (Chip) findViewById;
    }

    /* renamed from: a */
    public final void mo116297a(boolean z) {
        this.f383554f.setChecked(z);
        if (z) {
            String string = this.f383549a.getContext().getString(R.string.podcasts_unsubscribe_button_label);
            C69664n.m101060f(string, "subscribeButtonView.cont…unsubscribe_button_label)");
            this.f383549a.setContentDescription(string);
            this.f383554f.setText(string);
            this.f383554f.mo47662B(0.0f);
            this.f383554f.mo47695r((float) this.f383549a.getContext().getResources().getDimensionPixelSize(R.dimen.podcasts_unsubscribe_chip_icon_size));
            return;
        }
        String string2 = this.f383549a.getContext().getString(R.string.podcasts_subscribe_button_label);
        C69664n.m101060f(string2, "subscribeButtonView.cont…s_subscribe_button_label)");
        this.f383549a.setContentDescription(string2);
        this.f383554f.setText(string2);
        this.f383554f.mo47662B((float) this.f383549a.getContext().getResources().getDimensionPixelSize(R.dimen.podcasts_subscribe_chip_icon_start_padding));
        this.f383554f.mo47695r((float) this.f383549a.getContext().getResources().getDimensionPixelSize(R.dimen.podcasts_subscribe_chip_icon_size));
    }
}
