package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.ap */
/* compiled from: PG */
public final class C45545ap extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45545ap f119030c;

    /* renamed from: d */
    private static volatile C63010eb f119031d;

    /* renamed from: a */
    public String f119032a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f119033b;

    static {
        C45545ap apVar = new C45545ap();
        f119030c = apVar;
        C62942bv.registerDefaultInstance(C45545ap.class, apVar);
    }

    private C45545ap() {
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
                return newMessageInfo(f119030c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C45545ap();
            case 4:
                return new C45544ao();
            case 5:
                return f119030c;
            case 6:
                C63010eb ebVar = f119031d;
                if (ebVar == null) {
                    synchronized (C45545ap.class) {
                        ebVar = f119031d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119030c);
                            f119031d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
