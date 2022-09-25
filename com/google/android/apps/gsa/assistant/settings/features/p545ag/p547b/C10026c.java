package com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.b.c */
/* compiled from: PG */
public final class C10026c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C10026c f34231b;

    /* renamed from: c */
    private static volatile C63010eb f34232c;

    /* renamed from: a */
    public C62995dn f34233a = C62995dn.f170057a;

    static {
        C10026c cVar = new C10026c();
        f34231b = cVar;
        C62942bv.registerDefaultInstance(C10026c.class, cVar);
    }

    private C10026c() {
    }

    /* renamed from: a */
    public final C62995dn mo18196a() {
        C62995dn dnVar = this.f34233a;
        if (!dnVar.f170058b) {
            this.f34233a = dnVar.mo58980a();
        }
        return this.f34233a;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f34231b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", C10025b.f34230a});
            case 3:
                return new C10026c();
            case 4:
                return new C10024a();
            case 5:
                return f34231b;
            case 6:
                C63010eb ebVar = f34232c;
                if (ebVar == null) {
                    synchronized (C10026c.class) {
                        ebVar = f34232c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34231b);
                            f34232c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
