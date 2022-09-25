package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.text.format.DateUtils;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.carousel.MediaPlayerCarousel;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115625am;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.ad */
/* compiled from: PG */
public final /* synthetic */ class C115557ad implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115572as f320539a;

    public /* synthetic */ C115557ad(C115572as asVar) {
        this.f320539a = asVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C58833ax axVar;
        C58833ax axVar2;
        C115572as asVar = this.f320539a;
        C58833ax axVar3 = (C58833ax) obj;
        asVar.f320585x = axVar3;
        asVar.f320581t.f320637c = axVar3;
        asVar.f320582u.f320612c = axVar3;
        if (axVar3.mo56113h()) {
            MediaPlayerCarousel mediaPlayerCarousel = asVar.f320582u;
            C58833ax a = mediaPlayerCarousel.mo102107a((C115466j) axVar3.mo56107c());
            if (!mediaPlayerCarousel.f320615f && a.mo56113h()) {
                if (mediaPlayerCarousel.f320614e && ((Integer) a.mo56107c()).intValue() == mediaPlayerCarousel.f320616g) {
                    mediaPlayerCarousel.f320614e = false;
                } else if (!mediaPlayerCarousel.f320614e) {
                    int intValue = ((Integer) a.mo56107c()).intValue();
                    mediaPlayerCarousel.f320616g = intValue;
                    if (!mediaPlayerCarousel.f320617h) {
                        mediaPlayerCarousel.scrollToPosition(intValue);
                        mediaPlayerCarousel.f320617h = true;
                    } else {
                        mediaPlayerCarousel.f320611b.mo102109b(intValue);
                    }
                }
            }
            C115466j jVar = (C115466j) axVar3.mo56107c();
            if (!asVar.f320583v) {
                int i = (int) jVar.f320307b;
                if (i < 0 || i >= asVar.f320584w.f136914b.size()) {
                    axVar = C58836b.f156633a;
                } else {
                    axVar = C58833ax.m90834k(Integer.valueOf(i));
                }
                if (axVar.mo56113h()) {
                    C52568wo woVar = ((C52174hz) asVar.f320584w.f136914b.get(((Integer) axVar.mo56107c()).intValue())).f136897d;
                    if (woVar == null) {
                        woVar = C52568wo.f137992v;
                    }
                    axVar2 = C58833ax.m90834k(woVar);
                } else {
                    axVar2 = C58836b.f156633a;
                }
                if (axVar2.mo56113h()) {
                    boolean z = jVar.f320309d;
                    int i2 = z ? R.integer.omp_play_toggle_level_paused : R.integer.omp_play_toggle_level_playing;
                    int i3 = true != z ? R.string.omp_pause : R.string.omp_play;
                    asVar.f320574m.setImageLevel(asVar.f320563b.getResources().getInteger(i2));
                    asVar.f320574m.setContentDescription(asVar.f320563b.getResources().getString(i3));
                    asVar.f320573l.setEnabled(jVar.f320316k);
                    asVar.f320576o.setText(((C52568wo) axVar2.mo56107c()).f137998e);
                    TextView textView = asVar.f320575n;
                    C52568wo woVar2 = (C52568wo) axVar2.mo56107c();
                    StringBuilder sb = new StringBuilder();
                    boolean z2 = !woVar2.f138000g.isEmpty();
                    if (z2) {
                        String str = woVar2.f138000g;
                        if (str.length() > 25) {
                            str = String.valueOf(str.substring(0, 25)).concat("...");
                        }
                        sb.append(str);
                    }
                    if ((woVar2.f137994a & 4096) != 0) {
                        C52407qp qpVar = woVar2.f138005l;
                        if (qpVar == null) {
                            qpVar = C52407qp.f137523d;
                        }
                        if (qpVar.f137526b > 0) {
                            if (z2) {
                                sb.append(" • ");
                            }
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            C52407qp qpVar2 = woVar2.f138005l;
                            if (qpVar2 == null) {
                                qpVar2 = C52407qp.f137523d;
                            }
                            sb.append(C115625am.m191766a(timeUnit.toMillis(qpVar2.f137526b), asVar.f320567f.mo26870b(), asVar.f320563b));
                        }
                    }
                    textView.setText(sb.toString());
                    long j = jVar.f320314i / 1000;
                    asVar.f320577p.setText(DateUtils.formatElapsedTime(j));
                    int i4 = (int) j;
                    asVar.f320577p.setContentDescription(asVar.f320563b.getResources().getQuantityString(R.plurals.omp_total_duration, i4, new Object[]{Integer.valueOf(i4)}));
                    asVar.mo102100g();
                    asVar.mo102102j();
                }
            }
        }
    }
}
