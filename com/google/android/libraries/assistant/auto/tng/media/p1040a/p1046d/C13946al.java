package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.session.C0320v;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.podcasts.p10561e.C140211l;
import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.C14043e;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13920d;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13921e;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.C13928e;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1047e.p1048a.C13974a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13982g;
import com.google.android.libraries.assistant.auto.tng.media.p1051c.C13989b;
import com.google.android.libraries.assistant.auto.tng.media.p1053d.p1054a.C13992b;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16940c;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16943f;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36029l;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36082f;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3902c.p3907c.C51112gv;
import com.google.assistant.p3897e.p3921j.C52163ho;
import com.google.assistant.p3897e.p3921j.C52165hq;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52235kf;
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
import com.google.common.util.concurrent.C60887da;
import dagger.C68214a;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.al */
/* compiled from: PG */
public final class C13946al extends C22538o {

    /* renamed from: a */
    public static final C59071e f42444a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.media.a.d.al");

    /* renamed from: k */
    private static final C58528ij f42445k = C58528ij.m90015O(C52567wn.TRACK, C52567wn.ALBUM, C52567wn.ARTIST, C52567wn.PLAYLIST, C52567wn.MUSIC_GENRE, C52567wn.MUSIC_MIX, C52567wn.AUDIO_BOOK, C52567wn.RADIO_STATION);

    /* renamed from: A */
    private final Optional f42446A;

    /* renamed from: b */
    public final C60887da f42447b;

    /* renamed from: c */
    public final C14043e f42448c;

    /* renamed from: d */
    public final C69464a f42449d;

    /* renamed from: e */
    public final C69464a f42450e;

    /* renamed from: f */
    public final C69464a f42451f;

    /* renamed from: g */
    public final C69464a f42452g;

    /* renamed from: h */
    public final C69464a f42453h;

    /* renamed from: i */
    public final Optional f42454i;

    /* renamed from: j */
    public final C13982g f42455j;

    /* renamed from: l */
    private final C36029l f42456l;

    /* renamed from: m */
    private final C68214a f42457m;

    /* renamed from: o */
    private final C69464a f42458o;

    /* renamed from: p */
    private final C60870cx f42459p;

    /* renamed from: q */
    private final C69464a f42460q;

    /* renamed from: r */
    private final C13974a f42461r;

    /* renamed from: s */
    private final C13992b f42462s;

    /* renamed from: t */
    private final Context f42463t;

    /* renamed from: u */
    private final C140211l f42464u;

    /* renamed from: v */
    private final AccountId f42465v;

    /* renamed from: w */
    private final C69464a f42466w;

    /* renamed from: x */
    private final C69464a f42467x;

    /* renamed from: y */
    private final C15481g f42468y;

    /* renamed from: z */
    private final C13928e f42469z;

    public C13946al(C16943f fVar, C14043e eVar, C69464a aVar, C60887da daVar, C69464a aVar2, C36029l lVar, C68214a aVar3, C69464a aVar4, C16940c cVar, C13974a aVar5, C13992b bVar, C140211l lVar2, AccountId accountId, Context context, C69464a aVar6, C69464a aVar7, C69464a aVar8, C69464a aVar9, C69464a aVar10, C69464a aVar11, C15481g gVar, C13928e eVar2, Optional optional, Optional optional2, C13982g gVar2) {
        C16943f fVar2 = fVar;
        C16940c cVar2 = cVar;
        this.f42459p = fVar.mo23107b(cVar);
        this.f42448c = eVar;
        this.f42460q = aVar;
        this.f42463t = context;
        this.f42447b = daVar;
        this.f42449d = aVar2;
        this.f42456l = lVar;
        this.f42457m = aVar3;
        this.f42458o = aVar4;
        this.f42461r = aVar5;
        this.f42462s = bVar;
        this.f42464u = lVar2;
        this.f42465v = accountId;
        this.f42466w = aVar6;
        this.f42450e = aVar7;
        this.f42451f = aVar8;
        this.f42452g = aVar9;
        this.f42467x = aVar10;
        this.f42453h = aVar11;
        this.f42468y = gVar;
        this.f42469z = eVar2;
        this.f42446A = optional;
        this.f42454i = optional2;
        this.f42455j = gVar2;
    }

