package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9779m.p9782b;

import com.google.android.apps.search.assistant.libraries.p8984ui.transcription.TranscriptionView;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128836k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.m.b.e */
/* compiled from: PG */
final class C128956e implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128958g f354343a;

    /* renamed from: b */
    private final float f354344b = ((float) m210505c(R.integer.assistant_transcription_near_text_size));

    /* renamed from: c */
    private final float f354345c = ((float) m210505c(R.integer.assistant_transcription_mid_text_size));

    /* renamed from: d */
    private final int f354346d = m210505c(R.integer.assistant_transcription_near_line_height);

    /* renamed from: e */
    private final int f354347e = m210505c(R.integer.assistant_transcription_mid_line_height);

    public C128956e(C128958g gVar) {
        this.f354343a = gVar;
    }

    /* renamed from: c */
    private final int m210505c(int i) {
        return this.f354343a.f354349a.requireContext().getResources().getInteger(i);
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        float f;
        int i;
        C128836k kVar = (C128836k) obj;
        C69664n.m101061g(kVar, "proximity");
        TranscriptionView a = C128955d.m210504a(this.f354343a.f354349a);
        if (kVar == C128836k.MID) {
            f = this.f354345c;
        } else {
            f = this.f354344b;
        }
        a.setTextSize(f);
        if (kVar == C128836k.MID) {
            i = this.f354347e;
        } else {
            i = this.f354346d;
        }
        a.setLineHeight(i);
    }
}
