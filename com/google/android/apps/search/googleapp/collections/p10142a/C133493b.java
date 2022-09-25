package com.google.android.apps.search.googleapp.collections.p10142a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.collections.a.b */
/* compiled from: PG */
public final class C133493b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C133493b f363732c;

    /* renamed from: d */
    private static volatile C63010eb f363733d;

    /* renamed from: a */
    public int f363734a;

    /* renamed from: b */
    public String f363735b = BuildConfig.FLAVOR;

    static {
        C133493b bVar = new C133493b();
        f363732c = bVar;
        C62942bv.registerDefaultInstance(C133493b.class, bVar);
    }

    private C133493b() {
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
                return newMessageInfo(f363732c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C133493b();
            case 4:
                return new C133492a();
            case 5:
                return f363732c;
            case 6:
                C63010eb ebVar = f363733d;
                if (ebVar == null) {
                    synchronized (C133493b.class) {
                        ebVar = f363733d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f363732c);
                            f363733d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
