package com.google.android.libraries.assistant.auto.tng.common.p901d.p902a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.d.a.b */
/* compiled from: PG */
public final class C13224b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13224b f40871c;

    /* renamed from: d */
    private static volatile C63010eb f40872d;

    /* renamed from: a */
    public int f40873a;

    /* renamed from: b */
    public String f40874b = BuildConfig.FLAVOR;

    static {
        C13224b bVar = new C13224b();
        f40871c = bVar;
        C62942bv.registerDefaultInstance(C13224b.class, bVar);
    }

    private C13224b() {
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
                return newMessageInfo(f40871c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13224b();
            case 4:
                return new C13223a();
            case 5:
                return f40871c;
            case 6:
                C63010eb ebVar = f40872d;
                if (ebVar == null) {
                    synchronized (C13224b.class) {
                        ebVar = f40872d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40871c);
                            f40872d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
