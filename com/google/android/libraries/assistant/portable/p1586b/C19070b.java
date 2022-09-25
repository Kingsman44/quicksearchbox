package com.google.android.libraries.assistant.portable.p1586b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.b */
/* compiled from: PG */
public final class C19070b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19070b f53493c;

    /* renamed from: d */
    private static volatile C63010eb f53494d;

    /* renamed from: a */
    public int f53495a;

    /* renamed from: b */
    public String f53496b = BuildConfig.FLAVOR;

    static {
        C19070b bVar = new C19070b();
        f53493c = bVar;
        C62942bv.registerDefaultInstance(C19070b.class, bVar);
    }

    private C19070b() {
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
                return newMessageInfo(f53493c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C19070b();
            case 4:
                return new C19056a();
            case 5:
                return f53493c;
            case 6:
                C63010eb ebVar = f53494d;
                if (ebVar == null) {
                    synchronized (C19070b.class) {
                        ebVar = f53494d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53493c);
                            f53494d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
