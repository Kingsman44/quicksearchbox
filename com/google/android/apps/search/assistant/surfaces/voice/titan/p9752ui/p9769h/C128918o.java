package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128836k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.o */
/* compiled from: PG */
final class C128918o implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128914l f354287a;

    /* renamed from: b */
    private final int f354288b = m210432c(R.dimen.assistant_voice_plate_full_height_near);

    /* renamed from: c */
    private final int f354289c = m210432c(R.dimen.assistant_voice_plate_full_height_mid);

    public C128918o(C128914l lVar) {
        this.f354287a = lVar;
    }

    /* renamed from: c */
    private final int m210432c(int i) {
        return (int) this.f354287a.f354272f.requireContext().getResources().getDimension(i);
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        int i;
        C128836k kVar = (C128836k) obj;
        C69664n.m101061g(kVar, "proximity");
        View requireViewById = this.f354287a.f354272f.requireView().requireViewById(R.id.assistant_plate_container);
        C69664n.m101060f(requireViewById, "voicePlateFragment.requi…ssistant_plate_container)");
        ViewGroup.LayoutParams layoutParams = requireViewById.getLayoutParams();
        if (kVar == C128836k.MID) {
            i = this.f354289c;
        } else {
            i = this.f354288b;
        }
        layoutParams.height = i;
    }
}
