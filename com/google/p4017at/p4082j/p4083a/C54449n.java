package com.google.p4017at.p4082j.p4083a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.n */
/* compiled from: PG */
public final class C54449n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54449n f142978c;

    /* renamed from: d */
    private static volatile C63010eb f142979d;

    /* renamed from: a */
    public String f142980a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f142981b = BuildConfig.FLAVOR;

    static {
        C54449n nVar = new C54449n();
        f142978c = nVar;
        C62942bv.registerDefaultInstance(C54449n.class, nVar);
    }

    private C54449n() {
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
                return newMessageInfo(f142978c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C54449n();
            case 4:
                return new C54448m();
            case 5:
                return f142978c;
            case 6:
                C63010eb ebVar = f142979d;
                if (ebVar == null) {
                    synchronized (C54449n.class) {
                        ebVar = f142979d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142978c);
                            f142979d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
