package com.google.android.libraries.lens.view.onboarding;

import android.view.View;
import android.widget.Button;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.lens.view.onboarding.m */
/* compiled from: PG */
public final class C27515m {

    /* renamed from: a */
    public final C27512j f75238a;

    /* renamed from: b */
    public final C27510h f75239b;

    /* renamed from: c */
    public final C28443m f75240c;

    /* renamed from: d */
    public final C28448r f75241d;

    /* renamed from: e */
    public final C47770dh f75242e;

    /* renamed from: f */
    public final C25684e f75243f;

    /* renamed from: g */
    public final C28306ab f75244g;

    /* renamed from: h */
    public boolean f75245h;

    public C27515m(C27512j jVar, C27510h hVar, C28443m mVar, C28448r rVar, C47770dh dhVar, C25684e eVar, C28306ab abVar) {
        this.f75238a = jVar;
        this.f75239b = hVar;
        this.f75240c = mVar;
        this.f75241d = rVar;
        this.f75242e = dhVar;
        this.f75243f = eVar;
        this.f75244g = abVar;
        this.f75245h = jVar.f75234b;
    }

    /* renamed from: a */
    public final void mo33053a(View view) {
        Button button = (Button) view.findViewById(R.id.lens_onboarding_camera_denial_open_camera_button);
        Button button2 = (Button) view.findViewById(R.id.lens_onboarding_camera_denial_open_settings_button);
        if (this.f75245h) {
            button.setVisibility(8);
            button2.setVisibility(0);
            return;
        }
        button.setVisibility(0);
        button2.setVisibility(8);
    }
}
