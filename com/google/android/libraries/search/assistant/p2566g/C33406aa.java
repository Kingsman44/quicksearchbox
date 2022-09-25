package com.google.android.libraries.search.assistant.p2566g;

import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50540h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.g.aa */
/* compiled from: PG */
public final class C33406aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33406aa f89467c;

    /* renamed from: e */
    private static volatile C63010eb f89468e;

    /* renamed from: a */
    public int f89469a;

    /* renamed from: b */
    public C50540h f89470b;

    /* renamed from: d */
    private byte f89471d = 2;

    static {
        C33406aa aaVar = new C33406aa();
        f89467c = aaVar;
        C62942bv.registerDefaultInstance(C33406aa.class, aaVar);
    }

    private C33406aa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f89471d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f89471d = b;
                return null;
            case 2:
                return newMessageInfo(f89467c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C33406aa();
            case 4:
                return new C33431z();
            case 5:
                return f89467c;
            case 6:
                C63010eb ebVar = f89468e;
                if (ebVar == null) {
                    synchronized (C33406aa.class) {
                        ebVar = f89468e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89467c);
                            f89468e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
