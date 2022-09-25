package com.google.android.apps.gsa.p8867w.p8882j;

import com.google.android.apps.gsa.search.core.preferences.C86318i;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.search.podcasts.p10576l.C140444af;
import com.google.android.apps.search.podcasts.p10576l.C140445ag;
import com.google.android.apps.search.podcasts.p10576l.C140446ah;
import com.google.android.apps.search.podcasts.p10576l.C140447ai;
import com.google.android.apps.search.podcasts.p10576l.C140448aj;
import com.google.android.apps.search.podcasts.p10576l.C140449ak;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140451am;
import com.google.android.apps.search.podcasts.p10576l.C140452an;
import com.google.android.apps.search.podcasts.p10576l.C140505q;
import com.google.android.apps.search.podcasts.p10576l.C140506r;
import com.google.android.apps.search.podcasts.p10576l.C140507s;
import com.google.android.apps.search.podcasts.p10576l.C140508t;
import com.google.android.apps.search.podcasts.p10576l.C140510v;
import com.google.android.apps.search.podcasts.p10576l.C140511w;
import com.google.android.apps.search.podcasts.p10576l.C140512x;
import com.google.android.apps.search.podcasts.p10576l.C140513y;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.w.j.c */
/* compiled from: PG */
public final class C118821c {

    /* renamed from: b */
    private static final C59071e f331401b = C59071e.m91332i("com.google.android.apps.gsa.w.j.c");

    /* renamed from: c */
    private static final C140449ak f331402c = C140449ak.SYSTEM_DEFAULT;

    /* renamed from: a */
    public final C86338r f331403a;

    public C118821c(C86318i iVar) {
        this.f331403a = iVar.mo80039a("wernicke_player", "PodcastPlayerPrefs");
    }

    /* renamed from: b */
    public static String m197201b(String str, String str2) {
        return str2 == null ? str : str.concat(str2);
    }

    /* renamed from: g */
    private final long m197202g(String str, String str2, long j) {
        if (!mo104007c()) {
            return j;
        }
        C86338r rVar = this.f331403a;
        rVar.getClass();
        if (rVar.contains(m197201b(str2, str))) {
            C86338r rVar2 = this.f331403a;
            rVar2.getClass();
            return rVar2.getLong(m197201b(str2, str), j);
        }
        C86338r rVar3 = this.f331403a;
        rVar3.getClass();
        return rVar3.getLong(str2, j);
    }

    /* renamed from: h */
    private final boolean m197203h(String str, String str2, boolean z) {
        if (!mo104007c()) {
            return false;
        }
        C86338r rVar = this.f331403a;
        rVar.getClass();
        if (rVar.contains(m197201b(str2, str))) {
            C86338r rVar2 = this.f331403a;
            rVar2.getClass();
            return rVar2.getBoolean(m197201b(str2, str), z);
        }
        C86338r rVar3 = this.f331403a;
        rVar3.getClass();
        return rVar3.getBoolean(str2, z);
    }

