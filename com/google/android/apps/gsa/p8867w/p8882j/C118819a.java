package com.google.android.apps.gsa.p8867w.p8882j;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.search.podcasts.p10576l.C140445ag;
import com.google.android.apps.search.podcasts.p10576l.C140447ai;
import com.google.android.apps.search.podcasts.p10576l.C140449ak;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140452an;
import com.google.android.apps.search.podcasts.p10576l.C140506r;
import com.google.android.apps.search.podcasts.p10576l.C140508t;
import com.google.android.apps.search.podcasts.p10576l.C140511w;
import com.google.android.apps.search.podcasts.p10576l.C140513y;
import com.google.common.base.C58817ah;
import com.google.common.p4575r.C60752i;

/* renamed from: com.google.android.apps.gsa.w.j.a */
/* compiled from: PG */
public final /* synthetic */ class C118819a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C118820b f331397a;

    /* renamed from: b */
    public final /* synthetic */ String f331398b;

    /* renamed from: c */
    public final /* synthetic */ C58817ah f331399c;

    public /* synthetic */ C118819a(C118820b bVar, String str, C58817ah ahVar) {
        this.f331397a = bVar;
        this.f331398b = str;
        this.f331399c = ahVar;
    }

    public final void run() {
        C118820b bVar = this.f331397a;
        String str = this.f331398b;
        C58817ah ahVar = this.f331399c;
        C118821c cVar = bVar.f331400a;
        C140450al alVar = (C140450al) ahVar.apply(cVar.mo104006a(str));
        C140445ag agVar = alVar.f381527m;
        if (agVar == null) {
            agVar = C140445ag.f381495f;
        }
        C140513y yVar = alVar.f381517c;
        if (yVar == null) {
            yVar = C140513y.f381639d;
        }
        cVar.mo104010f(str, "TimeToRemoveCompletedEpisode", yVar.f381641a);
        cVar.mo104008d((String) null, "SettingsClarificationWasShwon", true);
        cVar.mo104010f(str, "TimeToRemoveUnfinishedEpisode", yVar.f381642b);
        cVar.mo104008d((String) null, "SettingsClarificationWasShwon", true);
        cVar.mo104008d((String) null, "SettingsClarificationWasShwon", yVar.f381643c);
        C140449ak a = C140449ak.m228147a(alVar.f381518d);
        if (a == null) {
            a = C140449ak.UNRECOGNIZED;
        }
        cVar.mo104009e(str, "ThemeSetting", a.getNumber());
        C140511w wVar = alVar.f381524j;
        if (wVar == null) {
            wVar = C140511w.f381636b;
        }
        cVar.mo104008d(str, "AutoplayFromQueueEnabled", wVar.f381638a);
        C140447ai aiVar = alVar.f381521g;
        if (aiVar == null) {
            aiVar = C140447ai.f381502c;
        }
        float a2 = C60752i.m92727a(aiVar.f381504a, 0.5f, 3.0f);
        if (cVar.mo104007c()) {
            C86338r rVar = cVar.f331403a;
            rVar.getClass();
            C86337q b = rVar.mo80076b();
            b.mo80069d(C118821c.m197201b("PlaybackSpeed", str), a2);
            b.commit();
        }
        C140447ai aiVar2 = alVar.f381521g;
        if (aiVar2 == null) {
            aiVar2 = C140447ai.f381502c;
        }
        cVar.mo104008d(str, "PlaybackTrimSilence", aiVar2.f381505b);
        C140508t tVar = alVar.f381525k;
        if (tVar == null) {
            tVar = C140508t.f381626c;
        }
        cVar.mo104008d((String) null, "AutoDownloadPodcasts", tVar.f381628a);
        C140508t tVar2 = alVar.f381525k;
        if (tVar2 == null) {
            tVar2 = C140508t.f381626c;
        }
        cVar.mo104008d((String) null, "AutoDownloadPodcastsWithWifi", tVar2.f381629b);
        C140452an anVar = alVar.f381526l;
        if (anVar == null) {
            anVar = C140452an.f381530b;
        }
        cVar.mo104008d((String) null, "ShowCompletedEpisodes", anVar.f381532a);
        cVar.mo104009e((String) null, "RemainingPlayStrePromotionsCount", agVar.f381497a);
        cVar.mo104010f((String) null, "TimeOfLastPlayStorePrompt", agVar.f381498b);
        cVar.mo104010f((String) null, "TimeOfLastPlayStoreRating", agVar.f381499c);
        cVar.mo104010f((String) null, "TimeOfLastPlayStoreFeedback", agVar.f381500d);
        cVar.mo104010f((String) null, "TimeOfLastPlayStoreDismissal", agVar.f381501e);
        C140506r rVar2 = alVar.f381528n;
        if (rVar2 == null) {
            rVar2 = C140506r.f381623b;
        }
        cVar.mo104008d((String) null, "PlaybackReminderShown", rVar2.f381625a);
    }
}
