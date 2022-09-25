package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.view.View;
import android.widget.ImageButton;
import com.google.android.apps.search.googleapp.searchwidget.settings.p10481a.C139045c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.w */
/* compiled from: PG */
public final class C139125w {

    /* renamed from: a */
    public final C139124v f378363a;

    /* renamed from: b */
    public final C28306ab f378364b;

    /* renamed from: c */
    public final C47400m f378365c;

    /* renamed from: d */
    public final C139093br f378366d;

    /* renamed from: e */
    public C139080be f378367e;

    /* renamed from: f */
    private final C139045c f378368f;

    public C139125w(C139124v vVar, C28306ab abVar, C47400m mVar, C139045c cVar, C139093br brVar, C139080be beVar) {
        this.f378363a = vVar;
        this.f378364b = abVar;
        this.f378365c = mVar;
        this.f378368f = cVar;
        this.f378366d = brVar;
        this.f378367e = beVar;
    }

    /* renamed from: a */
    public static void m225991a(View view, int i) {
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.googleapp_full_logo);
        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.googleapp_super_g);
        imageButton.setSelected(false);
        imageButton2.setSelected(false);
        if (i - 1 != 2) {
            imageButton2.setSelected(true);
        } else {
            imageButton.setSelected(true);
        }
    }

    /* renamed from: b */
    public final void mo114746b(int i) {
        m225991a(this.f378363a.requireView(), i);
        C139070av avVar = (C139070av) this.f378367e.toBuilder();
        avVar.copyOnWrite();
        C139080be beVar = (C139080be) avVar.instance;
        beVar.f378254e = i - 1;
        beVar.f378250a |= 8;
        C139080be beVar2 = (C139080be) avVar.build();
        this.f378367e = beVar2;
        this.f378368f.mo114666a(beVar2);
    }
}