    /* renamed from: a */
    public final C140450al mo104006a(String str) {
        int i;
        C140448aj ajVar = (C140448aj) C140450al.f381513p.createBuilder();
        C140512x xVar = (C140512x) C140513y.f381639d.createBuilder();
        long g = m197202g(str, "TimeToRemoveCompletedEpisode", 86400000);
        xVar.copyOnWrite();
        ((C140513y) xVar.instance).f381641a = g;
        long g2 = m197202g(str, "TimeToRemoveUnfinishedEpisode", 2592000000L);
        xVar.copyOnWrite();
        ((C140513y) xVar.instance).f381642b = g2;
        boolean h = m197203h((String) null, "SettingsClarificationWasShwon", false);
        xVar.copyOnWrite();
        ((C140513y) xVar.instance).f381643c = h;
        ajVar.copyOnWrite();
        C140513y yVar = (C140513y) xVar.build();
        yVar.getClass();
        ((C140450al) ajVar.instance).f381517c = yVar;
        int number = f331402c.getNumber();
        if (mo104007c()) {
            C86338r rVar = this.f331403a;
            rVar.getClass();
            if (rVar.contains(m197201b("ThemeSetting", str))) {
                C86338r rVar2 = this.f331403a;
                rVar2.getClass();
                number = rVar2.getInt(m197201b("ThemeSetting", str), number);
            } else {
                C86338r rVar3 = this.f331403a;
                rVar3.getClass();
                number = rVar3.getInt("ThemeSetting", number);
            }
        }
        C140449ak a = C140449ak.m228147a(number);
        ajVar.copyOnWrite();
        ((C140450al) ajVar.instance).f381518d = a.getNumber();
        C140510v vVar = (C140510v) C140511w.f381636b.createBuilder();
        boolean h2 = m197203h(str, "AutoplayFromQueueEnabled", true);
        vVar.copyOnWrite();
        ((C140511w) vVar.instance).f381638a = h2;
        C140511w wVar = (C140511w) vVar.build();
        ajVar.copyOnWrite();
        wVar.getClass();
        ((C140450al) ajVar.instance).f381524j = wVar;
        C140446ah ahVar = (C140446ah) C140447ai.f381502c.createBuilder();
        float f = 1.0f;
        if (mo104007c()) {
            C86338r rVar4 = this.f331403a;
            rVar4.getClass();
            if (rVar4.contains(m197201b("PlaybackSpeed", str))) {
                C86338r rVar5 = this.f331403a;
                rVar5.getClass();
                f = rVar5.getFloat(m197201b("PlaybackSpeed", str), 1.0f);
            } else {
                C86338r rVar6 = this.f331403a;
                rVar6.getClass();
                f = rVar6.getFloat("PlaybackSpeed", 1.0f);
            }
        }
        ahVar.copyOnWrite();
        ((C140447ai) ahVar.instance).f381504a = f;
        boolean h3 = m197203h(str, "PlaybackTrimSilence", false);
        ahVar.copyOnWrite();
        ((C140447ai) ahVar.instance).f381505b = h3;
        ajVar.copyOnWrite();
        C140447ai aiVar = (C140447ai) ahVar.build();
        aiVar.getClass();
        ((C140450al) ajVar.instance).f381521g = aiVar;
        C140507s sVar = (C140507s) C140508t.f381626c.createBuilder();
        boolean h4 = m197203h((String) null, "AutoDownloadPodcasts", false);
        sVar.copyOnWrite();
        ((C140508t) sVar.instance).f381628a = h4;
        boolean h5 = m197203h((String) null, "AutoDownloadPodcastsWithWifi", true);
        sVar.copyOnWrite();
        ((C140508t) sVar.instance).f381629b = h5;
        ajVar.copyOnWrite();
        C140508t tVar = (C140508t) sVar.build();
        tVar.getClass();
        ((C140450al) ajVar.instance).f381525k = tVar;
        C140451am amVar = (C140451am) C140452an.f381530b.createBuilder();
        boolean h6 = m197203h((String) null, "ShowCompletedEpisodes", true);
        amVar.copyOnWrite();
        ((C140452an) amVar.instance).f381532a = h6;
        ajVar.copyOnWrite();
        C140452an anVar = (C140452an) amVar.build();
        anVar.getClass();
        ((C140450al) ajVar.instance).f381526l = anVar;
        C140444af afVar = (C140444af) C140445ag.f381495f.createBuilder();
        if (mo104007c()) {
            C86338r rVar7 = this.f331403a;
            rVar7.getClass();
            i = rVar7.getInt("RemainingPlayStrePromotionsCount", 0);
        } else {
            i = 3;
        }
        afVar.copyOnWrite();
        ((C140445ag) afVar.instance).f381497a = i;
        long g3 = m197202g((String) null, "TimeOfLastPlayStorePrompt", -1);
        afVar.copyOnWrite();
        ((C140445ag) afVar.instance).f381498b = g3;
        long g4 = m197202g((String) null, "TimeOfLastPlayStoreRating", -1);
        afVar.copyOnWrite();
        ((C140445ag) afVar.instance).f381499c = g4;
        long g5 = m197202g((String) null, "TimeOfLastPlayStoreFeedback", -1);
        afVar.copyOnWrite();
        ((C140445ag) afVar.instance).f381500d = g5;
        long g6 = m197202g((String) null, "TimeOfLastPlayStoreDismissal", -1);
        afVar.copyOnWrite();
        ((C140445ag) afVar.instance).f381501e = g6;
        ajVar.copyOnWrite();
        C140445ag agVar = (C140445ag) afVar.build();
        agVar.getClass();
        ((C140450al) ajVar.instance).f381527m = agVar;
        C140505q qVar = (C140505q) C140506r.f381623b.createBuilder();
        boolean h7 = m197203h((String) null, "PlaybackReminderShown", false);
        qVar.copyOnWrite();
        ((C140506r) qVar.instance).f381625a = h7;
        ajVar.copyOnWrite();
        C140506r rVar8 = (C140506r) qVar.build();
        rVar8.getClass();
        ((C140450al) ajVar.instance).f381528n = rVar8;
        return (C140450al) ajVar.build();
    }

    /* renamed from: c */
    public final synchronized boolean mo104007c() {
        boolean z;
        z = this.f331403a != null;
        if (!z) {
            ((C59052c) ((C59052c) f331401b.mo56226d()).mo56372aa(11497)).mo56386p("For some reason sharedPreferencesExt isn't retrieved.");
        }
        return z;
    }

    /* renamed from: d */
    public final void mo104008d(String str, String str2, boolean z) {
        if (mo104007c()) {
            C86338r rVar = this.f331403a;
            rVar.getClass();
            C86337q b = rVar.mo80076b();
            b.mo80067b(m197201b(str2, str), z);
            b.commit();
        }
    }

    /* renamed from: e */
    public final void mo104009e(String str, String str2, int i) {
        if (mo104007c()) {
            C86338r rVar = this.f331403a;
            rVar.getClass();
            C86337q b = rVar.mo80076b();
            b.mo80070e(m197201b(str2, str), i);
            b.commit();
        }
    }

    /* renamed from: f */
    public final void mo104010f(String str, String str2, long j) {
        if (mo104007c()) {
            C86338r rVar = this.f331403a;
            rVar.getClass();
            C86337q b = rVar.mo80076b();
            b.mo80072g(m197201b(str2, str), j);
            b.commit();
        }
    }
}
