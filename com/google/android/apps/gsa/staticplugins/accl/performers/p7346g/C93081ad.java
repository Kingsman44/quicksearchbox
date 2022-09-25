package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.session.C0320v;
import android.text.TextUtils;
import com.google.android.apps.gsa.p6486s.C84265e;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.p6486s.C84278r;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88121py;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88122pz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88124qa;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.android.libraries.lens.view.p2051ab.C24970c;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a.C36962j;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51057eu;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52173hy;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.lens.p4707j.C62455ce;
import com.google.lens.p4707j.C62467cq;
import com.google.lens.p4707j.C62468cr;
import com.google.lens.p4707j.C62471cu;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.ad */
/* compiled from: PG */
public final class C93081ad extends C22538o {

    /* renamed from: a */
    public static final C59071e f259632a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.g.ad");

    /* renamed from: g */
    private static final C58528ij f259633g = C58528ij.m90015O(C52567wn.TRACK, C52567wn.ALBUM, C52567wn.ARTIST, C52567wn.PLAYLIST, C52567wn.MUSIC_GENRE, C52567wn.MUSIC_MIX, C52567wn.AUDIO_BOOK, C52567wn.RADIO_STATION);

    /* renamed from: b */
    public final C22695ah f259634b;

    /* renamed from: c */
    public final C84516aa f259635c;

    /* renamed from: d */
    public final Context f259636d;

    /* renamed from: e */
    public final C68214a f259637e;

    /* renamed from: f */
    public final C68214a f259638f;

    /* renamed from: h */
    private final C68214a f259639h;

    /* renamed from: i */
    private final C68214a f259640i;

    /* renamed from: j */
    private final C69464a f259641j;

    /* renamed from: k */
    private final C68214a f259642k;

    /* renamed from: l */
    private final int f259643l;

    /* renamed from: m */
    private final C68214a f259644m;

    /* renamed from: o */
    private final C86610af f259645o;

    /* renamed from: p */
    private final C68214a f259646p;

    /* renamed from: q */
    private final C68214a f259647q;

    /* renamed from: r */
    private final C68214a f259648r;

    /* renamed from: s */
    private final C139921f f259649s;

    /* renamed from: t */
    private final C68214a f259650t;

    /* renamed from: u */
    private final C86034c f259651u;

    /* renamed from: v */
    private final boolean f259652v;

    /* renamed from: w */
    private final C68214a f259653w;

    /* renamed from: x */
    private final SharedPreferences f259654x;

    /* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.ad$a */
    /* compiled from: PG */
    public interface C93082a {
        /* renamed from: ob */
        C36962j mo87530ob();
    }

