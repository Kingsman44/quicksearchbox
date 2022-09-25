package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import android.widget.ImageView;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128836k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.al */
/* compiled from: PG */
final class C128892al implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128893am f354222a;

    public C128892al(C128893am amVar) {
        this.f354222a = amVar;
    }

    /* renamed from: c */
    private final int m210369c(int i) {
        return (int) this.f354222a.f354225c.requireContext().getResources().getDimension(i);
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
        if (kVar == C128836k.MID) {
            i = m210369c(R.dimen.assistant_voice_plate_avatar_size_mid);
        } else {
            i = m210369c(R.dimen.assistant_voice_plate_avatar_size_near);
        }
        ImageView a = C128895an.m210376a(this.f354222a.f354225c);
        a.getLayoutParams().width = i;
        a.getLayoutParams().height = i;
        a.requestLayout();
    }
}
