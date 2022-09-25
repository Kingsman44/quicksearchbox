package com.google.android.libraries.componentview.components.elements;

import com.google.android.libraries.componentview.components.elements.p1696a.C20390o;
import com.google.android.libraries.componentview.components.elements.p1696a.C20391p;
import com.google.android.libraries.componentview.p1697d.C20483n;
import com.google.android.libraries.componentview.services.application.C20588bo;
import com.google.android.libraries.componentview.services.application.C20609ci;
import com.google.android.libraries.componentview.services.application.C20611ck;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;

/* renamed from: com.google.android.libraries.componentview.components.elements.ay */
/* compiled from: PG */
public class C20424ay extends C20483n {

    /* renamed from: a */
    public final C20537f f57424a;

    /* renamed from: b */
    public C20391p f57425b;

    /* renamed from: c */
    private final C20588bo f57426c;

    /* renamed from: d */
    private final C20611ck f57427d;

    /* renamed from: e */
    private final C20609ci f57428e;

    public C20424ay(C56425d dVar, C20588bo boVar, C20611ck ckVar, C20537f fVar, C20609ci ciVar) {
        super(dVar);
        this.f57424a = fVar;
        this.f57428e = ciVar;
        this.f57426c = boVar;
        this.f57427d = ckVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C20390o oVar = (C20390o) this.f57425b.toBuilder();
            oVar.copyOnWrite();
            C20391p pVar = (C20391p) oVar.instance;
            pVar.f57346b = dVar;
            pVar.f57345a |= 1;
            this.f57425b = (C20391p) oVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20391p.f57343h, this.f57425b);
        return (C56425d) cVar.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: kC */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25115kC(int r12, com.google.android.libraries.componentview.p1697d.C20477h r13) {
        /*
            r11 = this;
            java.lang.String r0 = "ImageViewerComponent"
            r1 = 2
            r2 = 0
            if (r12 != r1) goto L_0x00ad
            if (r13 == 0) goto L_0x00ad
            boolean r12 = r13 instanceof com.google.android.libraries.componentview.components.elements.C20423ax
            if (r12 != 0) goto L_0x000e
            goto L_0x00ad
        L_0x000e:
            com.google.android.libraries.componentview.components.elements.ax r13 = (com.google.android.libraries.componentview.components.elements.C20423ax) r13
            r12 = 6
            r1 = 0
            com.google.android.libraries.componentview.components.elements.a.p r3 = r11.f57425b     // Catch:{ Exception -> 0x006c }
            boolean r4 = r3.f57350f     // Catch:{ Exception -> 0x006c }
            if (r4 != 0) goto L_0x0074
            boolean r4 = r3.f57348d     // Catch:{ Exception -> 0x006c }
            if (r4 == 0) goto L_0x0051
            com.google.android.libraries.componentview.services.application.ck r5 = r11.f57427d     // Catch:{ Exception -> 0x006c }
            java.lang.String r6 = r3.f57349e     // Catch:{ Exception -> 0x006c }
            java.lang.String r7 = r3.f57347c     // Catch:{ Exception -> 0x006c }
            int r8 = r13.mo25387a()     // Catch:{ Exception -> 0x006c }
            com.google.bq.d r3 = r11.f57588z     // Catch:{ Exception -> 0x006c }
            int r4 = r3.f150539a     // Catch:{ Exception -> 0x006c }
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0038
            com.google.bq.h r3 = r3.f150542d     // Catch:{ Exception -> 0x006c }
            if (r3 != 0) goto L_0x0034
            com.google.bq.h r3 = com.google.p4271bq.C56429h.f150547k     // Catch:{ Exception -> 0x006c }
        L_0x0034:
            java.lang.String r3 = r3.f150557i     // Catch:{ Exception -> 0x006c }
            r9 = r3
            goto L_0x0039
        L_0x0038:
            r9 = r1
        L_0x0039:
            com.google.bq.d r3 = r11.f57588z     // Catch:{ Exception -> 0x006c }
            int r4 = r3.f150539a     // Catch:{ Exception -> 0x006c }
            r4 = r4 & 4
            if (r4 == 0) goto L_0x004b
            com.google.bq.h r3 = r3.f150542d     // Catch:{ Exception -> 0x006c }
            if (r3 != 0) goto L_0x0047
            com.google.bq.h r3 = com.google.p4271bq.C56429h.f150547k     // Catch:{ Exception -> 0x006c }
        L_0x0047:
            java.lang.String r3 = r3.f150556h     // Catch:{ Exception -> 0x006c }
            r10 = r3
            goto L_0x004c
        L_0x004b:
            r10 = r1
        L_0x004c:
            android.content.Intent r3 = r5.mo25492a(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x006c }
            goto L_0x0075
        L_0x0051:
            android.graphics.Rect r3 = r13.mo25388b()     // Catch:{ Exception -> 0x006c }
            if (r3 == 0) goto L_0x005c
            com.google.android.libraries.componentview.services.application.bo r3 = r11.f57426c     // Catch:{ Exception -> 0x006c }
            r3.mo25481b()     // Catch:{ Exception -> 0x006c }
        L_0x005c:
            com.google.android.libraries.componentview.services.application.bo r3 = r11.f57426c     // Catch:{ Exception -> 0x006c }
            com.google.android.libraries.componentview.components.elements.a.p r4 = r11.f57425b     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = r4.f57347c     // Catch:{ Exception -> 0x006c }
            r3.mo25482c()     // Catch:{ Exception -> 0x006c }
            com.google.android.libraries.componentview.services.application.bo r3 = r11.f57426c     // Catch:{ Exception -> 0x006c }
            android.content.Intent r3 = r3.mo25480a()     // Catch:{ Exception -> 0x006c }
            goto L_0x0075
        L_0x006c:
            r3 = move-exception
            java.lang.String r4 = "Failed to create Intent to launch ImageViewer."
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r12, r0, r3, r4, r5)
        L_0x0074:
            r3 = r1
        L_0x0075:
            if (r3 == 0) goto L_0x007f
            com.google.android.libraries.componentview.services.application.ci r4 = r11.f57428e
            boolean r3 = r4.mo21040b(r3)
            if (r3 != 0) goto L_0x00ab
        L_0x007f:
            com.google.android.libraries.componentview.components.elements.a.p r3 = r11.f57425b
            boolean r3 = r3.f57350f
            if (r3 != 0) goto L_0x008c
            java.lang.String r3 = "Failed to create or fire Intent to launch ImageViewer. Using fallback link..."
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r12, r0, r1, r3, r4)
        L_0x008c:
            java.lang.String r3 = r13.mo25389c()
            if (r3 == 0) goto L_0x00a4
            com.google.android.libraries.componentview.services.application.ci r12 = r11.f57428e
            java.lang.String r13 = r13.mo25389c()
            com.google.android.libraries.componentview.services.application.ch r0 = com.google.android.libraries.componentview.services.application.NavigationParams.m38563c()
            com.google.android.libraries.componentview.services.application.NavigationParams r0 = r0.mo25555a()
            r12.mo21039a(r13, r0)
            goto L_0x00ab
        L_0x00a4:
            java.lang.String r13 = "Missing fallback link. Image will not be shown."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r12, r0, r1, r13, r2)
        L_0x00ab:
            r12 = 1
            return r12
        L_0x00ad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.elements.C20424ay.mo25115kC(int, com.google.android.libraries.componentview.d.h):boolean");
    }

    /* renamed from: kx */
    public final void mo25108kx() {
    }
}
