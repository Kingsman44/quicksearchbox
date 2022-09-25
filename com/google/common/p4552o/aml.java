package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aml */
/* compiled from: PG */
public final class aml extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aml f159155c;

    /* renamed from: d */
    private static volatile C63010eb f159156d;

    /* renamed from: a */
    public int f159157a;

    /* renamed from: b */
    public String f159158b = BuildConfig.FLAVOR;

    static {
        aml aml = new aml();
        f159155c = aml;
        C62942bv.registerDefaultInstance(aml.class, aml);
    }

    private aml() {
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
                return newMessageInfo(f159155c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aml();
            case 4:
                return new amk();
            case 5:
                return f159155c;
            case 6:
                C63010eb ebVar = f159156d;
                if (ebVar == null) {
                    synchronized (aml.class) {
                        ebVar = f159156d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159155c);
                            f159156d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
