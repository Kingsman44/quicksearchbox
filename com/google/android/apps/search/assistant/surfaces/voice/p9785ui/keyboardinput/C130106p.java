package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128626e;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.p */
/* compiled from: PG */
final class C130106p implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C130109s f356746a;

    public C130106p(C130109s sVar) {
        this.f356746a = sVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup viewGroup = (ViewGroup) view;
        int height = viewGroup.getHeight();
        int a = C128626e.m209922a(viewGroup.getContext(), R.dimen.assistant_keyboard_suggestion_item_height);
        int a2 = height - (C128626e.m209922a(viewGroup.getContext(), R.dimen.assistant_keyboard_suggestion_container_top_padding) + C128626e.m209922a(viewGroup.getContext(), R.dimen.assistant_keyboard_suggestion_container_bottom_padding));
        if (a2 < viewGroup.getChildCount() * a) {
            int min = Math.min(5, a2 / a);
            C130109s sVar = this.f356746a;
            if (min != sVar.f356765o) {
                sVar.f356765o = min;
                sVar.mo109501f(sVar.f356766p);
            }
            viewGroup.removeOnLayoutChangeListener(this);
        }
    }
}
