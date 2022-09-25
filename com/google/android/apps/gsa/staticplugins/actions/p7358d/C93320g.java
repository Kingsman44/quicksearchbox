package com.google.android.apps.gsa.staticplugins.actions.p7358d;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.contacts.C74490v;
import com.google.android.apps.gsa.contacts.bg;
import com.google.android.apps.gsa.contacts.example.C74486d;
import com.google.android.apps.gsa.handsfree.a;
import com.google.android.apps.gsa.handsfree.h;
import com.google.android.apps.gsa.handsfree.k;
import com.google.android.apps.gsa.p8889z.p8917f.C119071a;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.C85661bl;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85663bn;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.C85669bt;
import com.google.android.apps.gsa.search.core.C85741ce;
import com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84579f;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.C87425m;
import com.google.android.apps.gsa.search.shared.actions.PuntAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.contact.C87514b;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.p6931i.C87572a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;
import com.google.android.apps.gsa.shared.logger.p7065j.C89933d;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.apps.gsa.sidekick.shared.util.C91973ax;
import com.google.android.apps.gsa.speech.audio.C92138a;
import com.google.android.apps.gsa.speech.audio.C92200k;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.C93406a;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93398l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58476gl;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7886np;
import com.google.p375ai.p378b.C7891nu;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C55052eb;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55177is;
import com.google.p4152bb.p4153a.C55179iu;
import com.google.p4152bb.p4153a.C55206ju;
import com.google.p4152bb.p4153a.C55208jw;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55235kw;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55281mo;
import com.google.p4152bb.p4153a.C55282mp;
import com.google.p4152bb.p4153a.C55284mr;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55996d;
import com.google.p4184bj.p4193c.p4200e.C55998f;
import com.google.p4500cm.p4518d.C58177a;
import com.google.p4500cm.p4518d.C58186c;
import com.google.p4500cm.p4518d.C58187d;
import com.google.p4500cm.p4518d.C58188e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.d.g */
/* compiled from: PG */
public final class C93320g implements C119071a {

    /* renamed from: a */
    private static final C59071e f260243a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.d.g");

    /* renamed from: b */
    private static final C58528ij f260244b = C58476gl.m89803b(EnumSet.of(C55281mo.GOOGLE_NOW, new C55281mo[]{C55281mo.GOOGLE_NOW_NOTIFICATIONS, C55281mo.WEB_HISTORY, C55281mo.WEB_AND_APP_HISTORY}));

    /* renamed from: A */
    private final C87449m f260245A;

    /* renamed from: B */
    private final C93398l f260246B;

    /* renamed from: C */
    private final C58833ax f260247C;

    /* renamed from: D */
    private final C90476a f260248D;

    /* renamed from: E */
    private final C58833ax f260249E;

    /* renamed from: F */
    private final C91123v f260250F;

    /* renamed from: c */
    private final C21370a f260251c;

    /* renamed from: d */
    private final C87514b f260252d;

    /* renamed from: e */
    private final C84413ad f260253e;

    /* renamed from: f */
    private final C85741ce f260254f;

    /* renamed from: g */
    private final C85669bt f260255g;

    /* renamed from: h */
    private final bg f260256h;

    /* renamed from: i */
    private final C74490v f260257i;

    /* renamed from: j */
    private final ContentResolver f260258j;

    /* renamed from: k */
    private final Context f260259k;

    /* renamed from: l */
    private final boolean f260260l;

    /* renamed from: m */
    private final C86124t f260261m;

    /* renamed from: n */
    private final C68214a f260262n;

    /* renamed from: o */
    private final h f260263o;

    /* renamed from: p */
    private final C74486d f260264p;

    /* renamed from: q */
    private final int f260265q;

    /* renamed from: r */
    private final C85664bo f260266r;

    /* renamed from: s */
    private final a f260267s;

    /* renamed from: t */
    private final k f260268t;

    /* renamed from: u */
    private final C93406a f260269u;

    /* renamed from: v */
    private final C84579f f260270v;

    /* renamed from: w */
    private final C90931ca f260271w;

    /* renamed from: x */
    private final C91077d f260272x;

    /* renamed from: y */
    private final com.google.android.apps.gsa.c.b.a f260273y;

    /* renamed from: z */
    private final C87425m f260274z;

    @Deprecated
    public C93320g(Context context, C21370a aVar, C87514b bVar, C84413ad adVar, C85741ce ceVar, C85669bt btVar, C86124t tVar, bg bgVar, C74490v vVar, ContentResolver contentResolver, C91123v vVar2, boolean z, C68214a aVar2, h hVar, C74486d dVar, int i, C85664bo boVar, a aVar3, C84579f fVar, k kVar, C93406a aVar4, C90931ca caVar, C91077d dVar2, C93398l lVar, C58833ax axVar, C90476a aVar5, C58833ax axVar2, com.google.android.apps.gsa.c.b.a aVar6, C87572a aVar7) {
        this.f260251c = aVar;
        this.f260252d = bVar;
        this.f260253e = adVar;
        this.f260256h = bgVar;
        this.f260257i = vVar;
        this.f260258j = contentResolver;
        this.f260259k = context;
        this.f260254f = ceVar;
        this.f260255g = btVar;
        this.f260261m = tVar;
        this.f260250F = vVar2;
        this.f260260l = z;
        this.f260262n = aVar2;
        this.f260263o = hVar;
        this.f260264p = dVar;
        this.f260265q = i;
        this.f260266r = boVar;
        this.f260267s = aVar3;
        this.f260268t = kVar;
        this.f260269u = aVar4;
        this.f260270v = fVar;
        this.f260271w = caVar;
        this.f260272x = dVar2;
        this.f260273y = aVar6;
        this.f260274z = new C87425m(context.getPackageManager(), context, aVar7.mo81703a());
        this.f260245A = new C87449m(context);
        this.f260246B = lVar;
        this.f260247C = axVar;
        this.f260248D = aVar5;
        this.f260249E = axVar2;
    }

    /* renamed from: d */
    private final Intent m153471d(Query query) {
        if (!query.mo84403cj()) {
            return C89429a.m145446d(this.f260259k, m153474g(query));
        }
        if (this.f260247C.mo56113h()) {
            Context context = this.f260259k;
            C87565h hVar = new C87565h();
            hVar.f236565k = m153474g(query);
            return ((C87568k) this.f260247C.mo56107c()).mo81687a(context, hVar.mo81685a(), 268435456);
        }
        Context context2 = this.f260259k;
        Query g = m153474g(query);
        C87565h hVar2 = new C87565h();
        hVar2.f236565k = g;
        Bundle a = hVar2.mo81685a();
        Intent b = C89429a.m145444b(context2, "com.google.android.apps.gsa.staticplugins.opa.OpaActivity");
        b.putExtras(a);
        return b;
    }

