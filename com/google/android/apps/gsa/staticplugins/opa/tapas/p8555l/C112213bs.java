package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import android.content.Context;
import android.support.p031v4.media.session.C0320v;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.util.C87484f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112698f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112140g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112145l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8562f.C112427h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8582f.C113417a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48590af;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.bs */
/* compiled from: PG */
public final class C112213bs extends C112140g {

    /* renamed from: c */
    public static final /* synthetic */ int f311506c = 0;

    /* renamed from: d */
    private static final C121537f f311507d = C121537f.m200840b("ContextualSuppressor", C112145l.f311417q);

    /* renamed from: e */
    private static final C58528ij f311508e = C58528ij.m90015O("Delete_timer", "Delete_timer_in_context", "Pause_timer", "Reset_timer", "Resume_timer", "Silence_alarm", "Disable_alarm", "Cancel_alarm_in_context", "Disable_alarm_in_context");

    /* renamed from: a */
    C58881cr f311509a;

    /* renamed from: b */
    int f311510b = 0;

    /* renamed from: f */
    private final Context f311511f;

    /* renamed from: g */
    private final C86124t f311512g;

    /* renamed from: h */
    private final C112471ap f311513h;

    /* renamed from: i */
    private final C113417a f311514i;

    /* renamed from: j */
    private final C68214a f311515j;

    /* renamed from: k */
    private final C87484f f311516k;

