package com.google.android.libraries.p1649b.p1650a;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.common.p4522b.C58448fk;
import com.google.common.p4522b.C58785rx;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60931s;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.b.a.c */
/* compiled from: PG */
public abstract class C19606c {

    /* renamed from: a */
    public C19610g f54551a;

    /* renamed from: b */
    public final Map f54552b = new HashMap();

    /* renamed from: c */
    public final SoftReference f54553c;

    public C19606c(ViewGroup viewGroup) {
        this.f54553c = new SoftReference(viewGroup);
    }

    /* renamed from: h */
    private final C58785rx m37417h(C58785rx rxVar, View view, C19609f fVar, boolean z) {
        C58448fk fkVar;
        if (fVar != null && mo24929b(view)) {
            this.f54551a.mo24945e(fVar.f54569f, fVar.f54568e, fVar);
            rxVar.mo55010b(Integer.valueOf(fVar.f54569f), fVar.f54568e, fVar);
        }
        if (!z || fVar == null) {
            fkVar = C58448fk.m89722o();
        } else {
            C19610g gVar = this.f54551a;
            int i = fVar.f54569f;
            C58785rx rxVar2 = (C58785rx) gVar.f54576g.mo55009a(Integer.valueOf(i), fVar.f54568e);
            if (rxVar2 == null) {
                fkVar = null;
            } else {
                C58448fk o = C58448fk.m89722o();
                o.mo55020j(rxVar2);
                fkVar = o;
            }
            if (fkVar == null) {
                fkVar = C58448fk.m89722o();
            }
        }
        if (view instanceof ViewGroup) {
            int i2 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i2 >= viewGroup.getChildCount()) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                C19609f f = mo24933f(childAt);
                if (f == null || !mo24929b(childAt)) {
                    fkVar.mo55020j(m37417h(rxVar, childAt, f, z));
                } else {
                    fkVar.mo55010b(Integer.valueOf(f.f54569f), f.f54568e, f);
                    m37417h(rxVar, childAt, f, z);
                }
                i2++;
            }
            if (fVar != null && !fkVar.mo55021k(Integer.valueOf(fVar.f54569f), fVar.f54568e)) {
                this.f54551a.mo24944d(fVar.f54569f, fVar.f54568e, fkVar);
            }
        }
        return fkVar;
    }

    /* renamed from: a */
    public abstract C60214n mo24928a(View view);

    /* renamed from: b */
    public abstract boolean mo24929b(View view);

    /* renamed from: c */
    public C60931s mo24930c(View view) {
        return null;
    }

    /* renamed from: d */
    public boolean mo24931d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo24932e() {
        return false;
    }

    /* renamed from: f */
    public final C19609f mo24933f(View view) {
        C60214n a = mo24928a(view);
        if (a == null) {
            return null;
        }
        C19609f a2 = C19621k.m37454a(view, a, mo24931d(), mo24932e(), this.f54551a);
        C60931s c = mo24930c(view);
        if (c != null) {
            this.f54552b.put(a2, c);
        }
        return a2;
    }

    /* renamed from: g */
    public final C58785rx mo24934g(View view, boolean z) {
        C58448fk o = C58448fk.m89722o();
        m37417h(o, view, mo24933f(view), z);
        return o;
    }
}
