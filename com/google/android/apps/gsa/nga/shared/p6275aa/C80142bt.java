package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.bt */
/* compiled from: PG */
public final class C80142bt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80142bt f219928c;

    /* renamed from: d */
    private static volatile C63010eb f219929d;

    /* renamed from: a */
    public int f219930a;

    /* renamed from: b */
    public String f219931b = BuildConfig.FLAVOR;

    static {
        C80142bt btVar = new C80142bt();
        f219928c = btVar;
        C62942bv.registerDefaultInstance(C80142bt.class, btVar);
    }

    private C80142bt() {
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
                return newMessageInfo(f219928c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80142bt();
            case 4:
                return new C80141bs();
            case 5:
                return f219928c;
            case 6:
                C63010eb ebVar = f219929d;
                if (ebVar == null) {
                    synchronized (C80142bt.class) {
                        ebVar = f219929d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219928c);
                            f219929d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
