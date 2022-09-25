package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.ce */
/* compiled from: PG */
public final class C119837ce extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119837ce f333775c;

    /* renamed from: d */
    private static volatile C63010eb f333776d;

    /* renamed from: a */
    public C119834cb f333777a;

    /* renamed from: b */
    public int f333778b;

    static {
        C119837ce ceVar = new C119837ce();
        f333775c = ceVar;
        C62942bv.registerDefaultInstance(C119837ce.class, ceVar);
    }

    private C119837ce() {
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
                return newMessageInfo(f333775c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C119837ce();
            case 4:
                return new C119835cc();
            case 5:
                return f333775c;
            case 6:
                C63010eb ebVar = f333776d;
                if (ebVar == null) {
                    synchronized (C119837ce.class) {
                        ebVar = f333776d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333775c);
                            f333776d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
