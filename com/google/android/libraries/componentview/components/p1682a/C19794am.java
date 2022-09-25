package com.google.android.libraries.componentview.components.p1682a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19770o;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19772q;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19773r;
import com.google.android.libraries.componentview.components.p1693e.C20369m;
import com.google.android.libraries.componentview.p1697d.C20474e;
import com.google.android.libraries.componentview.p1697d.C20477h;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.componentview.components.a.am */
/* compiled from: PG */
public class C19794am extends C20369m {

    /* renamed from: k */
    private C19773r f55298k;

    /* renamed from: l */
    private int f55299l;

    public C19794am(Context context, C56425d dVar, C20537f fVar, Executor executor, ExecutorService executorService, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, executorService, caVar, atVar);
    }

    /* renamed from: D */
    private final void m37621D() {
        this.f57265h.f57241i = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19773r.f55240f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19773r rVar = (C19773r) obj;
        this.f55298k = rVar;
        int i = rVar.f55244c;
        if (i != 0) {
            this.f57266i = i;
        }
        int a = C19772q.m37612a(rVar.f55245d);
        if (a == 0) {
            a = 1;
        }
        this.f55299l = a;
        mo25256A(rVar.f55243b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        C19770o oVar = (C19770o) this.f55298k.toBuilder();
        if (list != null) {
            oVar.copyOnWrite();
            ((C19773r) oVar.instance).f55243b = C19773r.emptyProtobufList();
            oVar.copyOnWrite();
            C19773r rVar = (C19773r) oVar.instance;
            C62971cq cqVar = rVar.f55243b;
            if (!cqVar.mo58948c()) {
                rVar.f55243b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) rVar.f55243b);
        }
        int i = this.f55299l;
        oVar.copyOnWrite();
        C19773r rVar2 = (C19773r) oVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            rVar2.f55245d = i2;
            rVar2.f55242a |= 2;
            C56424c cVar = (C56424c) this.f57588z.toBuilder();
            cVar.mo58885m(C19773r.f55240f, (C19773r) oVar.build());
            return (C56425d) cVar.build();
        }
        throw null;
    }

    /* renamed from: k */
    public final void mo25114k() {
        for (int i = 0; i < this.f57263c.size(); i++) {
            if (i != this.f57265h.f13819c) {
                ((View) this.f57263c.get(i)).setVisibility(8);
            }
        }
        this.f57262b.setVisibility(8);
    }

    /* renamed from: kC */
    public final boolean mo25115kC(int i, C20477h hVar) {
        if (i != 6) {
            return false;
        }
        if (!(hVar instanceof C19835u)) {
            C20520h.m38497b(6, "ItemSelectionCarouselComponent", (Throwable) null, "EventData is not of type DisableItemSelectionCarouselEventData.", new Object[0]);
            return false;
        }
        C19835u uVar = (C19835u) hVar;
        this.f55299l = true != uVar.mo25143b() ? 2 : 3;
        m37621D();
        if (uVar.mo25143b()) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(new Animator[]{C20474e.m38427b(this.f57262b, 2), C20474e.m38426a(this.f56305p, uVar.mo25142a())});
            animatorSet.addListener(new C19793al(this));
            animatorSet.start();
        } else {
            C20474e.m38427b(this.f57262b, 1).start();
        }
        return true;
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
        super.mo25116kJ();
        int i = this.f55299l;
        if (i == 2) {
            m37621D();
        } else if (i == 3) {
            m37621D();
            mo25114k();
        }
    }
}
