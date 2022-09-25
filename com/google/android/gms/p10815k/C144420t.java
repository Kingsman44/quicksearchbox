package com.google.android.gms.p10815k;

import com.evernote.android.state.BuildConfig;
import com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a.C53950o;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.k.t */
/* compiled from: PG */
public final class C144420t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C144420t f391015c;

    /* renamed from: d */
    private static volatile C63010eb f391016d;

    /* renamed from: a */
    public String f391017a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C53950o f391018b;

    static {
        C144420t tVar = new C144420t();
        f391015c = tVar;
        C62942bv.registerDefaultInstance(C144420t.class, tVar);
    }

    private C144420t() {
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
                return newMessageInfo(f391015c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C144420t();
            case 4:
                return new C144419s();
            case 5:
                return f391015c;
            case 6:
                C63010eb ebVar = f391016d;
                if (ebVar == null) {
                    synchronized (C144420t.class) {
                        ebVar = f391016d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f391015c);
                            f391016d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
