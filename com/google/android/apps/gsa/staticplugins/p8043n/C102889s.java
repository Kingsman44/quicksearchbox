package com.google.android.apps.gsa.staticplugins.p8043n;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import androidx.p104d.p105a.C2164c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6743l.C85516a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88372zf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88375zi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88376zj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88386zt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88389zw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88390zx;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.n.s */
/* compiled from: PG */
public final class C102889s extends C86734a implements C85516a {

    /* renamed from: a */
    public static final C59071e f287330a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.n.s");

    /* renamed from: b */
    public final Context f287331b;

    /* renamed from: c */
    public final AudioManager f287332c;

    /* renamed from: f */
    public final Executor f287333f;

    /* renamed from: g */
    public String f287334g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f287335h;

    /* renamed from: i */
    public C22871g f287336i;

    /* renamed from: j */
    public final Object f287337j = new Object();

    /* renamed from: k */
    public MediaPlayer f287338k;

    /* renamed from: l */
    public C2164c f287339l;

    /* renamed from: m */
    private final C22871g f287340m;

    /* renamed from: n */
    private final C22871g f287341n;

    /* renamed from: o */
    private final C22871g f287342o;

    /* renamed from: p */
    private final C86610af f287343p;

    /* renamed from: q */
    private C60870cx f287344q;

    public C102889s(C86610af afVar, C90821bm bmVar, C22871g gVar, C22871g gVar2, Context context, AudioManager audioManager) {
        super(C118575h.WORKER_AUDIO_MESSAGE, "audiomessage");
        this.f287343p = afVar;
        this.f287340m = bmVar.mo85163a(C102888r.class);
        this.f287341n = gVar;
        this.f287342o = gVar2;
        this.f287331b = context;
        this.f287332c = audioManager;
        this.f287333f = new C102878h(gVar);
    }

