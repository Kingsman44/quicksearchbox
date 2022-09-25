package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.ax */
/* compiled from: PG */
public final class C34034ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f90689b = new C34032av();

    /* renamed from: d */
    public static final C34034ax f90690d;

    /* renamed from: g */
    private static volatile C63010eb f90691g;

    /* renamed from: a */
    public C62961ch f90692a = emptyIntList();

    /* renamed from: c */
    public C34065ca f90693c;

    /* renamed from: e */
    private int f90694e;

    /* renamed from: f */
    private byte f90695f = 2;

    static {
        C34034ax axVar = new C34034ax();
        f90690d = axVar;
        C62942bv.registerDefaultInstance(C34034ax.class, axVar);
    }

    private C34034ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90695f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90695f = b;
                return null;
            case 2:
                return newMessageInfo(f90690d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001e\u0002ᐉ\u0000", new Object[]{"e", "a", C34043bf.m62693b(), C45240c.f118157a});
            case 3:
                return new C34034ax();
            case 4:
                return new C34033aw();
            case 5:
                return f90690d;
            case 6:
                C63010eb ebVar = f90691g;
                if (ebVar == null) {
                    synchronized (C34034ax.class) {
                        ebVar = f90691g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90690d);
                            f90691g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
