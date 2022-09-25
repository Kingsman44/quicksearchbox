package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.binaries.satin.app.aon;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9462a.C125941c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126311at;
import java.util.Set;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69695c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.bd */
/* compiled from: PG */
public final class C126039bd {
    @Deprecated

    /* renamed from: a */
    private static final Set f347380a = C69531o.m100939p(new C125160i[]{C125160i.ELIGIBLE, C125160i.NON_ELIGIBLE_ASSISTANT_VOICE_TYPING_SETTING_DISABLED});
    @Deprecated

    /* renamed from: b */
    private static final Set f347381b = C69531o.m100939p(new C125160i[]{C125160i.NON_ELIGIBLE_ASSISTANT_NOT_ENABLED, C125160i.NON_ELIGIBLE_KEYBOARD_NOT_VISIBLE, C125160i.NON_ELIGIBLE_MODEL_DOWNLOAD_NEEDS_USER_REQUEST, C125160i.NON_ELIGIBLE_MODEL_DOWNLOAD_IN_PROGRESS});
    @Deprecated

    /* renamed from: c */
    private static final C69695c f347382c = new C69695c(86705485, Integer.MAX_VALUE);

    /* renamed from: d */
    private final boolean f347383d;

    /* renamed from: e */
    private final boolean f347384e;

    /* renamed from: f */
    private final C125941c f347385f;

    /* renamed from: g */
    private final C126311at f347386g;

    /* renamed from: h */
    private final long f347387h;

    /* renamed from: i */
    private final C126040be f347388i;

    /* renamed from: j */
    private final aon f347389j;

    public C126039bd(boolean z, boolean z2, aon aon, C125941c cVar, C126311at atVar, long j) {
        C69664n.m101061g(aon, "eligibilityMessageV2BuilderFactory");
        C69664n.m101061g(cVar, "localizationManager");
        this.f347383d = z;
        this.f347384e = z2;
        this.f347389j = aon;
        this.f347385f = cVar;
        this.f347386g = atVar;
        this.f347387h = j;
        this.f347388i = aon.mo66636a(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125161j mo107266a(com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i r9, com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i r10) {
        /*
            r8 = this;
            java.lang.String r0 = "eligibility"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            java.lang.String r0 = "configEligibility"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            com.google.android.apps.search.assistant.surfaces.dictation.a.j r0 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125161j.f345284g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.assistant.surfaces.dictation.a.g r0 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125158g) r0
            java.lang.String r1 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.apps.search.assistant.surfaces.dictation.a.l r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            long r2 = r8.f347387h
            r4 = 89998085(0x55d4305, double:4.4464962E-316)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x002d
            java.util.Set r2 = f347381b
            boolean r2 = r2.contains(r9)
            if (r2 == 0) goto L_0x002d
            goto L_0x004e
        L_0x002d:
            h.j.c r2 = f347382c
            int r3 = r2.f186059a
            int r2 = r2.f186060b
            long r4 = r8.f347387h
            long r6 = (long) r3
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x004e
            long r2 = (long) r2
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x004e
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r2 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i.UNRECOGNIZED
            if (r9 == r2) goto L_0x004b
            int r2 = r9.getNumber()
            r3 = 35
            if (r2 <= r3) goto L_0x004e
        L_0x004b:
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r2 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i.UNKNOWN
            goto L_0x004f
        L_0x004e:
            r2 = r9
        L_0x004f:
            java.lang.String r3 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)
            com.google.android.apps.search.assistant.surfaces.dictation.a.g r4 = r0.f345292a
            r4.copyOnWrite()
            com.google.protobuf.bv r4 = r4.instance
            com.google.android.apps.search.assistant.surfaces.dictation.a.j r4 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125161j) r4
            int r2 = r2.getNumber()
            r4.f345287b = r2
            r0.mo106813b(r10)
            boolean r10 = r8.f347383d
            if (r10 == 0) goto L_0x00b1
            java.util.Set r10 = f347380a
            boolean r10 = r10.contains(r9)
            com.google.android.apps.search.assistant.surfaces.dictation.a.g r2 = r0.f345292a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.apps.search.assistant.surfaces.dictation.a.j r2 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125161j) r2
            r2.f345289d = r10
            if (r10 != 0) goto L_0x00b1
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.be r10 = r8.f347388i
            java.lang.String r9 = r10.mo107267a(r9)
            if (r9 != 0) goto L_0x009b
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.a.c r9 = r8.f347385f
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.at r10 = r8.f347386g
            java.util.Locale r10 = r10.mo107523b()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            android.content.Context r9 = r9.mo107211a(r10)
            r10 = 2132083744(0x7f150420, float:1.9807639E38)
            java.lang.String r9 = r9.getString(r10, r2)
        L_0x009b:
            java.lang.String r10 = "getEligibilityDescription(eligibility)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r3)
            com.google.android.apps.search.assistant.surfaces.dictation.a.g r10 = r0.f345292a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.android.apps.search.assistant.surfaces.dictation.a.j r10 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125161j) r10
            r9.getClass()
            r10.f345290e = r9
        L_0x00b1:
            com.google.android.apps.search.assistant.surfaces.dictation.a.d r9 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125126d.f345189b
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.search.assistant.surfaces.dictation.a.c r9 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125099c) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r1)
            com.google.android.apps.search.assistant.surfaces.dictation.a.f r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            boolean r10 = r8.f347384e
            com.google.android.apps.search.assistant.surfaces.dictation.a.c r1 = r9.f345245a
            r1.copyOnWrite()
            com.google.protobuf.bv r1 = r1.instance
            com.google.android.apps.search.assistant.surfaces.dictation.a.d r1 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125126d) r1
            r1.f345191a = r10
            com.google.android.apps.search.assistant.surfaces.dictation.a.d r9 = r9.mo106810a()
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r3)
            com.google.android.apps.search.assistant.surfaces.dictation.a.g r10 = r0.f345292a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.android.apps.search.assistant.surfaces.dictation.a.j r10 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125161j) r10
            r9.getClass()
            r10.f345291f = r9
            com.google.android.apps.search.assistant.surfaces.dictation.a.j r9 = r0.mo106812a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126039bd.mo107266a(com.google.android.apps.search.assistant.surfaces.dictation.a.i, com.google.android.apps.search.assistant.surfaces.dictation.a.i):com.google.android.apps.search.assistant.surfaces.dictation.a.j");
    }
}
