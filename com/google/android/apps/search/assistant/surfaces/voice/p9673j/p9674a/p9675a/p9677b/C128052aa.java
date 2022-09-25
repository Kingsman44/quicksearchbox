package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.aa */
/* compiled from: PG */
public final class C128052aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C128052aa f352355c;

    /* renamed from: d */
    private static volatile C63010eb f352356d;

    /* renamed from: a */
    public int f352357a;

    /* renamed from: b */
    public C83320io f352358b;

    static {
        C128052aa aaVar = new C128052aa();
        f352355c = aaVar;
        C62942bv.registerDefaultInstance(C128052aa.class, aaVar);
    }

    private C128052aa() {
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
                return newMessageInfo(f352355c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C128052aa();
            case 4:
                return new C128125z();
            case 5:
                return f352355c;
            case 6:
                C63010eb ebVar = f352356d;
                if (ebVar == null) {
                    synchronized (C128052aa.class) {
                        ebVar = f352356d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352355c);
                            f352356d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
