package com.google.audio.ambientmusic;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.audio.ambientmusic.b */
/* compiled from: PG */
public final class C54573b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54573b f143289b;

    /* renamed from: c */
    private static volatile C63010eb f143290c;

    /* renamed from: a */
    public C62960cg f143291a = emptyFloatList();

    static {
        C54573b bVar = new C54573b();
        f143289b = bVar;
        C62942bv.registerDefaultInstance(C54573b.class, bVar);
    }

    private C54573b() {
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
                return newMessageInfo(f143289b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"a"});
            case 3:
                return new C54573b();
            case 4:
                return new C54572a();
            case 5:
                return f143289b;
            case 6:
                C63010eb ebVar = f143290c;
                if (ebVar == null) {
                    synchronized (C54573b.class) {
                        ebVar = f143290c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143289b);
                            f143290c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
