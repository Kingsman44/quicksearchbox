package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import android.content.res.Configuration;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.p */
/* compiled from: PG */
public final /* synthetic */ class C82182p implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C82192z f224613a;

    /* renamed from: b */
    public final /* synthetic */ Configuration f224614b;

    public /* synthetic */ C82182p(C82192z zVar, Configuration configuration) {
        this.f224613a = zVar;
        this.f224614b = configuration;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.z r0 = r8.f224613a
            android.content.res.Configuration r1 = r8.f224614b
            com.google.android.apps.search.assistant.surfaces.voice.ui.migration.fragment.a r2 = r0.f224639l
            r2.mo109515a(r1)
            com.google.android.apps.gsa.nga.shared.x.g r2 = r0.f224630c
            com.google.android.apps.gsa.nga.shared.x.k r2 = (com.google.android.apps.gsa.nga.shared.p6417x.C83361k) r2
            java.util.concurrent.atomic.AtomicReference r2 = r2.f227199b
            java.lang.Object r2 = r2.get()
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.j.b r2 = (com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81809b) r2
            android.view.Display r3 = r0.mo75532k()
            android.content.Context r4 = r0.f224634g
            android.content.res.Resources r4 = r4.getResources()
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.j.b r3 = com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81809b.m129993j(r3, r4, r1)
            com.google.android.apps.gsa.nga.shared.x.g r4 = r0.f224630c
            r4.mo76660b(r3)
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.j.b r4 = com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81809b.f223743a
            boolean r4 = r2.equals(r4)
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0034
        L_0x0032:
            r2 = 0
            goto L_0x007f
        L_0x0034:
            float r4 = r2.mo75333a()
            float r7 = r3.mo75333a()
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x004f
            com.google.common.f.e r2 = com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82192z.f224625b
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "isVisRestartRequired true due to fontScale change."
            r4 = 6496(0x1960, float:9.103E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
        L_0x004d:
            r2 = 1
            goto L_0x007f
        L_0x004f:
            int r4 = r2.mo75335c()
            int r7 = r3.mo75335c()
            if (r4 == r7) goto L_0x0067
            com.google.common.f.e r2 = com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82192z.f224625b
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "isVisRestartRequired true due to densityDpi change."
            r4 = 6495(0x195f, float:9.101E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            goto L_0x004d
        L_0x0067:
            boolean r2 = r2.mo75342k()
            boolean r3 = r3.mo75342k()
            if (r2 == r3) goto L_0x0032
            com.google.common.f.e r2 = com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82192z.f224625b
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "isVisRestartRequired true due to dark mode change."
            r4 = 6494(0x195e, float:9.1E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            goto L_0x004d
        L_0x007f:
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r3 = r0.f224647t
            boolean r3 = r3.mo93971b()
            if (r3 == 0) goto L_0x009f
            android.content.Context r3 = r0.f224634g
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r1 = r3.updateFrom(r1)
            boolean r1 = android.content.res.Configuration.needNewResources(r1, r5)
            if (r2 != 0) goto L_0x009d
            if (r1 == 0) goto L_0x00a0
        L_0x009d:
            r5 = 1
            goto L_0x00a0
        L_0x009f:
            r5 = r2
        L_0x00a0:
            if (r5 == 0) goto L_0x00a7
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.i r0 = r0.f224636i
            r0.mo75177e()
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82182p.run():void");
    }
}
