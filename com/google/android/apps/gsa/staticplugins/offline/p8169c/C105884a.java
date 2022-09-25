package com.google.android.apps.gsa.staticplugins.offline.p8169c;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C54948af;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55265lz;
import com.google.p4152bb.p4153a.C55268mb;
import com.google.p4152bb.p4153a.C55324od;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55371px;
import com.google.p4152bb.p4153a.C55373pz;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4242bp.p4267h.C56389aa;
import com.google.p4242bp.p4267h.C56390ab;
import com.google.p4242bp.p4267h.C56394af;
import com.google.p4242bp.p4267h.C56416w;
import com.google.p4242bp.p4267h.C56419z;
import com.google.p4242bp.p4267h.p4268a.C56382o;
import com.google.p4242bp.p4267h.p4268a.C56388u;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.c.a */
/* compiled from: PG */
public final class C105884a {

    /* renamed from: a */
    private static final C59071e f295517a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.offline.c.a");

    /* renamed from: b */
    private final Locale f295518b;

    /* renamed from: c */
    private final Context f295519c;

    /* renamed from: d */
    private final C105892d f295520d;

    /* renamed from: e */
    private final C58833ax f295521e;

    /* renamed from: f */
    private final C86124t f295522f;

    /* renamed from: g */
    private final C91123v f295523g;

    public C105884a(Context context, C105892d dVar, Locale locale, C91123v vVar, C58833ax axVar, C86124t tVar) {
        this.f295520d = dVar;
        this.f295518b = locale;
        this.f295519c = context;
        this.f295523g = vVar;
        this.f295521e = axVar;
        this.f295522f = tVar;
    }

