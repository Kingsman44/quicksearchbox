package com.facebook.litho.widget;

import android.support.p033v7.p040e.C0430l;
import com.facebook.litho.C6106aq;
import com.facebook.litho.C6128bi;
import com.facebook.litho.C6411u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.litho.widget.cn */
/* compiled from: PG */
public final class C6482cn implements C0430l {

    /* renamed from: a */
    private final int f19242a;

    /* renamed from: b */
    private final List f19243b;

    /* renamed from: c */
    private final List f19244c;

    /* renamed from: d */
    private final List f19245d;

    /* renamed from: e */
    private final List f19246e;

    /* renamed from: f */
    private final List f19247f;

    /* renamed from: g */
    private final C6479ck f19248g;

    /* renamed from: h */
    private final C6481cm f19249h;

    public C6482cn(List list, List list2, C6479ck ckVar, C6481cm cmVar) {
        this.f19243b = list;
        this.f19242a = list != null ? list.size() : 0;
        this.f19244c = list2;
        this.f19248g = ckVar;
        this.f19249h = cmVar;
        this.f19245d = new ArrayList();
        this.f19246e = new ArrayList();
        this.f19247f = new ArrayList();
        for (int i = 0; i < this.f19242a; i++) {
            this.f19246e.add(new C6478cj((C6491cw) null, false));
            this.f19247f.add(new C6128bi(this.f19243b.get(i), (Object) null));
        }
    }

    /* renamed from: a */
    public final void mo1392a(int i, int i2, Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            C6478cj cjVar = (C6478cj) this.f19246e.get(i4);
            cjVar.f19236b = true;
            arrayList.add(cjVar);
            arrayList2.add((C6128bi) this.f19247f.get(i4));
        }
        this.f19245d.add(new C6480cl(1, i, -1, arrayList, arrayList2));
    }

    /* renamed from: b */
    public final void mo1393b(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            C6478cj cjVar = new C6478cj((C6491cw) null, true);
            this.f19246e.add(i4, cjVar);
            arrayList.add(cjVar);
            C6128bi biVar = new C6128bi((Object) null, (Object) null);
            this.f19247f.add(i4, biVar);
            arrayList2.add(biVar);
        }
        this.f19245d.add(new C6480cl(0, i, -1, arrayList, arrayList2));
    }

    /* renamed from: c */
    public final void mo1394c(int i, int i2) {
        ArrayList arrayList = new ArrayList(1);
        this.f19246e.add(i2, (C6478cj) this.f19246e.remove(i));
        C6128bi biVar = (C6128bi) this.f19247f.remove(i);
        arrayList.add(biVar);
        this.f19247f.add(i2, biVar);
        this.f19245d.add(new C6480cl(3, i, i2, (List) null, arrayList));
    }

    /* renamed from: d */
    public final void mo1395d(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f19246e.remove(i);
            arrayList.add((C6128bi) this.f19247f.remove(i));
        }
        this.f19245d.add(new C6480cl(2, i, i2, (List) null, arrayList));
    }

    /* renamed from: e */
    public final void mo13571e(C6411u uVar) {
        List list = this.f19244c;
        if (list == null || list.size() == this.f19246e.size()) {
            int size = this.f19246e.size();
            for (int i = 0; i < size; i++) {
                if (((C6478cj) this.f19246e.get(i)).f19236b) {
                    Object obj = this.f19244c.get(i);
                    ((C6478cj) this.f19246e.get(i)).f19235a = this.f19248g.mo13294a(obj, i);
                    ((C6128bi) this.f19247f.get(i)).f18144b = obj;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder("Inconsistent size between mPlaceholders(");
            sb.append(this.f19246e.size());
            sb.append(") and mNextData(");
            sb.append(this.f19244c.size());
            sb.append("); mOperations: [");
            int size2 = this.f19245d.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C6480cl clVar = (C6480cl) this.f19245d.get(i2);
                sb.append("[type=");
                sb.append(clVar.f19237a);
                sb.append(", index=");
                sb.append(clVar.f19238b);
                sb.append(", toIndex=");
                sb.append(clVar.f19239c);
                if (clVar.f19240d != null) {
                    sb.append(", count=");
                    sb.append(clVar.f19240d.size());
                }
                sb.append("], ");
            }
            sb.append("]; mNextData: [");
            int size3 = this.f19244c.size();
            for (int i3 = 0; i3 < size3; i3++) {
                sb.append("[");
                sb.append(this.f19244c.get(i3));
                sb.append("], ");
            }
            sb.append("]");
            C6106aq.m15891b(2, "RecyclerBinderUpdateCallback:InconsistentSize", sb.toString());
            this.f19245d.clear();
            this.f19247f.clear();
            this.f19246e.clear();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < this.f19242a; i4++) {
                arrayList.add(new C6128bi(this.f19243b.get(i4), (Object) null));
            }
            this.f19247f.addAll(arrayList);
            this.f19245d.add(new C6480cl(2, 0, this.f19242a, (List) null, arrayList));
            int size4 = this.f19244c.size();
            ArrayList arrayList2 = new ArrayList(size4);
            ArrayList arrayList3 = new ArrayList(size4);
            for (int i5 = 0; i5 < size4; i5++) {
                Object obj2 = this.f19244c.get(i5);
                arrayList2.add(i5, new C6478cj(this.f19248g.mo13294a(obj2, i5), false));
                arrayList3.add(new C6128bi((Object) null, obj2));
            }
            this.f19246e.addAll(arrayList2);
            this.f19247f.addAll(arrayList3);
            this.f19245d.add(new C6480cl(0, 0, -1, arrayList2, arrayList3));
        }
        this.f19249h.mo13295a(uVar, this.f19245d);
    }
}