    /* renamed from: b */
    static Bundle m30233b(C52174hz hzVar, C52165hq hqVar) {
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

    /* renamed from: g */
    public static void m30234g(C0320v vVar, C52176ia iaVar) {
        boolean z = iaVar.f136915c;
        if (vVar.mo1034b() != z) {
            vVar.mo1037e().mo1028m(z ? 1 : 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0263, code lost:
        r15 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0265, code lost:
        r8 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h.m30276c(r15);
        r12 = m30233b(r11, r14);
        r7 = new android.content.Intent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0278, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x027a, code lost:
        r7.putExtra("com.google.android.projection.gearhead.ignore_original_pkg", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027e, code lost:
        r7.setPackage(r8);
        r7.putExtra("com.google.android.projection.gearhead.ignore_original_pkg", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x028a, code lost:
        if (r11.f136895b.isEmpty() == false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x028c, code lost:
        r7.setData(android.net.Uri.parse(r11.f136895b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0295, code lost:
        r7.putExtras(r12);
        r7.putExtra("opa_allow_launch_intent_on_lockscreen", true);
        r7.setFlags(335544320);
        r7.putExtra("android.intent.extra.START_PLAYBACK", true);
        r7.putExtra("android.intent.extra.REFERRER_NAME", "android-app://com.google.android.googlequicksearchbox/https/www.google.com");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02ae, code lost:
        if (r8 == null) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02b0, code lost:
        r14 = com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36019b.m64414a(r13.f42456l.mo39945a(), true).mo39934a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02bf, code lost:
        r14 = r13.f42456l.mo39946b(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02c5, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02dc, code lost:
        r14 = f42444a.mo56226d();
        r14.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MediaInitPerformer");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(45236)).mo56386p("Could not perform media.PLAY_MEDIA, no Provider in PlayMediaArgs.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02fc, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02fd, code lost:
        r0 = new com.google.android.libraries.gsa.conversation.clientop.C22428d(r14);
        r0.initCause(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0305, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        return com.google.common.util.concurrent.C60856cj.m92900i(com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT, "No Provider in PlayMediaArgs."));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        return com.google.common.util.concurrent.C60856cj.m92900i(com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT, "No MediaItem in PlayMediaArgs."));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return com.google.common.util.concurrent.C60856cj.m92900i(com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT, "Internal provider type not supported."));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        return com.google.common.util.concurrent.C60922j.m93045h(r13.f42459p, com.google.apps.tiktok.tracing.C47810es.m84966f(new com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d.C13972z(r13, r9)), r13.f42447b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        return com.google.common.util.concurrent.C60922j.m93045h(r10.mo39937b(), com.google.apps.tiktok.tracing.C47810es.m84966f(new com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d.C13940af(r13, r7, r8, r9, r10, r11, r12)), r13.f42447b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4 = r14.f135938d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b6, code lost:
        if (r4 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b8, code lost:
        r4 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ba, code lost:
        r9 = (com.google.assistant.p3897e.p3921j.C52176ia) m41992m(r4, "play_media_args", com.google.assistant.p3897e.p3921j.C52176ia.f136911k.getParserForType());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r14 = r14.f135938d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cb, code lost:
        if (r14 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cd, code lost:
        r14 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        r14 = (com.google.assistant.p3897e.p3921j.C52165hq) m41992m(r14, "media_query_info_args", com.google.assistant.p3897e.p3921j.C52165hq.f136880c.getParserForType());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00de, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e5, code lost:
        if (r15.equals("media.PREPARE_MEDIA") != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ed, code lost:
        if (r9.f136914b.size() == 0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ef, code lost:
        r14 = f42444a.mo56226d();
        r14.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MediaInitPerformer");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(45243)).mo56386p("Could not perform media.PREPARE_MEDIA, no MediaItem in PlayMediaArgs.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0104, code lost:
        r10 = (com.google.assistant.p3897e.p3921j.C52174hz) r9.f136914b.get(0);
        r15 = r10.f136897d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010f, code lost:
        if (r15 == null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
        r15 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0117, code lost:
        if (r15.f137996c == 18) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0119, code lost:
        r13.f42468y.mo22352b(com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97676er.mo40815i(com.google.net.p4726a.p4727a.C62722b.OK));
        r13.f42448c.mo21391a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012e, code lost:
        if ((r10.f136894a & 4) != 0) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0130, code lost:
        r15 = r10.f136896c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0132, code lost:
        if (r15 == null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0134, code lost:
        r15 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0138, code lost:
        if (r15.f133012b == 7) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013a, code lost:
        r15 = (com.google.assistant.p3897e.p3902c.p3907c.C51085fv) r15.f133013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013f, code lost:
        r15 = com.google.assistant.p3897e.p3902c.p3907c.C51085fv.f132995c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0141, code lost:
        r15 = com.google.assistant.p3897e.p3902c.p3907c.C51084fu.m86032a(r15.f132998b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014d, code lost:
        r15 = r10.f136896c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014f, code lost:
        if (r15 == null) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0151, code lost:
        r15 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0153, code lost:
        r7 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h.m30276c(r15);
        r14 = mo21367c(true, r10, m30233b(r10, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015f, code lost:
        if (r14 != null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0161, code lost:
        if (r7 == null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0163, code lost:
        r15 = r13.f42456l.mo39945a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016a, code lost:
        r15 = r13.f42456l.mo39946b(r7).mo39937b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0174, code lost:
        com.google.common.util.concurrent.C60856cj.m92911t(r15, com.google.apps.tiktok.tracing.C47810es.m84974n(new com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d.C13943ai(r13, r7, r9, r14, r10)), r13.f42447b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0187, code lost:
        r14 = f42444a.mo56226d();
        r14.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MediaInitPerformer");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(45241)).mo56386p("Could not perform media.PREPARE_MEDIA, no Provider in PlayMediaArgs.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a0, code lost:
        return com.google.common.util.concurrent.C60856cj.m92900i(com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a1, code lost:
        r13.f42469z.mo21359c(com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97637dx);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ae, code lost:
        if (r9.f136914b.size() == 0) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b0, code lost:
        r14 = f42444a.mo56226d();
        r14.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MediaInitPerformer");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(45237)).mo56386p("Could not perform media.PLAY_MEDIA, no MediaItem in PlayMediaArgs.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d1, code lost:
        r11 = (com.google.assistant.p3897e.p3921j.C52174hz) r9.f136914b.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01dd, code lost:
        if ((r11.f136894a & 4) != 0) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e5, code lost:
        if (r13.f42446A.isPresent() != false) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e7, code lost:
        ((com.google.android.libraries.assistant.auto.tng.assistant.p725c.p869c.C12901a) r13.f42446A.get()).mo20841a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f2, code lost:
        r15 = r11.f136896c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f4, code lost:
        if (r15 == null) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f6, code lost:
        r15 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fa, code lost:
        if (r15.f133012b == 7) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01fc, code lost:
        r14 = r11.f136896c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fe, code lost:
        if (r14 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0200, code lost:
        r14 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0204, code lost:
        if (r14.f133012b == 7) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0206, code lost:
        r14 = (com.google.assistant.p3897e.p3902c.p3907c.C51085fv) r14.f133013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x020b, code lost:
        r14 = com.google.assistant.p3897e.p3902c.p3907c.C51085fv.f132995c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020d, code lost:
        r14 = com.google.assistant.p3897e.p3902c.p3907c.C51084fu.m86032a(r14.f132998b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0213, code lost:
        if (r14 != 0) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0216, code lost:
        r3 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0217, code lost:
        if (r3 == 4) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0239, code lost:
        r14 = f42444a.mo56224b();
        r14.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MediaInitPerformer");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(45220)).mo56386p("#handleMediaClientOpInternally.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x025f, code lost:
        r15 = r11.f136896c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0261, code lost:
        if (r15 == null) goto L_0x0263;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00b4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r14, com.google.android.libraries.gsa.conversation.clientop.C22434e r15) {
        /*
            r13 = this;
            java.lang.String r15 = r14.f135936b
            com.google.common.f.e r0 = f42444a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "MediaInitPerformer"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Triggering clientOp at media initiation %s"
            r3 = 45231(0xb0af, float:6.3382E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r1, r15)
            java.lang.String r0 = "media.PLAY_MEDIA"
            boolean r0 = r15.equals(r0)
            java.lang.String r1 = "media.PREPARE_MEDIA"
            if (r0 != 0) goto L_0x002e
            boolean r0 = r15.equals(r1)
            if (r0 == 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            com.google.android.libraries.gsa.conversation.clientop.d r15 = new com.google.android.libraries.gsa.conversation.clientop.d
            r15.<init>(r14)
            throw r15
        L_0x002e:
            r0 = 4
            r3 = 1
            com.google.assistant.e.j.dw r4 = r14.f135938d     // Catch:{ a -> 0x00b4 }
            if (r4 != 0) goto L_0x0036
            com.google.assistant.e.j.dw r4 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ a -> 0x00b4 }
        L_0x0036:
            java.lang.String r5 = "play_spoken_content_args"
            com.google.assistant.e.j.ii r6 = com.google.assistant.p3897e.p3921j.C52184ii.f136960f     // Catch:{ a -> 0x00b4 }
            com.google.protobuf.eb r6 = r6.getParserForType()     // Catch:{ a -> 0x00b4 }
            com.google.protobuf.MessageLite r4 = m41992m(r4, r5, r6)     // Catch:{ a -> 0x00b4 }
            com.google.assistant.e.j.ii r4 = (com.google.assistant.p3897e.p3921j.C52184ii) r4     // Catch:{ a -> 0x00b4 }
            com.google.protos.ac.a.h r5 = r4.f136963b     // Catch:{ a -> 0x00b4 }
            if (r5 != 0) goto L_0x004a
            com.google.protos.ac.a.h r5 = com.google.protos.p4757ac.p4758a.C63109h.f170342e     // Catch:{ a -> 0x00b4 }
        L_0x004a:
            int r6 = r4.f136965d     // Catch:{ a -> 0x00b4 }
            long r6 = (long) r6     // Catch:{ a -> 0x00b4 }
            int r8 = r4.f136964c     // Catch:{ a -> 0x00b4 }
            if (r8 < 0) goto L_0x00ad
            com.google.protobuf.cq r9 = r5.f170346c     // Catch:{ a -> 0x00b4 }
            int r9 = r9.size()     // Catch:{ a -> 0x00b4 }
            if (r8 >= r9) goto L_0x00ad
            int r4 = r4.f136964c     // Catch:{ a -> 0x00b4 }
            com.google.protobuf.cq r8 = r5.f170346c     // Catch:{ a -> 0x00b4 }
            java.lang.Object r4 = r8.get(r4)     // Catch:{ a -> 0x00b4 }
            com.google.protos.ac.a.j r4 = (com.google.protos.p4757ac.p4758a.C63111j) r4     // Catch:{ a -> 0x00b4 }
            java.lang.String r4 = r4.f170356g     // Catch:{ a -> 0x00b4 }
            com.google.android.apps.search.podcasts.e.l r8 = r13.f42464u     // Catch:{ a -> 0x00b4 }
            android.content.Context r9 = r13.f42463t     // Catch:{ a -> 0x00b4 }
            com.google.apps.tiktok.account.AccountId r10 = r13.f42465v     // Catch:{ a -> 0x00b4 }
            com.google.android.apps.search.podcasts.e.b r11 = com.google.android.apps.search.podcasts.p10561e.C140201b.f380906e     // Catch:{ a -> 0x00b4 }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ a -> 0x00b4 }
            com.google.android.apps.search.podcasts.e.a r11 = (com.google.android.apps.search.podcasts.p10561e.C140199a) r11     // Catch:{ a -> 0x00b4 }
            r11.copyOnWrite()     // Catch:{ a -> 0x00b4 }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ a -> 0x00b4 }
            com.google.android.apps.search.podcasts.e.b r12 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r12     // Catch:{ a -> 0x00b4 }
            r5.getClass()     // Catch:{ a -> 0x00b4 }
            r12.f380909b = r5     // Catch:{ a -> 0x00b4 }
            int r5 = r12.f380908a     // Catch:{ a -> 0x00b4 }
            r5 = r5 | r3
            r12.f380908a = r5     // Catch:{ a -> 0x00b4 }
            r11.copyOnWrite()     // Catch:{ a -> 0x00b4 }
            com.google.protobuf.bv r5 = r11.instance     // Catch:{ a -> 0x00b4 }
            com.google.android.apps.search.podcasts.e.b r5 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r5     // Catch:{ a -> 0x00b4 }
            r4.getClass()     // Catch:{ a -> 0x00b4 }
            int r12 = r5.f380908a     // Catch:{ a -> 0x00b4 }
            r12 = r12 | 2
            r5.f380908a = r12     // Catch:{ a -> 0x00b4 }
            r5.f380910c = r4     // Catch:{ a -> 0x00b4 }
            r11.copyOnWrite()     // Catch:{ a -> 0x00b4 }
            com.google.protobuf.bv r4 = r11.instance     // Catch:{ a -> 0x00b4 }
            com.google.android.apps.search.podcasts.e.b r4 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r4     // Catch:{ a -> 0x00b4 }
            int r5 = r4.f380908a     // Catch:{ a -> 0x00b4 }
            r5 = r5 | r0
            r4.f380908a = r5     // Catch:{ a -> 0x00b4 }
            r4.f380911d = r6     // Catch:{ a -> 0x00b4 }
            com.google.protobuf.bv r4 = r11.build()     // Catch:{ a -> 0x00b4 }
            com.google.android.apps.search.podcasts.e.b r4 = (com.google.android.apps.search.podcasts.p10561e.C140201b) r4     // Catch:{ a -> 0x00b4 }
            r8.mo115499c(r9, r10, r4)     // Catch:{ a -> 0x00b4 }
        L_0x00ad:
            com.google.assistant.e.j.ec r4 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a     // Catch:{ a -> 0x00b4 }
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r4)     // Catch:{ a -> 0x00b4 }
            return r14
        L_0x00b4:
            com.google.assistant.e.j.dw r4 = r14.f135938d     // Catch:{ a -> 0x02fc }
            if (r4 != 0) goto L_0x00ba
            com.google.assistant.e.j.dw r4 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ a -> 0x02fc }
        L_0x00ba:
            java.lang.String r5 = "play_media_args"
            com.google.assistant.e.j.ia r6 = com.google.assistant.p3897e.p3921j.C52176ia.f136911k     // Catch:{ a -> 0x02fc }
            com.google.protobuf.eb r6 = r6.getParserForType()     // Catch:{ a -> 0x02fc }
            com.google.protobuf.MessageLite r4 = m41992m(r4, r5, r6)     // Catch:{ a -> 0x02fc }
            r9 = r4
            com.google.assistant.e.j.ia r9 = (com.google.assistant.p3897e.p3921j.C52176ia) r9     // Catch:{ a -> 0x02fc }
            com.google.assistant.e.j.dw r14 = r14.f135938d     // Catch:{ a -> 0x00de }
            if (r14 != 0) goto L_0x00cf
            com.google.assistant.e.j.dw r14 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ a -> 0x00de }
        L_0x00cf:
            java.lang.String r4 = "media_query_info_args"
            com.google.assistant.e.j.hq r5 = com.google.assistant.p3897e.p3921j.C52165hq.f136880c     // Catch:{ a -> 0x00de }
            com.google.protobuf.eb r5 = r5.getParserForType()     // Catch:{ a -> 0x00de }
            com.google.protobuf.MessageLite r14 = m41992m(r14, r4, r5)     // Catch:{ a -> 0x00de }
            com.google.assistant.e.j.hq r14 = (com.google.assistant.p3897e.p3921j.C52165hq) r14     // Catch:{ a -> 0x00de }
            goto L_0x00df
        L_0x00de:
            r14 = 0
        L_0x00df:
            boolean r15 = r15.equals(r1)
            r1 = 7
            r4 = 0
            if (r15 == 0) goto L_0x01a1
            com.google.protobuf.cq r15 = r9.f136914b
            int r15 = r15.size()
            if (r15 != 0) goto L_0x0104
            com.google.common.f.e r14 = f42444a
            com.google.common.f.x r14 = r14.mo56226d()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r2)
            java.lang.String r15 = "Could not perform media.PREPARE_MEDIA, no MediaItem in PlayMediaArgs."
            r0 = 45243(0xb0bb, float:6.3399E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            goto L_0x019a
        L_0x0104:
            com.google.protobuf.cq r15 = r9.f136914b
            java.lang.Object r15 = r15.get(r4)
            r10 = r15
            com.google.assistant.e.j.hz r10 = (com.google.assistant.p3897e.p3921j.C52174hz) r10
            com.google.assistant.e.j.wo r15 = r10.f136897d
            if (r15 != 0) goto L_0x0113
            com.google.assistant.e.j.wo r15 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0113:
            int r15 = r15.f137996c
            r4 = 18
            if (r15 != r4) goto L_0x012b
            com.google.android.libraries.assistant.auto.tng.o.a.g r15 = r13.f42468y
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97676er
            com.google.net.a.a.b r5 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r4 = r4.mo40815i(r5)
            r15.mo22352b(r4)
            com.google.android.libraries.assistant.auto.tng.media.mediabrowser.e r15 = r13.f42448c
            r15.mo21391a(r9)
        L_0x012b:
            int r15 = r10.f136894a
            r15 = r15 & r0
            if (r15 == 0) goto L_0x0187
            com.google.assistant.e.c.c.gh r15 = r10.f136896c
            if (r15 != 0) goto L_0x0136
            com.google.assistant.e.c.c.gh r15 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0136:
            int r2 = r15.f133012b
            if (r2 != r1) goto L_0x013f
            java.lang.Object r15 = r15.f133013c
            com.google.assistant.e.c.c.fv r15 = (com.google.assistant.p3897e.p3902c.p3907c.C51085fv) r15
            goto L_0x0141
        L_0x013f:
            com.google.assistant.e.c.c.fv r15 = com.google.assistant.p3897e.p3902c.p3907c.C51085fv.f132995c
        L_0x0141:
            int r15 = r15.f132998b
            int r15 = com.google.assistant.p3897e.p3902c.p3907c.C51084fu.m86032a(r15)
            if (r15 != 0) goto L_0x014a
            goto L_0x014d
        L_0x014a:
            if (r15 != r0) goto L_0x014d
            goto L_0x019a
        L_0x014d:
            com.google.assistant.e.c.c.gh r15 = r10.f136896c
            if (r15 != 0) goto L_0x0153
            com.google.assistant.e.c.c.gh r15 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0153:
            java.lang.String r7 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h.m30276c(r15)
            android.os.Bundle r14 = m30233b(r10, r14)
            com.google.android.libraries.assistant.auto.tng.media.a.b.d r14 = r13.mo21367c(r3, r10, r14)
            if (r14 == 0) goto L_0x019a
            if (r7 != 0) goto L_0x016a
            com.google.android.libraries.search.assistant.performer.g.a.l r15 = r13.f42456l
            com.google.common.util.concurrent.cx r15 = r15.mo39945a()
            goto L_0x0174
        L_0x016a:
            com.google.android.libraries.search.assistant.performer.g.a.l r15 = r13.f42456l
            com.google.android.libraries.search.assistant.performer.g.a.b r15 = r15.mo39946b(r7)
            com.google.common.util.concurrent.cx r15 = r15.mo39937b()
        L_0x0174:
            com.google.android.libraries.assistant.auto.tng.media.a.d.ai r0 = new com.google.android.libraries.assistant.auto.tng.media.a.d.ai
            r5 = r0
            r6 = r13
            r8 = r9
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            com.google.common.util.concurrent.da r14 = r13.f42447b
            com.google.common.util.concurrent.bz r0 = com.google.apps.tiktok.tracing.C47810es.m84974n(r0)
            com.google.common.util.concurrent.C60856cj.m92911t(r15, r0, r14)
            goto L_0x019a
        L_0x0187:
            com.google.common.f.e r14 = f42444a
            com.google.common.f.x r14 = r14.mo56226d()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r2)
            java.lang.String r15 = "Could not perform media.PREPARE_MEDIA, no Provider in PlayMediaArgs."
            r0 = 45241(0xb0b9, float:6.3396E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
        L_0x019a:
            com.google.assistant.e.j.ec r14 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)
            return r14
        L_0x01a1:
            com.google.android.libraries.assistant.auto.tng.media.a.c.e r15 = r13.f42469z
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97637dx
            r15.mo21359c(r5)
            com.google.protobuf.cq r15 = r9.f136914b
            int r15 = r15.size()
            if (r15 != 0) goto L_0x01d1
            com.google.common.f.e r14 = f42444a
            com.google.common.f.x r14 = r14.mo56226d()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r2)
            java.lang.String r15 = "Could not perform media.PLAY_MEDIA, no MediaItem in PlayMediaArgs."
            r0 = 45237(0xb0b5, float:6.339E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            com.google.assistant.e.j.kf r14 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r15 = "No MediaItem in PlayMediaArgs."
            com.google.assistant.e.j.ec r14 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r14, r15)
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)
            goto L_0x02fb
        L_0x01d1:
            com.google.protobuf.cq r15 = r9.f136914b
            java.lang.Object r15 = r15.get(r4)
            r11 = r15
            com.google.assistant.e.j.hz r11 = (com.google.assistant.p3897e.p3921j.C52174hz) r11
            int r15 = r11.f136894a
            r15 = r15 & r0
            if (r15 == 0) goto L_0x02dc
            j$.util.Optional r15 = r13.f42446A
            boolean r15 = r15.isPresent()
            if (r15 == 0) goto L_0x01f2
            j$.util.Optional r15 = r13.f42446A
            java.lang.Object r15 = r15.get()
            com.google.android.libraries.assistant.auto.tng.assistant.c.c.a r15 = (com.google.android.libraries.assistant.auto.tng.assistant.p725c.p869c.C12901a) r15
            r15.mo20841a()
        L_0x01f2:
            com.google.assistant.e.c.c.gh r15 = r11.f136896c
            if (r15 != 0) goto L_0x01f8
            com.google.assistant.e.c.c.gh r15 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x01f8:
            int r15 = r15.f133012b
            if (r15 != r1) goto L_0x025f
            com.google.assistant.e.c.c.gh r14 = r11.f136896c
            if (r14 != 0) goto L_0x0202
            com.google.assistant.e.c.c.gh r14 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0202:
            int r15 = r14.f133012b
            if (r15 != r1) goto L_0x020b
            java.lang.Object r14 = r14.f133013c
            com.google.assistant.e.c.c.fv r14 = (com.google.assistant.p3897e.p3902c.p3907c.C51085fv) r14
            goto L_0x020d
        L_0x020b:
            com.google.assistant.e.c.c.fv r14 = com.google.assistant.p3897e.p3902c.p3907c.C51085fv.f132995c
        L_0x020d:
            int r14 = r14.f132998b
            int r14 = com.google.assistant.p3897e.p3902c.p3907c.C51084fu.m86032a(r14)
            if (r14 != 0) goto L_0x0216
            goto L_0x0217
        L_0x0216:
            r3 = r14
        L_0x0217:
            if (r3 == r0) goto L_0x0239
            g.a.a r14 = r13.f42466w
            java.lang.Object r14 = r14.mo17428b()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x022b
            r14 = 3
            if (r3 != r14) goto L_0x022b
            goto L_0x0239
        L_0x022b:
            com.google.assistant.e.j.kf r14 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r15 = "Internal provider type not supported."
            com.google.assistant.e.j.ec r14 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r14, r15)
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)
            goto L_0x02fb
        L_0x0239:
            com.google.common.f.e r14 = f42444a
            com.google.common.f.x r14 = r14.mo56224b()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r2)
            java.lang.String r15 = "#handleMediaClientOpInternally."
            r0 = 45220(0xb0a4, float:6.3367E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            com.google.common.util.concurrent.cx r14 = r13.f42459p
            com.google.android.libraries.assistant.auto.tng.media.a.d.z r15 = new com.google.android.libraries.assistant.auto.tng.media.a.d.z
            r15.<init>(r13, r9)
            com.google.common.util.concurrent.da r0 = r13.f42447b
            com.google.common.util.concurrent.s r15 = com.google.apps.tiktok.tracing.C47810es.m84966f(r15)
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60922j.m93045h(r14, r15, r0)
            goto L_0x02fb
        L_0x025f:
            com.google.assistant.e.c.c.gh r15 = r11.f136896c
            if (r15 != 0) goto L_0x0265
            com.google.assistant.e.c.c.gh r15 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0265:
            java.lang.String r8 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h.m30276c(r15)
            android.os.Bundle r12 = m30233b(r11, r14)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            boolean r14 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r15 = "com.google.android.projection.gearhead.ignore_original_pkg"
            if (r14 == 0) goto L_0x027e
            r7.putExtra(r15, r3)
            goto L_0x0284
        L_0x027e:
            r7.setPackage(r8)
            r7.putExtra(r15, r4)
        L_0x0284:
            java.lang.String r14 = r11.f136895b
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x0295
            java.lang.String r14 = r11.f136895b
            android.net.Uri r14 = android.net.Uri.parse(r14)
            r7.setData(r14)
        L_0x0295:
            r7.putExtras(r12)
            java.lang.String r14 = "opa_allow_launch_intent_on_lockscreen"
            r7.putExtra(r14, r3)
            r14 = 335544320(0x14000000, float:6.4623485E-27)
            r7.setFlags(r14)
            java.lang.String r14 = "android.intent.extra.START_PLAYBACK"
            r7.putExtra(r14, r3)
            java.lang.String r14 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r15 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            r7.putExtra(r14, r15)
            if (r8 != 0) goto L_0x02bf
            com.google.android.libraries.search.assistant.performer.g.a.l r14 = r13.f42456l
            com.google.common.util.concurrent.cx r14 = r14.mo39945a()
            com.google.android.libraries.search.assistant.performer.g.a.a r14 = com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36019b.m64414a(r14, r3)
            com.google.android.libraries.search.assistant.performer.g.a.b r14 = r14.mo39934a()
            goto L_0x02c5
        L_0x02bf:
            com.google.android.libraries.search.assistant.performer.g.a.l r14 = r13.f42456l
            com.google.android.libraries.search.assistant.performer.g.a.b r14 = r14.mo39946b(r8)
        L_0x02c5:
            r10 = r14
            com.google.common.util.concurrent.cx r14 = r10.mo39937b()
            com.google.android.libraries.assistant.auto.tng.media.a.d.af r15 = new com.google.android.libraries.assistant.auto.tng.media.a.d.af
            r5 = r15
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            com.google.common.util.concurrent.da r0 = r13.f42447b
            com.google.common.util.concurrent.s r15 = com.google.apps.tiktok.tracing.C47810es.m84966f(r15)
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60922j.m93045h(r14, r15, r0)
            goto L_0x02fb
        L_0x02dc:
            com.google.common.f.e r14 = f42444a
            com.google.common.f.x r14 = r14.mo56226d()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r2)
            java.lang.String r15 = "Could not perform media.PLAY_MEDIA, no Provider in PlayMediaArgs."
            r0 = 45236(0xb0b4, float:6.3389E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            com.google.assistant.e.j.kf r14 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r15 = "No Provider in PlayMediaArgs."
            com.google.assistant.e.j.ec r14 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r14, r15)
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)
        L_0x02fb:
            return r14
        L_0x02fc:
            r15 = move-exception
            com.google.android.libraries.gsa.conversation.clientop.d r0 = new com.google.android.libraries.gsa.conversation.clientop.d
            r0.<init>(r14)
            r0.initCause(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d.C13946al.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final C13920d mo21367c(boolean z, C52174hz hzVar, Bundle bundle) {
        C13920d dVar;
        String str = hzVar.f136895b;
        if (TextUtils.isEmpty(str)) {
            C59104x d = f42444a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d).mo56372aa(45215)).mo56386p("The uri string is empty");
            C52568wo woVar = hzVar.f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            if ((woVar.f137995b & 8) != 0) {
                C52568wo woVar2 = hzVar.f136897d;
                if (woVar2 == null) {
                    woVar2 = C52568wo.f137992v;
                }
                C51112gv gvVar = woVar2.f138014u;
                if (gvVar == null) {
                    gvVar = C51112gv.f133031d;
                }
                if ((gvVar.f133033a & 4) != 0) {
                    str = gvVar.f133035c;
                } else {
                    float f = gvVar.f133034b;
                    int i = ((f <= 150.0f || f > 30000.0f) ? (f <= 60.0f || f >= 110.0f) ? 1 : 3 : 2) - 1;
                    str = i != 1 ? i != 2 ? BuildConfig.FLAVOR : C13989b.m30286a((long) (f * 1000.0f)) : C13989b.m30286a((long) f);
                }
            }
        }
        if (!((Boolean) this.f42449d.mo17428b()).booleanValue() || !TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            Optional of = Optional.m71637of(str);
            if (((Boolean) this.f42453h.mo17428b()).booleanValue()) {
                dVar = new C13935aa(this, of, parse, bundle);
            } else {
                dVar = new C13936ab(this, of, parse, bundle);
            }
            return z ? new C13937ac(parse, bundle) : dVar;
        }
        C59104x d2 = f42444a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) d2).mo56372aa(45214)).mo56386p("Failed to create uri operation because uri is missing and there isn't enough information to create a Uri.");
        return null;
    }

    /* renamed from: d */
    public final C60870cx mo21368d(C13920d dVar, C0320v vVar, C52176ia iaVar, Boolean bool, C52163ho hoVar, Intent intent) {
        m30234g(vVar, iaVar);
        mo21370f(iaVar);
        if (this.f42454i.isPresent() && ((Boolean) this.f42451f.mo17428b()).booleanValue()) {
            intent.setAction("android.intent.action.MEDIA_SEARCH");
            intent.putExtra("com.google.android.projection.gearhead.ignore_playback_action", true);
            C46459k.m82829b(((C35470f) this.f42454i.get()).mo20101f(intent), "fail to start intent activity", new Object[0]);
        }
        this.f42468y.mo22352b(C37179a.f97459ae);
        if (!((Boolean) this.f42467x.mo17428b()).booleanValue()) {
            return ((C13921e) this.f42457m.mo27525b()).mo21350b("media.PLAY_MEDIA", dVar, vVar, Optional.m71637of(hoVar));
        }
        Objects.requireNonNull(dVar);
        return ((C36082f) this.f42458o.mo17428b()).mo39961b("media.PLAY_MEDIA", new C13971y(dVar), vVar, bool, Optional.m71637of(hoVar), (C35470f) null);
    }

    /* renamed from: e */
    public final void mo21369e(C37258g gVar, Optional optional) {
        this.f42469z.mo21358b(C37179a.f97593dF);
        if (optional.isPresent()) {
            this.f42469z.mo21357a(gVar.mo40779c(), Optional.empty(), Optional.m71637of((String) optional.get()));
        } else {
            this.f42469z.mo21358b(gVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0093, code lost:
        if (r8 != 3) goto L_0x00d3;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21370f(com.google.assistant.p3897e.p3921j.C52176ia r8) {
        /*
            r7 = this;
            com.google.protobuf.cq r0 = r8.f136914b
            int r0 = r0.size()
            java.lang.String r1 = "MediaInitPerformer"
            if (r0 == 0) goto L_0x0165
            boolean r0 = r8.f136919g
            if (r0 != 0) goto L_0x0151
            com.google.protobuf.cq r8 = r8.f136914b
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            com.google.assistant.e.j.hz r8 = (com.google.assistant.p3897e.p3921j.C52174hz) r8
            com.google.assistant.e.c.c.gh r2 = r8.f136896c
            if (r2 != 0) goto L_0x001d
            com.google.assistant.e.c.c.gh r2 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x001d:
            java.lang.String r2 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h.m30276c(r2)
            if (r2 != 0) goto L_0x0037
            com.google.common.f.e r8 = f42444a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r0, r1)
            java.lang.String r0 = "No provider package name to be stored as sticky app."
            r1 = 45238(0xb0b6, float:6.3392E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0037:
            int r3 = r8.f136894a
            r3 = r3 & 8
            if (r3 == 0) goto L_0x004e
            com.google.assistant.e.j.wo r3 = r8.f136897d
            if (r3 != 0) goto L_0x0043
            com.google.assistant.e.j.wo r3 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0043:
            int r3 = r3.f138003j
            com.google.assistant.e.j.wn r3 = com.google.assistant.p3897e.p3921j.C52567wn.m86649b(r3)
            if (r3 != 0) goto L_0x0050
            com.google.assistant.e.j.wn r3 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
            goto L_0x0050
        L_0x004e:
            com.google.assistant.e.j.wn r3 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
        L_0x0050:
            com.google.assistant.e.c.c.gh r4 = r8.f136896c
            if (r4 != 0) goto L_0x0057
            com.google.assistant.e.c.c.gh r5 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            goto L_0x0058
        L_0x0057:
            r5 = r4
        L_0x0058:
            int r5 = r5.f133012b
            r6 = 1
            if (r5 != r6) goto L_0x00d3
            if (r4 != 0) goto L_0x0061
            com.google.assistant.e.c.c.gh r4 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0061:
            int r5 = r4.f133012b
            if (r5 != r6) goto L_0x006a
            java.lang.Object r4 = r4.f133013c
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            goto L_0x006c
        L_0x006a:
            com.google.assistant.e.c.c.ev r4 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x006c:
            int r4 = r4.f132950h
            int r4 = com.google.assistant.p3897e.p3902c.p3907c.C51057eu.m86027a(r4)
            if (r4 != 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            r5 = 2
            if (r4 == r5) goto L_0x0095
        L_0x0078:
            com.google.assistant.e.c.c.gh r8 = r8.f136896c
            if (r8 != 0) goto L_0x007e
            com.google.assistant.e.c.c.gh r8 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x007e:
            int r4 = r8.f133012b
            if (r4 != r6) goto L_0x0087
            java.lang.Object r8 = r8.f133013c
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            goto L_0x0089
        L_0x0087:
            com.google.assistant.e.c.c.ev r8 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0089:
            int r8 = r8.f132950h
            int r8 = com.google.assistant.p3897e.p3902c.p3907c.C51057eu.m86027a(r8)
            if (r8 != 0) goto L_0x0092
            goto L_0x00d3
        L_0x0092:
            r4 = 3
            if (r8 != r4) goto L_0x00d3
        L_0x0095:
            com.google.android.libraries.assistant.auto.tng.media.d.a.b r8 = r7.f42462s
            com.google.android.libraries.assistant.auto.tng.media.d.d.d r0 = com.google.android.libraries.assistant.auto.tng.media.p1053d.p1059d.C14004d.f42603c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.media.d.d.c r0 = (com.google.android.libraries.assistant.auto.tng.media.p1053d.p1059d.C14003c) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.assistant.auto.tng.media.d.d.d r1 = (com.google.android.libraries.assistant.auto.tng.media.p1053d.p1059d.C14004d) r1
            int r3 = r1.f42605a
            r3 = r3 | r6
            r1.f42605a = r3
            r1.f42606b = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.media.d.d.d r0 = (com.google.android.libraries.assistant.auto.tng.media.p1053d.p1059d.C14004d) r0
            com.google.android.apps.gsa.w.c.ag r8 = r8.f42579a
            com.google.android.apps.gsa.w.c.af r1 = new com.google.android.apps.gsa.w.c.af
            r1.<init>(r8, r0)
            java.util.concurrent.Executor r8 = r8.f331237b
            java.util.concurrent.Callable r0 = com.google.apps.tiktok.tracing.C47810es.m84978r(r1)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92904m(r0, r8)
            com.google.android.libraries.assistant.auto.tng.media.a.d.aj r0 = new com.google.android.libraries.assistant.auto.tng.media.a.d.aj
            r0.<init>()
            com.google.common.util.concurrent.da r1 = r7.f42447b
            com.google.common.util.concurrent.bz r0 = com.google.apps.tiktok.tracing.C47810es.m84974n(r0)
            com.google.common.util.concurrent.C60856cj.m92911t(r8, r0, r1)
            return
        L_0x00d3:
            com.google.common.b.ij r8 = f42445k
            boolean r8 = r8.contains(r3)
            if (r8 != 0) goto L_0x0113
            com.google.assistant.e.j.wn r8 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
            if (r3 != r8) goto L_0x0112
            g.a.a r8 = r7.f42460q
            java.lang.Object r8 = r8.mo17428b()
            java.util.List r8 = (java.util.List) r8
            boolean r8 = r8.contains(r2)
            if (r8 != 0) goto L_0x0113
            android.content.Context r8 = r7.f42463t     // Catch:{ NameNotFoundException -> 0x00fe }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00fe }
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x00fe }
            if (r8 == 0) goto L_0x0112
            int r8 = r8.category     // Catch:{ NameNotFoundException -> 0x00fe }
            if (r8 != r6) goto L_0x0112
            goto L_0x0113
        L_0x00fe:
            r8 = move-exception
            com.google.common.f.e r0 = f42444a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r1)
            java.lang.String r1 = "Failed to retrieve application info for package %s"
            r3 = 45244(0xb0bc, float:6.34E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r8)).mo56372aa(r3)).mo56389s(r1, r2)
        L_0x0112:
            return
        L_0x0113:
            com.google.android.libraries.assistant.auto.tng.media.a.e.a.a r8 = r7.f42461r
            com.google.android.libraries.assistant.auto.tng.media.a.e.b r0 = com.google.android.libraries.assistant.auto.tng.media.p1040a.p1047e.C13975b.f42550c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.media.a.e.a r0 = (com.google.android.libraries.assistant.auto.tng.media.p1040a.p1047e.C13973a) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.assistant.auto.tng.media.a.e.b r1 = (com.google.android.libraries.assistant.auto.tng.media.p1040a.p1047e.C13975b) r1
            int r3 = r1.f42552a
            r3 = r3 | r6
            r1.f42552a = r3
            r1.f42553b = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.media.a.e.b r0 = (com.google.android.libraries.assistant.auto.tng.media.p1040a.p1047e.C13975b) r0
            com.google.android.apps.gsa.w.c.c r8 = r8.f42549a
            com.google.android.apps.gsa.w.c.a r1 = new com.google.android.apps.gsa.w.c.a
            r1.<init>(r8, r0)
            java.util.concurrent.Executor r8 = r8.f331240b
            java.util.concurrent.Callable r0 = com.google.apps.tiktok.tracing.C47810es.m84978r(r1)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92904m(r0, r8)
            com.google.android.libraries.assistant.auto.tng.media.a.d.ak r0 = new com.google.android.libraries.assistant.auto.tng.media.a.d.ak
            r0.<init>()
            com.google.common.util.concurrent.da r1 = r7.f42447b
            com.google.common.util.concurrent.bz r0 = com.google.apps.tiktok.tracing.C47810es.m84974n(r0)
            com.google.common.util.concurrent.C60856cj.m92911t(r8, r0, r1)
            return
        L_0x0151:
            com.google.common.f.e r8 = f42444a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r0, r1)
            java.lang.String r0 = "No need to set stick app based on play media request flag."
            r1 = 45239(0xb0b7, float:6.3393E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0165:
            com.google.common.f.e r8 = f42444a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r0, r1)
            java.lang.String r0 = "No media item, nothing to store as sticky app."
            r1 = 45240(0xb0b8, float:6.3395E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d.C13946al.mo21370f(com.google.assistant.e.j.ia):void");
    }

    /* renamed from: h */
    public final C60870cx mo21371h(Intent intent, int i, String str, Optional optional, C52176ia iaVar, boolean z) {
        if (!this.f42454i.isPresent() || !((Boolean) this.f42451f.mo17428b()).booleanValue()) {
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.NOT_FOUND, "No intent starter exists or it's disabled."));
        }
        intent.setAction("android.media.action.MEDIA_PLAY_FROM_SEARCH");
        if (this.f42463t.getPackageManager().resolveActivity(intent, 65536) == null && intent.getData() != null) {
            C58976aa aaVar = C58975e.f156826a;
            intent.setData((Uri) null);
        }
        if (this.f42463t.getPackageManager().resolveActivity(intent, 65536) != null) {
            C58976aa aaVar2 = C58975e.f156826a;
            if (optional.isPresent()) {
                m30234g((C0320v) optional.get(), iaVar);
            }
            return C47633f.m84733g(((C35470f) this.f42454i.get()).mo20101f(intent)).mo51515h(new C13938ad(this, iaVar, z), this.f42447b).mo51513e(Exception.class, new C13939ae(intent), this.f42447b);
        }
        C58976aa aaVar3 = C58975e.f156826a;
        if (i - 1 != 0) {
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.NOT_FOUND, "Fail to fallback to intent after playFromSearch fallback."));
        }
        return C60856cj.m92900i(C13976a.m30267b(str));
    }
}
