package com.google.android.apps.gsa.searchnow;

import android.content.Intent;
import com.google.android.apps.gsa.shared.p7124p.p7125a.C90447d;
import com.google.android.libraries.searchbox.shared.response.C41658m;
import com.google.android.libraries.searchbox.shared.response.C41659n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.gsa.searchnow.h */
/* compiled from: PG */
final class C88871h {

    /* renamed from: a */
    private static final C59071e f240649a = C59071e.m91332i("com.google.android.apps.gsa.searchnow.h");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0284, code lost:
        if (r17 != false) goto L_0x0286;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.common.base.C58833ax m144313a(android.content.Intent r16, boolean r17, boolean r18) {
        /*
            r1 = r16
            java.lang.String r2 = "agsa_classic_collections_initial_url_path_suffix"
            if (r1 == 0) goto L_0x02ea
            java.lang.String r3 = "search-now-activity-destination"
            boolean r0 = r1.hasExtra(r3)
            if (r0 != 0) goto L_0x0010
            goto L_0x02ea
        L_0x0010:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.MAIN"
            r4.<init>(r0)
            android.content.ComponentName r0 = r16.getComponent()
            r4.setComponent(r0)
            java.lang.String r0 = "SKIP_EXIT_ANIMATION"
            r5 = 1
            r4.putExtra(r0, r5)
            java.lang.String r0 = "go_to_feed_on_back"
            r6 = 0
            r4.putExtra(r0, r6)
            java.lang.String r0 = "agsa-classic-bootstrap-data"
            boolean r7 = r1.hasExtra(r0)
            java.lang.String r8 = "AgsaClassicDestUtils"
            if (r7 != 0) goto L_0x0037
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x008c
        L_0x0037:
            com.google.android.apps.gsa.shared.p.a.b r7 = com.google.android.apps.gsa.shared.p7124p.p7125a.C90445b.f252668a     // Catch:{ ct -> 0x0077 }
            com.google.protobuf.ba r9 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0077 }
            com.google.protobuf.MessageLite r0 = com.google.protobuf.contrib.android.ProtoParsers.m95519b(r1, r0, r7, r9)     // Catch:{ ct -> 0x0077 }
            com.google.android.apps.gsa.shared.p.a.b r0 = (com.google.android.apps.gsa.shared.p7124p.p7125a.C90445b) r0     // Catch:{ ct -> 0x0077 }
            com.google.protobuf.bt r7 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90292h.f252211a     // Catch:{ ct -> 0x0077 }
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)     // Catch:{ ct -> 0x0077 }
            r0.mo58887l(r7)     // Catch:{ ct -> 0x0077 }
            com.google.protobuf.bf r9 = r0.f169962ag     // Catch:{ ct -> 0x0077 }
            com.google.protobuf.bs r7 = r7.f169971d     // Catch:{ ct -> 0x0077 }
            boolean r7 = r9.mo58857o(r7)     // Catch:{ ct -> 0x0077 }
            if (r7 == 0) goto L_0x008a
            com.google.protobuf.bt r7 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90292h.f252211a     // Catch:{ ct -> 0x0077 }
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)     // Catch:{ ct -> 0x0077 }
            r0.mo58887l(r7)     // Catch:{ ct -> 0x0077 }
            com.google.protobuf.bf r0 = r0.f169962ag     // Catch:{ ct -> 0x0077 }
            com.google.protobuf.bs r9 = r7.f169971d     // Catch:{ ct -> 0x0077 }
            java.lang.Object r0 = r0.mo58854l(r9)     // Catch:{ ct -> 0x0077 }
            if (r0 != 0) goto L_0x006c
            java.lang.Object r0 = r7.f169969b     // Catch:{ ct -> 0x0077 }
            goto L_0x0070
        L_0x006c:
            java.lang.Object r0 = r7.mo58889c(r0)     // Catch:{ ct -> 0x0077 }
        L_0x0070:
            com.google.android.apps.gsa.shared.monet.b.v.g r0 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r0     // Catch:{ ct -> 0x0077 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ ct -> 0x0077 }
            goto L_0x008c
        L_0x0077:
            r0 = move-exception
            com.google.common.f.e r7 = f240649a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r9, r8)
            java.lang.String r9 = "Failed to get bootstrap data from the intent"
            r10 = 10039(0x2737, float:1.4068E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r0)).mo56372aa(r10)).mo56386p(r9)
        L_0x008a:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x008c:
            boolean r7 = r0.mo56113h()
            if (r7 == 0) goto L_0x009f
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.shared.monet.b.v.g r0 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r0
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.apps.gsa.shared.monet.b.v.b r0 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90286b) r0
            goto L_0x00a7
        L_0x009f:
            com.google.android.apps.gsa.shared.monet.b.v.g r0 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g.f252163T
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.shared.monet.b.v.b r0 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90286b) r0
        L_0x00a7:
            com.google.android.apps.gsa.h.q.d r7 = com.google.android.apps.gsa.h.q.d.c     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.ba r9 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.MessageLite r3 = com.google.protobuf.contrib.android.ProtoParsers.m95519b(r1, r3, r7, r9)     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.h.q.d r3 = (com.google.android.apps.gsa.h.q.d) r3     // Catch:{ ct -> 0x02d4 }
            int r3 = r3.b     // Catch:{ ct -> 0x02d4 }
            int r3 = com.google.android.apps.gsa.p5855h.p5860q.C74540c.m120514a(r3)     // Catch:{ ct -> 0x02d4 }
            if (r3 != 0) goto L_0x00bc
            r3 = 1
        L_0x00bc:
            int r3 = r3 + -1
            java.lang.String r7 = ""
            java.lang.String r9 = "query"
            java.lang.String r10 = "android.search.action.GLOBAL_SEARCH"
            r11 = 3
            java.lang.String r12 = "reuse_search_now_activity"
            switch(r3) {
                case 1: goto L_0x024a;
                case 2: goto L_0x01c2;
                case 3: goto L_0x01e9;
                case 4: goto L_0x019f;
                case 5: goto L_0x012e;
                case 6: goto L_0x00f8;
                case 7: goto L_0x00ce;
                default: goto L_0x00ca;
            }
        L_0x00ca:
            com.google.common.f.e r0 = f240649a     // Catch:{ ct -> 0x02d4 }
            goto L_0x02b9
        L_0x00ce:
            java.lang.String r2 = "and.gsa.widget.logo"
            java.lang.String r3 = "source"
            r4.putExtra(r3, r2)     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.af.n r2 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.INTERESTS_TAB     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r3     // Catch:{ ct -> 0x02d4 }
            int r2 = r2.f251999l     // Catch:{ ct -> 0x02d4 }
            r3.f252187c = r2     // Catch:{ ct -> 0x02d4 }
            int r2 = r3.f252185a     // Catch:{ ct -> 0x02d4 }
            r2 = r2 | r5
            r3.f252185a = r2     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r2 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r2     // Catch:{ ct -> 0x02d4 }
            r2.f252188d = r5     // Catch:{ ct -> 0x02d4 }
            int r3 = r2.f252185a     // Catch:{ ct -> 0x02d4 }
            r3 = r3 | 2
            r2.f252185a = r3     // Catch:{ ct -> 0x02d4 }
            goto L_0x0284
        L_0x00f8:
            com.google.android.apps.gsa.shared.monet.b.af.n r2 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.NO_TAB     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r3     // Catch:{ ct -> 0x02d4 }
            int r2 = r2.f251999l     // Catch:{ ct -> 0x02d4 }
            r3.f252187c = r2     // Catch:{ ct -> 0x02d4 }
            int r2 = r3.f252185a     // Catch:{ ct -> 0x02d4 }
            r2 = r2 | r5
            r3.f252185a = r2     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r2 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r2     // Catch:{ ct -> 0x02d4 }
            r2.f252188d = r11     // Catch:{ ct -> 0x02d4 }
            int r3 = r2.f252185a     // Catch:{ ct -> 0x02d4 }
            r3 = r3 | 2
            r2.f252185a = r3     // Catch:{ ct -> 0x02d4 }
            com.google.common.base.ax r2 = m144314b(r16)     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.searchnow.g r3 = new com.google.android.apps.gsa.searchnow.g     // Catch:{ ct -> 0x02d4 }
            r3.<init>(r0)     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.util.C90730an.m148190c(r2, r3)     // Catch:{ ct -> 0x02d4 }
            android.content.Intent r2 = r4.setAction(r10)     // Catch:{ ct -> 0x02d4 }
            r2.putExtra(r9, r7)     // Catch:{ ct -> 0x02d4 }
            goto L_0x0284
        L_0x012e:
            com.google.android.apps.gsa.shared.monet.b.af.n r3 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.COLLECTIONS_TAB     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r7 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r7 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r7     // Catch:{ ct -> 0x02d4 }
            int r3 = r3.f251999l     // Catch:{ ct -> 0x02d4 }
            r7.f252187c = r3     // Catch:{ ct -> 0x02d4 }
            int r3 = r7.f252185a     // Catch:{ ct -> 0x02d4 }
            r3 = r3 | r5
            r7.f252185a = r3     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r3     // Catch:{ ct -> 0x02d4 }
            r3.f252188d = r5     // Catch:{ ct -> 0x02d4 }
            int r5 = r3.f252185a     // Catch:{ ct -> 0x02d4 }
            r5 = r5 | 2
            r3.f252185a = r5     // Catch:{ ct -> 0x02d4 }
            boolean r3 = r1.hasExtra(r2)     // Catch:{ ct -> 0x02d4 }
            if (r3 == 0) goto L_0x0284
            boolean r3 = r1.hasExtra(r2)     // Catch:{ ct -> 0x02d4 }
            if (r3 != 0) goto L_0x015e
            com.google.android.apps.gsa.shared.monet.b.g.e r2 = com.google.android.apps.gsa.shared.monet.p7070b.p7088g.C90240e.f252086e     // Catch:{ ct -> 0x02d4 }
            goto L_0x018b
        L_0x015e:
            java.lang.String r2 = r1.getStringExtra(r2)     // Catch:{ ct -> 0x02d4 }
            boolean r3 = com.google.common.base.C58837ba.m90859h(r2)     // Catch:{ ct -> 0x02d4 }
            if (r3 == 0) goto L_0x016b
            com.google.android.apps.gsa.shared.monet.b.g.e r2 = com.google.android.apps.gsa.shared.monet.p7070b.p7088g.C90240e.f252086e     // Catch:{ ct -> 0x02d4 }
            goto L_0x018b
        L_0x016b:
            com.google.android.apps.gsa.shared.monet.b.g.e r3 = com.google.android.apps.gsa.shared.monet.p7070b.p7088g.C90240e.f252086e     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.g.d r3 = (com.google.android.apps.gsa.shared.monet.p7070b.p7088g.C90239d) r3     // Catch:{ ct -> 0x02d4 }
            r3.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.g.e r5 = (com.google.android.apps.gsa.shared.monet.p7070b.p7088g.C90240e) r5     // Catch:{ ct -> 0x02d4 }
            r2.getClass()     // Catch:{ ct -> 0x02d4 }
            int r7 = r5.f252088a     // Catch:{ ct -> 0x02d4 }
            r7 = r7 | 4
            r5.f252088a = r7     // Catch:{ ct -> 0x02d4 }
            r5.f252091d = r2     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r2 = r3.build()     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.g.e r2 = (com.google.android.apps.gsa.shared.monet.p7070b.p7088g.C90240e) r2     // Catch:{ ct -> 0x02d4 }
        L_0x018b:
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r3     // Catch:{ ct -> 0x02d4 }
            r2.getClass()     // Catch:{ ct -> 0x02d4 }
            r3.f252199o = r2     // Catch:{ ct -> 0x02d4 }
            int r2 = r3.f252185a     // Catch:{ ct -> 0x02d4 }
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            r3.f252185a = r2     // Catch:{ ct -> 0x02d4 }
            goto L_0x0284
        L_0x019f:
            com.google.android.apps.gsa.shared.monet.b.af.n r2 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.INTERESTS_TAB     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r3     // Catch:{ ct -> 0x02d4 }
            int r2 = r2.f251999l     // Catch:{ ct -> 0x02d4 }
            r3.f252187c = r2     // Catch:{ ct -> 0x02d4 }
            int r2 = r3.f252185a     // Catch:{ ct -> 0x02d4 }
            r2 = r2 | r5
            r3.f252185a = r2     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r2 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r2     // Catch:{ ct -> 0x02d4 }
            r2.f252188d = r5     // Catch:{ ct -> 0x02d4 }
            int r3 = r2.f252185a     // Catch:{ ct -> 0x02d4 }
            r3 = r3 | 2
            r2.f252185a = r3     // Catch:{ ct -> 0x02d4 }
            goto L_0x0284
        L_0x01c2:
            java.lang.String r2 = "search-options-proto"
            com.google.android.apps.gsa.shared.search.b.g r3 = com.google.android.apps.gsa.shared.search.p7138b.C90491g.f252884z     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.search.b.e r3 = (com.google.android.apps.gsa.shared.search.p7138b.C90489e) r3     // Catch:{ ct -> 0x02d4 }
            r3.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r13 = r3.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.search.b.g r13 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r13     // Catch:{ ct -> 0x02d4 }
            int r14 = r13.f252886a     // Catch:{ ct -> 0x02d4 }
            r15 = 524288(0x80000, float:7.34684E-40)
            r14 = r14 | r15
            r13.f252886a = r14     // Catch:{ ct -> 0x02d4 }
            r13.f252905t = r5     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.search.b.g r3 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r3     // Catch:{ ct -> 0x02d4 }
            java.lang.String r3 = com.google.android.apps.gsa.shared.search.C90506n.m147606a(r3)     // Catch:{ ct -> 0x02d4 }
            r4.putExtra(r2, r3)     // Catch:{ ct -> 0x02d4 }
        L_0x01e9:
            if (r17 == 0) goto L_0x0215
            if (r18 == 0) goto L_0x0215
            boolean r2 = r1.getBooleanExtra(r12, r6)     // Catch:{ ct -> 0x02d4 }
            if (r2 == 0) goto L_0x0215
            com.google.android.apps.gsa.shared.monet.b.af.n r2 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.SEARCH_TAB     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r3     // Catch:{ ct -> 0x02d4 }
            int r2 = r2.f251999l     // Catch:{ ct -> 0x02d4 }
            r3.f252187c = r2     // Catch:{ ct -> 0x02d4 }
            int r2 = r3.f252185a     // Catch:{ ct -> 0x02d4 }
            r2 = r2 | r5
            r3.f252185a = r2     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r2 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r2     // Catch:{ ct -> 0x02d4 }
            r2.f252188d = r5     // Catch:{ ct -> 0x02d4 }
            int r3 = r2.f252185a     // Catch:{ ct -> 0x02d4 }
            r3 = r3 | 2
            r2.f252185a = r3     // Catch:{ ct -> 0x02d4 }
            goto L_0x0286
        L_0x0215:
            com.google.android.apps.gsa.shared.monet.b.af.n r2 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.NO_TAB     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r3     // Catch:{ ct -> 0x02d4 }
            int r2 = r2.f251999l     // Catch:{ ct -> 0x02d4 }
            r3.f252187c = r2     // Catch:{ ct -> 0x02d4 }
            int r2 = r3.f252185a     // Catch:{ ct -> 0x02d4 }
            r2 = r2 | r5
            r3.f252185a = r2     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r2 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r2     // Catch:{ ct -> 0x02d4 }
            r2.f252188d = r11     // Catch:{ ct -> 0x02d4 }
            int r3 = r2.f252185a     // Catch:{ ct -> 0x02d4 }
            r3 = r3 | 2
            r2.f252185a = r3     // Catch:{ ct -> 0x02d4 }
            com.google.common.base.ax r2 = m144314b(r16)     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.searchnow.f r3 = new com.google.android.apps.gsa.searchnow.f     // Catch:{ ct -> 0x02d4 }
            r3.<init>(r0)     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.util.C90730an.m148190c(r2, r3)     // Catch:{ ct -> 0x02d4 }
            android.content.Intent r2 = r4.setAction(r10)     // Catch:{ ct -> 0x02d4 }
            r2.putExtra(r9, r7)     // Catch:{ ct -> 0x02d4 }
            goto L_0x0284
        L_0x024a:
            java.lang.String r2 = "EXTRA_FEEDBACK_SCREENSHOT_FILENAME"
            java.lang.String r2 = r1.getStringExtra(r2)     // Catch:{ ct -> 0x02d4 }
            if (r2 == 0) goto L_0x0263
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r3     // Catch:{ ct -> 0x02d4 }
            int r7 = r3.f252185a     // Catch:{ ct -> 0x02d4 }
            r9 = 32768(0x8000, float:4.5918E-41)
            r7 = r7 | r9
            r3.f252185a = r7     // Catch:{ ct -> 0x02d4 }
            r3.f252201q = r2     // Catch:{ ct -> 0x02d4 }
        L_0x0263:
            com.google.android.apps.gsa.shared.monet.b.af.n r2 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.DRAWER_TAB     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r3     // Catch:{ ct -> 0x02d4 }
            int r2 = r2.f251999l     // Catch:{ ct -> 0x02d4 }
            r3.f252187c = r2     // Catch:{ ct -> 0x02d4 }
            int r2 = r3.f252185a     // Catch:{ ct -> 0x02d4 }
            r2 = r2 | r5
            r3.f252185a = r2     // Catch:{ ct -> 0x02d4 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x02d4 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ ct -> 0x02d4 }
            com.google.android.apps.gsa.shared.monet.b.v.g r2 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r2     // Catch:{ ct -> 0x02d4 }
            r2.f252188d = r5     // Catch:{ ct -> 0x02d4 }
            int r3 = r2.f252185a     // Catch:{ ct -> 0x02d4 }
            r3 = r3 | 2
            r2.f252185a = r3     // Catch:{ ct -> 0x02d4 }
        L_0x0284:
            if (r17 == 0) goto L_0x028d
        L_0x0286:
            boolean r1 = r1.getBooleanExtra(r12, r6)
            r4.putExtra(r12, r1)
        L_0x028d:
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.shared.monet.b.v.g r0 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r0
            int r1 = r0.f252187c
            com.google.android.apps.gsa.shared.monet.b.af.n r1 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.m146767a(r1)
            if (r1 != 0) goto L_0x029d
            com.google.android.apps.gsa.shared.monet.b.af.n r1 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.UNKNOWN_TAB
        L_0x029d:
            java.lang.String r2 = "lobby_initial_tab"
            int r1 = r1.f251999l
            r4.putExtra(r2, r1)
            com.google.android.libraries.gsa.monet.shared.y r1 = new com.google.android.libraries.gsa.monet.shared.y
            java.lang.String r2 = "searchnow"
            java.lang.String r3 = "TYPE_SEARCHNOW"
            r1.<init>(r2, r3)
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r0 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43556a(r0)
            com.google.android.apps.gsa.shared.monet.p7116h.C90334c.m146889d(r4, r1, r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r4)
            return r0
        L_0x02b9:
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ ct -> 0x02d4 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x02d4 }
            r0.mo56378ag(r1, r8)     // Catch:{ ct -> 0x02d4 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x02d4 }
            r1 = 10042(0x273a, float:1.4072E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ ct -> 0x02d4 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x02d4 }
            java.lang.String r1 = "Unsupported in SearchNowActivity destination"
            r0.mo56386p(r1)     // Catch:{ ct -> 0x02d4 }
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ ct -> 0x02d4 }
            return r0
        L_0x02d4:
            r0 = move-exception
            com.google.common.f.e r1 = f240649a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r8)
            java.lang.String r2 = "Failed to get SearchNowActivityDestination from the intent"
            r3 = 10041(0x2739, float:1.407E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x02ea:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchnow.C88871h.m144313a(android.content.Intent, boolean, boolean):com.google.common.base.ax");
    }

    /* renamed from: b */
    private static C58833ax m144314b(Intent intent) {
        Object obj;
        if (!intent.hasExtra("agsa-classic-suggest-bootstrap-data")) {
            return C58836b.f156633a;
        }
        try {
            C90447d dVar = (C90447d) ProtoParsers.m95519b(intent, "agsa-classic-suggest-bootstrap-data", C90447d.f252671a, C62921ba.m95368a());
            C62940bt r0 = C62942bv.checkIsLite(C41659n.f108903a);
            dVar.mo58887l(r0);
            if (dVar.f169962ag.mo58857o(r0.f169971d)) {
                C62940bt r02 = C62942bv.checkIsLite(C41659n.f108903a);
                dVar.mo58887l(r02);
                Object l = dVar.f169962ag.mo58854l(r02.f169971d);
                if (l == null) {
                    obj = r02.f169969b;
                } else {
                    obj = r02.mo58889c(l);
                }
                return C58833ax.m90834k((C41658m) obj);
            }
        } catch (C62974ct e) {
            C59104x c = f240649a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaClassicDestUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10040)).mo56386p("Failed to get suggest bootstrap data from the intent");
        }
        return C58836b.f156633a;
    }
}
