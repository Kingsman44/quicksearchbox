package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.add */
/* compiled from: PG */
public final class add extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final add f129026b;

    /* renamed from: d */
    private static volatile C63010eb f129027d;

    /* renamed from: a */
    public String f129028a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f129029c;

    static {
        add add = new add();
        f129026b = add;
        C62942bv.registerDefaultInstance(add.class, add);
    }

    private add() {
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
                return newMessageInfo(f129026b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new add();
            case 4:
                return new adc();
            case 5:
                return f129026b;
            case 6:
                C63010eb ebVar = f129027d;
                if (ebVar == null) {
                    synchronized (add.class) {
                        ebVar = f129027d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129026b);
                            f129027d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
