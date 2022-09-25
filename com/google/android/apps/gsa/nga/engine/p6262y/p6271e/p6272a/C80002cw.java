package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.cw */
/* compiled from: PG */
public final class C80002cw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80002cw f219485c;

    /* renamed from: d */
    private static volatile C63010eb f219486d;

    /* renamed from: a */
    public int f219487a;

    /* renamed from: b */
    public String f219488b = BuildConfig.FLAVOR;

    static {
        C80002cw cwVar = new C80002cw();
        f219485c = cwVar;
        C62942bv.registerDefaultInstance(C80002cw.class, cwVar);
    }

    private C80002cw() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f219485c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80002cw();
            case 4:
                return new C80001cv();
            case 5:
                return f219485c;
            case 6:
                C63010eb ebVar = f219486d;
                if (ebVar == null) {
                    synchronized (C80002cw.class) {
                        ebVar = f219486d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219485c);
                            f219486d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
