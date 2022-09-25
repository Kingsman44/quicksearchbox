package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.android.apps.gsa.nga.api.a.m;
import com.google.android.apps.gsa.nga.engine.dictation.a;
import com.google.android.apps.gsa.nga.engine.dictation.ad;
import com.google.android.apps.gsa.nga.engine.dictation.ae;
import com.google.android.apps.gsa.nga.engine.dictation.af;
import com.google.android.apps.gsa.nga.engine.dictation.ag;
import com.google.android.apps.gsa.nga.engine.dictation.b;
import com.google.android.apps.gsa.nga.engine.dictation.e;
import com.google.android.apps.gsa.nga.engine.dictation.w;
import com.google.android.apps.gsa.nga.engine.dictation.y;
import com.google.android.apps.gsa.nga.engine.dictation.z;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126181j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9482t.C126353d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58903m;
import com.google.common.base.C58912v;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4946az.C64353a;
import com.google.protos.p4946az.C64354b;
import com.google.protos.p4946az.C64355c;
import com.google.protos.p4946az.C64356d;
import com.google.protos.p4946az.C64359g;
import com.google.protos.p4946az.C64364l;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.af */
/* compiled from: PG */
public final class C125470af {

    /* renamed from: a */
    public static final C59071e f346003a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.af");

    /* renamed from: b */
    public static final y f346004b;

    /* renamed from: c */
    public static final C58912v f346005c = new C58903m(' ');

    /* renamed from: d */
    public final Locale f346006d;

    /* renamed from: e */
    public final bj f346007e;

    /* renamed from: f */
    public final C126181j f346008f;

    /* renamed from: g */
    public final boolean f346009g;

    /* renamed from: h */
    public final boolean f346010h;

    /* renamed from: i */
    public final Executor f346011i;

    /* renamed from: j */
    public final m f346012j;

    /* renamed from: k */
    private final boolean f346013k;

    /* renamed from: l */
    private final C125476al f346014l;

    /* renamed from: m */
    private final C126353d f346015m;

    static {
        w createBuilder = y.l.createBuilder();
        createBuilder.copyOnWrite();
        createBuilder.instance.e = false;
        createBuilder.copyOnWrite();
        createBuilder.instance.c = true;
        createBuilder.copyOnWrite();
        createBuilder.instance.a = true;
        createBuilder.copyOnWrite();
        createBuilder.instance.b = true;
        createBuilder.copyOnWrite();
        createBuilder.instance.d = true;
        createBuilder.copyOnWrite();
        createBuilder.instance.g = true;
        createBuilder.copyOnWrite();
        createBuilder.instance.i = true;
        createBuilder.copyOnWrite();
        createBuilder.instance.j = 3;
        f346004b = createBuilder.build();
    }

    public C125470af(Locale locale, bj bjVar, C126181j jVar, m mVar, boolean z, boolean z2, boolean z3, C125476al alVar, C126353d dVar, Executor executor) {
        this.f346006d = locale;
        this.f346007e = bjVar;
        this.f346008f = jVar;
        this.f346012j = mVar;
        this.f346009g = z;
        this.f346010h = z2;
        this.f346013k = z3;
        this.f346014l = alVar;
        this.f346015m = dVar;
        this.f346011i = executor;
    }

