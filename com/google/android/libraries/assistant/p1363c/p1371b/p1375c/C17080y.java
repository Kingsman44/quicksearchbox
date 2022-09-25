package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.b.c.y */
/* compiled from: PG */
public final class C17080y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17080y f49722c;

    /* renamed from: d */
    private static volatile C63010eb f49723d;

    /* renamed from: a */
    public int f49724a;

    /* renamed from: b */
    public String f49725b = BuildConfig.FLAVOR;

    static {
        C17080y yVar = new C17080y();
        f49722c = yVar;
        C62942bv.registerDefaultInstance(C17080y.class, yVar);
    }

    private C17080y() {
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
                return newMessageInfo(f49722c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C17080y();
            case 4:
                return new C17079x();
            case 5:
                return f49722c;
            case 6:
                C63010eb ebVar = f49723d;
                if (ebVar == null) {
                    synchronized (C17080y.class) {
                        ebVar = f49723d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49722c);
                            f49723d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
