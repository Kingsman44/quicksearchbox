package com.google.android.apps.gsa.staticplugins.nowcards.carousel;

import android.content.Context;
import android.net.Uri;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104336bk;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104928az;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView;
import com.google.android.apps.p489g.p494d.C9188bx;
import com.google.android.apps.p489g.p494d.C9201cj;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.apps.p489g.p494d.C9280x;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.carousel.r */
/* compiled from: PG */
public final class C104407r extends C0640fb {

    /* renamed from: a */
    private static final C59071e f290525a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.carousel.r");

    /* renamed from: b */
    private C9278v[] f290526b = null;

    /* renamed from: c */
    private final Context f290527c;

    /* renamed from: d */
    private final C104336bk f290528d;

    /* renamed from: e */
    private final C91671j f290529e;

    /* renamed from: f */
    private final C104395f f290530f;

    /* renamed from: g */
    private final C91728l f290531g;

    /* renamed from: h */
    private int f290532h = 0;

    public C104407r(Context context, C104336bk bkVar, C91671j jVar, C104395f fVar, C91728l lVar) {
        this.f290527c = context;
        this.f290528d = bkVar;
        this.f290529e = jVar;
        this.f290530f = fVar;
        this.f290531g = lVar;
        setHasStableIds(true);
    }

    /* renamed from: b */
    private static void m172624b(C104406q qVar, boolean z) {
        C104348l lVar = qVar.f290524a;
        if (lVar instanceof C104928az) {
            C104928az azVar = (C104928az) lVar;
            MetadataLineView metadataLineView = azVar.f292385z;
            if (metadataLineView != null) {
                metadataLineView.f292771a = z;
            }
            MetadataLineView metadataLineView2 = azVar.f292364B;
            if (metadataLineView2 != null) {
                metadataLineView2.f292771a = z;
            }
            MetadataLineView metadataLineView3 = azVar.f292365C;
            if (metadataLineView3 != null) {
                metadataLineView3.f292771a = z;
            }
            MetadataLineView metadataLineView4 = azVar.f292366D;
            if (metadataLineView4 != null) {
                metadataLineView4.f292771a = z;
            }
            MetadataLineView metadataLineView5 = azVar.f292363A;
            if (metadataLineView5 != null) {
                metadataLineView5.f292771a = z;
            }
        }
    }

