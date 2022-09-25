package androidx.mediarouter.p175a;

import androidx.core.p097i.C1970e;
import com.google.common.util.concurrent.C60870cx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.mediarouter.a.as */
/* compiled from: PG */
final class C3683as {

    /* renamed from: a */
    final C3748u f11847a;

    /* renamed from: b */
    final int f11848b;

    /* renamed from: c */
    final C3685au f11849c;

    /* renamed from: d */
    final List f11850d;

    /* renamed from: e */
    public final WeakReference f11851e;

    /* renamed from: f */
    public C60870cx f11852f = null;

    /* renamed from: g */
    private final C3685au f11853g;

    /* renamed from: h */
    private final C3685au f11854h;

    /* renamed from: i */
    private boolean f11855i = false;

    /* renamed from: j */
    private boolean f11856j = false;

    public C3683as(C3679ao aoVar, C3685au auVar, C3748u uVar, int i, C3685au auVar2, Collection collection) {
        ArrayList arrayList = null;
        this.f11851e = new WeakReference(aoVar);
        this.f11849c = auVar;
        this.f11847a = uVar;
        this.f11848b = i;
        this.f11853g = aoVar.f11836r;
        this.f11854h = auVar2;
        this.f11850d = collection != null ? new ArrayList(collection) : arrayList;
        aoVar.f11830l.postDelayed(new C3681aq(this), 15000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7750a() {
        if (!this.f11855i && !this.f11856j) {
            this.f11856j = true;
            C3748u uVar = this.f11847a;
            if (uVar != null) {
                uVar.mo7821i(0);
                this.f11847a.mo7816a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo7751b() {
        C60870cx cxVar;
        C3685au auVar;
        C3687aw.m10684i();
        if (!this.f11855i && !this.f11856j) {
            C3679ao aoVar = (C3679ao) this.f11851e.get();
            if (aoVar == null || aoVar.f11844z != this || ((cxVar = this.f11852f) != null && cxVar.isCancelled())) {
                mo7750a();
                return;
            }
            this.f11855i = true;
            aoVar.f11844z = null;
            C3679ao aoVar2 = (C3679ao) this.f11851e.get();
            if (aoVar2 != null && aoVar2.f11836r == (auVar = this.f11853g)) {
                aoVar2.f11830l.mo7725a(263, auVar, this.f11848b);
                C3748u uVar = aoVar2.f11837s;
                if (uVar != null) {
                    uVar.mo7821i(this.f11848b);
                    aoVar2.f11837s.mo7816a();
                }
                if (!aoVar2.f11840v.isEmpty()) {
                    for (C3748u uVar2 : aoVar2.f11840v.values()) {
                        uVar2.mo7821i(this.f11848b);
                        uVar2.mo7816a();
                    }
                    aoVar2.f11840v.clear();
                }
                aoVar2.f11837s = null;
            }
            C3679ao aoVar3 = (C3679ao) this.f11851e.get();
            if (aoVar3 != null) {
                C3685au auVar2 = this.f11849c;
                aoVar3.f11836r = auVar2;
                aoVar3.f11837s = this.f11847a;
                C3685au auVar3 = this.f11854h;
                if (auVar3 == null) {
                    aoVar3.f11830l.mo7725a(262, new C1970e(this.f11853g, auVar2), this.f11848b);
                } else {
                    aoVar3.f11830l.mo7725a(264, new C1970e(auVar3, auVar2), this.f11848b);
                }
                aoVar3.f11840v.clear();
                aoVar3.mo7738h();
                aoVar3.mo7744n();
                List list = this.f11850d;
                if (list != null) {
                    aoVar3.f11836r.mo7759f(list);
                }
            }
        }
    }
}
