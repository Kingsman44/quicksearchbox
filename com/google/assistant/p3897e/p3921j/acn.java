package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.acn */
/* compiled from: PG */
public final class acn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final acn f134817c;

    /* renamed from: d */
    private static volatile C63010eb f134818d;

    /* renamed from: a */
    public int f134819a;

    /* renamed from: b */
    public String f134820b = BuildConfig.FLAVOR;

    static {
        acn acn = new acn();
        f134817c = acn;
        C62942bv.registerDefaultInstance(acn.class, acn);
    }

    private acn() {
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
                return newMessageInfo(f134817c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new acn();
            case 4:
                return new acm();
            case 5:
                return f134817c;
            case 6:
                C63010eb ebVar = f134818d;
                if (ebVar == null) {
                    synchronized (acn.class) {
                        ebVar = f134818d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134817c);
                            f134818d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
