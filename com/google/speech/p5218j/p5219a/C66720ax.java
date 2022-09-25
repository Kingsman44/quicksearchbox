package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.ax */
/* compiled from: PG */
public final class C66720ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66720ax f181490b;

    /* renamed from: c */
    private static volatile C63010eb f181491c;

    /* renamed from: a */
    public C62964ck f181492a = emptyLongList();

    static {
        C66720ax axVar = new C66720ax();
        f181490b = axVar;
        C62942bv.registerDefaultInstance(C66720ax.class, axVar);
    }

    private C66720ax() {
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
                return newMessageInfo(f181490b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"a"});
            case 3:
                return new C66720ax();
            case 4:
                return new C66719aw();
            case 5:
                return f181490b;
            case 6:
                C63010eb ebVar = f181491c;
                if (ebVar == null) {
                    synchronized (C66720ax.class) {
                        ebVar = f181491c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181490b);
                            f181491c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
