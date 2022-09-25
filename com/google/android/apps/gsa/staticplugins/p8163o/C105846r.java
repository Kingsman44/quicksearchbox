package com.google.android.apps.gsa.staticplugins.p8163o;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.p031v4.media.C0329x;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0286ac;
import android.support.p031v4.media.session.C0298ao;
import android.support.p031v4.media.session.C0324z;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewConfiguration;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2663g;
import androidx.media3.common.C2664h;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.C3267o;
import androidx.media3.exoplayer.p137a.C2727bp;
import androidx.media3.exoplayer.p137a.C2733d;
import androidx.media3.exoplayer.p145h.C3038au;
import androidx.media3.exoplayer.p145h.C3086bx;
import androidx.media3.p132b.C2484ac;
import androidx.media3.p132b.C2510n;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6614br.C85011a;
import com.google.android.apps.gsa.search.core.p6519al.p6628by.p6629a.C85043g;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6848e.C86695q;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88398a;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88454d;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88455e;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88456f;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88457g;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88458h;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88459i;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90073dy;
import com.google.android.apps.gsa.shared.p7127q.C90455b;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10890h.p10891a.p10893b.C146577h;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.r */
/* compiled from: PG */
public final class C105846r implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    public static final C59071e f295277a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.o.r");

    /* renamed from: b */
    public static final C58528ij f295278b;

    /* renamed from: y */
    private static final int f295279y = R.drawable.quantum_gm_ic_cast_connected_black_24;

    /* renamed from: z */
    private static final C58495hd f295280z = C58495hd.m89901o("podcast_player", "com.google.android.apps.search.podcasts.browser.PodcastBrowserService", "opa_media_player", "com.google.android.apps.gsa.staticplugins.mediabrowser.OpaMediaBrowserService");

    /* renamed from: A */
    private final C69464a f295281A;

    /* renamed from: B */
    private final C21370a f295282B;

    /* renamed from: C */
    private final C105831c f295283C;

    /* renamed from: D */
    private final C86695q f295284D;

    /* renamed from: E */
    private final C105804ao f295285E;

    /* renamed from: F */
    private final C105791ab f295286F;

    /* renamed from: G */
    private final C86124t f295287G;

    /* renamed from: H */
    private long f295288H;

    /* renamed from: I */
    private long f295289I;

    /* renamed from: J */
    private long f295290J;

    /* renamed from: K */
    private long f295291K;

    /* renamed from: L */
    private final AudioManager f295292L;

    /* renamed from: M */
    private int f295293M;

    /* renamed from: N */
    private final WifiManager.WifiLock f295294N;

    /* renamed from: O */
    private boolean f295295O;

    /* renamed from: P */
    private BroadcastReceiver f295296P;

    /* renamed from: Q */
    private int f295297Q;

    /* renamed from: R */
    private long f295298R;

    /* renamed from: S */
    private long f295299S;

    /* renamed from: T */
    private PlaybackStateCompat f295300T;

    /* renamed from: U */
    private C146577h f295301U;

    /* renamed from: V */
    private long f295302V;

    /* renamed from: W */
    private int f295303W;

    /* renamed from: X */
    private int f295304X;

    /* renamed from: Y */
    private final C0324z f295305Y;

    /* renamed from: Z */
    private C60870cx f295306Z;

    /* renamed from: c */
    public final Context f295307c;

    /* renamed from: d */
    public final C22871g f295308d;

    /* renamed from: e */
    public final C85011a f295309e;

    /* renamed from: f */
    public final String f295310f;

    /* renamed from: g */
    final C2733d f295311g;

    /* renamed from: h */
    public final C89911f f295312h;

    /* renamed from: i */
    public final MediaSessionCompat f295313i;

    /* renamed from: j */
    public C2759ad f295314j;

    /* renamed from: k */
    public C2759ad f295315k;

    /* renamed from: l */
    public float f295316l = 1.0f;

    /* renamed from: m */
    public boolean f295317m = false;

    /* renamed from: n */
    public boolean f295318n;

    /* renamed from: o */
    public boolean f295319o;

    /* renamed from: p */
    public boolean f295320p = true;

    /* renamed from: q */
    public PendingIntent f295321q;

    /* renamed from: r */
    public C3267o f295322r;

    /* renamed from: s */
    public int f295323s = 0;

    /* renamed from: t */
    public MediaMetadataCompat f295324t;

    /* renamed from: u */
    public C0329x f295325u;

    /* renamed from: v */
    boolean f295326v;

    /* renamed from: w */
    public final C105844p f295327w;

    /* renamed from: x */
    public final C85043g f295328x;

    static {
        C58526ih ihVar = new C58526ih();
        ihVar.mo55373c(1);
        ihVar.mo55373c(2);
        ihVar.mo55373c(12);
        ihVar.mo55373c(16);
        f295278b = ihVar.mo55486f();
    }

    public C105846r(C69464a aVar, Map map, Context context, C21370a aVar2, C22871g gVar, C85043g gVar2, C85011a aVar3, C105831c cVar, C86695q qVar, C105804ao aoVar, C86124t tVar, String str, C89911f fVar, C105791ab abVar) {
        Map map2 = map;
        Context context2 = context;
        C105831c cVar2 = cVar;
        String str2 = str;
        C105841m mVar = new C105841m(this);
        this.f295305Y = mVar;
        this.f295306Z = C60866ct.f164955a;
        this.f295327w = new C105844p(this);
        if (!map.containsKey(str2)) {
            this.f295281A = aVar;
        } else {
            this.f295281A = (C69464a) map.get(str2);
        }
        this.f295307c = context2;
        this.f295282B = aVar2;
        this.f295308d = gVar;
        this.f295328x = gVar2;
        this.f295309e = aVar3;
        this.f295283C = cVar2;
        this.f295284D = qVar;
        this.f295285E = aoVar;
        this.f295287G = tVar;
        this.f295310f = str2;
        this.f295286F = abVar;
        this.f295311g = new C105845q(this);
        this.f295292L = (AudioManager) context.getSystemService("audio");
        WifiManager.WifiLock createWifiLock = ((WifiManager) context.getSystemService("wifi")).createWifiLock("APWDelegate");
        this.f295294N = createWifiLock;
        createWifiLock.setReferenceCounted(false);
        C58976aa aaVar = C58975e.f156826a;
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "AudioPlayerWorker", (ComponentName) null, (PendingIntent) null);
        mediaSessionCompat.mo873e(mVar, (Handler) null);
        mediaSessionCompat.mo881m();
        mediaSessionCompat.mo872d(true);
        mediaSessionCompat.mo874f(m176294y(str));
        this.f295313i = mediaSessionCompat;
        cVar2.f295243j = cVar2.mo95079a(str2, 4);
        cVar2.f295244k = cVar2.mo95079a(str2, 2);
        cVar2.f295245l = cVar2.mo95079a(str2, 1);
        cVar2.f295246m = cVar2.mo95079a(str2, 8);
        cVar2.f295247n = cVar2.mo95079a(str2, 64);
        cVar2.f295249p = cVar2.mo95081d(str2, 7);
        cVar2.f295248o = cVar2.mo95081d(str2, 6);
        this.f295312h = fVar;
    }

    /* renamed from: A */
    private static List m176285A(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlaybackStateCompat.CustomAction) it.next()).f1006a);
        }
        return arrayList;
    }

    /* renamed from: B */
    private final void m176286B() {
        this.f295292L.abandonAudioFocus(this);
        this.f295295O = false;
    }

    /* renamed from: C */
    private static void m176287C(List list, List list2) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(Uri.parse((String) it.next()));
            }
        }
    }

    /* renamed from: D */
    private final void m176288D() {
        this.f295299S = this.f295282B.mo26870b();
    }

    /* renamed from: b */
    static long m176289b(C2759ad adVar) {
        C2651bm u = adVar.mo6014u();
        C2650bl blVar = new C2650bl();
        long j = 0;
        for (int i = 0; i < u.mo6022c(); i++) {
            u.mo6024e(i, blVar, 0);
            if (C2612ak.m6918A(blVar.f7349n) == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j += C2612ak.m6918A(blVar.f7349n);
        }
        return j;
    }

    /* renamed from: c */
    static long m176290c(C2759ad adVar) {
        C2651bm u = adVar.mo6014u();
        if (u != null && u.mo6022c() < adVar.mo6254V()) {
            return 0;
        }
        C2650bl blVar = new C2650bl();
        long j = 0;
        for (int i = 0; i < adVar.mo6254V(); i++) {
            u.mo6024e(i, blVar, 0);
            if (C2612ak.m6918A(blVar.f7349n) == -9223372036854775807L) {
                return adVar.mo6004k();
            }
            j += C2612ak.m6918A(blVar.f7349n);
        }
        return j + adVar.mo6004k();
    }

    /* renamed from: m */
    static void m176291m(C2759ad adVar, long j) {
        C2651bm u = adVar.mo6014u();
        if (u.mo6022c() == 0) {
            adVar.mo6263ah(j);
            return;
        }
        C2650bl blVar = new C2650bl();
        int i = 0;
        while (i < u.mo6022c()) {
            u.mo6024e(i, blVar, 0);
            if (C2612ak.m6918A(blVar.f7349n) != -9223372036854775807L) {
                long j2 = blVar.f7349n;
                if (j > C2612ak.m6918A(j2)) {
                    j -= C2612ak.m6918A(j2);
                    i++;
                }
            }
            adVar.mo5973A(i, j);
            return;
        }
    }

    /* renamed from: w */
    private final long m176292w(int i) {
        long j = 2;
        if (!(i == 3 || i == 6)) {
            j = 4;
        }
        return j | 1 | (true != this.f295318n ? 0 : 256);
    }

    /* renamed from: x */
    private final long m176293x(long j) {
        long b = this.f295282B.mo26870b();
        if (b - this.f295298R < ((long) ViewConfiguration.getDoubleTapTimeout())) {
            int i = this.f295297Q + 1;
            this.f295297Q = i;
            double d = (double) j;
            double pow = Math.pow(1.5d, (double) Math.max(i - 2, 0));
            Double.isNaN(d);
            j = Math.max(Math.min((long) (d * pow), 300000), -300000);
        } else {
            this.f295297Q = 0;
        }
        this.f295298R = b;
        return j;
    }

    /* renamed from: y */
    private static Bundle m176294y(String str) {
        Bundle bundle = new Bundle();
        C58495hd hdVar = f295280z;
        bundle.putString("android.media.session.BROWSE_SERVICE", hdVar.containsKey(str) ? (String) hdVar.get(str) : BuildConfig.FLAVOR);
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m176295z() {
        /*
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Context r1 = r15.f295307c
            r2 = 2132085260(0x7f150a0c, float:1.9810714E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "com.google.android.apps.gsa.search.core.work.audioplayer.SkipBackward"
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "You must specify an action to build a CustomAction"
            if (r3 != 0) goto L_0x0118
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r5 = "You must specify a name to build a CustomAction"
            if (r3 != 0) goto L_0x0112
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r3 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            r6 = 2131234398(0x7f080e5e, float:1.808496E38)
            r7 = 0
            r3.<init>(r2, r1, r6, r7)
            android.content.Context r1 = r15.f295307c
            r2 = 2132085261(0x7f150a0d, float:1.9810716E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "com.google.android.apps.gsa.search.core.work.audioplayer.SkipForward"
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L_0x010c
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 != 0) goto L_0x0106
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r6 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            r8 = 2131234199(0x7f080d97, float:1.8084557E38)
            r6.<init>(r2, r1, r8, r7)
            android.content.Context r1 = r15.f295307c
            r2 = 2132085263(0x7f150a0f, float:1.981072E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "com.google.android.apps.gsa.search.core.work.audioplayer.SkipPrevious"
            boolean r8 = android.text.TextUtils.isEmpty(r2)
            if (r8 != 0) goto L_0x0100
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 != 0) goto L_0x00fa
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r8 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            r9 = 2131234452(0x7f080e94, float:1.808507E38)
            r8.<init>(r2, r1, r9, r7)
            android.content.Context r1 = r15.f295307c
            r2 = 2132085262(0x7f150a0e, float:1.9810718E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "com.google.android.apps.gsa.search.core.work.audioplayer.SkipNext"
            boolean r9 = android.text.TextUtils.isEmpty(r2)
            if (r9 != 0) goto L_0x00f4
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x00ee
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r4 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            r5 = 2131234449(0x7f080e91, float:1.8085064E38)
            r4.<init>(r2, r1, r5, r7)
            long r1 = r15.f295291K
            r9 = 32
            long r9 = r9 & r1
            r11 = 16
            long r1 = r1 & r11
            java.lang.String r5 = r15.f295310f
            int r7 = r5.hashCode()
            r11 = 981909211(0x3a86bedb, float:0.0010280268)
            r12 = 1
            if (r7 == r11) goto L_0x00aa
            r11 = 1962305660(0x74f6687c, float:1.5617971E32)
            if (r7 == r11) goto L_0x00a0
            goto L_0x00b4
        L_0x00a0:
            java.lang.String r7 = "podcast_player"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00b4
            r5 = 0
            goto L_0x00b5
        L_0x00aa:
            java.lang.String r7 = "opa_media_player"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00b4
            r5 = 1
            goto L_0x00b5
        L_0x00b4:
            r5 = -1
        L_0x00b5:
            r13 = 0
            if (r5 == 0) goto L_0x00d5
            if (r5 == r12) goto L_0x00bc
            goto L_0x00ed
        L_0x00bc:
            int r5 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c3
            r0.add(r8)
        L_0x00c3:
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ca
            r0.add(r4)
        L_0x00ca:
            boolean r1 = r15.f295318n
            if (r1 == 0) goto L_0x00ed
            r0.add(r3)
            r0.add(r6)
            goto L_0x00ed
        L_0x00d5:
            boolean r5 = r15.f295318n
            if (r5 == 0) goto L_0x00df
            r0.add(r3)
            r0.add(r6)
        L_0x00df:
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e6
            r0.add(r8)
        L_0x00e6:
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ed
            r0.add(r4)
        L_0x00ed:
            return r0
        L_0x00ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x00f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r4)
            throw r0
        L_0x00fa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x0100:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r4)
            throw r0
        L_0x0106:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x010c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r4)
            throw r0
        L_0x0112:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x0118:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8163o.C105846r.m176295z():java.util.List");
    }

    /* renamed from: a */
    public final float mo95084a(Bundle bundle) {
        float max = Math.max(0.5f, Math.min(bundle.getFloat("com.google.android.apps.gsa.search.core.work.audioplayer.PlaybackSpeed", 1.0f), 3.0f));
        this.f295316l = max;
        return max;
    }

    /* renamed from: d */
    public final C58833ax mo95085d() {
        C3267o oVar = this.f295322r;
        if (oVar == null) {
            return C58836b.f156633a;
        }
        Throwable cause = oVar.getCause();
        return (!(cause instanceof IOException) || !(cause.getCause() instanceof C90455b)) ? C58836b.f156633a : C58833ax.m90834k((C90455b) cause.getCause());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo95086e() {
        int i;
        C58976aa aaVar = C58975e.f156826a;
        PlaybackStateCompat playbackStateCompat = this.f295300T;
        if (playbackStateCompat != null && ((i = playbackStateCompat.f994a) == 3 || i == 6)) {
            C59104x d = f295277a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "APWDelegate");
            ((C59052c) ((C59052c) d).mo56372aa(14077)).mo56386p("AudioPlayerWorker is disposed when the playback is still ongoing.");
            int i2 = C90755l.f253831a;
        }
        if (this.f295313i != null) {
            if (this.f295314j != null) {
                mo95090i();
            }
            m176286B();
            this.f295306Z.cancel(false);
            C105831c cVar = this.f295283C;
            cVar.f295237d.mo78817l(C89885b.S3REQUEST_BUILD_S3_CLIENT_INFO_FAILED_VALUE, true);
            ((NotificationManager) cVar.f295235b.getSystemService("notification")).cancel(C89885b.S3REQUEST_BUILD_S3_CLIENT_INFO_FAILED_VALUE);
            cVar.f295250q = false;
            this.f295300T = null;
            mo95100s(new Bundle());
            MediaSessionCompat mediaSessionCompat = this.f295313i;
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty("com.google.android.apps.gsa.search.core.work.audioplayer.EVENT_DISCONNECT_MEDIA_SESSION")) {
                ((C0286ac) mediaSessionCompat.f982b).f1013a.sendSessionEvent("com.google.android.apps.gsa.search.core.work.audioplayer.EVENT_DISCONNECT_MEDIA_SESSION", bundle);
                this.f295313i.mo873e((C0324z) null, (Handler) null);
                this.f295313i.mo872d(false);
                this.f295313i.mo871c();
                return;
            }
            throw new IllegalArgumentException("event cannot be null or empty");
        }
    }

    /* renamed from: f */
    public final void mo95087f() {
        if (!this.f295320p) {
            this.f295320p = true;
            this.f295294N.release();
            mo95088g();
            BroadcastReceiver broadcastReceiver = this.f295296P;
            if (broadcastReceiver != null) {
                this.f295307c.unregisterReceiver(broadcastReceiver);
                this.f295296P = null;
            }
            C88398a aVar = (C88398a) C88458h.f239136h.createBuilder();
            aVar.copyOnWrite();
            C88458h hVar = (C88458h) aVar.instance;
            hVar.f239140c = 1;
            hVar.f239138a |= 2;
            C88456f fVar = (C88456f) C88457g.f239132c.createBuilder();
            long c = this.f295282B.mo26871c();
            long j = this.f295302V;
            fVar.copyOnWrite();
            C88457g gVar = (C88457g) fVar.instance;
            gVar.f239134a |= 1;
            gVar.f239135b = c - j;
            C88457g gVar2 = (C88457g) fVar.build();
            aVar.copyOnWrite();
            C88458h hVar2 = (C88458h) aVar.instance;
            gVar2.getClass();
            hVar2.f239142e = gVar2;
            hVar2.f239138a |= 8;
            C88454d dVar = (C88454d) C88455e.f239127d.createBuilder();
            PlaybackStateCompat playbackStateCompat = this.f295300T;
            playbackStateCompat.getClass();
            int i = playbackStateCompat.f994a;
            dVar.copyOnWrite();
            C88455e eVar = (C88455e) dVar.instance;
            eVar.f239129a = 1 | eVar.f239129a;
            eVar.f239130b = i;
            PlaybackStateCompat playbackStateCompat2 = this.f295300T;
            playbackStateCompat2.getClass();
            long j2 = playbackStateCompat2.f995b;
            dVar.copyOnWrite();
            C88455e eVar2 = (C88455e) dVar.instance;
            eVar2.f239129a |= 2;
            eVar2.f239131c = j2;
            C88455e eVar3 = (C88455e) dVar.build();
            aVar.copyOnWrite();
            C88458h hVar3 = (C88458h) aVar.instance;
            eVar3.getClass();
            hVar3.f239141d = eVar3;
            hVar3.f239138a |= 4;
            C58976aa aaVar = C58975e.f156826a;
            mo95095o((C88458h) aVar.build());
        }
    }

    /* renamed from: g */
    public final void mo95088g() {
        C2759ad adVar = this.f295314j;
        if (adVar != null) {
            adVar.mo5974B(false);
        }
        mo95098q(true, false);
        m176288D();
    }

    /* renamed from: h */
    public final void mo95089h(String str, Bundle bundle, boolean z) {
        String str2 = str;
        Bundle bundle2 = bundle;
        boolean z2 = z;
        if (this.f295314j != null) {
            mo95087f();
            mo95090i();
        }
        this.f295322r = null;
        this.f295318n = true;
        this.f295303W = bundle2.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.CloseButtonInNotificationStyle", 0);
        this.f295304X = bundle2.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.ReplayButtonInNotificationStyle", 0);
        this.f295320p = !z2;
        mo95100s(bundle2);
        this.f295313i.mo875g(this.f295324t);
        this.f295288H = bundle2.getLong("com.google.android.apps.gsa.search.core.work.audioplayer.StartPosition");
        this.f295289I = bundle2.getLong("com.google.android.apps.gsa.search.core.work.audioplayer.StartWindowIndex");
        this.f295290J = bundle2.getLong("com.google.android.apps.gsa.search.core.work.audioplayer.StartOffsetInWindow");
        mo95084a(bundle2);
        this.f295317m = bundle2.getBoolean("com.google.android.apps.gsa.search.core.work.audioplayer.TrimSilence", false);
        this.f295319o = bundle2.getBoolean("com.google.android.apps.gsa.search.core.work.audioplayer.ReinterpretSkip", false);
        this.f295291K = bundle2.getLong("com.google.android.apps.gsa.search.core.work.audioplayer.SkipActions", 0);
        if ("podcast_player".equals(this.f295310f)) {
            this.f295293M = R.drawable.product_logo_podcasts_color_24;
        } else {
            this.f295293M = bundle2.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.StatusBarIcon", 17301540);
        }
        PendingIntent pendingIntent = (PendingIntent) bundle2.getParcelable("com.google.android.apps.gsa.search.core.work.audioplayer.SessionActivity");
        this.f295321q = pendingIntent;
        this.f295313i.mo879k(pendingIntent);
        C2759ad adVar = (C2759ad) this.f295281A.mo17428b();
        C3038au a = this.f295286F.mo95058a(str2, bundle2);
        if (bundle2.getBoolean("com.google.android.apps.gsa.search.core.work.audioplayer.PlayChime", false)) {
            C2759ad adVar2 = this.f295315k;
            if (adVar2 != null) {
                mo95091j(adVar2);
            }
            C2759ad adVar3 = (C2759ad) this.f295281A.mo17428b();
            this.f295315k = adVar3;
            adVar3.mo6463N(new C3086bx(new C105840l(this)).mo6760b(C2590aq.m6794a(Uri.EMPTY)));
            this.f295315k.mo6016w(new C105842n(this));
            this.f295315k.mo5974B(true);
        }
        String string = bundle2.getString("com.google.android.apps.gsa.search.core.work.audioplayer.QoeNamespace");
        String string2 = bundle2.getString("com.google.android.apps.gsa.search.core.work.audioplayer.QoeContentType");
        String string3 = bundle2.getString("com.google.android.apps.gsa.search.core.work.audioplayer.OriginalMediaUrl");
        if (string3 == null) {
            string3 = str2;
        }
        HashMap hashMap = new HashMap();
        String string4 = bundle2.getString("com.google.android.apps.gsa.search.core.work.audioplayer.PodcastFeedUrl");
        if (!C58837ba.m90859h(string4)) {
            hashMap.put("feed_url", Base64.encodeToString(string4.getBytes(), 11));
        }
        String string5 = bundle2.getString("com.google.android.apps.gsa.search.core.work.audioplayer.EpisodeGuid");
        if (!C58837ba.m90859h(string5)) {
            hashMap.put("episode_guid", Base64.encodeToString(string5.getBytes(), 11));
        }
        String string6 = bundle2.getString("com.google.android.apps.gsa.search.core.work.audioplayer.IsBeta");
        if (!C58837ba.m90859h(string6)) {
            hashMap.put("is_beta", string6);
        }
        hashMap.put("is_tng", "0");
        if (this.f295310f.equals("podcast_player") && this.f295287G.mo79746e(C90073dy.f249767b)) {
            if (Build.VERSION.SDK_INT < 31) {
                hashMap.put("mediametrics", "unsupported");
            } else {
                C2727bp z3 = C2727bp.m7521z(this.f295307c);
                if (z3 != null) {
                    adVar.mo6462M(z3);
                    hashMap.put("mediametrics", "enabled");
                } else {
                    hashMap.put("mediametrics", "failed");
                }
            }
        }
        if (string != null) {
            if (this.f295310f.equals("speakr") || this.f295310f.equals("speakr_email")) {
                HashMap hashMap2 = true != hashMap.isEmpty() ? hashMap : null;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 1000; i++) {
                    arrayList.add(Uri.parse(String.format("%s#%s", new Object[]{str2, Integer.valueOf(i)})));
                }
                this.f295301U = this.f295285E.mo95071a(string, string2, hashMap2, (Uri) null, (Uri[]) arrayList.toArray(new Uri[arrayList.size()]));
            } else {
                boolean equals = "file".equals(Uri.parse(str).getScheme());
                HashMap hashMap3 = true != hashMap.isEmpty() ? hashMap : null;
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("com.google.android.apps.gsa.search.core.work.audioplayer.MediaIntroUrls");
                ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("com.google.android.apps.gsa.search.core.work.audioplayer.MediaOutroUrls");
                ArrayList arrayList2 = new ArrayList();
                m176287C(stringArrayList, arrayList2);
                Uri parse = Uri.parse(string3);
                arrayList2.add(parse);
                m176287C(stringArrayList2, arrayList2);
                this.f295301U = this.f295285E.mo95071a(string, string2, hashMap3, true != equals ? null : parse, (Uri[]) arrayList2.toArray(new Uri[arrayList2.size()]));
            }
            adVar.mo6462M(this.f295301U);
        }
        long j = this.f295288H;
        if (j > 0) {
            m176291m(adVar, j);
        } else {
            long j2 = this.f295289I;
            if (j2 > 0) {
                adVar.mo5973A((int) j2, this.f295290J);
            }
        }
        adVar.mo5975C(new C2640bb(this.f295316l, 1.0f));
        adVar.mo6470q(this.f295317m);
        adVar.mo6462M(this.f295311g);
        adVar.mo6469ax(a);
        adVar.mo6017x();
        C58976aa aaVar = C58975e.f156826a;
        this.f295314j = adVar;
        if (z2) {
            mo95097p(false);
        }
        mo95098q(z2, false);
    }

    /* renamed from: i */
    public final void mo95090i() {
        mo95087f();
        mo95091j(this.f295314j);
        mo95091j(this.f295315k);
        this.f295314j = null;
        this.f295315k = null;
        C146577h hVar = this.f295301U;
        if (hVar != null) {
            hVar.mo123371z();
            this.f295301U = null;
        }
    }

    /* renamed from: j */
    public final void mo95091j(C2759ad adVar) {
        if (adVar != null) {
            adVar.mo6464R(this.f295311g);
            adVar.mo5981I();
            adVar.mo6018y();
        }
    }

    /* renamed from: k */
    public final void mo95092k() {
        if (this.f295314j != null) {
            long x = m176293x(-10000);
            C2759ad adVar = this.f295314j;
            adVar.getClass();
            mo95094n(m176290c(adVar) + x);
        }
    }

    /* renamed from: l */
    public final void mo95093l() {
        if (this.f295314j != null) {
            long x = m176293x(30000);
            C2759ad adVar = this.f295314j;
            adVar.getClass();
            mo95094n(m176290c(adVar) + x);
        }
    }

    /* renamed from: n */
    public final void mo95094n(long j) {
        C2759ad adVar = this.f295314j;
        if (adVar != null) {
            long b = m176289b(adVar);
            if (b != -9223372036854775807L) {
                j = Math.min(j, b);
            }
            m176291m(this.f295314j, Math.max(0, j));
            m176288D();
            mo95098q(true, false);
        }
    }

    /* renamed from: o */
    public final void mo95095o(C88458h hVar) {
        C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
        baVar.mo58885m(C88459i.f239145a, hVar);
        this.f295284D.mo80275j(this.f295310f, (C88431bb) baVar.build());
    }

    public final void onAudioFocusChange(int i) {
        C58976aa aaVar = C58975e.f156826a;
        this.f295295O = false;
        if (i == -2 || i == -3) {
            mo95088g();
        } else if (i == 1) {
            this.f295295O = true;
            mo95097p(mo95102u());
        } else if (i == -1) {
            mo95087f();
            m176286B();
        }
    }

    /* renamed from: p */
    public final void mo95097p(boolean z) {
        C2759ad adVar = this.f295314j;
        if (adVar == null || this.f295320p) {
            mo95098q(true, false);
            return;
        }
        if (adVar.mo5998e() == 1) {
            this.f295314j.mo6465X();
        }
        if (!this.f295295O) {
            if (this.f295292L.requestAudioFocus(new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setOnAudioFocusChangeListener(this).setWillPauseWhenDucked(true).build()) != 1) {
                C58976aa aaVar = C58975e.f156826a;
                mo95098q(true, false);
                return;
            }
            mo95103v(1);
            this.f295295O = true;
        }
        this.f295294N.acquire();
        if (z) {
            mo95092k();
        }
        C2759ad adVar2 = this.f295314j;
        adVar2.getClass();
        adVar2.mo5974B(true);
        this.f295302V = this.f295282B.mo26871c();
        if (this.f295296P == null) {
            C105843o oVar = new C105843o(this);
            this.f295296P = oVar;
            this.f295307c.registerReceiver(oVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        }
        C88398a aVar = (C88398a) C88458h.f239136h.createBuilder();
        aVar.copyOnWrite();
        C88458h hVar = (C88458h) aVar.instance;
        hVar.f239140c = 4;
        hVar.f239138a |= 2;
        mo95095o((C88458h) aVar.build());
        mo95098q(true, false);
    }

    /* renamed from: q */
    public final void mo95098q(boolean z, boolean z2) {
        long j;
        long j2;
        Bundle bundle;
        C2510n nVar;
        Uri uri;
        C2759ad adVar = this.f295314j;
        long c = adVar != null ? m176290c(adVar) : 0;
        C2759ad adVar2 = this.f295314j;
        if (adVar2 != null) {
            j = adVar2.mo6001h();
        } else {
            j = 0;
        }
        int i = 7;
        if (this.f295322r == null && this.f295323s == 0) {
            C2759ad adVar3 = this.f295314j;
            if (adVar3 == null || adVar3.mo5998e() == 4 || this.f295314j.mo5998e() == 1) {
                i = 1;
            } else {
                i = 2;
                if (!this.f295320p) {
                    i = this.f295314j.mo5998e() == 2 ? 6 : 3;
                }
            }
        }
        float f = this.f295316l;
        long w = m176292w(i);
        Bundle bundle2 = new Bundle();
        C2759ad adVar4 = this.f295314j;
        if (adVar4 != null && !adVar4.mo5987O()) {
            bundle2.putByte("PlaybackState.SUSPENDED", (byte) 1);
        }
        C2759ad adVar5 = this.f295314j;
        if (adVar5 != null && adVar5.mo5998e() == 4) {
            bundle2.putByte("PlaybackState.ENDED", (byte) 1);
        }
        C2759ad adVar6 = this.f295314j;
        if (adVar6 != null && z2) {
            bundle2.putInt("PlaybackState.WINDOW_CHANGED", adVar6.mo6254V());
        }
        C2759ad adVar7 = this.f295314j;
        if (adVar7 != null) {
            j2 = w;
            bundle2.putLong("PlaybackState.POSITION_FROM_WINDOW_START", adVar7.mo6004k());
        } else {
            j2 = w;
        }
        if (this.f295322r != null) {
            C58833ax d = mo95085d();
            if (d.mo56113h()) {
                bundle2.putInt("PlaybackState.ERROR_CAUSE", ((C90455b) d.mo56107c()).mo79843a());
                bundle2.putInt("PlaybackState.ERROR_TYPE", ((C90455b) d.mo56107c()).mo79844b());
            }
            C3267o oVar = this.f295322r;
            oVar.getClass();
            bundle2.putInt("com.google.android.apps.gsa.search.core.work.audioplayer.ExoPlaybackErrorCode", oVar.f7310a);
            C3267o oVar2 = this.f295322r;
            oVar2.getClass();
            if (oVar2.f9812c == 0 && (oVar2.mo7258c() instanceof C2484ac) && (nVar = ((C2484ac) this.f295322r.mo7258c()).f6830b) != null && (uri = nVar.f6891a) != null) {
                bundle2.putString("PlaybackState.ERROR_URI", uri.toString());
            }
        }
        MediaMetadataCompat mediaMetadataCompat = this.f295324t;
        if (mediaMetadataCompat != null && mediaMetadataCompat.f945b.containsKey("android.media.metadata.MEDIA_ID")) {
            bundle2.putString("android.media.metadata.MEDIA_ID", this.f295324t.mo821f("android.media.metadata.MEDIA_ID"));
        }
        List z3 = m176295z();
        List A = m176285A(z3);
        C59104x b = f295277a.mo56224b();
        List<PlaybackStateCompat.CustomAction> list = z3;
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14083)).mo56362O("updateMediaSessionState: state=%d, position=%d, buffered position=%d, actions=%d, playback speed=%f, custom actions=[%s]", Integer.valueOf(i), Long.valueOf(c), Long.valueOf(j), Long.valueOf(j2), Float.valueOf(f), Collection.EL.stream(A).collect(Collectors.joining(", ")));
        this.f295306Z.cancel(!z);
        PlaybackStateCompat playbackStateCompat = this.f295300T;
        if (playbackStateCompat != null && i == playbackStateCompat.f994a && c == playbackStateCompat.f995b && f == playbackStateCompat.f997d && j2 == playbackStateCompat.f998e && (bundle = playbackStateCompat.f1004k) != null && bundle.containsKey("PlaybackState.SUSPENDED") == bundle2.containsKey("PlaybackState.SUSPENDED") && bundle.containsKey("PlaybackState.ENDED") == bundle2.containsKey("PlaybackState.ENDED") && bundle.getInt("PlaybackState.ERROR_CAUSE") == bundle2.getInt("PlaybackState.ERROR_CAUSE") && bundle.getInt("PlaybackState.WINDOW_CHANGED") == bundle2.getInt("PlaybackState.WINDOW_CHANGED")) {
            PlaybackStateCompat playbackStateCompat2 = this.f295300T;
            playbackStateCompat2.getClass();
            if (m176285A(playbackStateCompat2.f1002i).equals(m176285A(list))) {
                return;
            }
        }
        C0298ao aoVar = new C0298ao();
        aoVar.mo984c(i, c, f, this.f295282B.mo26871c());
        aoVar.f1025b = j2;
        aoVar.f1029f = bundle2;
        if (j > 0) {
            aoVar.f1024a = j;
        }
        for (PlaybackStateCompat.CustomAction b2 : list) {
            aoVar.mo983b(b2);
        }
        int i2 = this.f295323s;
        if (i2 != 0) {
            aoVar.f1026c = i2;
            aoVar.f1027d = null;
        }
        PlaybackStateCompat a = aoVar.mo982a();
        this.f295300T = a;
        this.f295313i.mo876h(a);
        if ("opa_media_player".equals(this.f295310f)) {
            MediaSessionCompat mediaSessionCompat = this.f295313i;
            String str = this.f295310f;
            List A2 = m176285A(list);
            Bundle y = m176294y(str);
            y.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !A2.contains("com.google.android.apps.gsa.search.core.work.audioplayer.SkipPrevious"));
            y.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !A2.contains("com.google.android.apps.gsa.search.core.work.audioplayer.SkipNext"));
            mediaSessionCompat.mo874f(y);
        }
        if (z) {
            mo95101t();
        }
    }

    /* renamed from: r */
    public final void mo95099r(long j, float f, int i) {
        if (this.f295326v) {
            long w = m176292w(i);
            this.f295306Z.cancel(false);
            C0298ao aoVar = new C0298ao();
            aoVar.mo984c(i, j, f, this.f295282B.mo26871c());
            aoVar.f1025b = w;
            for (PlaybackStateCompat.CustomAction b : m176295z()) {
                aoVar.mo983b(b);
            }
            PlaybackStateCompat a = aoVar.mo982a();
            this.f295300T = a;
            this.f295313i.mo876h(a);
            mo95101t();
        }
    }

    /* renamed from: s */
    public final void mo95100s(Bundle bundle) {
        this.f295325u = new C0329x();
        if (bundle.containsKey("android.media.metadata.MEDIA_ID")) {
            this.f295325u.mo1093d("android.media.metadata.MEDIA_ID", bundle.getString("android.media.metadata.MEDIA_ID"));
        }
        if (bundle.containsKey("android.media.metadata.MEDIA_URI")) {
            this.f295325u.mo1093d("android.media.metadata.MEDIA_URI", bundle.getString("android.media.metadata.MEDIA_URI"));
        }
        if (bundle.containsKey("android.media.metadata.AUTHOR")) {
            this.f295325u.mo1093d("android.media.metadata.AUTHOR", bundle.getString("android.media.metadata.AUTHOR"));
        }
        if (bundle.containsKey("android.media.metadata.ARTIST")) {
            this.f295325u.mo1093d("android.media.metadata.ARTIST", bundle.getString("android.media.metadata.ARTIST"));
        }
        if (bundle.containsKey("android.media.metadata.DISPLAY_DESCRIPTION")) {
            this.f295325u.mo1093d("android.media.metadata.DISPLAY_DESCRIPTION", bundle.getString("android.media.metadata.DISPLAY_DESCRIPTION"));
        }
        if (bundle.containsKey("android.media.metadata.ALBUM")) {
            this.f295325u.mo1093d("android.media.metadata.ALBUM", bundle.getString("android.media.metadata.ALBUM"));
        }
        if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
            this.f295325u.mo1093d("android.media.metadata.ALBUM_ARTIST", bundle.getString("android.media.metadata.ALBUM_ARTIST"));
        }
        if (bundle.containsKey("android.media.metadata.ALBUM_ART_URI")) {
            this.f295325u.mo1093d("android.media.metadata.ALBUM_ART_URI", bundle.getString("android.media.metadata.ALBUM_ART_URI"));
        }
        if (bundle.containsKey("android.media.metadata.TITLE")) {
            this.f295325u.mo1093d("android.media.metadata.TITLE", bundle.getString("android.media.metadata.TITLE"));
        }
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            this.f295325u.mo1092c("android.media.metadata.DURATION", bundle.getLong("android.media.metadata.DURATION"));
        }
        if (bundle.containsKey("android.media.metadata.DISPLAY_ICON")) {
            this.f295325u.mo1091b("android.media.metadata.DISPLAY_ICON", (Bitmap) bundle.getParcelable("android.media.metadata.DISPLAY_ICON"));
        }
        if (bundle.containsKey("android.media.metadata.DISPLAY_ICON_URI")) {
            this.f295325u.mo1093d("android.media.metadata.DISPLAY_ICON_URI", bundle.getString("android.media.metadata.DISPLAY_ICON_URI"));
        }
        if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
            this.f295325u.mo1092c("android.media.metadata.TRACK_NUMBER", bundle.getLong("android.media.metadata.TRACK_NUMBER"));
        }
        if (bundle.containsKey("assistant.api.params.MediaParams.MediaSession.SessionId")) {
            this.f295325u.mo1092c("assistant.api.params.MediaParams.MediaSession.SessionId", bundle.getLong("assistant.api.params.MediaParams.MediaSession.SessionId"));
        }
        if (bundle.containsKey("assistant.api.params.MediaParams.CardId")) {
            this.f295325u.mo1093d("assistant.api.params.MediaParams.CardId", bundle.getString("assistant.api.params.MediaParams.CardId"));
        }
        if (bundle.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.PodcastFeedUrl")) {
            this.f295325u.mo1093d("com.google.android.apps.gsa.search.core.work.audioplayer.PodcastFeedUrl", bundle.getString("com.google.android.apps.gsa.search.core.work.audioplayer.PodcastFeedUrl"));
        }
        if (bundle.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.EpisodeGuid")) {
            this.f295325u.mo1093d("com.google.android.apps.gsa.search.core.work.audioplayer.EpisodeGuid", bundle.getString("com.google.android.apps.gsa.search.core.work.audioplayer.EpisodeGuid"));
        }
        if (bundle.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.IsBeta")) {
            this.f295325u.mo1093d("com.google.android.apps.gsa.search.core.work.audioplayer.IsBeta", bundle.getString("com.google.android.apps.gsa.search.core.work.audioplayer.IsBeta"));
        }
        if (bundle.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.OriginalMediaUrl")) {
            this.f295325u.mo1093d("com.google.android.apps.gsa.search.core.work.audioplayer.OriginalMediaUrl", bundle.getString("com.google.android.apps.gsa.search.core.work.audioplayer.OriginalMediaUrl"));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.google.android.apps.gsa.search.core.work.audioplayer.MediaIntroUrls");
        if (stringArrayList != null) {
            this.f295325u.mo1093d("com.google.android.apps.gsa.search.core.work.audioplayer.MediaIntroUrls", Arrays.toString(stringArrayList.toArray()));
        }
        this.f295324t = this.f295325u.mo1090a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95101t() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "com.google.android.apps.gsa.plugins.podcastplayer.channel"
            android.support.v4.media.MediaMetadataCompat r3 = r1.f295324t
            if (r3 == 0) goto L_0x0262
            android.support.v4.media.session.PlaybackStateCompat r4 = r1.f295300T
            if (r4 != 0) goto L_0x000e
            goto L_0x0262
        L_0x000e:
            com.google.android.apps.gsa.staticplugins.o.c r5 = r1.f295283C
            android.support.v4.media.session.MediaSessionCompat r0 = r1.f295313i
            android.support.v4.media.session.aa r0 = r0.f982b
            android.support.v4.media.session.ac r0 = (android.support.p031v4.media.session.C0286ac) r0
            android.support.v4.media.session.MediaSessionCompat$Token r6 = r0.f1014b
            boolean r0 = r1.f295326v
            if (r0 == 0) goto L_0x001f
            int r0 = f295279y
            goto L_0x0021
        L_0x001f:
            int r0 = r1.f295293M
        L_0x0021:
            r7 = r0
            android.app.PendingIntent r8 = r1.f295321q
            int r9 = r1.f295303W
            int r10 = r1.f295304X
            android.content.Context r0 = r5.f295235b
            android.app.Notification$Builder r11 = new android.app.Notification$Builder
            r11.<init>(r0)
            java.lang.String r12 = "notification"
            java.lang.Object r12 = r0.getSystemService(r12)
            android.app.NotificationManager r12 = (android.app.NotificationManager) r12
            r13 = 2
            r14 = 0
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ RuntimeException -> 0x0067 }
            r15 = 2132085256(0x7f150a08, float:1.9810706E38)
            java.lang.String r0 = r0.getString(r15)     // Catch:{ RuntimeException -> 0x0067 }
            android.app.NotificationChannel r15 = r12.getNotificationChannel(r2)     // Catch:{ RuntimeException -> 0x0067 }
            if (r15 == 0) goto L_0x0054
            java.lang.CharSequence r15 = r15.getName()     // Catch:{ RuntimeException -> 0x0067 }
            boolean r15 = r0.contentEquals(r15)     // Catch:{ RuntimeException -> 0x0067 }
            if (r15 != 0) goto L_0x0075
        L_0x0054:
            android.app.NotificationChannel r15 = new android.app.NotificationChannel     // Catch:{ RuntimeException -> 0x0067 }
            r15.<init>(r2, r0, r13)     // Catch:{ RuntimeException -> 0x0067 }
            r15.enableLights(r14)     // Catch:{ RuntimeException -> 0x0067 }
            r15.enableVibration(r14)     // Catch:{ RuntimeException -> 0x0067 }
            r14 = 1
            r15.setLockscreenVisibility(r14)     // Catch:{ RuntimeException -> 0x0067 }
            r12.createNotificationChannel(r15)     // Catch:{ RuntimeException -> 0x0067 }
            goto L_0x0075
        L_0x0067:
            r0 = move-exception
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.p8163o.C105831c.f295234a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r14 = "Notification manager error"
            r15 = 14046(0x36de, float:1.9683E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56382g(r0)).mo56372aa(r15)).mo56386p(r14)
        L_0x0075:
            r11.setChannelId(r2)
            r0 = 2132085252(0x7f150a04, float:1.9810698E38)
            r12 = 2131234673(0x7f080f71, float:1.8085518E38)
            r14 = 1
            if (r9 != r14) goto L_0x0087
            android.app.PendingIntent r9 = r5.f295248o
            r5.mo95080b(r11, r12, r0, r9)
            r9 = 1
        L_0x0087:
            if (r10 != r14) goto L_0x0092
            r10 = 2132085259(0x7f150a0b, float:1.9810712E38)
            android.app.PendingIntent r14 = r5.f295249p
            r15 = 2131234401(0x7f080e61, float:1.8084967E38)
            goto L_0x009a
        L_0x0092:
            r10 = 2132085260(0x7f150a0c, float:1.9810714E38)
            android.app.PendingIntent r14 = r5.f295246m
            r15 = 2131234396(0x7f080e5c, float:1.8084957E38)
        L_0x009a:
            r5.mo95080b(r11, r15, r10, r14)
            boolean r10 = com.google.android.apps.gsa.staticplugins.p8163o.C105831c.m176195c(r4)
            if (r10 == 0) goto L_0x00ac
            r10 = 2132085257(0x7f150a09, float:1.9810708E38)
            android.app.PendingIntent r14 = r5.f295244k
            r15 = 2131234973(0x7f08109d, float:1.8086127E38)
            goto L_0x00b4
        L_0x00ac:
            r10 = 2132085258(0x7f150a0a, float:1.981071E38)
            android.app.PendingIntent r14 = r5.f295243j
            r15 = 2131235020(0x7f0810cc, float:1.8086222E38)
        L_0x00b4:
            r5.mo95080b(r11, r15, r10, r14)
            r10 = 2132085261(0x7f150a0d, float:1.9810716E38)
            android.app.PendingIntent r14 = r5.f295247n
            r15 = 2131234197(0x7f080d95, float:1.8084553E38)
            r5.mo95080b(r11, r15, r10, r14)
            if (r9 != r13) goto L_0x00c9
            android.app.PendingIntent r9 = r5.f295248o
            r5.mo95080b(r11, r12, r0, r9)
        L_0x00c9:
            android.support.v4.media.MediaDescriptionCompat r0 = r3.mo819d()
            android.app.Notification$Builder r7 = r11.setSmallIcon(r7)
            android.app.PendingIntent r9 = r5.f295245l
            android.app.Notification$Builder r7 = r7.setDeleteIntent(r9)
            java.lang.CharSequence r9 = r0.f933b
            android.app.Notification$Builder r7 = r7.setContentTitle(r9)
            r9 = 1
            android.app.Notification$Builder r7 = r7.setOnlyAlertOnce(r9)
            java.lang.CharSequence r9 = r0.f934c
            r7.setContentText(r9)
            if (r8 == 0) goto L_0x00ec
            r11.setContentIntent(r8)
        L_0x00ec:
            android.app.Notification$MediaStyle r7 = new android.app.Notification$MediaStyle
            r7.<init>()
            r8 = 3
            int[] r9 = new int[r8]
            r9 = {0, 1, 2} // fill-array
            android.app.Notification$MediaStyle r7 = r7.setShowActionsInCompactView(r9)
            java.lang.Object r6 = r6.getToken()
            android.media.session.MediaSession$Token r6 = (android.media.session.MediaSession.Token) r6
            android.app.Notification$MediaStyle r6 = r7.setMediaSession(r6)
            r11.setStyle(r6)
            r6 = 1
            r11.setVisibility(r6)
            r11.setGroup(r2)
            int r2 = r4.f994a
            r6 = 6
            r7 = 7
            r9 = 0
            if (r2 != r6) goto L_0x012a
            android.content.Context r2 = r5.f295235b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2132085251(0x7f150a03, float:1.9810696E38)
            java.lang.String r2 = r2.getString(r3)
            r11.setSubText(r2)
        L_0x0127:
            r2 = r9
            goto L_0x01bc
        L_0x012a:
            if (r2 != r7) goto L_0x013d
            android.content.Context r2 = r5.f295235b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2132085254(0x7f150a06, float:1.9810702E38)
            java.lang.String r2 = r2.getString(r3)
            r11.setSubText(r2)
            goto L_0x0127
        L_0x013d:
            java.lang.String r2 = "android.media.metadata.DURATION"
            long r2 = r3.mo816a(r2)
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x0148
            goto L_0x0127
        L_0x0148:
            long r12 = r4.f995b
            int r6 = r4.f994a
            if (r6 != r8) goto L_0x015e
            com.google.android.libraries.f.a r6 = r5.f295236c
            long r14 = r6.mo26871c()
            long r7 = r4.f1001h
            long r14 = r14 - r7
            float r7 = (float) r14
            float r8 = r4.f997d
            float r7 = r7 * r8
            long r7 = (long) r7
            long r12 = r12 + r7
        L_0x015e:
            long r2 = r2 - r12
            r7 = 60000(0xea60, double:2.9644E-319)
            int r12 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x0174
            android.content.Context r12 = r5.f295235b
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2132085253(0x7f150a05, float:1.98107E38)
            java.lang.String r12 = r12.getString(r13)
            goto L_0x019f
        L_0x0174:
            long r12 = r2 / r7
            int r13 = (int) r12
            if (r13 != 0) goto L_0x0187
            android.content.Context r12 = r5.f295235b
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2132085255(0x7f150a07, float:1.9810704E38)
            java.lang.String r12 = r12.getString(r13)
            goto L_0x019f
        L_0x0187:
            android.content.Context r12 = r5.f295235b
            android.content.res.Resources r12 = r12.getResources()
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r16 = 0
            r15[r16] = r14
            r14 = 2131951629(0x7f13000d, float:1.9539678E38)
            java.lang.String r12 = r12.getQuantityString(r14, r13, r15)
        L_0x019f:
            r11.setSubText(r12)
            int r12 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x0127
            float r12 = r4.f997d
            r13 = 0
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x0127
            r13 = -1
            long r2 = r2 + r13
            long r2 = r2 % r7
            r7 = 1
            long r2 = r2 + r7
            float r2 = (float) r2
            float r2 = r2 / r12
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            long r2 = (long) r2
        L_0x01bc:
            android.graphics.Bitmap r7 = r0.f936e
            android.net.Uri r8 = r0.f937f
            if (r8 == 0) goto L_0x01c7
            java.lang.String r8 = r8.toString()
            goto L_0x01c8
        L_0x01c7:
            r8 = 0
        L_0x01c8:
            if (r7 == 0) goto L_0x01ce
            r11.setLargeIcon(r7)
            goto L_0x0225
        L_0x01ce:
            if (r8 == 0) goto L_0x01e4
            java.util.Map r7 = r5.f295242i
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L_0x01e4
            java.util.Map r0 = r5.f295242i
            java.lang.Object r0 = r0.get(r8)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r11.setLargeIcon(r0)
            goto L_0x0225
        L_0x01e4:
            if (r8 == 0) goto L_0x0225
            java.util.Set r2 = r5.f295241h
            boolean r2 = r2.contains(r8)
            r12 = 500(0x1f4, double:2.47E-321)
            if (r2 != 0) goto L_0x0224
            java.util.Set r2 = r5.f295241h
            r2.add(r8)
            dagger.a r2 = r5.f295238e
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.y.au r2 = (com.google.android.apps.gsa.shared.p7195y.C91189au) r2
            android.net.Uri r0 = r0.f937f
            r3 = 7
            com.google.common.util.concurrent.cx r0 = r2.mo85418e(r0, r3)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            com.google.android.libraries.gsa.k.g r3 = r5.f295240g
            r6 = 10
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148471e(r0, r6, r2, r3)
            com.google.android.libraries.gsa.k.g r2 = r5.f295239f
            com.google.android.apps.gsa.staticplugins.o.a r3 = new com.google.android.apps.gsa.staticplugins.o.a
            r3.<init>(r5, r8)
            com.google.android.apps.gsa.shared.util.c.ag r6 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r7 = "Load notification icon."
            r6.<init>(r0, r2, r7, r3)
            com.google.android.apps.gsa.staticplugins.o.b r0 = new com.google.android.apps.gsa.staticplugins.o.b
            r0.<init>(r5, r8)
            r6.mo85223a(r0)
        L_0x0224:
            r2 = r12
        L_0x0225:
            boolean r0 = com.google.android.apps.gsa.staticplugins.p8163o.C105831c.m176195c(r4)
            r4 = 131077(0x20005, float:1.83678E-40)
            if (r0 == 0) goto L_0x023b
            r6 = 1
            r5.f295250q = r6
            com.google.android.apps.gsa.search.core.al.cw.a r0 = r5.f295237d
            android.app.Notification r5 = r11.build()
            r0.mo78816k(r4, r5)
            goto L_0x024e
        L_0x023b:
            boolean r0 = r5.f295250q
            if (r0 == 0) goto L_0x024e
            com.google.android.apps.gsa.search.core.al.cw.a r0 = r5.f295237d
            r6 = 0
            r0.mo78817l(r4, r6)
            com.google.android.apps.gsa.search.core.al.cw.a r0 = r5.f295237d
            android.app.Notification r4 = r11.build()
            r0.mo78820p(r4)
        L_0x024e:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0261
            com.google.android.libraries.gsa.k.g r0 = r1.f295308d
            com.google.android.apps.gsa.staticplugins.o.k r4 = new com.google.android.apps.gsa.staticplugins.o.k
            r4.<init>(r1)
            java.lang.String r5 = "AudioPlayerWorker-notification-updater"
            com.google.common.util.concurrent.cx r0 = r0.mo28208h(r5, r2, r4)
            r1.f295306Z = r0
        L_0x0261:
            return
        L_0x0262:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8163o.C105846r.mo95101t():void");
    }

    /* renamed from: u */
    public final boolean mo95102u() {
        return this.f295282B.mo26870b() - this.f295299S > 60000;
    }

    /* renamed from: v */
    public final void mo95103v(int i) {
        C2664h a = C2663g.m7201a(1, i);
        C2759ad adVar = this.f295314j;
        adVar.getClass();
        adVar.mo6466Y(a, false);
    }
}
