package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p868d.C12900d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.ak */
/* compiled from: PG */
public final class C13023ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13023ak f40447c;

    /* renamed from: d */
    private static volatile C63010eb f40448d;

    /* renamed from: a */
    public int f40449a = 0;

    /* renamed from: b */
    public Object f40450b;

    static {
        C13023ak akVar = new C13023ak();
        f40447c = akVar;
        C62942bv.registerDefaultInstance(C13023ak.class, akVar);
    }

    private C13023ak() {
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
                return newMessageInfo(f40447c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C13022aj.class, C13020ah.class, C12900d.class});
            case 3:
                return new C13023ak();
            case 4:
                return new C13018af();
            case 5:
                return f40447c;
            case 6:
                C63010eb ebVar = f40448d;
                if (ebVar == null) {
                    synchronized (C13023ak.class) {
                        ebVar = f40448d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40447c);
                            f40448d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
