package com.facebook.litho.p329g;

import androidx.core.p097i.C1970e;
import com.facebook.litho.C6142bw;
import com.facebook.litho.C6145bz;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6168cp;
import com.facebook.litho.C6279fv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.litho.g.n */
/* compiled from: PG */
public class C6335n extends C6337p implements Cloneable, C6168cp, C6142bw {

    /* renamed from: m */
    private static final AtomicInteger f18729m = new AtomicInteger(0);

    /* renamed from: a */
    public C6335n f18730a;

    /* renamed from: b */
    public boolean f18731b;

    /* renamed from: c */
    public C6336o f18732c;

    /* renamed from: d */
    C6154cb f18733d;

    /* renamed from: e */
    public Map f18734e;

    /* renamed from: f */
    public final String f18735f;

    /* renamed from: g */
    public C6279fv f18736g;

    /* renamed from: h */
    public final int f18737h = f18729m.getAndIncrement();

    /* renamed from: i */
    public int f18738i;

    /* renamed from: j */
    public List f18739j;

    /* renamed from: k */
    public String f18740k;

    /* renamed from: l */
    public final String f18741l;

    protected C6335n(String str) {
        this.f18735f = str;
        this.f18741l = str;
        this.f18736g = mo13347b();
    }

    /* renamed from: d */
    static Map m16990d(C6335n nVar) {
        HashMap hashMap = new HashMap();
        if (nVar == null) {
            return hashMap;
        }
        List list = nVar.f18739j;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C6335n nVar2 = (C6335n) list.get(i);
                hashMap.put(nVar2.f18740k, new C1970e(nVar2, Integer.valueOf(i)));
            }
            return hashMap;
        }
        String obj = nVar.toString();
        throw new IllegalStateException("Children of current section " + obj + " is null!");
    }

    /* renamed from: e */
    public static void m16991e(C6335n nVar) {
        nVar.f18731b = true;
        C6335n nVar2 = nVar.f18730a;
        if (nVar2 != null) {
            m16991e(nVar2);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6279fv mo13347b() {
        return null;
    }

    /* renamed from: c */
    public C6335n mo13297c(boolean z) {
        try {
            C6335n nVar = (C6335n) super.clone();
            if (!z) {
                if (nVar.f18739j != null) {
                    nVar.f18739j = new ArrayList();
                }
                nVar.f18738i = 0;
                nVar.f18731b = false;
                nVar.f18734e = null;
            }
            return nVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    public boolean mo13290f(C6335n nVar) {
        throw null;
    }

    /* renamed from: l */
    public final C6145bz mo13127l() {
        return this;
    }
}
