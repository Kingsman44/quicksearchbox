package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.cd */
/* compiled from: PG */
public final class C102358cd {

    /* renamed from: a */
    public final C102360cf f285657a;

    /* renamed from: b */
    public final View f285658b;

    /* renamed from: c */
    public final View f285659c;

    /* renamed from: d */
    public final View f285660d;

    public C102358cd(View view, C102360cf cfVar) {
        this.f285657a = cfVar;
        View findViewById = view.findViewById(R.id.image_viewer_close_button);
        this.f285658b = findViewById;
        View findViewById2 = view.findViewById(R.id.image_viewer_next_button);
        this.f285659c = findViewById2;
        View findViewById3 = view.findViewById(R.id.image_viewer_prev_button);
        this.f285660d = findViewById3;
        C28292j jVar = new C28292j(3593);
        jVar.mo33795i(22);
        jVar.mo33795i(27);
        jVar.mo33794h(1);
        C28295m.m52919e(findViewById, jVar);
        C28292j jVar2 = new C28292j(3590);
        jVar2.mo33795i(22);
        jVar2.mo33794h(1);
        C28295m.m52919e(findViewById2, jVar2);
        C28292j jVar3 = new C28292j(3589);
        jVar3.mo33795i(22);
        jVar3.mo33794h(1);
        C28295m.m52919e(findViewById3, jVar3);
    }
}
