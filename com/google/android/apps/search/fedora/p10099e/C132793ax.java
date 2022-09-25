package com.google.android.apps.search.fedora.p10099e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5228m.C67333cj;
import com.google.speech.p5228m.C67335cl;

/* renamed from: com.google.android.apps.search.fedora.e.ax */
/* compiled from: PG */
public final class C132793ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C132793ax f362299c;

    /* renamed from: d */
    private static volatile C63010eb f362300d;

    /* renamed from: a */
    public C62971cq f362301a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f362302b = emptyProtobufList();

    static {
        C132793ax axVar = new C132793ax();
        f362299c = axVar;
        C62942bv.registerDefaultInstance(C132793ax.class, axVar);
    }

    private C132793ax() {
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
                return newMessageInfo(f362299c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C67333cj.class, "b", C67335cl.class});
            case 3:
                return new C132793ax();
            case 4:
                return new C132792aw();
            case 5:
                return f362299c;
            case 6:
                C63010eb ebVar = f362300d;
                if (ebVar == null) {
                    synchronized (C132793ax.class) {
                        ebVar = f362300d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362299c);
                            f362300d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
