package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.acb */
/* compiled from: PG */
public final class acb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final acb f128831c;

    /* renamed from: d */
    private static volatile C63010eb f128832d;

    /* renamed from: a */
    public int f128833a;

    /* renamed from: b */
    public String f128834b = BuildConfig.FLAVOR;

    static {
        acb acb = new acb();
        f128831c = acb;
        C62942bv.registerDefaultInstance(acb.class, acb);
    }

    private acb() {
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
                return newMessageInfo(f128831c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new acb();
            case 4:
                return new aca();
            case 5:
                return f128831c;
            case 6:
                C63010eb ebVar = f128832d;
                if (ebVar == null) {
                    synchronized (acb.class) {
                        ebVar = f128832d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128831c);
                            f128832d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
