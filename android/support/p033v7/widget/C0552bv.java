package android.support.p033v7.widget;

import android.util.Log;
import android.view.ViewGroup;
import androidx.core.p097i.C1974i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.bv */
/* compiled from: PG */
public final class C0552bv extends C0640fb {

    /* renamed from: a */
    public final C0554bx f2147a;

    public C0552bv(C0551bu buVar, List list) {
        C0622ek ekVar;
        this.f2147a = new C0554bx(this, buVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0640fb fbVar = (C0640fb) it.next();
            C0554bx bxVar = this.f2147a;
            int size = bxVar.f2155e.size();
            if (size < 0 || size > bxVar.f2155e.size()) {
                throw new IndexOutOfBoundsException("Index must be between 0 and " + bxVar.f2155e.size() + ". Given:" + size);
            }
            if (bxVar.mo2632h()) {
                C1974i.m5314b(fbVar.mHasStableIds, "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
            } else if (fbVar.mHasStableIds) {
                Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
            }
            int size2 = bxVar.f2155e.size();
            int i = 0;
            while (true) {
                if (i < size2) {
                    if (((C0622ek) bxVar.f2155e.get(i)).f2381c == fbVar) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                ekVar = null;
            } else {
                ekVar = (C0622ek) bxVar.f2155e.get(i);
            }
            if (ekVar == null) {
                C0622ek ekVar2 = new C0622ek(fbVar, bxVar, bxVar.f2152b, bxVar.f2156f.mo3201a());
                bxVar.f2155e.add(size, ekVar2);
                for (WeakReference weakReference : bxVar.f2153c) {
                    RecyclerView recyclerView = (RecyclerView) weakReference.get();
                    if (recyclerView != null) {
                        fbVar.onAttachedToRecyclerView(recyclerView);
                    }
                }
                if (ekVar2.f2383e > 0) {
                    C0552bv bvVar = bxVar.f2151a;
                    bvVar.mObservable.mo2882d(bxVar.mo2625a(ekVar2), ekVar2.f2383e);
                }
                bxVar.mo2629e();
            }
        }
        super.setHasStableIds(this.f2147a.mo2632h());
    }

    public final int findRelativeAdapterPositionIn(C0640fb fbVar, C0673gh ghVar, int i) {
        C0554bx bxVar = this.f2147a;
        C0622ek ekVar = (C0622ek) bxVar.f2154d.get(ghVar);
        if (ekVar == null) {
            return -1;
        }
        int a = i - bxVar.mo2625a(ekVar);
        int itemCount = ekVar.f2381c.getItemCount();
        if (a >= 0 && a < itemCount) {
            return ekVar.f2381c.findRelativeAdapterPositionIn(fbVar, ghVar, a);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + a + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + ghVar + "adapter:" + fbVar);
    }

    public final int getItemCount() {
        return this.f2147a.mo2626b();
    }

    public final long getItemId(int i) {
        C0554bx bxVar = this.f2147a;
        C0553bw c = bxVar.mo2627c(i);
        C0622ek ekVar = c.f2148a;
        long a = ekVar.f2380b.mo3200a(ekVar.f2381c.getItemId(c.f2149b));
        bxVar.mo2631g(c);
        return a;
    }

    public final int getItemViewType(int i) {
        C0554bx bxVar = this.f2147a;
        C0553bw c = bxVar.mo2627c(i);
        C0622ek ekVar = c.f2148a;
        int b = ekVar.f2379a.mo3272b(ekVar.f2381c.getItemViewType(c.f2149b));
        bxVar.mo2631g(c);
        return b;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C0554bx bxVar = this.f2147a;
        for (WeakReference weakReference : bxVar.f2153c) {
            if (weakReference.get() == recyclerView) {
                return;
            }
        }
        bxVar.f2153c.add(new WeakReference(recyclerView));
        for (C0622ek ekVar : bxVar.f2155e) {
            ekVar.f2381c.onAttachedToRecyclerView(recyclerView);
        }
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        C0554bx bxVar = this.f2147a;
        C0553bw c = bxVar.mo2627c(i);
        bxVar.f2154d.put(ghVar, c.f2148a);
        C0622ek ekVar = c.f2148a;
        ekVar.f2381c.bindViewHolder(ghVar, c.f2149b);
        bxVar.mo2631g(c);
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0622ek a = this.f2147a.f2152b.mo3273a(i);
        return a.f2381c.onCreateViewHolder(viewGroup, a.f2379a.mo3271a(i));
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C0554bx bxVar = this.f2147a;
        int size = bxVar.f2153c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) bxVar.f2153c.get(size);
            if (weakReference.get() == null) {
                bxVar.f2153c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                bxVar.f2153c.remove(size);
                break;
            }
        }
        for (C0622ek ekVar : bxVar.f2155e) {
            ekVar.f2381c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public final boolean onFailedToRecycleView(C0673gh ghVar) {
        C0554bx bxVar = this.f2147a;
        C0622ek ekVar = (C0622ek) bxVar.f2154d.get(ghVar);
        if (ekVar != null) {
            boolean onFailedToRecycleView = ekVar.f2381c.onFailedToRecycleView(ghVar);
            bxVar.f2154d.remove(ghVar);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + ghVar + ", seems like it is not bound by this adapter: " + bxVar);
    }

    public final void onViewAttachedToWindow(C0673gh ghVar) {
        this.f2147a.mo2628d(ghVar).f2381c.onViewAttachedToWindow(ghVar);
    }

    public final void onViewDetachedFromWindow(C0673gh ghVar) {
        this.f2147a.mo2628d(ghVar).f2381c.onViewDetachedFromWindow(ghVar);
    }

    public final void onViewRecycled(C0673gh ghVar) {
        C0554bx bxVar = this.f2147a;
        C0622ek ekVar = (C0622ek) bxVar.f2154d.get(ghVar);
        if (ekVar != null) {
            ekVar.f2381c.onViewRecycled(ghVar);
            bxVar.f2154d.remove(ghVar);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + ghVar + ", seems like it is not bound by this adapter: " + bxVar);
    }
}
