package com.google.android.apps.gsa.p8839t.p8847h;

import android.content.ComponentName;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123727au;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.libraries.assistant.pcp.p1573k.C18912aa;
import com.google.android.libraries.assistant.pcp.p1573k.C18913ab;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.t.h.s */
/* compiled from: PG */
public final class C118443s {

    /* renamed from: a */
    public static final /* synthetic */ int f328767a = 0;

    /* renamed from: b */
    private static final C58495hd f328768b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("com.audible.application", C118442r.AUDIBLE);
        gzVar.mo55429h("deezer.android.app", C118442r.DEEZER);
        gzVar.mo55429h("au.com.shiftyjelly.pocketcasts", C118442r.POCKET_CASTS);
        gzVar.mo55429h("com.sirius", C118442r.SIRIUS_XM);
        gzVar.mo55429h("com.google.android.apps.youtube.music", C118442r.YOUTUBE_MUSIC);
        gzVar.mo55429h("com.spotify.music", C118442r.SPOTIFY);
        gzVar.mo55429h("com.bambuna.podcastaddict", C118442r.PODCASTS_ADDICT);
        gzVar.mo55429h("tunein.player", C118442r.TUNE_IN);
        gzVar.mo55429h("com.google.android.music", C118442r.PLAY_MUSIC);
        gzVar.mo55429h("com.pandora.android", C118442r.PANDORA);
        gzVar.mo55429h("com.nytimes.android", C118442r.NEW_YORK_TIMES);
        gzVar.mo55429h("com.clearchannel.iheartradio.controller", C118442r.IHEART_RADIO);
        gzVar.mo55429h("com.google.android.googlequicksearchbox", C118442r.AGSA);
        gzVar.mo55429h("fr.redshift.nrj", C118442r.NRJ_RADIO);
        gzVar.mo55429h("com.apple.android.music", C118442r.APPLE_MUSIC);
        gzVar.mo55429h("com.amazon.mp3", C118442r.AMAZON_MUSIC);
        f328768b = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static C118442r m196633a(ComponentName componentName) {
        return (C118442r) f328768b.getOrDefault(componentName.getPackageName(), C118442r.OTHERS);
    }

    /* renamed from: b */
    public static C60870cx m196634b(C18913ab abVar, C21370a aVar, int i, C91189au auVar, C22871g gVar, boolean z) {
        C123727au c = C18912aa.m36354c(abVar.mo24143a(), abVar.mo24151h(), abVar.mo24146d(), abVar.mo24145c(), abVar.mo24144b(), i);
        if (abVar.mo24150g() == null || abVar.mo24150g().isEmpty()) {
            return C60856cj.m92900i((C123728av) c.build());
        }
        C60870cx e = C60856cj.m92896e((C58485gu) Collection.EL.stream(abVar.mo24150g()).filter(C118439o.f328742a).map(new C118440p(abVar, auVar, gVar, z)).collect(C58370cn.f155946a));
        C118441q qVar = new C118441q(c, aVar);
        return C60922j.m93044g(e, C47810es.m84963c(qVar), C5622i.f16960b);
    }
}
