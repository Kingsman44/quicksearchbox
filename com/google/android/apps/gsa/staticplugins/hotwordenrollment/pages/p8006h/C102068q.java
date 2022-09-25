package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h;

import android.content.res.Resources;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.o.c;
import com.google.android.apps.gsa.assistant.shared.p5825o.C73895d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.q */
/* compiled from: PG */
public final /* synthetic */ class C102068q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Fragment f284759a;

    public /* synthetic */ C102068q(Fragment fragment) {
        this.f284759a = fragment;
    }

    public final void onClick(View view) {
        Fragment fragment = this.f284759a;
        Resources resources = fragment.getResources();
        c d = C73895d.m108510d();
        d.c(resources.getString(R.string.hotword_enrollment_google_home_share_message_subject));
        d.b(resources.getString(R.string.hotword_enrollment_google_home_share_message_deeplink));
        fragment.startActivity(d.a().mo65402c());
        C47393f.m84236g(new C101783w(), fragment);
    }
}