    /* renamed from: l */
    private final void m170642l(int i) {
        C86775r rVar = this.f287343p.f233977l;
        if (rVar != null) {
            C88386zt ztVar = (C88386zt) C88389zw.f239003c.createBuilder();
            ztVar.copyOnWrite();
            C88389zw zwVar = (C88389zw) ztVar.instance;
            zwVar.f239006b = i - 1;
            zwVar.f239005a |= 1;
            C87684al alVar = new C87684al(C88244um.UPDATE_SPEECH_EVENT);
            alVar.mo81965b(C88390zx.f239007a, (C88389zw) ztVar.build());
            rVar.f234383e.mo80379b(alVar.mo81964a());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo79035a(java.lang.String r19, boolean r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r6 = 5
            r7 = 0
            r8 = 7
            r9 = 1
            java.lang.String r10 = "ur-IN"
            java.lang.String r11 = "te-IN"
            java.lang.String r12 = "ta-IN"
            java.lang.String r13 = "mr-IN"
            java.lang.String r14 = "ml-IN"
            java.lang.String r15 = "kn-IN"
            java.lang.String r2 = "hi-IN"
            java.lang.String r3 = "gu-IN"
            java.lang.String r4 = "bn-IN"
            r16 = -1
            r5 = 3
            if (r20 == 0) goto L_0x00a6
            int r17 = r19.hashCode()
            switch(r17) {
                case 93827654: goto L_0x0068;
                case 98653796: goto L_0x0060;
                case 99219825: goto L_0x0058;
                case 102139343: goto L_0x0050;
                case 103926803: goto L_0x0048;
                case 104105549: goto L_0x0040;
                case 110063749: goto L_0x0038;
                case 110182913: goto L_0x0030;
                case 111493717: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0070
        L_0x0027:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0070
            r2 = 8
            goto L_0x0071
        L_0x0030:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0070
            r2 = 2
            goto L_0x0071
        L_0x0038:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0070
            r2 = 4
            goto L_0x0071
        L_0x0040:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0070
            r2 = 3
            goto L_0x0071
        L_0x0048:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x0070
            r2 = 6
            goto L_0x0071
        L_0x0050:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x0070
            r2 = 5
            goto L_0x0071
        L_0x0058:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0070
            r2 = 0
            goto L_0x0071
        L_0x0060:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0070
            r2 = 7
            goto L_0x0071
        L_0x0068:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0070
            r2 = 1
            goto L_0x0071
        L_0x0070:
            r2 = -1
        L_0x0071:
            switch(r2) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x009c;
                case 2: goto L_0x0097;
                case 3: goto L_0x0092;
                case 4: goto L_0x008d;
                case 5: goto L_0x0088;
                case 6: goto L_0x0083;
                case 7: goto L_0x007e;
                case 8: goto L_0x0079;
                default: goto L_0x0074;
            }
        L_0x0074:
            r1 = 2132017411(0x7f140103, float:1.96731E38)
            goto L_0x0122
        L_0x0079:
            r1 = 2132017419(0x7f14010b, float:1.9673116E38)
            goto L_0x0122
        L_0x007e:
            r1 = 2132017412(0x7f140104, float:1.9673102E38)
            goto L_0x0122
        L_0x0083:
            r1 = 2132017415(0x7f140107, float:1.9673108E38)
            goto L_0x0122
        L_0x0088:
            r1 = 2132017414(0x7f140106, float:1.9673106E38)
            goto L_0x0122
        L_0x008d:
            r1 = 2132017417(0x7f140109, float:1.9673112E38)
            goto L_0x0122
        L_0x0092:
            r1 = 2132017416(0x7f140108, float:1.967311E38)
            goto L_0x0122
        L_0x0097:
            r1 = 2132017418(0x7f14010a, float:1.9673114E38)
            goto L_0x0122
        L_0x009c:
            r1 = 2132017410(0x7f140102, float:1.9673098E38)
            goto L_0x0122
        L_0x00a1:
            r1 = 2132017413(0x7f140105, float:1.9673104E38)
            goto L_0x0122
        L_0x00a6:
            int r17 = r19.hashCode()
            switch(r17) {
                case 93827654: goto L_0x00ef;
                case 98653796: goto L_0x00e7;
                case 99219825: goto L_0x00df;
                case 102139343: goto L_0x00d7;
                case 103926803: goto L_0x00cf;
                case 104105549: goto L_0x00c7;
                case 110063749: goto L_0x00bf;
                case 110182913: goto L_0x00b7;
                case 111493717: goto L_0x00ae;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            goto L_0x00f7
        L_0x00ae:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00f7
            r2 = 8
            goto L_0x00f8
        L_0x00b7:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00f7
            r2 = 2
            goto L_0x00f8
        L_0x00bf:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00f7
            r2 = 4
            goto L_0x00f8
        L_0x00c7:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00f7
            r2 = 3
            goto L_0x00f8
        L_0x00cf:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00f7
            r2 = 6
            goto L_0x00f8
        L_0x00d7:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00f7
            r2 = 5
            goto L_0x00f8
        L_0x00df:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00f7
            r2 = 0
            goto L_0x00f8
        L_0x00e7:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f7
            r2 = 7
            goto L_0x00f8
        L_0x00ef:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00f7
            r2 = 1
            goto L_0x00f8
        L_0x00f7:
            r2 = -1
        L_0x00f8:
            switch(r2) {
                case 0: goto L_0x011f;
                case 1: goto L_0x011b;
                case 2: goto L_0x0117;
                case 3: goto L_0x0113;
                case 4: goto L_0x010f;
                case 5: goto L_0x010b;
                case 6: goto L_0x0107;
                case 7: goto L_0x0103;
                case 8: goto L_0x00ff;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            r1 = 2132017421(0x7f14010d, float:1.967312E38)
            goto L_0x0122
        L_0x00ff:
            r1 = 2132017429(0x7f140115, float:1.9673136E38)
            goto L_0x0122
        L_0x0103:
            r1 = 2132017422(0x7f14010e, float:1.9673122E38)
            goto L_0x0122
        L_0x0107:
            r1 = 2132017425(0x7f140111, float:1.9673128E38)
            goto L_0x0122
        L_0x010b:
            r1 = 2132017424(0x7f140110, float:1.9673126E38)
            goto L_0x0122
        L_0x010f:
            r1 = 2132017427(0x7f140113, float:1.9673132E38)
            goto L_0x0122
        L_0x0113:
            r1 = 2132017426(0x7f140112, float:1.967313E38)
            goto L_0x0122
        L_0x0117:
            r1 = 2132017428(0x7f140114, float:1.9673134E38)
            goto L_0x0122
        L_0x011b:
            r1 = 2132017420(0x7f14010c, float:1.9673118E38)
            goto L_0x0122
        L_0x011f:
            r1 = 2132017423(0x7f14010f, float:1.9673124E38)
        L_0x0122:
            android.media.AudioManager r2 = r0.f287332c
            int r2 = r2.getStreamVolume(r5)
            android.media.AudioManager r3 = r0.f287332c
            int r3 = r3.getStreamMaxVolume(r5)
            com.google.android.libraries.gsa.k.g r4 = r0.f287342o
            r0.f287336i = r4
            float r2 = (float) r2
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            r3 = 50
            if (r2 < r3) goto L_0x014a
            if (r4 == 0) goto L_0x014a
            com.google.android.apps.gsa.staticplugins.n.l r2 = new com.google.android.apps.gsa.staticplugins.n.l
            r2.<init>(r0, r1)
            com.google.common.util.concurrent.cx r1 = androidx.p104d.p105a.C2169h.m6027a(r2)
            goto L_0x014c
        L_0x014a:
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x014c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8043n.C102889s.mo79035a(java.lang.String, boolean):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final void mo79036b() {
        new C90873ag(this.f287344q, this.f287340m, "pauseAudio", new C102879i(this)).mo85223a(C102880j.f287321a);
    }

    /* renamed from: c */
    public final void mo79037c(String str) {
        this.f287334g = str;
        new C90873ag(this.f287344q, this.f287340m, "Play media URI", new C102875e(this)).mo85223a(C102876f.f287317a);
    }

    /* renamed from: d */
    public final void mo79038d() {
        m170642l(4);
    }

    /* renamed from: e */
    public final void mo79039e() {
        m170642l(2);
    }

    /* renamed from: f */
    public final void mo79040f() {
        m170642l(3);
    }

    /* renamed from: g */
    public final void mo79041g() {
        new C90873ag(this.f287344q, this.f287340m, "resumeAudio", new C102883m(this)).mo85223a(C102884n.f287326a);
    }

    /* renamed from: h */
    public final void mo79042h() {
        new C90873ag(this.f287344q, this.f287340m, "stopAudio", new C102885o(this)).mo85223a(C102886p.f287328a);
    }

    /* renamed from: i */
    public final void mo79043i() {
        try {
            synchronized (this.f287337j) {
                MediaPlayer mediaPlayer = this.f287338k;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    this.f287338k.stop();
                    C2164c cVar = this.f287339l;
                    if (cVar != null) {
                        cVar.mo5438c();
                    }
                }
                mo93523j();
            }
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) f287330a.mo56226d()).mo56382g(e)).mo56372aa(14044)).mo56386p("isPlaying is called at wrong state");
        }
    }

