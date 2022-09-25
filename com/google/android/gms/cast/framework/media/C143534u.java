package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.internal.C143596v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.cast.framework.media.u */
/* compiled from: PG */
public final class C143534u extends C143484aq {

    /* renamed from: a */
    final /* synthetic */ C143535v f389212a;

    public C143534u(C143535v vVar) {
        this.f389212a = vVar;
    }

    /* renamed from: p */
    public final void mo6047p() {
        long a = this.f389212a.mo118830a();
        C143535v vVar = this.f389212a;
        if (a != vVar.f389214b) {
            vVar.f389214b = a;
            vVar.mo118831b();
            C143535v vVar2 = this.f389212a;
            if (vVar2.f389214b != 0) {
                vVar2.mo118836g();
            }
        }
    }

    /* renamed from: q */
    public final void mo118740q(int[] iArr) {
        List g = C143596v.m233274g(iArr);
        if (!this.f389212a.f389216d.equals(g)) {
            this.f389212a.mo118834e();
            this.f389212a.f389218f.evictAll();
            this.f389212a.f389219g.clear();
            C143535v vVar = this.f389212a;
            vVar.f389216d = g;
            vVar.mo118835f();
            this.f389212a.mo118833d();
            this.f389212a.mo118832c();
        }
    }

    /* renamed from: r */
    public final void mo118741r(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = this.f389212a.f389216d.size();
        } else {
            i2 = this.f389212a.f389217e.get(i, -1);
            if (i2 == -1) {
                this.f389212a.mo118836g();
                return;
            }
        }
        this.f389212a.mo118834e();
        this.f389212a.f389216d.addAll(i2, C143596v.m233274g(iArr));
        this.f389212a.mo118835f();
        C143535v vVar = this.f389212a;
        synchronized (vVar.f389223k) {
            Iterator it = vVar.f389223k.iterator();
            if (it.hasNext()) {
                C143533t tVar = (C143533t) it.next();
                throw null;
            }
        }
        this.f389212a.mo118832c();
    }

    /* renamed from: s */
    public final void mo118742s(MediaQueueItem[] mediaQueueItemArr) {
        HashSet hashSet = new HashSet();
        this.f389212a.f389219g.clear();
        int length = mediaQueueItemArr.length;
        int i = 0;
        while (i < length) {
            MediaQueueItem mediaQueueItem = mediaQueueItemArr[i];
            int i2 = mediaQueueItem.f388691b;
            this.f389212a.f389218f.put(Integer.valueOf(i2), mediaQueueItem);
            int i3 = this.f389212a.f389217e.get(i2, -1);
            if (i3 == -1) {
                this.f389212a.mo118836g();
                return;
            } else {
                hashSet.add(Integer.valueOf(i3));
                i++;
            }
        }
        for (Integer intValue : this.f389212a.f389219g) {
            int i4 = this.f389212a.f389217e.get(intValue.intValue(), -1);
            if (i4 != -1) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        this.f389212a.f389219g.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f389212a.mo118834e();
        C143535v vVar = this.f389212a;
        C143596v.m233279l(arrayList);
        vVar.mo118838i();
        this.f389212a.mo118832c();
    }

    /* renamed from: t */
    public final void mo118743t(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            this.f389212a.f389218f.remove(Integer.valueOf(i));
            int i2 = this.f389212a.f389217e.get(i, -1);
            if (i2 == -1) {
                this.f389212a.mo118836g();
                return;
            }
            this.f389212a.f389217e.delete(i);
            arrayList.add(Integer.valueOf(i2));
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            this.f389212a.mo118834e();
            this.f389212a.f389216d.removeAll(C143596v.m233274g(iArr));
            this.f389212a.mo118835f();
            C143535v vVar = this.f389212a;
            C143596v.m233279l(arrayList);
            synchronized (vVar.f389223k) {
                Iterator it = vVar.f389223k.iterator();
                if (it.hasNext()) {
                    C143533t tVar = (C143533t) it.next();
                    throw null;
                }
            }
            this.f389212a.mo118832c();
        }
    }

    /* renamed from: u */
    public final void mo118744u(List list, List list2, int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            this.f389212a.f389216d.size();
        } else if (list2.isEmpty()) {
            this.f389212a.f389213a.mo118889g("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]);
        } else if (this.f389212a.f389217e.get(i, -1) == -1) {
            this.f389212a.f389217e.get(((Integer) list2.get(0)).intValue(), -1);
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i2 = this.f389212a.f389217e.get(((Integer) it.next()).intValue(), -1);
            if (i2 == -1) {
                this.f389212a.mo118836g();
                return;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        this.f389212a.mo118834e();
        C143535v vVar = this.f389212a;
        vVar.f389216d = list;
        vVar.mo118835f();
        C143535v vVar2 = this.f389212a;
        synchronized (vVar2.f389223k) {
            Iterator it2 = vVar2.f389223k.iterator();
            if (it2.hasNext()) {
                C143533t tVar = (C143533t) it2.next();
                throw null;
            }
        }
        this.f389212a.mo118832c();
    }

    /* renamed from: v */
    public final void mo118745v(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            this.f389212a.f389218f.remove(Integer.valueOf(i2));
            int i3 = this.f389212a.f389217e.get(i2, -1);
            if (i3 == -1) {
                this.f389212a.mo118836g();
                return;
            } else {
                arrayList.add(Integer.valueOf(i3));
                i++;
            }
        }
        Collections.sort(arrayList);
        this.f389212a.mo118834e();
        C143535v vVar = this.f389212a;
        C143596v.m233279l(arrayList);
        vVar.mo118838i();
        this.f389212a.mo118832c();
    }

    /* renamed from: w */
    public final void mo118746w() {
        this.f389212a.mo118836g();
    }
}
