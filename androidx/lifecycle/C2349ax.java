package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.p127a.C2321b;
import androidx.lifecycle.p127a.C2322c;
import androidx.lifecycle.p127a.C2323d;
import androidx.lifecycle.p127a.C2325f;
import androidx.savedstate.C4087c;
import androidx.savedstate.C4091g;
import java.util.ArrayList;
import java.util.Arrays;
import p5462h.p5473f.C69614a;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.lifecycle.ax */
/* compiled from: PG */
public final class C2349ax {

    /* renamed from: a */
    public static final C2321b f6550a = new C2346au();

    /* renamed from: b */
    public static final C2321b f6551b = new C2347av();

    /* renamed from: c */
    public static final C2321b f6552c = new C2345at();

    /* renamed from: a */
    public static final C2344as m6338a(C2322c cVar) {
        C4091g gVar = (C4091g) cVar.mo5723a(f6550a);
        if (gVar != null) {
            C2371bs bsVar = (C2371bs) cVar.mo5723a(f6551b);
            if (bsVar != null) {
                Bundle bundle = (Bundle) cVar.mo5723a(f6552c);
                String str = (String) cVar.mo5723a(C2366bn.f6586d);
                if (str != null) {
                    C4087c d = gVar.getSavedStateRegistry().mo8587d();
                    C2351az azVar = d instanceof C2351az ? (C2351az) d : null;
                    if (azVar != null) {
                        C2353ba b = m6339b(bsVar);
                        C2344as asVar = (C2344as) b.f6559a.get(str);
                        if (asVar != null) {
                            return asVar;
                        }
                        Class[] clsArr = C2344as.f6543a;
                        azVar.mo5762b();
                        Bundle bundle2 = azVar.f6554a;
                        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
                        Bundle bundle4 = azVar.f6554a;
                        if (bundle4 != null) {
                            bundle4.remove(str);
                        }
                        Bundle bundle5 = azVar.f6554a;
                        if (bundle5 != null && bundle5.isEmpty()) {
                            azVar.f6554a = null;
                        }
                        C2344as a = C2342aq.m6328a(bundle3, bundle);
                        b.f6559a.put(str, a);
                        return a;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* renamed from: b */
    public static final C2353ba m6339b(C2371bs bsVar) {
        ArrayList arrayList = new ArrayList();
        C2348aw awVar = C2348aw.f6549a;
        int i = C69649af.f186028a;
        arrayList.add(new C2325f(C69614a.m101026a(new C69657g(C2353ba.class)), awVar));
        Object[] array = arrayList.toArray(new C2325f[0]);
        C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        C2325f[] fVarArr = (C2325f[]) array;
        return (C2353ba) new C2368bp(bsVar, (C2363bk) new C2323d((C2325f[]) Arrays.copyOf(fVarArr, fVarArr.length))).mo5771b("androidx.lifecycle.internal.SavedStateHandlesVM", C2353ba.class);
    }
}
