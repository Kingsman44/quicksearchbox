package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.b.a.b */
/* compiled from: PG */
public final class C34662b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C34662b f92037d;

    /* renamed from: e */
    private static volatile C63010eb f92038e;

    /* renamed from: a */
    public int f92039a;

    /* renamed from: b */
    public int f92040b;

    /* renamed from: c */
    public String f92041c = BuildConfig.FLAVOR;

    static {
        C34662b bVar = new C34662b();
        f92037d = bVar;
        C62942bv.registerDefaultInstance(C34662b.class, bVar);
    }

    private C34662b() {
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
                return newMessageInfo(f92037d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C34662b();
            case 4:
                return new C34661a();
            case 5:
                return f92037d;
            case 6:
                C63010eb ebVar = f92038e;
                if (ebVar == null) {
                    synchronized (C34662b.class) {
                        ebVar = f92038e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92037d);
                            f92038e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
