package com.google.android.libraries.search.assistant.performer.p2757g;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.session.C0320v;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8867w.p8868a.p8869a.C118728a;
import com.google.android.apps.gsa.p8867w.p8868a.p8869a.C118729b;
import com.google.android.apps.search.podcasts.p10561e.C140211l;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a.C36962j;
import com.google.android.libraries.search.assistant.p2828y.p2852m.C37001a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36029l;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36081e;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36082f;
import com.google.android.libraries.search.assistant.performer.p2767j.C36193o;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52161hm;
import com.google.assistant.p3897e.p3921j.C52163ho;
import com.google.assistant.p3897e.p3921j.C52165hq;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52593xm;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.av */
/* compiled from: PG */
public final class C36052av implements C35472h {

    /* renamed from: a */
    public static final C59071e f94290a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.g.av");

    /* renamed from: b */
    private static final C58528ij f94291b = C58528ij.m90015O(C52567wn.TRACK, C52567wn.ALBUM, C52567wn.ARTIST, C52567wn.PLAYLIST, C52567wn.MUSIC_GENRE, C52567wn.MUSIC_MIX, C52567wn.AUDIO_BOOK, C52567wn.RADIO_STATION);

    /* renamed from: c */
    private final AccountId f94292c;

    /* renamed from: d */
    private final Context f94293d;

    /* renamed from: e */
    private final C35470f f94294e;

    /* renamed from: f */
    private final Executor f94295f;

    /* renamed from: g */
    private final C68214a f94296g;

    /* renamed from: h */
    private final C68214a f94297h;

    /* renamed from: i */
    private final C36029l f94298i;

    /* renamed from: j */
    private final Optional f94299j;

    /* renamed from: k */
    private final C140211l f94300k;

    /* renamed from: l */
    private final C36193o f94301l;

    /* renamed from: m */
    private final C36054ax f94302m;

    /* renamed from: n */
    private final C36962j f94303n;

    public C36052av(C35470f fVar, Executor executor, C36029l lVar, C68214a aVar, C36962j jVar, Optional optional, C68214a aVar2, C140211l lVar2, AccountId accountId, Context context, C36193o oVar, C36054ax axVar) {
        this.f94292c = accountId;
        this.f94293d = context;
        this.f94294e = fVar;
        this.f94295f = executor;
        this.f94298i = lVar;
        this.f94303n = jVar;
        this.f94299j = optional;
        this.f94296g = aVar;
        this.f94297h = aVar2;
        this.f94300k = lVar2;
        this.f94301l = oVar;
        this.f94302m = axVar;
    }

    /* renamed from: b */
    static Bundle m64448b(C52174hz hzVar, C52165hq hqVar) {
        C52593xm xmVar;
        C52593xm xmVar2;
        Bundle bundle = new Bundle();
        bundle.putString("android.intent.extra.REFERRER_NAME", "android-app://com.google.android.googlequicksearchbox/https/www.google.com");
        bundle.putString("query", hzVar.f136901h);
        String str = "vnd.android.cursor.item/*";
        if ((hzVar.f136894a & 8) != 0) {
            C52568wo woVar = hzVar.f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            String str2 = woVar.f137998e;
            String str3 = woVar.f137999f;
            String str4 = woVar.f138000g;
            C52567wn b = C52567wn.m86649b(woVar.f138003j);
            if (b == null) {
                b = C52567wn.UNKNOWN;
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("android.intent.extra.title", str2);
                if (b == C52567wn.TRACK) {
                    str = "vnd.android.cursor.item/audio";
                }
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("android.intent.extra.artist", str3);
                if (b == C52567wn.ARTIST) {
                    str = "vnd.android.cursor.item/artist";
                }
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("android.intent.extra.album", str4);
                if (b == C52567wn.ALBUM) {
                    str = "vnd.android.cursor.item/album";
                }
            }
            if (woVar.f137996c == 37) {
                xmVar = (C52593xm) woVar.f137997d;
            } else {
                xmVar = C52593xm.f138097c;
            }
            if ((xmVar.f138099a & 1) != 0) {
                if (woVar.f137996c == 37) {
                    xmVar2 = (C52593xm) woVar.f137997d;
                } else {
                    xmVar2 = C52593xm.f138097c;
                }
                String str5 = xmVar2.f138100b;
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("android.intent.extra.youtube_click_tracking_id", str5);
                } else {
                    C58976aa aaVar = C58975e.f156826a;
                }
            }
        }
        bundle.putString("android.intent.extra.focus", str);
        if (hqVar != null && !hqVar.f136882a.isEmpty() && !hqVar.f136883b.isEmpty()) {
            bundle.putString("android.intent.extra.user_query", hqVar.f136882a);
            bundle.putString("android.intent.extra.user_query_language", hqVar.f136883b);
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return bundle;
    }