    /* renamed from: e */
    private final Uri m153472e(C55052eb ebVar, long j) {
        Future future = (Future) this.f260273y.a(j).mo56111f();
        if (future == null) {
            return null;
        }
        try {
            com.google.android.apps.gsa.c.a.a aVar = (com.google.android.apps.gsa.c.a.a) C90877ak.m148472f(future);
            if (!C92138a.m151256a(aVar)) {
                ((C59052c) ((C59052c) f260243a.mo56226d()).mo56372aa(13604)).mo56386p("Failed to amplify the recorded audio.");
            }
            return C92200k.m151398b(this.f260259k, aVar, ebVar);
        } catch (InterruptedException | ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f260243a.mo56226d()).mo56382g(e)).mo56372aa(13603)).mo56386p("AudioProviderHelper.insert() throws exception");
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v30, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v121, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:408:?, code lost:
        return r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x099e  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x09b1  */
    /* JADX WARNING: Removed duplicated region for block: B:407:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0235  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument m153473f(com.google.android.apps.gsa.shared.search.Query r32, com.google.p4152bb.p4153a.C55421x r33, com.google.p4152bb.p4153a.C55265lz r34, com.google.p4152bb.p4153a.C55213ka r35, com.google.android.apps.gsa.search.shared.media.PlaybackStatus r36) {
        /*
            r31 = this;
            r7 = r31
            r0 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55290mx.f145636f
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r6.mo58887l(r1)
            com.google.protobuf.bf r2 = r6.f169962ag
            com.google.protobuf.bs r1 = r1.f169971d
            boolean r1 = r2.mo58857o(r1)
            if (r1 == 0) goto L_0x0023
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument
            r0.<init>(r6)
            return r0
        L_0x0023:
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55219kg.f145374e
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r6.mo58887l(r1)
            com.google.protobuf.bf r2 = r6.f169962ag
            com.google.protobuf.bs r1 = r1.f169971d
            boolean r1 = r2.mo58857o(r1)
            r2 = 3
            r5 = 2
            r13 = 1
            if (r1 == 0) goto L_0x0334
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.google.protobuf.cq r8 = r4.f145560c
            java.util.Iterator r8 = r8.iterator()
        L_0x0044:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x005c
            java.lang.Object r9 = r8.next()
            com.google.bb.a.nl r9 = (com.google.p4152bb.p4153a.C55305nl) r9
            int r10 = r6.f145359b
            com.google.android.apps.gsa.search.shared.contact.c r9 = com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87437ae.m141906b(r9, r10)
            if (r9 == 0) goto L_0x0044
            r1.add(r9)
            goto L_0x0044
        L_0x005c:
            com.google.bb.a.ka r8 = r4.f145563f
            if (r8 != 0) goto L_0x0062
            com.google.bb.a.ka r8 = com.google.p4152bb.p4153a.C55213ka.f145356g
        L_0x0062:
            java.util.Map r23 = com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument.m141822h(r8)
            com.google.protobuf.cq r4 = r4.f145560c
            com.google.protobuf.bt r8 = com.google.p4152bb.p4153a.C55219kg.f145374e
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r6.mo58887l(r8)
            com.google.protobuf.bf r9 = r6.f169962ag
            com.google.protobuf.bs r10 = r8.f169971d
            java.lang.Object r9 = r9.mo58854l(r10)
            if (r9 != 0) goto L_0x007e
            java.lang.Object r8 = r8.f169969b
            goto L_0x0082
        L_0x007e:
            java.lang.Object r8 = r8.mo58889c(r9)
        L_0x0082:
            r12 = r8
            com.google.bb.a.kg r12 = (com.google.p4152bb.p4153a.C55219kg) r12
            r11 = 4
            if (r12 == 0) goto L_0x01d0
            int r8 = r12.f145376a
            r8 = r8 & r13
            if (r8 == 0) goto L_0x01d0
            com.google.bb.a.fp r8 = r12.f145377b
            if (r8 != 0) goto L_0x0093
            com.google.bb.a.fp r8 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x0093:
            com.google.bb.a.ej r8 = r8.f144971e
            if (r8 != 0) goto L_0x0099
            com.google.bb.a.ej r8 = com.google.p4152bb.p4153a.C55060ej.f144849b
        L_0x0099:
            int r8 = r8.f144851a
            int r9 = com.google.p4152bb.p4153a.C55059ei.m87571a(r8)
            if (r9 != 0) goto L_0x00ab
            r26 = r1
            r36 = r4
            r28 = r12
            r1 = 0
            r15 = 0
            goto L_0x01d8
        L_0x00ab:
            if (r9 == r13) goto L_0x01d0
            int r8 = com.google.p4152bb.p4153a.C55059ei.m87571a(r8)
            if (r8 != 0) goto L_0x00b4
            r8 = 1
        L_0x00b4:
            int r8 = r8 + -1
            if (r8 == r13) goto L_0x00cd
            if (r8 == r5) goto L_0x00ca
            if (r8 == r2) goto L_0x00c6
            if (r8 != r11) goto L_0x00c0
            r2 = 1
            goto L_0x00c7
        L_0x00c0:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            r9 = 1
            r10 = 0
            goto L_0x00d0
        L_0x00ca:
            r2 = 1
            r9 = 1
            goto L_0x00cf
        L_0x00cd:
            r2 = 0
            r9 = 0
        L_0x00cf:
            r10 = 1
        L_0x00d0:
            com.google.bb.a.fp r8 = r12.f145377b
            if (r8 != 0) goto L_0x00d9
            com.google.bb.a.fp r16 = com.google.p4152bb.p4153a.C55093fp.f144965l
            r11 = r16
            goto L_0x00da
        L_0x00d9:
            r11 = r8
        L_0x00da:
            int r11 = r11.f144967a
            r5 = r5 & r11
            if (r5 == 0) goto L_0x0165
            if (r8 != 0) goto L_0x00e3
            com.google.bb.a.fp r8 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x00e3:
            com.google.bb.a.fl r5 = r8.f144970d
            if (r5 != 0) goto L_0x00e9
            com.google.bb.a.fl r5 = com.google.p4152bb.p4153a.C55089fl.f144954j
        L_0x00e9:
            com.google.android.apps.gsa.contacts.t r24 = new com.google.android.apps.gsa.contacts.t
            java.util.List r16 = java.util.Collections.emptyList()
            com.google.android.apps.gsa.search.core.ce r11 = r7.f260254f
            com.google.android.apps.gsa.search.shared.contact.aa r8 = r11.f231808e
            com.google.android.apps.gsa.search.shared.contact.b r15 = r7.f260252d
            com.google.android.apps.gsa.contacts.bg r14 = r7.f260256h
            com.google.android.apps.gsa.contacts.v r0 = r7.f260257i
            com.google.protobuf.cq r13 = r5.f144957b
            r20 = r14
            r14 = 0
            java.lang.Object r13 = r13.get(r14)
            r21 = r13
            java.lang.String r21 = (java.lang.String) r21
            r22 = 0
            com.google.common.base.ax r13 = r7.f260249E
            java.lang.String r25 = "agsa_action_v2"
            r18 = r8
            r8 = r24
            r3 = r9
            r9 = r32
            r36 = r4
            r4 = r10
            r10 = r1
            r26 = r11
            r11 = r23
            r28 = r12
            r12 = r16
            r29 = r13
            r13 = r26
            r16 = r20
            r14 = r18
            r26 = r1
            r1 = 0
            r17 = r0
            r18 = r5
            r19 = r21
            r20 = r22
            r21 = r29
            r22 = r25
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.util.List r0 = r24.b()
            android.content.ContentResolver r5 = r7.f260258j
            java.util.Map r0 = com.google.android.apps.gsa.contacts.cr.d(r0, r2, r4, r3, r5)
            if (r0 != 0) goto L_0x014c
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument r15 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument
            r15.<init>(r6, r1)
            goto L_0x01d8
        L_0x014c:
            java.lang.String r2 = "number"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "name"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "_id"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x01a9
        L_0x0165:
            r26 = r1
            r36 = r4
            r3 = r9
            r4 = r10
            r28 = r12
            r1 = 0
            android.content.ContentResolver r0 = r7.f260258j
            java.util.Map r0 = com.google.android.apps.gsa.contacts.cr.e(r2, r4, r3, r0)
            java.lang.String r2 = "number"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "name"
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x01a6
            android.content.ContentResolver r3 = r7.f260258j
            java.util.Map r3 = com.google.android.apps.gsa.contacts.cr.c(r2, r3)
            java.lang.String r4 = "_id"
            java.lang.Object r4 = r3.get(r4)
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r4 = "display_name"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x01a4
            goto L_0x01a8
        L_0x01a4:
            r3 = r0
            goto L_0x01a8
        L_0x01a6:
            r3 = r0
            r15 = r1
        L_0x01a8:
            r0 = r15
        L_0x01a9:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x01b5
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument r15 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument
            r15.<init>(r6, r1)
            goto L_0x01d8
        L_0x01b5:
            com.google.android.apps.gsa.search.shared.contact.Person r0 = com.google.android.apps.gsa.contacts.cr.a(r0, r3, r2)
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r2 = new com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation
            java.lang.String r3 = r0.f236373d
            java.lang.String r4 = ""
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            com.google.common.b.ij r5 = com.google.common.p4522b.C58528ij.m90006F(r26)
            r2.<init>(r3, r4, r0, r5)
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument r15 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument
            r15.<init>(r6, r2)
            goto L_0x01d8
        L_0x01d0:
            r26 = r1
            r36 = r4
            r28 = r12
            r1 = 0
            r15 = r1
        L_0x01d8:
            if (r15 == 0) goto L_0x01dc
            goto L_0x0333
        L_0x01dc:
            boolean r0 = r36.isEmpty()
            if (r0 != 0) goto L_0x0229
            r0 = r36
            r3 = 0
            java.lang.Object r2 = r0.get(r3)
            com.google.bb.a.nl r2 = (com.google.p4152bb.p4153a.C55305nl) r2
            com.google.protobuf.cq r2 = r2.f145692b
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x022a
            java.lang.Object r0 = r0.get(r3)
            com.google.bb.a.nl r0 = (com.google.p4152bb.p4153a.C55305nl) r0
            com.google.protobuf.cq r0 = r0.f145692b
            java.lang.Object r0 = r0.get(r3)
            com.google.bb.a.la r0 = (com.google.p4152bb.p4153a.C55240la) r0
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55274mh.f145587e
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r4 = r2.f169971d
            java.lang.Object r0 = r0.mo58854l(r4)
            if (r0 != 0) goto L_0x0217
            java.lang.Object r0 = r2.f169969b
            goto L_0x021b
        L_0x0217:
            java.lang.Object r0 = r2.mo58889c(r0)
        L_0x021b:
            com.google.bb.a.mh r0 = (com.google.p4152bb.p4153a.C55274mh) r0
            if (r0 == 0) goto L_0x022a
            int r0 = r0.f145590b
            int r2 = r6.f145359b
            if (r0 != r2) goto L_0x022a
            r2 = r28
            r0 = 0
            goto L_0x022d
        L_0x0229:
            r3 = 0
        L_0x022a:
            r2 = r28
            r0 = 1
        L_0x022d:
            if (r2 == 0) goto L_0x0318
            int r4 = r2.f145376a
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0318
            com.google.bb.a.fp r4 = r2.f145377b
            if (r4 != 0) goto L_0x023b
            com.google.bb.a.fp r4 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x023b:
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.bb.a.fm r4 = (com.google.p4152bb.p4153a.C55090fm) r4
            com.google.android.libraries.f.a r9 = r7.f260251c
            com.google.android.apps.gsa.search.shared.contact.b r10 = r7.f260252d
            com.google.android.apps.gsa.search.core.ce r11 = r7.f260254f
            com.google.android.apps.gsa.search.core.i.t r8 = r7.f260261m
            r15 = r32
            r12 = r33
            boolean r13 = com.google.android.apps.gsa.search.core.C85669bt.m137537f(r12, r15, r8)
            com.google.android.apps.gsa.search.core.i.t r8 = r7.f260261m
            boolean r14 = com.google.android.apps.gsa.search.core.C85669bt.m137538g(r12, r15, r8)
            com.google.android.apps.gsa.search.core.bt r12 = r7.f260255g
            com.google.android.apps.gsa.contacts.bg r8 = r7.f260256h
            com.google.android.apps.gsa.contacts.v r1 = r7.f260257i
            com.google.common.b.ij r17 = com.google.common.p4522b.C58528ij.m90006F(r26)
            dagger.a r3 = r7.f260262n
            com.google.common.base.ax r5 = r7.f260249E
            r16 = r8
            r8 = r32
            r18 = r12
            r12 = r13
            r13 = r14
            r14 = r18
            r15 = r16
            r16 = r1
            r18 = r23
            r19 = r4
            r20 = r3
            r21 = r0
            r22 = r5
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r15 = com.google.android.apps.gsa.b.a.a.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.google.protobuf.bn r1 = r2.toBuilder()
            com.google.bb.a.kf r1 = (com.google.p4152bb.p4153a.C55218kf) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bb.a.kg r2 = (com.google.p4152bb.p4153a.C55219kg) r2
            com.google.protobuf.bv r3 = r4.build()
            com.google.bb.a.fp r3 = (com.google.p4152bb.p4153a.C55093fp) r3
            r3.getClass()
            r2.f145377b = r3
            int r3 = r2.f145376a
            r4 = 1
            r3 = r3 | r4
            r2.f145376a = r3
            com.google.protobuf.bv r1 = r1.build()
            r12 = r1
            com.google.bb.a.kg r12 = (com.google.p4152bb.p4153a.C55219kg) r12
            if (r15 == 0) goto L_0x02e4
            boolean r1 = r32.mo84403cj()
            if (r1 != 0) goto L_0x02b6
            boolean r1 = r32.mo84399cf()
            if (r1 != 0) goto L_0x02b6
            r14 = 1
            goto L_0x02b7
        L_0x02b6:
            r14 = 0
        L_0x02b7:
            com.google.bb.a.fp r1 = r12.f145377b
            if (r1 != 0) goto L_0x02bd
            com.google.bb.a.fp r1 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x02bd:
            int r1 = r1.f144974h
            int r1 = com.google.p4152bb.p4153a.C55092fo.m87590a(r1)
            if (r1 != 0) goto L_0x02c6
            goto L_0x02e4
        L_0x02c6:
            r2 = 4
            if (r1 != r2) goto L_0x02e4
            boolean r1 = r15.mo81544m()
            if (r1 == 0) goto L_0x02e4
            android.os.Parcelable r1 = r15.f236364c
            r1.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r1 = (com.google.android.apps.gsa.search.shared.contact.Person) r1
            com.google.android.apps.gsa.search.shared.contact.RelationshipStatus r2 = r15.f236395k
            if (r14 == 0) goto L_0x02e1
            com.google.android.apps.gsa.search.shared.contact.Relationship r3 = r2.f236410c
            com.google.android.apps.gsa.search.core.ce r4 = r7.f260254f
            r4.mo79390b(r3, r1)
        L_0x02e1:
            r2.mo81599a()
        L_0x02e4:
            if (r15 == 0) goto L_0x02ec
            boolean r1 = r15.mo81541i()
            if (r1 == 0) goto L_0x031a
        L_0x02ec:
            com.google.bb.a.fp r1 = r12.f145377b
            if (r1 != 0) goto L_0x02f3
            com.google.bb.a.fp r2 = com.google.p4152bb.p4153a.C55093fp.f144965l
            goto L_0x02f4
        L_0x02f3:
            r2 = r1
        L_0x02f4:
            int r2 = r2.f144967a
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x031a
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument r15 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument
            if (r1 != 0) goto L_0x0301
            com.google.bb.a.fp r0 = com.google.p4152bb.p4153a.C55093fp.f144965l
            goto L_0x0302
        L_0x0301:
            r0 = r1
        L_0x0302:
            int r0 = r0.f144967a
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0313
            if (r1 != 0) goto L_0x030c
            com.google.bb.a.fp r1 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x030c:
            com.google.bb.a.gj r0 = r1.f144977k
            if (r0 != 0) goto L_0x0314
            com.google.bb.a.gj r0 = com.google.p4152bb.p4153a.C55114gj.f145034g
            goto L_0x0314
        L_0x0313:
            r0 = 0
        L_0x0314:
            r15.<init>((com.google.p4152bb.p4153a.C55213ka) r6, (com.google.p4152bb.p4153a.C55114gj) r0)
            goto L_0x0333
        L_0x0318:
            r12 = r2
            r15 = 0
        L_0x031a:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument r1 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument
            com.google.protobuf.bn r2 = r35.toBuilder()
            com.google.bb.a.jz r2 = (com.google.p4152bb.p4153a.C55211jz) r2
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55219kg.f145374e
            r2.mo58885m(r3, r12)
            com.google.protobuf.bv r2 = r2.build()
            com.google.bb.a.ka r2 = (com.google.p4152bb.p4153a.C55213ka) r2
            r1.<init>(r2, r15)
            r1.f236199j = r0
            r15 = r1
        L_0x0333:
            return r15
        L_0x0334:
            r12 = r3
            r0 = 1
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55235kw.f145427j
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r6.mo58887l(r1)
            com.google.protobuf.bf r3 = r6.f169962ag
            com.google.protobuf.bs r1 = r1.f169971d
            boolean r1 = r3.mo58857o(r1)
            if (r1 == 0) goto L_0x083b
            boolean r1 = m153476i(r35)
            if (r1 == 0) goto L_0x041d
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55235kw.f145427j
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r6.mo58887l(r1)
            com.google.protobuf.bf r2 = r6.f169962ag
            com.google.protobuf.bs r3 = r1.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x0365
            java.lang.Object r1 = r1.f169969b
            goto L_0x0369
        L_0x0365:
            java.lang.Object r1 = r1.mo58889c(r2)
        L_0x0369:
            com.google.bb.a.kw r1 = (com.google.p4152bb.p4153a.C55235kw) r1
            com.google.protobuf.cq r2 = r1.f145431c
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0394
            com.google.protobuf.cq r2 = r1.f145431c
            int r2 = r2.size()
            if (r2 <= r0) goto L_0x0388
            com.google.common.f.e r2 = f260243a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "EntityArgument proto of audio argument shouldn't have more than one value."
            r4 = 13624(0x3538, float:1.9091E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
        L_0x0388:
            com.google.protobuf.cq r2 = r1.f145431c
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.google.bb.a.lh r2 = (com.google.p4152bb.p4153a.C55247lh) r2
            java.lang.String r15 = r2.f145482d
            goto L_0x0395
        L_0x0394:
            r15 = 0
        L_0x0395:
            com.google.protobuf.cq r2 = r1.f145434f
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x03e7
            com.google.protobuf.cq r2 = r1.f145434f
            int r2 = r2.size()
            if (r2 <= r0) goto L_0x03b2
            com.google.common.f.e r0 = f260243a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "EntityArgument proto of audio argument shouldn't have more than one client query."
            r3 = 13623(0x3537, float:1.909E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
        L_0x03b2:
            com.google.protobuf.cq r0 = r1.f145434f
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.bb.a.df r0 = (com.google.p4152bb.p4153a.C55029df) r0
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55052eb.f144835d
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r0.mo58887l(r1)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r2 = r1.f169971d
            java.lang.Object r0 = r0.mo58854l(r2)
            if (r0 != 0) goto L_0x03d1
            java.lang.Object r0 = r1.f169969b
            goto L_0x03d5
        L_0x03d1:
            java.lang.Object r0 = r1.mo58889c(r0)
        L_0x03d5:
            com.google.bb.a.eb r0 = (com.google.p4152bb.p4153a.C55052eb) r0
            if (r0 == 0) goto L_0x03e7
            r3 = r32
            long r1 = r3.f252749G
            android.net.Uri r0 = r7.m153472e(r0, r1)
            if (r0 == 0) goto L_0x03e7
            java.lang.String r15 = r0.toString()
        L_0x03e7:
            if (r15 == 0) goto L_0x0409
            android.content.Context r0 = r7.f260259k
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            android.net.Uri r2 = android.net.Uri.parse(r15)
            r1.setDataSource(r0, r2)
            r0 = 9
            java.lang.String r0 = r1.extractMetadata(r0)
            if (r0 != 0) goto L_0x0400
            goto L_0x0416
        L_0x0400:
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0417
        L_0x0409:
            com.google.common.f.e r0 = f260243a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Unable to attach the audio"
            r2 = 13622(0x3536, float:1.9088E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x0416:
            r0 = 0
        L_0x0417:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.AudioArgument r1 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.AudioArgument
            r1.<init>(r6, r15, r0)
            return r1
        L_0x041d:
            r3 = r32
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55235kw.f145427j
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r6.mo58887l(r1)
            com.google.protobuf.bf r2 = r6.f169962ag
            com.google.protobuf.bs r4 = r1.f169971d
            java.lang.Object r2 = r2.mo58854l(r4)
            if (r2 != 0) goto L_0x0435
            java.lang.Object r1 = r1.f169969b
            goto L_0x0439
        L_0x0435:
            java.lang.Object r1 = r1.mo58889c(r2)
        L_0x0439:
            com.google.bb.a.kw r1 = (com.google.p4152bb.p4153a.C55235kw) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.google.protobuf.cq r8 = r1.f145434f
            java.util.Iterator r8 = r8.iterator()
        L_0x044b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x06d4
            java.lang.Object r9 = r8.next()
            com.google.bb.a.df r9 = (com.google.p4152bb.p4153a.C55029df) r9
            boolean r10 = r32.mo84326bK()
            if (r10 == 0) goto L_0x0468
            com.google.android.apps.gsa.shared.util.v r10 = r7.f260250F
            boolean r10 = r10.mo85393e()
            if (r10 != 0) goto L_0x0468
            com.google.bb.a.gr r10 = com.google.p4152bb.p4153a.C55122gr.COMPANION
            goto L_0x046a
        L_0x0468:
            com.google.bb.a.gr r10 = com.google.p4152bb.p4153a.C55122gr.PRIMARY
        L_0x046a:
            int r11 = r9.f144773a
            r11 = r11 & r0
            if (r11 == 0) goto L_0x0489
            com.google.bb.a.gs r11 = r9.f144774b
            if (r11 != 0) goto L_0x0475
            com.google.bb.a.gs r11 = com.google.p4152bb.p4153a.C55123gs.f145062c
        L_0x0475:
            com.google.protobuf.cj r12 = new com.google.protobuf.cj
            com.google.protobuf.ch r11 = r11.f145064a
            com.google.protobuf.ci r13 = com.google.p4152bb.p4153a.C55123gs.f145061b
            r12.<init>(r11, r13)
            boolean r10 = r12.contains(r10)
            if (r10 == 0) goto L_0x0485
            goto L_0x0489
        L_0x0485:
            r4.add(r9)
            goto L_0x044b
        L_0x0489:
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55035dl.f144791g
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r9.mo58887l(r10)
            com.google.protobuf.bf r11 = r9.f169962ag
            com.google.protobuf.bs r12 = r10.f169971d
            java.lang.Object r11 = r11.mo58854l(r12)
            if (r11 != 0) goto L_0x049f
            java.lang.Object r10 = r10.f169969b
            goto L_0x04a3
        L_0x049f:
            java.lang.Object r10 = r10.mo58889c(r11)
        L_0x04a3:
            com.google.bb.a.dl r10 = (com.google.p4152bb.p4153a.C55035dl) r10
            int r11 = r10.f144793a
            r11 = r11 & r0
            if (r11 == 0) goto L_0x04bd
            com.google.protobuf.cq r11 = r10.f144796d
            int r11 = r11.size()
            if (r11 == 0) goto L_0x04bd
            com.google.android.apps.gsa.search.core.ak.a.f r11 = r7.f260270v
            com.google.android.apps.gsa.search.core.ak.a.e r10 = r11.mo78340a(r10)
            if (r10 == 0) goto L_0x04bd
            r2.add(r10)
        L_0x04bd:
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55027dd.f144768c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r9.mo58887l(r10)
            com.google.protobuf.bf r11 = r9.f169962ag
            com.google.protobuf.bs r10 = r10.f169971d
            boolean r10 = r11.mo58857o(r10)
            if (r10 == 0) goto L_0x04d7
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument
            r0.<init>((com.google.p4152bb.p4153a.C55213ka) r6, (com.google.p4152bb.p4153a.C55029df) r9)
            goto L_0x083a
        L_0x04d7:
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55056ef.f144846b
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r9.mo58887l(r10)
            com.google.protobuf.bf r11 = r9.f169962ag
            com.google.protobuf.bs r10 = r10.f169971d
            boolean r10 = r11.mo58857o(r10)
            if (r10 == 0) goto L_0x056c
            dagger.a r1 = r7.f260262n
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r1 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r1
            java.lang.Object r10 = r1.f236439a
            monitor-enter(r10)
            com.google.android.apps.gsa.assist.f.b r1 = r1.f236451m     // Catch:{ all -> 0x0569 }
            monitor-exit(r10)     // Catch:{ all -> 0x0569 }
            if (r1 != 0) goto L_0x0513
            com.google.common.f.e r0 = f260243a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "No screenshotManager found"
            r2 = 13627(0x353b, float:1.9095E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.<init>((com.google.p4152bb.p4153a.C55213ka) r6, (java.util.List) r1)
            goto L_0x083a
        L_0x0513:
            com.google.android.apps.gsa.assist.f.a r1 = r1.mo17665a()
            if (r1 != 0) goto L_0x0532
            com.google.common.f.e r0 = f260243a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "No screenshot found"
            r2 = 13626(0x353a, float:1.9094E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.<init>((com.google.p4152bb.p4153a.C55213ka) r6, (java.util.List) r1)
            goto L_0x083a
        L_0x0532:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity r2 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity
            java.lang.String r9 = r1.f32700c
            android.graphics.Bitmap r12 = r1.f32699b
            android.net.Uri r1 = r1.f32698a
            java.lang.String r14 = r1.toString()
            com.google.bb.a.cv[] r1 = new com.google.p4152bb.p4153a.C55018cv[r0]
            com.google.bb.a.cv r3 = com.google.p4152bb.p4153a.C55018cv.CLIENT
            r4 = 0
            r1[r4] = r3
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            java.util.List r18 = java.util.Arrays.asList(r1)
            r19 = 1
            r20 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r1 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity[] r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument.Entity[r0]
            r3 = 0
            r0[r3] = r2
            java.util.ArrayList r0 = com.google.common.p4522b.C58597ky.m90212c(r0)
            r1.<init>((com.google.p4152bb.p4153a.C55213ka) r6, (java.util.List) r0)
            goto L_0x0839
        L_0x0569:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0569 }
            throw r0
        L_0x056c:
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55052eb.f144835d
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r9.mo58887l(r10)
            com.google.protobuf.bf r11 = r9.f169962ag
            com.google.protobuf.bs r10 = r10.f169971d
            boolean r10 = r11.mo58857o(r10)
            if (r10 == 0) goto L_0x05ef
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55052eb.f144835d
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r9.mo58887l(r1)
            com.google.protobuf.bf r2 = r9.f169962ag
            com.google.protobuf.bs r4 = r1.f169971d
            java.lang.Object r2 = r2.mo58854l(r4)
            if (r2 != 0) goto L_0x0595
            java.lang.Object r1 = r1.f169969b
            goto L_0x0599
        L_0x0595:
            java.lang.Object r1 = r1.mo58889c(r2)
        L_0x0599:
            com.google.bb.a.eb r1 = (com.google.p4152bb.p4153a.C55052eb) r1
            long r2 = r3.f252749G
            android.net.Uri r1 = r7.m153472e(r1, r2)
            if (r1 == 0) goto L_0x05d6
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r2 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity[] r3 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument.Entity[r0]
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity r4 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity
            java.lang.String r14 = r1.toString()
            com.google.bb.a.cv[] r0 = new com.google.p4152bb.p4153a.C55018cv[r0]
            com.google.bb.a.cv r1 = com.google.p4152bb.p4153a.C55018cv.CLIENT
            r5 = 0
            r0[r5] = r1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            java.util.List r18 = java.util.Arrays.asList(r0)
            r19 = 1
            r20 = 0
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = 0
            r3[r0] = r4
            java.util.ArrayList r0 = com.google.common.p4522b.C58597ky.m90212c(r3)
            r2.<init>((com.google.p4152bb.p4153a.C55213ka) r6, (java.util.List) r0)
            goto L_0x0813
        L_0x05d6:
            com.google.common.f.e r0 = f260243a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Unable to attach the audio"
            r2 = 13625(0x3539, float:1.9093E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.<init>((com.google.p4152bb.p4153a.C55213ka) r6, (java.util.List) r1)
            goto L_0x083a
        L_0x05ef:
            boolean r10 = r32.mo84326bK()
            if (r10 == 0) goto L_0x044b
            com.google.android.apps.gsa.shared.util.v r10 = r7.f260250F
            boolean r10 = r10.mo85393e()
            if (r10 == 0) goto L_0x044b
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55054ed.f144841c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r9.mo58887l(r10)
            com.google.protobuf.bf r11 = r9.f169962ag
            com.google.protobuf.bs r10 = r10.f169971d
            boolean r10 = r11.mo58857o(r10)
            if (r10 == 0) goto L_0x044b
            com.google.protobuf.bt r10 = com.google.p4152bb.p4153a.C55054ed.f144841c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r9.mo58887l(r10)
            com.google.protobuf.bf r9 = r9.f169962ag
            com.google.protobuf.bs r11 = r10.f169971d
            java.lang.Object r9 = r9.mo58854l(r11)
            if (r9 != 0) goto L_0x0626
            java.lang.Object r9 = r10.f169969b
            goto L_0x062a
        L_0x0626:
            java.lang.Object r9 = r10.mo58889c(r9)
        L_0x062a:
            com.google.bb.a.ed r9 = (com.google.p4152bb.p4153a.C55054ed) r9
            com.google.android.apps.gsa.staticplugins.actions.g.l r10 = r7.f260246B
            java.lang.String r9 = r9.f144843a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = ".*\\b"
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = "\\b.*"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9, r5)
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r12 = "android.intent.action.MAIN"
            r11.<init>(r12)
            java.lang.String r12 = "android.intent.category.LAUNCHER"
            android.content.Intent r11 = r11.addCategory(r12)
            android.content.pm.PackageManager r12 = r10.f260501a
            r13 = 0
            java.util.List r11 = r12.queryIntentActivities(r11, r13)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0664:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x06c3
            java.lang.Object r13 = r11.next()
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13
            android.content.pm.PackageManager r14 = r10.f260501a
            java.lang.CharSequence r14 = r13.loadLabel(r14)
            java.lang.String r14 = r14.toString()
            java.util.regex.Matcher r15 = r9.matcher(r14)
            boolean r15 = r15.matches()
            if (r15 == 0) goto L_0x0664
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity r15 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity
            android.content.pm.ActivityInfo r13 = r13.activityInfo
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r5 = r13.packageName
            r16 = 0
            r0[r16] = r5
            java.lang.String r5 = r13.name
            r13 = 1
            r0[r13] = r5
            java.lang.String r5 = "content://applications/applications/%s/%s"
            java.lang.String r21 = java.lang.String.format(r5, r0)
            com.google.bb.a.cv[] r0 = new com.google.p4152bb.p4153a.C55018cv[r13]
            com.google.bb.a.cv r5 = com.google.p4152bb.p4153a.C55018cv.CLIENT
            r0[r16] = r5
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            java.util.List r25 = java.util.Arrays.asList(r0)
            r26 = 1
            r27 = 0
            r0 = r15
            r16 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r12.add(r0)
            r0 = 1
            r5 = 2
            goto L_0x0664
        L_0x06c3:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x06d0
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument
            r0.<init>((com.google.p4152bb.p4153a.C55213ka) r6, (java.util.List) r12)
            goto L_0x083a
        L_0x06d0:
            r0 = 1
            r5 = 2
            goto L_0x044b
        L_0x06d4:
            com.google.protobuf.bn r0 = r35.toBuilder()
            com.google.bb.a.jz r0 = (com.google.p4152bb.p4153a.C55211jz) r0
            com.google.protobuf.bt r5 = com.google.p4152bb.p4153a.C55235kw.f145427j
            com.google.protobuf.bn r6 = r1.toBuilder()
            com.google.bb.a.kv r6 = (com.google.p4152bb.p4153a.C55234kv) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.bb.a.kw r8 = (com.google.p4152bb.p4153a.C55235kw) r8
            com.google.protobuf.cq r9 = com.google.p4152bb.p4153a.C55235kw.emptyProtobufList()
            r8.f145434f = r9
            r6.mo54211c(r4)
            com.google.protobuf.bv r4 = r6.build()
            com.google.bb.a.kw r4 = (com.google.p4152bb.p4153a.C55235kw) r4
            r0.mo58885m(r5, r4)
            com.google.protobuf.bv r0 = r0.build()
            com.google.bb.a.ka r0 = (com.google.p4152bb.p4153a.C55213ka) r0
            boolean r4 = r1.f145435g
            boolean r3 = r32.mo84326bK()
            if (r3 == 0) goto L_0x070c
            com.google.bb.a.cv r3 = com.google.p4152bb.p4153a.C55018cv.COMPANION
            goto L_0x070e
        L_0x070c:
            com.google.bb.a.cv r3 = com.google.p4152bb.p4153a.C55018cv.CLIENT
        L_0x070e:
            com.google.protobuf.bt r5 = com.google.p4152bb.p4153a.C55235kw.f145427j
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r0.mo58887l(r5)
            com.google.protobuf.bf r6 = r0.f169962ag
            com.google.protobuf.bs r8 = r5.f169971d
            java.lang.Object r6 = r6.mo58854l(r8)
            if (r6 != 0) goto L_0x0724
            java.lang.Object r5 = r5.f169969b
            goto L_0x0728
        L_0x0724:
            java.lang.Object r5 = r5.mo58889c(r6)
        L_0x0728:
            com.google.bb.a.kw r5 = (com.google.p4152bb.p4153a.C55235kw) r5
            com.google.protobuf.cq r5 = r5.f145431c
            int r5 = r5.size()
            int r6 = r2.size()
            r14 = 0
        L_0x0735:
            if (r14 >= r6) goto L_0x07b7
            java.lang.Object r8 = r2.get(r14)
            r15 = r8
            com.google.android.apps.gsa.search.core.ak.a.e r15 = (com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84578e) r15
            boolean r8 = r15.mo78338a()
            if (r8 == 0) goto L_0x07b3
            int r8 = r15.f230174j
            if (r8 < r5) goto L_0x074a
            goto L_0x07b3
        L_0x074a:
            com.google.protobuf.cq r1 = r1.f145431c
            java.lang.Object r1 = r1.get(r8)
            com.google.bb.a.lh r1 = (com.google.p4152bb.p4153a.C55247lh) r1
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity r2 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity
            java.lang.String r9 = r1.f145480b
            java.lang.String r10 = r1.f145481c
            if (r4 == 0) goto L_0x075d
            java.lang.String r5 = r15.f230167c
            goto L_0x075f
        L_0x075d:
            java.lang.String r5 = r1.f145483e
        L_0x075f:
            r11 = r5
            int r5 = r1.f145479a
            r5 = r5 & 64
            if (r5 == 0) goto L_0x0772
            int r1 = r1.f145484f
            int r14 = com.google.p4152bb.p4153a.C55419v.m87685a(r1)
            if (r14 != 0) goto L_0x0770
            r13 = 1
            goto L_0x0773
        L_0x0770:
            r13 = r14
            goto L_0x0773
        L_0x0772:
            r13 = 0
        L_0x0773:
            java.lang.String r14 = r15.f230168d
            java.lang.String r1 = r15.f230169e
            java.lang.String r5 = r15.f230171g
            com.google.bb.a.he r6 = r15.f230172h
            r8 = 2
            com.google.bb.a.cv[] r8 = new com.google.p4152bb.p4153a.C55018cv[r8]
            r12 = 0
            r8[r12] = r3
            com.google.bb.a.cv r3 = com.google.p4152bb.p4153a.C55018cv.SERVER
            r12 = 1
            r8[r12] = r3
            r12 = 0
            java.util.List r18 = java.util.Arrays.asList(r8)
            int r3 = r15.f230173i
            r8 = r2
            r30 = r15
            r15 = r1
            r16 = r5
            r17 = r6
            r19 = r4
            r20 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r1 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument
            r3 = 1
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity[] r3 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument.Entity[r3]
            r4 = 0
            r3[r4] = r2
            java.util.ArrayList r2 = com.google.common.p4522b.C58597ky.m90212c(r3)
            r1.<init>((com.google.p4152bb.p4153a.C55213ka) r0, (java.util.List) r2)
            r8 = r30
            java.lang.String r0 = r8.f230170f
            r1.f236165j = r0
            goto L_0x0839
        L_0x07b3:
            int r14 = r14 + 1
            goto L_0x0735
        L_0x07b7:
            int r4 = r2.size()
            r14 = 0
        L_0x07bc:
            if (r14 >= r4) goto L_0x0815
            java.lang.Object r5 = r2.get(r14)
            com.google.android.apps.gsa.search.core.ak.a.e r5 = (com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84578e) r5
            int r14 = r14 + 1
            boolean r6 = r5.mo78338a()
            if (r6 != 0) goto L_0x07bc
            java.lang.String r1 = r5.f230165a
            if (r1 != 0) goto L_0x07d2
            java.lang.String r1 = ""
        L_0x07d2:
            r9 = r1
            java.lang.String r1 = r5.f230166b
            if (r1 != 0) goto L_0x07d9
            java.lang.String r1 = ""
        L_0x07d9:
            r10 = r1
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity r1 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity
            java.lang.String r11 = r5.f230167c
            java.lang.String r14 = r5.f230168d
            java.lang.String r15 = r5.f230169e
            java.lang.String r2 = r5.f230171g
            com.google.bb.a.he r4 = r5.f230172h
            r6 = 1
            com.google.bb.a.cv[] r8 = new com.google.p4152bb.p4153a.C55018cv[r6]
            r6 = 0
            r8[r6] = r3
            r12 = 0
            r13 = 0
            java.util.List r18 = java.util.Arrays.asList(r8)
            r19 = 1
            int r3 = r5.f230173i
            r8 = r1
            r16 = r2
            r17 = r4
            r20 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r2 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument
            r3 = 1
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity[] r3 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument.Entity[r3]
            r6 = 0
            r3[r6] = r1
            java.util.ArrayList r1 = com.google.common.p4522b.C58597ky.m90212c(r3)
            r2.<init>((com.google.p4152bb.p4153a.C55213ka) r0, (java.util.List) r1)
            java.lang.String r0 = r5.f230170f
            r2.f236165j = r0
        L_0x0813:
            r0 = r2
            goto L_0x083a
        L_0x0815:
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55163ie.f145234e
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r1 = r1.mo58857o(r2)
            if (r1 == 0) goto L_0x0830
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.MediaControlArgument r1 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.MediaControlArgument
            r8 = r36
            r1.<init>((com.google.p4152bb.p4153a.C55213ka) r0, (com.google.android.apps.gsa.search.shared.media.PlaybackStatus) r8)
            goto L_0x0839
        L_0x0830:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r1 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument
            com.google.android.apps.gsa.search.shared.contact.Disambiguation r2 = com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument.m141745i(r0)
            r1.<init>((com.google.p4152bb.p4153a.C55213ka) r0, (com.google.android.apps.gsa.search.shared.contact.Disambiguation) r2)
        L_0x0839:
            r0 = r1
        L_0x083a:
            return r0
        L_0x083b:
            r3 = r32
            r8 = r36
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55261lv.f145536f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r6.mo58887l(r0)
            com.google.protobuf.bf r1 = r6.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x087a
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55261lv.f145536f
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r6.mo58887l(r1)
            com.google.protobuf.bf r2 = r6.f169962ag
            com.google.protobuf.bs r3 = r1.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x086a
            java.lang.Object r1 = r1.f169969b
            goto L_0x086e
        L_0x086a:
            java.lang.Object r1 = r1.mo58889c(r2)
        L_0x086e:
            com.google.bb.a.lv r1 = (com.google.p4152bb.p4153a.C55261lv) r1
            com.google.bb.a.gj r1 = r1.f145539b
            if (r1 != 0) goto L_0x0876
            com.google.bb.a.gj r1 = com.google.p4152bb.p4153a.C55114gj.f145034g
        L_0x0876:
            r0.<init>((com.google.p4152bb.p4153a.C55213ka) r6, (com.google.p4152bb.p4153a.C55114gj) r1)
            return r0
        L_0x087a:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55225km.f145401f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r6.mo58887l(r0)
            com.google.protobuf.bf r1 = r6.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x0893
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.DateArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.DateArgument
            r0.<init>(r6)
            return r0
        L_0x0893:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55297nd.f145671g
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r6.mo58887l(r0)
            com.google.protobuf.bf r1 = r6.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x08ac
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument
            r0.<init>(r6)
            return r0
        L_0x08ac:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55292mz.f145644f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r6.mo58887l(r0)
            com.google.protobuf.bf r1 = r6.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x08c5
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument
            r0.<init>(r6)
            return r0
        L_0x08c5:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55270md.f145578f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r6.mo58887l(r0)
            com.google.protobuf.bf r1 = r6.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x08de
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument
            r0.<init>(r6)
            return r0
        L_0x08de:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55251ll.f145500f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r6.mo58887l(r0)
            com.google.protobuf.bf r1 = r6.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x08f7
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument
            r0.<init>(r6)
            return r0
        L_0x08f7:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55259lt.f145527g
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r6.mo58887l(r0)
            com.google.protobuf.bf r1 = r6.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x0945
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55259lt.f145527g
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r6.mo58887l(r0)
            com.google.protobuf.bf r1 = r6.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r1 = r1.mo58854l(r2)
            if (r1 != 0) goto L_0x0920
            java.lang.Object r0 = r0.f169969b
            goto L_0x0924
        L_0x0920:
            java.lang.Object r0 = r0.mo58889c(r1)
        L_0x0924:
            com.google.bb.a.lt r0 = (com.google.p4152bb.p4153a.C55259lt) r0
            com.google.bb.a.ka r0 = r0.f145531c
            if (r0 != 0) goto L_0x092c
            com.google.bb.a.ka r0 = com.google.p4152bb.p4153a.C55213ka.f145356g
        L_0x092c:
            r5 = r0
            r0 = 0
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r9 = r6
            r6 = r36
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r1 = r1.m153473f(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0944
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.ListArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.ListArgument
            r0.<init>((com.google.p4152bb.p4153a.C55213ka) r9, (com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument) r1)
        L_0x0944:
            return r0
        L_0x0945:
            r9 = r6
            r0 = 0
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55231ks.f145411i
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r9.mo58887l(r1)
            com.google.protobuf.bf r4 = r9.f169962ag
            com.google.protobuf.bs r1 = r1.f169971d
            boolean r1 = r4.mo58857o(r1)
            if (r1 == 0) goto L_0x09b7
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55231ks.f145411i
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r9.mo58887l(r1)
            com.google.protobuf.bf r4 = r9.f169962ag
            com.google.protobuf.bs r5 = r1.f169971d
            java.lang.Object r4 = r4.mo58854l(r5)
            if (r4 != 0) goto L_0x0970
            java.lang.Object r1 = r1.f169969b
            goto L_0x0974
        L_0x0970:
            java.lang.Object r1 = r1.mo58889c(r4)
        L_0x0974:
            com.google.bb.a.ks r1 = (com.google.p4152bb.p4153a.C55231ks) r1
            int r1 = r1.f145414b
            int r13 = com.google.p4152bb.p4153a.C55228kp.m87625a(r1)
            if (r13 != 0) goto L_0x097f
            r13 = 1
        L_0x097f:
            int r13 = r13 + -1
            r1 = 1
            if (r13 == r1) goto L_0x0991
            r1 = 2
            if (r13 == r1) goto L_0x098e
            if (r13 == r2) goto L_0x0991
            r1 = 5
            if (r13 == r1) goto L_0x0991
            r1 = 6
            goto L_0x0991
        L_0x098e:
            java.lang.String r15 = "android.permission.BLUETOOTH_ADMIN"
            goto L_0x0992
        L_0x0991:
            r15 = r0
        L_0x0992:
            if (r15 == 0) goto L_0x09b1
            com.google.android.apps.gsa.shared.util.permissions.d r1 = r7.f260272x
            com.google.android.apps.gsa.shared.util.permissions.a.a r1 = r1.f254356c
            boolean r1 = r1.mo85346a(r15)
            if (r1 != 0) goto L_0x09b1
            com.google.common.f.e r1 = f260243a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Missing permission %s for device setting action, suppressing"
            r4 = 13628(0x353c, float:1.9097E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56389s(r2, r15)
            r1 = 20
            m153478k(r3, r12, r1)
            return r0
        L_0x09b1:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument r0 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument
            r0.<init>(r9)
            return r0
        L_0x09b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r9.f145359b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown argument with id = "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            goto L_0x09ce
        L_0x09cd:
            throw r0
        L_0x09ce:
            goto L_0x09cd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7358d.C93320g.m153473f(com.google.android.apps.gsa.shared.search.Query, com.google.bb.a.x, com.google.bb.a.lz, com.google.bb.a.ka, com.google.android.apps.gsa.search.shared.media.PlaybackStatus):com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument");
    }

    /* renamed from: g */
    private static Query m153474g(Query query) {
        if (!query.mo84420dA()) {
            return Query.f252741b.mo84268aE(query.f252770i, false).mo84265aB().mo84244G(query.mo84403cj());
        }
        long j = query.f252749G;
        C90498f i = query.mo84480i();
        i.mo84562U(1);
        i.mo84572d(0, 512);
        i.mo84547F((Uri) null, 0, false);
        i.mo84549H(Long.valueOf(j));
        return i.mo84568a();
    }

    /* renamed from: h */
    private final void m153475h(Set set, List list, C87448l lVar) {
        C55208jw jwVar;
        Intent a;
        Object obj;
        Object obj2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55240la laVar = (C55240la) it.next();
            C62940bt r1 = C62942bv.checkIsLite(C55206ju.f145304i);
            laVar.mo58887l(r1);
            if (laVar.f169962ag.mo58857o(r1.f169971d)) {
                set.add("android.permission.WRITE_CALENDAR");
            }
            C62940bt r12 = C62942bv.checkIsLite(C55284mr.f145623d);
            laVar.mo58887l(r12);
            if (laVar.f169962ag.mo58857o(r12.f169971d)) {
                set.add("android.permission.READ_SMS");
                set.add("android.permission.SEND_SMS");
            }
            C62940bt r13 = C62942bv.checkIsLite(C55208jw.f145313A);
            laVar.mo58887l(r13);
            if (laVar.f169962ag.mo58857o(r13.f169971d)) {
                C62940bt r14 = C62942bv.checkIsLite(C55208jw.f145313A);
                laVar.mo58887l(r14);
                Object l = laVar.f169962ag.mo58854l(r14.f169971d);
                if (l == null) {
                    obj2 = r14.f169969b;
                } else {
                    obj2 = r14.mo58889c(l);
                }
                jwVar = (C55208jw) obj2;
            } else {
                C62940bt r15 = C62942bv.checkIsLite(C55208jw.f145316z);
                laVar.mo58887l(r15);
                if (laVar.f169962ag.mo58857o(r15.f169971d)) {
                    C62940bt r16 = C62942bv.checkIsLite(C55208jw.f145316z);
                    laVar.mo58887l(r16);
                    Object l2 = laVar.f169962ag.mo58854l(r16.f169971d);
                    if (l2 == null) {
                        obj = r16.f169969b;
                    } else {
                        obj = r16.mo58889c(l2);
                    }
                    jwVar = (C55208jw) obj;
                } else {
                    jwVar = null;
                }
            }
            if (!(jwVar == null || (a = this.f260274z.mo81206a(jwVar, lVar, this.f260245A)) == null)) {
                if (!"android.intent.action.MAIN".equals(a.getAction()) || !TextUtils.isEmpty(a.getPackage())) {
                    for (ResolveInfo resolveInfo : this.f260259k.getPackageManager().queryIntentActivities(a, 65536)) {
                        String str = resolveInfo.activityInfo.permission;
                        if (!TextUtils.isEmpty(str)) {
                            set.add(str);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private static boolean m153476i(C55213ka kaVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C55235kw.f145427j);
        kaVar.mo58887l(r0);
        Object l = kaVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C55177is isVar = ((C55235kw) obj).f145433e;
        if (isVar == null) {
            isVar = C55177is.f145255c;
        }
        int a = C55179iu.m87617a(isVar.f145258b);
        return a != 0 && a == 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (r5.isNotificationPolicyAccessGranted() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f2, code lost:
        return new com.google.android.apps.gsa.search.shared.actions.PuntAction(r11.f260259k.getResources().getString(com.google.android.googlequicksearchbox.R.string.permission_required_message), com.google.android.googlequicksearchbox.R.string.permission_required_continue_button, new android.content.Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"), 0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0486  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.gsa.search.shared.actions.PuntAction m153477j(com.google.android.apps.gsa.shared.search.Query r12, com.google.p4152bb.p4153a.C54946ad r13, com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l r14, boolean r15) {
        /*
            r11 = this;
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r13.mo58887l(r0)
            com.google.protobuf.bf r1 = r13.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            r1 = 4
            r2 = 2132091064(0x7f1520b8, float:1.9822486E38)
            r3 = 0
            if (r0 == 0) goto L_0x00f3
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r13.mo58887l(r0)
            com.google.protobuf.bf r4 = r13.f169962ag
            com.google.protobuf.bs r5 = r0.f169971d
            java.lang.Object r4 = r4.mo58854l(r5)
            if (r4 != 0) goto L_0x002e
            java.lang.Object r0 = r0.f169969b
            goto L_0x0032
        L_0x002e:
            java.lang.Object r0 = r0.mo58889c(r4)
        L_0x0032:
            com.google.bb.a.lz r0 = (com.google.p4152bb.p4153a.C55265lz) r0
            com.google.protobuf.cq r0 = r0.f145559b
            java.util.Iterator r0 = r0.iterator()
        L_0x003a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00f3
            java.lang.Object r4 = r0.next()
            com.google.bb.a.ka r4 = (com.google.p4152bb.p4153a.C55213ka) r4
            com.google.protobuf.bt r5 = com.google.p4152bb.p4153a.C55231ks.f145411i
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r4.mo58887l(r5)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r6 = r5.f169971d
            java.lang.Object r4 = r4.mo58854l(r6)
            if (r4 != 0) goto L_0x005c
            java.lang.Object r4 = r5.f169969b
            goto L_0x0060
        L_0x005c:
            java.lang.Object r4 = r5.mo58889c(r4)
        L_0x0060:
            com.google.bb.a.ks r4 = (com.google.p4152bb.p4153a.C55231ks) r4
            int r5 = r4.f145414b
            int r5 = com.google.p4152bb.p4153a.C55228kp.m87625a(r5)
            if (r5 == 0) goto L_0x003a
            r6 = 7
            if (r5 != r6) goto L_0x003a
            com.google.protobuf.bt r5 = com.google.p4152bb.p4153a.C55309np.f145711c
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r4.mo58887l(r5)
            com.google.protobuf.bf r6 = r4.f169962ag
            com.google.protobuf.bs r7 = r5.f169971d
            java.lang.Object r6 = r6.mo58854l(r7)
            if (r6 != 0) goto L_0x0083
            java.lang.Object r5 = r5.f169969b
            goto L_0x0087
        L_0x0083:
            java.lang.Object r5 = r5.mo58889c(r6)
        L_0x0087:
            com.google.bb.a.np r5 = (com.google.p4152bb.p4153a.C55309np) r5
            if (r5 == 0) goto L_0x003a
            com.google.protobuf.ch r6 = r5.f145713a
            int r6 = r6.size()
            if (r6 == 0) goto L_0x003a
            com.google.protobuf.ch r5 = r5.f145713a
            int r5 = r5.mo58914d(r3)
            int r5 = com.google.p4152bb.p4153a.C55308no.m87664a(r5)
            if (r5 == 0) goto L_0x003a
            r6 = 2
            if (r5 != r6) goto L_0x003a
            android.content.Context r5 = r11.f260259k
            java.lang.String r7 = "notification"
            java.lang.Object r5 = r5.getSystemService(r7)
            android.app.NotificationManager r5 = (android.app.NotificationManager) r5
            int r7 = r5.getCurrentInterruptionFilter()
            r8 = 3
            if (r7 == r8) goto L_0x00d2
            if (r7 == r1) goto L_0x00d2
            if (r7 != r6) goto L_0x00b8
            goto L_0x00d2
        L_0x00b8:
            int r4 = r4.f145416d
            int r4 = com.google.p4152bb.p4153a.C55230kr.m87626a(r4)
            if (r4 == 0) goto L_0x003a
            if (r4 != r6) goto L_0x003a
            android.content.Context r4 = r11.f260259k
            java.lang.String r6 = "vibrator"
            java.lang.Object r4 = r4.getSystemService(r6)
            android.os.Vibrator r4 = (android.os.Vibrator) r4
            boolean r4 = r4.hasVibrator()
            if (r4 != 0) goto L_0x003a
        L_0x00d2:
            boolean r0 = r5.isNotificationPolicyAccessGranted()
            if (r0 == 0) goto L_0x00d9
            goto L_0x00f3
        L_0x00d9:
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r13 = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"
            r12.<init>(r13)
            com.google.android.apps.gsa.search.shared.actions.PuntAction r13 = new com.google.android.apps.gsa.search.shared.actions.PuntAction
            android.content.Context r14 = r11.f260259k
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getString(r2)
            r15 = 2132091063(0x7f1520b7, float:1.9822484E38)
            r13.<init>(r14, r15, r12, r3)
            return r13
        L_0x00f3:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r13.mo58887l(r4)
            com.google.protobuf.bf r5 = r13.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            java.lang.String r5 = "android.permission.READ_CONTACTS"
            if (r4 == 0) goto L_0x01cf
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r13.mo58887l(r4)
            com.google.protobuf.bf r6 = r13.f169962ag
            com.google.protobuf.bs r7 = r4.f169971d
            java.lang.Object r6 = r6.mo58854l(r7)
            if (r6 != 0) goto L_0x0123
            java.lang.Object r4 = r4.f169969b
            goto L_0x0127
        L_0x0123:
            java.lang.Object r4 = r4.mo58889c(r6)
        L_0x0127:
            com.google.bb.a.lz r4 = (com.google.p4152bb.p4153a.C55265lz) r4
            com.google.protobuf.cq r6 = r4.f145559b
            java.util.Iterator r6 = r6.iterator()
        L_0x012f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x017e
            java.lang.Object r7 = r6.next()
            com.google.bb.a.ka r7 = (com.google.p4152bb.p4153a.C55213ka) r7
            com.google.protobuf.bt r8 = com.google.p4152bb.p4153a.C55219kg.f145374e
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r7.mo58887l(r8)
            com.google.protobuf.bf r9 = r7.f169962ag
            com.google.protobuf.bs r8 = r8.f169971d
            boolean r8 = r9.mo58857o(r8)
            if (r8 == 0) goto L_0x012f
            r0.add(r5)
            com.google.protobuf.bt r8 = com.google.p4152bb.p4153a.C55219kg.f145374e
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r7.mo58887l(r8)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r9 = r8.f169971d
            java.lang.Object r7 = r7.mo58854l(r9)
            if (r7 != 0) goto L_0x0167
            java.lang.Object r7 = r8.f169969b
            goto L_0x016b
        L_0x0167:
            java.lang.Object r7 = r8.mo58889c(r7)
        L_0x016b:
            com.google.bb.a.kg r7 = (com.google.p4152bb.p4153a.C55219kg) r7
            com.google.bb.a.fp r7 = r7.f145377b
            if (r7 != 0) goto L_0x0173
            com.google.bb.a.fp r7 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x0173:
            int r7 = r7.f144967a
            r7 = r7 & r1
            if (r7 == 0) goto L_0x012f
            java.lang.String r7 = "android.permission.READ_CALL_LOG"
            r0.add(r7)
            goto L_0x012f
        L_0x017e:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0186
            if (r15 == 0) goto L_0x0231
        L_0x0186:
            com.google.protobuf.cq r15 = r4.f145560c
            java.util.Iterator r15 = r15.iterator()
        L_0x018c:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0231
            java.lang.Object r1 = r15.next()
            com.google.bb.a.nl r1 = (com.google.p4152bb.p4153a.C55305nl) r1
            com.google.protobuf.cq r4 = r1.f145692b
            r11.m153475h(r0, r4, r14)
            com.google.protobuf.cq r4 = r1.f145693c
            r11.m153475h(r0, r4, r14)
            com.google.bb.a.le r4 = r1.f145694d
            if (r4 != 0) goto L_0x01a8
            com.google.bb.a.le r4 = com.google.p4152bb.p4153a.C55244le.f145466h
        L_0x01a8:
            com.google.protobuf.cq r4 = r4.f145470c
            r11.m153475h(r0, r4, r14)
            com.google.bb.a.le r4 = r1.f145695e
            if (r4 != 0) goto L_0x01b3
            com.google.bb.a.le r4 = com.google.p4152bb.p4153a.C55244le.f145466h
        L_0x01b3:
            com.google.protobuf.cq r4 = r4.f145470c
            r11.m153475h(r0, r4, r14)
            com.google.bb.a.le r4 = r1.f145696f
            if (r4 != 0) goto L_0x01be
            com.google.bb.a.le r4 = com.google.p4152bb.p4153a.C55244le.f145466h
        L_0x01be:
            com.google.protobuf.cq r4 = r4.f145470c
            r11.m153475h(r0, r4, r14)
            com.google.bb.a.le r1 = r1.f145697g
            if (r1 != 0) goto L_0x01c9
            com.google.bb.a.le r1 = com.google.p4152bb.p4153a.C55244le.f145466h
        L_0x01c9:
            com.google.protobuf.cq r1 = r1.f145470c
            r11.m153475h(r0, r1, r14)
            goto L_0x018c
        L_0x01cf:
            com.google.protobuf.bt r15 = com.google.p4152bb.p4153a.C54950ah.f144553b
            com.google.protobuf.bt r15 = com.google.protobuf.C62942bv.checkIsLite(r15)
            r13.mo58887l(r15)
            com.google.protobuf.bf r1 = r13.f169962ag
            com.google.protobuf.bs r15 = r15.f169971d
            boolean r15 = r1.mo58857o(r15)
            if (r15 != 0) goto L_0x0231
            com.google.protobuf.bt r15 = com.google.p4152bb.p4153a.C54999cc.f144705d
            com.google.protobuf.bt r15 = com.google.protobuf.C62942bv.checkIsLite(r15)
            r13.mo58887l(r15)
            com.google.protobuf.bf r1 = r13.f169962ag
            com.google.protobuf.bs r15 = r15.f169971d
            boolean r15 = r1.mo58857o(r15)
            if (r15 != 0) goto L_0x0231
            com.google.protobuf.bt r15 = com.google.p4152bb.p4153a.C54992bw.f144693b
            com.google.protobuf.bt r15 = com.google.protobuf.C62942bv.checkIsLite(r15)
            r13.mo58887l(r15)
            com.google.protobuf.bf r1 = r13.f169962ag
            com.google.protobuf.bs r15 = r15.f169971d
            boolean r15 = r1.mo58857o(r15)
            if (r15 != 0) goto L_0x0231
            com.google.protobuf.bt r15 = com.google.p4152bb.p4153a.C54980bk.f144663d
            com.google.protobuf.bt r15 = com.google.protobuf.C62942bv.checkIsLite(r15)
            r13.mo58887l(r15)
            com.google.protobuf.bf r1 = r13.f169962ag
            com.google.protobuf.bs r15 = r15.f169971d
            boolean r15 = r1.mo58857o(r15)
            if (r15 != 0) goto L_0x0231
            com.google.protobuf.bt r15 = com.google.p4152bb.p4153a.C55392qr.f145951h
            com.google.protobuf.bt r15 = com.google.protobuf.C62942bv.checkIsLite(r15)
            r13.mo58887l(r15)
            com.google.protobuf.bf r1 = r13.f169962ag
            com.google.protobuf.bs r15 = r15.f169971d
            boolean r15 = r1.mo58857o(r15)
            if (r15 == 0) goto L_0x0231
            r0.add(r5)
        L_0x0231:
            com.google.protobuf.bt r15 = com.google.p4152bb.p4153a.C55324od.f145746k
            com.google.protobuf.bt r15 = com.google.protobuf.C62942bv.checkIsLite(r15)
            r13.mo58887l(r15)
            com.google.protobuf.bf r1 = r13.f169962ag
            com.google.protobuf.bs r15 = r15.f169971d
            boolean r15 = r1.mo58857o(r15)
            if (r15 == 0) goto L_0x0304
            com.google.protobuf.bt r15 = com.google.p4152bb.p4153a.C55324od.f145746k
            com.google.protobuf.bt r15 = com.google.protobuf.C62942bv.checkIsLite(r15)
            r13.mo58887l(r15)
            com.google.protobuf.bf r1 = r13.f169962ag
            com.google.protobuf.bs r4 = r15.f169971d
            java.lang.Object r1 = r1.mo58854l(r4)
            if (r1 != 0) goto L_0x025a
            java.lang.Object r15 = r15.f169969b
            goto L_0x025e
        L_0x025a:
            java.lang.Object r15 = r15.mo58889c(r1)
        L_0x025e:
            com.google.bb.a.od r15 = (com.google.p4152bb.p4153a.C55324od) r15
            com.google.protobuf.cq r1 = r15.f145751d
            java.util.Iterator r1 = r1.iterator()
        L_0x0266:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02aa
            java.lang.Object r4 = r1.next()
            com.google.bb.a.df r4 = (com.google.p4152bb.p4153a.C55029df) r4
            com.google.protobuf.bt r6 = com.google.p4152bb.p4153a.C55047dx.f144821k
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r4.mo58887l(r6)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r7 = r6.f169971d
            java.lang.Object r4 = r4.mo58854l(r7)
            if (r4 != 0) goto L_0x0288
            java.lang.Object r4 = r6.f169969b
            goto L_0x028c
        L_0x0288:
            java.lang.Object r4 = r6.mo58889c(r4)
        L_0x028c:
            com.google.bb.a.dx r4 = (com.google.p4152bb.p4153a.C55047dx) r4
            com.google.protobuf.bt r6 = com.google.p4152bb.p4153a.C55340ot.f145800f
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r4.mo58887l(r6)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r6 = r6.f169971d
            boolean r4 = r4.mo58857o(r6)
            if (r4 == 0) goto L_0x0266
            java.lang.String r4 = "android.permission.READ_SMS"
            r0.add(r4)
            r0.add(r5)
            goto L_0x0266
        L_0x02aa:
            com.google.protobuf.cq r1 = r15.f145752e
            java.util.Iterator r1 = r1.iterator()
        L_0x02b0:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02c2
            java.lang.Object r4 = r1.next()
            com.google.bb.a.nl r4 = (com.google.p4152bb.p4153a.C55305nl) r4
            com.google.protobuf.cq r4 = r4.f145692b
            r11.m153475h(r0, r4, r14)
            goto L_0x02b0
        L_0x02c2:
            com.google.protobuf.cq r1 = r15.f145753f
            java.util.Iterator r1 = r1.iterator()
        L_0x02c8:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02da
            java.lang.Object r4 = r1.next()
            com.google.bb.a.nl r4 = (com.google.p4152bb.p4153a.C55305nl) r4
            com.google.protobuf.cq r4 = r4.f145692b
            r11.m153475h(r0, r4, r14)
            goto L_0x02c8
        L_0x02da:
            com.google.protobuf.cq r15 = r15.f145749b
            java.util.Iterator r15 = r15.iterator()
        L_0x02e0:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0304
            java.lang.Object r1 = r15.next()
            com.google.bb.a.oj r1 = (com.google.p4152bb.p4153a.C55330oj) r1
            com.google.protobuf.cq r1 = r1.f145774d
            java.util.Iterator r1 = r1.iterator()
        L_0x02f2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02e0
            java.lang.Object r4 = r1.next()
            com.google.bb.a.nl r4 = (com.google.p4152bb.p4153a.C55305nl) r4
            com.google.protobuf.cq r4 = r4.f145692b
            r11.m153475h(r0, r4, r14)
            goto L_0x02f2
        L_0x0304:
            boolean r15 = r0.isEmpty()
            r1 = 0
            if (r15 == 0) goto L_0x030e
        L_0x030b:
            r4 = r1
            goto L_0x0464
        L_0x030e:
            java.util.HashSet r15 = new java.util.HashSet
            r15.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0317:
            boolean r4 = r0.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x037d
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.apps.gsa.shared.util.permissions.d r6 = r11.f260272x
            com.google.android.apps.gsa.shared.util.permissions.a.a r6 = r6.f254356c
            boolean r6 = r6.mo85346a(r4)
            if (r6 != 0) goto L_0x0317
            com.google.android.apps.gsa.shared.util.permissions.d r6 = r11.f260272x
            android.content.Context r7 = r6.f254355b
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.Context r6 = r6.f254355b     // Catch:{ NameNotFoundException -> 0x036e }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ NameNotFoundException -> 0x036e }
            r8 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r6 = r7.getPackageInfo(r6, r8)     // Catch:{ NameNotFoundException -> 0x036e }
            java.lang.String[] r6 = r6.requestedPermissions
            int r8 = r6.length
            r9 = 0
        L_0x0346:
            if (r9 >= r8) goto L_0x0317
            r10 = r6[r9]
            boolean r10 = r10.contains(r4)
            if (r10 == 0) goto L_0x036b
            android.content.pm.PermissionInfo r6 = r7.getPermissionInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x035c }
            int r6 = r6.protectionLevel
            if (r6 != r5) goto L_0x0317
            r15.add(r4)
            goto L_0x0317
        L_0x035c:
            r4 = move-exception
            com.google.common.f.e r5 = com.google.android.apps.gsa.shared.util.permissions.C91077d.f254354a
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r6 = "Permission info not found"
            r7 = 11433(0x2ca9, float:1.6021E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(r7)).mo56386p(r6)
            goto L_0x0317
        L_0x036b:
            int r9 = r9 + 1
            goto L_0x0346
        L_0x036e:
            r4 = move-exception
            com.google.common.f.e r5 = com.google.android.apps.gsa.shared.util.permissions.C91077d.f254354a
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r6 = "PackageInfo not found"
            r7 = 11434(0x2caa, float:1.6022E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(r7)).mo56386p(r6)
            goto L_0x0317
        L_0x037d:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0384
            goto L_0x030b
        L_0x0384:
            int r0 = r13.f144533a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x039f
            com.google.bb.a.af r0 = r13.f144536d
            if (r0 != 0) goto L_0x0390
            com.google.bb.a.af r0 = com.google.p4152bb.p4153a.C54948af.f144541h
        L_0x0390:
            int r0 = r0.f144544b
            com.google.bb.a.x r0 = com.google.p4152bb.p4153a.C55421x.m87686a(r0)
            if (r0 != 0) goto L_0x039a
            com.google.bb.a.x r0 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
        L_0x039a:
            r4 = 17
            m153478k(r12, r0, r4)
        L_0x039f:
            boolean r0 = r15.isEmpty()
            r0 = r0 ^ r5
            com.google.common.base.C58838bb.m90868c(r0)
            android.content.Context r0 = r11.f260259k
            android.content.res.Resources r0 = r0.getResources()
            com.google.android.apps.gsa.shared.util.v r4 = r11.f260250F
            boolean r4 = r4.mo85390b()
            if (r4 == 0) goto L_0x03d3
            java.lang.String r2 = r0.getString(r2)
            com.google.android.apps.gsa.search.shared.actions.PuntAction r4 = new com.google.android.apps.gsa.search.shared.actions.PuntAction
            r4.<init>((java.lang.CharSequence) r2)
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r2 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            r5 = 2132091068(0x7f1520bc, float:1.9822494E38)
            java.lang.String r0 = r0.getString(r5)
            r2.<init>((java.lang.String) r0, (boolean) r3)
            r4.f236021p = r2
            com.google.android.apps.gsa.handsfree.k r0 = r11.f260268t
            r0.c(r15)
            goto L_0x0464
        L_0x03d3:
            boolean r4 = r12.mo84337bV()
            r6 = 335544320(0x14000000, float:6.4623485E-27)
            if (r4 == 0) goto L_0x0424
            com.google.android.apps.gsa.shared.search.Query r4 = com.google.android.apps.gsa.shared.search.Query.f252741b
            java.lang.String r7 = r12.f252770i
            com.google.android.apps.gsa.shared.search.Query r4 = r4.mo84268aE(r7, r3)
            com.google.android.apps.gsa.shared.search.Query r4 = r4.mo84265aB()
            android.content.Context r7 = r11.f260259k
            android.content.Intent r4 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145446d(r7, r4)
            r4.setFlags(r6)
            java.lang.String r2 = r0.getString(r2)
            com.google.android.apps.gsa.search.shared.actions.PuntAction r6 = new com.google.android.apps.gsa.search.shared.actions.PuntAction
            r6.<init>((java.lang.CharSequence) r2)
            boolean r2 = r12.mo84412cs()
            if (r5 == r2) goto L_0x0403
            r2 = 2132091069(0x7f1520bd, float:1.9822496E38)
            goto L_0x0406
        L_0x0403:
            r2 = 2132091070(0x7f1520be, float:1.9822498E38)
        L_0x0406:
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r5 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            java.lang.String r0 = r0.getString(r2)
            r5.<init>((java.lang.String) r0, (boolean) r3)
            r6.f236021p = r5
            boolean r0 = r12.mo84412cs()
            if (r0 == 0) goto L_0x041d
            com.google.android.apps.gsa.handsfree.k r0 = r11.f260268t
            r0.d(r15)
            goto L_0x0422
        L_0x041d:
            com.google.android.apps.gsa.handsfree.k r15 = r11.f260268t
            r15.f(r4)
        L_0x0422:
            r4 = r6
            goto L_0x0464
        L_0x0424:
            boolean r2 = r12.mo84326bK()
            if (r2 == 0) goto L_0x045b
            com.google.android.apps.gsa.shared.util.v r2 = r11.f260250F
            boolean r2 = r2.mo85393e()
            if (r2 != 0) goto L_0x045b
            android.content.Intent r15 = new android.content.Intent
            java.lang.String r2 = "com.google.android.googlequicksearchbox.GOOGLE_SEARCH"
            r15.<init>(r2)
            java.lang.String r2 = "query"
            java.lang.String r4 = r12.f252770i
            r15.putExtra(r2, r4)
            java.lang.String r2 = "com.google.android.googlequicksearchbox"
            r15.setPackage(r2)
            r15.setFlags(r6)
            r2 = 2132091065(0x7f1520b9, float:1.9822488E38)
            java.lang.String r0 = r0.getString(r2)
            com.google.android.apps.gsa.search.shared.actions.PuntAction r4 = new com.google.android.apps.gsa.search.shared.actions.PuntAction
            r4.<init>(r0, r3, r15, r3)
            r15 = 2132085824(0x7f150c40, float:1.9811858E38)
            r4.mo81134N(r15)
            goto L_0x0464
        L_0x045b:
            android.content.Intent r0 = r11.m153471d(r12)
            com.google.android.apps.gsa.search.shared.actions.PermissionPuntAction r4 = new com.google.android.apps.gsa.search.shared.actions.PermissionPuntAction
            r4.<init>(r15, r0)
        L_0x0464:
            boolean r15 = r12.mo84403cj()
            if (r15 == 0) goto L_0x0567
            boolean r12 = r12.mo84337bV()
            if (r12 == 0) goto L_0x0567
            if (r4 != 0) goto L_0x0567
            com.google.bb.a.af r12 = r13.f144536d
            if (r12 != 0) goto L_0x0478
            com.google.bb.a.af r12 = com.google.p4152bb.p4153a.C54948af.f144541h
        L_0x0478:
            int r12 = r12.f144544b
            com.google.bb.a.x r12 = com.google.p4152bb.p4153a.C55421x.m87686a(r12)
            if (r12 != 0) goto L_0x0482
            com.google.bb.a.x r12 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
        L_0x0482:
            com.google.bb.a.x r15 = com.google.p4152bb.p4153a.C55421x.OPT_IN_PUNT
            if (r12 != r15) goto L_0x0567
            com.google.protobuf.bt r12 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bt r12 = com.google.protobuf.C62942bv.checkIsLite(r12)
            r13.mo58887l(r12)
            com.google.protobuf.bf r13 = r13.f169962ag
            com.google.protobuf.bs r15 = r12.f169971d
            java.lang.Object r13 = r13.mo58854l(r15)
            if (r13 != 0) goto L_0x049c
            java.lang.Object r12 = r12.f169969b
            goto L_0x04a0
        L_0x049c:
            java.lang.Object r12 = r12.mo58889c(r13)
        L_0x04a0:
            com.google.bb.a.lz r12 = (com.google.p4152bb.p4153a.C55265lz) r12
            com.google.bb.a.jq r13 = r12.f145564g
            if (r13 != 0) goto L_0x04a8
            com.google.bb.a.jq r13 = com.google.p4152bb.p4153a.C55202jq.f145289f
        L_0x04a8:
            com.google.protobuf.cq r13 = r13.f145292b
            int r13 = r13.size()
            if (r13 != 0) goto L_0x04b3
        L_0x04b0:
            r12 = r1
            goto L_0x054f
        L_0x04b3:
            com.google.bb.a.jq r12 = r12.f145564g
            if (r12 != 0) goto L_0x04b9
            com.google.bb.a.jq r12 = com.google.p4152bb.p4153a.C55202jq.f145289f
        L_0x04b9:
            com.google.protobuf.cq r12 = r12.f145292b
            java.lang.Object r12 = r12.get(r3)
            com.google.bb.a.kc r12 = (com.google.p4152bb.p4153a.C55215kc) r12
            com.google.protobuf.bt r13 = com.google.p4152bb.p4153a.C55286mt.f145630d
            com.google.protobuf.bt r13 = com.google.protobuf.C62942bv.checkIsLite(r13)
            r12.mo58887l(r13)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r15 = r13.f169971d
            java.lang.Object r12 = r12.mo58854l(r15)
            if (r12 != 0) goto L_0x04d7
            java.lang.Object r12 = r13.f169969b
            goto L_0x04db
        L_0x04d7:
            java.lang.Object r12 = r13.mo58889c(r12)
        L_0x04db:
            com.google.bb.a.mt r12 = (com.google.p4152bb.p4153a.C55286mt) r12
            com.google.protobuf.cq r13 = r12.f145632a
            int r13 = r13.size()
            if (r13 != 0) goto L_0x04e6
            goto L_0x04b0
        L_0x04e6:
            com.google.protobuf.cq r12 = r12.f145632a
            java.lang.Object r12 = r12.get(r3)
            com.google.bb.a.pr r12 = (com.google.p4152bb.p4153a.C55365pr) r12
            com.google.protobuf.bt r13 = com.google.p4152bb.p4153a.C55263lx.f145543j
            com.google.protobuf.bt r13 = com.google.protobuf.C62942bv.checkIsLite(r13)
            r12.mo58887l(r13)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r15 = r13.f169971d
            java.lang.Object r12 = r12.mo58854l(r15)
            if (r12 != 0) goto L_0x0504
            java.lang.Object r12 = r13.f169969b
            goto L_0x0508
        L_0x0504:
            java.lang.Object r12 = r13.mo58889c(r12)
        L_0x0508:
            com.google.bb.a.lx r12 = (com.google.p4152bb.p4153a.C55263lx) r12
            com.google.protobuf.cq r13 = r12.f145551f
            int r13 = r13.size()
            if (r13 == 0) goto L_0x04b0
            com.google.protobuf.cq r13 = r12.f145551f
            java.lang.Object r13 = r13.get(r3)
            com.google.bb.a.ln r13 = (com.google.p4152bb.p4153a.C55253ln) r13
            com.google.protobuf.cq r13 = r13.f145510b
            int r13 = r13.size()
            if (r13 != 0) goto L_0x0523
            goto L_0x04b0
        L_0x0523:
            com.google.protobuf.cq r12 = r12.f145551f
            java.lang.Object r12 = r12.get(r3)
            com.google.bb.a.ln r12 = (com.google.p4152bb.p4153a.C55253ln) r12
            com.google.protobuf.cq r12 = r12.f145510b
            java.lang.Object r12 = r12.get(r3)
            com.google.bb.a.la r12 = (com.google.p4152bb.p4153a.C55240la) r12
            com.google.protobuf.bt r13 = com.google.p4152bb.p4153a.C55208jw.f145316z
            com.google.protobuf.bt r13 = com.google.protobuf.C62942bv.checkIsLite(r13)
            r12.mo58887l(r13)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r15 = r13.f169971d
            java.lang.Object r12 = r12.mo58854l(r15)
            if (r12 != 0) goto L_0x0549
            java.lang.Object r12 = r13.f169969b
            goto L_0x054d
        L_0x0549:
            java.lang.Object r12 = r13.mo58889c(r12)
        L_0x054d:
            com.google.bb.a.jw r12 = (com.google.p4152bb.p4153a.C55208jw) r12
        L_0x054f:
            if (r12 == 0) goto L_0x0567
            com.google.android.apps.gsa.search.shared.actions.m r13 = r11.f260274z
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r15 = r11.f260245A
            android.content.Intent r12 = r13.mo81206a(r12, r14, r15)
            if (r12 == 0) goto L_0x0567
            com.google.android.apps.gsa.handsfree.k r13 = r11.f260268t
            r14 = 2132090562(0x7f151ec2, float:1.9821468E38)
            r15 = 2132090561(0x7f151ec1, float:1.9821465E38)
            r13.e(r12, r14, r15)
            return r1
        L_0x0567:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7358d.C93320g.m153477j(com.google.android.apps.gsa.shared.search.Query, com.google.bb.a.ad, com.google.android.apps.gsa.search.shared.actions.modular.arguments.l, boolean):com.google.android.apps.gsa.search.shared.actions.PuntAction");
    }

    /* renamed from: k */
    private static void m153478k(Query query, C55421x xVar, int i) {
        Query query2 = query;
        C89933d dVar = r1;
        C89933d dVar2 = new C89933d(BuildConfig.FLAVOR, query.mo84338bW(), query2.f252751I, true, BuildConfig.FLAVOR, 0, -1, xVar, false, C55998f.UNKNOWN, false, -1, (C55996d) null, query.mo84332bQ(), query2.f252784w, query.mo84403cj());
        C89932c cVar = C89932c.f246391b;
        if (cVar.f246397g) {
            long b = C90719ac.f253778a.mo85084b();
            cVar.f246396f = b;
            C89933d dVar3 = dVar;
            cVar.f246398h = dVar3.f246418p;
            C58177a a = C89932c.m146484a(b, -1);
            int i2 = true != cVar.f246398h ? 2 : 3;
            a.copyOnWrite();
            C58186c cVar2 = (C58186c) a.instance;
            C58186c cVar3 = C58186c.f155565i;
            cVar2.f155573g = i2 - 1;
            cVar2.f155567a |= 512;
            C58187d b2 = cVar.mo83772b(dVar3);
            b2.copyOnWrite();
            C58188e eVar = (C58188e) b2.instance;
            C58188e eVar2 = C58188e.f155576t;
            eVar.f155578a |= C89885b.NOW_VALUE;
            eVar.f155594q = i - 1;
            C58188e eVar3 = (C58188e) b2.build();
            a.copyOnWrite();
            C58186c cVar4 = (C58186c) a.instance;
            eVar3.getClass();
            cVar4.f155568b = eVar3;
            cVar4.f155567a |= 1;
            cVar.mo83773c(a, true);
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: a */
    public final PuntAction mo87634a(Query query, C85661bl blVar, C55282mp mpVar) {
        C7891nu nuVar;
        String str;
        int i;
        int i2;
        TtsRequest ttsRequest;
        int i3;
        int i4;
        int i5;
        String b;
        boolean d = blVar.mo79178d();
        boolean f = blVar.mo79180f();
        boolean bK = query.mo84326bK();
        boolean bV = query.mo84337bV();
        if (f) {
            return null;
        }
        boolean bK2 = query.mo84326bK();
        boolean cs = query.mo84412cs();
        if (bK2) {
            nuVar = C7891nu.CLOCKWORK;
        } else if (cs) {
            nuVar = C7891nu.GEARHEAD;
        } else {
            nuVar = C7891nu.VOICE_SEARCH_COMMUNICATION;
        }
        String str2 = query.f252770i;
        Intent d2 = m153471d(query);
        d2.setFlags(335544320);
        d2.putExtra("disable-opt-in", true);
        C91973ax axVar = new C91973ax(C7891nu.m22887a(nuVar.f27730O));
        Account account = blVar.f231534a;
        if (account != null) {
            axVar.f256469a = account.name;
        }
        ArrayList arrayList = new ArrayList();
        for (C85662bm bmVar : blVar.f231535b.keySet()) {
            C85663bn bnVar = (C85663bn) blVar.f231535b.get(bmVar);
            if ((bnVar.mo79184b() && !bnVar.f231553b && bmVar.f231548j != C7886np.UNKNOWN) || blVar.f231534a == null) {
                arrayList.add(bmVar.f231548j);
            }
        }
        if (!arrayList.isEmpty()) {
            axVar.f256472d = arrayList;
        }
        axVar.f256471c = bK2;
        axVar.f256473e = d2;
        Intent a = axVar.mo86664a();
        Resources resources = this.f260259k.getResources();
        C55281mo a2 = C55281mo.m87651a(mpVar.f145619b);
        if (a2 == null) {
            a2 = C55281mo.UNKNOWN;
        }
        int i6 = 0;
        if (a2 == C55281mo.SIGNED_IN) {
            str = resources.getString(R.string.sign_in_required_message);
            ttsRequest = new TtsRequest(resources.getString(R.string.sign_in_required_tts), false);
            i2 = R.string.sign_in_required_continue_button;
            i = 11129;
        } else {
            String string = resources.getString(R.string.unsupported_action);
            TtsRequest ttsRequest2 = bV ? new TtsRequest(resources.getString(R.string.opt_in_setting_ineligible_tts), false) : null;
            if (!d) {
                for (C85662bm bmVar2 : blVar.mo79177c()) {
                    if (!blVar.mo79175a(bmVar2).mo79184b() && (b = blVar.mo79176b(bmVar2)) != null) {
                        string = b;
                    }
                }
                a = null;
                str = string;
                ttsRequest = ttsRequest2;
                i2 = 0;
                i = 0;
            } else {
                i2 = R.string.opt_in_setting_required_continue_button;
                i = 9855;
                str = string;
                ttsRequest = ttsRequest2;
            }
        }
        C55365pr prVar = mpVar.f145620c;
        if (prVar == null) {
            prVar = C55365pr.f145876l;
        }
        if ((prVar.f145878a & 1) != 0) {
            C55365pr prVar2 = mpVar.f145620c;
            if (prVar2 == null) {
                prVar2 = C55365pr.f145876l;
            }
            C55136he heVar = prVar2.f145879b;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
            str = heVar.f145133b;
        }
        C55365pr prVar3 = mpVar.f145620c;
        if (((prVar3 == null ? C55365pr.f145876l : prVar3).f145878a & 2) != 0) {
            if (prVar3 == null) {
                prVar3 = C55365pr.f145876l;
            }
            C55136he heVar2 = prVar3.f145880c;
            if (heVar2 == null) {
                heVar2 = C55136he.f145130j;
            }
            ttsRequest = new TtsRequest(heVar2.f145133b, true);
        }
        if (bK && !this.f260250F.mo85393e()) {
            PuntAction puntAction = new PuntAction(str, 0, a, 0);
            if (a != null) {
                i6 = R.string.opt_in_clockwork_punt_action_description;
            }
            puntAction.mo81134N(i6);
            return puntAction;
        } else if (bV) {
            PuntAction puntAction2 = new PuntAction((CharSequence) str);
            if (ttsRequest != null) {
                puntAction2.f236021p = ttsRequest;
            }
            if (a != null) {
                C55281mo a3 = C55281mo.m87651a(mpVar.f145619b);
                if (a3 == null) {
                    a3 = C55281mo.UNKNOWN;
                }
                C85662bm b2 = C85662bm.m137513b(a3.f145615j);
                if (b2 != null) {
                    k kVar = this.f260268t;
                    int ordinal = b2.ordinal();
                    if (ordinal == 4) {
                        i3 = C89885b.GWS_RESPONSE_SIZE_EXCEEDED_VALUE;
                        i5 = R.string.opt_in_setting_required_google_now_notification_title;
                        i4 = R.string.opt_in_setting_required_google_now_notification_body;
                    } else if (ordinal != 6) {
                        ((C59052c) ((C59052c) k.a.mo56225c()).mo56372aa(2341)).mo56389s("Unexpected optInSetting value: %s", b2);
                        return puntAction2;
                    } else {
                        i3 = C89885b.GWS_RESPONSE_EMPTY_VALUE;
                        i5 = R.string.opt_in_setting_required_web_history_notification_title;
                        i4 = R.string.opt_in_setting_required_web_history_notification_body;
                    }
                    int i7 = true != kVar.i() ? R.drawable.ic_google_g_medium_light : R.drawable.ic_assistant_light;
                    Context context = kVar.b;
                    k.h(context, k.b(context, a, i5, i4, i7), i3);
                    return puntAction2;
                }
            }
            return puntAction2;
        } else {
            PuntAction puntAction3 = new PuntAction(str, i2, a, i);
            if (ttsRequest == null) {
                return puntAction3;
            }
            puntAction3.f236021p = ttsRequest;
            return puntAction3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: com.google.android.apps.gsa.search.shared.actions.VoiceInteractionAction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.google.bb.a.mp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: com.google.bb.a.mp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: com.google.bb.a.mp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: com.google.android.apps.gsa.search.shared.actions.VoiceInteractionAction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: com.google.android.apps.gsa.search.shared.actions.VoiceAction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: com.google.android.apps.gsa.search.shared.actions.VoiceInteractionAction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: com.google.android.apps.gsa.search.shared.actions.core.VoiceDelightAction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v42, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v8, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v46, resolved type: com.google.android.apps.gsa.search.shared.actions.modular.ModularAction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v9, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v10, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: com.google.bb.a.mp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: com.google.bb.a.mp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: com.google.bb.a.mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v50, resolved type: com.google.bb.a.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v51, resolved type: com.google.android.apps.gsa.search.shared.actions.VoiceInteractionAction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v52, resolved type: com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v53, resolved type: com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction} */
    /* JADX WARNING: type inference failed for: r13v4, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r13v21 */
    /* JADX WARNING: type inference failed for: r1v190, types: [com.google.android.apps.gsa.search.shared.actions.core.ReadNotificationAction] */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x072e, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0291 A[Catch:{ SecurityException -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0294 A[Catch:{ SecurityException -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02a9 A[Catch:{ SecurityException -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02ac A[Catch:{ SecurityException -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02c4 A[Catch:{ SecurityException -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x033e A[Catch:{ SecurityException -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03bc A[Catch:{ SecurityException -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x050c A[Catch:{ SecurityException -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x06a2 A[Catch:{ SecurityException -> 0x06cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x06d1 A[Catch:{ SecurityException -> 0x06cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x088f A[Catch:{ SecurityException -> 0x06cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0895 A[Catch:{ SecurityException -> 0x06cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x08af A[Catch:{ SecurityException -> 0x06cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x098a A[Catch:{ SecurityException -> 0x06cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x0a0d A[Catch:{ SecurityException -> 0x06cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0a11 A[Catch:{ SecurityException -> 0x06cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0a7b  */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x09a6 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo87635b(com.google.p4152bb.p4153a.C54946ad r37, com.google.android.apps.gsa.shared.search.Query r38, com.google.android.apps.gsa.search.shared.media.PlaybackStatus r39) {
        /*
            r36 = this;
            r7 = r36
            r8 = r37
            r6 = r38
            r5 = 16
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SecurityException -> 0x0a63 }
            r4.<init>()     // Catch:{ SecurityException -> 0x0a63 }
            com.google.android.apps.gsa.search.core.ad r1 = r7.f260253e     // Catch:{ SecurityException -> 0x0a63 }
            boolean r1 = r1.mo77971h()     // Catch:{ SecurityException -> 0x0a63 }
            r3 = 3
            r2 = 2
            r15 = 0
            r14 = 1
            r13 = 0
            if (r1 != 0) goto L_0x00d6
            int r1 = r8.f144533a     // Catch:{ SecurityException -> 0x00cf }
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0032
            com.google.bb.a.af r1 = r8.f144536d     // Catch:{ SecurityException -> 0x00cf }
            if (r1 != 0) goto L_0x0025
            com.google.bb.a.af r1 = com.google.p4152bb.p4153a.C54948af.f144541h     // Catch:{ SecurityException -> 0x00cf }
        L_0x0025:
            int r1 = r1.f144544b     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.m87686a(r1)     // Catch:{ SecurityException -> 0x00cf }
            if (r1 != 0) goto L_0x002f
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE     // Catch:{ SecurityException -> 0x00cf }
        L_0x002f:
            m153478k(r6, r1, r5)     // Catch:{ SecurityException -> 0x00cf }
        L_0x0032:
            com.google.android.apps.gsa.search.core.ad r1 = r7.f260253e     // Catch:{ SecurityException -> 0x00cf }
            int r1 = r1.mo77964a()     // Catch:{ SecurityException -> 0x00cf }
            if (r1 == r14) goto L_0x005d
            if (r1 == r2) goto L_0x005d
            if (r1 == r3) goto L_0x0047
            r1 = 2132085486(0x7f150aee, float:1.9811172E38)
            r10 = r13
            r11 = 2132085486(0x7f150aee, float:1.9811172E38)
            r12 = 0
            goto L_0x0072
        L_0x0047:
            int r1 = com.google.android.gms.common.C143699aa.f389596a     // Catch:{ SecurityException -> 0x00cf }
            int r1 = com.google.android.gms.common.C143876h.f389990c     // Catch:{ SecurityException -> 0x00cf }
            android.content.Intent r1 = com.google.android.gms.common.internal.C143896al.m233935c()     // Catch:{ SecurityException -> 0x00cf }
            r10 = 2132086472(0x7f150ec8, float:1.9813172E38)
            r11 = 2132086470(0x7f150ec6, float:1.9813168E38)
            r10 = r1
            r1 = 2132086472(0x7f150ec8, float:1.9813172E38)
            r12 = 2132086471(0x7f150ec7, float:1.981317E38)
            goto L_0x0072
        L_0x005d:
            int r1 = com.google.android.gms.common.C143699aa.f389596a     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.gms.common.h r1 = com.google.android.gms.common.C143876h.f389991d     // Catch:{ SecurityException -> 0x00cf }
            android.content.Intent r1 = r1.mo119363k(r13, r2, r13)     // Catch:{ SecurityException -> 0x00cf }
            r10 = 2132093386(0x7f1529ca, float:1.9827195E38)
            r11 = 2132093384(0x7f1529c8, float:1.9827191E38)
            r12 = 2132093385(0x7f1529c9, float:1.9827193E38)
            r10 = r1
            r1 = 2132093386(0x7f1529ca, float:1.9827195E38)
        L_0x0072:
            com.google.android.apps.gsa.search.shared.actions.PuntAction r3 = new com.google.android.apps.gsa.search.shared.actions.PuntAction     // Catch:{ SecurityException -> 0x00cf }
            r17 = 0
            r21 = 9854(0x267e, float:1.3808E-41)
            com.google.bb.a.x r22 = com.google.p4152bb.p4153a.C55421x.PUNT     // Catch:{ SecurityException -> 0x00cf }
            r16 = r3
            r18 = r1
            r19 = r12
            r20 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ SecurityException -> 0x00cf }
            android.content.Context r9 = r7.f260259k     // Catch:{ SecurityException -> 0x00cf }
            android.content.Intent[] r13 = new android.content.Intent[r14]     // Catch:{ SecurityException -> 0x00cf }
            r13[r15] = r10     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r9 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142015c(r9, r13)     // Catch:{ SecurityException -> 0x00cf }
            r3.f235986b = r9     // Catch:{ SecurityException -> 0x00cf }
            boolean r9 = r38.mo84326bK()     // Catch:{ SecurityException -> 0x00cf }
            if (r9 == 0) goto L_0x00b7
            if (r12 != 0) goto L_0x009d
            r18 = 2132086471(0x7f150ec7, float:1.981317E38)
            goto L_0x009f
        L_0x009d:
            r18 = r12
        L_0x009f:
            com.google.android.apps.gsa.search.shared.actions.PuntAction r3 = new com.google.android.apps.gsa.search.shared.actions.PuntAction     // Catch:{ SecurityException -> 0x00cf }
            r17 = 0
            r19 = 0
            r21 = 9854(0x267e, float:1.3808E-41)
            com.google.bb.a.x r22 = com.google.p4152bb.p4153a.C55421x.PUNT     // Catch:{ SecurityException -> 0x00cf }
            r16 = r3
            r20 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.x r9 = com.google.p4152bb.p4153a.C55421x.UPDATE_GOOGLE_PLAY_SERVICES     // Catch:{ SecurityException -> 0x00cf }
            r3.f236020o = r9     // Catch:{ SecurityException -> 0x00cf }
            r3.mo81134N(r1)     // Catch:{ SecurityException -> 0x00cf }
        L_0x00b7:
            boolean r1 = r38.mo84337bV()     // Catch:{ SecurityException -> 0x00cf }
            if (r1 == 0) goto L_0x00d7
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r1 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest     // Catch:{ SecurityException -> 0x00cf }
            android.content.Context r9 = r7.f260259k     // Catch:{ SecurityException -> 0x00cf }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ SecurityException -> 0x00cf }
            java.lang.String r9 = r9.getString(r11)     // Catch:{ SecurityException -> 0x00cf }
            r1.<init>((java.lang.String) r9, (boolean) r15)     // Catch:{ SecurityException -> 0x00cf }
            r3.f236021p = r1     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x00d7
        L_0x00cf:
            r0 = move-exception
            r1 = r0
            r14 = r6
            r23 = 16
            goto L_0x0a68
        L_0x00d6:
            r3 = 0
        L_0x00d7:
            if (r3 == 0) goto L_0x00dd
            r4.add(r3)     // Catch:{ SecurityException -> 0x00cf }
            return r4
        L_0x00dd:
            com.google.android.apps.gsa.staticplugins.actions.c.d r1 = new com.google.android.apps.gsa.staticplugins.actions.c.d     // Catch:{ SecurityException -> 0x0a63 }
            r1.<init>()     // Catch:{ SecurityException -> 0x0a63 }
            com.google.android.apps.gsa.search.shared.actions.PuntAction r1 = r7.m153477j(r6, r8, r1, r15)     // Catch:{ SecurityException -> 0x0a63 }
            if (r1 == 0) goto L_0x00ec
            r4.add(r1)     // Catch:{ SecurityException -> 0x00cf }
            return r4
        L_0x00ec:
            int r1 = r8.f144533a     // Catch:{ SecurityException -> 0x0a63 }
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0102
            com.google.bb.a.af r1 = r8.f144536d     // Catch:{ SecurityException -> 0x00cf }
            if (r1 != 0) goto L_0x00f7
            com.google.bb.a.af r1 = com.google.p4152bb.p4153a.C54948af.f144541h     // Catch:{ SecurityException -> 0x00cf }
        L_0x00f7:
            int r1 = r1.f144544b     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.m87686a(r1)     // Catch:{ SecurityException -> 0x00cf }
            if (r1 != 0) goto L_0x0104
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x0104
        L_0x0102:
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE     // Catch:{ SecurityException -> 0x0a63 }
        L_0x0104:
            r3 = r1
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C54999cc.f144705d     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x0a63 }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bf r9 = r8.f169962ag     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bs r1 = r1.f169971d     // Catch:{ SecurityException -> 0x0a63 }
            boolean r1 = r9.mo58857o(r1)     // Catch:{ SecurityException -> 0x0a63 }
            java.lang.String r13 = ""
            r12 = 7
            r11 = 17
            if (r1 == 0) goto L_0x0164
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C54999cc.f144705d     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x00cf }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bf r9 = r8.f169962ag     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bs r10 = r1.f169971d     // Catch:{ SecurityException -> 0x00cf }
            java.lang.Object r9 = r9.mo58854l(r10)     // Catch:{ SecurityException -> 0x00cf }
            if (r9 != 0) goto L_0x0133
            java.lang.Object r1 = r1.f169969b     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x0137
        L_0x0133:
            java.lang.Object r1 = r1.mo58889c(r9)     // Catch:{ SecurityException -> 0x00cf }
        L_0x0137:
            com.google.bb.a.cc r1 = (com.google.p4152bb.p4153a.C54999cc) r1     // Catch:{ SecurityException -> 0x00cf }
            m153478k(r6, r3, r11)     // Catch:{ SecurityException -> 0x00cf }
            int r3 = r1.f144707a     // Catch:{ SecurityException -> 0x00cf }
            r3 = r3 & r14
            if (r3 == 0) goto L_0x0156
            com.google.android.apps.gsa.search.shared.actions.PuntAction r3 = new com.google.android.apps.gsa.search.shared.actions.PuntAction     // Catch:{ SecurityException -> 0x00cf }
            java.lang.String r1 = r1.f144708b     // Catch:{ SecurityException -> 0x00cf }
            r3.<init>((java.lang.CharSequence) r1)     // Catch:{ SecurityException -> 0x00cf }
        L_0x0148:
            r34 = r4
            r14 = r6
            r35 = r13
            r22 = 2
            r23 = 16
            r33 = 0
            r13 = r3
            goto L_0x06a0
        L_0x0156:
            com.google.common.f.e r1 = f260243a     // Catch:{ SecurityException -> 0x00cf }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ SecurityException -> 0x00cf }
            java.lang.String r3 = "Unsupported action without explanation"
            r9 = 13611(0x352b, float:1.9073E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r9)).mo56386p(r3)     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x0180
        L_0x0164:
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C54992bw.f144693b     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x0a63 }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bf r9 = r8.f169962ag     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bs r1 = r1.f169971d     // Catch:{ SecurityException -> 0x0a63 }
            boolean r1 = r9.mo58857o(r1)     // Catch:{ SecurityException -> 0x0a63 }
            r10 = 18
            if (r1 == 0) goto L_0x0211
            com.google.android.apps.gsa.handsfree.h r1 = r7.f260263o     // Catch:{ SecurityException -> 0x00cf }
            if (r1 != 0) goto L_0x018e
            m153478k(r6, r3, r10)     // Catch:{ SecurityException -> 0x00cf }
        L_0x0180:
            r34 = r4
            r14 = r6
            r35 = r13
            r13 = 0
            r22 = 2
            r23 = 16
            r33 = 0
            goto L_0x06a0
        L_0x018e:
            com.google.android.apps.gsa.handsfree.MessageBuffer r9 = r1.b     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.handsfree.MessageSender r1 = r1.m     // Catch:{ SecurityException -> 0x00cf }
            java.util.List r1 = r9.b(r1)     // Catch:{ SecurityException -> 0x00cf }
            if (r1 == 0) goto L_0x020c
            boolean r9 = r1.isEmpty()     // Catch:{ SecurityException -> 0x00cf }
            if (r9 != 0) goto L_0x020c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SecurityException -> 0x00cf }
            r3.<init>()     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.handsfree.a r9 = r7.f260267s     // Catch:{ SecurityException -> 0x00cf }
            java.lang.String r10 = "read-message"
            com.google.android.apps.gsa.shared.m.b.f r11 = r9.a     // Catch:{ SecurityException -> 0x00cf }
            int r11 = r11.mo83853P(r10)     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.libraries.f.a r5 = r9.b     // Catch:{ SecurityException -> 0x00cf }
            long r14 = r5.mo26870b()     // Catch:{ SecurityException -> 0x00cf }
            if (r11 > r12) goto L_0x01bb
            int r11 = r11 + r2
            com.google.android.apps.gsa.shared.m.b.f r5 = r9.a     // Catch:{ SecurityException -> 0x00cf }
            r5.mo83899as(r10, r11)     // Catch:{ SecurityException -> 0x00cf }
        L_0x01bb:
            com.google.android.apps.gsa.shared.m.b.f r5 = r9.a     // Catch:{ SecurityException -> 0x00cf }
            r5.mo83898ar(r10, r14)     // Catch:{ SecurityException -> 0x00cf }
            android.content.Context r5 = r7.f260259k     // Catch:{ SecurityException -> 0x00cf }
            r9 = 2132086421(0x7f150e95, float:1.9813069E38)
            java.lang.String r5 = r5.getString(r9)     // Catch:{ SecurityException -> 0x00cf }
            r3.add(r5)     // Catch:{ SecurityException -> 0x00cf }
            r3.addAll(r1)     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.handsfree.a r1 = r7.f260267s     // Catch:{ SecurityException -> 0x00cf }
            java.lang.String r5 = "reply"
            boolean r1 = r1.a(r5)     // Catch:{ SecurityException -> 0x00cf }
            if (r1 == 0) goto L_0x01f2
            android.content.Context r1 = r7.f260259k     // Catch:{ SecurityException -> 0x00cf }
            r5 = 1
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ SecurityException -> 0x00cf }
            r5 = 2132086420(0x7f150e94, float:1.9813067E38)
            java.lang.String r5 = r1.getString(r5)     // Catch:{ SecurityException -> 0x00cf }
            r15 = 0
            r9[r15] = r5     // Catch:{ SecurityException -> 0x00cf }
            r5 = 2132086422(0x7f150e96, float:1.981307E38)
            java.lang.String r1 = r1.getString(r5, r9)     // Catch:{ SecurityException -> 0x00cf }
            r3.add(r1)     // Catch:{ SecurityException -> 0x00cf }
        L_0x01f2:
            com.google.android.apps.gsa.handsfree.h r1 = r7.f260263o     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.handsfree.MessageSender r5 = r1.m     // Catch:{ SecurityException -> 0x00cf }
            r1.c(r5)     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.search.shared.actions.core.ReadNotificationAction r1 = new com.google.android.apps.gsa.search.shared.actions.core.ReadNotificationAction     // Catch:{ SecurityException -> 0x00cf }
            r1.<init>((java.util.List) r3)     // Catch:{ SecurityException -> 0x00cf }
            r34 = r4
            r14 = r6
            r35 = r13
            r22 = 2
            r23 = 16
            r33 = 0
        L_0x0209:
            r13 = r1
            goto L_0x06a0
        L_0x020c:
            m153478k(r6, r3, r10)     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x0180
        L_0x0211:
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C54980bk.f144663d     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x0a63 }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bf r5 = r8.f169962ag     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bs r1 = r1.f169971d     // Catch:{ SecurityException -> 0x0a63 }
            boolean r1 = r5.mo58857o(r1)     // Catch:{ SecurityException -> 0x0a63 }
            if (r1 == 0) goto L_0x0257
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C54980bk.f144663d     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x00cf }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bf r3 = r8.f169962ag     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bs r5 = r1.f169971d     // Catch:{ SecurityException -> 0x00cf }
            java.lang.Object r3 = r3.mo58854l(r5)     // Catch:{ SecurityException -> 0x00cf }
            if (r3 != 0) goto L_0x023a
            java.lang.Object r1 = r1.f169969b     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x023e
        L_0x023a:
            java.lang.Object r1 = r1.mo58889c(r3)     // Catch:{ SecurityException -> 0x00cf }
        L_0x023e:
            com.google.bb.a.bk r1 = (com.google.p4152bb.p4153a.C54980bk) r1     // Catch:{ SecurityException -> 0x00cf }
            if (r1 != 0) goto L_0x0244
            goto L_0x0180
        L_0x0244:
            com.google.android.apps.gsa.search.shared.actions.core.NarrativeNewsAction r3 = new com.google.android.apps.gsa.search.shared.actions.core.NarrativeNewsAction     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.z r5 = r1.f144665a     // Catch:{ SecurityException -> 0x00cf }
            byte[] r5 = r5.mo59174N()     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.pr r1 = r1.f144666b     // Catch:{ SecurityException -> 0x00cf }
            if (r1 != 0) goto L_0x0252
            com.google.bb.a.pr r1 = com.google.p4152bb.p4153a.C55365pr.f145876l     // Catch:{ SecurityException -> 0x00cf }
        L_0x0252:
            r3.<init>(r5, r1)     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x0148
        L_0x0257:
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55392qr.f145951h     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x0a63 }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bf r5 = r8.f169962ag     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bs r1 = r1.f169971d     // Catch:{ SecurityException -> 0x0a63 }
            boolean r1 = r5.mo58857o(r1)     // Catch:{ SecurityException -> 0x0a63 }
            if (r1 == 0) goto L_0x0527
            int r1 = r8.f144533a     // Catch:{ SecurityException -> 0x00cf }
            r5 = 16
            r1 = r1 & r5
            if (r1 == 0) goto L_0x027d
            com.google.bb.a.af r1 = r8.f144536d     // Catch:{ SecurityException -> 0x00cf }
            if (r1 != 0) goto L_0x0277
            com.google.bb.a.af r1 = com.google.p4152bb.p4153a.C54948af.f144541h     // Catch:{ SecurityException -> 0x00cf }
        L_0x0277:
            boolean r1 = r1.f144547e     // Catch:{ SecurityException -> 0x00cf }
            if (r1 == 0) goto L_0x027d
            r1 = 1
            goto L_0x027e
        L_0x027d:
            r1 = 0
        L_0x027e:
            com.google.protobuf.bt r9 = com.google.p4152bb.p4153a.C55392qr.f145951h     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r9)     // Catch:{ SecurityException -> 0x00cf }
            r8.mo58887l(r9)     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bf r11 = r8.f169962ag     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bs r14 = r9.f169971d     // Catch:{ SecurityException -> 0x00cf }
            java.lang.Object r11 = r11.mo58854l(r14)     // Catch:{ SecurityException -> 0x00cf }
            if (r11 != 0) goto L_0x0294
            java.lang.Object r9 = r9.f169969b     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x0298
        L_0x0294:
            java.lang.Object r9 = r9.mo58889c(r11)     // Catch:{ SecurityException -> 0x00cf }
        L_0x0298:
            com.google.bb.a.qr r9 = (com.google.p4152bb.p4153a.C55392qr) r9     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bn r9 = r9.toBuilder()     // Catch:{ SecurityException -> 0x00cf }
            r14 = r9
            com.google.bb.a.qq r14 = (com.google.p4152bb.p4153a.C55391qq) r14     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r9 = r14.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.qr r9 = (com.google.p4152bb.p4153a.C55392qr) r9     // Catch:{ SecurityException -> 0x00cf }
            boolean r11 = r9.f145956d     // Catch:{ SecurityException -> 0x00cf }
            if (r11 == 0) goto L_0x02ac
            r27 = 1
            goto L_0x02bc
        L_0x02ac:
            boolean r11 = r9.f145957e     // Catch:{ SecurityException -> 0x00cf }
            if (r11 == 0) goto L_0x02b3
            r27 = 2
            goto L_0x02bc
        L_0x02b3:
            boolean r11 = r9.f145958f     // Catch:{ SecurityException -> 0x00cf }
            if (r11 == 0) goto L_0x02ba
            r27 = 3
            goto L_0x02bc
        L_0x02ba:
            r27 = 0
        L_0x02bc:
            int r11 = r9.f145953a     // Catch:{ SecurityException -> 0x00cf }
            r17 = 1
            r11 = r11 & 1
            if (r11 == 0) goto L_0x033e
            com.google.bb.a.fp r9 = r9.f145955c     // Catch:{ SecurityException -> 0x00cf }
            if (r9 != 0) goto L_0x02ca
            com.google.bb.a.fp r9 = com.google.p4152bb.p4153a.C55093fp.f144965l     // Catch:{ SecurityException -> 0x00cf }
        L_0x02ca:
            com.google.protobuf.bn r9 = r9.toBuilder()     // Catch:{ SecurityException -> 0x00cf }
            r25 = r9
            com.google.bb.a.fm r25 = (com.google.p4152bb.p4153a.C55090fm) r25     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.libraries.f.a r11 = r7.f260251c     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.search.shared.contact.b r9 = r7.f260252d     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.search.core.ce r5 = r7.f260254f     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.search.core.bt r15 = r7.f260255g     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.contacts.bg r2 = r7.f260256h     // Catch:{ SecurityException -> 0x00cf }
            r39 = r14
            com.google.android.apps.gsa.contacts.v r14 = r7.f260257i     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.search.shared.contact.c r10 = com.google.android.apps.gsa.search.shared.contact.C87515c.PERSON     // Catch:{ SecurityException -> 0x00cf }
            r20 = r14
            com.google.common.b.qy r14 = new com.google.common.b.qy     // Catch:{ SecurityException -> 0x00cf }
            r14.<init>(r10)     // Catch:{ SecurityException -> 0x00cf }
            dagger.a r10 = r7.f260262n     // Catch:{ SecurityException -> 0x00cf }
            r21 = r14
            com.google.common.base.ax r14 = r7.f260249E     // Catch:{ SecurityException -> 0x00cf }
            r22 = 0
            r26 = 0
            r28 = 0
            r29 = 1
            r30 = r9
            r9 = r38
            r31 = r10
            r10 = r11
            r11 = r30
            r12 = r5
            r5 = r13
            r33 = 0
            r13 = r22
            r30 = r39
            r23 = r14
            r17 = r20
            r19 = r21
            r14 = r26
            r16 = r2
            r18 = r19
            r19 = r28
            r20 = r25
            r21 = r31
            r22 = r29
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r13 = com.google.android.apps.gsa.b.a.a.b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SecurityException -> 0x00cf }
            r30.copyOnWrite()     // Catch:{ SecurityException -> 0x00cf }
            r2 = r30
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.qr r9 = (com.google.p4152bb.p4153a.C55392qr) r9     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r10 = r25.build()     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.fp r10 = (com.google.p4152bb.p4153a.C55093fp) r10     // Catch:{ SecurityException -> 0x00cf }
            r10.getClass()     // Catch:{ SecurityException -> 0x00cf }
            r9.f145955c = r10     // Catch:{ SecurityException -> 0x00cf }
            int r10 = r9.f145953a     // Catch:{ SecurityException -> 0x00cf }
            r11 = 1
            r10 = r10 | r11
            r9.f145953a = r10     // Catch:{ SecurityException -> 0x00cf }
            r26 = r13
            r12 = 0
            goto L_0x0384
        L_0x033e:
            r5 = r13
            r2 = r14
            r11 = 1
            r33 = 0
            com.google.protobuf.cq r9 = r9.f145954b     // Catch:{ SecurityException -> 0x00cf }
            int r9 = r9.size()     // Catch:{ SecurityException -> 0x00cf }
            if (r9 <= 0) goto L_0x0381
            com.google.android.apps.gsa.contacts.bg r9 = r7.f260256h     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r10 = r2.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.qr r10 = (com.google.p4152bb.p4153a.C55392qr) r10     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.cq r10 = r10.f145954b     // Catch:{ SecurityException -> 0x00cf }
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)     // Catch:{ SecurityException -> 0x00cf }
            java.util.List r9 = r9.l(r6, r10)     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r13 = new com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r10 = r2.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.qr r10 = (com.google.p4152bb.p4153a.C55392qr) r10     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.cq r10 = r10.f145954b     // Catch:{ SecurityException -> 0x00cf }
            r12 = 0
            java.lang.Object r10 = r10.get(r12)     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.z r10 = (com.google.p4152bb.p4153a.C55423z) r10     // Catch:{ SecurityException -> 0x00cf }
            int r14 = r10.f146233a     // Catch:{ SecurityException -> 0x00cf }
            r14 = r14 & r11
            if (r14 == 0) goto L_0x0372
            java.lang.String r10 = r10.f146234b     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x0374
        L_0x0372:
            java.lang.String r10 = r10.f146238f     // Catch:{ SecurityException -> 0x00cf }
        L_0x0374:
            com.google.android.apps.gsa.search.shared.contact.c r14 = com.google.android.apps.gsa.search.shared.contact.C87515c.PERSON     // Catch:{ SecurityException -> 0x00cf }
            com.google.common.b.qy r15 = new com.google.common.b.qy     // Catch:{ SecurityException -> 0x00cf }
            r15.<init>(r14)     // Catch:{ SecurityException -> 0x00cf }
            r13.<init>(r10, r5, r9, r15)     // Catch:{ SecurityException -> 0x00cf }
            r26 = r13
            goto L_0x0384
        L_0x0381:
            r12 = 0
            r26 = r33
        L_0x0384:
            if (r1 != 0) goto L_0x03a2
            boolean r1 = r38.mo84403cj()     // Catch:{ SecurityException -> 0x00cf }
            if (r1 != 0) goto L_0x03a2
            if (r26 == 0) goto L_0x0394
            boolean r1 = r26.mo81541i()     // Catch:{ SecurityException -> 0x00cf }
            if (r1 == 0) goto L_0x03a2
        L_0x0394:
            r9 = 18
            m153478k(r6, r3, r9)     // Catch:{ SecurityException -> 0x00cf }
            r34 = r4
            r35 = r5
            r14 = r6
            r13 = r33
            goto L_0x0567
        L_0x03a2:
            com.google.protobuf.bv r1 = r2.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.qr r1 = (com.google.p4152bb.p4153a.C55392qr) r1     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.cq r1 = r1.f145954b     // Catch:{ SecurityException -> 0x00cf }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ SecurityException -> 0x00cf }
            com.google.common.b.gp r3 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ SecurityException -> 0x00cf }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ SecurityException -> 0x00cf }
            r13 = r33
        L_0x03b6:
            boolean r9 = r1.hasNext()     // Catch:{ SecurityException -> 0x00cf }
            if (r9 == 0) goto L_0x04dc
            java.lang.Object r9 = r1.next()     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.z r9 = (com.google.p4152bb.p4153a.C55423z) r9     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.z r10 = com.google.p4152bb.p4153a.C55423z.f146231g     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.y r10 = (com.google.p4152bb.p4153a.C55422y) r10     // Catch:{ SecurityException -> 0x00cf }
            r15 = 0
        L_0x03cb:
            com.google.protobuf.cq r14 = r9.f146235c     // Catch:{ SecurityException -> 0x00cf }
            int r14 = r14.size()     // Catch:{ SecurityException -> 0x00cf }
            if (r15 >= r14) goto L_0x040c
            com.google.protobuf.cq r14 = r9.f146235c     // Catch:{ SecurityException -> 0x00cf }
            java.lang.Object r14 = r14.get(r15)     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.al r14 = (com.google.p4152bb.p4153a.C54954al) r14     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bn r14 = r14.toBuilder()     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.ak r14 = (com.google.p4152bb.p4153a.C54953ak) r14     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r12 = r14.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.al r12 = (com.google.p4152bb.p4153a.C54954al) r12     // Catch:{ SecurityException -> 0x00cf }
            int r11 = r12.f144566a     // Catch:{ SecurityException -> 0x00cf }
            r16 = 2
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0407
            if (r13 != 0) goto L_0x03f1
            java.lang.String r13 = r12.f144568c     // Catch:{ SecurityException -> 0x00cf }
        L_0x03f1:
            r14.copyOnWrite()     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r11 = r14.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.al r11 = (com.google.p4152bb.p4153a.C54954al) r11     // Catch:{ SecurityException -> 0x00cf }
            int r12 = r11.f144566a     // Catch:{ SecurityException -> 0x00cf }
            r12 = r12 & -3
            r11.f144566a = r12     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.al r12 = com.google.p4152bb.p4153a.C54954al.f144564d     // Catch:{ SecurityException -> 0x00cf }
            java.lang.String r12 = r12.f144568c     // Catch:{ SecurityException -> 0x00cf }
            r11.f144568c = r12     // Catch:{ SecurityException -> 0x00cf }
            r10.mo54257a(r14)     // Catch:{ SecurityException -> 0x00cf }
        L_0x0407:
            int r15 = r15 + 1
            r11 = 1
            r12 = 0
            goto L_0x03cb
        L_0x040c:
            r15 = 0
        L_0x040d:
            com.google.protobuf.cq r11 = r9.f146236d     // Catch:{ SecurityException -> 0x00cf }
            int r11 = r11.size()     // Catch:{ SecurityException -> 0x00cf }
            if (r15 >= r11) goto L_0x046c
            com.google.protobuf.cq r11 = r9.f146236d     // Catch:{ SecurityException -> 0x00cf }
            java.lang.Object r11 = r11.get(r15)     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.aj r11 = (com.google.p4152bb.p4153a.C54952aj) r11     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bn r11 = r11.toBuilder()     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.ai r11 = (com.google.p4152bb.p4153a.C54951ai) r11     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.aj r12 = (com.google.p4152bb.p4153a.C54952aj) r12     // Catch:{ SecurityException -> 0x00cf }
            int r14 = r12.f144562a     // Catch:{ SecurityException -> 0x00cf }
            r16 = 2
            r14 = r14 & 2
            if (r14 == 0) goto L_0x0469
            if (r13 != 0) goto L_0x0433
            java.lang.String r13 = r12.f144563b     // Catch:{ SecurityException -> 0x00cf }
        L_0x0433:
            r11.copyOnWrite()     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.aj r12 = (com.google.p4152bb.p4153a.C54952aj) r12     // Catch:{ SecurityException -> 0x00cf }
            int r14 = r12.f144562a     // Catch:{ SecurityException -> 0x00cf }
            r14 = r14 & -3
            r12.f144562a = r14     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.aj r14 = com.google.p4152bb.p4153a.C54952aj.f144560c     // Catch:{ SecurityException -> 0x00cf }
            java.lang.String r14 = r14.f144563b     // Catch:{ SecurityException -> 0x00cf }
            r12.f144563b = r14     // Catch:{ SecurityException -> 0x00cf }
            r10.copyOnWrite()     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.z r12 = (com.google.p4152bb.p4153a.C55423z) r12     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r11 = r11.build()     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.aj r11 = (com.google.p4152bb.p4153a.C54952aj) r11     // Catch:{ SecurityException -> 0x00cf }
            r11.getClass()     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.cq r14 = r12.f146236d     // Catch:{ SecurityException -> 0x00cf }
            boolean r17 = r14.mo58948c()     // Catch:{ SecurityException -> 0x00cf }
            if (r17 != 0) goto L_0x0464
            com.google.protobuf.cq r14 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r14)     // Catch:{ SecurityException -> 0x00cf }
            r12.f146236d = r14     // Catch:{ SecurityException -> 0x00cf }
        L_0x0464:
            com.google.protobuf.cq r12 = r12.f146236d     // Catch:{ SecurityException -> 0x00cf }
            r12.add(r11)     // Catch:{ SecurityException -> 0x00cf }
        L_0x0469:
            int r15 = r15 + 1
            goto L_0x040d
        L_0x046c:
            r16 = 2
            r15 = 0
        L_0x046f:
            com.google.protobuf.cq r11 = r9.f146237e     // Catch:{ SecurityException -> 0x00cf }
            int r11 = r11.size()     // Catch:{ SecurityException -> 0x00cf }
            if (r15 >= r11) goto L_0x04cf
            com.google.protobuf.cq r11 = r9.f146237e     // Catch:{ SecurityException -> 0x00cf }
            java.lang.Object r11 = r11.get(r15)     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.an r11 = (com.google.p4152bb.p4153a.C54956an) r11     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bn r11 = r11.toBuilder()     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.am r11 = (com.google.p4152bb.p4153a.C54955am) r11     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.an r12 = (com.google.p4152bb.p4153a.C54956an) r12     // Catch:{ SecurityException -> 0x00cf }
            int r14 = r12.f144571a     // Catch:{ SecurityException -> 0x00cf }
            r17 = 1
            r14 = r14 & 1
            if (r14 == 0) goto L_0x04cc
            if (r13 != 0) goto L_0x0496
            java.lang.String r12 = r12.f144572b     // Catch:{ SecurityException -> 0x00cf }
            r13 = r12
        L_0x0496:
            r11.copyOnWrite()     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.an r12 = (com.google.p4152bb.p4153a.C54956an) r12     // Catch:{ SecurityException -> 0x00cf }
            int r14 = r12.f144571a     // Catch:{ SecurityException -> 0x00cf }
            r14 = r14 & -2
            r12.f144571a = r14     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.an r14 = com.google.p4152bb.p4153a.C54956an.f144569c     // Catch:{ SecurityException -> 0x00cf }
            java.lang.String r14 = r14.f144572b     // Catch:{ SecurityException -> 0x00cf }
            r12.f144572b = r14     // Catch:{ SecurityException -> 0x00cf }
            r10.copyOnWrite()     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.z r12 = (com.google.p4152bb.p4153a.C55423z) r12     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r11 = r11.build()     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.an r11 = (com.google.p4152bb.p4153a.C54956an) r11     // Catch:{ SecurityException -> 0x00cf }
            r11.getClass()     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.cq r14 = r12.f146237e     // Catch:{ SecurityException -> 0x00cf }
            boolean r17 = r14.mo58948c()     // Catch:{ SecurityException -> 0x00cf }
            if (r17 != 0) goto L_0x04c7
            com.google.protobuf.cq r14 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r14)     // Catch:{ SecurityException -> 0x00cf }
            r12.f146237e = r14     // Catch:{ SecurityException -> 0x00cf }
        L_0x04c7:
            com.google.protobuf.cq r12 = r12.f146237e     // Catch:{ SecurityException -> 0x00cf }
            r12.add(r11)     // Catch:{ SecurityException -> 0x00cf }
        L_0x04cc:
            int r15 = r15 + 1
            goto L_0x046f
        L_0x04cf:
            com.google.protobuf.bv r9 = r10.build()     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.z r9 = (com.google.p4152bb.p4153a.C55423z) r9     // Catch:{ SecurityException -> 0x00cf }
            r3.mo55395g(r9)     // Catch:{ SecurityException -> 0x00cf }
            r11 = 1
            r12 = 0
            goto L_0x03b6
        L_0x04dc:
            r16 = 2
            com.google.common.b.gu r1 = r3.mo55394f()     // Catch:{ SecurityException -> 0x00cf }
            android.util.Pair r1 = android.util.Pair.create(r13, r1)     // Catch:{ SecurityException -> 0x00cf }
            java.lang.Object r3 = r1.first     // Catch:{ SecurityException -> 0x00cf }
            r28 = r3
            java.lang.String r28 = (java.lang.String) r28     // Catch:{ SecurityException -> 0x00cf }
            r2.copyOnWrite()     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.qr r3 = (com.google.p4152bb.p4153a.C55392qr) r3     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.cq r9 = com.google.p4152bb.p4153a.C55392qr.emptyProtobufList()     // Catch:{ SecurityException -> 0x00cf }
            r3.f145954b = r9     // Catch:{ SecurityException -> 0x00cf }
            java.lang.Object r1 = r1.second     // Catch:{ SecurityException -> 0x00cf }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ SecurityException -> 0x00cf }
            r2.copyOnWrite()     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bv r2 = r2.instance     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.qr r2 = (com.google.p4152bb.p4153a.C55392qr) r2     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.cq r3 = r2.f145954b     // Catch:{ SecurityException -> 0x00cf }
            boolean r9 = r3.mo58948c()     // Catch:{ SecurityException -> 0x00cf }
            if (r9 != 0) goto L_0x0512
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)     // Catch:{ SecurityException -> 0x00cf }
            r2.f145954b = r3     // Catch:{ SecurityException -> 0x00cf }
        L_0x0512:
            com.google.protobuf.cq r2 = r2.f145954b     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r2)     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction r13 = new com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction     // Catch:{ SecurityException -> 0x00cf }
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r25 = r13
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x0562
        L_0x0527:
            r5 = r13
            r9 = 18
            r16 = 2
            r33 = 0
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55400qz.f145968g     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x0a63 }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bf r2 = r8.f169962ag     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bs r1 = r1.f169971d     // Catch:{ SecurityException -> 0x0a63 }
            boolean r1 = r2.mo58857o(r1)     // Catch:{ SecurityException -> 0x0a63 }
            if (r1 == 0) goto L_0x056d
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55400qz.f145968g     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x00cf }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bf r2 = r8.f169962ag     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bs r3 = r1.f169971d     // Catch:{ SecurityException -> 0x00cf }
            java.lang.Object r2 = r2.mo58854l(r3)     // Catch:{ SecurityException -> 0x00cf }
            if (r2 != 0) goto L_0x0557
            java.lang.Object r1 = r1.f169969b     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x055b
        L_0x0557:
            java.lang.Object r1 = r1.mo58889c(r2)     // Catch:{ SecurityException -> 0x00cf }
        L_0x055b:
            com.google.bb.a.qz r1 = (com.google.p4152bb.p4153a.C55400qz) r1     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.search.shared.actions.core.VoiceDelightAction r13 = new com.google.android.apps.gsa.search.shared.actions.core.VoiceDelightAction     // Catch:{ SecurityException -> 0x00cf }
            r13.<init>((com.google.p4152bb.p4153a.C55400qz) r1)     // Catch:{ SecurityException -> 0x00cf }
        L_0x0562:
            r34 = r4
            r35 = r5
            r14 = r6
        L_0x0567:
            r22 = 2
            r23 = 16
            goto L_0x06a0
        L_0x056d:
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55324od.f145746k     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x0a63 }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bf r2 = r8.f169962ag     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bs r1 = r1.f169971d     // Catch:{ SecurityException -> 0x0a63 }
            boolean r1 = r2.mo58857o(r1)     // Catch:{ SecurityException -> 0x0a63 }
            if (r1 == 0) goto L_0x05ab
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55324od.f145746k     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x00cf }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bf r2 = r8.f169962ag     // Catch:{ SecurityException -> 0x00cf }
            com.google.protobuf.bs r9 = r1.f169971d     // Catch:{ SecurityException -> 0x00cf }
            java.lang.Object r2 = r2.mo58854l(r9)     // Catch:{ SecurityException -> 0x00cf }
            if (r2 != 0) goto L_0x0596
            java.lang.Object r1 = r1.f169969b     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x059a
        L_0x0596:
            java.lang.Object r1 = r1.mo58889c(r2)     // Catch:{ SecurityException -> 0x00cf }
        L_0x059a:
            com.google.bb.a.od r1 = (com.google.p4152bb.p4153a.C55324od) r1     // Catch:{ SecurityException -> 0x00cf }
            com.google.bb.a.bg r2 = r8.f144537e     // Catch:{ SecurityException -> 0x00cf }
            if (r2 != 0) goto L_0x05a2
            com.google.bb.a.bg r2 = com.google.p4152bb.p4153a.C54976bg.f144641o     // Catch:{ SecurityException -> 0x00cf }
        L_0x05a2:
            boolean r2 = r2.f144646d     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.a r9 = r7.f260269u     // Catch:{ SecurityException -> 0x00cf }
            com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer r13 = r9.mo87667a(r1, r6, r2, r3)     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x0562
        L_0x05ab:
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55265lz.f145556m     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x0a63 }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bf r2 = r8.f169962ag     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bs r1 = r1.f169971d     // Catch:{ SecurityException -> 0x0a63 }
            boolean r1 = r2.mo58857o(r1)     // Catch:{ SecurityException -> 0x0a63 }
            if (r1 == 0) goto L_0x068a
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55265lz.f145556m     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x0a63 }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bf r2 = r8.f169962ag     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.bs r10 = r1.f169971d     // Catch:{ SecurityException -> 0x0a63 }
            java.lang.Object r2 = r2.mo58854l(r10)     // Catch:{ SecurityException -> 0x0a63 }
            if (r2 != 0) goto L_0x05d4
            java.lang.Object r1 = r1.f169969b     // Catch:{ SecurityException -> 0x00cf }
            goto L_0x05d8
        L_0x05d4:
            java.lang.Object r1 = r1.mo58889c(r2)     // Catch:{ SecurityException -> 0x0a63 }
        L_0x05d8:
            r10 = r1
            com.google.bb.a.lz r10 = (com.google.p4152bb.p4153a.C55265lz) r10     // Catch:{ SecurityException -> 0x0a63 }
            boolean r11 = r8.f144534b     // Catch:{ SecurityException -> 0x0a63 }
            com.google.bb.a.bg r1 = r8.f144537e     // Catch:{ SecurityException -> 0x0a63 }
            if (r1 != 0) goto L_0x05e3
            com.google.bb.a.bg r1 = com.google.p4152bb.p4153a.C54976bg.f144641o     // Catch:{ SecurityException -> 0x00cf }
        L_0x05e3:
            r12 = r1
            int r1 = r3.f146230cP     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.cq r1 = r10.f145559b     // Catch:{ SecurityException -> 0x0a63 }
            int r1 = r1.size()     // Catch:{ SecurityException -> 0x0a63 }
            java.util.ArrayList r13 = com.google.common.p4522b.C58597ky.m90213d(r1)     // Catch:{ SecurityException -> 0x0a63 }
            com.google.protobuf.cq r1 = r10.f145559b     // Catch:{ SecurityException -> 0x0a63 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ SecurityException -> 0x0a63 }
        L_0x05f6:
            boolean r1 = r14.hasNext()     // Catch:{ SecurityException -> 0x0a63 }
            if (r1 == 0) goto L_0x0662
            java.lang.Object r1 = r14.next()     // Catch:{ SecurityException -> 0x0a63 }
            r15 = r1
            com.google.bb.a.ka r15 = (com.google.p4152bb.p4153a.C55213ka) r15     // Catch:{ SecurityException -> 0x0a63 }
            r1 = r36
            r22 = 2
            r2 = r38
            r19 = r3
            r34 = r4
            r4 = r10
            r35 = r5
            r23 = 16
            r5 = r15
            r16 = r14
            r14 = r6
            r6 = r39
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r1 = r1.m153473f(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0647 }
            if (r1 != 0) goto L_0x0620
            goto L_0x069e
        L_0x0620:
            if (r11 != 0) goto L_0x0635
            boolean r2 = r1.mo81291z()     // Catch:{ IllegalArgumentException -> 0x0647 }
            if (r2 == 0) goto L_0x0635
            boolean r2 = m153476i(r15)     // Catch:{ IllegalArgumentException -> 0x0647 }
            if (r2 != 0) goto L_0x0635
            r2 = r19
            m153478k(r14, r2, r9)     // Catch:{ IllegalArgumentException -> 0x0645 }
            goto L_0x069e
        L_0x0635:
            r2 = r19
            r13.add(r1)     // Catch:{ IllegalArgumentException -> 0x0645 }
        L_0x063a:
            r3 = r2
            r6 = r14
            r14 = r16
            r4 = r34
            r5 = r35
            r16 = 2
            goto L_0x05f6
        L_0x0645:
            r0 = move-exception
            goto L_0x064a
        L_0x0647:
            r0 = move-exception
            r2 = r19
        L_0x064a:
            r29 = r0
            com.google.common.f.e r1 = f260243a     // Catch:{ SecurityException -> 0x06cc }
            com.google.common.f.x r24 = r1.mo56226d()     // Catch:{ SecurityException -> 0x06cc }
            java.lang.String r25 = "processModularAction (%s) exception %s"
            java.lang.String r26 = r2.name()     // Catch:{ SecurityException -> 0x06cc }
            java.lang.String r27 = r29.getMessage()     // Catch:{ SecurityException -> 0x06cc }
            r28 = 13620(0x3534, float:1.9086E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r24).mo56382g(r29)).mo56372aa(r28)).mo56354G(r25, r26, r27)     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x063a
        L_0x0662:
            r2 = r3
            r34 = r4
            r35 = r5
            r14 = r6
            r22 = 2
            r23 = 16
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r1 = new com.google.android.apps.gsa.search.shared.actions.modular.ModularAction     // Catch:{ SecurityException -> 0x06cc }
            if (r12 == 0) goto L_0x0677
            boolean r3 = r12.f144656n     // Catch:{ SecurityException -> 0x06cc }
            if (r3 == 0) goto L_0x0677
            r20 = 1
            goto L_0x0679
        L_0x0677:
            r20 = 0
        L_0x0679:
            com.google.android.apps.gsa.shared.s.a.a r3 = r7.f260248D     // Catch:{ SecurityException -> 0x06cc }
            r16 = r1
            r17 = r10
            r18 = r13
            r19 = r2
            r21 = r3
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x0209
        L_0x068a:
            r2 = r3
            r34 = r4
            r35 = r5
            r14 = r6
            r22 = 2
            r23 = 16
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.THIRD_PARTY_VOICE_INTERACTION_API     // Catch:{ SecurityException -> 0x06cc }
            if (r2 != r1) goto L_0x069e
            com.google.android.apps.gsa.search.shared.actions.VoiceInteractionAction r13 = new com.google.android.apps.gsa.search.shared.actions.VoiceInteractionAction     // Catch:{ SecurityException -> 0x06cc }
            r13.<init>((com.google.p4152bb.p4153a.C54946ad) r8)     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x06a0
        L_0x069e:
            r13 = r33
        L_0x06a0:
            if (r13 == 0) goto L_0x06cf
            int r1 = r8.f144533a     // Catch:{ SecurityException -> 0x06cc }
            r1 = r1 & 32
            if (r1 == 0) goto L_0x06ba
            com.google.bb.a.bg r1 = r8.f144537e     // Catch:{ SecurityException -> 0x06cc }
            if (r1 != 0) goto L_0x06ae
            com.google.bb.a.bg r1 = com.google.p4152bb.p4153a.C54976bg.f144641o     // Catch:{ SecurityException -> 0x06cc }
        L_0x06ae:
            boolean r1 = r1.f144648f     // Catch:{ SecurityException -> 0x06cc }
            if (r1 == 0) goto L_0x06ba
            r13.mo81055E()     // Catch:{ SecurityException -> 0x06cc }
            com.google.android.apps.gsa.search.core.bt r1 = r7.f260255g     // Catch:{ SecurityException -> 0x06cc }
            r1.mo79201d(r13)     // Catch:{ SecurityException -> 0x06cc }
        L_0x06ba:
            java.lang.String r1 = r8.f144539g     // Catch:{ SecurityException -> 0x06cc }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ SecurityException -> 0x06cc }
            if (r2 == 0) goto L_0x06c8
            java.lang.String r1 = r14.f252770i     // Catch:{ SecurityException -> 0x06cc }
            r13.mo81075n(r1)     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x06cf
        L_0x06c8:
            r13.mo81075n(r1)     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x06cf
        L_0x06cc:
            r0 = move-exception
            goto L_0x0a67
        L_0x06cf:
            if (r13 == 0) goto L_0x08af
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55265lz.f145556m     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x06cc }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bf r2 = r8.f169962ag     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bs r3 = r1.f169971d     // Catch:{ SecurityException -> 0x06cc }
            java.lang.Object r2 = r2.mo58854l(r3)     // Catch:{ SecurityException -> 0x06cc }
            if (r2 != 0) goto L_0x06e7
            java.lang.Object r1 = r1.f169969b     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x06eb
        L_0x06e7:
            java.lang.Object r1 = r1.mo58889c(r2)     // Catch:{ SecurityException -> 0x06cc }
        L_0x06eb:
            com.google.bb.a.lz r1 = (com.google.p4152bb.p4153a.C55265lz) r1     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.cq r2 = r1.f145567j     // Catch:{ SecurityException -> 0x06cc }
            int r2 = r2.size()     // Catch:{ SecurityException -> 0x06cc }
            if (r2 <= 0) goto L_0x06f8
            com.google.protobuf.cq r1 = r1.f145567j     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x0716
        L_0x06f8:
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55324od.f145746k     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x06cc }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bf r2 = r8.f169962ag     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bs r3 = r1.f169971d     // Catch:{ SecurityException -> 0x06cc }
            java.lang.Object r2 = r2.mo58854l(r3)     // Catch:{ SecurityException -> 0x06cc }
            if (r2 != 0) goto L_0x070e
            java.lang.Object r1 = r1.f169969b     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x0712
        L_0x070e:
            java.lang.Object r1 = r1.mo58889c(r2)     // Catch:{ SecurityException -> 0x06cc }
        L_0x0712:
            com.google.bb.a.od r1 = (com.google.p4152bb.p4153a.C55324od) r1     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.cq r1 = r1.f145756i     // Catch:{ SecurityException -> 0x06cc }
        L_0x0716:
            boolean r2 = r1.isEmpty()     // Catch:{ SecurityException -> 0x06cc }
            if (r2 == 0) goto L_0x0720
        L_0x071c:
            r1 = r33
            goto L_0x088d
        L_0x0720:
            int r2 = r1.size()     // Catch:{ SecurityException -> 0x06cc }
            java.util.ArrayList r2 = com.google.common.p4522b.C58597ky.m90213d(r2)     // Catch:{ SecurityException -> 0x06cc }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ SecurityException -> 0x06cc }
            r4 = r33
        L_0x072e:
            boolean r5 = r3.hasNext()     // Catch:{ SecurityException -> 0x06cc }
            if (r5 == 0) goto L_0x07e4
            java.lang.Object r5 = r3.next()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mp r5 = (com.google.p4152bb.p4153a.C55282mp) r5     // Catch:{ SecurityException -> 0x06cc }
            int r6 = r5.f145619b     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mo r6 = com.google.p4152bb.p4153a.C55281mo.m87651a(r6)     // Catch:{ SecurityException -> 0x06cc }
            if (r6 != 0) goto L_0x0744
            com.google.bb.a.mo r6 = com.google.p4152bb.p4153a.C55281mo.UNKNOWN     // Catch:{ SecurityException -> 0x06cc }
        L_0x0744:
            int r9 = r6.f145615j     // Catch:{ SecurityException -> 0x06cc }
            com.google.android.apps.gsa.search.core.bm r9 = com.google.android.apps.gsa.search.core.C85662bm.m137513b(r9)     // Catch:{ SecurityException -> 0x06cc }
            if (r9 == 0) goto L_0x074f
            r2.add(r9)     // Catch:{ SecurityException -> 0x06cc }
        L_0x074f:
            com.google.bb.a.mo r9 = com.google.p4152bb.p4153a.C55281mo.SIGNED_IN     // Catch:{ SecurityException -> 0x06cc }
            if (r6 != r9) goto L_0x075a
            com.google.protobuf.bn r4 = r5.toBuilder()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mm r4 = (com.google.p4152bb.p4153a.C55279mm) r4     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x072e
        L_0x075a:
            if (r4 != 0) goto L_0x072e
            com.google.common.b.ij r5 = f260244b     // Catch:{ SecurityException -> 0x06cc }
            boolean r5 = r5.contains(r6)     // Catch:{ SecurityException -> 0x06cc }
            if (r5 == 0) goto L_0x072e
            com.google.bb.a.mp r4 = com.google.p4152bb.p4153a.C55282mp.f145616d     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mm r4 = (com.google.p4152bb.p4153a.C55279mm) r4     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mo r5 = com.google.p4152bb.p4153a.C55281mo.SIGNED_IN     // Catch:{ SecurityException -> 0x06cc }
            r4.copyOnWrite()     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bv r9 = r4.instance     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mp r9 = (com.google.p4152bb.p4153a.C55282mp) r9     // Catch:{ SecurityException -> 0x06cc }
            int r5 = r5.f145615j     // Catch:{ SecurityException -> 0x06cc }
            r9.f145619b = r5     // Catch:{ SecurityException -> 0x06cc }
            int r5 = r9.f145618a     // Catch:{ SecurityException -> 0x06cc }
            r10 = 1
            r5 = r5 | r10
            r9.f145618a = r5     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mo r5 = com.google.p4152bb.p4153a.C55281mo.GOOGLE_NOW     // Catch:{ SecurityException -> 0x06cc }
            if (r6 != r5) goto L_0x072e
            com.google.bb.a.pr r5 = com.google.p4152bb.p4153a.C55365pr.f145876l     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.po r5 = (com.google.p4152bb.p4153a.C55362po) r5     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.he r6 = com.google.p4152bb.p4153a.C55136he.f145130j     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.hd r6 = (com.google.p4152bb.p4153a.C55135hd) r6     // Catch:{ SecurityException -> 0x06cc }
            android.content.Context r9 = r7.f260259k     // Catch:{ SecurityException -> 0x06cc }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ SecurityException -> 0x06cc }
            r10 = 2132092393(0x7f1525e9, float:1.9825181E38)
            java.lang.String r9 = r9.getString(r10)     // Catch:{ SecurityException -> 0x06cc }
            r6.copyOnWrite()     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.he r10 = (com.google.p4152bb.p4153a.C55136he) r10     // Catch:{ SecurityException -> 0x06cc }
            r9.getClass()     // Catch:{ SecurityException -> 0x06cc }
            int r11 = r10.f145132a     // Catch:{ SecurityException -> 0x06cc }
            r12 = 1
            r11 = r11 | r12
            r10.f145132a = r11     // Catch:{ SecurityException -> 0x06cc }
            r10.f145133b = r9     // Catch:{ SecurityException -> 0x06cc }
            r5.copyOnWrite()     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bv r9 = r5.instance     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.pr r9 = (com.google.p4152bb.p4153a.C55365pr) r9     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.he r6 = (com.google.p4152bb.p4153a.C55136he) r6     // Catch:{ SecurityException -> 0x06cc }
            r6.getClass()     // Catch:{ SecurityException -> 0x06cc }
            r9.f145879b = r6     // Catch:{ SecurityException -> 0x06cc }
            int r6 = r9.f145878a     // Catch:{ SecurityException -> 0x06cc }
            r10 = 1
            r6 = r6 | r10
            r9.f145878a = r6     // Catch:{ SecurityException -> 0x06cc }
            r4.copyOnWrite()     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mp r6 = (com.google.p4152bb.p4153a.C55282mp) r6     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.pr r5 = (com.google.p4152bb.p4153a.C55365pr) r5     // Catch:{ SecurityException -> 0x06cc }
            r5.getClass()     // Catch:{ SecurityException -> 0x06cc }
            r6.f145620c = r5     // Catch:{ SecurityException -> 0x06cc }
            int r5 = r6.f145618a     // Catch:{ SecurityException -> 0x06cc }
            r5 = r5 | 2
            r6.f145618a = r5     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x072e
        L_0x07e4:
            com.google.android.apps.gsa.search.core.bo r3 = r7.f260266r     // Catch:{ SecurityException -> 0x06cc }
            int r5 = r2.size()     // Catch:{ SecurityException -> 0x06cc }
            com.google.android.apps.gsa.search.core.bm[] r5 = new com.google.android.apps.gsa.search.core.C85662bm[r5]     // Catch:{ SecurityException -> 0x06cc }
            java.lang.Object[] r2 = r2.toArray(r5)     // Catch:{ SecurityException -> 0x06cc }
            com.google.android.apps.gsa.search.core.bm[] r2 = (com.google.android.apps.gsa.search.core.C85662bm[]) r2     // Catch:{ SecurityException -> 0x06cc }
            com.google.android.apps.gsa.search.core.bl r2 = r3.mo79190b(r2)     // Catch:{ SecurityException -> 0x06cc }
            if (r4 == 0) goto L_0x0806
            boolean r3 = r2.mo79179e()     // Catch:{ SecurityException -> 0x06cc }
            if (r3 != 0) goto L_0x0806
            com.google.protobuf.bv r1 = r4.build()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mp r1 = (com.google.p4152bb.p4153a.C55282mp) r1     // Catch:{ SecurityException -> 0x06cc }
            r3 = r1
            goto L_0x086a
        L_0x0806:
            boolean r3 = r2.mo79178d()     // Catch:{ SecurityException -> 0x06cc }
            if (r3 != 0) goto L_0x0839
            java.util.Iterator r1 = r1.iterator()     // Catch:{ SecurityException -> 0x06cc }
        L_0x0810:
            boolean r3 = r1.hasNext()     // Catch:{ SecurityException -> 0x06cc }
            if (r3 == 0) goto L_0x0868
            java.lang.Object r3 = r1.next()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mp r3 = (com.google.p4152bb.p4153a.C55282mp) r3     // Catch:{ SecurityException -> 0x06cc }
            int r4 = r3.f145619b     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mo r4 = com.google.p4152bb.p4153a.C55281mo.m87651a(r4)     // Catch:{ SecurityException -> 0x06cc }
            if (r4 != 0) goto L_0x0826
            com.google.bb.a.mo r4 = com.google.p4152bb.p4153a.C55281mo.UNKNOWN     // Catch:{ SecurityException -> 0x06cc }
        L_0x0826:
            int r4 = r4.f145615j     // Catch:{ SecurityException -> 0x06cc }
            com.google.android.apps.gsa.search.core.bm r4 = com.google.android.apps.gsa.search.core.C85662bm.m137513b(r4)     // Catch:{ SecurityException -> 0x06cc }
            if (r4 == 0) goto L_0x0810
            com.google.android.apps.gsa.search.core.bn r4 = r2.mo79175a(r4)     // Catch:{ SecurityException -> 0x06cc }
            boolean r4 = r4.mo79184b()     // Catch:{ SecurityException -> 0x06cc }
            if (r4 != 0) goto L_0x0810
            goto L_0x086a
        L_0x0839:
            boolean r3 = r2.mo79180f()     // Catch:{ SecurityException -> 0x06cc }
            if (r3 != 0) goto L_0x0868
            java.util.Iterator r1 = r1.iterator()     // Catch:{ SecurityException -> 0x06cc }
        L_0x0843:
            boolean r3 = r1.hasNext()     // Catch:{ SecurityException -> 0x06cc }
            if (r3 == 0) goto L_0x0868
            java.lang.Object r3 = r1.next()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mp r3 = (com.google.p4152bb.p4153a.C55282mp) r3     // Catch:{ SecurityException -> 0x06cc }
            int r4 = r3.f145619b     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.mo r4 = com.google.p4152bb.p4153a.C55281mo.m87651a(r4)     // Catch:{ SecurityException -> 0x06cc }
            if (r4 != 0) goto L_0x0859
            com.google.bb.a.mo r4 = com.google.p4152bb.p4153a.C55281mo.UNKNOWN     // Catch:{ SecurityException -> 0x06cc }
        L_0x0859:
            int r4 = r4.f145615j     // Catch:{ SecurityException -> 0x06cc }
            com.google.android.apps.gsa.search.core.bm r4 = com.google.android.apps.gsa.search.core.C85662bm.m137513b(r4)     // Catch:{ SecurityException -> 0x06cc }
            if (r4 == 0) goto L_0x0843
            boolean r4 = r2.mo79181g(r4)     // Catch:{ SecurityException -> 0x06cc }
            if (r4 != 0) goto L_0x0843
            goto L_0x086a
        L_0x0868:
            r3 = r33
        L_0x086a:
            if (r3 != 0) goto L_0x086e
            goto L_0x071c
        L_0x086e:
            int r1 = r8.f144533a     // Catch:{ SecurityException -> 0x06cc }
            r1 = r1 & 16
            if (r1 == 0) goto L_0x0889
            com.google.bb.a.af r1 = r8.f144536d     // Catch:{ SecurityException -> 0x06cc }
            if (r1 != 0) goto L_0x087a
            com.google.bb.a.af r1 = com.google.p4152bb.p4153a.C54948af.f144541h     // Catch:{ SecurityException -> 0x06cc }
        L_0x087a:
            int r1 = r1.f144544b     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.m87686a(r1)     // Catch:{ SecurityException -> 0x06cc }
            if (r1 != 0) goto L_0x0884
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE     // Catch:{ SecurityException -> 0x06cc }
        L_0x0884:
            r4 = 17
            m153478k(r14, r1, r4)     // Catch:{ SecurityException -> 0x06cc }
        L_0x0889:
            com.google.android.apps.gsa.search.shared.actions.PuntAction r1 = r7.mo87634a(r14, r2, r3)     // Catch:{ SecurityException -> 0x06cc }
        L_0x088d:
            if (r1 == 0) goto L_0x0895
            r2 = r34
            r2.add(r1)     // Catch:{ SecurityException -> 0x06cc }
            return r2
        L_0x0895:
            r2 = r34
            boolean r1 = r13.mo81082u()     // Catch:{ SecurityException -> 0x06cc }
            if (r1 == 0) goto L_0x08ab
            r1 = r13
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r1 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r1     // Catch:{ SecurityException -> 0x06cc }
            r3 = 1
            com.google.android.apps.gsa.search.shared.actions.PuntAction r1 = r7.m153477j(r14, r8, r1, r3)     // Catch:{ SecurityException -> 0x06cc }
            if (r1 == 0) goto L_0x08ab
            r2.add(r1)     // Catch:{ SecurityException -> 0x06cc }
            return r2
        L_0x08ab:
            r2.add(r13)     // Catch:{ SecurityException -> 0x06cc }
            return r2
        L_0x08af:
            r2 = r34
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C54974be.f144633g     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x06cc }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bf r3 = r8.f169962ag     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bs r1 = r1.f169971d     // Catch:{ SecurityException -> 0x06cc }
            boolean r1 = r3.mo58857o(r1)     // Catch:{ SecurityException -> 0x06cc }
            if (r1 == 0) goto L_0x08e2
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C54974be.f144633g     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ SecurityException -> 0x06cc }
            r8.mo58887l(r1)     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bf r3 = r8.f169962ag     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.bs r4 = r1.f169971d     // Catch:{ SecurityException -> 0x06cc }
            java.lang.Object r3 = r3.mo58854l(r4)     // Catch:{ SecurityException -> 0x06cc }
            if (r3 != 0) goto L_0x08da
            java.lang.Object r1 = r1.f169969b     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x08de
        L_0x08da:
            java.lang.Object r1 = r1.mo58889c(r3)     // Catch:{ SecurityException -> 0x06cc }
        L_0x08de:
            r13 = r1
            com.google.bb.a.be r13 = (com.google.p4152bb.p4153a.C54974be) r13     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x08e4
        L_0x08e2:
            r13 = r33
        L_0x08e4:
            if (r13 == 0) goto L_0x0a09
            boolean r1 = r7.f260260l     // Catch:{ SecurityException -> 0x06cc }
            if (r1 != 0) goto L_0x08ec
            goto L_0x0a09
        L_0x08ec:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SecurityException -> 0x06cc }
            r1.<init>()     // Catch:{ SecurityException -> 0x06cc }
            com.google.android.apps.gsa.contacts.example.d r3 = r7.f260264p     // Catch:{ SecurityException -> 0x06cc }
            com.google.android.apps.gsa.shared.util.v r4 = r7.f260250F     // Catch:{ SecurityException -> 0x06cc }
            int r5 = r7.f260265q     // Catch:{ SecurityException -> 0x06cc }
            boolean r6 = r13.f144639e     // Catch:{ SecurityException -> 0x06cc }
            if (r6 == 0) goto L_0x08fd
            r6 = 2
            goto L_0x0904
        L_0x08fd:
            boolean r6 = r13.f144638d     // Catch:{ SecurityException -> 0x06cc }
            if (r6 == 0) goto L_0x0903
            r6 = 1
            goto L_0x0904
        L_0x0903:
            r6 = 3
        L_0x0904:
            com.google.android.apps.gsa.search.shared.actions.core.HelpAction r9 = new com.google.android.apps.gsa.search.shared.actions.core.HelpAction     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.ca r10 = r13.f144635a     // Catch:{ SecurityException -> 0x06cc }
            if (r10 != 0) goto L_0x090c
            com.google.bb.a.ca r10 = com.google.p4152bb.p4153a.C54997ca.f144699d     // Catch:{ SecurityException -> 0x06cc }
        L_0x090c:
            java.lang.String r10 = r10.f144703c     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.ca r11 = r13.f144636b     // Catch:{ SecurityException -> 0x06cc }
            if (r11 != 0) goto L_0x0914
            com.google.bb.a.ca r11 = com.google.p4152bb.p4153a.C54997ca.f144699d     // Catch:{ SecurityException -> 0x06cc }
        L_0x0914:
            java.lang.String r11 = r11.f144703c     // Catch:{ SecurityException -> 0x06cc }
            r9.<init>((java.lang.String) r10, (java.lang.String) r11, (int) r6)     // Catch:{ SecurityException -> 0x06cc }
            r1.add(r9)     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.cq r6 = r13.f144637c     // Catch:{ SecurityException -> 0x06cc }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ SecurityException -> 0x06cc }
        L_0x0922:
            boolean r9 = r6.hasNext()     // Catch:{ SecurityException -> 0x06cc }
            if (r9 == 0) goto L_0x0a00
            java.lang.Object r9 = r6.next()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.bd r9 = (com.google.p4152bb.p4153a.C54973bd) r9     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.cq r10 = r9.f144630b     // Catch:{ SecurityException -> 0x06cc }
            int r10 = r10.size()     // Catch:{ SecurityException -> 0x06cc }
            java.util.ArrayList r10 = com.google.common.p4522b.C58597ky.m90214e(r10)     // Catch:{ SecurityException -> 0x06cc }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ SecurityException -> 0x06cc }
            r11.<init>()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.ca r12 = r9.f144629a     // Catch:{ SecurityException -> 0x06cc }
            if (r12 != 0) goto L_0x0943
            com.google.bb.a.ca r12 = com.google.p4152bb.p4153a.C54997ca.f144699d     // Catch:{ SecurityException -> 0x06cc }
        L_0x0943:
            java.lang.String r12 = r12.f144703c     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.cq r9 = r9.f144630b     // Catch:{ SecurityException -> 0x06cc }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ SecurityException -> 0x06cc }
        L_0x094b:
            boolean r13 = r9.hasNext()     // Catch:{ SecurityException -> 0x06cc }
            if (r13 == 0) goto L_0x09df
            java.lang.Object r13 = r9.next()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.bc r13 = (com.google.p4152bb.p4153a.C54972bc) r13     // Catch:{ SecurityException -> 0x06cc }
            int r15 = r13.f144611a     // Catch:{ SecurityException -> 0x06cc }
            r16 = r15 & 4
            if (r16 == 0) goto L_0x094b
            r16 = r15 & 1
            if (r16 == 0) goto L_0x096b
            r39 = r6
            int r6 = r13.f144612b     // Catch:{ SecurityException -> 0x06cc }
            if (r5 < r6) goto L_0x0968
            goto L_0x096d
        L_0x0968:
            r6 = r39
            goto L_0x094b
        L_0x096b:
            r39 = r6
        L_0x096d:
            r6 = r15 & 2
            if (r6 == 0) goto L_0x0975
            int r6 = r13.f144613c     // Catch:{ SecurityException -> 0x06cc }
            if (r5 >= r6) goto L_0x0968
        L_0x0975:
            com.google.protobuf.cj r6 = new com.google.protobuf.cj     // Catch:{ SecurityException -> 0x06cc }
            com.google.protobuf.ch r15 = r13.f144614d     // Catch:{ SecurityException -> 0x06cc }
            r16 = r5
            com.google.protobuf.ci r5 = com.google.p4152bb.p4153a.C54972bc.f144606e     // Catch:{ SecurityException -> 0x06cc }
            r6.<init>(r15, r5)     // Catch:{ SecurityException -> 0x06cc }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ SecurityException -> 0x06cc }
        L_0x0984:
            boolean r6 = r5.hasNext()     // Catch:{ SecurityException -> 0x06cc }
            if (r6 == 0) goto L_0x09a6
            java.lang.Object r6 = r5.next()     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.az r6 = (com.google.p4152bb.p4153a.C54968az) r6     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.az r15 = com.google.p4152bb.p4153a.C54968az.TELEPHONY     // Catch:{ SecurityException -> 0x06cc }
            if (r6 != r15) goto L_0x099b
            boolean r6 = r4.mo85391c()     // Catch:{ SecurityException -> 0x06cc }
            if (r6 != 0) goto L_0x0984
            goto L_0x09d9
        L_0x099b:
            com.google.bb.a.az r15 = com.google.p4152bb.p4153a.C54968az.REAR_FACING_CAMERA     // Catch:{ SecurityException -> 0x06cc }
            if (r6 != r15) goto L_0x09d9
            boolean r6 = r4.mo85389a()     // Catch:{ SecurityException -> 0x06cc }
            if (r6 != 0) goto L_0x0984
            goto L_0x09d9
        L_0x09a6:
            int r5 = com.google.android.apps.gsa.search.shared.actions.core.HelpAction.m141541N(r13)     // Catch:{ SecurityException -> 0x06cc }
            r6 = 3
            if (r5 == r6) goto L_0x09d9
            if (r5 == 0) goto L_0x09d5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)     // Catch:{ SecurityException -> 0x06cc }
            java.lang.Object r17 = r11.get(r15)     // Catch:{ SecurityException -> 0x06cc }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SecurityException -> 0x06cc }
            if (r17 != 0) goto L_0x09c8
            r6 = 1
            if (r5 == r6) goto L_0x09c1
            android.net.Uri r5 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x09c3
        L_0x09c1:
            android.net.Uri r5 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ SecurityException -> 0x06cc }
        L_0x09c3:
            java.util.List r17 = r3.mo70797a(r5)     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x09c9
        L_0x09c8:
            r6 = 1
        L_0x09c9:
            r5 = r17
            boolean r17 = r5.isEmpty()     // Catch:{ SecurityException -> 0x06cc }
            if (r17 != 0) goto L_0x09d9
            r11.put(r15, r5)     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x09d6
        L_0x09d5:
            r6 = 1
        L_0x09d6:
            r10.add(r13)     // Catch:{ SecurityException -> 0x06cc }
        L_0x09d9:
            r6 = r39
            r5 = r16
            goto L_0x094b
        L_0x09df:
            r16 = r5
            r39 = r6
            r6 = 1
            boolean r5 = r10.isEmpty()     // Catch:{ SecurityException -> 0x06cc }
            if (r5 != 0) goto L_0x09f3
            java.util.Collections.shuffle(r10)     // Catch:{ SecurityException -> 0x06cc }
            com.google.android.apps.gsa.search.shared.actions.core.HelpAction r13 = new com.google.android.apps.gsa.search.shared.actions.core.HelpAction     // Catch:{ SecurityException -> 0x06cc }
            r13.<init>((java.lang.String) r12, (java.util.List) r10, (java.util.Map) r11)     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x09f5
        L_0x09f3:
            r13 = r33
        L_0x09f5:
            if (r13 == 0) goto L_0x09fa
            r1.add(r13)     // Catch:{ SecurityException -> 0x06cc }
        L_0x09fa:
            r6 = r39
            r5 = r16
            goto L_0x0922
        L_0x0a00:
            boolean r3 = r1.isEmpty()     // Catch:{ SecurityException -> 0x06cc }
            if (r3 == 0) goto L_0x0a07
            goto L_0x0a09
        L_0x0a07:
            r13 = r1
            goto L_0x0a0b
        L_0x0a09:
            r13 = r33
        L_0x0a0b:
            if (r13 == 0) goto L_0x0a11
            r2.addAll(r13)     // Catch:{ SecurityException -> 0x06cc }
            return r2
        L_0x0a11:
            boolean r1 = r38.mo84337bV()     // Catch:{ SecurityException -> 0x06cc }
            if (r1 == 0) goto L_0x0a1f
            com.google.android.apps.gsa.search.shared.actions.PuntAction r13 = new com.google.android.apps.gsa.search.shared.actions.PuntAction     // Catch:{ SecurityException -> 0x06cc }
            r1 = r35
            r13.<init>((java.lang.CharSequence) r1)     // Catch:{ SecurityException -> 0x06cc }
            goto L_0x0a21
        L_0x0a1f:
            r13 = r33
        L_0x0a21:
            if (r13 == 0) goto L_0x0a41
            int r1 = r8.f144533a     // Catch:{ SecurityException -> 0x06cc }
            r1 = r1 & 16
            if (r1 == 0) goto L_0x0a3d
            com.google.bb.a.af r1 = r8.f144536d     // Catch:{ SecurityException -> 0x06cc }
            if (r1 != 0) goto L_0x0a2f
            com.google.bb.a.af r1 = com.google.p4152bb.p4153a.C54948af.f144541h     // Catch:{ SecurityException -> 0x06cc }
        L_0x0a2f:
            int r1 = r1.f144544b     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.m87686a(r1)     // Catch:{ SecurityException -> 0x06cc }
            if (r1 != 0) goto L_0x0a39
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE     // Catch:{ SecurityException -> 0x06cc }
        L_0x0a39:
            r3 = 7
            m153478k(r14, r1, r3)     // Catch:{ SecurityException -> 0x06cc }
        L_0x0a3d:
            r2.add(r13)     // Catch:{ SecurityException -> 0x06cc }
            return r2
        L_0x0a41:
            int r1 = r8.f144533a     // Catch:{ SecurityException -> 0x06cc }
            r1 = r1 & 16
            if (r1 == 0) goto L_0x0a62
            boolean r1 = r2.isEmpty()     // Catch:{ SecurityException -> 0x06cc }
            if (r1 == 0) goto L_0x0a62
            com.google.bb.a.af r1 = r8.f144536d     // Catch:{ SecurityException -> 0x06cc }
            if (r1 != 0) goto L_0x0a53
            com.google.bb.a.af r1 = com.google.p4152bb.p4153a.C54948af.f144541h     // Catch:{ SecurityException -> 0x06cc }
        L_0x0a53:
            int r1 = r1.f144544b     // Catch:{ SecurityException -> 0x06cc }
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.m87686a(r1)     // Catch:{ SecurityException -> 0x06cc }
            if (r1 != 0) goto L_0x0a5d
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE     // Catch:{ SecurityException -> 0x06cc }
        L_0x0a5d:
            r3 = 22
            m153478k(r14, r1, r3)     // Catch:{ SecurityException -> 0x06cc }
        L_0x0a62:
            return r2
        L_0x0a63:
            r0 = move-exception
            r14 = r6
            r23 = 16
        L_0x0a67:
            r1 = r0
        L_0x0a68:
            com.google.common.f.e r2 = f260243a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Permission required while processing action. Action suppressed"
            r4 = 13630(0x353e, float:1.91E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
            int r1 = r8.f144533a
            r1 = r1 & 16
            if (r1 == 0) goto L_0x0a90
            com.google.bb.a.af r1 = r8.f144536d
            if (r1 != 0) goto L_0x0a81
            com.google.bb.a.af r1 = com.google.p4152bb.p4153a.C54948af.f144541h
        L_0x0a81:
            int r1 = r1.f144544b
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.m87686a(r1)
            if (r1 != 0) goto L_0x0a8b
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
        L_0x0a8b:
            r2 = 20
            m153478k(r14, r1, r2)
        L_0x0a90:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7358d.C93320g.mo87635b(com.google.bb.a.ad, com.google.android.apps.gsa.shared.search.Query, com.google.android.apps.gsa.search.shared.media.PlaybackStatus):java.util.List");
    }

    /* renamed from: c */
    public final C60870cx mo87636c(C54946ad adVar, Query query) {
        return this.f260271w.mo85138c(new C93319f(this, adVar, query));
    }
}
