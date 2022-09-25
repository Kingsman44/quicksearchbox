package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89947o;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89034be;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89059o;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.p.bz */
/* compiled from: PG */
public final class C86243bz {

    /* renamed from: a */
    public Query f233122a;

    /* renamed from: b */
    public Query f233123b;

    /* renamed from: c */
    public Query f233124c;

    /* renamed from: d */
    public long f233125d = 1;

    /* renamed from: e */
    public C89059o f233126e;

    /* renamed from: f */
    private final C68214a f233127f;

    /* renamed from: g */
    private final C89859i f233128g;

    /* renamed from: h */
    private final C68214a f233129h;

    /* renamed from: i */
    private final C86124t f233130i;

    public C86243bz(C68214a aVar, C89859i iVar, C68214a aVar2, C86124t tVar) {
        this.f233127f = aVar;
        this.f233128g = iVar;
        this.f233129h = aVar2;
        this.f233130i = tVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.apps.gsa.search.core.p.bx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.android.apps.gsa.search.core.p.bx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.google.android.apps.gsa.search.core.p.bx} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r12v3, types: [com.google.android.apps.gsa.search.core.p.p] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.google.android.apps.gsa.search.core.p.a] */
    /* JADX WARNING: type inference failed for: r13v2, types: [com.google.android.apps.gsa.search.core.p.p] */
    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.apps.gsa.search.core.p.bx] */
    /* JADX WARNING: type inference failed for: r4v14, types: [com.google.android.apps.gsa.search.core.p.a] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.search.core.p6816p.C86246cb mo79938a() {
        /*
            r21 = this;
            r0 = r21
            com.google.android.apps.gsa.shared.search.Query r1 = r0.f233124c
            java.lang.String r2 = "android.opa.extra.CONVERSATION_DELTA"
            r3 = 0
            if (r1 == 0) goto L_0x0069
            boolean r4 = r1.mo84434dO()
            if (r4 != 0) goto L_0x004f
            boolean r4 = r1.mo84399cf()
            if (r4 == 0) goto L_0x001c
            boolean r1 = r1.mo84364bx(r2)
            if (r1 == 0) goto L_0x001c
            goto L_0x004f
        L_0x001c:
            com.google.android.apps.gsa.shared.search.Query r1 = r0.f233124c
            boolean r1 = r1.mo84319bD()
            if (r1 == 0) goto L_0x0037
            com.google.android.apps.gsa.search.core.p.a r3 = new com.google.android.apps.gsa.search.core.p.a
            com.google.android.apps.gsa.shared.search.Query r1 = r0.f233124c
            long r5 = r1.f252749G
            long r7 = r0.f233125d
            com.google.android.apps.gsa.shared.logger.b.i r9 = r0.f233128g
            com.google.android.apps.gsa.shared.aa.o r10 = r0.f233126e
            dagger.a r11 = r0.f233129h
            r4 = r3
            r4.<init>(r5, r7, r9, r10, r11)
            goto L_0x0069
        L_0x0037:
            com.google.android.apps.gsa.shared.search.Query r1 = r0.f233124c
            if (r1 == 0) goto L_0x0069
            com.google.android.apps.gsa.search.core.p.bx r3 = new com.google.android.apps.gsa.search.core.p.bx
            com.google.android.apps.gsa.shared.search.Query r1 = r0.f233124c
            long r5 = r1.f252749G
            long r7 = r0.f233125d
            r9 = 0
            com.google.android.apps.gsa.shared.logger.b.i r10 = r0.f233128g
            com.google.android.apps.gsa.shared.aa.o r11 = r0.f233126e
            dagger.a r12 = r0.f233129h
            r4 = r3
            r4.<init>(r5, r7, r9, r10, r11, r12)
            goto L_0x0069
        L_0x004f:
            com.google.android.apps.gsa.search.core.p.p r3 = new com.google.android.apps.gsa.search.core.p.p
            com.google.android.apps.gsa.shared.search.Query r1 = r0.f233124c
            long r14 = r1.f252749G
            long r4 = r0.f233125d
            com.google.android.apps.gsa.shared.logger.b.i r1 = r0.f233128g
            dagger.a r6 = r0.f233129h
            com.google.android.apps.gsa.search.core.i.t r7 = r0.f233130i
            r13 = r3
            r16 = r4
            r18 = r1
            r19 = r6
            r20 = r7
            r13.<init>(r14, r16, r18, r19, r20)
        L_0x0069:
            com.google.android.apps.gsa.shared.search.Query r1 = r0.f233122a
            if (r1 == 0) goto L_0x00b4
            boolean r4 = r1.mo84434dO()
            if (r4 != 0) goto L_0x009b
            boolean r4 = r1.mo84399cf()
            if (r4 == 0) goto L_0x0080
            boolean r1 = r1.mo84364bx(r2)
            if (r1 == 0) goto L_0x0080
            goto L_0x009b
        L_0x0080:
            com.google.android.apps.gsa.shared.search.Query r1 = r0.f233122a
            boolean r1 = r1.mo84319bD()
            if (r1 == 0) goto L_0x00b4
            com.google.android.apps.gsa.search.core.p.a r3 = new com.google.android.apps.gsa.search.core.p.a
            com.google.android.apps.gsa.shared.search.Query r5 = r0.f233122a
            com.google.android.apps.gsa.shared.search.Query r6 = r0.f233123b
            long r7 = r0.f233125d
            com.google.android.apps.gsa.shared.logger.b.i r9 = r0.f233128g
            com.google.android.apps.gsa.shared.aa.o r10 = r0.f233126e
            dagger.a r11 = r0.f233129h
            r4 = r3
            r4.<init>(r5, r6, r7, r9, r10, r11)
            goto L_0x00b4
        L_0x009b:
            com.google.android.apps.gsa.search.core.p.p r3 = new com.google.android.apps.gsa.search.core.p.p
            com.google.android.apps.gsa.shared.search.Query r13 = r0.f233122a
            com.google.android.apps.gsa.shared.search.Query r14 = r0.f233123b
            long r1 = r0.f233125d
            com.google.android.apps.gsa.shared.logger.b.i r4 = r0.f233128g
            dagger.a r5 = r0.f233129h
            com.google.android.apps.gsa.search.core.i.t r6 = r0.f233130i
            r12 = r3
            r15 = r1
            r17 = r4
            r18 = r5
            r19 = r6
            r12.<init>(r13, r14, r15, r17, r18, r19)
        L_0x00b4:
            if (r3 != 0) goto L_0x00c9
            com.google.android.apps.gsa.search.core.p.bx r3 = new com.google.android.apps.gsa.search.core.p.bx
            com.google.android.apps.gsa.shared.search.Query r5 = r0.f233122a
            com.google.android.apps.gsa.shared.search.Query r6 = r0.f233123b
            long r7 = r0.f233125d
            r9 = 0
            com.google.android.apps.gsa.shared.logger.b.i r10 = r0.f233128g
            com.google.android.apps.gsa.shared.aa.o r11 = r0.f233126e
            dagger.a r12 = r0.f233129h
            r4 = r3
            r4.<init>(r5, r6, r7, r9, r10, r11, r12)
        L_0x00c9:
            com.google.common.util.concurrent.cx r1 = r3.mo79898v()
            com.google.android.apps.gsa.search.core.p.by r2 = new com.google.android.apps.gsa.search.core.p.by
            r2.<init>(r0, r3)
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r1, r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6816p.C86243bz.mo79938a():com.google.android.apps.gsa.search.core.p.cb");
    }

    /* renamed from: b */
    public final void mo79939b(int i, boolean z, C86232bo boVar) {
        C86231bn n = boVar.mo79890n();
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        String b = C39191a.m68623b(n.f233052a);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        String b2 = C39191a.m68623b(n.f233053b);
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        b2.getClass();
        ufVar3.f164093a |= 8;
        ufVar3.f164260o = b2;
        if (z) {
            int i2 = C89034be.m144791a(((C89037bh) this.f233127f.mo27525b()).mo27377b()).f181028z;
            tzVar.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar.instance;
            ufVar4.f164093a |= 134217728;
            ufVar4.f164271z = i2;
        }
        C89947o.f246445a.mo83802h((C60555uf) tzVar.build(), C90918bo.m148517d(boVar.mo79871G()) ? ((C86247cc) C90918bo.m148515b(boVar.mo79871G())).f233133b : null, (C60321oe) null, (C63196b) null, (C19088t) null, (String) null, 0);
    }
}
