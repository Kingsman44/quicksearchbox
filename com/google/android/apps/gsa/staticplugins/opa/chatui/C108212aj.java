package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.gsa.search.shared.p6928f.C87545a;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3910e.p3911a.C51205t;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4017at.p4060h.p4068b.p4069a.C54200q;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.p4017at.p4060h.p4068b.p4069a.p4070a.C54184b;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.aj */
/* compiled from: PG */
public final class C108212aj extends C108232bc {

    /* renamed from: a */
    public static final C59071e f300975a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.aj");

    /* renamed from: b */
    public View f300976b;

    /* renamed from: c */
    public final int f300977c;

    /* renamed from: d */
    public int f300978d;

    /* renamed from: e */
    public C54201r f300979e;

    /* renamed from: f */
    public C51953ff f300980f;

    /* renamed from: g */
    public C51205t f300981g;

    /* renamed from: h */
    public C108211ai f300982h;

    public C108212aj(View view, int i) {
        super((byte[]) null);
        this.f300976b = view;
        this.f300977c = i;
        this.f300978d = i != 1 ? i != 6 ? i != 9 ? i != 10 ? 27224 : 129667 : 76767 : 57179 : 33290;
    }

    /* renamed from: b */
    public final void mo96595b(String str, Map map) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f300976b, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(160);
        ofFloat.setInterpolator(new LinearInterpolator());
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f300976b.getMeasuredHeight(), 0});
        ofInt.addUpdateListener(new C108208af(this));
        ofInt.addListener(new C108209ag(this, str, map));
        ofInt.setStartDelay(130);
        ofInt.setDuration(320);
        ofInt.setInterpolator(new DecelerateInterpolator());
        animatorSet.playSequentially(new Animator[]{ofFloat, ofInt});
        animatorSet.start();
    }

    /* renamed from: c */
    public final void mo96596c(C54201r rVar, C87545a aVar, C51205t tVar) {
        try {
            aVar.mo77517d(new C108210ah(this, aVar));
            C54200q qVar = (C54200q) C54201r.f142243f.createBuilder();
            C56425d dVar = (C56425d) C62942bv.parseFrom((C62942bv) C56425d.f150537g, aVar.mo77518e());
            qVar.copyOnWrite();
            C54201r rVar2 = (C54201r) qVar.instance;
            dVar.getClass();
            rVar2.f142246b = dVar;
            rVar2.f142245a |= 1;
            C62971cq cqVar = rVar.f142247c;
            qVar.copyOnWrite();
            C54201r rVar3 = (C54201r) qVar.instance;
            C62971cq cqVar2 = rVar3.f142247c;
            if (!cqVar2.mo58948c()) {
                rVar3.f142247c = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) rVar3.f142247c);
            if ((rVar.f142245a & 2) != 0) {
                C54184b bVar = rVar.f142248d;
                if (bVar == null) {
                    bVar = C54184b.f142198a;
                }
                qVar.copyOnWrite();
                C54201r rVar4 = (C54201r) qVar.instance;
                bVar.getClass();
                rVar4.f142248d = bVar;
                rVar4.f142245a |= 2;
            }
            this.f300979e = (C54201r) qVar.build();
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f300975a.mo56226d()).mo56382g(e)).mo56372aa(23942)).mo56389s("#saveCardData: unable to save state for card: %s", aVar);
        }
        this.f300981g = tVar;
    }

    /* renamed from: d */
    public final boolean mo96597d() {
        return true;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return this.f300978d;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 2;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        int i;
        C28292j jVar = this.f301030l;
        if (jVar == null) {
            return null;
        }
        jVar.mo33795i(5);
        if (this.f301034p == 2 || (i = this.f300977c) == 1 || i == 3 || i == 6 || i == 9 || i == 8 || i == 10) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C28295m.m52916b(this.f300976b));
            return C28293k.m52907d(this.f301030l, arrayList);
        } else if (i == 0) {
            return C28293k.m52908e(this.f301030l, new C28293k[0]);
        } else {
            return null;
        }
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        View view = this.f300976b;
        if (view.getParent() != null) {
            if (view.getParent() != blVar.f301081h) {
                ((ViewGroup) view.getParent()).removeView(view);
            } else {
                return;
            }
        }
        if (bhVar.mo96660c() >= 0) {
            blVar.f301081h.setPadding(bhVar.mo96660c(), blVar.f301081h.getPaddingTop(), bhVar.mo96660c(), blVar.f301081h.getPaddingBottom());
        }
        blVar.f301081h.removeAllViews();
        blVar.f301081h.addView(view);
        if (this.f301034p == 2 && blVar.f301081h.f253398a == null) {
            GestureDetector gestureDetector = new GestureDetector(blVar.f301081h.getContext(), new C108205ac(this));
            gestureDetector.setIsLongpressEnabled(false);
            blVar.f301081h.f253398a = new C108206ad(gestureDetector);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[RETURN] */
    /* renamed from: jz */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo96576jz(com.google.android.apps.gsa.shared.util.BitFlags r7) {
        /*
            r6 = this;
            long r0 = r7.f253762b
            r2 = 4
            boolean r0 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r0, r2)
            r1 = 2
            if (r0 == 0) goto L_0x000f
            int r0 = r6.f300977c
            if (r0 == r1) goto L_0x002f
        L_0x000f:
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f301041w
            int r2 = r6.f300977c
            r3 = 3
            if (r2 != r3) goto L_0x002b
            if (r0 == 0) goto L_0x002b
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247760nI
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x002b
            long r2 = r7.f253762b
            r4 = 1024(0x400, double:5.06E-321)
            boolean r7 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r2, r4)
            if (r7 == 0) goto L_0x0030
            goto L_0x002f
        L_0x002b:
            int r7 = r6.f300977c
            if (r7 != r3) goto L_0x0030
        L_0x002f:
            return r1
        L_0x0030:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj.mo96576jz(com.google.android.apps.gsa.shared.util.BitFlags):int");
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        for (int i = 0; i < blVar.f301081h.getChildCount(); i++) {
            View childAt = blVar.f301081h.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                ((ViewGroup) childAt).setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
            }
        }
        blVar.f301081h.removeAllViews();
        blVar.f301081h.f253398a = null;
    }
}