    /* renamed from: c */
    public static C36081e m64449c(boolean z, C52174hz hzVar, Bundle bundle) {
        String str = hzVar.f136895b;
        if (TextUtils.isEmpty(str)) {
            C59104x d = f94290a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d).mo56372aa(52114)).mo56386p("Failed to create uri operation because uri is missing.");
            return null;
        }
        Uri parse = Uri.parse(str);
        if (z) {
            return new C36044an(parse, bundle);
        }
        return new C36045ao(parse, bundle);
    }

    /* renamed from: e */
    public static void m64450e(C0320v vVar, C52176ia iaVar) {
        boolean z = iaVar.f136915c;
        if (vVar.mo1034b() != z) {
            vVar.mo1037e().mo1028m(z ? 1 : 0);
        }
    }

    /* renamed from: g */
    private static Intent m64451g(String str, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.putExtras(bundle);
        intent.setFlags(335544320);
        intent.putExtra("android.intent.extra.START_PLAYBACK", true);
        intent.putExtra("android.intent.extra.REFERRER_NAME", "android-app://com.google.android.googlequicksearchbox/https/www.google.com");
        return intent;
    }

    /* renamed from: h */
    private final void m64452h(C52176ia iaVar) {
        C52567wn wnVar;
        if (!iaVar.f136919g) {
            C52174hz hzVar = (C52174hz) iaVar.f136914b.get(0);
            C51098gh ghVar = hzVar.f136896c;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            String a = C36084bb.m64494a(ghVar);
            if (a == null) {
                C59104x d = f94290a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
                ((C59052c) ((C59052c) d).mo56372aa(52137)).mo56386p("No provider package name to be stored as sticky app.");
                return;
            }
            if ((hzVar.f136894a & 8) != 0) {
                C52568wo woVar = hzVar.f136897d;
                if (woVar == null) {
                    woVar = C52568wo.f137992v;
                }
                wnVar = C52567wn.m86649b(woVar.f138003j);
                if (wnVar == null) {
                    wnVar = C52567wn.UNKNOWN;
                }
            } else {
                wnVar = C52567wn.UNKNOWN;
            }
            if (!f94291b.contains(wnVar)) {
                if (wnVar != C52567wn.UNKNOWN) {
                    return;
                }
                if (!C37001a.f96368a.contains(a)) {
                    try {
                        ApplicationInfo applicationInfo = this.f94293d.getPackageManager().getApplicationInfo(a, 0);
                        if (applicationInfo == null || applicationInfo.category != 1) {
                            return;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        C59104x d2 = f94290a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
                        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(52141)).mo56389s("Failed to retrieve application info for package %s", a);
                        return;
                    }
                }
            }
            C60870cx a2 = this.f94303n.mo40494a(a);
            C36049as asVar = new C36049as();
            C60856cj.m92911t(a2, C47810es.m84974n(asVar), this.f94295f);
            if (!this.f94299j.isEmpty()) {
                C118729b bVar = (C118729b) this.f94299j.get();
                C118728a aVar = new C118728a(bVar, a);
                C60870cx m = C60856cj.m92904m(C47810es.m84978r(aVar), bVar.f331193b);
                C36050at atVar = new C36050at();
                C60856cj.m92911t(m, C47810es.m84974n(atVar), this.f94295f);
                return;
            }
            return;
        }
        C59104x d3 = f94290a.mo56226d();
        d3.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) d3).mo56372aa(52138)).mo56386p("No need to set stick app based on play media request flag.");
    }

    /* renamed from: i */
    private final void m64453i(Intent intent, C0320v vVar, C52161hm hmVar, C52176ia iaVar) {
        if (vVar != null) {
            m64450e(vVar, iaVar);
        }
        C60870cx f = this.f94294e.mo20101f(intent);
        C36051au auVar = new C36051au(hmVar);
        C60856cj.m92911t(f, C47810es.m84974n(auVar), this.f94295f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x025c, code lost:
        if (r0.f132819e.mo59173M() != false) goto L_0x02cb;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20766a(com.google.assistant.p3897e.p3921j.C51809dy r18) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            java.lang.String r1 = r0.f135936b
            com.google.common.f.e r2 = f94290a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "MediaInitPerformer"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "Triggering clientOp at media initiation %s"
            r5 = 52130(0xcba2, float:7.305E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56389s(r3, r1)
            java.lang.String r2 = "media.PLAY_MEDIA"
            boolean r2 = r1.equals(r2)
            java.lang.String r3 = "Cannot perform client op: "
            java.lang.String r5 = "media.PREPARE_MEDIA"
            if (r2 != 0) goto L_0x0041
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L_0x002e
            goto L_0x0041
        L_0x002e:
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.UNIMPLEMENTED
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x0041:
            r6 = 1
            java.lang.String r7 = "play_spoken_content_args"
            com.google.assistant.e.j.ii r9 = com.google.assistant.p3897e.p3921j.C52184ii.f136960f     // Catch:{ g -> 0x00c3 }
            com.google.protobuf.eb r9 = r9.getParserForType()     // Catch:{ g -> 0x00c3 }
            com.google.protobuf.MessageLite r7 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r0, r7, r9)     // Catch:{ g -> 0x00c3 }
            com.google.assistant.e.j.ii r7 = (com.google.assistant.p3897e.p3921j.C52184ii) r7     // Catch:{ g -> 0x00c3 }
            com.google.protos.ac.a.h r9 = r7.f136963b     // Catch:{ g -> 0x00c3 }
            if (r9 != 0) goto L_0x0056
            com.google.protos.ac.a.h r9 = com.google.protos.p4757ac.p4758a.C63109h.f170342e     // Catch:{ g -> 0x00c3 }
        L_0x0056:
            int r10 = r7.f136965d     // Catch:{ g -> 0x00c3 }
            long r10 = (long) r10     // Catch:{ g -> 0x00c3 }
            int r12 = r7.f136964c     // Catch:{ g -> 0x00c3 }
            if (r12 < 0) goto L_0x00bc
            com.google.protobuf.cq r13 = r9.f170346c     // Catch:{ g -> 0x00c3 }
            int r13 = r13.size()     // Catch:{ g -> 0x00c3 }
            if (r12 >= r13) goto L_0x00bc
            int r7 = r7.f136964c     // Catch:{ g -> 0x00c3 }
            com.google.protobuf.cq r12 = r9.f170346c     // Catch:{ g -> 0x00c3 }
            java.lang.Object r7 = r12.get(r7)     // Catch:{ g -> 0x00c3 }
            com.google.protos.ac.a.j r7 = (com.google.protos.p4757ac.p4758a.C63111j) r7     // Catch:{ g -> 0x00c3 }
            java.lang.String r7 = r7.f170356g     // Catch:{ g -> 0x00c3 }
            com.google.android.apps.search.podcasts.e.l r12 = r8.f94300k     // Catch:{ g -> 0x00c3 }
            android.content.Context r13 = r8.f94293d     // Catch:{ g -> 0x00c3 }
            com.google.apps.tiktok.account.AccountId r14 = r8.f94292c     // Catch:{ g -> 0x00c3 }
            com.google.android.apps.search.podcasts.e.b r15 = com.google.android.apps.search.podcasts.p10561e.C140201b.f380906e     // Catch:{ g -> 0x00c3 }
            com.google.protobuf.bn r15 = r15.createBuilder()     // Catch:{ g -> 0x00c3 }
            com.google.android.apps.search.podcasts.e.a r15 = (com.google.android.apps.search.podcasts.p10561e.C140199a) r15     // Catch:{ g -> 0x00c3 }
            r15.copyOnWrite()     // Catch:{ g -> 0x00c3 }
            com.google.protobuf.bv r2 = r15.instance     // Catch:{ g -> 0x00c3 }
            com.google.android.apps.search.podcasts.e.b r2 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r2     // Catch:{ g -> 0x00c3 }
            r9.getClass()     // Catch:{ g -> 0x00c3 }
            r2.f380909b = r9     // Catch:{ g -> 0x00c3 }
            int r9 = r2.f380908a     // Catch:{ g -> 0x00c3 }
            r9 = r9 | r6
            r2.f380908a = r9     // Catch:{ g -> 0x00c3 }
            r15.copyOnWrite()     // Catch:{ g -> 0x00c3 }
            com.google.protobuf.bv r2 = r15.instance     // Catch:{ g -> 0x00c3 }
            com.google.android.apps.search.podcasts.e.b r2 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r2     // Catch:{ g -> 0x00c3 }
            r7.getClass()     // Catch:{ g -> 0x00c3 }
            int r9 = r2.f380908a     // Catch:{ g -> 0x00c3 }
            r16 = 2
            r9 = r9 | 2
            r2.f380908a = r9     // Catch:{ g -> 0x00c3 }
            r2.f380910c = r7     // Catch:{ g -> 0x00c3 }
            r15.copyOnWrite()     // Catch:{ g -> 0x00c3 }
            com.google.protobuf.bv r2 = r15.instance     // Catch:{ g -> 0x00c3 }
            com.google.android.apps.search.podcasts.e.b r2 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r2     // Catch:{ g -> 0x00c3 }
            int r7 = r2.f380908a     // Catch:{ g -> 0x00c3 }
            r7 = r7 | 4
            r2.f380908a = r7     // Catch:{ g -> 0x00c3 }
            r2.f380911d = r10     // Catch:{ g -> 0x00c3 }
            com.google.protobuf.bv r2 = r15.build()     // Catch:{ g -> 0x00c3 }
            com.google.android.apps.search.podcasts.e.b r2 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r2     // Catch:{ g -> 0x00c3 }
            r12.mo115499c(r13, r14, r2)     // Catch:{ g -> 0x00c3 }
        L_0x00bc:
            com.google.assistant.e.j.ec r2 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.f94544a     // Catch:{ g -> 0x00c3 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r2)     // Catch:{ g -> 0x00c3 }
            return r0
        L_0x00c3:
            java.lang.String r2 = "play_media_args"
            com.google.assistant.e.j.ia r7 = com.google.assistant.p3897e.p3921j.C52176ia.f136911k     // Catch:{ g -> 0x0377 }
            com.google.protobuf.eb r7 = r7.getParserForType()     // Catch:{ g -> 0x0377 }
            com.google.protobuf.MessageLite r2 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r0, r2, r7)     // Catch:{ g -> 0x0377 }
            r14 = r2
            com.google.assistant.e.j.ia r14 = (com.google.assistant.p3897e.p3921j.C52176ia) r14     // Catch:{ g -> 0x0377 }
            java.lang.String r2 = "media_query_info_args"
            com.google.assistant.e.j.hq r3 = com.google.assistant.p3897e.p3921j.C52165hq.f136880c     // Catch:{ g -> 0x00e1 }
            com.google.protobuf.eb r3 = r3.getParserForType()     // Catch:{ g -> 0x00e1 }
            com.google.protobuf.MessageLite r2 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r0, r2, r3)     // Catch:{ g -> 0x00e1 }
            com.google.assistant.e.j.hq r2 = (com.google.assistant.p3897e.p3921j.C52165hq) r2     // Catch:{ g -> 0x00e1 }
            goto L_0x00e2
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            boolean r1 = r1.equals(r5)
            r3 = 0
            if (r1 == 0) goto L_0x017e
            com.google.protobuf.cq r1 = r14.f136914b
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0106
            com.google.common.f.e r0 = f94290a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Could not perform media.PREPARE_MEDIA, no MediaItem in PlayMediaArgs."
            r2 = 52140(0xcbac, float:7.3064E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x0177
        L_0x0106:
            com.google.protobuf.cq r1 = r14.f136914b
            java.lang.Object r1 = r1.get(r3)
            r12 = r1
            com.google.assistant.e.j.hz r12 = (com.google.assistant.p3897e.p3921j.C52174hz) r12
            int r1 = r12.f136894a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0164
            com.google.assistant.e.c.c.gh r1 = r12.f136896c
            if (r1 != 0) goto L_0x011b
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x011b:
            java.lang.String r1 = com.google.android.libraries.search.assistant.performer.p2757g.C36084bb.m64494a(r1)
            android.os.Bundle r2 = m64448b(r12, r2)
            com.google.android.libraries.search.assistant.performer.j.o r4 = r8.f94301l
            com.google.common.util.concurrent.cx r11 = r4.mo40006b(r2, r0)
            if (r1 != 0) goto L_0x0132
            com.google.android.libraries.search.assistant.performer.g.a.l r0 = r8.f94298i
            com.google.common.util.concurrent.cx r0 = r0.mo39945a()
            goto L_0x013c
        L_0x0132:
            com.google.android.libraries.search.assistant.performer.g.a.l r0 = r8.f94298i
            com.google.android.libraries.search.assistant.performer.g.a.b r0 = r0.mo39946b(r1)
            com.google.common.util.concurrent.cx r0 = r0.mo39937b()
        L_0x013c:
            r10 = r0
            r0 = 2
            com.google.common.util.concurrent.cx[] r0 = new com.google.common.util.concurrent.C60870cx[r0]
            r0[r3] = r10
            r0[r6] = r11
            com.google.apps.tiktok.tracing.contrib.b.j r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84751b(r0)
            com.google.android.libraries.search.assistant.performer.g.ap r2 = new com.google.android.libraries.search.assistant.performer.g.ap
            r9 = r2
            r13 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            java.util.concurrent.Executor r3 = r8.f94295f
            com.google.common.util.concurrent.cx r0 = r0.mo51521b(r2, r3)
            com.google.android.libraries.search.assistant.performer.g.ar r2 = new com.google.android.libraries.search.assistant.performer.g.ar
            r2.<init>(r1)
            java.util.concurrent.Executor r1 = r8.f94295f
            com.google.common.util.concurrent.bz r2 = com.google.apps.tiktok.tracing.C47810es.m84974n(r2)
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r2, r1)
            goto L_0x0177
        L_0x0164:
            com.google.common.f.e r0 = f94290a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Could not perform media.PREPARE_MEDIA, no Provider in PlayMediaArgs."
            r2 = 52139(0xcbab, float:7.3062E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x0177:
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.f94545b
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x017e:
            com.google.protobuf.cq r1 = r14.f136914b
            int r1 = r1.size()
            if (r1 != 0) goto L_0x01a7
            com.google.common.f.e r0 = f94290a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Could not perform media.PLAY_MEDIA, no MediaItem in PlayMediaArgs."
            r2 = 52136(0xcba8, float:7.3058E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r1 = "No MediaItem in PlayMediaArgs."
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0376
        L_0x01a7:
            com.google.protobuf.cq r1 = r14.f136914b
            java.lang.Object r1 = r1.get(r3)
            r5 = r1
            com.google.assistant.e.j.hz r5 = (com.google.assistant.p3897e.p3921j.C52174hz) r5
            int r1 = r5.f136894a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0357
            com.google.assistant.e.c.c.gh r1 = r5.f136896c
            if (r1 != 0) goto L_0x01bc
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x01bc:
            int r1 = r1.f133012b
            r7 = 7
            if (r1 != r7) goto L_0x0308
            com.google.assistant.e.c.c.gh r0 = r5.f136896c
            if (r0 != 0) goto L_0x01c7
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x01c7:
            int r1 = r0.f133012b
            if (r1 != r7) goto L_0x01d0
            java.lang.Object r0 = r0.f133013c
            com.google.assistant.e.c.c.fv r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51085fv) r0
            goto L_0x01d2
        L_0x01d0:
            com.google.assistant.e.c.c.fv r0 = com.google.assistant.p3897e.p3902c.p3907c.C51085fv.f132995c
        L_0x01d2:
            int r0 = r0.f132998b
            int r0 = com.google.assistant.p3897e.p3902c.p3907c.C51084fu.m86032a(r0)
            if (r0 != 0) goto L_0x01db
            r0 = 1
        L_0x01db:
            r1 = 10
            if (r0 != r1) goto L_0x0215
            com.google.common.f.e r0 = f94290a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Starting NewsPlayer"
            r2 = 52119(0xcb97, float:7.3034E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            dagger.a r0 = r8.f94297h     // Catch:{ dd -> 0x0207 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ dd -> 0x0207 }
            com.google.android.apps.search.assistant.verticals.newsplayer.e.a r0 = (com.google.android.apps.search.assistant.verticals.newsplayer.p10068e.C132416a) r0     // Catch:{ dd -> 0x0207 }
            com.google.apps.tiktok.account.AccountId r1 = r8.f94292c     // Catch:{ dd -> 0x0207 }
            r0.mo110712n(r1, r14)     // Catch:{ dd -> 0x0207 }
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.f94544a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0376
        L_0x0207:
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            java.lang.String r1 = "Failed to start NewsPlayer"
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0376
        L_0x0215:
            if (r0 != r7) goto L_0x02d9
            com.google.common.f.e r0 = f94290a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Starting NarratedWebMediaPlayer"
            r2 = 52118(0xcb96, float:7.3033E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.protobuf.cq r0 = r14.f136914b
            int r0 = r0.size()
            if (r0 == 0) goto L_0x02cb
            com.google.protobuf.cq r0 = r14.f136914b
            java.lang.Object r0 = r0.get(r3)
            com.google.assistant.e.j.hz r0 = (com.google.assistant.p3897e.p3921j.C52174hz) r0
            java.lang.String r0 = r0.f136895b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x025f
            com.google.protobuf.cq r0 = r14.f136914b
            java.lang.Object r0 = r0.get(r3)
            com.google.assistant.e.j.hz r0 = (com.google.assistant.p3897e.p3921j.C52174hz) r0
            com.google.assistant.e.j.wo r0 = r0.f136897d
            if (r0 != 0) goto L_0x0250
            com.google.assistant.e.j.wo r0 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0250:
            com.google.assistant.e.c.c.dc r0 = r0.f138004k
            if (r0 != 0) goto L_0x0256
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0256:
            com.google.protobuf.z r0 = r0.f132819e
            boolean r0 = r0.mo59173M()
            if (r0 == 0) goto L_0x025f
            goto L_0x02cb
        L_0x025f:
            com.google.android.libraries.search.assistant.performer.g.ax r0 = r8.f94302m
            boolean r0 = r0.mo39951a()
            if (r0 == 0) goto L_0x02a1
            android.content.Context r0 = r8.f94293d
            com.google.android.apps.search.b.a.b r1 = com.google.android.apps.search.p10086b.p10087a.C132667b.f362029c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.b.a.a r1 = (com.google.android.apps.search.p10086b.p10087a.C132666a) r1
            com.google.protobuf.cq r2 = r14.f136914b
            java.lang.Object r2 = r2.get(r3)
            com.google.assistant.e.j.hz r2 = (com.google.assistant.p3897e.p3921j.C52174hz) r2
            java.lang.String r2 = r2.f136895b
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.search.b.a.b r3 = (com.google.android.apps.search.p10086b.p10087a.C132667b) r3
            r2.getClass()
            int r4 = r3.f362031a
            r4 = r4 | r6
            r3.f362031a = r4
            r3.f362032b = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.search.b.a.b r1 = (com.google.android.apps.search.p10086b.p10087a.C132667b) r1
            android.content.Intent r1 = com.google.android.apps.search.p10086b.p10087a.C132668c.m215642a(r0, r1)
            com.google.apps.tiktok.tracing.C47810es.m84979s(r0, r1)
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.f94544a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0376
        L_0x02a1:
            android.content.Intent r0 = com.google.android.apps.gsa.h.l.c.b(r14)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r1)
            com.google.android.libraries.search.assistant.performer.a.f r1 = r8.f94294e
            com.google.common.util.concurrent.cx r1 = r1.mo20101f(r0)
            com.google.apps.tiktok.tracing.contrib.b.f r1 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r1)
            com.google.android.libraries.search.assistant.performer.g.aj r2 = com.google.android.libraries.search.assistant.performer.p2757g.C36040aj.f94272a
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.apps.tiktok.tracing.contrib.b.f r1 = r1.mo51515h(r2, r3)
            com.google.android.libraries.search.assistant.performer.g.ak r2 = new com.google.android.libraries.search.assistant.performer.g.ak
            r2.<init>(r0)
            java.lang.Class<java.lang.Exception> r0 = java.lang.Exception.class
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.apps.tiktok.tracing.contrib.b.f r0 = r1.mo51513e(r0, r2, r3)
            goto L_0x0376
        L_0x02cb:
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r1 = "Invalid arguments for Read aloud"
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0376
        L_0x02d9:
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            switch(r0) {
                case 1: goto L_0x02f6;
                case 2: goto L_0x02f3;
                case 3: goto L_0x02f0;
                case 4: goto L_0x02ed;
                case 5: goto L_0x02ea;
                case 6: goto L_0x02e7;
                case 7: goto L_0x02e4;
                case 8: goto L_0x02e1;
                default: goto L_0x02de;
            }
        L_0x02de:
            java.lang.String r0 = "LENS_PLAYER"
            goto L_0x02f8
        L_0x02e1:
            java.lang.String r0 = "LIBASSISTANT_MEDIA_PLAYER"
            goto L_0x02f8
        L_0x02e4:
            java.lang.String r0 = "NARRATED_WEB_MEDIA_PLAYER"
            goto L_0x02f8
        L_0x02e7:
            java.lang.String r0 = "AUDIO_ONLY_PLAYER"
            goto L_0x02f8
        L_0x02ea:
            java.lang.String r0 = "MEDIA_PLAYER_IOS"
            goto L_0x02f8
        L_0x02ed:
            java.lang.String r0 = "MEDIA_PLAYER"
            goto L_0x02f8
        L_0x02f0:
            java.lang.String r0 = "AUDIO_PLAYER_V2"
            goto L_0x02f8
        L_0x02f3:
            java.lang.String r0 = "AUDIO_PLAYER"
            goto L_0x02f8
        L_0x02f6:
            java.lang.String r0 = "UNKNOWN_INTERNAL_PROVIDER_TYPE"
        L_0x02f8:
            java.lang.String r2 = "Internal provider type not supported: "
            java.lang.String r0 = r2.concat(r0)
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0376
        L_0x0308:
            com.google.assistant.e.c.c.gh r1 = r5.f136896c
            if (r1 != 0) goto L_0x030e
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x030e:
            java.lang.String r7 = com.google.android.libraries.search.assistant.performer.p2757g.C36084bb.m64494a(r1)
            android.os.Bundle r1 = m64448b(r5, r2)
            com.google.android.libraries.search.assistant.performer.j.o r2 = r8.f94301l
            com.google.common.util.concurrent.cx r4 = r2.mo40006b(r1, r0)
            if (r7 != 0) goto L_0x032d
            com.google.android.libraries.search.assistant.performer.g.a.l r0 = r8.f94298i
            com.google.common.util.concurrent.cx r0 = r0.mo39945a()
            com.google.android.libraries.search.assistant.performer.g.a.a r0 = com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36019b.m64414a(r0, r6)
            com.google.android.libraries.search.assistant.performer.g.a.b r0 = r0.mo39934a()
            goto L_0x0333
        L_0x032d:
            com.google.android.libraries.search.assistant.performer.g.a.l r0 = r8.f94298i
            com.google.android.libraries.search.assistant.performer.g.a.b r0 = r0.mo39946b(r7)
        L_0x0333:
            r9 = r0
            com.google.common.util.concurrent.cx r2 = r9.mo39937b()
            r0 = 2
            com.google.common.util.concurrent.cx[] r0 = new com.google.common.util.concurrent.C60870cx[r0]
            r0[r3] = r2
            r0[r6] = r4
            com.google.apps.tiktok.tracing.contrib.b.j r10 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84751b(r0)
            com.google.android.libraries.search.assistant.performer.g.ai r11 = new com.google.android.libraries.search.assistant.performer.g.ai
            r0 = r11
            r1 = r17
            r3 = r4
            r4 = r5
            r5 = r7
            r6 = r14
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.Executor r0 = r8.f94295f
            com.google.common.util.concurrent.cx r0 = r10.mo51521b(r11, r0)
            goto L_0x0376
        L_0x0357:
            com.google.common.f.e r0 = f94290a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Could not perform media.PLAY_MEDIA, no Provider in PlayMediaArgs."
            r2 = 52135(0xcba7, float:7.3057E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r1 = "No Provider in PlayMediaArgs."
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0376:
            return r0
        L_0x0377:
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.p2757g.C36052av.mo20766a(com.google.assistant.e.j.dy):com.google.common.util.concurrent.cx");
    }

    /* renamed from: d */
    public final C60870cx mo39949d(C36081e eVar, C0320v vVar, C52176ia iaVar, Boolean bool, C52163ho hoVar) {
        m64450e(vVar, iaVar);
        m64452h(iaVar);
        return ((C36082f) this.f94296g.mo27525b()).mo39961b("media.PLAY_MEDIA", eVar, vVar, bool, Optional.m71637of(hoVar), this.f94294e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x009f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo39950f(com.google.assistant.p3897e.p3921j.C52174hz r3, android.os.Bundle r4, int r5, java.lang.String r6, android.support.p031v4.media.session.C0320v r7, com.google.assistant.p3897e.p3921j.C52176ia r8, boolean r9) {
        /*
            r2 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = r3.f136895b
            boolean r0 = r0.isEmpty()
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 != 0) goto L_0x0032
            android.content.Intent r0 = m64451g(r6, r4)
            java.lang.String r3 = r3.f136895b
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r0.setData(r3)
            java.lang.String r3 = "android.intent.action.VIEW"
            r0.setAction(r3)
            android.content.Context r3 = r2.f94293d
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            android.content.pm.ResolveInfo r3 = r3.resolveActivity(r0, r1)
            if (r3 == 0) goto L_0x0032
            com.google.assistant.e.j.hm r3 = com.google.assistant.p3897e.p3921j.C52161hm.INTENT_VIEW
            r2.m64453i(r0, r7, r3, r8)
            com.google.assistant.e.j.hm r3 = com.google.assistant.p3897e.p3921j.C52161hm.INTENT_VIEW
            goto L_0x0051
        L_0x0032:
            android.content.Intent r3 = m64451g(r6, r4)
            java.lang.String r4 = "android.media.action.MEDIA_PLAY_FROM_SEARCH"
            r3.setAction(r4)
            android.content.Context r4 = r2.f94293d
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.pm.ResolveInfo r4 = r4.resolveActivity(r3, r1)
            if (r4 == 0) goto L_0x004f
            com.google.assistant.e.j.hm r4 = com.google.assistant.p3897e.p3921j.C52161hm.INTENT_MEDIA_PLAY_FROM_SEARCH
            r2.m64453i(r3, r7, r4, r8)
            com.google.assistant.e.j.hm r3 = com.google.assistant.p3897e.p3921j.C52161hm.INTENT_MEDIA_PLAY_FROM_SEARCH
            goto L_0x0051
        L_0x004f:
            com.google.assistant.e.j.hm r3 = com.google.assistant.p3897e.p3921j.C52161hm.NONE
        L_0x0051:
            com.google.assistant.e.j.hm r4 = com.google.assistant.p3897e.p3921j.C52161hm.NONE
            if (r3 == r4) goto L_0x009f
            r2.m64452h(r8)
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.ho r5 = com.google.assistant.p3897e.p3921j.C52163ho.f136875d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.hn r5 = (com.google.assistant.p3897e.p3921j.C52162hn) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.assistant.e.j.ho r6 = (com.google.assistant.p3897e.p3921j.C52163ho) r6
            int r3 = r3.f136874g
            r6.f136878b = r3
            int r3 = r6.f136877a
            r3 = r3 | 1
            r6.f136877a = r3
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.assistant.e.j.ho r3 = (com.google.assistant.p3897e.p3921j.C52163ho) r3
            int r6 = r3.f136877a
            r6 = r6 | 2
            r3.f136877a = r6
            r3.f136879c = r9
            com.google.protobuf.bv r3 = r5.build()
            com.google.assistant.e.j.ho r3 = (com.google.assistant.p3897e.p3921j.C52163ho) r3
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.ec r3 = com.google.android.libraries.search.assistant.performer.p2757g.C36089g.m64499b(r4, r3, r5, r6)
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92900i(r3)
            return r3
        L_0x009f:
            int r5 = r5 + -1
            if (r5 == 0) goto L_0x00b0
            com.google.assistant.e.j.kf r3 = com.google.assistant.p3897e.p3921j.C52235kf.NOT_FOUND
            java.lang.String r4 = "Neither playFromUri nor playFromSearch is available."
            com.google.assistant.e.j.ec r3 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r3, r4)
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92900i(r3)
            return r3
        L_0x00b0:
            if (r6 != 0) goto L_0x00bb
            com.google.assistant.e.j.ec r3 = com.google.android.libraries.search.assistant.performer.p2757g.C36089g.m64500c()
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92900i(r3)
            return r3
        L_0x00bb:
            com.google.assistant.e.j.ec r3 = com.google.android.libraries.search.assistant.performer.p2757g.C36089g.m64498a(r6)
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92900i(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.p2757g.C36052av.mo39950f(com.google.assistant.e.j.hz, android.os.Bundle, int, java.lang.String, android.support.v4.media.session.v, com.google.assistant.e.j.ia, boolean):com.google.common.util.concurrent.cx");
    }
}
