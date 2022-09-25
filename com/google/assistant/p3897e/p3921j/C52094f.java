package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.f */
/* compiled from: PG */
public final class C52094f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52094f f136713c;

    /* renamed from: e */
    private static volatile C63010eb f136714e;

    /* renamed from: a */
    public String f136715a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f136716b;

    /* renamed from: d */
    private int f136717d;

    static {
        C52094f fVar = new C52094f();
        f136713c = fVar;
        C62942bv.registerDefaultInstance(C52094f.class, fVar);
    }

    private C52094f() {
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
                return newMessageInfo(f136713c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C52094f();
            case 4:
                return new C51811e();
            case 5:
                return f136713c;
            case 6:
                C63010eb ebVar = f136714e;
                if (ebVar == null) {
                    synchronized (C52094f.class) {
                        ebVar = f136714e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136713c);
                            f136714e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
