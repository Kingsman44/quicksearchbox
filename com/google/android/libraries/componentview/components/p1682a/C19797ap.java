package com.google.android.libraries.componentview.components.p1682a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.p119j.p120a.p121a.C2300b;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19774s;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19775t;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20474e;
import com.google.android.libraries.componentview.p1697d.C20477h;
import com.google.android.libraries.componentview.p1697d.C20479j;
import com.google.android.libraries.componentview.services.application.C20550ad;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20589bp;
import com.google.android.libraries.componentview.services.application.C20593bt;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4522b.C58485gu;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.a.ap */
/* compiled from: PG */
public class C19797ap extends C20078ci implements C20589bp {

    /* renamed from: a */
    private C19775t f55312a;

    /* renamed from: b */
    private boolean f55313b;

    /* renamed from: c */
    private final C20550ad f55314c;

    public C19797ap(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20550ad adVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
        this.f55314c = adVar;
    }

    /* renamed from: m */
    private static final boolean m37629m(C20470a aVar) {
        if (!(aVar instanceof C20479j)) {
            return false;
        }
        C20479j jVar = (C20479j) aVar;
        if (jVar.mo25122kI()) {
            return false;
        }
        return jVar.mo25121j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setDividerPadding(20);
        return linearLayout;
    }

    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19775t.f55248f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19775t tVar = (C19775t) obj;
        this.f55312a = tVar;
        this.f55313b = tVar.f55253d;
        if (tVar.f55251b.size() != 0) {
            mo25256A(this.f55312a.f55251b);
            if (this.f55313b) {
                C58485gu j = C58485gu.m89842j(this.f56324d);
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    C20470a aVar = (C20470a) j.get(i);
                    View kH = aVar.mo25098kH();
                    if (kH != null) {
                        if (!m37629m(aVar)) {
                            if (this.f55312a.f55252c) {
                                kH.setVisibility(8);
                            } else {
                                kH.setAlpha(0.25f);
                            }
                        }
                        kH.setClickable(false);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        C19774s sVar = (C19774s) this.f55312a.toBuilder();
        boolean z = this.f55313b;
        sVar.copyOnWrite();
        C19775t tVar = (C19775t) sVar.instance;
        tVar.f55250a |= 4;
        tVar.f55253d = z;
        if (list != null) {
            sVar.copyOnWrite();
            ((C19775t) sVar.instance).f55251b = C19775t.emptyProtobufList();
            sVar.copyOnWrite();
            C19775t tVar2 = (C19775t) sVar.instance;
            C62971cq cqVar = tVar2.f55251b;
            if (!cqVar.mo58948c()) {
                tVar2.f55251b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) tVar2.f55251b);
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19775t.f55248f, (C19775t) sVar.build());
        return (C56425d) cVar.build();
    }

    /* renamed from: k */
    public final void mo25117k(C20593bt btVar) {
    }

    /* renamed from: kC */
    public final boolean mo25115kC(int i, C20477h hVar) {
        if (i != 5) {
            return false;
        }
        this.f55313b = true;
        boolean z = this.f55312a.f55252c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C58485gu j = C58485gu.m89842j(this.f56324d);
        int size = j.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C20470a aVar = (C20470a) j.get(i3);
            View kH = aVar.mo25098kH();
            if (kH != null) {
                if (!m37629m(aVar)) {
                    arrayList.add(C20474e.m38427b(kH, true != z ? 1 : 3));
                } else if (z) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kH, View.TRANSLATION_Y, new float[]{(float) (kH.getTop() - i2), 0.0f});
                    ofFloat.setDuration(240);
                    ofFloat.setInterpolator(new C2300b());
                    arrayList2.add(ofFloat);
                    i2 += kH.getHeight();
                }
                kH.setClickable(false);
            }
        }
        if (z) {
            arrayList2.add(C20474e.m38426a(this.f56305p, i2));
        }
        mo25421J(6, new C19834t(z, i2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(new Animator[]{animatorSet, animatorSet2});
        animatorSet3.start();
        return true;
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }

    public final void onViewAttachedToWindow(View view) {
        if (mo25097c() != null) {
            C20550ad adVar = this.f55314c;
            String c = mo25097c();
            c.getClass();
            adVar.mo25483a(c, this);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        if (mo25097c() != null) {
            C20550ad adVar = this.f55314c;
            String c = mo25097c();
            c.getClass();
            adVar.mo25484b(c, this);
        }
    }
}
