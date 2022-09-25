package com.google.android.apps.gsa.assistant.settings.devices.p517a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.a.g */
/* compiled from: PG */
public final class C9532g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9532g f33041d;

    /* renamed from: e */
    private static volatile C63010eb f33042e;

    /* renamed from: a */
    public int f33043a;

    /* renamed from: b */
    public int f33044b;

    /* renamed from: c */
    public String f33045c = BuildConfig.FLAVOR;

    static {
        C9532g gVar = new C9532g();
        f33041d = gVar;
        C62942bv.registerDefaultInstance(C9532g.class, gVar);
    }

    private C9532g() {
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
                return newMessageInfo(f33041d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9532g();
            case 4:
                return new C9531f();
            case 5:
                return f33041d;
            case 6:
                C63010eb ebVar = f33042e;
                if (ebVar == null) {
                    synchronized (C9532g.class) {
                        ebVar = f33042e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f33041d);
                            f33042e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
