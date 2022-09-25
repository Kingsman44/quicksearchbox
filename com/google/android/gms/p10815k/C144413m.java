package com.google.android.gms.p10815k;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.k.m */
/* compiled from: PG */
public final class C144413m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C144413m f391000c;

    /* renamed from: d */
    private static volatile C63010eb f391001d;

    /* renamed from: a */
    public int f391002a;

    /* renamed from: b */
    public String f391003b = BuildConfig.FLAVOR;

    static {
        C144413m mVar = new C144413m();
        f391000c = mVar;
        C62942bv.registerDefaultInstance(C144413m.class, mVar);
    }

    private C144413m() {
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
                return newMessageInfo(f391000c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C144413m();
            case 4:
                return new C144412l();
            case 5:
                return f391000c;
            case 6:
                C63010eb ebVar = f391001d;
                if (ebVar == null) {
                    synchronized (C144413m.class) {
                        ebVar = f391001d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f391000c);
                            f391001d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