    public C112213bs(Context context, C112427h hVar, C86124t tVar, C112471ap apVar, C113417a aVar, C68214a aVar2, C87484f fVar, C112698f fVar2) {
        super(hVar, fVar2);
        this.f311511f = context;
        this.f311512g = tVar;
        this.f311513h = apVar;
        this.f311514i = aVar;
        this.f311515j = aVar2;
        this.f311509a = C112207bm.f311500a;
        this.f311516k = fVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p3186j$.util.Optional m186090d(boolean r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case -1290197574: goto L_0x005b;
                case -1272444437: goto L_0x0051;
                case -1183073498: goto L_0x0047;
                case -870907421: goto L_0x003d;
                case -601793174: goto L_0x0033;
                case 108971: goto L_0x0029;
                case 3649301: goto L_0x001e;
                case 190912112: goto L_0x0014;
                case 1968882350: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0065
        L_0x000a:
            java.lang.String r0 = "bluetooth"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0065
            r5 = 4
            goto L_0x0066
        L_0x0014:
            java.lang.String r0 = "airplane_mode"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0065
            r5 = 1
            goto L_0x0066
        L_0x001e:
            java.lang.String r0 = "wifi"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0065
            r5 = 8
            goto L_0x0066
        L_0x0029:
            java.lang.String r0 = "nfc"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0065
            r5 = 6
            goto L_0x0066
        L_0x0033:
            java.lang.String r0 = "night_mode"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0065
            r5 = 7
            goto L_0x0066
        L_0x003d:
            java.lang.String r0 = "battery_saver"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0065
            r5 = 3
            goto L_0x0066
        L_0x0047:
            java.lang.String r0 = "flashlight"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0065
            r5 = 5
            goto L_0x0066
        L_0x0051:
            java.lang.String r0 = "auto_rotate"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0065
            r5 = 2
            goto L_0x0066
        L_0x005b:
            java.lang.String r0 = "adaptive_brightness"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0065
            r5 = 0
            goto L_0x0066
        L_0x0065:
            r5 = -1
        L_0x0066:
            switch(r5) {
                case 0: goto L_0x0104;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00de;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00a5;
                case 6: goto L_0x0094;
                case 7: goto L_0x0083;
                case 8: goto L_0x006f;
                default: goto L_0x0069;
            }
        L_0x0069:
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            goto L_0x0113
        L_0x006f:
            android.content.Context r5 = r3.f311511f
            boolean r5 = com.google.android.apps.gsa.shared.util.C90772bp.m148284K(r5)
            if (r4 != r5) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            goto L_0x0113
        L_0x0083:
            android.content.Context r5 = r3.f311511f
            j$.util.Optional r5 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113151bi.m187167e(r5)
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.bi r0 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.bi
            r0.<init>(r4)
            j$.util.Optional r4 = r5.map(r0)
            goto L_0x0113
        L_0x0094:
            android.content.Context r5 = r3.f311511f
            j$.util.Optional r5 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113151bi.m187166d(r5)
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.bh r0 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.bh
            r0.<init>(r4)
            j$.util.Optional r4 = r5.map(r0)
            goto L_0x0113
        L_0x00a5:
            com.google.android.apps.gsa.search.shared.actions.util.f r5 = r3.f311516k
            boolean r5 = r5.mo81473d()
            if (r4 != r5) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r1 = 0
        L_0x00af:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            goto L_0x0113
        L_0x00b8:
            android.content.Context r5 = r3.f311511f
            boolean r5 = com.google.android.apps.gsa.shared.util.C90772bp.m148277D(r5)
            if (r4 != r5) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            goto L_0x0113
        L_0x00cb:
            android.content.Context r5 = r3.f311511f
            boolean r5 = com.google.android.apps.gsa.shared.util.C90772bp.m148282I(r5)
            if (r4 != r5) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r1 = 0
        L_0x00d5:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            goto L_0x0113
        L_0x00de:
            android.content.Context r5 = r3.f311511f
            boolean r5 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113151bi.m187168f(r5)
            if (r5 != r4) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r1 = 0
        L_0x00e8:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            goto L_0x0113
        L_0x00f1:
            android.content.Context r5 = r3.f311511f
            boolean r5 = com.google.android.apps.gsa.shared.util.C90772bp.m148280G(r5)
            if (r4 != r5) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r1 = 0
        L_0x00fb:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            goto L_0x0113
        L_0x0104:
            android.content.Context r5 = r3.f311511f
            j$.util.Optional r5 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113151bi.m187164b(r5)
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.bg r0 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.bg
            r0.<init>(r4)
            j$.util.Optional r4 = r5.map(r0)
        L_0x0113:
            boolean r5 = r4.isPresent()
            if (r5 == 0) goto L_0x0122
            java.lang.Object r5 = r4.get()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
        L_0x0122:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112213bs.m186090d(boolean, java.lang.String):j$.util.Optional");
    }

    /* renamed from: e */
    private final boolean m186091e() {
        C121537f fVar = f311507d;
        C113417a aVar = this.f311514i;
        Objects.requireNonNull(aVar);
        for (C0320v vVar : (List) fVar.mo105235d("getMediaControllers", new C112200bf(aVar))) {
            if (vVar != null && vVar.mo1038f() != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private final boolean m186092f(Function function) {
        Optional optional = (Optional) this.f311509a.mo6453a();
        if (optional.isEmpty()) {
            return false;
        }
        return ((Boolean) function.apply((C48590af) optional.get())).booleanValue();
    }

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.CONTEXTUAL_SUPPRESSOR;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo99424b(C113405ep epVar, Map map) {
        C112471ap apVar = this.f311513h;
        Objects.requireNonNull(apVar);
        this.f311509a = C58886cw.m90973a(new C112211bq(apVar));
        this.f311510b = Collection.EL.stream(map.values()).mapToInt(C112212br.f311505a).sum();
        return super.mo99424b(epVar, map);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo99417c(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep r9, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez r10) {
        /*
            r8 = this;
            int r0 = r8.f311510b
            long r0 = (long) r0
            com.google.android.apps.gsa.search.core.i.t r2 = r8.f311512g
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249478eL
            long r2 = r2.mo79743a(r3)
            r4 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x023d
            j$.util.Optional r0 = r10.mo100057P()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0023
            r10.mo100199L()
            goto L_0x0234
        L_0x0023:
            dagger.a r1 = r8.f311515j
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.ao r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao) r1
            java.lang.Object r0 = r0.get()
            com.google.assistant.ad.d.ad r0 = (com.google.assistant.p3781ad.p3789d.C48570ad) r0
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.an r0 = r1.mo99348a(r0)
            j$.util.Optional r1 = r0.mo99343e()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0044
            r10.mo100199L()
            goto L_0x0234
        L_0x0044:
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f311211b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249401co
            boolean r2 = r2.mo79746e(r3)
            r3 = 1
            if (r2 == 0) goto L_0x006a
            com.google.assistant.ad.d.ad r2 = r0.f311210a
            int r6 = r2.f125483a
            r6 = r6 & 4
            if (r6 == 0) goto L_0x006a
            com.google.bj.f.d r2 = r2.f125485c
            if (r2 != 0) goto L_0x0063
            com.google.bj.f.d r2 = com.google.p4184bj.p4214f.C56030d.f149209c
        L_0x0063:
            com.google.protobuf.cq r2 = r2.f149212b
            int r2 = r2.size()
            goto L_0x007f
        L_0x006a:
            com.google.assistant.ad.d.ad r2 = r0.f311210a
            int r6 = r2.f125483a
            r6 = r6 & r3
            if (r6 == 0) goto L_0x007e
            com.google.knowledge.a.a.n r2 = r2.f125484b
            if (r2 != 0) goto L_0x0077
            com.google.knowledge.a.a.n r2 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0077:
            com.google.protobuf.cq r2 = r2.f166812c
            int r2 = r2.size()
            goto L_0x007f
        L_0x007e:
            r2 = 0
        L_0x007f:
            com.google.android.apps.gsa.search.core.i.t r6 = r8.f311512g
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249308bA
            boolean r6 = r6.mo79746e(r7)
            if (r6 == 0) goto L_0x009c
            if (r2 != 0) goto L_0x009c
            com.google.common.b.ij r2 = f311508e
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L_0x009b
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.bn r9 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112208bn.f311501a
            boolean r4 = r8.m186092f(r9)
            goto L_0x0234
        L_0x009b:
            r2 = 0
        L_0x009c:
            com.google.android.apps.gsa.search.core.i.t r6 = r8.f311512g
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249311bD
            boolean r6 = r6.mo79746e(r7)
            if (r6 == 0) goto L_0x00c9
            if (r2 != 0) goto L_0x00c9
            java.lang.String r2 = "Pause_stopwatch"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00b8
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.bo r9 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112209bo.f311502a
            boolean r4 = r8.m186092f(r9)
            goto L_0x0234
        L_0x00b8:
            java.lang.String r2 = "Reset_stopwatch"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00c8
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.bp r9 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112210bp.f311503a
            boolean r4 = r8.m186092f(r9)
            goto L_0x0234
        L_0x00c8:
            r2 = 0
        L_0x00c9:
            com.google.android.apps.gsa.search.core.i.t r6 = r8.f311512g
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249310bC
            boolean r6 = r6.mo79746e(r7)
            if (r6 == 0) goto L_0x0128
            java.lang.String r6 = "Previous_media"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L_0x0112
            java.lang.String r6 = "Next_media"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x00e4
            goto L_0x0112
        L_0x00e4:
            java.lang.String r6 = "MediaActionStop"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0102
            if (r2 == 0) goto L_0x00fc
            if (r2 != r3) goto L_0x0102
            java.lang.String r6 = r0.mo99347k()
            java.lang.String r7 = "Audio"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0102
        L_0x00fc:
            boolean r4 = r8.m186091e()
            goto L_0x0234
        L_0x0102:
            java.lang.String r6 = "Resume_playback"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0128
            if (r2 != 0) goto L_0x0128
            boolean r4 = r8.m186091e()
            goto L_0x0234
        L_0x0112:
            if (r2 == 0) goto L_0x0122
            if (r2 != r3) goto L_0x0128
            java.lang.String r6 = r0.mo99347k()
            java.lang.String r7 = "media_type"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0128
        L_0x0122:
            boolean r4 = r8.m186091e()
            goto L_0x0234
        L_0x0128:
            com.google.android.apps.gsa.search.core.i.t r6 = r8.f311512g
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249312bE
            boolean r6 = r6.mo79746e(r7)
            if (r6 == 0) goto L_0x01a9
            com.google.common.b.ij r6 = com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111584i.f310320a
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x01a9
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.o r9 = r9.mo100019d()
            com.google.common.base.cr r9 = r9.f312153d
            java.lang.Object r9 = r9.mo6453a()
            j$.util.Optional r9 = (p3186j$.util.Optional) r9
            boolean r6 = r9.isPresent()
            if (r6 == 0) goto L_0x01a9
            java.lang.String r1 = "app"
            j$.util.Optional r1 = r0.mo99340b(r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x015e
            java.lang.String r1 = "appAnnotation"
            j$.util.Optional r1 = r0.mo99340b(r1)
        L_0x015e:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0234
            java.lang.Object r0 = r1.get()
            com.google.knowledge.a.a.j r0 = (com.google.knowledge.p4661a.p4662a.C61748j) r0
            int r0 = r0.f166802a
            r2 = 15
            if (r0 != r2) goto L_0x0234
            java.lang.Object r0 = r1.get()
            com.google.knowledge.a.a.j r0 = (com.google.knowledge.p4661a.p4662a.C61748j) r0
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x017f
            java.lang.Object r0 = r0.f166803b
            com.google.protos.an.h r0 = (com.google.protos.p4850an.C63624h) r0
            goto L_0x0181
        L_0x017f:
            com.google.protos.an.h r0 = com.google.protos.p4850an.C63624h.f172070b
        L_0x0181:
            com.google.protobuf.cq r0 = r0.f172072a
            java.util.Iterator r0 = r0.iterator()
        L_0x0187:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01a3
            java.lang.Object r1 = r0.next()
            com.google.protos.as.a.d r1 = (com.google.protos.p4883as.p4884a.C63775d) r1
            java.lang.Object r2 = r9.get()
            com.google.common.b.ij r2 = (com.google.common.p4522b.C58528ij) r2
            java.lang.String r1 = r1.f172523d
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0187
            goto L_0x0234
        L_0x01a3:
            r10.mo100199L()
            r4 = 1
            goto L_0x0234
        L_0x01a9:
            com.google.android.apps.gsa.search.core.i.t r9 = r8.f311512g
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249309bB
            boolean r9 = r9.mo79746e(r10)
            if (r9 == 0) goto L_0x0234
            if (r2 != r3) goto L_0x01fb
            java.lang.String r9 = "setting"
            j$.util.Optional r9 = r0.mo99345h(r9)
            boolean r10 = r9.isPresent()
            if (r10 == 0) goto L_0x01fb
            java.lang.String r10 = "Turn_device_setting_on"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x01de
            java.lang.Object r9 = r9.get()
            java.lang.String r9 = (java.lang.String) r9
            j$.util.Optional r9 = r8.m186090d(r3, r9)
            java.lang.Object r9 = r9.orElse(r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r4 = r9.booleanValue()
            goto L_0x0234
        L_0x01de:
            java.lang.String r10 = "Turn_device_setting_off"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x01fb
            java.lang.Object r9 = r9.get()
            java.lang.String r9 = (java.lang.String) r9
            j$.util.Optional r9 = r8.m186090d(r4, r9)
            java.lang.Object r9 = r9.orElse(r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r4 = r9.booleanValue()
            goto L_0x0234
        L_0x01fb:
            if (r2 != 0) goto L_0x0234
            java.lang.String r9 = "TurnOnDoNotDisturb"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0216
            android.content.Context r9 = r8.f311511f
            j$.util.Optional r9 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113151bi.m187165c(r9)
            java.lang.Object r9 = r9.orElse(r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r4 = r9.booleanValue()
            goto L_0x0234
        L_0x0216:
            java.lang.String r9 = "TurnOffDoNotDisturb"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0234
            android.content.Context r9 = r8.f311511f
            j$.util.Optional r9 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113151bi.m187165c(r9)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r9 = r9.orElse(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r4 = r9 ^ 1
        L_0x0234:
            if (r4 == 0) goto L_0x023c
            int r9 = r8.f311510b
            int r9 = r9 + -1
            r8.f311510b = r9
        L_0x023c:
            return r4
        L_0x023d:
            r10.mo100199L()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112213bs.mo99417c(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez):boolean");
    }
}
