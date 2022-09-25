package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.agn */
/* compiled from: PG */
public final class agn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final agn f129233c;

    /* renamed from: d */
    private static volatile C63010eb f129234d;

    /* renamed from: a */
    public int f129235a;

    /* renamed from: b */
    public String f129236b = BuildConfig.FLAVOR;

    static {
        agn agn = new agn();
        f129233c = agn;
        C62942bv.registerDefaultInstance(agn.class, agn);
    }

    private agn() {
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
                return newMessageInfo(f129233c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new agn();
            case 4:
                return new agm();
            case 5:
                return f129233c;
            case 6:
                C63010eb ebVar = f129234d;
                if (ebVar == null) {
                    synchronized (agn.class) {
                        ebVar = f129234d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129233c);
                            f129234d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
