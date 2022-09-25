package org.p5633c.p5634a.p5639e;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.e.d */
/* compiled from: PG */
final class C72247d implements C72265v, C72261r {

    /* renamed from: a */
    public final C72265v[] f192237a;

    /* renamed from: b */
    public final C72261r[] f192238b;

    /* renamed from: c */
    private final int f192239c;

    /* renamed from: d */
    private final int f192240d;

    public C72247d(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof C72247d) {
                m106578f(arrayList, ((C72247d) obj).f192237a);
            } else {
                arrayList.add(obj);
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof C72247d) {
                m106578f(arrayList2, ((C72247d) obj2).f192238b);
            } else {
                arrayList2.add(obj2);
            }
        }
        if (arrayList.contains((Object) null) || arrayList.isEmpty()) {
            this.f192237a = null;
            this.f192239c = 0;
        } else {
            int size2 = arrayList.size();
            this.f192237a = new C72265v[size2];
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                C72265v vVar = (C72265v) arrayList.get(i3);
                i2 += vVar.mo63605b();
                this.f192237a[i3] = vVar;
            }
            this.f192239c = i2;
        }
        if (arrayList2.contains((Object) null) || arrayList2.isEmpty()) {
            this.f192238b = null;
            this.f192240d = 0;
            return;
        }
        int size3 = arrayList2.size();
        this.f192238b = new C72261r[size3];
        int i4 = 0;
        for (int i5 = 0; i5 < size3; i5++) {
            C72261r rVar = (C72261r) arrayList2.get(i5);
            i4 += rVar.mo63604a();
            this.f192238b[i5] = rVar;
        }
        this.f192240d = i4;
    }

    /* renamed from: f */
    private static final void m106578f(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object add : objArr) {
                list.add(add);
            }
        }
    }

    /* renamed from: a */
    public final int mo63604a() {
        return this.f192240d;
    }

    /* renamed from: b */
    public final int mo63605b() {
        return this.f192239c;
    }

    /* renamed from: c */
    public final int mo63606c(C72264u uVar, String str, int i) {
        C72261r[] rVarArr = this.f192238b;
        if (rVarArr != null) {
            int length = rVarArr.length;
            for (int i2 = 0; i2 < length && i >= 0; i2++) {
                i = rVarArr[i2].mo63606c(uVar, str, i);
            }
            return i;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo63607d(StringBuffer stringBuffer, C72151ai aiVar, Locale locale) {
        C72265v[] vVarArr = this.f192237a;
        if (vVarArr != null) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (C72265v d : vVarArr) {
                d.mo63607d(stringBuffer, aiVar, locale);
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void mo63608e(StringBuffer stringBuffer, long j, C72132a aVar, int i, C72288l lVar, Locale locale) {
        C72265v[] vVarArr = this.f192237a;
        if (vVarArr != null) {
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (C72265v e : vVarArr) {
                e.mo63608e(stringBuffer, j, aVar, i, lVar, locale2);
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
