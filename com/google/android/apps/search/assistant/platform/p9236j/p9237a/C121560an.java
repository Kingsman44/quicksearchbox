package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.an */
/* compiled from: PG */
public final class C121560an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C121560an f337310b;

    /* renamed from: d */
    private static volatile C63010eb f337311d;

    /* renamed from: a */
    public C34053bp f337312a;

    /* renamed from: c */
    private byte f337313c = 2;

    static {
        C121560an anVar = new C121560an();
        f337310b = anVar;
        C62942bv.registerDefaultInstance(C121560an.class, anVar);
    }

    private C121560an() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f337313c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f337313c = b;
                return null;
            case 2:
                return newMessageInfo(f337310b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C121560an();
            case 4:
                return new C121559am();
            case 5:
                return f337310b;
            case 6:
                C63010eb ebVar = f337311d;
                if (ebVar == null) {
                    synchronized (C121560an.class) {
                        ebVar = f337311d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f337310b);
                            f337311d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