    /* renamed from: b */
    private static void m176387b(C56390ab abVar, C54946ad adVar, C56419z zVar) {
        C62940bt r0 = C62942bv.checkIsLite(C55265lz.f145556m);
        adVar.mo58887l(r0);
        if (!adVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C55324od.f145746k);
            adVar.mo58887l(r02);
            if (!adVar.f169962ag.mo58857o(r02.f169971d)) {
                ((C59052c) ((C59052c) f295517a.mo56225c()).mo56372aa(22527)).mo56386p("setStringFactoryInputResourceKey being called without modular component");
                return;
            }
        }
        C56416w wVar = (C56416w) C56389aa.f150386e.createBuilder();
        wVar.copyOnWrite();
        C56389aa aaVar = (C56389aa) wVar.instance;
        aaVar.f150389b = zVar.f150529ap;
        aaVar.f150388a |= 1;
        abVar.copyOnWrite();
        C56394af afVar = (C56394af) abVar.instance;
        C56389aa aaVar2 = (C56389aa) wVar.build();
        C56394af afVar2 = C56394af.f150399g;
        aaVar2.getClass();
        afVar.f150402b = aaVar2;
        afVar.f150401a |= 4;
        C62940bt btVar = C56388u.f150376i;
        C56382o oVar = (C56382o) ((C56388u) abVar.mo58881i(C56388u.f150376i)).toBuilder();
        oVar.copyOnWrite();
        C56388u uVar = (C56388u) oVar.instance;
        uVar.f150382f = 1;
        uVar.f150378a |= 2;
        abVar.mo58885m(btVar, (C56388u) oVar.build());
    }

    /* renamed from: c */
    private static boolean m176388c(C55421x xVar) {
        C55421x xVar2 = C55421x.UNKNOWN_ACTION_TYPE;
        int ordinal = xVar.ordinal();
        if (ordinal == 41 || ordinal == 87) {
            return true;
        }
        switch (ordinal) {
            case 21:
            case 22:
            case 23:
                return true;
            default:
                switch (ordinal) {
                    case 25:
                    case 26:
                    case 27:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* renamed from: d */
    private static boolean m176389d(C54946ad adVar) {
        Object obj;
        Object obj2;
        C54948af afVar = adVar.f144536d;
        if (afVar == null) {
            afVar = C54948af.f144541h;
        }
        C55421x a = C55421x.m87686a(afVar.f144544b);
        if (a == null) {
            a = C55421x.UNKNOWN_ACTION_TYPE;
        }
        if (a == C55421x.SMS) {
            return true;
        }
        C54948af afVar2 = adVar.f144536d;
        if (afVar2 == null) {
            afVar2 = C54948af.f144541h;
        }
        C55421x a2 = C55421x.m87686a(afVar2.f144544b);
        if (a2 == null) {
            a2 = C55421x.UNKNOWN_ACTION_TYPE;
        }
        if (a2 == C55421x.GENERIC_SEND_MESSAGE) {
            C62940bt r0 = C62942bv.checkIsLite(C55265lz.f145556m);
            adVar.mo58887l(r0);
            Object l = adVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C55265lz lzVar = (C55265lz) obj;
            if ((lzVar.f145558a & 4) != 0) {
                C55213ka kaVar = lzVar.f145563f;
                if (kaVar == null) {
                    kaVar = C55213ka.f145356g;
                }
                C62940bt r02 = C62942bv.checkIsLite(C55268mb.f145571e);
                kaVar.mo58887l(r02);
                Object l2 = kaVar.f169962ag.mo58854l(r02.f169971d);
                if (l2 == null) {
                    obj2 = r02.f169969b;
                } else {
                    obj2 = r02.mo58889c(l2);
                }
                C55268mb mbVar = (C55268mb) obj2;
                if (mbVar != null) {
                    C55373pz pzVar = mbVar.f145575c;
                    if (pzVar == null) {
                        pzVar = C55373pz.f145913d;
                    }
                    if (pzVar.f145916b.size() > 0) {
                        C55373pz pzVar2 = mbVar.f145575c;
                        if (pzVar2 == null) {
                            pzVar2 = C55373pz.f145913d;
                        }
                        if (((C55361pn) mbVar.f145574b.get(((C55371px) pzVar2.f145916b.get(0)).f145910b)).f145870c == 2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010c, code lost:
        if ((!r3) == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0166, code lost:
        r3 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4152bb.p4153a.C54946ad mo95127a(com.google.p4152bb.p4153a.C54946ad r10, com.google.protos.p4958bd.C64438d r11) {
        /*
            r9 = this;
            com.google.bb.a.af r0 = r10.f144536d
            if (r0 != 0) goto L_0x0006
            com.google.bb.a.af r0 = com.google.p4152bb.p4153a.C54948af.f144541h
        L_0x0006:
            int r0 = r0.f144544b
            com.google.bb.a.x r0 = com.google.p4152bb.p4153a.C55421x.m87686a(r0)
            if (r0 != 0) goto L_0x0010
            com.google.bb.a.x r0 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
        L_0x0010:
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.PLAY_MUSIC
            if (r0 == r1) goto L_0x0216
            com.google.bb.a.x r1 = com.google.p4152bb.p4153a.C55421x.OPEN_APP
            if (r0 != r1) goto L_0x001a
            goto L_0x0216
        L_0x001a:
            com.google.protobuf.bn r1 = r10.toBuilder()
            com.google.bb.a.ac r1 = (com.google.p4152bb.p4153a.C54945ac) r1
            java.util.Locale r2 = r9.f295518b
            com.google.bp.h.af r3 = com.google.p4242bp.p4267h.C56394af.f150399g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.bp.h.ab r3 = (com.google.p4242bp.p4267h.C56390ab) r3
            com.google.protobuf.bt r4 = com.google.p4242bp.p4267h.p4268a.C56379l.f150355b
            boolean r4 = r1.mo58882j(r4)
            if (r4 == 0) goto L_0x0045
            com.google.protobuf.bt r3 = com.google.p4242bp.p4267h.p4268a.C56379l.f150355b
            java.lang.Object r3 = r1.mo58881i(r3)
            com.google.bp.h.af r3 = (com.google.p4242bp.p4267h.C56394af) r3
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.bp.h.ab r3 = (com.google.p4242bp.p4267h.C56390ab) r3
            com.google.protobuf.bt r4 = com.google.p4242bp.p4267h.p4268a.C56379l.f150355b
            r1.mo58884l(r4)
        L_0x0045:
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.getLanguage()
            java.lang.String r2 = r2.getLanguage()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0071
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.bp.h.af r2 = (com.google.p4242bp.p4267h.C56394af) r2
            com.google.protobuf.cq r4 = r2.f150404d
            boolean r5 = r4.mo58948c()
            if (r5 != 0) goto L_0x006a
            com.google.protobuf.cq r4 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r4)
            r2.f150404d = r4
        L_0x006a:
            com.google.protobuf.cq r2 = r2.f150404d
            java.lang.String r4 = "IS_EN_LOCALE"
            r2.add(r4)
        L_0x0071:
            com.google.protobuf.bv r2 = r3.build()
            com.google.bp.h.af r2 = (com.google.p4242bp.p4267h.C56394af) r2
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.bp.h.ab r2 = (com.google.p4242bp.p4267h.C56390ab) r2
            com.google.android.apps.gsa.shared.util.v r3 = r9.f295523g
            boolean r3 = r3.mo85390b()
            if (r3 == 0) goto L_0x0113
            com.google.common.base.ax r3 = r9.f295521e
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x0113
            com.google.android.apps.gsa.search.core.i.t r3 = r9.f295522f
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250431cx
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x0113
            boolean r3 = m176388c(r0)
            if (r3 != 0) goto L_0x00a3
            boolean r3 = m176389d(r10)
            if (r3 == 0) goto L_0x0113
        L_0x00a3:
            com.google.common.base.ax r3 = r9.f295521e
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.a.b.b r3 = (com.google.android.apps.gsa.p496a.p499b.C9308b) r3
            boolean r4 = r3.mo17490e()
            if (r4 != 0) goto L_0x00ec
            com.google.android.apps.gsa.shared.util.v r3 = r9.f295523g     // Catch:{ UnsupportedOperationException -> 0x00dd }
            boolean r3 = r3.mo85390b()     // Catch:{ UnsupportedOperationException -> 0x00dd }
            if (r3 == 0) goto L_0x00d5
            android.content.Context r3 = r9.f295519c     // Catch:{ UnsupportedOperationException -> 0x00dd }
            com.google.android.libraries.search.m.b.b r4 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_ASSISTANT_AUTO     // Catch:{ UnsupportedOperationException -> 0x00dd }
            android.content.Context r3 = com.google.android.libraries.search.p3047m.p3054d.C39239a.m68666a(r3, r4)     // Catch:{ UnsupportedOperationException -> 0x00dd }
            java.lang.String r4 = "phone"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ UnsupportedOperationException -> 0x00dd }
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ UnsupportedOperationException -> 0x00dd }
            int r3 = r3.getVoiceNetworkType()     // Catch:{ UnsupportedOperationException -> 0x00dd }
            if (r3 != 0) goto L_0x0113
            com.google.bp.h.z r3 = com.google.p4242bp.p4267h.C56419z.PUNT_CONNECTION_ISSUE     // Catch:{ UnsupportedOperationException -> 0x00dd }
            m176387b(r2, r10, r3)     // Catch:{ UnsupportedOperationException -> 0x00dd }
            goto L_0x0113
        L_0x00d5:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException     // Catch:{ UnsupportedOperationException -> 0x00dd }
            java.lang.String r4 = "isHasVoiceTelephonyOnEmbedded shouldn't be called in non-auto and Android Versions < N"
            r3.<init>(r4)     // Catch:{ UnsupportedOperationException -> 0x00dd }
            throw r3     // Catch:{ UnsupportedOperationException -> 0x00dd }
        L_0x00dd:
            r3 = move-exception
            com.google.common.f.e r4 = f295517a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "Cannot check for voice telephony outside of embedded with Android versions > N"
            r6 = 22526(0x57fe, float:3.1566E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r6)).mo56386p(r5)
            goto L_0x0113
        L_0x00ec:
            boolean r4 = m176388c(r0)
            if (r4 == 0) goto L_0x00fd
            com.google.common.b.ij r3 = r3.mo17486a()
            boolean r3 = r3.isEmpty()
        L_0x00fa:
            r3 = r3 ^ 1
            goto L_0x010c
        L_0x00fd:
            boolean r4 = m176389d(r10)
            if (r4 == 0) goto L_0x010e
            com.google.common.b.ij r3 = r3.mo17489d()
            boolean r3 = r3.isEmpty()
            goto L_0x00fa
        L_0x010c:
            if (r3 != 0) goto L_0x0113
        L_0x010e:
            com.google.bp.h.z r3 = com.google.p4242bp.p4267h.C56419z.PUNT_MISSING_PERMISSION
            m176387b(r2, r10, r3)
        L_0x0113:
            com.google.android.apps.gsa.staticplugins.offline.c.d r3 = r9.f295520d
            android.content.Context r4 = r9.f295519c
            com.google.al.c.a.a.b r3 = r3.f295538a
            com.google.protobuf.cq r3 = r3.f29342a
            java.util.Iterator r3 = r3.iterator()
        L_0x011f:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x0166
            java.lang.Object r5 = r3.next()
            com.google.al.c.a.a.g r5 = (com.google.p395al.p408c.p409a.p410a.C8448g) r5
            int r7 = r5.f29353a
            com.google.bb.a.x r7 = com.google.p4152bb.p4153a.C55421x.m87686a(r7)
            if (r7 != 0) goto L_0x0136
            com.google.bb.a.x r7 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
        L_0x0136:
            if (r7 != r0) goto L_0x011f
            com.google.protobuf.cq r0 = r5.f29354b
            java.util.Iterator r0 = r0.iterator()
        L_0x013e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0166
            java.lang.Object r3 = r0.next()
            com.google.al.c.a.a.e r3 = (com.google.p395al.p408c.p409a.p410a.C8446e) r3
            com.google.protobuf.cj r5 = new com.google.protobuf.cj
            com.google.protobuf.ch r7 = r3.f29347a
            com.google.protobuf.ci r8 = com.google.p395al.p408c.p409a.p410a.C8446e.f29344b
            r5.<init>(r7, r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x0157:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x013e
            java.lang.Object r7 = r5.next()
            com.google.protos.bd.d r7 = (com.google.protos.p4958bd.C64438d) r7
            if (r7 != r11) goto L_0x0157
            goto L_0x0167
        L_0x0166:
            r3 = r6
        L_0x0167:
            if (r3 != 0) goto L_0x016a
            goto L_0x017a
        L_0x016a:
            com.google.android.apps.gsa.staticplugins.offline.c.a.b r6 = new com.google.android.apps.gsa.staticplugins.offline.c.a.b
            com.google.bp.h.v r11 = r3.f29348c
            if (r11 != 0) goto L_0x0172
            com.google.bp.h.v r11 = com.google.p4242bp.p4267h.C56415v.f150454c
        L_0x0172:
            com.google.android.apps.gsa.staticplugins.offline.a.a r0 = new com.google.android.apps.gsa.staticplugins.offline.a.a
            r0.<init>(r4)
            r6.<init>(r11, r0)
        L_0x017a:
            if (r6 != 0) goto L_0x017d
            return r10
        L_0x017d:
            com.google.protobuf.bt r11 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r10.mo58887l(r11)
            com.google.protobuf.bf r0 = r10.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r0.mo58857o(r11)
            if (r11 == 0) goto L_0x01c7
            com.google.protobuf.bt r11 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r10.mo58887l(r11)
            com.google.protobuf.bf r10 = r10.f169962ag
            com.google.protobuf.bs r0 = r11.f169971d
            java.lang.Object r10 = r10.mo58854l(r0)
            if (r10 != 0) goto L_0x01a6
            java.lang.Object r10 = r11.f169969b
            goto L_0x01aa
        L_0x01a6:
            java.lang.Object r10 = r11.mo58889c(r10)
        L_0x01aa:
            com.google.bb.a.lz r10 = (com.google.p4152bb.p4153a.C55265lz) r10
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.bb.a.ly r10 = (com.google.p4152bb.p4153a.C55264ly) r10
            com.google.protobuf.bv r11 = r2.build()
            com.google.bp.h.af r11 = (com.google.p4242bp.p4267h.C56394af) r11
            r6.mo95141h(r11, r10)
            com.google.protobuf.bt r11 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bv r10 = r10.build()
            com.google.bb.a.lz r10 = (com.google.p4152bb.p4153a.C55265lz) r10
            r1.mo58885m(r11, r10)
            goto L_0x0210
        L_0x01c7:
            com.google.protobuf.bt r11 = com.google.p4152bb.p4153a.C55324od.f145746k
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r10.mo58887l(r11)
            com.google.protobuf.bf r0 = r10.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r0.mo58857o(r11)
            if (r11 == 0) goto L_0x0210
            com.google.protobuf.bt r11 = com.google.p4152bb.p4153a.C55324od.f145746k
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r10.mo58887l(r11)
            com.google.protobuf.bf r10 = r10.f169962ag
            com.google.protobuf.bs r0 = r11.f169971d
            java.lang.Object r10 = r10.mo58854l(r0)
            if (r10 != 0) goto L_0x01f0
            java.lang.Object r10 = r11.f169969b
            goto L_0x01f4
        L_0x01f0:
            java.lang.Object r10 = r11.mo58889c(r10)
        L_0x01f4:
            com.google.bb.a.od r10 = (com.google.p4152bb.p4153a.C55324od) r10
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.bb.a.oc r10 = (com.google.p4152bb.p4153a.C55323oc) r10
            com.google.protobuf.bv r11 = r2.build()
            com.google.bp.h.af r11 = (com.google.p4242bp.p4267h.C56394af) r11
            r6.mo95139f(r11, r10)
            com.google.protobuf.bt r11 = com.google.p4152bb.p4153a.C55324od.f145746k
            com.google.protobuf.bv r10 = r10.build()
            com.google.bb.a.od r10 = (com.google.p4152bb.p4153a.C55324od) r10
            r1.mo58885m(r11, r10)
        L_0x0210:
            com.google.protobuf.bv r10 = r1.build()
            com.google.bb.a.ad r10 = (com.google.p4152bb.p4153a.C54946ad) r10
        L_0x0216:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.offline.p8169c.C105884a.mo95127a(com.google.bb.a.ad, com.google.protos.bd.d):com.google.bb.a.ad");
    }
}
