package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ao.a.d.y */
/* compiled from: PG */
public final class C45587y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45587y f119133c;

    /* renamed from: d */
    private static volatile C63010eb f119134d;

    /* renamed from: a */
    public String f119135a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f119136b = BuildConfig.FLAVOR;

    static {
        C45587y yVar = new C45587y();
        f119133c = yVar;
        C62942bv.registerDefaultInstance(C45587y.class, yVar);
    }

    private C45587y() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f119133c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C45587y();
            case 4:
                return new C45586x();
            case 5:
                return f119133c;
            case 6:
                C63010eb ebVar = f119134d;
                if (ebVar == null) {
                    synchronized (C45587y.class) {
                        ebVar = f119134d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119133c);
                            f119134d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
