package com.google.p4017at.p4027c.p4028a.p4029a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.a.a.u */
/* compiled from: PG */
public final class C53861u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53861u f141350b;

    /* renamed from: c */
    private static volatile C63010eb f141351c;

    /* renamed from: a */
    public String f141352a = BuildConfig.FLAVOR;

    static {
        C53861u uVar = new C53861u();
        f141350b = uVar;
        C62942bv.registerDefaultInstance(C53861u.class, uVar);
    }

    private C53861u() {
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
                return newMessageInfo(f141350b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C53861u();
            case 4:
                return new C53860t();
            case 5:
                return f141350b;
            case 6:
                C63010eb ebVar = f141351c;
                if (ebVar == null) {
                    synchronized (C53861u.class) {
                        ebVar = f141351c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141350b);
                            f141351c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
