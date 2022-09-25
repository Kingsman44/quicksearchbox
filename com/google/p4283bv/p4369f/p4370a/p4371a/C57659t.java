package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.t */
/* compiled from: PG */
public final class C57659t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57659t f153975c;

    /* renamed from: d */
    private static volatile C63010eb f153976d;

    /* renamed from: a */
    public C57643df f153977a;

    /* renamed from: b */
    public String f153978b = BuildConfig.FLAVOR;

    static {
        C57659t tVar = new C57659t();
        f153975c = tVar;
        C62942bv.registerDefaultInstance(C57659t.class, tVar);
    }

    private C57659t() {
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
                return newMessageInfo(f153975c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0003Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C57659t();
            case 4:
                return new C57658s();
            case 5:
                return f153975c;
            case 6:
                C63010eb ebVar = f153976d;
                if (ebVar == null) {
                    synchronized (C57659t.class) {
                        ebVar = f153976d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153975c);
                            f153976d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
