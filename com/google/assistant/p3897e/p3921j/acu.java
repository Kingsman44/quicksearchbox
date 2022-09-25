package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.acu */
/* compiled from: PG */
public final class acu extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final acu f134850b;

    /* renamed from: d */
    private static volatile C63010eb f134851d;

    /* renamed from: a */
    public String f134852a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f134853c;

    static {
        acu acu = new acu();
        f134850b = acu;
        C62942bv.registerDefaultInstance(acu.class, acu);
    }

    private acu() {
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
                return newMessageInfo(f134850b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new acu();
            case 4:
                return new act();
            case 5:
                return f134850b;
            case 6:
                C63010eb ebVar = f134851d;
                if (ebVar == null) {
                    synchronized (acu.class) {
                        ebVar = f134851d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134850b);
                            f134851d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
