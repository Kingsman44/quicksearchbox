package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.anu */
/* compiled from: PG */
public final class anu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final anu f135459d;

    /* renamed from: e */
    private static volatile C63010eb f135460e;

    /* renamed from: a */
    public int f135461a;

    /* renamed from: b */
    public aom f135462b;

    /* renamed from: c */
    public String f135463c = BuildConfig.FLAVOR;

    static {
        anu anu = new anu();
        f135459d = anu;
        C62942bv.registerDefaultInstance(anu.class, anu);
    }

    private anu() {
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
                return newMessageInfo(f135459d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new anu();
            case 4:
                return new ant();
            case 5:
                return f135459d;
            case 6:
                C63010eb ebVar = f135460e;
                if (ebVar == null) {
                    synchronized (anu.class) {
                        ebVar = f135460e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135459d);
                            f135460e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