    /* renamed from: ib */
    public final void mo80350ib() {
        this.f287344q = this.f287341n.mo28201a("initialize", new C102877g(this));
    }

    /* renamed from: j */
    public final void mo93523j() {
        synchronized (this.f287337j) {
            MediaPlayer mediaPlayer = this.f287338k;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.f287338k = null;
            }
            C2164c cVar = this.f287339l;
            if (cVar != null) {
                cVar.mo5437b((Object) null);
                this.f287339l = null;
            }
        }
    }

    /* renamed from: k */
    public final void mo93524k(MediaPlayer mediaPlayer, int i) {
        C86775r rVar = this.f287343p.f233977l;
        if (rVar != null) {
            C88372zf zfVar = (C88372zf) C88375zi.f238978e.createBuilder();
            String str = this.f287334g;
            zfVar.copyOnWrite();
            C88375zi ziVar = (C88375zi) zfVar.instance;
            str.getClass();
            ziVar.f238980a |= 2;
            ziVar.f238982c = str;
            int duration = mediaPlayer.getDuration();
            zfVar.copyOnWrite();
            C88375zi ziVar2 = (C88375zi) zfVar.instance;
            ziVar2.f238980a |= 4;
            ziVar2.f238983d = duration;
            zfVar.copyOnWrite();
            C88375zi ziVar3 = (C88375zi) zfVar.instance;
            ziVar3.f238981b = i - 1;
            ziVar3.f238980a |= 1;
            C87684al alVar = new C87684al(C88244um.UPDATE_MEDIA_EXECUTION);
            alVar.mo81965b(C88376zj.f238984a, (C88375zi) zfVar.build());
            rVar.f234383e.mo80379b(alVar.mo81964a());
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
