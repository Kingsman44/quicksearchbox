package com.google.android.gms.p10815k;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.k.b */
/* compiled from: PG */
public final class C144402b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C144402b f390981c;

    /* renamed from: d */
    private static volatile C63010eb f390982d;

    /* renamed from: a */
    public String f390983a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f390984b = emptyProtobufList();

    static {
        C144402b bVar = new C144402b();
        f390981c = bVar;
        C62942bv.registerDefaultInstance(C144402b.class, bVar);
    }

    private C144402b() {
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
                return newMessageInfo(f390981c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", C144415o.class});
            case 3:
                return new C144402b();
            case 4:
                return new C144357a();
            case 5:
                return f390981c;
            case 6:
                C63010eb ebVar = f390982d;
                if (ebVar == null) {
                    synchronized (C144402b.class) {
                        ebVar = f390982d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f390981c);
                            f390982d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
