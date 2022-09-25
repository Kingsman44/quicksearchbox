package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.view.View;
import android.widget.ImageButton;
import com.google.android.apps.search.googleapp.searchwidget.settings.p10481a.C139045c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.aq */
/* compiled from: PG */
public final class C139065aq {

    /* renamed from: a */
    public final C139064ap f378216a;

    /* renamed from: b */
    public final C28306ab f378217b;

    /* renamed from: c */
    public final C47400m f378218c;

    /* renamed from: d */
    public final C139093br f378219d;

    /* renamed from: e */
    public C139080be f378220e;

    /* renamed from: f */
    private final C139045c f378221f;

    public C139065aq(C139064ap apVar, C28306ab abVar, C47400m mVar, C139045c cVar, C139093br brVar, C139080be beVar) {
        this.f378216a = apVar;
        this.f378217b = abVar;
        this.f378218c = mVar;
        this.f378221f = cVar;
        this.f378219d = brVar;
        this.f378220e = beVar;
    }

    /* renamed from: a */
    public static void m225888a(View view, C139077bb bbVar) {
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.googleapp_2dp_search_bar_radius);
        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.googleapp_8dp_search_bar_radius);
        ImageButton imageButton3 = (ImageButton) view.findViewById(R.id.googleapp_24dp_search_bar_radius);
        imageButton.setSelected(false);
        imageButton2.setSelected(false);
        imageButton3.setSelected(false);
        C139077bb bbVar2 = C139077bb.BAR_RADIUS_UNKNOWN;
        int ordinal = bbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                imageButton.setSelected(true);
                return;
            } else if (ordinal == 2) {
                imageButton2.setSelected(true);
                return;
            } else if (ordinal != 3) {
                return;
            }
        }
        imageButton3.setSelected(true);
    }

    /* renamed from: b */
    public final void mo114687b(C139077bb bbVar) {
        m225888a(this.f378216a.requireView(), bbVar);
        C139070av avVar = (C139070av) this.f378220e.toBuilder();
        avVar.copyOnWrite();
        C139080be beVar = (C139080be) avVar.instance;
        beVar.f378253d = bbVar.f378239e;
        beVar.f378250a |= 4;
        C139080be beVar2 = (C139080be) avVar.build();
        this.f378220e = beVar2;
        this.f378221f.mo114666a(beVar2);
    }
}
