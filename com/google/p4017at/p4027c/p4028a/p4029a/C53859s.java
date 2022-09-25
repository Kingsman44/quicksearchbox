package com.google.p4017at.p4027c.p4028a.p4029a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.a.a.s */
/* compiled from: PG */
public final class C53859s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53859s f141346c;

    /* renamed from: d */
    private static volatile C63010eb f141347d;

    /* renamed from: a */
    public String f141348a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f141349b;

    static {
        C53859s sVar = new C53859s();
        f141346c = sVar;
        C62942bv.registerDefaultInstance(C53859s.class, sVar);
    }

    private C53859s() {
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
                return newMessageInfo(f141346c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C53859s();
            case 4:
                return new C53858r();
            case 5:
                return f141346c;
            case 6:
                C63010eb ebVar = f141347d;
                if (ebVar == null) {
                    synchronized (C53859s.class) {
                        ebVar = f141347d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141346c);
                            f141347d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
