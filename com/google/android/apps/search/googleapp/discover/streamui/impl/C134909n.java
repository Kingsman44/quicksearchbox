package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.apps.search.googleapp.discover.p10248y.C135215ac;
import com.google.android.apps.search.googleapp.discover.p10248y.C135216ad;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134743w;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.n */
/* compiled from: PG */
final class C134909n extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C134904m f367338a;

    public C134909n(C134904m mVar) {
        this.f367338a = mVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C134743w wVar;
        C134904m mVar = this.f367338a;
        C135216ad adVar = mVar.f367323p.f367201j;
        String str = adVar instanceof C135215ac ? ((C135215ac) adVar).f368313a.f368523a : null;
        if (str != null) {
            mVar.f367262K.mo112158f(str, mVar.f367265N.f366954c);
        }
        if (i == 0) {
            this.f367338a.f367300aq.f364791a.mo115307d();
            this.f367338a.f367268Q.mo111794d();
        } else if (i == 1 && (wVar = this.f367338a.f367325r.f366868d) != null) {
            wVar.mo111945h();
        }
        if (i != 0) {
            this.f367338a.f367268Q.mo111795e();
        }
        this.f367338a.f367269R.onScrollStateChanged(recyclerView, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(android.support.p033v7.widget.RecyclerView r13, int r14, int r15) {
        /*
            r12 = this;
            com.google.android.apps.search.googleapp.discover.streamui.impl.m r0 = r12.f367338a
            r0.mo112068y()
            com.google.android.apps.search.googleapp.discover.streamui.impl.m r0 = r12.f367338a
            com.google.android.apps.search.googleapp.discover.streamui.impl.j r1 = r0.f367261J
            com.google.android.apps.search.googleapp.discover.streamui.impl.g r2 = r0.mo112061r()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            r0 = 0
            goto L_0x001f
        L_0x0012:
            android.view.View r0 = r0.mo112059p()
            if (r0 == 0) goto L_0x001d
            int r0 = r0.getTop()
            goto L_0x001f
        L_0x001d:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x001f:
            java.util.Set r1 = r1.f367245a
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r1.next()
            com.google.android.apps.search.googleapp.discover.streamui.g.a r2 = (com.google.android.apps.search.googleapp.discover.streamui.p10231g.C134748a) r2
            r2.mo111560a(r15, r0)
            goto L_0x0025
        L_0x0035:
            com.google.android.apps.search.googleapp.discover.streamui.impl.m r0 = r12.f367338a
            com.google.android.apps.search.googleapp.discover.streamui.impl.p r1 = r0.f367287ad
            int r2 = r1.f367341a
            int r2 = r2 + r15
            r1.f367341a = r2
            com.google.android.apps.search.googleapp.discover.streamui.impl.g r1 = r0.mo112061r()
            r2 = 0
            if (r1 == 0) goto L_0x0105
            com.google.android.apps.search.googleapp.discover.streamui.impl.p r4 = r0.f367287ad
            int r4 = r4.f367341a
            int r4 = java.lang.Math.abs(r4)
            long r5 = r0.f367315h
            com.google.android.apps.search.googleapp.discover.streamui.impl.DiscoverRecyclerView r7 = r1.f367234b
            android.content.Context r7 = r7.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            java.lang.String r8 = "recyclerView.context.resources.displayMetrics"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            float r4 = (float) r4
            r8 = 1
            float r5 = (float) r5
            float r5 = android.util.TypedValue.applyDimension(r8, r5, r7)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x006f
            goto L_0x0105
        L_0x006f:
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.t r4 = r0.f367323p
            com.google.android.apps.search.googleapp.discover.y.ad r4 = r4.f367201j
            boolean r5 = r4 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135215ac
            if (r5 != 0) goto L_0x0079
            r4 = r2
            goto L_0x007d
        L_0x0079:
            com.google.android.apps.search.googleapp.discover.y.ac r4 = (com.google.android.apps.search.googleapp.discover.p10248y.C135215ac) r4
            com.google.android.apps.search.googleapp.discover.y.w r4 = r4.f368318f
        L_0x007d:
            if (r4 == 0) goto L_0x0105
            com.google.android.apps.search.googleapp.discover.z.p r5 = r4.f368519a
            if (r5 == 0) goto L_0x0105
            boolean r6 = r0.f367312e
            java.lang.String r7 = "nextPageAppFlowUuid"
            if (r6 == 0) goto L_0x00aa
            com.google.android.apps.search.googleapp.discover.s.ak r6 = r5.f368799a
            boolean r6 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134825as.m218660b(r6)
            if (r6 == 0) goto L_0x00aa
            com.google.android.apps.search.googleapp.discover.d.ad r1 = r0.f367256E
            com.google.android.apps.search.googleapp.discover.streamui.h r4 = r0.f367310c
            int r4 = r4.f366909b
            com.google.bv.e.m r4 = com.google.p4283bv.p4354e.C57528m.m88369a(r4)
            if (r4 != 0) goto L_0x009f
            com.google.bv.e.m r4 = com.google.p4283bv.p4354e.C57528m.UNKNOWN_SURFACE
        L_0x009f:
            java.util.UUID r1 = r1.mo111607a(r4)
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r7)
            r0.mo112065v(r5, r1)
            goto L_0x0105
        L_0x00aa:
            java.lang.Integer r6 = r1.mo112051c()
            if (r6 == 0) goto L_0x0105
            int r6 = r6.intValue()
            com.google.android.apps.search.googleapp.discover.streamui.impl.DiscoverRecyclerView r1 = r1.f367234b
            android.support.v7.widget.fb r1 = r1.mAdapter
            if (r1 == 0) goto L_0x00c3
            int r1 = r1.getItemCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00dc
        L_0x00c3:
            com.google.common.f.e r1 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134898g.f367233a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r8 = new com.google.common.f.n
            r9 = 40465(0x9e11, float:5.6704E-41)
            r8.<init>(r9)
            r1.mo56379ah(r8)
            java.lang.String r8 = "No RecyclerView adapter"
            r1.mo56386p(r8)
            r1 = r2
        L_0x00dc:
            if (r1 == 0) goto L_0x0105
            int r1 = r1.intValue()
            int r4 = r4.f368521c
            int r1 = r1 + r4
            int r1 = r1 - r6
            long r8 = (long) r1
            long r10 = r0.f367314g
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x0105
            com.google.android.apps.search.googleapp.discover.d.ad r1 = r0.f367256E
            com.google.android.apps.search.googleapp.discover.streamui.h r4 = r0.f367310c
            int r4 = r4.f366909b
            com.google.bv.e.m r4 = com.google.p4283bv.p4354e.C57528m.m88369a(r4)
            if (r4 != 0) goto L_0x00fb
            com.google.bv.e.m r4 = com.google.p4283bv.p4354e.C57528m.UNKNOWN_SURFACE
        L_0x00fb:
            java.util.UUID r1 = r1.mo111607a(r4)
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r7)
            r0.mo112065v(r5, r1)
        L_0x0105:
            com.google.android.apps.search.googleapp.discover.streamui.impl.m r0 = r12.f367338a
            com.google.android.apps.search.googleapp.discover.streamui.impl.g r1 = r0.mo112061r()
            if (r1 == 0) goto L_0x02cf
            if (r15 != 0) goto L_0x0111
            goto L_0x02cf
        L_0x0111:
            java.lang.String r4 = "No content currently loaded."
            java.lang.String r5 = "requestConfig"
            java.lang.String r6 = "fragmentCreationTime"
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"
            if (r15 <= 0) goto L_0x01f6
            java.lang.Integer r1 = r1.mo112050b()
            if (r1 != 0) goto L_0x013b
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.f367250a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 40499(0x9e33, float:5.6751E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "No visible content when scrolling down."
            r0.mo56386p(r1)
            goto L_0x02cf
        L_0x013b:
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.t r8 = r0.f367323p
            int r1 = r1.intValue()
            j$.time.Instant r9 = r0.mo111948b()
            com.google.android.apps.search.googleapp.discover.u.dx r10 = r0.f367288ae
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r5)
            com.google.android.apps.search.googleapp.discover.y.ad r5 = r8.f367201j
            if (r5 == 0) goto L_0x0156
            com.google.android.apps.search.googleapp.discover.y.aa r6 = r5.mo112170b()
            goto L_0x0157
        L_0x0156:
            r6 = r2
        L_0x0157:
            boolean r11 = r6 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135274y
            if (r11 != 0) goto L_0x015d
            goto L_0x02ca
        L_0x015d:
            int r11 = r8.f367200i
            int r1 = r1 - r11
            if (r5 == 0) goto L_0x019f
            java.util.List r11 = r5.mo112171c()
            int r11 = r11.size()
            if (r1 < r11) goto L_0x0176
            java.util.List r1 = r5.mo112171c()
            int r1 = r1.size()
            int r1 = r1 + -1
        L_0x0176:
            java.util.List r5 = r5.mo112171c()
            h.j.c r11 = new h.j.c
            r11.<init>(r3, r1)
            java.util.List r1 = p5462h.p5463a.C69540x.m100835Q(r5, r11)
            java.util.List r1 = p5462h.p5463a.C69540x.m100815v(r1)
            h.l.k r1 = p5462h.p5463a.C69540x.m100847ac(r1)
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.n r3 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134882n.f367186a
            h.l.k r1 = p5462h.p5482l.C69734n.m101140h(r1, r3)
            p5462h.p5473f.p5475b.C69664n.m101059e(r1, r7)
            java.lang.Object r1 = p5462h.p5482l.C69734n.m101137e(r1)
            com.google.android.apps.search.googleapp.discover.y.e r1 = (com.google.android.apps.search.googleapp.discover.p10248y.C135254e) r1
            if (r1 == 0) goto L_0x019f
            java.lang.String r1 = r1.f368467b
            goto L_0x01a0
        L_0x019f:
            r1 = r2
        L_0x01a0:
            if (r1 != 0) goto L_0x01c9
            com.google.android.apps.search.googleapp.discover.y.ad r1 = r8.f367201j
            if (r1 == 0) goto L_0x01c8
            java.util.List r1 = r1.mo112171c()
            if (r1 == 0) goto L_0x01c8
            h.l.k r1 = p5462h.p5463a.C69540x.m100847ac(r1)
            if (r1 == 0) goto L_0x01c8
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.r r3 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134886r.f367190a
            h.l.k r1 = p5462h.p5482l.C69734n.m101140h(r1, r3)
            p5462h.p5473f.p5475b.C69664n.m101059e(r1, r7)
            if (r1 == 0) goto L_0x01c8
            java.lang.Object r1 = p5462h.p5482l.C69734n.m101137e(r1)
            com.google.android.apps.search.googleapp.discover.y.e r1 = (com.google.android.apps.search.googleapp.discover.p10248y.C135254e) r1
            if (r1 == 0) goto L_0x01c8
            java.lang.String r1 = r1.f368467b
            goto L_0x01c9
        L_0x01c8:
            r1 = r2
        L_0x01c9:
            if (r1 != 0) goto L_0x01e3
            com.google.common.f.e r1 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134888t.f367193b
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r3 = new com.google.common.f.n
            r5 = 40521(0x9e49, float:5.6782E-41)
            r3.<init>(r5)
            r1.mo56379ah(r3)
            r1.mo56386p(r4)
            goto L_0x02ca
        L_0x01e3:
            int r2 = r8.f367199h
            com.google.android.apps.search.googleapp.discover.y.a r3 = new com.google.android.apps.search.googleapp.discover.y.a
            com.google.android.apps.search.googleapp.discover.y.y r6 = (com.google.android.apps.search.googleapp.discover.p10248y.C135274y) r6
            java.lang.String r4 = r6.f368523a
            com.google.android.apps.search.googleapp.discover.z.ba r5 = com.google.android.apps.search.googleapp.discover.p10249z.C135327ba.FORWARD
            r3.<init>(r1, r4, r5)
            com.google.android.apps.search.googleapp.discover.y.b r2 = com.google.android.apps.search.googleapp.discover.p10248y.C135243bd.m219379a(r2, r9, r3, r10)
            goto L_0x02ca
        L_0x01f6:
            java.lang.Integer r1 = r1.mo112051c()
            if (r1 != 0) goto L_0x0216
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.f367250a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 40498(0x9e32, float:5.675E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "No visible content when scrolling up."
            r0.mo56386p(r1)
            goto L_0x02cf
        L_0x0216:
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.t r8 = r0.f367323p
            int r1 = r1.intValue()
            j$.time.Instant r9 = r0.mo111948b()
            com.google.android.apps.search.googleapp.discover.u.dx r10 = r0.f367288ae
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r5)
            com.google.android.apps.search.googleapp.discover.y.ad r5 = r8.f367201j
            if (r5 == 0) goto L_0x0231
            com.google.android.apps.search.googleapp.discover.y.aa r6 = r5.mo112170b()
            goto L_0x0232
        L_0x0231:
            r6 = r2
        L_0x0232:
            boolean r11 = r6 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135274y
            if (r11 != 0) goto L_0x0238
            goto L_0x02ca
        L_0x0238:
            int r11 = r8.f367200i
            int r1 = r1 + r11
            if (r5 == 0) goto L_0x0270
            if (r1 >= 0) goto L_0x0240
            goto L_0x0241
        L_0x0240:
            r3 = r1
        L_0x0241:
            java.util.List r1 = r5.mo112171c()
            h.j.c r11 = new h.j.c
            java.util.List r5 = r5.mo112171c()
            int r5 = r5.size()
            int r5 = r5 + -1
            r11.<init>(r3, r5)
            java.util.List r1 = p5462h.p5463a.C69540x.m100835Q(r1, r11)
            h.l.k r1 = p5462h.p5463a.C69540x.m100847ac(r1)
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.m r3 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134881m.f367185a
            h.l.k r1 = p5462h.p5482l.C69734n.m101140h(r1, r3)
            p5462h.p5473f.p5475b.C69664n.m101059e(r1, r7)
            java.lang.Object r1 = p5462h.p5482l.C69734n.m101137e(r1)
            com.google.android.apps.search.googleapp.discover.y.e r1 = (com.google.android.apps.search.googleapp.discover.p10248y.C135254e) r1
            if (r1 == 0) goto L_0x0270
            java.lang.String r1 = r1.f368467b
            goto L_0x0271
        L_0x0270:
            r1 = r2
        L_0x0271:
            if (r1 != 0) goto L_0x02a0
            com.google.android.apps.search.googleapp.discover.y.ad r1 = r8.f367201j
            if (r1 == 0) goto L_0x029f
            java.util.List r1 = r1.mo112171c()
            if (r1 == 0) goto L_0x029f
            java.util.List r1 = p5462h.p5463a.C69540x.m100815v(r1)
            if (r1 == 0) goto L_0x029f
            h.l.k r1 = p5462h.p5463a.C69540x.m100847ac(r1)
            if (r1 == 0) goto L_0x029f
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.s r3 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134887s.f367191a
            h.l.k r1 = p5462h.p5482l.C69734n.m101140h(r1, r3)
            p5462h.p5473f.p5475b.C69664n.m101059e(r1, r7)
            if (r1 == 0) goto L_0x029f
            java.lang.Object r1 = p5462h.p5482l.C69734n.m101137e(r1)
            com.google.android.apps.search.googleapp.discover.y.e r1 = (com.google.android.apps.search.googleapp.discover.p10248y.C135254e) r1
            if (r1 == 0) goto L_0x029f
            java.lang.String r1 = r1.f368467b
            goto L_0x02a0
        L_0x029f:
            r1 = r2
        L_0x02a0:
            if (r1 != 0) goto L_0x02b9
            com.google.common.f.e r1 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134888t.f367193b
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r3 = new com.google.common.f.n
            r5 = 40520(0x9e48, float:5.678E-41)
            r3.<init>(r5)
            r1.mo56379ah(r3)
            r1.mo56386p(r4)
            goto L_0x02ca
        L_0x02b9:
            int r2 = r8.f367199h
            com.google.android.apps.search.googleapp.discover.y.a r3 = new com.google.android.apps.search.googleapp.discover.y.a
            com.google.android.apps.search.googleapp.discover.y.y r6 = (com.google.android.apps.search.googleapp.discover.p10248y.C135274y) r6
            java.lang.String r4 = r6.f368523a
            com.google.android.apps.search.googleapp.discover.z.ba r5 = com.google.android.apps.search.googleapp.discover.p10249z.C135327ba.BACKWARD
            r3.<init>(r1, r4, r5)
            com.google.android.apps.search.googleapp.discover.y.b r2 = com.google.android.apps.search.googleapp.discover.p10248y.C135243bd.m219379a(r2, r9, r3, r10)
        L_0x02ca:
            if (r2 == 0) goto L_0x02cf
            r0.mo112064u(r2)
        L_0x02cf:
            com.google.android.apps.search.googleapp.discover.streamui.impl.m r0 = r12.f367338a
            com.google.android.apps.search.googleapp.discover.loggingsignals.e r0 = r0.f367269R
            r0.onScrolled(r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.impl.C134909n.onScrolled(android.support.v7.widget.RecyclerView, int, int):void");
    }
}
