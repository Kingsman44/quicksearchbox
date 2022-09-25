package com.google.android.libraries.assistant.assistantactions.p619a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.assistantactions.a.b */
/* compiled from: PG */
public final class C11051b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C11051b f36290d;

    /* renamed from: e */
    private static volatile C63010eb f36291e;

    /* renamed from: a */
    public int f36292a;

    /* renamed from: b */
    public String f36293b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f36294c;

    static {
        C11051b bVar = new C11051b();
        f36290d = bVar;
        C62942bv.registerDefaultInstance(C11051b.class, bVar);
    }

    private C11051b() {
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
                return newMessageInfo(f36290d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C11051b();
            case 4:
                return new C11050a();
            case 5:
                return f36290d;
            case 6:
                C63010eb ebVar = f36291e;
                if (ebVar == null) {
                    synchronized (C11051b.class) {
                        ebVar = f36291e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f36290d);
                            f36291e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
