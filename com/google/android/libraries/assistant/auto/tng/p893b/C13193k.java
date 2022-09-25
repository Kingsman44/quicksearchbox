package com.google.android.libraries.assistant.auto.tng.p893b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.b.k */
/* compiled from: PG */
public final class C13193k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13193k f40832c;

    /* renamed from: d */
    private static volatile C63010eb f40833d;

    /* renamed from: a */
    public int f40834a;

    /* renamed from: b */
    public String f40835b = BuildConfig.FLAVOR;

    static {
        C13193k kVar = new C13193k();
        f40832c = kVar;
        C62942bv.registerDefaultInstance(C13193k.class, kVar);
    }

    private C13193k() {
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
                return newMessageInfo(f40832c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13193k();
            case 4:
                return new C13192j();
            case 5:
                return f40832c;
            case 6:
                C63010eb ebVar = f40833d;
                if (ebVar == null) {
                    synchronized (C13193k.class) {
                        ebVar = f40833d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40832c);
                            f40833d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
