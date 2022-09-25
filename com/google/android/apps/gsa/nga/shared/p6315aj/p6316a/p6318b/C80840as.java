package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.as */
/* compiled from: PG */
public final class C80840as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80840as f221769c;

    /* renamed from: d */
    private static volatile C63010eb f221770d;

    /* renamed from: a */
    public boolean f221771a;

    /* renamed from: b */
    public int f221772b;

    static {
        C80840as asVar = new C80840as();
        f221769c = asVar;
        C62942bv.registerDefaultInstance(C80840as.class, asVar);
    }

    private C80840as() {
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
                return newMessageInfo(f221769c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0007\u0003\u0004", new Object[]{"a", "b"});
            case 3:
                return new C80840as();
            case 4:
                return new C80839ar();
            case 5:
                return f221769c;
            case 6:
                C63010eb ebVar = f221770d;
                if (ebVar == null) {
                    synchronized (C80840as.class) {
                        ebVar = f221770d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221769c);
                            f221770d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
