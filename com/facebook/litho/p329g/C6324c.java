package com.facebook.litho.p329g;

import com.facebook.litho.widget.C6491cw;
import com.facebook.litho.widget.C6546k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.litho.g.c */
/* compiled from: PG */
public final class C6324c {

    /* renamed from: a */
    public static final List f18701a = new ArrayList();

    /* renamed from: b */
    public int f18702b;

    /* renamed from: c */
    public int f18703c;

    /* renamed from: d */
    public int f18704d;

    /* renamed from: e */
    public int f18705e;

    /* renamed from: f */
    public C6491cw f18706f;

    /* renamed from: g */
    public List f18707g;

    /* renamed from: h */
    public List f18708h;

    /* renamed from: i */
    public List f18709i;

    public C6324c(int i, int i2, int i3, int i4, C6491cw cwVar, List list, List list2, List list3) {
        this.f18702b = i;
        this.f18703c = i2;
        this.f18704d = i3;
        this.f18705e = i4;
        this.f18706f = cwVar == null ? C6546k.m17818r() : cwVar;
        if (list == null) {
            this.f18707g = f18701a;
        } else {
            int size = list.size();
            this.f18707g = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                C6491cw cwVar2 = (C6491cw) list.get(i5);
                List list4 = this.f18707g;
                if (cwVar2 == null) {
                    cwVar2 = C6546k.m17818r();
                }
                list4.add(cwVar2);
            }
        }
        if (list2 != null) {
            this.f18708h = Collections.unmodifiableList(list2);
        }
        if (list3 != null) {
            this.f18709i = Collections.unmodifiableList(list3);
        }
    }

    /* renamed from: a */
    public static C6324c m16964a(int i, int i2, Object obj) {
        List singletonList = obj != null ? Collections.singletonList(obj) : null;
        return new C6324c(0, i, i2, 1, (C6491cw) null, (List) null, singletonList, singletonList);
    }

    /* renamed from: b */
    public static C6324c m16965b(int i, int i2, C6491cw cwVar, Object obj, Object obj2) {
        List list = null;
        List singletonList = obj != null ? Collections.singletonList(obj) : null;
        if (obj2 != null) {
            list = Collections.singletonList(obj2);
        }
        return new C6324c(i, i2, -1, 1, cwVar, (List) null, singletonList, list);
    }

    /* renamed from: c */
    static C6324c m16966c(C6324c cVar) {
        return new C6324c(cVar.f18702b, cVar.f18703c, cVar.f18704d, cVar.f18705e, cVar.f18706f, cVar.f18707g, cVar.f18708h, cVar.f18709i);
    }

    /* renamed from: d */
    static C6324c m16967d(C6324c cVar, int i) {
        int i2 = cVar.f18704d;
        return new C6324c(cVar.f18702b, cVar.f18703c + i, i2 >= 0 ? i2 + i : -1, cVar.f18705e, cVar.f18706f, cVar.f18707g, cVar.f18708h, cVar.f18709i);
    }

    /* renamed from: e */
    public static C6324c m16968e(int i, Object obj) {
        return m16965b(3, i, C6546k.m17818r(), obj, (Object) null);
    }
}
