package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.bl */
/* compiled from: PG */
public final class C14228bl extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14228bl f43056a;

    /* renamed from: b */
    private static volatile C63010eb f43057b;

    static {
        C14228bl blVar = new C14228bl();
        f43056a = blVar;
        C62942bv.registerDefaultInstance(C14228bl.class, blVar);
    }

    private C14228bl() {
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
                return newMessageInfo(f43056a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14228bl();
            case 4:
                return new C14227bk();
            case 5:
                return f43056a;
            case 6:
                C63010eb ebVar = f43057b;
                if (ebVar == null) {
                    synchronized (C14228bl.class) {
                        ebVar = f43057b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43056a);
                            f43057b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
