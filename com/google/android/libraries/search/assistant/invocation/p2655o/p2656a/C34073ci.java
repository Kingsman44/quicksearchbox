package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.ci */
/* compiled from: PG */
public final class C34073ci extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C34073ci f90785f;

    /* renamed from: h */
    private static volatile C63010eb f90786h;

    /* renamed from: a */
    public int f90787a;

    /* renamed from: b */
    public String f90788b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f90789c;

    /* renamed from: d */
    public C34065ca f90790d;

    /* renamed from: e */
    public C34093db f90791e;

    /* renamed from: g */
    private byte f90792g = 2;

    static {
        C34073ci ciVar = new C34073ci();
        f90785f = ciVar;
        C62942bv.registerDefaultInstance(C34073ci.class, ciVar);
    }

    private C34073ci() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90792g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90792g = b;
                return null;
            case 2:
                return newMessageInfo(f90785f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ለ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C34073ci();
            case 4:
                return new C34072ch();
            case 5:
                return f90785f;
            case 6:
                C63010eb ebVar = f90786h;
                if (ebVar == null) {
                    synchronized (C34073ci.class) {
                        ebVar = f90786h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90785f);
                            f90786h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
