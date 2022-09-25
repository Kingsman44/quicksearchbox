package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p850i;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.i.b */
/* compiled from: PG */
public final class C12781b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C12781b f39948c;

    /* renamed from: d */
    private static volatile C63010eb f39949d;

    /* renamed from: a */
    public int f39950a;

    /* renamed from: b */
    public String f39951b = BuildConfig.FLAVOR;

    static {
        C12781b bVar = new C12781b();
        f39948c = bVar;
        C62942bv.registerDefaultInstance(C12781b.class, bVar);
    }

    private C12781b() {
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
                return newMessageInfo(f39948c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C12781b();
            case 4:
                return new C12780a();
            case 5:
                return f39948c;
            case 6:
                C63010eb ebVar = f39949d;
                if (ebVar == null) {
                    synchronized (C12781b.class) {
                        ebVar = f39949d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f39948c);
                            f39949d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
