package com.google.common.p4522b;

/* renamed from: com.google.common.b.op */
/* compiled from: PG */
abstract class C58696op extends C58755qu {
    /* renamed from: a */
    public abstract C58692ol mo54963a();

    public final void clear() {
        mo54963a().clear();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof C58691ok) {
            C58691ok okVar = (C58691ok) obj;
            if (okVar.mo55767a() > 0 && mo54963a().mo54932lv(okVar.mo55768b()) == okVar.mo55767a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof C58691ok)) {
            return false;
        }
        C58691ok okVar = (C58691ok) obj;
        Object b = okVar.mo55768b();
        int a = okVar.mo55767a();
        if (a != 0) {
            return mo54963a().mo54929i(b, a);
        }
        return false;
    }
}
