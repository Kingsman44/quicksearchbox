package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85713a;
import com.google.android.apps.gsa.search.core.google.p6790a.C85810bb;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52180ie;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.speech.grammar.pumpkin.C66525q;
import dagger.C68214a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.x */
/* compiled from: PG */
public final class C11867x implements a {

    /* renamed from: a */
    public static final /* synthetic */ int f38200a = 0;

    /* renamed from: b */
    private static final C58974d f38201b = C58974d.m91134h("MediaInitBuilder");

    /* renamed from: c */
    private static final Pattern f38202c = Pattern.compile("video|Video");

    /* renamed from: d */
    private final C85713a f38203d;

    /* renamed from: e */
    private final C86159h f38204e;

    /* renamed from: f */
    private final C85810bb f38205f;

    /* renamed from: g */
    private final C86124t f38206g;

    /* renamed from: h */
    private final C68214a f38207h;

    /* renamed from: i */
    private final C9309a f38208i;

    public C11867x(C85713a aVar, C86159h hVar, C85810bb bbVar, C9309a aVar2, C86124t tVar, C68214a aVar3) {
        this.f38203d = aVar;
        this.f38204e = hVar;
        this.f38205f = bbVar;
        this.f38208i = aVar2;
        this.f38206g = tVar;
        this.f38207h = aVar3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo20249a(com.google.knowledge.p4661a.p4662a.C61752n r10, com.google.android.apps.gsa.shared.search.Query r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f166811b
            java.lang.String r1 = "PlayMedia"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = r10.f166811b
            java.lang.String r1 = "Play_media"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
            return r10
        L_0x0018:
            com.google.android.libraries.assistant.auto.ondevice.b.a r0 = new com.google.android.libraries.assistant.auto.ondevice.b.a
            r0.<init>()
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r1 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r1.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r10)
            java.lang.String r2 = "media_object"
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r1 = r1.mo22496a(r2)
            com.google.common.base.ax r2 = r1.f46791a
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x00c1
            java.lang.Object r2 = r2.mo56107c()
            com.google.knowledge.a.a.n r2 = (com.google.knowledge.p4661a.p4662a.C61752n) r2
            java.lang.String r2 = r2.f166811b
            int r3 = r2.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -654974148: goto L_0x0061;
                case 2582837: goto L_0x0057;
                case 63344207: goto L_0x004d;
                case 1201467603: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x006b
        L_0x0043:
            java.lang.String r3 = "MediaUnspecified"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 2
            goto L_0x006c
        L_0x004d:
            java.lang.String r3 = "Album"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 1
            goto L_0x006c
        L_0x0057:
            java.lang.String r3 = "Song"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 0
            goto L_0x006c
        L_0x0061:
            java.lang.String r3 = "Media_unspecified"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            r2 = 3
            goto L_0x006c
        L_0x006b:
            r2 = -1
        L_0x006c:
            java.lang.String r3 = "artist"
            java.lang.String r7 = "genre"
            java.lang.String r8 = "title"
            if (r2 == 0) goto L_0x00a3
            if (r2 == r6) goto L_0x0090
            if (r2 == r5) goto L_0x007b
            if (r2 == r4) goto L_0x007b
            goto L_0x00c1
        L_0x007b:
            java.lang.String r2 = "related_person"
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r2 = r1.mo22496a(r2)
            java.lang.String r3 = "name"
            com.google.common.base.ax r2 = r2.mo22500e(r3)
            r0.f38029c = r2
            com.google.common.base.ax r1 = r1.mo22500e(r7)
            r0.f38031e = r1
            goto L_0x00c1
        L_0x0090:
            com.google.common.base.ax r2 = r1.mo22500e(r8)
            r0.f38028b = r2
            com.google.common.base.ax r2 = r1.mo22500e(r3)
            r0.f38029c = r2
            com.google.common.base.ax r1 = r1.mo22500e(r7)
            r0.f38031e = r1
            goto L_0x00c1
        L_0x00a3:
            com.google.common.base.ax r2 = r1.mo22500e(r8)
            r0.f38027a = r2
            com.google.common.base.ax r2 = r1.mo22500e(r3)
            r0.f38029c = r2
            com.google.common.base.ax r2 = r1.mo22500e(r7)
            r0.f38031e = r2
            java.lang.String r2 = "album"
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r1 = r1.mo22496a(r2)
            com.google.common.base.ax r1 = r1.mo22500e(r8)
            r0.f38028b = r1
        L_0x00c1:
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r1 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r1.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r10)
            java.lang.String r10 = "app"
            com.google.common.base.ax r10 = r1.mo22500e(r10)
            r0.f38032f = r10
            com.google.android.libraries.assistant.auto.ondevice.b.w r10 = r0.mo20248p()
            com.google.common.base.ax r10 = r9.mo20252d(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11867x.mo20249a(com.google.knowledge.a.a.n, com.google.android.apps.gsa.shared.search.Query):com.google.common.base.ax");
    }

