package com.google.android.libraries.search.assistant.p2705n.p2708b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.n.b.b */
/* compiled from: PG */
public final class C34834b extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C34834b f92401c;

    /* renamed from: e */
    private static volatile C63010eb f92402e;

    /* renamed from: a */
    public int f92403a;

    /* renamed from: b */
    public int f92404b;

    /* renamed from: d */
    private byte f92405d = 2;

    static {
        C34834b bVar = new C34834b();
        f92401c = bVar;
        C62942bv.registerDefaultInstance(C34834b.class, bVar);
    }

    private C34834b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f92405d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f92405d = b;
                return null;
            case 2:
                return newMessageInfo(f92401c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C34834b();
            case 4:
                return new C34833a();
            case 5:
                return f92401c;
            case 6:
                C63010eb ebVar = f92402e;
                if (ebVar == null) {
                    synchronized (C34834b.class) {
                        ebVar = f92402e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92401c);
                            f92402e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