    /* renamed from: a */
    public static ag m205445a(C58485gu guVar, String str) {
        StringBuilder sb = new StringBuilder();
        Iterator it = guVar.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(BuildConfig.FLAVOR);
            }
        }
        String sb2 = sb.toString();
        af createBuilder = ag.h.createBuilder();
        createBuilder.copyOnWrite();
        createBuilder.instance.a = sb2;
        C64354b f = m205447f(sb2);
        createBuilder.copyOnWrite();
        f.getClass();
        createBuilder.instance.b = f;
        createBuilder.copyOnWrite();
        str.getClass();
        createBuilder.instance.c = str;
        C64354b f2 = m205447f(str);
        createBuilder.copyOnWrite();
        f2.getClass();
        createBuilder.instance.d = f2;
        z zVar = z.e;
        createBuilder.copyOnWrite();
        createBuilder.instance.g = zVar.getNumber();
        return createBuilder.build();
    }

    /* renamed from: d */
    public static C58485gu m205446d(C125471ag agVar, String str) {
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(agVar.mo106983b());
        if (!str.isEmpty()) {
            e.mo55395g(str);
        }
        return e.mo55394f();
    }

    /* renamed from: f */
    private static C64354b m205447f(String str) {
        C64353a aVar = (C64353a) C64354b.f173954b.createBuilder();
        C64355c cVar = (C64355c) C64356d.f173957b.createBuilder();
        C64359g gVar = (C64359g) C64364l.f173967h.createBuilder();
        gVar.copyOnWrite();
        C64364l lVar = (C64364l) gVar.instance;
        str.getClass();
        lVar.f173969a |= 1;
        lVar.f173970b = str;
        cVar.copyOnWrite();
        C64356d dVar = (C64356d) cVar.instance;
        C64364l lVar2 = (C64364l) gVar.build();
        lVar2.getClass();
        C62971cq cqVar = dVar.f173959a;
        if (!cqVar.mo58948c()) {
            dVar.f173959a = C62942bv.mutableCopy(cqVar);
        }
        dVar.f173959a.add(lVar2);
        aVar.copyOnWrite();
        C64354b bVar = (C64354b) aVar.instance;
        C64356d dVar2 = (C64356d) cVar.build();
        dVar2.getClass();
        bVar.mo59274a();
        bVar.f173956a.add(dVar2);
        return (C64354b) aVar.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x019d A[EDGE_INSN: B:103:0x019d->B:66:0x019d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01bd A[Catch:{ all -> 0x0334, all -> 0x033a }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0205 A[LOOP:3: B:84:0x0203->B:85:0x0205, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02d9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at mo106979b(com.google.protos.p4946az.C64354b r20, boolean r21, com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125503i r22, p3186j$.util.Optional r23) {
        /*
            r19 = this;
            r1 = r19
            r2 = r21
            r3 = r22
            com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.bd r4 = new com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.bd
            boolean r0 = r1.f346013k
            if (r0 == 0) goto L_0x0030
            com.google.android.apps.search.assistant.surfaces.dictation.service.t.d r0 = r1.f346015m
            java.util.Locale r5 = r1.f346006d
            com.google.common.util.concurrent.cx r0 = r0.mo107566a(r5)
            boolean r5 = r0.isDone()     // Catch:{ ExecutionException -> 0x0021 }
            if (r5 == 0) goto L_0x0030
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r0)     // Catch:{ ExecutionException -> 0x0021 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.t.a r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9482t.C126350a) r0     // Catch:{ ExecutionException -> 0x0021 }
            goto L_0x0032
        L_0x0021:
            r0 = move-exception
            com.google.common.f.e r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9482t.C126353d.f348041a
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r6 = "#getOrEmpty – loading failed. [SD]"
            r7 = 37013(0x9095, float:5.1866E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r7)).mo56386p(r6)
        L_0x0030:
            com.google.android.apps.search.assistant.surfaces.dictation.service.t.a r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9482t.C126350a.f348036a
        L_0x0032:
            java.util.Locale r5 = r1.f346006d
            r6 = r23
            r4.<init>(r2, r0, r6, r5)
            java.lang.StringBuilder r0 = r4.f346061e
            int r0 = r0.length()
            r5 = r20
            com.google.protobuf.cq r5 = r5.f173956a
            java.util.Iterator r5 = r5.iterator()
        L_0x0047:
            boolean r6 = r5.hasNext()
            r7 = 4
            r8 = 2
            r9 = 0
            r10 = 1
            if (r6 == 0) goto L_0x019d
            java.lang.Object r6 = r5.next()
            com.google.protos.az.d r6 = (com.google.protos.p4946az.C64356d) r6
            com.google.protobuf.cq r6 = r6.f173959a
            java.util.Iterator r6 = r6.iterator()
        L_0x005d:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x0047
            java.lang.Object r11 = r6.next()
            com.google.protos.az.l r11 = (com.google.protos.p4946az.C64364l) r11
            com.google.android.apps.gsa.unifiedime.c r12 = com.google.android.apps.gsa.unifiedime.C118585c.RECOGNITION
            int r12 = r11.f173971c
            int r12 = com.google.protos.p4946az.C64358f.m96388a(r12)
            if (r12 != 0) goto L_0x0074
            r12 = 1
        L_0x0074:
            int r12 = r12 + -1
            r13 = 3
            if (r12 == r10) goto L_0x0098
            if (r12 == r8) goto L_0x0090
            if (r12 == r13) goto L_0x0088
            if (r12 == r7) goto L_0x0080
            goto L_0x009f
        L_0x0080:
            java.lang.String r12 = r11.f173972d
            com.google.common.b.hd r14 = com.google.common.p4522b.C58729pv.f156485a
            r4.mo106990c(r10, r12, r14)
            goto L_0x009f
        L_0x0088:
            java.lang.String r12 = "\n\n"
            com.google.common.b.hd r14 = com.google.common.p4522b.C58729pv.f156485a
            r4.mo106990c(r10, r12, r14)
            goto L_0x009f
        L_0x0090:
            java.lang.String r12 = "\n"
            com.google.common.b.hd r14 = com.google.common.p4522b.C58729pv.f156485a
            r4.mo106990c(r10, r12, r14)
            goto L_0x009f
        L_0x0098:
            java.lang.String r12 = " "
            com.google.common.b.hd r14 = com.google.common.p4522b.C58729pv.f156485a
            r4.mo106990c(r10, r12, r14)
        L_0x009f:
            java.lang.String r12 = r11.f173974f
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x00ae
            java.lang.String r12 = r11.f173974f
            com.google.common.b.hd r14 = com.google.common.p4522b.C58729pv.f156485a
            r4.mo106990c(r10, r12, r14)
        L_0x00ae:
            com.google.protos.az.k r12 = r11.f173975g
            if (r12 != 0) goto L_0x00b4
            com.google.protos.az.k r12 = com.google.protos.p4946az.C64363k.f173962d
        L_0x00b4:
            int r12 = r12.f173966c
            int r12 = com.google.protos.p4946az.C64362j.m96389a(r12)
            if (r12 != 0) goto L_0x00bd
            r12 = 1
        L_0x00bd:
            int r12 = r12 + -1
            if (r12 == 0) goto L_0x0177
            if (r12 == r10) goto L_0x014b
            r14 = 5
            if (r12 == r8) goto L_0x014e
            if (r12 == r13) goto L_0x014b
            if (r12 == r14) goto L_0x00d1
            r13 = 6
            if (r12 == r13) goto L_0x00d1
            r17 = r5
            goto L_0x0182
        L_0x00d1:
            java.lang.String r12 = r11.f173970b
            com.google.common.b.hd r13 = r4.mo106988a(r11)
            int r14 = r12.length()
            int r14 = r12.codePointCount(r9, r14)
            com.google.common.b.gp r15 = r4.f346060d
            com.google.android.apps.gsa.unifiedime.v r16 = com.google.android.apps.gsa.unifiedime.C118604v.f330885f
            com.google.protobuf.bn r16 = r16.createBuilder()
            r8 = r16
            com.google.android.apps.gsa.unifiedime.s r8 = (com.google.android.apps.gsa.unifiedime.C118601s) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.android.apps.gsa.unifiedime.v r7 = (com.google.android.apps.gsa.unifiedime.C118604v) r7
            int r9 = r7.f330887a
            r9 = r9 | 8
            r7.f330887a = r9
            r7.f330891e = r10
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.android.apps.gsa.unifiedime.v r7 = (com.google.android.apps.gsa.unifiedime.C118604v) r7
            r9 = 0
            r7.f330890d = r9
            int r9 = r7.f330887a
            r17 = 4
            r9 = r9 | 4
            r7.f330887a = r9
            int r7 = r4.f346065i
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.unifiedime.v r9 = (com.google.android.apps.gsa.unifiedime.C118604v) r9
            r17 = r5
            int r5 = r9.f330887a
            r5 = r5 | r10
            r9.f330887a = r5
            r9.f330888b = r7
            int r5 = r4.f346065i
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.android.apps.gsa.unifiedime.v r7 = (com.google.android.apps.gsa.unifiedime.C118604v) r7
            int r9 = r7.f330887a
            r18 = 2
            r9 = r9 | 2
            r7.f330887a = r9
            int r5 = r5 + r14
            r7.f330889c = r5
            com.google.protobuf.bv r5 = r8.build()
            com.google.android.apps.gsa.unifiedime.v r5 = (com.google.android.apps.gsa.unifiedime.C118604v) r5
            r15.mo55395g(r5)
            java.lang.StringBuilder r5 = r4.f346061e
            r5.append(r12)
            int r5 = r4.f346065i
            r4.mo106989b(r13, r5, r14)
            int r5 = r4.f346065i
            int r5 = r5 + r14
            r4.f346065i = r5
            goto L_0x0182
        L_0x014b:
            r17 = r5
            goto L_0x0168
        L_0x014e:
            r17 = r5
            java.lang.String r5 = "ja-JP"
            java.lang.String r7 = r4.f346057a
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0162
            com.google.protos.az.k r5 = r11.f173975g
            if (r5 != 0) goto L_0x0160
            com.google.protos.az.k r5 = com.google.protos.p4946az.C64363k.f173962d
        L_0x0160:
            java.lang.String r5 = r5.f173965b
        L_0x0162:
            java.lang.String r5 = r11.f173970b
            r4.mo106991d(r5, r14)
            goto L_0x0182
        L_0x0168:
            com.google.protos.az.k r5 = r11.f173975g
            if (r5 != 0) goto L_0x016e
            com.google.protos.az.k r5 = com.google.protos.p4946az.C64363k.f173962d
        L_0x016e:
            java.lang.String r5 = r5.f173965b
            java.lang.String r5 = r11.f173970b
            r7 = 4
            r4.mo106991d(r5, r7)
            goto L_0x0182
        L_0x0177:
            r17 = r5
            java.lang.String r5 = r11.f173970b
            com.google.common.b.hd r7 = r4.mo106988a(r11)
            r4.mo106990c(r10, r5, r7)
        L_0x0182:
            java.lang.String r5 = r11.f173973e
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0196
            java.lang.String r5 = r11.f173973e
            com.google.common.b.hd r7 = com.google.common.p4522b.C58729pv.f156485a
            r8 = 2
            r4.mo106990c(r8, r5, r7)
            r5 = r17
            r7 = 4
            goto L_0x019a
        L_0x0196:
            r5 = r17
            r7 = 4
            r8 = 2
        L_0x019a:
            r9 = 0
            goto L_0x005d
        L_0x019d:
            java.lang.StringBuilder r5 = r4.f346061e
            java.lang.String r5 = r5.substring(r0)
            java.lang.String r6 = "SD.AltSpansTracker.Align"
            com.google.apps.tiktok.tracing.bi r6 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r6)
            java.lang.String r7 = r3.f346080b     // Catch:{ all -> 0x0334 }
            com.google.common.b.gu r7 = r3.f346081c     // Catch:{ all -> 0x0334 }
            r8 = 0
            r9 = 0
        L_0x01af:
            java.lang.String r11 = r3.f346080b     // Catch:{ all -> 0x0334 }
            int r11 = r11.length()     // Catch:{ all -> 0x0334 }
            if (r9 >= r11) goto L_0x01fa
            int r11 = r5.length()     // Catch:{ all -> 0x0334 }
            if (r8 >= r11) goto L_0x01fa
            java.lang.String r11 = r3.f346080b     // Catch:{ all -> 0x0334 }
            int r11 = r11.codePointAt(r9)     // Catch:{ all -> 0x0334 }
            int r12 = r5.codePointAt(r8)     // Catch:{ all -> 0x0334 }
            int r13 = android.icu.lang.UCharacter.toLowerCase(r12)     // Catch:{ all -> 0x0334 }
            int r14 = android.icu.lang.UCharacter.toLowerCase(r11)     // Catch:{ all -> 0x0334 }
            if (r13 == r14) goto L_0x01ee
            boolean r13 = android.icu.lang.UCharacter.isWhitespace(r12)     // Catch:{ all -> 0x0334 }
            if (r13 == 0) goto L_0x01de
            boolean r13 = android.icu.lang.UCharacter.isWhitespace(r11)     // Catch:{ all -> 0x0334 }
            if (r13 == 0) goto L_0x01de
            goto L_0x01ee
        L_0x01de:
            java.lang.String r11 = r3.f346080b     // Catch:{ all -> 0x0334 }
            r13 = 0
            int r11 = r11.codePointCount(r13, r9)     // Catch:{ all -> 0x0334 }
            com.google.common.b.gu r7 = com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125503i.m205473f(r7, r11, r10)     // Catch:{ all -> 0x0334 }
            int r11 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0334 }
            goto L_0x01f8
        L_0x01ee:
            r13 = 0
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0334 }
            int r9 = r9 + r11
            int r11 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0334 }
        L_0x01f8:
            int r8 = r8 + r11
            goto L_0x01af
        L_0x01fa:
            r13 = 0
            r6.close()
            int r3 = r7.size()
            r9 = 0
        L_0x0203:
            if (r9 >= r3) goto L_0x021e
            java.lang.Object r5 = r7.get(r9)
            com.google.android.apps.gsa.unifiedime.f r5 = (com.google.android.apps.gsa.unifiedime.C118588f) r5
            com.google.common.b.bb r6 = r4.f346064h
            int r8 = r5.f330862b
            int r8 = r8 + r0
            int r11 = r5.f330863c
            com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.bc r8 = com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125494bc.m205461c(r8, r11)
            com.google.protobuf.cq r5 = r5.f330864d
            r6.mo54957J(r8, r5)
            int r9 = r9 + 1
            goto L_0x0203
        L_0x021e:
            if (r2 == 0) goto L_0x0232
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.j r0 = r1.f346008f
            com.google.common.b.bb r2 = r4.f346064h
            int r2 = r2.f155874b
            com.google.common.b.bb r3 = r4.f346062f
            int r3 = r3.f155874b
            com.google.common.b.bb r5 = r4.f346063g
            int r5 = r5.f155874b
            int r3 = r3 + r5
            r0.mo107432c(r2, r3)
        L_0x0232:
            com.google.android.apps.gsa.unifiedime.x r0 = com.google.android.apps.gsa.unifiedime.C118606x.f330892g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.unifiedime.w r0 = (com.google.android.apps.gsa.unifiedime.C118605w) r0
            boolean r2 = r4.f346059c
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.unifiedime.x r3 = (com.google.android.apps.gsa.unifiedime.C118606x) r3
            int r5 = r3.f330894a
            r6 = 2
            r5 = r5 | r6
            r3.f330894a = r5
            r3.f330896c = r2
            java.lang.String r2 = r4.f346057a
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.unifiedime.x r3 = (com.google.android.apps.gsa.unifiedime.C118606x) r3
            r2.getClass()
            int r5 = r3.f330894a
            r6 = 4
            r5 = r5 | r6
            r3.f330894a = r5
            r3.f330897d = r2
            com.google.common.b.gp r2 = r4.f346060d
            com.google.common.b.gu r2 = r2.mo55394f()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.unifiedime.x r3 = (com.google.android.apps.gsa.unifiedime.C118606x) r3
            r3.mo103785a()
            com.google.protobuf.cq r3 = r3.f330898e
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r3)
            java.lang.StringBuilder r2 = r4.f346061e
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0290
            java.lang.StringBuilder r2 = r4.f346061e
            java.lang.String r2 = r2.toString()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.unifiedime.x r3 = (com.google.android.apps.gsa.unifiedime.C118606x) r3
            int r5 = r3.f330894a
            r5 = r5 | r10
            r3.f330894a = r5
            r3.f330895b = r2
        L_0x0290:
            com.google.common.b.bb r2 = new com.google.common.b.bb
            r2.<init>()
            com.google.common.b.bb r3 = r4.f346063g
            r2.mo54955H(r3)
            com.google.common.b.bb r3 = r4.f346064h
            r2.mo54955H(r3)
            com.google.common.b.bb r3 = r4.f346062f
            r2.mo54955H(r3)
            java.util.Map r2 = r2.mo54950C()
            java.util.Set r2 = r2.entrySet()
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.av r3 = com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125486av.f346045a
            java.util.Comparator r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125494bc.f346055a
            java.util.Comparator r3 = p3186j$.util.Comparator.CC.comparing(r3, r5)
            j$.util.stream.Stream r2 = r2.sorted(r3)
            com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.aw r3 = new com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.aw
            r3.<init>(r4)
            j$.util.stream.Stream r2 = r2.map(r3)
            com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.ax r3 = com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125488ax.f346047a
            j$.util.stream.Stream r2 = r2.filter(r3)
            j$.util.stream.Collector r3 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r2 = r2.collect(r3)
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x031c
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.as r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125483as.f346042a
            j$.util.stream.IntStream r3 = r3.mapToInt(r4)
            j$.util.OptionalInt r3 = r3.max()
            int r3 = r3.getAsInt()
            com.google.android.apps.gsa.unifiedime.h r4 = com.google.android.apps.gsa.unifiedime.C118590h.f330865d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.unifiedime.g r4 = (com.google.android.apps.gsa.unifiedime.C118589g) r4
            r4.mo103774a(r2)
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.android.apps.gsa.unifiedime.h r2 = (com.google.android.apps.gsa.unifiedime.C118590h) r2
            int r5 = r2.f330867a
            r5 = r5 | r10
            r2.f330867a = r5
            r2.f330869c = r3
            com.google.protobuf.bv r2 = r4.build()
            com.google.android.apps.gsa.unifiedime.h r2 = (com.google.android.apps.gsa.unifiedime.C118590h) r2
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.unifiedime.x r3 = (com.google.android.apps.gsa.unifiedime.C118606x) r3
            r2.getClass()
            r3.f330899f = r2
            int r2 = r3.f330894a
            r2 = r2 | 8
            r3.f330894a = r2
        L_0x031c:
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.unifiedime.x r0 = (com.google.android.apps.gsa.unifiedime.C118606x) r0
            com.google.android.apps.search.assistant.surfaces.dictation.a.at r2 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at.f345040b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.assistant.surfaces.dictation.a.as r2 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125064as) r2
            r2.mo106795c(r0)
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.apps.search.assistant.surfaces.dictation.a.at r0 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at) r0
            return r0
        L_0x0334:
            r0 = move-exception
            r2 = r0
            r6.close()     // Catch:{ all -> 0x033a }
            goto L_0x033f
        L_0x033a:
            r0 = move-exception
            r3 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125464a.m205441a(r2, r3)
        L_0x033f:
            goto L_0x0341
        L_0x0340:
            throw r2
        L_0x0341:
            goto L_0x0340
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125470af.mo106979b(com.google.protos.az.b, boolean, com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.i, j$.util.Optional):com.google.android.apps.search.assistant.surfaces.dictation.a.at");
    }

    /* renamed from: c */
    public final C125065at mo106980c(ag agVar, C125503i iVar, Optional optional) {
        C64354b bVar = agVar.d;
        if (bVar == null) {
            bVar = C64354b.f173954b;
        }
        return mo106979b(bVar, false, iVar.mo106993d(bVar), optional);
    }

    /* renamed from: e */
    public final C60870cx mo106981e(int i, C58485gu guVar, String str, C125513s sVar, m mVar) {
        String str2;
        ad createBuilder = ae.h.createBuilder();
        createBuilder.copyOnWrite();
        ae aeVar = createBuilder.instance;
        C62971cq cqVar = aeVar.a;
        if (!cqVar.mo58948c()) {
            aeVar.a = C62942bv.mutableCopy(cqVar);
        }
        C58485gu guVar2 = guVar;
        C62947c.addAll((Iterable) guVar, (List) aeVar.a);
        bj bjVar = this.f346007e;
        com.google.android.apps.gsa.nga.api.a.af afVar = bjVar.a;
        if (afVar == null) {
            afVar = com.google.android.apps.gsa.nga.api.a.af.w;
        }
        boolean z = false;
        if (afVar.a.size() > 0) {
            com.google.android.apps.gsa.nga.api.a.af afVar2 = bjVar.a;
            if (afVar2 == null) {
                afVar2 = com.google.android.apps.gsa.nga.api.a.af.w;
            }
            str2 = (String) afVar2.a.get(0);
        } else {
            str2 = "en-US";
        }
        createBuilder.copyOnWrite();
        str2.getClass();
        createBuilder.instance.f = str2;
        createBuilder.copyOnWrite();
        str.getClass();
        createBuilder.instance.b = str;
        String str3 = (String) Collection.EL.stream(sVar.mo107018b().mo55401lD()).filter(C125518x.f346111a).findFirst().orElse(BuildConfig.FLAVOR);
        a createBuilder2 = b.g.createBuilder();
        e eVar = this.f346007e.e;
        if (eVar == null) {
            eVar = e.b;
        }
        createBuilder2.copyOnWrite();
        eVar.getClass();
        createBuilder2.instance.c = eVar;
        if (str3.isEmpty()) {
            e eVar2 = this.f346007e.d;
            if (eVar2 == null) {
                eVar2 = e.b;
            }
            createBuilder2.copyOnWrite();
            b bVar = createBuilder2.instance;
            eVar2.getClass();
            bVar.b = eVar2;
            bVar.a = 2;
            e eVar3 = this.f346007e.f;
            if (eVar3 == null) {
                eVar3 = e.b;
            }
            createBuilder2.copyOnWrite();
            eVar3.getClass();
            createBuilder2.instance.d = eVar3;
            e eVar4 = this.f346007e.g;
            if (eVar4 == null) {
                eVar4 = e.b;
            }
            createBuilder2.copyOnWrite();
            eVar4.getClass();
            createBuilder2.instance.e = eVar4;
            int i2 = this.f346007e.c;
            createBuilder2.copyOnWrite();
            createBuilder2.instance.f = i2;
        } else {
            createBuilder2.copyOnWrite();
            b bVar2 = createBuilder2.instance;
            str3.getClass();
            bVar2.a = 1;
            bVar2.b = str3;
        }
        createBuilder.copyOnWrite();
        b build = createBuilder2.build();
        build.getClass();
        createBuilder.instance.g = build;
        Optional c = sVar.mo107019c();
        if (c.isPresent() && ((C125512r) c.get()).mo107014f()) {
            z = true;
        }
        createBuilder.copyOnWrite();
        createBuilder.instance.e = z;
        if (c.isPresent()) {
            String e = ((C125512r) c.get()).mo107012e();
            createBuilder.copyOnWrite();
            e.getClass();
            createBuilder.instance.c = e;
            String d = ((C125512r) c.get()).mo107011d();
            createBuilder.copyOnWrite();
            d.getClass();
            createBuilder.instance.d = d;
        }
        ae build2 = createBuilder.build();
        C60870cx a = this.f346014l.mo106984a(this.f346006d);
        if (i != 2 || a.isDone()) {
            C125520z zVar = new C125520z(this, build2, mVar, i, guVar, str);
            return C60922j.m93044g(a, C47810es.m84963c(zVar), this.f346011i);
        }
        C59052c cVar = (C59052c) f346003a.mo56224b();
        cVar.mo56374ac(1, TimeUnit.SECONDS);
        ((C59052c) cVar.mo56372aa(36587)).mo56386p("Returning unformatted text, formatted not loaded yet. [SD]");
        return C60856cj.m92900i(m205445a(guVar, str));
    }
}
