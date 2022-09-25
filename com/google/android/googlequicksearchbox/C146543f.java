package com.google.android.googlequicksearchbox;

import android.content.Intent;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.google.C85961dg;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58839bc;
import dagger.C68214a;

/* renamed from: com.google.android.googlequicksearchbox.f */
/* compiled from: PG */
public final class C146543f {

    /* renamed from: a */
    public C68214a f395761a;

    /* renamed from: b */
    public C68214a f395762b;

    /* renamed from: c */
    public C68214a f395763c;

    /* renamed from: d */
    public C68214a f395764d;

    /* renamed from: e */
    public C68214a f395765e;

    /* renamed from: f */
    public C68214a f395766f;

    /* renamed from: g */
    public C68214a f395767g;

    /* renamed from: h */
    public C68214a f395768h;

    /* renamed from: i */
    private final LegacySearchActivity f395769i;

    /* renamed from: com.google.android.googlequicksearchbox.f$a */
    /* compiled from: PG */
    public interface C146544a {
        /* renamed from: rh */
        void mo123335rh(C146543f fVar);
    }

    protected C146543f(LegacySearchActivity legacySearchActivity) {
        this.f395769i = legacySearchActivity;
    }

    /* renamed from: a */
    public final bm mo123328a() {
        if (this.f395762b == null) {
            mo123332e();
        }
        return (bm) this.f395762b.mo27525b();
    }

    /* renamed from: b */
    public final C86124t mo123329b() {
        if (this.f395761a == null) {
            mo123332e();
        }
        return (C86124t) this.f395761a.mo27525b();
    }

    /* renamed from: c */
    public final C84515a mo123330c() {
        if (this.f395766f == null) {
            mo123332e();
        }
        return (C84515a) this.f395766f.mo27525b();
    }

    /* renamed from: d */
    public final C58839bc mo123331d() {
        if (this.f395765e == null) {
            mo123332e();
        }
        return ((C85961dg) this.f395765e.mo27525b()).f232469a;
    }

    /* renamed from: e */
    public final void mo123332e() {
        ((C146544a) C47266f.m84076a(this.f395769i, C146544a.class)).mo123335rh(this);
    }

