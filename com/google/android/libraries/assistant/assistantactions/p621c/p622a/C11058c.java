package com.google.android.libraries.assistant.assistantactions.p621c.p622a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.a.c */
/* compiled from: PG */
public final class C11058c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C11058c f36303b;

    /* renamed from: c */
    private static volatile C63010eb f36304c;

    /* renamed from: a */
    public C62995dn f36305a = C62995dn.f170057a;

    static {
        C11058c cVar = new C11058c();
        f36303b = cVar;
        C62942bv.registerDefaultInstance(C11058c.class, cVar);
    }

    private C11058c() {
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
                return newMessageInfo(f36303b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C11057b.f36302a});
            case 3:
                return new C11058c();
            case 4:
                return new C11056a();
            case 5:
                return f36303b;
            case 6:
                C63010eb ebVar = f36304c;
                if (ebVar == null) {
                    synchronized (C11058c.class) {
                        ebVar = f36304c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f36303b);
                            f36304c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
