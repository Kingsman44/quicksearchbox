package android.support.p033v7.widget;

import android.util.SparseArray;
import androidx.customview.p102a.C2140a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: android.support.v7.widget.fv */
/* compiled from: PG */
public class C0660fv {

    /* renamed from: a */
    final SparseArray f2428a = new SparseArray();

    /* renamed from: b */
    int f2429b = 0;

    /* renamed from: c */
    final Set f2430c = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: i */
    static final long m2320i(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    /* renamed from: a */
    public final int mo3016a(int i) {
        return mo3017b(i).f2424a.size();
    }

    /* renamed from: b */
    public final C0659fu mo3017b(int i) {
        C0659fu fuVar = (C0659fu) this.f2428a.get(i);
        if (fuVar != null) {
            return fuVar;
        }
        C0659fu fuVar2 = new C0659fu();
        this.f2428a.put(i, fuVar2);
        return fuVar2;
    }

    /* renamed from: c */
    public C0673gh mo3018c(int i) {
        C0659fu fuVar = (C0659fu) this.f2428a.get(i);
        if (fuVar == null || fuVar.f2424a.isEmpty()) {
            return null;
        }
        ArrayList arrayList = fuVar.f2424a;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
        } while (((C0673gh) arrayList.get(size)).isAttachedToTransitionOverlay());
        return (C0673gh) arrayList.remove(size);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3019d() {
        this.f2429b++;
    }

    /* renamed from: e */
    public void mo3020e() {
        for (int i = 0; i < this.f2428a.size(); i++) {
            C0659fu fuVar = (C0659fu) this.f2428a.valueAt(i);
            ArrayList arrayList = fuVar.f2424a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2140a.m5939b(((C0673gh) arrayList.get(i2)).itemView);
            }
            fuVar.f2424a.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo3021f() {
        this.f2429b--;
    }

    /* renamed from: g */
    public void mo3022g(C0673gh ghVar) {
        int i = ghVar.mItemViewType;
        ArrayList arrayList = mo3017b(i).f2424a;
        if (((C0659fu) this.f2428a.get(i)).f2425b <= arrayList.size()) {
            C2140a.m5939b(ghVar.itemView);
            return;
        }
        ghVar.resetInternal();
        arrayList.add(ghVar);
    }

    /* renamed from: h */
    public void mo3023h(int i, int i2) {
        C0659fu b = mo3017b(i);
        b.f2425b = i2;
        ArrayList arrayList = b.f2424a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
