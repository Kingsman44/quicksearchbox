package com.google.android.libraries.componentview.components.p1682a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.p119j.p120a.p121a.C2300b;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.C20069c;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19776u;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19777v;
import com.google.android.libraries.componentview.components.p1689c.C20314p;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20472c;
import com.google.android.libraries.componentview.p1697d.C20474e;
import com.google.android.libraries.componentview.p1697d.C20477h;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20608ch;
import com.google.android.libraries.componentview.services.application.C20617h;
import com.google.android.libraries.componentview.services.application.NavigationParams;
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

/* renamed from: com.google.android.libraries.componentview.components.a.at */
/* compiled from: PG */
public class C19801at extends C20078ci {

    /* renamed from: a */
    public int f55329a;

    /* renamed from: b */
    private C19777v f55330b;

    /* renamed from: c */
    private boolean f55331c;

    /* renamed from: g */
    private final C19820f f55332g;

    /* renamed from: h */
    private C20470a f55333h;

    /* renamed from: i */
    private C20470a f55334i;

    public C19801at(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C19820f fVar2, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
        this.f55332g = fVar2;
    }

    /* renamed from: D */
    private final void m37638D() {
        C20470a aVar;
        C19777v vVar = this.f55330b;
        if ((vVar.f55258a & 4) != 0 && (aVar = this.f55334i) != null) {
            String str = vVar.f55262e;
            try {
                if (C20069c.class.isInstance(aVar)) {
                    C20069c.class.cast(aVar).mo25244m(String.format(str, new Object[]{Integer.valueOf(m37639m())}));
                    return;
                }
                C58485gu K = aVar.mo25422K(C20069c.class);
                if (!K.isEmpty()) {
                    ((C20069c) K.get(0)).mo25244m(String.format(str, new Object[]{Integer.valueOf(m37639m())}));
                    return;
                }
                C20520h.m38497b(5, "MultiSelectionComponent", (Throwable) null, "Result message is provided but no BaselineTextView found.", new Object[0]);
            } catch (Exception unused) {
                C20520h.m38497b(5, "MultiSelectionComponent", (Throwable) null, "Couldn't format result string ".concat(String.valueOf(str)), new Object[0]);
            }
        }
    }

