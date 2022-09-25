package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.aq */
/* compiled from: PG */
public final /* synthetic */ class C115130aq implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C115157bb f319538a;

    /* renamed from: b */
    public final /* synthetic */ Set f319539b;

    public /* synthetic */ C115130aq(C115157bb bbVar, Set set) {
        this.f319538a = bbVar;
        this.f319539b = set;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.apps.gsa.staticplugins.opamediaplayer.bb r0 = r8.f319538a
            java.util.Set r1 = r8.f319539b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r0.f319599j = r2
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            r0.f319600k = r1
            dagger.a r1 = r0.f319596g
            r1.getClass()
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.r r1 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r1
            java.lang.String r2 = "opa_media_player_session_data"
            r3 = 0
            byte[] r1 = r1.mo80079e(r2, r3)
            if (r1 == 0) goto L_0x0045
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r2 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f.f319625h     // Catch:{ ct -> 0x0030 }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r1)     // Catch:{ ct -> 0x0030 }
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r1 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r1     // Catch:{ ct -> 0x0030 }
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ ct -> 0x0030 }
            goto L_0x0047
        L_0x0030:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.opamediaplayer.C115157bb.f319590a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "OpaMediaPlayer"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "Invalid MediaSessionData proto stored in sharedpref."
            r4 = 29661(0x73dd, float:4.1564E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
        L_0x0045:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x0047:
            boolean r2 = r1.mo56113h()
            if (r2 == 0) goto L_0x0067
            com.google.android.apps.gsa.staticplugins.opamediaplayer.bg r2 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.bg
            android.content.Context r3 = r0.f319592c
            r3.getClass()
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f319597h
            r4.getClass()
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r1 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r1
            r2.<init>(r3, r4, r1)
            r0.f319601l = r2
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x0067:
            com.google.android.apps.gsa.staticplugins.opamediaplayer.bg r1 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.bg
            android.content.Context r2 = r0.f319592c
            r2.getClass()
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f319597h
            r3.getClass()
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r4 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f.f319625h
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.a r4 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115164a) r4
            com.google.assistant.e.j.ia r5 = com.google.assistant.p3897e.p3921j.C52176ia.f136911k
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r6 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r6
            r5.getClass()
            r6.f319628b = r5
            int r5 = r6.f319627a
            r5 = r5 | 1
            r6.f319627a = r5
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r5 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r5
            int r6 = r5.f319627a
            r6 = r6 | 4
            r5.f319627a = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.f319630d = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r5 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r5
            int r7 = r5.f319627a
            r7 = r7 | 8
            r5.f319627a = r7
            r5.f319631e = r6
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r4 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r4
            r1.<init>(r2, r3, r4)
            r0.f319601l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opamediaplayer.C115130aq.run():void");
    }
}
