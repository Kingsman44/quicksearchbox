package com.google.android.apps.gsa.speech.p7272e.p7275c;

import android.content.Context;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.e.c.w */
/* compiled from: PG */
public final class C92286w {

    /* renamed from: a */
    public static final C58974d f257342a = C58974d.m91136j();

    /* renamed from: b */
    public final Context f257343b;

    /* renamed from: c */
    public final C22871g f257344c;

    /* renamed from: d */
    private final C68214a f257345d;

    /* renamed from: e */
    private final C68214a f257346e;

    /* renamed from: f */
    private final C68214a f257347f;

    /* renamed from: g */
    private final C68214a f257348g;

    /* renamed from: h */
    private C58833ax f257349h;

    /* renamed from: i */
    private C58833ax f257350i;

    public C92286w(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C22871g gVar) {
        C58836b bVar = C58836b.f156633a;
        this.f257349h = bVar;
        this.f257350i = bVar;
        this.f257343b = context;
        this.f257345d = aVar;
        this.f257346e = aVar2;
        this.f257347f = aVar3;
        this.f257348g = aVar4;
        this.f257344c = gVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00dc */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f5 A[Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0105 A[Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.base.C58833ax mo86965a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.common.base.ax r0 = r4.f257349h     // Catch:{ all -> 0x0153 }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x0035
            com.google.common.base.ax r0 = r4.f257350i     // Catch:{ all -> 0x0153 }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x0153 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0153 }
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x0153 }
            if (r0 != 0) goto L_0x0018
            goto L_0x0035
        L_0x0018:
            com.google.common.f.a.d r5 = f257342a     // Catch:{ all -> 0x0153 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x0153 }
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5     // Catch:{ all -> 0x0153 }
            r0 = 12419(0x3083, float:1.7403E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r0)     // Catch:{ all -> 0x0153 }
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5     // Catch:{ all -> 0x0153 }
            java.lang.String r0 = "Returned cached SODA resource dir for %s: %s"
            com.google.common.base.ax r1 = r4.f257350i     // Catch:{ all -> 0x0153 }
            com.google.common.base.ax r2 = r4.f257349h     // Catch:{ all -> 0x0153 }
            r5.mo56354G(r0, r1, r2)     // Catch:{ all -> 0x0153 }
            com.google.common.base.ax r5 = r4.f257349h     // Catch:{ all -> 0x0153 }
            monitor-exit(r4)
            return r5
        L_0x0035:
            dagger.a r0 = r4.f257347f     // Catch:{ all -> 0x0153 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0153 }
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0     // Catch:{ all -> 0x0153 }
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90005bk.f246874b     // Catch:{ all -> 0x0153 }
            boolean r0 = r0.mo79746e(r1)     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x0092
            dagger.a r0 = r4.f257348g     // Catch:{ all -> 0x0153 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0153 }
            com.google.android.libraries.assistant.auto.ondevice.d.a.a r0 = (com.google.android.libraries.assistant.auto.ondevice.p710d.p711a.C11874a) r0     // Catch:{ all -> 0x0153 }
            java.lang.String r1 = "metadata"
            j$.util.Optional r0 = r0.mo20268a(r5, r1)     // Catch:{ all -> 0x0153 }
            boolean r1 = r0.isPresent()     // Catch:{ all -> 0x0153 }
            if (r1 == 0) goto L_0x0084
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0153 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0153 }
            java.io.File r0 = r0.getAbsoluteFile()     // Catch:{ all -> 0x0153 }
            java.lang.String r0 = r0.getParent()     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x0084
            com.google.common.f.a.d r1 = f257342a     // Catch:{ all -> 0x0153 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0153 }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x0153 }
            r2 = 12417(0x3081, float:1.74E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0153 }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x0153 }
            java.lang.String r2 = "MDD LP found for locale %s at path %s!"
            r1.mo56354G(r2, r5, r0)     // Catch:{ all -> 0x0153 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ all -> 0x0153 }
            goto L_0x0130
        L_0x0084:
            com.google.common.f.a.d r0 = f257342a     // Catch:{ all -> 0x0153 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0153 }
            java.lang.String r1 = "MDD LP not found for locale %s! Checking system image but skipping NGA resources."
            r2 = 12416(0x3080, float:1.7399E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56389s(r1, r5)     // Catch:{ all -> 0x0153 }
            goto L_0x00dc
        L_0x0092:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0153 }
            android.content.Context r1 = r4.f257343b     // Catch:{ all -> 0x0153 }
            java.lang.String r2 = "g3_models"
            r3 = 0
            java.io.File r1 = r1.getDir(r2, r3)     // Catch:{ all -> 0x0153 }
            r0.<init>(r1, r5)     // Catch:{ all -> 0x0153 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0153 }
            dagger.a r1 = r4.f257345d     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            com.google.android.apps.gsa.nga.shared.ag.a.e r1 = (com.google.android.apps.gsa.nga.shared.p6309ag.p6310a.C80606e) r1     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            dagger.a r2 = r1.f221280b     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            com.google.android.libraries.gsa.k.g r2 = (com.google.android.libraries.gsa.p1876k.C22871g) r2     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            com.google.android.apps.gsa.nga.shared.ag.a.b r3 = new com.google.android.apps.gsa.nga.shared.ag.a.b     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            r3.<init>(r1, r0)     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            java.lang.String r1 = "[NGA] SharedAccessor.unpackSodaLanguagePackToDirectory"
            com.google.common.util.concurrent.cx r1 = r2.mo28207g(r1, r3)     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r1)     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            com.google.common.f.a.d r1 = f257342a     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            r2 = 12411(0x307b, float:1.7392E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            java.lang.String r2 = "Non-MDD LP found: %s"
            r1.mo56389s(r2, r0)     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ InterruptedException -> 0x0119, Exception -> 0x00dc }
            goto L_0x0130
        L_0x00dc:
            dagger.a r0 = r4.f257346e     // Catch:{ all -> 0x0153 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0153 }
            com.google.android.apps.gsa.speech.e.b.j r0 = (com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j) r0     // Catch:{ all -> 0x0153 }
            r0.mo86926e()     // Catch:{ all -> 0x0153 }
            dagger.a r0 = r4.f257346e     // Catch:{ all -> 0x0153 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0153 }
            com.google.android.apps.gsa.speech.e.b.j r0 = (com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j) r0     // Catch:{ all -> 0x0153 }
            com.google.android.apps.gsa.speech.e.b.v r0 = r0.mo86923a(r5)     // Catch:{ all -> 0x0153 }
            if (r0 != 0) goto L_0x0105
            com.google.common.f.a.d r0 = f257342a     // Catch:{ all -> 0x0153 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0153 }
            java.lang.String r1 = "No system LP found. Offline SODA ASR is unavailable and SODA init may fail."
            r2 = 12415(0x307f, float:1.7397E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0153 }
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0153 }
            goto L_0x0130
        L_0x0105:
            java.lang.String r0 = r0.f257243g     // Catch:{ all -> 0x0153 }
            com.google.common.f.a.d r1 = f257342a     // Catch:{ all -> 0x0153 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0153 }
            java.lang.String r2 = "System LP found: %s"
            r3 = 12414(0x307e, float:1.7396E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56389s(r2, r0)     // Catch:{ all -> 0x0153 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)     // Catch:{ all -> 0x0153 }
            goto L_0x0130
        L_0x0119:
            r0 = move-exception
            com.google.common.f.a.d r1 = f257342a     // Catch:{ all -> 0x0153 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0153 }
            java.lang.String r2 = "Failed to unpack LP due to thread interrupt."
            r3 = 12412(0x307c, float:1.7393E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x0153 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0153 }
            r0.interrupt()     // Catch:{ all -> 0x0153 }
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0153 }
        L_0x0130:
            r4.f257349h = r0     // Catch:{ all -> 0x0153 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r5)     // Catch:{ all -> 0x0153 }
            r4.f257350i = r0     // Catch:{ all -> 0x0153 }
            com.google.common.f.a.d r0 = f257342a     // Catch:{ all -> 0x0153 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0153 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0153 }
            r1 = 12418(0x3082, float:1.7401E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0153 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0153 }
            java.lang.String r1 = "Resolved SODA resource dir for %s: %s"
            com.google.common.base.ax r2 = r4.f257349h     // Catch:{ all -> 0x0153 }
            r0.mo56354G(r1, r5, r2)     // Catch:{ all -> 0x0153 }
            com.google.common.base.ax r5 = r4.f257349h     // Catch:{ all -> 0x0153 }
            monitor-exit(r4)
            return r5
        L_0x0153:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7272e.p7275c.C92286w.mo86965a(java.lang.String):com.google.common.base.ax");
    }

    /* renamed from: b */
    public final C60870cx mo86966b(String str) {
        return this.f257344c.mo28201a("getTisidModelFilePath", new C92285v(this, str));
    }
}
