package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.q */
/* compiled from: PG */
public final class C104353q implements ViewSwitcher.ViewFactory {

    /* renamed from: a */
    final /* synthetic */ LayoutInflater f290376a;

    /* renamed from: b */
    final /* synthetic */ C104356t f290377b;

    public C104353q(C104356t tVar, LayoutInflater layoutInflater) {
        this.f290377b = tVar;
        this.f290376a = layoutInflater;
    }

    public final View makeView() {
        return this.f290376a.inflate(true != this.f290377b.f290394i ? R.layout.back_of_card_follow_gestalt_text : R.layout.dark_theme_back_of_card_follow_gestalt_text, (ViewGroup) null);
    }
}
