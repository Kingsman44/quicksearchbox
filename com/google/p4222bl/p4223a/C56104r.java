package com.google.p4222bl.p4223a;

import com.evernote.android.state.BuildConfig;
import com.google.p4222bl.p4223a.p4224a.C56073l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.r */
/* compiled from: PG */
public final class C56104r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56104r f149453c;

    /* renamed from: d */
    private static volatile C63010eb f149454d;

    /* renamed from: a */
    public String f149455a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C56073l f149456b;

    static {
        C56104r rVar = new C56104r();
        f149453c = rVar;
        C62942bv.registerDefaultInstance(C56104r.class, rVar);
    }

    private C56104r() {
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
                return newMessageInfo(f149453c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C56104r();
            case 4:
                return new C56103q();
            case 5:
                return f149453c;
            case 6:
                C63010eb ebVar = f149454d;
                if (ebVar == null) {
                    synchronized (C56104r.class) {
                        ebVar = f149454d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149453c);
                            f149454d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
