package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.hp */
/* compiled from: PG */
public final class C49131hp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49131hp f127056a;

    /* renamed from: b */
    private static volatile C63010eb f127057b;

    static {
        C49131hp hpVar = new C49131hp();
        f127056a = hpVar;
        C62942bv.registerDefaultInstance(C49131hp.class, hpVar);
    }

    private C49131hp() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f127056a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49131hp();
            case 4:
                return new C49130ho();
            case 5:
                return f127056a;
            case 6:
                C63010eb ebVar = f127057b;
                if (ebVar == null) {
                    synchronized (C49131hp.class) {
                        ebVar = f127057b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127056a);
                            f127057b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
