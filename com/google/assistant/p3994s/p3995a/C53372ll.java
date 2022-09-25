package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ll */
/* compiled from: PG */
public final class C53372ll extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53372ll f140052c;

    /* renamed from: d */
    private static volatile C63010eb f140053d;

    /* renamed from: a */
    public int f140054a;

    /* renamed from: b */
    public String f140055b = BuildConfig.FLAVOR;

    static {
        C53372ll llVar = new C53372ll();
        f140052c = llVar;
        C62942bv.registerDefaultInstance(C53372ll.class, llVar);
    }

    private C53372ll() {
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
                return newMessageInfo(f140052c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53372ll();
            case 4:
                return new C53371lk();
            case 5:
                return f140052c;
            case 6:
                C63010eb ebVar = f140053d;
                if (ebVar == null) {
                    synchronized (C53372ll.class) {
                        ebVar = f140053d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140052c);
                            f140053d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
