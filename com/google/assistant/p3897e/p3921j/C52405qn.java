package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.qn */
/* compiled from: PG */
public final class C52405qn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52405qn f137519c;

    /* renamed from: d */
    private static volatile C63010eb f137520d;

    /* renamed from: a */
    public int f137521a;

    /* renamed from: b */
    public String f137522b = BuildConfig.FLAVOR;

    static {
        C52405qn qnVar = new C52405qn();
        f137519c = qnVar;
        C62942bv.registerDefaultInstance(C52405qn.class, qnVar);
    }

    private C52405qn() {
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
                return newMessageInfo(f137519c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52405qn();
            case 4:
                return new C52404qm();
            case 5:
                return f137519c;
            case 6:
                C63010eb ebVar = f137520d;
                if (ebVar == null) {
                    synchronized (C52405qn.class) {
                        ebVar = f137520d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137519c);
                            f137520d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