    /* renamed from: m */
    private final int m37639m() {
        C58485gu K = mo25422K(C20314p.class);
        int size = K.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C20314p pVar = (C20314p) K.get(i2);
            if (pVar.f57088b.isChecked() && !C20482m.m38447o(pVar.f57087a.f56591g)) {
                i++;
            }
        }
        return i;
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
        View kH;
        View kH2;
        C62940bt r0 = C62942bv.checkIsLite(C19777v.f55256i);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19777v vVar = (C19777v) obj;
        this.f55330b = vVar;
        this.f55331c = vVar.f55263f;
        if ((vVar.f55258a & 1) != 0) {
            C56425d dVar2 = vVar.f55260c;
            if (dVar2 == null) {
                dVar2 = C56425d.f150537g;
            }
            this.f55333h = mo25258n(dVar2);
        }
        if (this.f55330b.f55259b.size() != 0) {
            mo25256A(this.f55330b.f55259b);
        }
        C19777v vVar2 = this.f55330b;
        if ((vVar2.f55258a & 2) != 0) {
            C56425d dVar3 = vVar2.f55261d;
            if (dVar3 == null) {
                dVar3 = C56425d.f150537g;
            }
            this.f55334i = mo25258n(dVar3);
        }
        if (this.f55331c) {
            C58485gu j = C58485gu.m89842j(this.f56324d);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                C20470a aVar = (C20470a) j.get(i);
                if (!(aVar == this.f55333h || aVar == this.f55334i || (kH2 = aVar.mo25098kH()) == null)) {
                    kH2.setVisibility(8);
                }
            }
            m37638D();
            return;
        }
        C20470a aVar2 = this.f55334i;
        if (aVar2 != null && (kH = aVar2.mo25098kH()) != null) {
            kH.getViewTreeObserver().addOnGlobalLayoutListener(new C19800as(this, kH));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        C19776u uVar = (C19776u) this.f55330b.toBuilder();
        boolean z = this.f55331c;
        uVar.copyOnWrite();
        C19777v vVar = (C19777v) uVar.instance;
        vVar.f55258a |= 8;
        vVar.f55263f = z;
        if (list != null) {
            if ((this.f55330b.f55258a & 1) != 0) {
                C56425d dVar = (C56425d) list.remove(0);
                uVar.copyOnWrite();
                C19777v vVar2 = (C19777v) uVar.instance;
                dVar.getClass();
                vVar2.f55260c = dVar;
                vVar2.f55258a |= 1;
            }
            if ((this.f55330b.f55258a & 2) != 0) {
                C56425d dVar2 = (C56425d) list.remove(list.size() - 1);
                uVar.copyOnWrite();
                C19777v vVar3 = (C19777v) uVar.instance;
                dVar2.getClass();
                vVar3.f55261d = dVar2;
                vVar3.f55258a |= 2;
            }
            uVar.copyOnWrite();
            ((C19777v) uVar.instance).f55259b = C19777v.emptyProtobufList();
            uVar.copyOnWrite();
            C19777v vVar4 = (C19777v) uVar.instance;
            C62971cq cqVar = vVar4.f55259b;
            if (!cqVar.mo58948c()) {
                vVar4.f55259b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) vVar4.f55259b);
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19777v.f55256i, (C19777v) uVar.build());
        return (C56425d) cVar.build();
    }

    /* renamed from: kC */
    public final boolean mo25115kC(int i, C20477h hVar) {
        Animator animator;
        View kH;
        if (i != 5) {
            return false;
        }
        this.f55331c = true;
        if (this.f55330b.f55264g) {
            C58485gu K = mo25422K(C20314p.class);
            int size = K.size();
            String str = BuildConfig.FLAVOR;
            for (int i2 = 0; i2 < size; i2++) {
                C20314p pVar = (C20314p) K.get(i2);
                if (pVar.f57088b.isChecked() && !C20482m.m38447o(pVar.f57087a.f56591g)) {
                    str = str + pVar.f57087a.f56591g + ", ";
                }
            }
            if (!str.isEmpty()) {
                C19820f fVar = this.f55332g;
                if (str.endsWith(", ")) {
                    str = str.substring(0, str.length() - 2);
                }
                String format = String.format("intent://www.google.com/search?q=%1$s#Intent;S.com.google.opa.QUERY=%1$s;S.com.google.opa.DISPLAY_QUERY=%1$s;scheme=http;end", new Object[]{str});
                C20608ch c = NavigationParams.m38563c();
                c.mo25556b(true);
                ((C20617h) c).f57836a = Long.valueOf(fVar.f55409b.f57684a.nextLong());
                fVar.f55408a.mo21039a(format, c.mo25555a());
            }
        }
        m37638D();
        ArrayList arrayList = new ArrayList();
        C58485gu j = C58485gu.m89842j(this.f56324d);
        int size2 = j.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C20470a aVar = (C20470a) j.get(i3);
            if (!(aVar == this.f55333h || aVar == this.f55334i || (kH = aVar.mo25098kH()) == null)) {
                arrayList.add(C20474e.m38427b(kH, 3));
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        C20470a aVar2 = this.f55334i;
        View kH2 = aVar2 != null ? aVar2.mo25098kH() : null;
        if (kH2 != null) {
            animator = ObjectAnimator.ofFloat(kH2, View.ALPHA, new float[]{0.0f, 1.0f});
            animator.setDuration(80);
            animator.setInterpolator(new C2300b());
            animator.addListener(new C20472c(kH2));
        } else {
            animator = new AnimatorSet();
        }
        animator.setStartDelay(160);
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        View view = this.f56305p;
        int i4 = this.f55329a;
        C20470a aVar3 = this.f55333h;
        if (aVar3 != null) {
            View kH3 = aVar3.mo25098kH();
            i4 += kH3 != null ? kH3.getHeight() : 0;
        }
        animatorArr[0] = C20474e.m38426a(view, i4);
        animatorArr[1] = animator;
        animatorSet2.playTogether(animatorArr);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(new Animator[]{animatorSet, animatorSet2});
        animatorSet3.start();
        return true;
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }
}
