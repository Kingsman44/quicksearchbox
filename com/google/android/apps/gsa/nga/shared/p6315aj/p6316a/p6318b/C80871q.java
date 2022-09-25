package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.q */
/* compiled from: PG */
public final class C80871q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80871q f221819b;

    /* renamed from: c */
    private static volatile C63010eb f221820c;

    /* renamed from: a */
    public String f221821a = BuildConfig.FLAVOR;

    static {
        C80871q qVar = new C80871q();
        f221819b = qVar;
        C62942bv.registerDefaultInstance(C80871q.class, qVar);
    }

    private C80871q() {
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
                return newMessageInfo(f221819b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C80871q();
            case 4:
                return new C80870p();
            case 5:
                return f221819b;
            case 6:
                C63010eb ebVar = f221820c;
                if (ebVar == null) {
                    synchronized (C80871q.class) {
                        ebVar = f221820c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221819b);
                            f221820c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
