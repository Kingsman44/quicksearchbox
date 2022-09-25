package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112698f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8562f.C112427h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113403en;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4522b.C58485gu;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.g */
/* compiled from: PG */
public abstract class C112140g extends C112147n {

    /* renamed from: a */
    private static final C121537f f311401a;

    /* renamed from: b */
    private final C112427h f311402b;

    static {
        C121537f b = C121537f.m200840b("PerSuggestionSuppressor", C112145l.f311417q);
        f311401a = b;
        C121511c cVar = b.f337270a;
    }

    public C112140g(C112427h hVar, C112698f fVar) {
        super(fVar);
        this.f311402b = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo99417c(C113405ep epVar, C113415ez ezVar);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Map mo99418l(C113405ep epVar, Map map) {
        C58485gu a = this.f311402b.mo99517a(epVar.mo100024h(), map);
        HashMap hashMap = new HashMap();
        int size = a.size();
        while (true) {
            size--;
            if (size < 0) {
                return hashMap;
            }
            C113403en enVar = (C113403en) a.get(size);
            int size2 = enVar.mo100086d().size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    if (mo99417c(epVar, (C113415ez) enVar.mo100086d().get(size2))) {
                        Set set = (Set) hashMap.get(enVar.mo100085c());
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(enVar.mo100085c(), set);
                        }
                        set.add(Integer.valueOf(size2));
                    }
                }
            }
        }
    }
}
