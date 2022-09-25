package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: com.google.common.b.hx */
/* compiled from: PG */
final class C58515hx extends C58548jc {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final /* synthetic */ C58517hz f156160a;

    public C58515hx(C58517hz hzVar) {
        this.f156160a = hzVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return this.f156160a.mo55032a();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo55447b(int i) {
        return this.f156160a.mo55461e(i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof C58691ok) {
            C58691ok okVar = (C58691ok) obj;
            if (okVar.mo55767a() > 0 && this.f156160a.mo54932lv(okVar.mo55768b()) == okVar.mo55767a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C58758qx.m90643a(this.f156160a.mo54975m());
    }

    public final int size() {
        return this.f156160a.mo55460c().size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58516hy(this.f156160a);
    }
}
