package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.bn */
/* compiled from: PG */
public final class C53104bn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53104bn f139157c;

    /* renamed from: d */
    private static volatile C63010eb f139158d;

    /* renamed from: a */
    public int f139159a;

    /* renamed from: b */
    public String f139160b = BuildConfig.FLAVOR;

    static {
        C53104bn bnVar = new C53104bn();
        f139157c = bnVar;
        C62942bv.registerDefaultInstance(C53104bn.class, bnVar);
    }

    private C53104bn() {
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
                return newMessageInfo(f139157c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53104bn();
            case 4:
                return new C53103bm();
            case 5:
                return f139157c;
            case 6:
                C63010eb ebVar = f139158d;
                if (ebVar == null) {
                    synchronized (C53104bn.class) {
                        ebVar = f139158d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139157c);
                            f139158d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