    /* renamed from: b */
    public final C60870cx mo20250b(C66525q qVar, Query query) {
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: c */
    public final C60870cx mo20251c(C52081en enVar) {
        C52078ek ekVar;
        C52070ec ecVar;
        C52081en enVar2;
        for (C52083ep epVar : enVar.f136684d) {
            if (epVar.f136692b == 3) {
                ekVar = (C52078ek) epVar.f136693c;
            } else {
                ekVar = C52078ek.f136671f;
            }
            if (ekVar.f136674b == 3) {
                ecVar = (C52070ec) ekVar.f136675c;
            } else {
                ecVar = C52070ec.f136651d;
            }
            C52069eb ebVar = ecVar.f136655c;
            if (ebVar == null) {
                ebVar = C52069eb.f136648b;
            }
            Iterator it = ebVar.f136650a.iterator();
            while (true) {
                if (it.hasNext()) {
                    C52232kc kcVar = (C52232kc) it.next();
                    if (kcVar.f137065b.equals("play_media_op_result")) {
                        try {
                            C52230ka kaVar = kcVar.f137066c;
                            if (kaVar == null) {
                                kaVar = C52230ka.f137057d;
                            }
                            if ((((C52180ie) C62942bv.parseFrom((C62942bv) C52180ie.f136954d, kaVar.f137061c, C62921ba.m95368a())).f136956a & 2) != 0) {
                                C9309a aVar = this.f38208i;
                                enVar2 = C15669a.m32463b(C58485gu.m89846n(C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.offline_music_not_available))), Arrays.asList(new Integer[]{23202}));
                            } else {
                                enVar2 = C52081en.f136679i;
                            }
                            return C60856cj.m92900i(C58833ax.m90834k(enVar2));
                        } catch (C62974ct e) {
                            ((C58970a) ((C58970a) ((C58970a) f38201b.mo56225c()).mo56382g(e)).mo56372aa(43618)).mo56386p("Invalid parse");
                        }
                    }
                }
            }
        }
        return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0354  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo20252d(com.google.android.libraries.assistant.auto.ondevice.p708b.C11866w r9, com.google.android.apps.gsa.shared.search.Query r10) {
        /*
            r8 = this;
            java.util.regex.Pattern r0 = f38202c
            java.lang.String r1 = r10.f252770i
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.find()
            r1 = 23202(0x5aa2, float:3.2513E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x005e
            com.google.assistant.e.e.a.j r9 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.e.a.e r9 = (com.google.assistant.p3897e.p3910e.p3911a.C51190e) r9
            com.google.android.apps.gsa.a.c.a r10 = r8.f38208i
            android.content.Context r0 = r10.f32300b
            android.content.res.Resources r10 = r10.mo17491a(r0)
            r0 = 2132090287(0x7f151daf, float:1.982091E38)
            java.lang.String r10 = r10.getString(r0)
            com.google.assistant.e.j.dy r10 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r10)
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89846n(r10)
            java.lang.Integer[] r0 = new java.lang.Integer[r3]
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.assistant.e.j.en r10 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32463b(r10, r0)
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.assistant.e.e.a.j r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r0
            r10.getClass()
            r0.f133275j = r10
            int r10 = r0.f133266a
            r10 = r10 | 128(0x80, float:1.794E-43)
            r0.f133266a = r10
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.e.e.a.j r9 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r9
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)
            return r9
        L_0x005e:
            com.google.android.apps.gsa.search.core.i.t r0 = r8.f38206g
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250266R
            boolean r0 = r0.mo79746e(r4)
            if (r0 != 0) goto L_0x00c3
            dagger.a r0 = r8.f38207h
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.util.v r0 = (com.google.android.apps.gsa.shared.util.C91123v) r0
            boolean r0 = r0.mo85390b()
            if (r0 != 0) goto L_0x0077
            goto L_0x00c3
        L_0x0077:
            com.google.android.apps.gsa.a.c.a r9 = r8.f38208i
            android.content.Context r10 = r9.f32300b
            android.content.res.Resources r9 = r9.mo17491a(r10)
            r10 = 2132090282(0x7f151daa, float:1.98209E38)
            java.lang.String r9 = r9.getString(r10)
            com.google.assistant.e.j.dy r9 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r9)
            com.google.assistant.e.e.a.j r10 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.e.a.e r10 = (com.google.assistant.p3897e.p3910e.p3911a.C51190e) r10
            com.google.assistant.e.j.dy[] r0 = new com.google.assistant.p3897e.p3921j.C51809dy[r3]
            r0[r2] = r9
            java.util.List r9 = java.util.Arrays.asList(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[r3]
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.assistant.e.j.en r9 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32463b(r9, r0)
            r10.copyOnWrite()
            com.google.protobuf.bv r0 = r10.instance
            com.google.assistant.e.e.a.j r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r0
            r9.getClass()
            r0.f133275j = r9
            int r9 = r0.f133266a
            r9 = r9 | 128(0x80, float:1.794E-43)
            r0.f133266a = r9
            com.google.protobuf.bv r9 = r10.build()
            com.google.assistant.e.e.a.j r9 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r9
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)
            return r9
        L_0x00c3:
            java.lang.String r0 = r10.f252770i
            com.google.assistant.e.j.hz r0 = com.google.assistant.p3897e.p3921j.C52174hz.f136892m
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.hw r0 = (com.google.assistant.p3897e.p3921j.C52171hw) r0
            com.google.assistant.e.j.wo r1 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.wj r1 = (com.google.assistant.p3897e.p3921j.C52563wj) r1
            com.google.common.base.ax r4 = r9.mo20218g()
            boolean r4 = r4.mo56113h()
            r5 = 2
            if (r4 == 0) goto L_0x0135
            com.google.assistant.e.j.wn r4 = com.google.assistant.p3897e.p3921j.C52567wn.TRACK
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            int r4 = r4.f137991y
            r6.f138003j = r4
            int r4 = r6.f137994a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r6.f137994a = r4
            com.google.common.base.ax r4 = r9.mo20218g()
            java.lang.Object r4 = r4.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            r4.getClass()
            int r7 = r6.f137994a
            r7 = r7 | r3
            r6.f137994a = r7
            r6.f137998e = r4
            com.google.common.base.ax r4 = r9.mo20214d()
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x023e
            com.google.common.base.ax r4 = r9.mo20214d()
            java.lang.Object r4 = r4.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            r4.getClass()
            int r7 = r6.f137994a
            r7 = r7 | r5
            r6.f137994a = r7
            r6.f137999f = r4
            goto L_0x023e
        L_0x0135:
            com.google.common.base.ax r4 = r9.mo20211a()
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x0194
            com.google.assistant.e.j.wn r4 = com.google.assistant.p3897e.p3921j.C52567wn.ALBUM
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            int r4 = r4.f137991y
            r6.f138003j = r4
            int r4 = r6.f137994a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r6.f137994a = r4
            com.google.common.base.ax r4 = r9.mo20211a()
            java.lang.Object r4 = r4.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            r4.getClass()
            int r7 = r6.f137994a
            r7 = r7 | r3
            r6.f137994a = r7
            r6.f137998e = r4
            com.google.common.base.ax r4 = r9.mo20214d()
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x023e
            com.google.common.base.ax r4 = r9.mo20214d()
            java.lang.Object r4 = r4.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            r4.getClass()
            int r7 = r6.f137994a
            r7 = r7 | r5
            r6.f137994a = r7
            r6.f137999f = r4
            goto L_0x023e
        L_0x0194:
            com.google.common.base.ax r4 = r9.mo20214d()
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x01cd
            com.google.assistant.e.j.wn r4 = com.google.assistant.p3897e.p3921j.C52567wn.ARTIST
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            int r4 = r4.f137991y
            r6.f138003j = r4
            int r4 = r6.f137994a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r6.f137994a = r4
            com.google.common.base.ax r4 = r9.mo20214d()
            java.lang.Object r4 = r4.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            r4.getClass()
            int r7 = r6.f137994a
            r7 = r7 | r3
            r6.f137994a = r7
            r6.f137998e = r4
            goto L_0x023e
        L_0x01cd:
            com.google.common.base.ax r4 = r9.mo20217f()
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x0206
            com.google.assistant.e.j.wn r4 = com.google.assistant.p3897e.p3921j.C52567wn.PLAYLIST
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            int r4 = r4.f137991y
            r6.f138003j = r4
            int r4 = r6.f137994a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r6.f137994a = r4
            com.google.common.base.ax r4 = r9.mo20217f()
            java.lang.Object r4 = r4.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            r4.getClass()
            int r7 = r6.f137994a
            r7 = r7 | r3
            r6.f137994a = r7
            r6.f137998e = r4
            goto L_0x023e
        L_0x0206:
            com.google.common.base.ax r4 = r9.mo20215e()
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x0249
            com.google.assistant.e.j.wn r4 = com.google.assistant.p3897e.p3921j.C52567wn.MUSIC_GENRE
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            int r4 = r4.f137991y
            r6.f138003j = r4
            int r4 = r6.f137994a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r6.f137994a = r4
            com.google.common.base.ax r4 = r9.mo20215e()
            java.lang.Object r4 = r4.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            r4.getClass()
            int r7 = r6.f137994a
            r7 = r7 | r3
            r6.f137994a = r7
            r6.f137998e = r4
        L_0x023e:
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.wo r1 = (com.google.assistant.p3897e.p3921j.C52568wo) r1
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x024b
        L_0x0249:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x024b:
            boolean r4 = r1.mo56113h()
            if (r4 == 0) goto L_0x028e
            java.lang.Object r4 = r1.mo56107c()
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.assistant.e.j.hz r6 = (com.google.assistant.p3897e.p3921j.C52174hz) r6
            r4.getClass()
            r6.f136897d = r4
            int r4 = r6.f136894a
            r4 = r4 | 8
            r6.f136894a = r4
            java.lang.Object r4 = r1.mo56107c()
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            int r4 = r4.f137994a
            r4 = r4 & r3
            if (r4 == 0) goto L_0x028e
            java.lang.Object r1 = r1.mo56107c()
            com.google.assistant.e.j.wo r1 = (com.google.assistant.p3897e.p3921j.C52568wo) r1
            java.lang.String r1 = r1.f137998e
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.hz r4 = (com.google.assistant.p3897e.p3921j.C52174hz) r4
            r1.getClass()
            int r6 = r4.f136894a
            r6 = r6 | 32
            r4.f136894a = r6
            r4.f136901h = r1
        L_0x028e:
            com.google.common.base.ax r1 = r9.mo20213c()
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x02aa
            com.google.android.apps.gsa.search.core.carassistant.f.a r10 = r8.f38203d
            com.google.common.base.ax r9 = r9.mo20213c()
            java.lang.Object r9 = r9.mo56107c()
            java.lang.String r9 = (java.lang.String) r9
            com.google.common.base.ax r9 = r10.mo79363a(r9)
            goto L_0x033c
        L_0x02aa:
            com.google.common.base.ax r1 = r9.mo20212b()
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x02e5
            com.google.android.apps.gsa.search.core.carassistant.f.a r10 = r8.f38203d
            com.google.common.base.ax r9 = r9.mo20212b()
            java.lang.Object r9 = r9.mo56107c()
            java.lang.String r9 = (java.lang.String) r9
            java.util.List r10 = r10.mo79364b()
            java.util.Iterator r10 = r10.iterator()
        L_0x02c8:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x02e2
            java.lang.Object r1 = r10.next()
            com.google.assistant.e.c.c.ev r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r1
            java.lang.String r1 = r1.f132948f
            java.lang.String r1 = com.google.android.apps.gsa.nga.shared.p6320al.C80884a.m128736a(r1)
            java.lang.String r4 = com.google.android.apps.gsa.nga.shared.p6320al.C80884a.m128736a(r9)
            r1.contains(r4)
            goto L_0x02c8
        L_0x02e2:
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            goto L_0x033c
        L_0x02e5:
            com.google.android.apps.gsa.search.core.google.a.bb r9 = r8.f38205f
            com.google.android.apps.gsa.search.core.l.h r1 = r8.f38204e
            com.google.android.apps.gsa.search.shared.d.c r1 = r1.mo79792a()
            com.google.android.apps.gsa.search.shared.media.PlaybackStatus r1 = r1.mo81645g()
            com.google.assistant.e.j.kc r9 = r9.mo79457e(r1, r10)
            if (r9 == 0) goto L_0x033a
            com.google.assistant.e.j.ka r9 = r9.f137066c     // Catch:{ ct -> 0x032b }
            if (r9 != 0) goto L_0x02fd
            com.google.assistant.e.j.ka r9 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x032b }
        L_0x02fd:
            com.google.protobuf.z r9 = r9.f137061c     // Catch:{ ct -> 0x032b }
            com.google.protobuf.ba r10 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x032b }
            com.google.assistant.e.i.a.id r1 = com.google.assistant.p3897e.p3917i.p3918a.C51450id.f133992h     // Catch:{ ct -> 0x032b }
            com.google.protobuf.bv r9 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (com.google.protobuf.C63088z) r9, (com.google.protobuf.C62921ba) r10)     // Catch:{ ct -> 0x032b }
            com.google.assistant.e.i.a.id r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51450id) r9     // Catch:{ ct -> 0x032b }
            com.google.assistant.e.c.c.gh r10 = r9.f133997d     // Catch:{ ct -> 0x032b }
            if (r10 != 0) goto L_0x0311
            com.google.assistant.e.c.c.gh r10 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e     // Catch:{ ct -> 0x032b }
        L_0x0311:
            int r10 = r10.f133012b     // Catch:{ ct -> 0x032b }
            if (r10 != r3) goto L_0x033a
            com.google.assistant.e.c.c.gh r9 = r9.f133997d     // Catch:{ ct -> 0x032b }
            if (r9 != 0) goto L_0x031b
            com.google.assistant.e.c.c.gh r9 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e     // Catch:{ ct -> 0x032b }
        L_0x031b:
            int r10 = r9.f133012b     // Catch:{ ct -> 0x032b }
            if (r10 != r3) goto L_0x0324
            java.lang.Object r9 = r9.f133013c     // Catch:{ ct -> 0x032b }
            com.google.assistant.e.c.c.ev r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r9     // Catch:{ ct -> 0x032b }
            goto L_0x0326
        L_0x0324:
            com.google.assistant.e.c.c.ev r9 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o     // Catch:{ ct -> 0x032b }
        L_0x0326:
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)     // Catch:{ ct -> 0x032b }
            goto L_0x033c
        L_0x032b:
            r9 = move-exception
            com.google.common.f.a.d r10 = f38201b
            com.google.common.f.x r10 = r10.mo56225c()
            java.lang.String r1 = "Couldn't parse MediaParams bytes."
            r4 = 43617(0xaa61, float:6.112E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56382g(r9)).mo56372aa(r4)).mo56386p(r1)
        L_0x033a:
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
        L_0x033c:
            com.google.android.libraries.assistant.auto.ondevice.b.t r10 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11863t.f38198a
            com.google.common.base.ax r9 = r9.mo56106b(r10)
            com.google.android.libraries.assistant.auto.ondevice.b.u r10 = new com.google.android.libraries.assistant.auto.ondevice.b.u
            r10.<init>(r0)
            com.google.common.base.ax r9 = r9.mo56106b(r10)
            boolean r10 = r9.mo56113h()
            if (r10 != 0) goto L_0x0354
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            return r9
        L_0x0354:
            com.google.assistant.e.j.ia r10 = com.google.assistant.p3897e.p3921j.C52176ia.f136911k
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.j.hv r10 = (com.google.assistant.p3897e.p3921j.C52170hv) r10
            java.lang.Object r9 = r9.mo56107c()
            com.google.assistant.e.j.hz r9 = (com.google.assistant.p3897e.p3921j.C52174hz) r9
            r10.mo53808d(r9)
            com.google.protobuf.bv r9 = r10.build()
            com.google.assistant.e.j.ia r9 = (com.google.assistant.p3897e.p3921j.C52176ia) r9
            java.lang.String r10 = "media.PLAY_MEDIA"
            java.lang.String r0 = "play_media_args"
            java.lang.String r1 = "assistant.api.client_op.PlayMediaArgs"
            com.google.assistant.e.j.dy r10 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15670b.m32466a(r10, r0, r1, r9)
            java.lang.String r4 = "media.PREPARE_MEDIA"
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15670b.m32466a(r4, r0, r1, r9)
            com.google.protobuf.cq r1 = r9.f136914b
            java.lang.Object r1 = r1.get(r2)
            com.google.assistant.e.j.hz r1 = (com.google.assistant.p3897e.p3921j.C52174hz) r1
            com.google.assistant.e.j.wo r1 = r1.f136897d
            if (r1 != 0) goto L_0x0389
            com.google.assistant.e.j.wo r1 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0389:
            java.lang.String r1 = r1.f137998e
            com.google.protobuf.cq r9 = r9.f136914b
            java.lang.Object r9 = r9.get(r2)
            com.google.assistant.e.j.hz r9 = (com.google.assistant.p3897e.p3921j.C52174hz) r9
            com.google.assistant.e.c.c.gh r9 = r9.f136896c
            if (r9 != 0) goto L_0x0399
            com.google.assistant.e.c.c.gh r9 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0399:
            int r4 = r9.f133012b
            if (r4 != r3) goto L_0x03a2
            java.lang.Object r9 = r9.f133013c
            com.google.assistant.e.c.c.ev r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r9
            goto L_0x03a4
        L_0x03a2:
            com.google.assistant.e.c.c.ev r9 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x03a4:
            java.lang.String r9 = r9.f132948f
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x03c4
            com.google.android.apps.gsa.a.c.a r1 = r8.f38208i
            android.content.Context r4 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r9
            r9 = 2132091308(0x7f1521ac, float:1.982298E38)
            java.lang.String r9 = r1.getString(r9, r4)
            com.google.assistant.e.j.dy r9 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r9)
            goto L_0x03dd
        L_0x03c4:
            com.google.android.apps.gsa.a.c.a r4 = r8.f38208i
            android.content.Context r6 = r4.f32300b
            android.content.res.Resources r4 = r4.mo17491a(r6)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r9
            r5[r3] = r1
            r9 = 2132091307(0x7f1521ab, float:1.9822979E38)
            java.lang.String r9 = r4.getString(r9, r5)
            com.google.assistant.e.j.dy r9 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r9)
        L_0x03dd:
            if (r9 != 0) goto L_0x03e2
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            return r9
        L_0x03e2:
            com.google.common.b.gu r9 = com.google.common.p4522b.C58485gu.m89848p(r0, r9, r10)
            com.google.assistant.e.e.a.j r10 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.e.a.e r10 = (com.google.assistant.p3897e.p3910e.p3911a.C51190e) r10
            java.lang.Integer[] r0 = new java.lang.Integer[r3]
            r1 = 72953(0x11cf9, float:1.02229E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.assistant.e.j.en r9 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32463b(r9, r0)
            r10.copyOnWrite()
            com.google.protobuf.bv r0 = r10.instance
            com.google.assistant.e.e.a.j r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r0
            r9.getClass()
            r0.f133275j = r9
            int r9 = r0.f133266a
            r9 = r9 | 128(0x80, float:1.794E-43)
            r0.f133266a = r9
            com.google.protobuf.bv r9 = r10.build()
            com.google.assistant.e.e.a.j r9 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r9
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11867x.mo20252d(com.google.android.libraries.assistant.auto.ondevice.b.w, com.google.android.apps.gsa.shared.search.Query):com.google.common.base.ax");
    }
}