    public C93081ad(C68214a aVar, C69464a aVar2, C68214a aVar3, C68214a aVar4, C22695ah ahVar, C84516aa aaVar, SharedPreferences sharedPreferences, int i, Context context, C68214a aVar5, C86610af afVar, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C139921f fVar, C68214a aVar10, C68214a aVar11, C86034c cVar, boolean z, C68214a aVar12) {
        this.f259640i = aVar;
        this.f259639h = aVar3;
        this.f259641j = aVar2;
        this.f259642k = aVar4;
        this.f259634b = ahVar;
        this.f259635c = aaVar;
        this.f259654x = sharedPreferences;
        this.f259643l = i;
        this.f259636d = context;
        this.f259644m = aVar5;
        this.f259645o = afVar;
        this.f259646p = aVar6;
        this.f259647q = aVar7;
        this.f259648r = aVar8;
        this.f259637e = aVar9;
        this.f259649s = fVar;
        this.f259638f = aVar10;
        this.f259650t = aVar11;
        this.f259651u = cVar;
        this.f259652v = z;
        this.f259653w = aVar12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bb, code lost:
        if (r14 == com.google.assistant.p3897e.p3921j.C52567wn.ARTIST) goto L_0x00bf;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m153136b(com.google.assistant.p3897e.p3921j.C52174hz r17, com.google.assistant.p3897e.p3921j.C52165hq r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r5 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            r3.putString(r4, r5)
            java.lang.String r4 = "query"
            java.lang.String r5 = r1.f136901h
            r3.putString(r4, r5)
            int r4 = r1.f136894a
            r4 = r4 & 8
            java.lang.String r5 = "vnd.android.cursor.item/*"
            if (r4 == 0) goto L_0x00fd
            com.google.assistant.e.j.wo r1 = r1.f136897d
            if (r1 != 0) goto L_0x0027
            com.google.assistant.e.j.wo r1 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0027:
            dagger.a r4 = r0.f259639h
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r4 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r4
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90006bl.f246881a
            boolean r4 = r4.mo79746e(r6)
            java.lang.String r6 = "vnd.android.cursor.item/album"
            java.lang.String r7 = "vnd.android.cursor.item/artist"
            java.lang.String r8 = "vnd.android.cursor.item/audio"
            java.lang.String r9 = "android.intent.extra.title"
            java.lang.String r10 = "android.intent.extra.album"
            java.lang.String r11 = "android.intent.extra.artist"
            if (r4 == 0) goto L_0x0092
            java.lang.String r4 = r1.f137998e
            java.lang.String r12 = r1.f137999f
            java.lang.String r13 = r1.f138000g
            int r14 = r1.f138003j
            com.google.assistant.e.j.wn r14 = com.google.assistant.p3897e.p3921j.C52567wn.m86649b(r14)
            if (r14 != 0) goto L_0x0053
            com.google.assistant.e.j.wn r14 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
        L_0x0053:
            boolean r15 = android.text.TextUtils.isEmpty(r4)
            if (r15 != 0) goto L_0x007f
            com.google.assistant.e.j.wn r15 = com.google.assistant.p3897e.p3921j.C52567wn.TRACK
            if (r14 != r15) goto L_0x0061
            r3.putString(r9, r4)
            r5 = r8
        L_0x0061:
            com.google.assistant.e.j.wn r8 = com.google.assistant.p3897e.p3921j.C52567wn.ARTIST
            if (r14 != r8) goto L_0x0069
            r3.putString(r11, r4)
            goto L_0x006a
        L_0x0069:
            r7 = r5
        L_0x006a:
            com.google.assistant.e.j.wn r5 = com.google.assistant.p3897e.p3921j.C52567wn.ALBUM
            if (r14 != r5) goto L_0x0073
            r3.putString(r10, r4)
            r5 = r6
            goto L_0x0074
        L_0x0073:
            r5 = r7
        L_0x0074:
            com.google.assistant.e.j.wn r6 = com.google.assistant.p3897e.p3921j.C52567wn.MUSIC_GENRE
            if (r14 != r6) goto L_0x007f
            java.lang.String r5 = "android.intent.extra.genre"
            r3.putString(r5, r4)
            java.lang.String r5 = "vnd.android.cursor.item/genre"
        L_0x007f:
            boolean r4 = android.text.TextUtils.isEmpty(r12)
            if (r4 != 0) goto L_0x0088
            r3.putString(r11, r12)
        L_0x0088:
            boolean r4 = android.text.TextUtils.isEmpty(r13)
            if (r4 != 0) goto L_0x00cf
            r3.putString(r10, r13)
            goto L_0x00cf
        L_0x0092:
            java.lang.String r4 = r1.f137998e
            java.lang.String r12 = r1.f137999f
            java.lang.String r13 = r1.f138000g
            int r14 = r1.f138003j
            com.google.assistant.e.j.wn r14 = com.google.assistant.p3897e.p3921j.C52567wn.m86649b(r14)
            if (r14 != 0) goto L_0x00a2
            com.google.assistant.e.j.wn r14 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
        L_0x00a2:
            boolean r15 = android.text.TextUtils.isEmpty(r4)
            if (r15 != 0) goto L_0x00b0
            r3.putString(r9, r4)
            com.google.assistant.e.j.wn r4 = com.google.assistant.p3897e.p3921j.C52567wn.TRACK
            if (r14 != r4) goto L_0x00b0
            r5 = r8
        L_0x00b0:
            boolean r4 = android.text.TextUtils.isEmpty(r12)
            if (r4 != 0) goto L_0x00be
            r3.putString(r11, r12)
            com.google.assistant.e.j.wn r4 = com.google.assistant.p3897e.p3921j.C52567wn.ARTIST
            if (r14 != r4) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r7 = r5
        L_0x00bf:
            boolean r4 = android.text.TextUtils.isEmpty(r13)
            if (r4 != 0) goto L_0x00ce
            r3.putString(r10, r13)
            com.google.assistant.e.j.wn r4 = com.google.assistant.p3897e.p3921j.C52567wn.ALBUM
            if (r14 != r4) goto L_0x00ce
            r5 = r6
            goto L_0x00cf
        L_0x00ce:
            r5 = r7
        L_0x00cf:
            int r4 = r1.f137996c
            r6 = 37
            if (r4 != r6) goto L_0x00da
            java.lang.Object r4 = r1.f137997d
            com.google.assistant.e.j.xm r4 = (com.google.assistant.p3897e.p3921j.C52593xm) r4
            goto L_0x00dc
        L_0x00da:
            com.google.assistant.e.j.xm r4 = com.google.assistant.p3897e.p3921j.C52593xm.f138097c
        L_0x00dc:
            int r4 = r4.f138099a
            r4 = r4 & 1
            if (r4 == 0) goto L_0x00fd
            int r4 = r1.f137996c
            if (r4 != r6) goto L_0x00eb
            java.lang.Object r1 = r1.f137997d
            com.google.assistant.e.j.xm r1 = (com.google.assistant.p3897e.p3921j.C52593xm) r1
            goto L_0x00ed
        L_0x00eb:
            com.google.assistant.e.j.xm r1 = com.google.assistant.p3897e.p3921j.C52593xm.f138097c
        L_0x00ed:
            java.lang.String r1 = r1.f138100b
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x00fb
            java.lang.String r4 = "android.intent.extra.youtube_click_tracking_id"
            r3.putString(r4, r1)
            goto L_0x00fd
        L_0x00fb:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x00fd:
            java.lang.String r1 = "android.intent.extra.focus"
            r3.putString(r1, r5)
            if (r2 == 0) goto L_0x0122
            java.lang.String r1 = r2.f136882a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0122
            java.lang.String r1 = r2.f136883b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0122
            java.lang.String r1 = "android.intent.extra.user_query"
            java.lang.String r4 = r2.f136882a
            r3.putString(r1, r4)
            java.lang.String r1 = "android.intent.extra.user_query_language"
            java.lang.String r2 = r2.f136883b
            r3.putString(r1, r2)
        L_0x0122:
            if (r19 == 0) goto L_0x0135
            dagger.a r1 = r0.f259646p
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r1 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r1
            java.lang.String r1 = r1.mo79659F()
            java.lang.String r2 = "authAccount"
            r3.putString(r2, r1)
        L_0x0135:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93081ad.m153136b(com.google.assistant.e.j.hz, com.google.assistant.e.j.hq, boolean):android.os.Bundle");
    }

    /* renamed from: c */
    private static C93093ao m153137c(String str, C52174hz hzVar, Bundle bundle) {
        String str2 = hzVar.f136895b;
        if (TextUtils.isEmpty(str2)) {
            C59104x d = f259632a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d).mo56372aa(13320)).mo56386p("Unable to perform playFromUri because the uri is missing from the MediaItem.");
            return null;
        }
        Uri parse = Uri.parse(str2);
        return str.equals("media.PREPARE_MEDIA") ? new C93119z(parse, bundle) : new C93078aa(parse, bundle);
    }

    /* renamed from: d */
    private final C60870cx m153138d(C52174hz hzVar, C93093ao aoVar, C93094ap apVar, C0320v vVar, C52176ia iaVar, String str, C52567wn wnVar, Intent intent) {
        m153142h(vVar, iaVar);
        m153141g(str, wnVar, hzVar, iaVar.f136919g);
        boolean z = true;
        if (this.f259643l == 5) {
            intent.setAction("android.intent.action.MEDIA_SEARCH");
            if (!hzVar.f136895b.isEmpty()) {
                intent.setData(Uri.parse(hzVar.f136895b));
            }
            intent.putExtra("com.google.android.projection.gearhead.ignore_playback_action", true);
            this.f259634b.mo27807a(intent);
        }
        C87594r.m142385i("media.PLAY_MEDIA", hzVar, str, (C58833ax) this.f259650t.mo27525b());
        int a = C52173hy.m86533a(hzVar.f136903j);
        if (a != 0 && a == 2) {
            z = false;
        }
        return apVar.mo87538k("media.PLAY_MEDIA", aoVar, vVar, z);
    }

    /* renamed from: e */
    private static String m153139e(C52174hz hzVar) {
        if ((hzVar.f136894a & 4) == 0) {
            return null;
        }
        C51098gh ghVar = hzVar.f136896c;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        return C93094ap.m153165m(ghVar);
    }

    /* renamed from: f */
    private final void m153140f(String str) {
        PackageManager packageManager = this.f259636d.getPackageManager();
        ComponentName componentName = new ComponentName(this.f259636d.getPackageName(), str);
        if (packageManager.getComponentEnabledSetting(componentName) != 1) {
            try {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            } catch (RuntimeException e) {
                C59104x d = f259632a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(13336)).mo56386p("Enabling MediaBrowserService failed.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r5 != 3) goto L_0x0064;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m153141g(java.lang.String r3, com.google.assistant.p3897e.p3921j.C52567wn r4, com.google.assistant.p3897e.p3921j.C52174hz r5, boolean r6) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00c2
            if (r6 == 0) goto L_0x000a
            goto L_0x00c2
        L_0x000a:
            int r6 = r2.f259643l
            r0 = 6
            if (r6 != r0) goto L_0x0064
            com.google.assistant.e.c.c.gh r6 = r5.f136896c
            if (r6 != 0) goto L_0x0015
            com.google.assistant.e.c.c.gh r6 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0015:
            int r6 = r6.f133012b
            r0 = 1
            if (r6 != r0) goto L_0x0064
            com.google.assistant.e.c.c.gh r6 = r5.f136896c
            if (r6 != 0) goto L_0x0020
            com.google.assistant.e.c.c.gh r6 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0020:
            int r1 = r6.f133012b
            if (r1 != r0) goto L_0x0029
            java.lang.Object r6 = r6.f133013c
            com.google.assistant.e.c.c.ev r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r6
            goto L_0x002b
        L_0x0029:
            com.google.assistant.e.c.c.ev r6 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x002b:
            int r6 = r6.f132950h
            int r6 = com.google.assistant.p3897e.p3902c.p3907c.C51057eu.m86027a(r6)
            if (r6 != 0) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            r1 = 2
            if (r6 == r1) goto L_0x0054
        L_0x0037:
            com.google.assistant.e.c.c.gh r5 = r5.f136896c
            if (r5 != 0) goto L_0x003d
            com.google.assistant.e.c.c.gh r5 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x003d:
            int r6 = r5.f133012b
            if (r6 != r0) goto L_0x0046
            java.lang.Object r5 = r5.f133013c
            com.google.assistant.e.c.c.ev r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r5
            goto L_0x0048
        L_0x0046:
            com.google.assistant.e.c.c.ev r5 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0048:
            int r5 = r5.f132950h
            int r5 = com.google.assistant.p3897e.p3902c.p3907c.C51057eu.m86027a(r5)
            if (r5 != 0) goto L_0x0051
            goto L_0x0064
        L_0x0051:
            r6 = 3
            if (r5 != r6) goto L_0x0064
        L_0x0054:
            android.content.SharedPreferences r4 = r2.f259654x
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r5 = "opa_on_auto_oem_radio_sticky_app"
            android.content.SharedPreferences$Editor r3 = r4.putString(r5, r3)
            r3.apply()
            return
        L_0x0064:
            com.google.common.b.ij r5 = f259633g
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L_0x0092
            com.google.assistant.e.j.wn r5 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
            if (r4 != r5) goto L_0x00c2
            dagger.a r4 = r2.f259639h
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r4 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r4
            com.google.android.apps.gsa.shared.m.h r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247460ha
            com.google.common.b.gu r4 = r4.mo79745c(r5)
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L_0x0092
            dagger.a r4 = r2.f259644m
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.shared.media.a r4 = (com.google.android.apps.gsa.search.shared.media.C87576a) r4
            boolean r4 = r4.mo81719a(r3)
            if (r4 == 0) goto L_0x00c2
        L_0x0092:
            android.content.SharedPreferences r4 = r2.f259654x
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r5 = "opa_android_sticky_media_app"
            android.content.SharedPreferences$Editor r4 = r4.putString(r5, r3)
            r4.apply()
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r4 = r2.f259651u
            if (r4 == 0) goto L_0x00c2
            com.google.common.util.concurrent.cx r4 = r4.mo79697b()
            com.google.android.apps.gsa.staticplugins.accl.performers.g.y r5 = new com.google.android.apps.gsa.staticplugins.accl.performers.g.y
            r5.<init>(r2, r3)
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60922j.m93045h(r4, r5, r3)
            com.google.android.apps.gsa.staticplugins.accl.performers.g.ac r4 = new com.google.android.apps.gsa.staticplugins.accl.performers.g.ac
            r4.<init>()
            com.google.common.util.concurrent.bg r5 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.bz r4 = com.google.apps.tiktok.tracing.C47810es.m84974n(r4)
            com.google.common.util.concurrent.C60856cj.m92911t(r3, r4, r5)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93081ad.m153141g(java.lang.String, com.google.assistant.e.j.wn, com.google.assistant.e.j.hz, boolean):void");
    }

    /* renamed from: h */
    private static void m153142h(C0320v vVar, C52176ia iaVar) {
        boolean z = iaVar.f136915c;
        if (vVar.mo1034b() != z) {
            vVar.mo1037e().mo1028m(z ? 1 : 0);
        }
    }

    /* renamed from: i */
    private static boolean m153143i(int i, C52174hz hzVar) {
        C51058ev evVar;
        if (i != 6) {
            return false;
        }
        C51098gh ghVar = hzVar.f136896c;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b != 1) {
            return false;
        }
        C51098gh ghVar2 = hzVar.f136896c;
        if (ghVar2 == null) {
            ghVar2 = C51098gh.f133009e;
        }
        if (ghVar2.f133012b == 1) {
            evVar = (C51058ev) ghVar2.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        int a = C51057eu.m86027a(evVar.f132950h);
        if (a != 0 && a == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010d  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.common.util.concurrent.C60870cx m153144j(com.google.assistant.p3897e.p3921j.C52174hz r6, com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap r7, android.content.Intent r8, int r9, java.lang.String r10, com.google.assistant.p3897e.p3921j.C52567wn r11, android.support.p031v4.media.session.C0320v r12, com.google.assistant.p3897e.p3921j.C52176ia r13) {
        /*
            r5 = this;
            dagger.a r0 = r5.f259639h
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247232dK
            boolean r0 = r0.mo79746e(r1)
            dagger.a r1 = r5.f259639h
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247168c
            boolean r1 = r1.mo79746e(r2)
            int r2 = r5.f259643l
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002b
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x0027:
            r0 = 4
            if (r2 != r0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            java.lang.String r0 = "opa_allow_launch_intent_on_lockscreen"
            r8.putExtra(r0, r3)
            int r0 = r5.f259643l
            r1 = 5
            if (r0 == r1) goto L_0x0052
            com.google.android.apps.gsa.search.core.aj.aa r0 = r5.f259635c
            android.app.KeyguardManager r0 = r0.f230023b
            boolean r0 = r0.isDeviceLocked()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r0 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x0045
            goto L_0x0052
        L_0x0045:
            com.google.assistant.e.j.id r6 = com.google.assistant.p3897e.p3921j.C52179id.DEVICE_SCREEN_LOCKED
            java.lang.String r7 = "Can't fire an Intent when the device is locked."
            com.google.assistant.e.j.ec r6 = com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap.m153159b(r10, r6, r7)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        L_0x0052:
            int r0 = r5.f259643l
            r2 = 6
            if (r0 != r2) goto L_0x006e
            if (r12 == 0) goto L_0x011b
            android.support.v4.media.session.PlaybackStateCompat r6 = r12.mo1038f()
            if (r6 == 0) goto L_0x0061
            goto L_0x011b
        L_0x0061:
            com.google.assistant.e.j.id r6 = com.google.assistant.p3897e.p3921j.C52179id.APP_PLAYBACKSTATE_INVALID
            java.lang.String r7 = "App state is not set correctly, possibly due to a null PlaybackState"
            com.google.assistant.e.j.ec r6 = com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap.m153159b(r10, r6, r7)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        L_0x006e:
            if (r0 == r1) goto L_0x007a
            java.lang.String r0 = r8.getPackage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x011b
        L_0x007a:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = r6.f136895b
            boolean r0 = r0.isEmpty()
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r3 = "android.media.action.MEDIA_PLAY_FROM_SEARCH"
            if (r0 != 0) goto L_0x00c7
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r8)
            java.lang.String r4 = r6.f136895b
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r0.setData(r4)
            int r4 = r5.f259643l
            if (r4 != r1) goto L_0x009e
            r0.setAction(r3)
            goto L_0x00a3
        L_0x009e:
            java.lang.String r4 = "android.intent.action.VIEW"
            r0.setAction(r4)
        L_0x00a3:
            dagger.a r4 = r5.f259642k
            java.lang.Object r4 = r4.mo27525b()
            android.content.pm.PackageManager r4 = (android.content.pm.PackageManager) r4
            android.content.pm.ResolveInfo r4 = r4.resolveActivity(r0, r2)
            if (r4 == 0) goto L_0x00c7
            int r8 = r5.f259643l
            if (r8 != r1) goto L_0x00b8
            com.google.assistant.e.j.hm r8 = com.google.assistant.p3897e.p3921j.C52161hm.INTENT_MEDIA_PLAY_FROM_SEARCH
            goto L_0x00ba
        L_0x00b8:
            com.google.assistant.e.j.hm r8 = com.google.assistant.p3897e.p3921j.C52161hm.INTENT_VIEW
        L_0x00ba:
            r7.f259695e = r8
            if (r12 == 0) goto L_0x00c1
            m153142h(r12, r13)
        L_0x00c1:
            com.google.android.libraries.gsa.conversation.h.ah r8 = r5.f259634b
            r8.mo27807a(r0)
            goto L_0x00e6
        L_0x00c7:
            r8.setAction(r3)
            dagger.a r0 = r5.f259642k
            java.lang.Object r0 = r0.mo27525b()
            android.content.pm.PackageManager r0 = (android.content.pm.PackageManager) r0
            android.content.pm.ResolveInfo r0 = r0.resolveActivity(r8, r2)
            if (r0 == 0) goto L_0x011b
            com.google.assistant.e.j.hm r9 = com.google.assistant.p3897e.p3921j.C52161hm.INTENT_MEDIA_PLAY_FROM_SEARCH
            r7.f259695e = r9
            if (r12 == 0) goto L_0x00e1
            m153142h(r12, r13)
        L_0x00e1:
            com.google.android.libraries.gsa.conversation.h.ah r9 = r5.f259634b
            r9.mo27807a(r8)
        L_0x00e6:
            int r8 = r5.f259643l
            if (r8 != r1) goto L_0x00fe
            com.google.common.f.e r8 = f259632a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "MediaInitPerformer"
            r8.mo56378ag(r9, r0)
            java.lang.String r9 = "Sending PFS intent to Android Auto for: %s"
            r0 = 13323(0x340b, float:1.867E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r0)).mo56389s(r9, r10)
        L_0x00fe:
            boolean r8 = r13.f136919g
            r5.m153141g(r10, r11, r6, r8)
            com.google.assistant.e.j.hm r6 = r7.f259695e
            r8 = 0
            if (r12 == 0) goto L_0x010d
            java.lang.String r9 = r12.mo1039g()
            goto L_0x010e
        L_0x010d:
            r9 = r8
        L_0x010e:
            com.google.assistant.e.j.ho r6 = r7.mo87534e(r6, r9)
            com.google.assistant.e.j.ec r6 = com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap.m153161d(r8, r6, r8, r8)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        L_0x011b:
            int r9 = r9 + -1
            if (r9 == 0) goto L_0x012c
            com.google.assistant.e.j.kf r6 = com.google.assistant.p3897e.p3921j.C52235kf.NOT_FOUND
            java.lang.String r7 = "Neither playFromUri nor playFromSearch is available."
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r6, r7)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        L_0x012c:
            com.google.assistant.e.j.ec r6 = com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap.m153160c(r10)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93081ad.m153144j(com.google.assistant.e.j.hz, com.google.android.apps.gsa.staticplugins.accl.performers.g.ap, android.content.Intent, int, java.lang.String, com.google.assistant.e.j.wn, android.support.v4.media.session.v, com.google.assistant.e.j.ia):com.google.common.util.concurrent.cx");
    }

    /* renamed from: k */
    private final C84278r m153145k(C52176ia iaVar, int i, boolean z) {
        boolean z2 = true;
        boolean z3 = i == 7;
        C84265e eVar = new C84265e();
        eVar.mo77768d(iaVar);
        if (z || z3) {
            z2 = false;
        }
        eVar.mo77766b(z2);
        eVar.mo77767c(!z3);
        eVar.f229324b = C58833ax.m90834k(this.f259634b);
        if (z3) {
            eVar.f229325c = C58833ax.m90834k("speakr");
        }
        return eVar.mo77765a();
    }

    /* renamed from: l */
    private final C60870cx m153146l(C52176ia iaVar, int i) {
        if (i == 10) {
            C86034c cVar = this.f259651u;
            if (cVar == null) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, "Failed to start NewsPlayer: tikTokAccountHelper is null."));
            }
            return C60922j.m93045h(cVar.mo79697b(), new C93112s(this, iaVar), C60826bg.f164896a);
        } else if (i == 4 || i == 7) {
            if (((C86124t) this.f259639h.mo27525b()).mo79746e(C90086ek.f250275a)) {
                m153140f("com.google.android.apps.gsa.staticplugins.mediabrowser.OpaMediaBrowserService");
            }
            C84278r k = m153145k(iaVar, i, false);
            C59104x b = f259632a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) b).mo56372aa(13324)).mo56386p("Sending player command to OpaMediaPlayer.");
            C87594r.m142385i("media.PLAY_MEDIA", (C52174hz) iaVar.f136914b.get(0), "OpaMediaPlayer", (C58833ax) this.f259650t.mo27525b());
            return C60846c.m92878g(C60922j.m93044g(((C84274n) this.f259648r.mo27525b()).mo77789e(k), C93113t.f259741a, C60826bg.f164896a), Exception.class, C93114u.f259742a, C60826bg.f164896a);
        } else if (i == 9) {
            if (iaVar.f136914b.size() != 0) {
                C52568wo woVar = ((C52174hz) iaVar.f136914b.get(0)).f136897d;
                if (woVar == null) {
                    woVar = C52568wo.f137992v;
                }
                if ((woVar.f137994a & 1024) != 0) {
                    C52568wo woVar2 = ((C52174hz) iaVar.f136914b.get(0)).f136897d;
                    if (woVar2 == null) {
                        woVar2 = C52568wo.f137992v;
                    }
                    C51012dc dcVar = woVar2.f138004k;
                    if (dcVar == null) {
                        dcVar = C51012dc.f132813k;
                    }
                    byte[] N = dcVar.f132819e.mo59174N();
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(N, 0, N.length);
                    C62455ce ceVar = (C62455ce) C62471cu.f168676c.createBuilder();
                    C62467cq cqVar = (C62467cq) C62468cr.f168665d.createBuilder();
                    cqVar.copyOnWrite();
                    C62468cr crVar = (C62468cr) cqVar.instance;
                    crVar.f168667a |= 2;
                    crVar.f168669c = true;
                    ceVar.copyOnWrite();
                    C62471cu cuVar = (C62471cu) ceVar.instance;
                    C62468cr crVar2 = (C62468cr) cqVar.build();
                    crVar2.getClass();
                    cuVar.f168679b = crVar2;
                    cuVar.f168678a = 3;
                    C24970c cVar2 = new C24970c();
                    cVar2.f68094b = (C62471cu) ceVar.build();
                    cVar2.f68097e = decodeByteArray;
                    cVar2.f68117y = true;
                    C59104x b2 = f259632a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
                    ((C59052c) ((C59052c) b2).mo56372aa(13325)).mo56386p("starting lens readout activity.");
                    this.f259649s.mo115338b(cVar2.mo30192a());
                    return C60856cj.m92900i(C22402a.f61893a);
                }
            }
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Missing screenshot"));
        } else {
            C88122pz pzVar = (C88122pz) C88124qa.f238228d.createBuilder();
            C63088z byteString = iaVar.toByteString();
            pzVar.copyOnWrite();
            C88124qa qaVar = (C88124qa) pzVar.instance;
            byteString.getClass();
            qaVar.f238230a |= 1;
            qaVar.f238231b = byteString;
            pzVar.copyOnWrite();
            C88124qa qaVar2 = (C88124qa) pzVar.instance;
            qaVar2.f238230a |= 2;
            qaVar2.f238232c = true;
            C88489j jVar = new C88489j(C87739bu.OPA_REQUEST_MEDIA_SESSION_TOKEN);
            jVar.mo82014b(C88121py.f238227a, (C88124qa) pzVar.build());
            C86775r rVar = this.f259645o.f233977l;
            if (rVar == null) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, "Failed to handle PLAY_MEDIA client op using AUDIO_PLAYER internal provider."));
            }
            rVar.mo80387i(jVar.mo82013a());
            return C60856cj.m92900i(C22402a.f61893a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0136 A[Catch:{ a -> 0x0142 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r17, com.google.android.libraries.gsa.conversation.clientop.C22434e r18) {
        /*
            r16 = this;
            r10 = r16
            r1 = r17
            java.lang.String r0 = r1.f135936b
            java.lang.String r2 = "media.PLAY_MEDIA"
            boolean r3 = r0.equals(r2)
            java.lang.String r4 = "media.PREPARE_MEDIA"
            if (r3 != 0) goto L_0x001d
            boolean r3 = r0.equals(r4)
            if (r3 == 0) goto L_0x0017
            goto L_0x001d
        L_0x0017:
            com.google.android.libraries.gsa.conversation.clientop.d r0 = new com.google.android.libraries.gsa.conversation.clientop.d
            r0.<init>(r1)
            throw r0
        L_0x001d:
            r3 = 3
            r5 = 2
            r6 = 4
            r8 = 1
            com.google.assistant.e.j.dw r9 = r1.f135938d     // Catch:{ a -> 0x0142 }
            if (r9 != 0) goto L_0x0027
            com.google.assistant.e.j.dw r9 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ a -> 0x0142 }
        L_0x0027:
            java.lang.String r11 = "play_spoken_content_args"
            com.google.assistant.e.j.ii r12 = com.google.assistant.p3897e.p3921j.C52184ii.f136960f     // Catch:{ a -> 0x0142 }
            com.google.protobuf.eb r12 = r12.getParserForType()     // Catch:{ a -> 0x0142 }
            com.google.protobuf.MessageLite r9 = m41992m(r9, r11, r12)     // Catch:{ a -> 0x0142 }
            com.google.assistant.e.j.ii r9 = (com.google.assistant.p3897e.p3921j.C52184ii) r9     // Catch:{ a -> 0x0142 }
            com.google.protos.ac.a.h r11 = r9.f136963b     // Catch:{ a -> 0x0142 }
            if (r11 != 0) goto L_0x003b
            com.google.protos.ac.a.h r11 = com.google.protos.p4757ac.p4758a.C63109h.f170342e     // Catch:{ a -> 0x0142 }
        L_0x003b:
            int r12 = r9.f136965d     // Catch:{ a -> 0x0142 }
            long r12 = (long) r12     // Catch:{ a -> 0x0142 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ a -> 0x0142 }
            int r13 = r9.f136964c     // Catch:{ a -> 0x0142 }
            if (r13 < 0) goto L_0x005b
            com.google.protobuf.cq r14 = r11.f170346c     // Catch:{ a -> 0x0142 }
            int r14 = r14.size()     // Catch:{ a -> 0x0142 }
            if (r13 >= r14) goto L_0x005b
            int r13 = r9.f136964c     // Catch:{ a -> 0x0142 }
            com.google.protobuf.cq r14 = r11.f170346c     // Catch:{ a -> 0x0142 }
            java.lang.Object r13 = r14.get(r13)     // Catch:{ a -> 0x0142 }
            com.google.protos.ac.a.j r13 = (com.google.protos.p4757ac.p4758a.C63111j) r13     // Catch:{ a -> 0x0142 }
            java.lang.String r13 = r13.f170356g     // Catch:{ a -> 0x0142 }
            goto L_0x005c
        L_0x005b:
            r13 = 0
        L_0x005c:
            int r9 = r9.f136966e     // Catch:{ a -> 0x0142 }
            int r9 = com.google.assistant.p3897e.p3921j.C52183ih.m86537a(r9)     // Catch:{ a -> 0x0142 }
            if (r9 != 0) goto L_0x0065
            goto L_0x00cc
        L_0x0065:
            if (r9 != r3) goto L_0x00cc
            com.google.protobuf.cq r9 = r11.f170346c     // Catch:{ a -> 0x0142 }
            int r9 = r9.size()     // Catch:{ a -> 0x0142 }
            if (r9 <= 0) goto L_0x00b1
            if (r13 == 0) goto L_0x00b1
            com.google.android.apps.search.podcasts.e.b r9 = com.google.android.apps.search.podcasts.p10561e.C140201b.f380906e     // Catch:{ a -> 0x0142 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ a -> 0x0142 }
            com.google.android.apps.search.podcasts.e.a r9 = (com.google.android.apps.search.podcasts.p10561e.C140199a) r9     // Catch:{ a -> 0x0142 }
            r9.copyOnWrite()     // Catch:{ a -> 0x0142 }
            com.google.protobuf.bv r14 = r9.instance     // Catch:{ a -> 0x0142 }
            com.google.android.apps.search.podcasts.e.b r14 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r14     // Catch:{ a -> 0x0142 }
            r11.getClass()     // Catch:{ a -> 0x0142 }
            r14.f380909b = r11     // Catch:{ a -> 0x0142 }
            int r15 = r14.f380908a     // Catch:{ a -> 0x0142 }
            r15 = r15 | r8
            r14.f380908a = r15     // Catch:{ a -> 0x0142 }
            r9.copyOnWrite()     // Catch:{ a -> 0x0142 }
            com.google.protobuf.bv r14 = r9.instance     // Catch:{ a -> 0x0142 }
            com.google.android.apps.search.podcasts.e.b r14 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r14     // Catch:{ a -> 0x0142 }
            int r15 = r14.f380908a     // Catch:{ a -> 0x0142 }
            r15 = r15 | r5
            r14.f380908a = r15     // Catch:{ a -> 0x0142 }
            r14.f380910c = r13     // Catch:{ a -> 0x0142 }
            long r12 = r12.longValue()     // Catch:{ a -> 0x0142 }
            r9.copyOnWrite()     // Catch:{ a -> 0x0142 }
            com.google.protobuf.bv r14 = r9.instance     // Catch:{ a -> 0x0142 }
            com.google.android.apps.search.podcasts.e.b r14 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r14     // Catch:{ a -> 0x0142 }
            int r15 = r14.f380908a     // Catch:{ a -> 0x0142 }
            r15 = r15 | r6
            r14.f380908a = r15     // Catch:{ a -> 0x0142 }
            r14.f380911d = r12     // Catch:{ a -> 0x0142 }
            com.google.protobuf.bv r9 = r9.build()     // Catch:{ a -> 0x0142 }
            com.google.android.apps.search.podcasts.e.b r9 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r9     // Catch:{ a -> 0x0142 }
            goto L_0x00b2
        L_0x00b1:
            r9 = 0
        L_0x00b2:
            dagger.a r12 = r10.f259653w     // Catch:{ a -> 0x0142 }
            java.lang.Object r12 = r12.mo27525b()     // Catch:{ a -> 0x0142 }
            com.google.android.apps.search.podcasts.e.m r12 = (com.google.android.apps.search.podcasts.p10561e.C140212m) r12     // Catch:{ a -> 0x0142 }
            android.content.Context r13 = r10.f259636d     // Catch:{ a -> 0x0142 }
            dagger.a r14 = r10.f259646p     // Catch:{ a -> 0x0142 }
            java.lang.Object r14 = r14.mo27525b()     // Catch:{ a -> 0x0142 }
            com.google.android.apps.gsa.search.core.google.gaia.o r14 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r14     // Catch:{ a -> 0x0142 }
            java.lang.String r14 = r14.mo79659F()     // Catch:{ a -> 0x0142 }
            r12.mo115498b(r13, r14, r11, r9)     // Catch:{ a -> 0x0142 }
            goto L_0x0126
        L_0x00cc:
            if (r13 == 0) goto L_0x0126
            com.google.android.apps.search.podcasts.e.b r9 = com.google.android.apps.search.podcasts.p10561e.C140201b.f380906e     // Catch:{ a -> 0x0142 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ a -> 0x0142 }
            com.google.android.apps.search.podcasts.e.a r9 = (com.google.android.apps.search.podcasts.p10561e.C140199a) r9     // Catch:{ a -> 0x0142 }
            r9.copyOnWrite()     // Catch:{ a -> 0x0142 }
            com.google.protobuf.bv r14 = r9.instance     // Catch:{ a -> 0x0142 }
            com.google.android.apps.search.podcasts.e.b r14 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r14     // Catch:{ a -> 0x0142 }
            r11.getClass()     // Catch:{ a -> 0x0142 }
            r14.f380909b = r11     // Catch:{ a -> 0x0142 }
            int r11 = r14.f380908a     // Catch:{ a -> 0x0142 }
            r11 = r11 | r8
            r14.f380908a = r11     // Catch:{ a -> 0x0142 }
            r9.copyOnWrite()     // Catch:{ a -> 0x0142 }
            com.google.protobuf.bv r11 = r9.instance     // Catch:{ a -> 0x0142 }
            com.google.android.apps.search.podcasts.e.b r11 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r11     // Catch:{ a -> 0x0142 }
            int r14 = r11.f380908a     // Catch:{ a -> 0x0142 }
            r14 = r14 | r5
            r11.f380908a = r14     // Catch:{ a -> 0x0142 }
            r11.f380910c = r13     // Catch:{ a -> 0x0142 }
            long r11 = r12.longValue()     // Catch:{ a -> 0x0142 }
            r9.copyOnWrite()     // Catch:{ a -> 0x0142 }
            com.google.protobuf.bv r13 = r9.instance     // Catch:{ a -> 0x0142 }
            com.google.android.apps.search.podcasts.e.b r13 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r13     // Catch:{ a -> 0x0142 }
            int r14 = r13.f380908a     // Catch:{ a -> 0x0142 }
            r14 = r14 | r6
            r13.f380908a = r14     // Catch:{ a -> 0x0142 }
            r13.f380911d = r11     // Catch:{ a -> 0x0142 }
            com.google.protobuf.bv r9 = r9.build()     // Catch:{ a -> 0x0142 }
            com.google.android.apps.search.podcasts.e.b r9 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r9     // Catch:{ a -> 0x0142 }
            dagger.a r11 = r10.f259653w     // Catch:{ a -> 0x0142 }
            java.lang.Object r11 = r11.mo27525b()     // Catch:{ a -> 0x0142 }
            com.google.android.apps.search.podcasts.e.m r11 = (com.google.android.apps.search.podcasts.p10561e.C140212m) r11     // Catch:{ a -> 0x0142 }
            android.content.Context r12 = r10.f259636d     // Catch:{ a -> 0x0142 }
            dagger.a r13 = r10.f259646p     // Catch:{ a -> 0x0142 }
            java.lang.Object r13 = r13.mo27525b()     // Catch:{ a -> 0x0142 }
            com.google.android.apps.gsa.search.core.google.gaia.o r13 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r13     // Catch:{ a -> 0x0142 }
            java.lang.String r13 = r13.mo79659F()     // Catch:{ a -> 0x0142 }
            r11.mo115500d(r12, r13, r9)     // Catch:{ a -> 0x0142 }
        L_0x0126:
            dagger.a r9 = r10.f259639h     // Catch:{ a -> 0x0142 }
            java.lang.Object r9 = r9.mo27525b()     // Catch:{ a -> 0x0142 }
            com.google.android.apps.gsa.search.core.i.t r9 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r9     // Catch:{ a -> 0x0142 }
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250275a     // Catch:{ a -> 0x0142 }
            boolean r9 = r9.mo79746e(r11)     // Catch:{ a -> 0x0142 }
            if (r9 == 0) goto L_0x013b
            java.lang.String r9 = "com.google.android.apps.search.podcasts.browser.PodcastBrowserService"
            r10.m153140f(r9)     // Catch:{ a -> 0x0142 }
        L_0x013b:
            com.google.assistant.e.j.ec r9 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a     // Catch:{ a -> 0x0142 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r9)     // Catch:{ a -> 0x0142 }
            return r0
        L_0x0142:
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.e.j.dw r9 = r1.f135938d     // Catch:{ a -> 0x04ff }
            if (r9 != 0) goto L_0x014a
            com.google.assistant.e.j.dw r9 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ a -> 0x04ff }
        L_0x014a:
            java.lang.String r11 = "play_media_args"
            com.google.assistant.e.j.ia r12 = com.google.assistant.p3897e.p3921j.C52176ia.f136911k     // Catch:{ a -> 0x04ff }
            com.google.protobuf.eb r12 = r12.getParserForType()     // Catch:{ a -> 0x04ff }
            com.google.protobuf.MessageLite r9 = m41992m(r9, r11, r12)     // Catch:{ a -> 0x04ff }
            com.google.assistant.e.j.ia r9 = (com.google.assistant.p3897e.p3921j.C52176ia) r9     // Catch:{ a -> 0x04ff }
            com.google.assistant.e.j.dw r1 = r1.f135938d     // Catch:{ a -> 0x016d }
            if (r1 != 0) goto L_0x015e
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ a -> 0x016d }
        L_0x015e:
            java.lang.String r11 = "media_query_info_args"
            com.google.assistant.e.j.hq r12 = com.google.assistant.p3897e.p3921j.C52165hq.f136880c     // Catch:{ a -> 0x016d }
            com.google.protobuf.eb r12 = r12.getParserForType()     // Catch:{ a -> 0x016d }
            com.google.protobuf.MessageLite r1 = m41992m(r1, r11, r12)     // Catch:{ a -> 0x016d }
            com.google.assistant.e.j.hq r1 = (com.google.assistant.p3897e.p3921j.C52165hq) r1     // Catch:{ a -> 0x016d }
            goto L_0x016f
        L_0x016d:
            r1 = 0
        L_0x016f:
            boolean r0 = r0.equals(r4)
            java.lang.String r11 = "Failed to get media controller from package name: %s"
            java.lang.String r12 = "com.google.android.apps.books"
            r13 = 7
            r14 = 0
            java.lang.String r15 = "MediaInitPerformer"
            if (r0 == 0) goto L_0x025d
            com.google.protobuf.cq r0 = r9.f136914b
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0199
            com.google.common.f.e r0 = f259632a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r15)
            java.lang.String r1 = "Could not perform media.PREPARE_MEDIA, no MediaItem in PlayMediaArgs."
            r2 = 13341(0x341d, float:1.8695E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x0256
        L_0x0199:
            com.google.protobuf.cq r0 = r9.f136914b
            java.lang.Object r0 = r0.get(r14)
            com.google.assistant.e.j.hz r0 = (com.google.assistant.p3897e.p3921j.C52174hz) r0
            com.google.assistant.e.c.c.gh r2 = r0.f136896c
            if (r2 != 0) goto L_0x01a7
            com.google.assistant.e.c.c.gh r2 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x01a7:
            int r3 = r2.f133012b
            if (r3 != r13) goto L_0x01b0
            java.lang.Object r2 = r2.f133013c
            com.google.assistant.e.c.c.fv r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51085fv) r2
            goto L_0x01b2
        L_0x01b0:
            com.google.assistant.e.c.c.fv r2 = com.google.assistant.p3897e.p3902c.p3907c.C51085fv.f132995c
        L_0x01b2:
            int r2 = r2.f132998b
            int r2 = com.google.assistant.p3897e.p3902c.p3907c.C51084fu.m86032a(r2)
            if (r2 != 0) goto L_0x01bb
            goto L_0x01ce
        L_0x01bb:
            if (r2 != r6) goto L_0x01ce
            dagger.a r0 = r10.f259648r
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.s.n r0 = (com.google.android.apps.gsa.p6486s.C84274n) r0
            com.google.android.apps.gsa.s.r r1 = r10.m153145k(r9, r6, r8)
            r0.mo77789e(r1)
            goto L_0x0256
        L_0x01ce:
            java.lang.String r2 = m153139e(r0)
            g.a.a r3 = r10.f259641j
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.staticplugins.accl.performers.g.ap r3 = (com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap) r3
            android.support.v4.media.session.v r3 = r3.mo87533a(r2, r14)
            if (r3 != 0) goto L_0x01f1
            com.google.common.f.e r0 = f259632a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r15)
            r1 = 13340(0x341c, float:1.8693E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r1)).mo56389s(r11, r2)
            goto L_0x0256
        L_0x01f1:
            dagger.a r5 = r10.f259647q
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.x.a r5 = (com.google.android.apps.gsa.search.core.p6883x.C87280a) r5
            boolean r2 = r12.equals(r2)
            android.os.Bundle r1 = r10.m153136b(r0, r1, r2)
            com.google.android.apps.gsa.staticplugins.accl.performers.g.ao r0 = m153137c(r4, r0, r1)
            if (r0 == 0) goto L_0x0256
            boolean r1 = com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap.m153166p(r3)
            if (r1 == 0) goto L_0x0224
            com.google.common.f.e r0 = f259632a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r15)
            java.lang.String r1 = r3.mo1039g()
            r2 = 13339(0x341b, float:1.8692E-41)
            java.lang.String r3 = "Could not execute PREPARE_MEDIA because %s authentication is expired."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r3, r1)
            goto L_0x0256
        L_0x0224:
            dagger.a r1 = r10.f259640i
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.shared.media.r r1 = (com.google.android.apps.gsa.search.shared.media.C87594r) r1
            r4 = 131072(0x20000, double:6.47582E-319)
            boolean r1 = r1.mo81731k(r3, r4)
            if (r1 != 0) goto L_0x024c
            com.google.common.f.e r0 = f259632a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r15)
            java.lang.String r1 = r3.mo1039g()
            r2 = 13338(0x341a, float:1.869E-41)
            java.lang.String r3 = "Could not execute prepare_from_uri because it isn't supported by: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r3, r1)
            goto L_0x0256
        L_0x024c:
            m153142h(r3, r9)
            android.support.v4.media.session.q r1 = r3.mo1037e()
            r0.mo87529a(r1)
        L_0x0256:
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x025d:
            com.google.protobuf.cq r0 = r9.f136914b
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0285
            com.google.common.f.e r0 = f259632a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r15)
            java.lang.String r1 = "Could not perform media.PLAY_MEDIA, no MediaItem in PlayMediaArgs."
            r2 = 13335(0x3417, float:1.8686E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r1 = "No MediaItem in PlayMediaArgs."
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x04f4
        L_0x0285:
            com.google.protobuf.cq r0 = r9.f136914b
            java.lang.Object r0 = r0.get(r14)
            com.google.assistant.e.j.hz r0 = (com.google.assistant.p3897e.p3921j.C52174hz) r0
            com.google.assistant.e.c.c.gh r4 = r0.f136896c
            if (r4 != 0) goto L_0x0293
            com.google.assistant.e.c.c.gh r4 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0293:
            int r4 = r4.f133012b
            if (r4 != r13) goto L_0x030c
            com.google.assistant.e.c.c.gh r4 = r0.f136896c
            if (r4 != 0) goto L_0x029d
            com.google.assistant.e.c.c.gh r4 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x029d:
            int r7 = r4.f133012b
            if (r7 != r13) goto L_0x02a6
            java.lang.Object r4 = r4.f133013c
            com.google.assistant.e.c.c.fv r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51085fv) r4
            goto L_0x02a8
        L_0x02a6:
            com.google.assistant.e.c.c.fv r4 = com.google.assistant.p3897e.p3902c.p3907c.C51085fv.f132995c
        L_0x02a8:
            int r4 = r4.f132998b
            int r4 = com.google.assistant.p3897e.p3902c.p3907c.C51084fu.m86032a(r4)
            if (r4 != 0) goto L_0x02b1
            r4 = 1
        L_0x02b1:
            if (r4 == r5) goto L_0x0306
            if (r4 == r3) goto L_0x0306
            r3 = 9
            if (r4 == r3) goto L_0x0306
            if (r4 == r6) goto L_0x0306
            r3 = 10
            if (r4 != r3) goto L_0x02c0
            goto L_0x0306
        L_0x02c0:
            if (r4 != r13) goto L_0x030c
            boolean r0 = r10.f259652v
            if (r0 != 0) goto L_0x02cc
            com.google.common.util.concurrent.cx r0 = r10.m153146l(r9, r13)
            goto L_0x04f4
        L_0x02cc:
            android.content.Context r0 = r10.f259636d
            com.google.android.apps.search.b.a.b r1 = com.google.android.apps.search.p10086b.p10087a.C132667b.f362029c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.b.a.a r1 = (com.google.android.apps.search.p10086b.p10087a.C132666a) r1
            com.google.protobuf.cq r2 = r9.f136914b
            java.lang.Object r2 = r2.get(r14)
            com.google.assistant.e.j.hz r2 = (com.google.assistant.p3897e.p3921j.C52174hz) r2
            java.lang.String r2 = r2.f136895b
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.search.b.a.b r3 = (com.google.android.apps.search.p10086b.p10087a.C132667b) r3
            r2.getClass()
            int r4 = r3.f362031a
            r4 = r4 | r8
            r3.f362031a = r4
            r3.f362032b = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.search.b.a.b r1 = (com.google.android.apps.search.p10086b.p10087a.C132667b) r1
            android.content.Intent r1 = com.google.android.apps.search.p10086b.p10087a.C132668c.m215642a(r0, r1)
            com.google.apps.tiktok.tracing.C47810es.m84979s(r0, r1)
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x04f4
        L_0x0306:
            com.google.common.util.concurrent.cx r0 = r10.m153146l(r9, r4)
            goto L_0x04f4
        L_0x030c:
            g.a.a r3 = r10.f259641j
            java.lang.Object r3 = r3.mo17428b()
            r4 = r3
            com.google.android.apps.gsa.staticplugins.accl.performers.g.ap r4 = (com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap) r4
            com.google.assistant.e.j.hm r3 = com.google.assistant.p3897e.p3921j.C52161hm.NONE
            r4.f259695e = r3
            int r3 = r0.f136894a
            r3 = r3 & 8
            if (r3 == 0) goto L_0x0330
            com.google.assistant.e.j.wo r3 = r0.f136897d
            if (r3 != 0) goto L_0x0325
            com.google.assistant.e.j.wo r3 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0325:
            int r3 = r3.f138003j
            com.google.assistant.e.j.wn r3 = com.google.assistant.p3897e.p3921j.C52567wn.m86649b(r3)
            if (r3 != 0) goto L_0x0332
            com.google.assistant.e.j.wn r3 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
            goto L_0x0332
        L_0x0330:
            com.google.assistant.e.j.wn r3 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
        L_0x0332:
            r13 = r3
            java.lang.String r7 = m153139e(r0)
            dagger.a r3 = r10.f259647q
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.x.a r3 = (com.google.android.apps.gsa.search.core.p6883x.C87280a) r3
            boolean r3 = r12.equals(r7)
            android.os.Bundle r1 = r10.m153136b(r0, r1, r3)
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            int r3 = r10.f259643l
            r5 = 5
            if (r3 != r5) goto L_0x0364
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r6 = "com.google.android.projection.gearhead.ignore_original_pkg"
            if (r3 == 0) goto L_0x035d
            r12.putExtra(r6, r8)
            goto L_0x0367
        L_0x035d:
            r12.setPackage(r7)
            r12.putExtra(r6, r14)
            goto L_0x0367
        L_0x0364:
            r12.setPackage(r7)
        L_0x0367:
            r12.putExtras(r1)
            r3 = 335544320(0x14000000, float:6.4623485E-27)
            r12.setFlags(r3)
            java.lang.String r3 = "android.intent.extra.START_PLAYBACK"
            r12.putExtra(r3, r8)
            java.lang.String r3 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r6 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            r12.putExtra(r3, r6)
            android.support.v4.media.session.v r8 = r4.mo87533a(r7, r8)
            if (r8 != 0) goto L_0x03a0
            com.google.common.f.e r1 = f259632a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r15)
            r2 = 13334(0x3416, float:1.8685E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56389s(r11, r7)
            r5 = 1
            r8 = 0
            r1 = r16
            r2 = r0
            r3 = r4
            r4 = r12
            r6 = r7
            r7 = r13
            com.google.common.util.concurrent.cx r0 = r1.m153144j(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x04f4
        L_0x03a0:
            com.google.common.f.e r3 = f259632a
            com.google.common.f.x r6 = r3.mo56224b()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r11, r15)
            java.lang.String r11 = "Executing media.PLAY_MEDIA with the active controller."
            r14 = 13329(0x3411, float:1.8678E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r14)).mo56386p(r11)
            int r6 = r10.f259643l
            boolean r6 = m153143i(r6, r0)
            if (r6 == 0) goto L_0x03ca
            com.google.common.f.x r6 = r3.mo56224b()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r11, r15)
            java.lang.String r11 = "Using physical device for media initiation."
            r14 = 13333(0x3415, float:1.8684E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r14)).mo56386p(r11)
        L_0x03ca:
            boolean r6 = com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap.m153166p(r8)
            if (r6 == 0) goto L_0x03e2
            com.google.assistant.e.j.id r0 = com.google.assistant.p3897e.p3921j.C52179id.AUTHENTICATION_EXPIRED
            android.support.v4.media.session.PlaybackStateCompat r1 = r8.mo1038f()
            java.lang.CharSequence r1 = r1.f1000g
            com.google.assistant.e.j.ec r0 = com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap.m153159b(r7, r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x04f4
        L_0x03e2:
            com.google.android.apps.gsa.staticplugins.accl.performers.g.ao r6 = m153137c(r2, r0, r1)
            if (r6 == 0) goto L_0x040b
            dagger.a r2 = r10.f259640i
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.shared.media.r r2 = (com.google.android.apps.gsa.search.shared.media.C87594r) r2
            r11 = r6
            r5 = 8192(0x2000, double:4.0474E-320)
            boolean r2 = r2.mo81731k(r8, r5)
            if (r2 == 0) goto L_0x040b
            com.google.assistant.e.j.hm r1 = com.google.assistant.p3897e.p3921j.C52161hm.PLAY_FROM_URI
            r4.f259695e = r1
            r1 = r16
            r2 = r0
            r3 = r11
            r5 = r8
            r6 = r9
            r8 = r13
            r9 = r12
            com.google.common.util.concurrent.cx r0 = r1.m153138d(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x04f4
        L_0x040b:
            java.lang.String r2 = r0.f136902i
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L_0x0425
            com.google.common.f.x r2 = r3.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r5, r15)
            java.lang.String r5 = "Unable to perform playFromMediaId because the mediaId is missing from the MediaItem."
            r6 = 13319(0x3407, float:1.8664E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56386p(r5)
            r5 = 0
            goto L_0x042a
        L_0x0425:
            com.google.android.apps.gsa.staticplugins.accl.performers.g.v r5 = new com.google.android.apps.gsa.staticplugins.accl.performers.g.v
            r5.<init>(r2, r1)
        L_0x042a:
            if (r5 == 0) goto L_0x0475
            dagger.a r2 = r10.f259640i
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.shared.media.r r2 = (com.google.android.apps.gsa.search.shared.media.C87594r) r2
            r18 = r12
            r11 = 1024(0x400, double:5.06E-321)
            boolean r2 = r2.mo81731k(r8, r11)
            if (r2 != 0) goto L_0x0452
            dagger.a r2 = r10.f259639h
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            com.google.android.apps.gsa.shared.m.h r6 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248881bj
            com.google.common.b.gu r2 = r2.mo79745c(r6)
            boolean r2 = r2.contains(r7)
            if (r2 == 0) goto L_0x0477
        L_0x0452:
            com.google.assistant.e.j.hm r1 = com.google.assistant.p3897e.p3921j.C52161hm.PLAY_FROM_MEDIA_ID
            r4.f259695e = r1
            com.google.common.f.x r1 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r15)
            java.lang.String r2 = "Executing playFromMediaId operation."
            r3 = 13332(0x3414, float:1.8682E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            r1 = r16
            r2 = r0
            r3 = r5
            r5 = r8
            r6 = r9
            r8 = r13
            r9 = r18
            com.google.common.util.concurrent.cx r0 = r1.m153138d(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x04f4
        L_0x0475:
            r18 = r12
        L_0x0477:
            int r2 = r10.f259643l
            boolean r2 = m153143i(r2, r0)
            if (r2 == 0) goto L_0x049c
            com.google.common.f.x r0 = r3.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r15)
            java.lang.String r1 = "playFromUri or playFromMediaId failed for physical media player, not possible to perform playFromSearch or sending intent."
            r2 = 13331(0x3413, float:1.8681E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.NOT_FOUND
            java.lang.String r1 = "Unable to play from uri or play from mediaId for physical media player request."
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x04f4
        L_0x049c:
            java.lang.String r2 = r0.f136901h
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L_0x04ab
            com.google.android.apps.gsa.staticplugins.accl.performers.g.w r2 = new com.google.android.apps.gsa.staticplugins.accl.performers.g.w
            r2.<init>(r1)
            r5 = r2
            goto L_0x04b0
        L_0x04ab:
            com.google.android.apps.gsa.staticplugins.accl.performers.g.x r5 = new com.google.android.apps.gsa.staticplugins.accl.performers.g.x
            r5.<init>(r2, r1)
        L_0x04b0:
            int r1 = r10.f259643l
            r2 = 5
            if (r1 == r2) goto L_0x04e7
            dagger.a r1 = r10.f259640i
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.shared.media.r r1 = (com.google.android.apps.gsa.search.shared.media.C87594r) r1
            r11 = 2048(0x800, double:1.0118E-320)
            boolean r1 = r1.mo81731k(r8, r11)
            if (r1 == 0) goto L_0x04e7
            com.google.common.f.x r1 = r3.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r15)
            java.lang.String r2 = "Fallback to play from search because playFromUri and playFromMediaId are unavailable."
            r3 = 13330(0x3412, float:1.868E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.assistant.e.j.hm r1 = com.google.assistant.p3897e.p3921j.C52161hm.PLAY_FROM_SEARCH
            r4.f259695e = r1
            r1 = r16
            r2 = r0
            r3 = r5
            r5 = r8
            r6 = r9
            r8 = r13
            r9 = r18
            com.google.common.util.concurrent.cx r0 = r1.m153138d(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x04f4
        L_0x04e7:
            r5 = 2
            r1 = r16
            r2 = r0
            r3 = r4
            r4 = r18
            r6 = r7
            r7 = r13
            com.google.common.util.concurrent.cx r0 = r1.m153144j(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x04f4:
            com.google.android.apps.gsa.staticplugins.accl.performers.g.ab r1 = new com.google.android.apps.gsa.staticplugins.accl.performers.g.ab
            r1.<init>(r10)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r1, r2)
            return r0
        L_0x04ff:
            r0 = move-exception
            com.google.android.libraries.gsa.conversation.clientop.d r2 = new com.google.android.libraries.gsa.conversation.clientop.d
            r2.<init>(r1)
            r2.initCause(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93081ad.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }
}
