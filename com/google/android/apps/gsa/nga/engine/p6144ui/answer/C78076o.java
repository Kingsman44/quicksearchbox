package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.sceneviewer.common.C10678R;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.o */
/* compiled from: PG */
public final class C78076o {

    /* renamed from: a */
    private final Context f215061a;

    public C78076o(Context context) {
        this.f215061a = context;
    }

    /* renamed from: c */
    private final Context m125385c() {
        return new ContextThemeWrapper(this.f215061a, C10678R.style.Theme_GoogleMaterial_DayNight);
    }

    /* renamed from: a */
    public final ConfirmCancelCountDownLayout mo73058a() {
        return (ConfirmCancelCountDownLayout) LayoutInflater.from(m125385c()).inflate(R.layout.confirm_cancel_countdown_timer, (ViewGroup) null);
    }

    /* renamed from: b */
    public final MessageLayout mo73059b() {
        return (MessageLayout) LayoutInflater.from(m125385c()).inflate(R.layout.confirm_message_layout, (ViewGroup) null);
    }
}