    /* renamed from: f */
    public final void mo123333f(Intent intent, int i) {
        mo123334g(intent, i);
        if (this.f395761a == null) {
            mo123332e();
        }
        this.f395769i.mo123319d(intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01fe  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123334g(android.content.Intent r20, int r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            com.google.common.base.ax r0 = com.google.android.apps.gsa.h.k.b.d(r20)
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x0238
            dagger.a r0 = r1.f395766f
            if (r0 != 0) goto L_0x0015
            r19.mo123332e()
        L_0x0015:
            java.lang.String r0 = "extra_sna_bootstrap_source"
            r3 = 2
            r2.putExtra(r0, r3)
            android.os.Bundle r0 = r20.getExtras()
            r4 = 0
            if (r0 == 0) goto L_0x003d
            java.lang.String r5 = "notification_entries"
            boolean r6 = r0.containsKey(r5)
            if (r6 == 0) goto L_0x003d
            com.google.common.b.gu r0 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150936b(r0, r5)
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x0035
            goto L_0x003d
        L_0x0035:
            r5 = 0
            java.lang.Object r0 = r0.get(r5)
            com.google.ai.b.hj r0 = (com.google.p375ai.p378b.C7718hj) r0
            goto L_0x003e
        L_0x003d:
            r0 = r4
        L_0x003e:
            java.util.List r5 = com.google.android.apps.gsa.sidekick.shared.util.C91972aw.m150928c(r20)
            r6 = 8
            r7 = 1
            r10 = r21
            if (r10 != r7) goto L_0x004b
            r8 = 1
            goto L_0x004d
        L_0x004b:
            r8 = 8
        L_0x004d:
            java.lang.String r9 = "lobby_initial_tab"
            int r8 = r2.getIntExtra(r9, r8)
            com.google.android.apps.gsa.shared.monet.b.af.n r8 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.m146767a(r8)
            if (r0 == 0) goto L_0x0091
            int r11 = r0.f26929A
            int r12 = com.google.p375ai.p378b.C8144xd.m22956a(r11)
            if (r12 != 0) goto L_0x0062
            goto L_0x0091
        L_0x0062:
            if (r12 == r7) goto L_0x0091
            int r8 = com.google.p375ai.p378b.C8144xd.m22956a(r11)
            if (r8 != 0) goto L_0x006b
            r8 = 1
        L_0x006b:
            int r8 = r8 + -1
            if (r8 == 0) goto L_0x0076
            if (r8 == r7) goto L_0x0076
            if (r8 == r3) goto L_0x0076
        L_0x0073:
            com.google.android.apps.gsa.shared.monet.b.af.n r8 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.INTERESTS_TAB
            goto L_0x0091
        L_0x0076:
            if (r8 == 0) goto L_0x008f
            if (r8 == r7) goto L_0x0073
            if (r8 != r3) goto L_0x007f
            com.google.android.apps.gsa.shared.monet.b.af.n r8 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.UPDATES_TAB
            goto L_0x0091
        L_0x007f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No mapping available for sidekick.TabType "
            java.lang.String r3 = java.lang.Integer.toString(r8)
            java.lang.String r2 = r2.concat(r3)
            r0.<init>(r2)
            throw r0
        L_0x008f:
            com.google.android.apps.gsa.shared.monet.b.af.n r8 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.UNKNOWN_TAB
        L_0x0091:
            r11 = r8
            int r8 = r11.f251999l
            r2.putExtra(r9, r8)
            if (r0 == 0) goto L_0x00aa
            int r8 = r0.f26955a
            r8 = r8 & 4
            if (r8 == 0) goto L_0x00aa
            com.google.ai.b.fo r0 = r0.f26968i
            if (r0 != 0) goto L_0x00a5
            com.google.ai.b.fo r0 = com.google.p375ai.p378b.C7669fo.f26633e
        L_0x00a5:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x00d0
        L_0x00aa:
            java.lang.String r0 = "notification_target_content_id"
            byte[] r0 = r2.getByteArrayExtra(r0)
            if (r0 != 0) goto L_0x00b4
        L_0x00b2:
            r0 = r4
            goto L_0x00cc
        L_0x00b4:
            com.google.ai.b.fo r8 = com.google.p375ai.p378b.C7669fo.f26633e     // Catch:{ ct -> 0x00bd }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (byte[]) r0)     // Catch:{ ct -> 0x00bd }
            com.google.ai.b.fo r0 = (com.google.p375ai.p378b.C7669fo) r0     // Catch:{ ct -> 0x00bd }
            goto L_0x00cc
        L_0x00bd:
            r0 = move-exception
            com.google.common.f.e r8 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.f256479a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r9 = "Error parsing ContentId proto"
            r12 = 11947(0x2eab, float:1.6741E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r0)).mo56372aa(r12)).mo56386p(r9)
            goto L_0x00b2
        L_0x00cc:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
        L_0x00d0:
            com.google.common.base.ax r8 = com.google.android.apps.gsa.sidekick.shared.util.C91972aw.m150926a(r20)
            com.google.android.apps.gsa.sidekick.shared.util.au r9 = com.google.android.apps.gsa.sidekick.shared.util.C91970au.f256468a
            com.google.common.base.ax r14 = r8.mo56106b(r9)
            com.google.android.libraries.gsa.monet.shared.y r15 = new com.google.android.libraries.gsa.monet.shared.y
            java.lang.String r8 = "searchnow"
            java.lang.String r9 = "TYPE_SEARCHNOW"
            r15.<init>(r8, r9)
            dagger.a r8 = r1.f395766f
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.aj.a.a r8 = (com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a) r8
            java.lang.String r12 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r20)
            java.lang.String r9 = "extra_kansas_version_info"
            java.lang.String r13 = r2.getStringExtra(r9)
            java.lang.String r9 = "go_to_feed_on_back"
            boolean r9 = r2.getBooleanExtra(r9, r7)
            com.google.common.base.ax r16 = com.google.android.apps.gsa.sidekick.shared.util.C91972aw.m150927b(r20)
            j$.util.Optional r3 = com.google.android.googlequicksearchbox.LegacySearchActivity.m238542b(r20)
            java.lang.Object r3 = r3.orElse(r4)
            com.google.android.apps.search.googleapp.h.r r3 = (com.google.android.apps.search.googleapp.p10310h.C136137r) r3
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90833j(r3)
            r4 = 0
            r17 = -1
            r18 = r9
            r9 = r11
            r10 = r21
            r11 = r4
            r4 = r13
            r13 = r17
            com.google.android.apps.gsa.shared.monet.b.v.b r8 = r8.mo78226i(r9, r10, r11, r12, r13)
            boolean r9 = r0.mo56113h()
            if (r9 == 0) goto L_0x013c
            java.lang.Object r0 = r0.mo56107c()
            com.google.ai.b.fo r0 = (com.google.p375ai.p378b.C7669fo) r0
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.shared.monet.b.v.g r9 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r9
            com.google.android.apps.gsa.shared.monet.b.v.g r10 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g.f252163T
            r0.getClass()
            r9.f252190f = r0
            int r0 = r9.f252185a
            r0 = r0 | r6
            r9.f252185a = r0
        L_0x013c:
            if (r4 == 0) goto L_0x014f
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.gsa.shared.monet.b.v.g r0 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r0
            com.google.android.apps.gsa.shared.monet.b.v.g r6 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g.f252163T
            int r6 = r0.f252185a
            r6 = r6 | 128(0x80, float:1.794E-43)
            r0.f252185a = r6
            r0.f252194j = r4
        L_0x014f:
            java.util.Iterator r0 = r5.iterator()
        L_0x0153:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01b7
            java.lang.Object r4 = r0.next()
            android.util.Pair r4 = (android.util.Pair) r4
            com.google.android.apps.gsa.shared.monet.b.r.b r5 = com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90273b.f252145d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.shared.monet.b.r.a r5 = (com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90272a) r5
            java.lang.Object r6 = r4.first
            com.google.ai.b.hj r6 = (com.google.p375ai.p378b.C7718hj) r6
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            com.google.android.apps.gsa.shared.monet.b.r.b r9 = (com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90273b) r9
            r6.getClass()
            r9.f252148b = r6
            int r6 = r9.f252147a
            r6 = r6 | r7
            r9.f252147a = r6
            java.lang.Object r4 = r4.second
            com.google.ai.b.g r4 = (com.google.p375ai.p378b.C7681g) r4
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.gsa.shared.monet.b.r.b r6 = (com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90273b) r6
            int r4 = r4.f26835cv
            r6.f252149c = r4
            int r4 = r6.f252147a
            r9 = 2
            r4 = r4 | r9
            r6.f252147a = r4
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.android.apps.gsa.shared.monet.b.v.g r4 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r4
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.apps.gsa.shared.monet.b.r.b r5 = (com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90273b) r5
            com.google.android.apps.gsa.shared.monet.b.v.g r6 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g.f252163T
            r5.getClass()
            com.google.protobuf.cq r6 = r4.f252191g
            boolean r10 = r6.mo58948c()
            if (r10 != 0) goto L_0x01b1
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r4.f252191g = r6
        L_0x01b1:
            com.google.protobuf.cq r4 = r4.f252191g
            r4.add(r5)
            goto L_0x0153
        L_0x01b7:
            boolean r0 = r16.mo56113h()
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r0 = r16.mo56107c()
            com.google.android.apps.gsa.sidekick.shared.monet.c.al r0 = (com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91788al) r0
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.android.apps.gsa.shared.monet.b.v.g r4 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r4
            com.google.android.apps.gsa.shared.monet.b.v.g r5 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g.f252163T
            r0.getClass()
            r4.f252198n = r0
            int r0 = r4.f252185a
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r4.f252185a = r0
        L_0x01d7:
            boolean r0 = r14.mo56113h()
            if (r0 == 0) goto L_0x01f8
            java.lang.Object r0 = r14.mo56107c()
            java.lang.String r0 = (java.lang.String) r0
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.android.apps.gsa.shared.monet.b.v.g r4 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r4
            com.google.android.apps.gsa.shared.monet.b.v.g r5 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g.f252163T
            r0.getClass()
            int r5 = r4.f252185a
            r6 = 1048576(0x100000, float:1.469368E-39)
            r5 = r5 | r6
            r4.f252185a = r5
            r4.f252206v = r0
        L_0x01f8:
            boolean r0 = r3.mo56113h()
            if (r0 == 0) goto L_0x0218
            java.lang.Object r0 = r3.mo56107c()
            com.google.android.apps.search.googleapp.h.r r0 = (com.google.android.apps.search.googleapp.p10310h.C136137r) r0
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r3
            com.google.android.apps.gsa.shared.monet.b.v.g r4 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g.f252163T
            r0.getClass()
            r3.f252182R = r0
            int r0 = r3.f252186b
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r3.f252186b = r0
        L_0x0218:
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.gsa.shared.monet.b.v.g r0 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r0
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g.f252163T
            int r3 = r0.f252185a
            r3 = r3 | 4
            r0.f252185a = r3
            r3 = r18
            r0.f252189e = r3
            com.google.protobuf.bv r0 = r8.build()
            com.google.android.apps.gsa.shared.monet.b.v.g r0 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r0
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r0 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43556a(r0)
            com.google.android.apps.gsa.shared.monet.p7116h.C90334c.m146889d(r2, r15, r0)
        L_0x0238:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.googlequicksearchbox.C146543f.mo123334g(android.content.Intent, int):void");
    }
}
