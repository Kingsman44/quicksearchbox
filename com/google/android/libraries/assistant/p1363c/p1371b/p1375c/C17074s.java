package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.b.c.s */
/* compiled from: PG */
public final class C17074s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C17074s f49709b;

    /* renamed from: c */
    private static volatile C63010eb f49710c;

    /* renamed from: a */
    public C62971cq f49711a = emptyProtobufList();

    static {
        C17074s sVar = new C17074s();
        f49709b = sVar;
        C62942bv.registerDefaultInstance(C17074s.class, sVar);
    }

    private C17074s() {
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
                return newMessageInfo(f49709b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C17073r.class});
            case 3:
                return new C17074s();
            case 4:
                return new C17067l();
            case 5:
                return f49709b;
            case 6:
                C63010eb ebVar = f49710c;
                if (ebVar == null) {
                    synchronized (C17074s.class) {
                        ebVar = f49710c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49709b);
                            f49710c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
