package com.google.android.libraries.p11026am;

import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.am.b */
/* compiled from: PG */
public final class C147759b extends C147764g {

    /* renamed from: a */
    private final C58485gu f398704a;

    private C147759b(C58485gu guVar) {
        this.f398704a = guVar;
    }

    @Deprecated
    public C147759b(List list) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!C58837ba.m90859h(str)) {
                C58833ax a = C147761d.m240838a(str);
                if (a.mo56113h()) {
                    e.mo55395g((C147761d) a.mo56107c());
                }
            }
        }
        this.f398704a = e.mo55394f();
    }

    /* renamed from: b */
    public static C147759b m240834b(List list) {
        int indexOf;
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!C58837ba.m90859h(str) && (indexOf = str.indexOf("://")) != -1) {
                int i = indexOf + 3;
                int indexOf2 = str.indexOf("/", i);
                if (indexOf2 == -1) {
                    indexOf2 = str.indexOf("\\?", i);
                }
                if (indexOf2 == -1) {
                    indexOf2 = str.indexOf("#", i);
                }
                if (indexOf2 == -1) {
                    indexOf2 = str.length();
                }
                int indexOf3 = str.indexOf("*");
                if (indexOf3 == -1 || indexOf3 < i || indexOf3 >= indexOf2) {
                    C58833ax a = C147761d.m240838a(str);
                    if (a.mo56113h()) {
                        e.mo55395g((C147761d) a.mo56107c());
                    }
                }
            }
        }
        return new C147759b(e.mo55394f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29446a(String str) {
        C58485gu guVar = this.f398704a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C147761d dVar = (C147761d) guVar.get(i2);
            if (dVar != null && dVar.f398707a.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}
