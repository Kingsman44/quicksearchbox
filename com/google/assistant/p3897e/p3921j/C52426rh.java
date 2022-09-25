package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.rh */
/* compiled from: PG */
public final class C52426rh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52426rh f137553d;

    /* renamed from: e */
    private static volatile C63010eb f137554e;

    /* renamed from: a */
    public int f137555a;

    /* renamed from: b */
    public String f137556b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f137557c = BuildConfig.FLAVOR;

    static {
        C52426rh rhVar = new C52426rh();
        f137553d = rhVar;
        C62942bv.registerDefaultInstance(C52426rh.class, rhVar);
    }

    private C52426rh() {
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
                return newMessageInfo(f137553d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52426rh();
            case 4:
                return new C52425rg();
            case 5:
                return f137553d;
            case 6:
                C63010eb ebVar = f137554e;
                if (ebVar == null) {
                    synchronized (C52426rh.class) {
                        ebVar = f137554e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137553d);
                            f137554e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
