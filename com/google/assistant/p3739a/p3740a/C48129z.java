package com.google.assistant.p3739a.p3740a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.z */
/* compiled from: PG */
public final class C48129z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48129z f124560c;

    /* renamed from: d */
    private static volatile C63010eb f124561d;

    /* renamed from: a */
    public int f124562a;

    /* renamed from: b */
    public String f124563b = BuildConfig.FLAVOR;

    static {
        C48129z zVar = new C48129z();
        f124560c = zVar;
        C62942bv.registerDefaultInstance(C48129z.class, zVar);
    }

    private C48129z() {
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
                return newMessageInfo(f124560c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C48129z();
            case 4:
                return new C48127x();
            case 5:
                return f124560c;
            case 6:
                C63010eb ebVar = f124561d;
                if (ebVar == null) {
                    synchronized (C48129z.class) {
                        ebVar = f124561d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124560c);
                            f124561d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
