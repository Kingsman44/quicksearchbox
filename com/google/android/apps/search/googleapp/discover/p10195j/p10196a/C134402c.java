package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133994h;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62917ay;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64213d;
import com.google.protos.youtube.elements.C66059au;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.c */
/* compiled from: PG */
public final class C134402c implements C21312s {

    /* renamed from: a */
    private static final C59071e f366114a = C59071e.m91331h();

    /* renamed from: b */
    private final C133994h f366115b;

    public C134402c(C133994h hVar) {
        C69664n.m101061g(hVar, "carouselScrollEndLoggingActionApi");
        this.f366115b = hVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C62917ay mo25802a() {
        return C64213d.f173622c;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ p5488io.p5490b.C69794a mo25804c(java.lang.Object r10, com.google.android.libraries.elements.interfaces.C21311r r11) {
        /*
            r9 = this;
            com.google.protos.aw.c.a.a.a.c.c.a.d r10 = (com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64213d) r10
            java.lang.String r0 = "command"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            java.lang.String r0 = "eventData"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            android.view.View r2 = r11.mo26732b()
            if (r2 == 0) goto L_0x0087
            com.google.android.apps.search.googleapp.discover.a.h r0 = r9.f366115b
            com.google.bv.e.b.b.a.d r1 = r10.f173624a
            if (r1 != 0) goto L_0x001a
            com.google.bv.e.b.b.a.d r1 = com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57089d.f152405c
        L_0x001a:
            java.lang.String r1 = r1.f152407a
            java.lang.String r3 = "command.getCarouselScrol…ata().getScrollSourceId()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            java.lang.String r3 = "scrollSourceId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)
            boolean r3 = r2 instanceof android.widget.HorizontalScrollView
            r4 = 0
            if (r3 == 0) goto L_0x004b
            java.util.Map r3 = r0.f364987b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = p3186j$.util.Map.EL.getOrDefault(r3, r1, r4)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r4 = r2.getScrollX()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.util.Map r6 = r0.f364987b
            r6.put(r1, r5)
        L_0x0048:
            int r4 = r4 - r3
            r5 = r4
            goto L_0x0071
        L_0x004b:
            boolean r3 = r2 instanceof android.support.p033v7.widget.RecyclerView
            if (r3 == 0) goto L_0x0070
            java.util.Map r3 = r0.f364987b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = p3186j$.util.Map.EL.getOrDefault(r3, r1, r4)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = r2
            android.support.v7.widget.RecyclerView r4 = (android.support.p033v7.widget.RecyclerView) r4
            int r4 = r4.computeHorizontalScrollOffset()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.util.Map r6 = r0.f364987b
            r6.put(r1, r5)
            goto L_0x0048
        L_0x0070:
            r5 = 0
        L_0x0071:
            if (r5 == 0) goto L_0x0087
            com.google.android.apps.search.googleapp.discover.ab.a.c r0 = r0.f364986a
            com.google.android.libraries.b.d.a r7 = new com.google.android.libraries.b.d.a
            r1 = 6
            r7.<init>(r1)
            com.google.android.libraries.b.f.e r8 = new com.google.android.libraries.b.f.e
            r3 = 0
            r4 = 1
            r6 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r0.mo24921c(r7, r8)
        L_0x0087:
            com.google.android.libraries.elements.interfaces.ar r11 = r11.mo26735e()
            boolean r0 = r11 instanceof com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u
            if (r0 != 0) goto L_0x00b3
            com.google.common.f.e r10 = f366114a
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.n r11 = new com.google.common.f.n
            r0 = 40326(0x9d86, float:5.6509E-41)
            r11.<init>(r0)
            r10.mo56379ah(r11)
            java.lang.String r11 = "Creating a VE logger that did not use an XUiKitElementBuilder. This will break VE logging"
            r10.mo56386p(r11)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "CommandHandler requires an XUiKitElementBuilder."
            r10.<init>(r11)
            io.b.a r10 = p5488io.p5490b.C69794a.m101254f(r10)
            goto L_0x00e8
        L_0x00b3:
            com.google.bv.e.b.b.a.d r10 = r10.f173624a
            if (r10 != 0) goto L_0x00b9
            com.google.bv.e.b.b.a.d r10 = com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57089d.f152405c
        L_0x00b9:
            com.google.bv.j.b.a.b r10 = r10.f152408b
            if (r10 != 0) goto L_0x00bf
            com.google.bv.j.b.a.b r10 = com.google.p4283bv.p4380j.p4385b.p4386a.C57696b.f154137l
        L_0x00bf:
            java.lang.String r0 = "command.getCarouselScrol…ClientLoggingProperties()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            com.google.bv.j.b.a.b r0 = com.google.p4283bv.p4380j.p4385b.p4386a.C57696b.f154137l
            boolean r0 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r0)
            if (r0 != 0) goto L_0x00e4
            com.google.android.libraries.search.rendering.xuikit.a.u r11 = (com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u) r11
            com.google.android.libraries.search.rendering.xuikit.a.c.ah r11 = r11.f105299b
            com.google.common.o.l.n r0 = r10.f154142c
            if (r0 != 0) goto L_0x00d6
            com.google.common.o.l.n r0 = com.google.common.p4552o.p4566l.C60214n.f162914g
        L_0x00d6:
            int r0 = r0.f162918c
            r0 = 22
            com.google.common.o.aql r0 = com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40025af.m69528e(r0, r10)
            com.google.android.libraries.search.rendering.xuikit.a.c.af r11 = (com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40025af) r11
            r1 = 0
            r11.mo42131d(r10, r0, r1)
        L_0x00e4:
            io.b.a r10 = p5488io.p5490b.p5497e.p5502e.p5503a.C69874i.f186267a
            io.b.d.d r11 = p5488io.p5490b.p5517i.C70101a.f186847o
        L_0x00e8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10195j.p10196a.C134402c.mo25804c(java.lang.Object, com.google.android.libraries.elements.interfaces.r):io.b.a");
    }
}
