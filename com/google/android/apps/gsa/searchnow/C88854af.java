package com.google.android.apps.gsa.searchnow;

import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.C90163ad;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90255a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;

/* renamed from: com.google.android.apps.gsa.searchnow.af */
/* compiled from: PG */
final class C88854af extends C90163ad {

    /* renamed from: a */
    final /* synthetic */ C88861am f240563a;

    public C88854af(C88861am amVar) {
        this.f240563a = amVar;
    }

    /* renamed from: a */
    public final void mo76767a(C22939d dVar) {
        ViewGroup viewGroup = (ViewGroup) this.f240563a.f240621v.findViewById(R.id.particle_disc_tooltip_overlay_container);
        viewGroup.addView(dVar.mo28297il());
        viewGroup.setVisibility(0);
        C88861am amVar = this.f240563a;
        amVar.f240588R = (C90255a) dVar;
        amVar.f240588R.mo83970b(amVar.f240621v.findViewById(R.id.search_plate_container));
    }

    /* renamed from: b */
    public final void mo76768b(C22939d dVar) {
        ViewGroup viewGroup = (ViewGroup) this.f240563a.f240621v.findViewById(R.id.particle_disc_tooltip_overlay_container);
        viewGroup.setVisibility(8);
        viewGroup.removeView(dVar.mo28297il());
        this.f240563a.f240588R = null;
    }
}
