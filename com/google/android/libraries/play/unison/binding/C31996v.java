package com.google.android.libraries.play.unison.binding;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.play.unison.binding.v */
/* compiled from: PG */
public final class C31996v implements C31958ag {

    /* renamed from: a */
    private final Map f85996a = new HashMap();

    /* renamed from: b */
    private final Set f85997b = new HashSet();

    @SafeVarargs
    public C31996v(C31997w... wVarArr) {
        C58801sm G = C58485gu.m89844l(wVarArr).listIterator(0);
        while (G.hasNext()) {
            C31997w wVar = (C31997w) G.next();
            Object put = this.f85996a.put(wVar.f85998a, wVar);
            C58838bb.m90879n(put == null, "A DispatchingProjectorEntry already exists accepting the same data type %s; %s", wVar.f85998a, put);
        }
    }

    /* renamed from: b */
    private static final C31955ad m59605b(C31997w wVar, Object obj) {
        return wVar.mo37729a(wVar.f85998a.cast(obj));
    }

    /* renamed from: a */
    public final C31955ad mo37729a(Object obj) {
        Class cls = obj.getClass();
        if (this.f85997b.contains(cls)) {
            return C31953ab.f85936a;
        }
        C31997w wVar = (C31997w) this.f85996a.get(cls);
        if (wVar != null) {
            return m59605b(wVar, obj);
        }
        for (Class superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            C31997w wVar2 = (C31997w) this.f85996a.get(superclass);
            if (wVar2 != null) {
                this.f85996a.put(cls, wVar2);
                return m59605b(wVar2, obj);
            }
        }
        this.f85997b.add(cls);
        return C31953ab.f85936a;
    }
}
