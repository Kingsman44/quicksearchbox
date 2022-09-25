package com.google.android.libraries.gsa.monet.tools.recycling.p1925a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.a.b */
/* compiled from: PG */
public final class C23276b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C23276b f63746c;

    /* renamed from: d */
    private static volatile C63010eb f63747d;

    /* renamed from: a */
    public int f63748a;

    /* renamed from: b */
    public String f63749b = BuildConfig.FLAVOR;

    static {
        C23276b bVar = new C23276b();
        f63746c = bVar;
        C62942bv.registerDefaultInstance(C23276b.class, bVar);
    }

    private C23276b() {
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
                return newMessageInfo(f63746c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C23276b();
            case 4:
                return new C23275a();
            case 5:
                return f63746c;
            case 6:
                C63010eb ebVar = f63747d;
                if (ebVar == null) {
                    synchronized (C23276b.class) {
                        ebVar = f63747d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f63746c);
                            f63747d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
