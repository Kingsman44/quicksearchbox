package com.google.android.apps.search.podcasts.playerpanel;

import android.support.p031v4.media.session.PlaybackStateCompat;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e;
import com.google.android.apps.search.podcasts.player.C140752a;
import com.google.android.apps.search.podcasts.player.C140776c;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.bb */
/* compiled from: PG */
public final class C140913bb {
    /* renamed from: a */
    public static final void m228840a(C140787e eVar, C140790h hVar) {
        PlaybackStateCompat playbackStateCompat;
        C69664n.m101061g(hVar, "podcastAudioPlayer");
        if (eVar != null && (playbackStateCompat = eVar.f382280a) != null) {
            int i = playbackStateCompat.f994a;
            if (!(i == 0 || i == 1 || i == 2)) {
                if (i == 3 || i == 6) {
                    hVar.mo115887i();
                    return;
                } else if (i != 7) {
                    C140776c.m228582b(hVar, eVar.f382282c, eVar.f382283d, 0, false, (C140509u) null, 60);
                    hVar.mo115888j();
                    return;
                }
            }
            C140644e eVar2 = eVar.f382282c.f381984k;
            if (eVar2 == null) {
                eVar2 = C140644e.f381988d;
            }
            if (eVar2.f381990a >= 1.0f) {
                C140776c.m228582b(hVar, eVar.f382282c, eVar.f382283d, 0, false, (C140509u) null, 56);
            }
            hVar.mo115888j();
        }
    }

    /* renamed from: b */
    public static final void m228841b(ProgressBar progressBar, C140787e eVar, C21370a aVar) {
        int i;
        C69664n.m101061g(progressBar, "<this>");
        C69664n.m101061g(aVar, "clock");
        long d = C140752a.m228544d(eVar);
        if (d == 0) {
            i = 0;
        } else {
            i = (int) ((C140752a.m228543c(eVar) * ((long) progressBar.getMax())) / d);
        }
        progressBar.setProgress(i);
    }

    /* renamed from: c */
    public static final void m228842c(ProgressBar progressBar, C140787e eVar) {
        int i;
        PlaybackStateCompat playbackStateCompat;
        C140641b bVar;
        C69664n.m101061g(progressBar, "<this>");
        long d = C140752a.m228544d(eVar);
        long j = 0;
        if (d == 0) {
            i = 0;
        } else {
            C97913c cVar = null;
            if (!(eVar == null || (bVar = eVar.f382282c) == null)) {
                C97914d dVar = bVar.f381987n;
                if (dVar == null) {
                    dVar = C97914d.f273393j;
                }
                if (dVar != null && (cVar = C97913c.m162190a(dVar.f273396b)) == null) {
                    cVar = C97913c.UNKNOWN;
                }
            }
            if (cVar == C97913c.DOWNLOADED) {
                i = progressBar.getMax();
            } else {
                if (!(eVar == null || (playbackStateCompat = eVar.f382280a) == null)) {
                    j = playbackStateCompat.f996c;
                }
                i = (int) ((j * ((long) progressBar.getMax())) / d);
            }
        }
        progressBar.setSecondaryProgress(i);
    }

    /* renamed from: d */
    public static final void m228843d(ImageView imageView, C140787e eVar, int i, int i2) {
        PlaybackStateCompat playbackStateCompat;
        C69664n.m101061g(imageView, "toggleButton");
        Integer num = null;
        if (!(eVar == null || (playbackStateCompat = eVar.f382280a) == null)) {
            num = Integer.valueOf(playbackStateCompat.f994a);
        }
        if ((num != null && num.intValue() == 6) || (num != null && num.intValue() == 3)) {
            imageView.setImageResource(i2);
            imageView.setContentDescription(imageView.getResources().getString(R.string.podcasts_content_description_pause));
            return;
        }
        imageView.setImageResource(i);
        imageView.setContentDescription(imageView.getResources().getString(R.string.podcasts_content_description_play));
    }
}
