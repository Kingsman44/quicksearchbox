package com.google.android.apps.search.assistant.libraries.p8975g;

import com.google.android.apps.search.assistant.libraries.p8975g.p8976a.C119387b;
import com.google.android.apps.search.assistant.libraries.p8975g.p8976a.C119392g;
import com.google.android.apps.search.assistant.libraries.p8975g.p8976a.C119394i;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.libraries.g.i */
/* compiled from: PG */
public final class C119405i implements C119400d {

    /* renamed from: a */
    public final C119387b f332901a;

    /* renamed from: b */
    private final C71422aw f332902b;

    /* renamed from: c */
    private final C119392g f332903c;

    /* renamed from: d */
    private final C119394i f332904d;

    public C119405i(C71422aw awVar, C119392g gVar, C119394i iVar, C119387b bVar) {
        C69664n.m101061g(awVar, "backgroundScope");
        C69664n.m101061g(gVar, "splitInstaller");
        C69664n.m101061g(iVar, "splitUninstaller");
        C69664n.m101061g(bVar, "splitInstallHelper");
        this.f332902b = awVar;
        this.f332903c = gVar;
        this.f332904d = iVar;
        this.f332901a = bVar;
    }

    /* renamed from: a */
    public final Set mo104323a() {
        Set a = this.f332901a.mo104318a();
        C69664n.m101060f(a, "splitInstallHelper.installedModules");
        return a;
    }

    /* renamed from: b */
    public final C60870cx mo104324b(List list, C124353e eVar) {
        C69664n.m101061g(list, "modules");
        return C71663i.m104688a(C71803m.m105042c(this.f332902b, (C69585o) null, (C71424ay) null, new C119404h(this, list, eVar, (C69577g) null), 3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104326c(java.util.List r6, com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124353e r7, p5462h.p5466c.C69577g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.libraries.p8975g.C119401e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.libraries.g.e r0 = (com.google.android.apps.search.assistant.libraries.p8975g.C119401e) r0
            int r1 = r0.f332890d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f332890d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.libraries.g.e r0 = new com.google.android.apps.search.assistant.libraries.g.e
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f332888b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f332890d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r7 = r0.f332887a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0055
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r8)
            if (r7 == 0) goto L_0x0044
            com.google.common.f.a.d r8 = com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124354f.f343253a
            com.google.common.f.x r8 = r8.mo56224b()
            java.lang.String r2 = "Whole home module install attempt is being kicked off."
            r4 = 36180(0x8d54, float:5.0699E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56372aa(r4)).mo56386p(r2)
        L_0x0044:
            com.google.android.apps.search.assistant.libraries.g.a.g r8 = r5.f332903c
            com.google.android.apps.search.assistant.libraries.g.f r2 = new com.google.android.apps.search.assistant.libraries.g.f
            r2.<init>(r7)
            r0.f332887a = r7
            r0.f332890d = r3
            java.lang.Object r6 = r8.mo104320a(r6, r2, r0)
            if (r6 == r1) goto L_0x0068
        L_0x0055:
            if (r7 == 0) goto L_0x0065
            com.google.common.f.a.d r6 = com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124354f.f343253a
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r7 = "Whole home module install succeeded"
            r8 = 36184(0x8d58, float:5.0705E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r8)).mo56386p(r7)
        L_0x0065:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.libraries.p8975g.C119405i.mo104326c(java.util.List, com.google.android.apps.search.assistant.platform.wholehome.shared.jni.e, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104327d(java.util.List r5, com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124353e r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.libraries.p8975g.C119403g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.libraries.g.g r0 = (com.google.android.apps.search.assistant.libraries.p8975g.C119403g) r0
            int r1 = r0.f332895d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f332895d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.libraries.g.g r0 = new com.google.android.apps.search.assistant.libraries.g.g
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f332893b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f332895d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r6 = r0.f332892a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0046
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x0058
            com.google.android.apps.search.assistant.libraries.g.a.i r7 = r4.f332904d
            r0.f332892a = r6
            r0.f332895d = r3
            java.lang.Object r5 = r7.mo104322a(r5, r0)
            if (r5 == r1) goto L_0x0057
        L_0x0046:
            if (r6 == 0) goto L_0x0058
            com.google.common.f.a.d r5 = com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124354f.f343253a
            com.google.common.f.x r5 = r5.mo56224b()
            java.lang.String r6 = "Whole home module uninstall scheduled"
            r7 = 36186(0x8d5a, float:5.0707E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r5).mo56372aa(r7)).mo56386p(r6)
            goto L_0x0058
        L_0x0057:
            return r1
        L_0x0058:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.libraries.p8975g.C119405i.mo104327d(java.util.List, com.google.android.apps.search.assistant.platform.wholehome.shared.jni.e, h.c.g):java.lang.Object");
    }
}