    /* renamed from: c */
    private final void m172625c() {
        C91189au a = this.f290531g.mo86214a();
        int i = 0;
        while (i < 5) {
            int i2 = this.f290532h;
            C9278v[] vVarArr = this.f290526b;
            if (i2 < vVarArr.length) {
                C9278v vVar = vVarArr[i2];
                C9188bx bxVar = vVar.f32210q;
                if (bxVar == null) {
                    bxVar = C9188bx.f31714x;
                }
                if ((bxVar.f31716a & 2) != 0) {
                    C9188bx bxVar2 = vVar.f32210q;
                    if (bxVar2 == null) {
                        bxVar2 = C9188bx.f31714x;
                    }
                    C9201cj cjVar = bxVar2.f31721f;
                    if (cjVar == null) {
                        cjVar = C9201cj.f31773u;
                    }
                    a.mo85417d(Uri.parse(cjVar.f31776b));
                }
                this.f290532h++;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo94156a(C9280x xVar) {
        this.f290526b = (C9278v[]) xVar.f32223b.toArray(new C9278v[0]);
        this.f290532h = 0;
        m172625c();
        this.mObservable.mo2879a();
    }

    public final int getItemCount() {
        C9278v[] vVarArr = this.f290526b;
        if (vVarArr == null) {
            return 0;
        }
        return vVarArr.length;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        C9278v[] vVarArr = this.f290526b;
        if (vVarArr == null) {
            return 0;
        }
        C9277u a = C9277u.m23705a(vVarArr[i].f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        return a.f32164ay;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(android.support.p033v7.widget.C0673gh r9, int r10) {
        /*
            r8 = this;
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.q r9 = (com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104406q) r9
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.f r0 = r8.f290530f
            int r0 = r0.f290483c
            r1 = 1
            if (r0 != 0) goto L_0x000c
            m172624b(r9, r1)
        L_0x000c:
            com.google.android.apps.g.d.v[] r0 = r8.f290526b
            if (r0 != 0) goto L_0x0012
            goto L_0x011f
        L_0x0012:
            r0 = r0[r10]
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.apps.g.d.q r0 = (com.google.android.apps.p489g.p494d.C9273q) r0
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            int r2 = r2.f32196c
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r2)
            if (r2 != 0) goto L_0x0028
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0028:
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_LOGO
            r4 = 0
            if (r2 == r3) goto L_0x0042
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            int r2 = r2.f32196c
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r2)
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x003b:
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_WEB_LOGO
            if (r2 != r3) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r2 = 0
            goto L_0x0043
        L_0x0042:
            r2 = 1
        L_0x0043:
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            int r5 = r3.f32196c
            com.google.android.apps.g.d.u r6 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r5)
            if (r6 != 0) goto L_0x0051
            com.google.android.apps.g.d.u r6 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0051:
            com.google.android.apps.g.d.u r7 = com.google.android.apps.p489g.p494d.C9277u.TRAY_SEARCH_CHIP
            if (r6 == r7) goto L_0x0063
            com.google.android.apps.g.d.u r5 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r5)
            if (r5 != 0) goto L_0x005d
            com.google.android.apps.g.d.u r5 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x005d:
            com.google.android.apps.g.d.u r6 = com.google.android.apps.p489g.p494d.C9277u.TRAY_SEARCH_CHIP_WRAP
            if (r5 != r6) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            if (r2 == 0) goto L_0x0099
            com.google.android.apps.g.d.bx r2 = r3.f32210q
            if (r2 != 0) goto L_0x006b
            com.google.android.apps.g.d.bx r2 = com.google.android.apps.p489g.p494d.C9188bx.f31714x
        L_0x006b:
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.android.apps.g.d.bs r2 = (com.google.android.apps.p489g.p494d.C9183bs) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.g.d.bx r3 = (com.google.android.apps.p489g.p494d.C9188bx) r3
            r5 = 2
            r3.f31724i = r5
            int r5 = r3.f31716a
            r5 = r5 | 16
            r3.f31716a = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.g.d.bx r2 = (com.google.android.apps.p489g.p494d.C9188bx) r2
            r2.getClass()
            r3.f32210q = r2
            int r2 = r3.f32192a
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            r3.f32192a = r2
        L_0x0099:
            com.google.protobuf.bv r2 = r0.build()
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            com.google.android.apps.gsa.staticplugins.nowcards.base.l r3 = r9.f290524a
            r3.mo94114h(r2)
            int r2 = r8.getItemCount()
            int r2 = r2 + -1
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.f r3 = r8.f290530f
            int r5 = r3.f290483c
            r6 = -2
            if (r5 != 0) goto L_0x00b2
            r5 = -2
        L_0x00b2:
            android.support.v7.widget.fp r7 = new android.support.v7.widget.fp
            int r3 = r3.f290482b
            r7.<init>((int) r3, (int) r5)
            if (r10 != r2) goto L_0x00bf
            r7.setMargins(r4, r4, r4, r4)
            goto L_0x00d4
        L_0x00bf:
            boolean r2 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148875g()
            if (r2 != 0) goto L_0x00cd
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.f r2 = r8.f290530f
            int r2 = r2.f290481a
            r7.setMargins(r4, r4, r2, r4)
            goto L_0x00d4
        L_0x00cd:
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.f r2 = r8.f290530f
            int r2 = r2.f290481a
            r7.setMargins(r2, r4, r4, r4)
        L_0x00d4:
            android.view.View r2 = r9.itemView
            r2.setLayoutParams(r7)
            android.view.View r2 = r9.itemView
            int r3 = com.google.android.apps.gsa.sidekick.shared.p7255p.C91899a.f256246a
            r3 = 2131430466(0x7f0b0c42, float:1.8482634E38)
            java.lang.Object r2 = r2.getTag(r3)
            if (r2 == 0) goto L_0x00e7
            goto L_0x00f3
        L_0x00e7:
            android.view.View r2 = r9.itemView
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.apps.g.d.v r0 = (com.google.android.apps.p489g.p494d.C9278v) r0
            com.google.ai.b.hj r0 = r0.f32174H
            if (r0 != 0) goto L_0x00f3
            com.google.protobuf.ci r0 = com.google.p375ai.p378b.C7718hj.f26926ac
        L_0x00f3:
            int r0 = r8.f290532h
            com.google.android.apps.g.d.v[] r2 = r8.f290526b
            int r2 = r2.length
            if (r0 >= r2) goto L_0x0100
            int r0 = r0 + r6
            if (r10 < r0) goto L_0x0100
            r8.m172625c()
        L_0x0100:
            android.view.View r10 = r9.itemView
            boolean r0 = r10 instanceof androidx.cardview.widget.CardView
            if (r0 == 0) goto L_0x011f
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            r10.mo4476f()
            android.view.View r9 = r9.itemView
            androidx.cardview.widget.CardView r9 = (androidx.cardview.widget.CardView) r9
            android.content.Context r10 = r8.f290527c
            if (r1 == 0) goto L_0x0117
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x011b
        L_0x0117:
            int r10 = com.google.android.apps.gsa.now.shared.p6421ui.C83413b.m132808a(r10)
        L_0x011b:
            float r10 = (float) r10
            r9.mo4475e(r10)
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104407r.onBindViewHolder(android.support.v7.widget.gh, int):void");
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C104348l lVar;
        if (C104411v.m172629a(C9277u.m23705a(i))) {
            lVar = this.f290528d.mo94096b(this.f290527c, C104411v.f290543a);
            lVar.getClass();
        } else {
            lVar = this.f290528d.mo94096b(this.f290527c, C9277u.m23705a(i));
            lVar.getClass();
        }
        if (lVar instanceof C104404o) {
            C59104x d = f290525a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CarouselRecycleAdapt");
            ((C59052c) ((C59052c) d).mo56372aa(21971)).mo56387q("Carousel presenter created when it should not have been for type %d", i);
            lVar = this.f290528d.mo94096b(this.f290527c, C104411v.f290543a);
            lVar.getClass();
        }
        lVar.f290309d = this.f290529e;
        lVar.mo94113g(C9277u.m23705a(i), viewGroup);
        if (C104411v.m172629a(C9277u.m23705a(i)) && (lVar instanceof C104928az)) {
            C104395f fVar = this.f290530f;
            ((C104928az) lVar).mo94397L(fVar.f290482b, fVar.f290484d);
        }
        lVar.f290311f.setElevation((float) this.f290530f.f290489i);
        return new C104406q(lVar, lVar.f290311f);
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        C104406q qVar = (C104406q) ghVar;
        View view = qVar.itemView;
        qVar.f290524a.mo94036q();
        m172624b(qVar, false);
    }
}
