package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.dp */
/* compiled from: PG */
public final class C14286dp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14286dp f43215f;

    /* renamed from: h */
    private static volatile C63010eb f43216h;

    /* renamed from: a */
    public int f43217a;

    /* renamed from: b */
    public int f43218b;

    /* renamed from: c */
    public int f43219c;

    /* renamed from: d */
    public C14492lf f43220d;

    /* renamed from: e */
    public String f43221e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f43222g = 2;

    static {
        C14286dp dpVar = new C14286dp();
        f43215f = dpVar;
        C62942bv.registerDefaultInstance(C14286dp.class, dpVar);
    }

    private C14286dp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43222g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43222g = b;
                return null;
            case 2:
                return newMessageInfo(f43215f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0001\u0001\f\u0002\f\u0003\u0004\u0004Љ\u0005Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C14286dp();
            case 4:
                return new C14285do();
            case 5:
                return f43215f;
            case 6:
                C63010eb ebVar = f43216h;
                if (ebVar == null) {
                    synchronized (C14286dp.class) {
                        ebVar = f43216h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43215f);
                            f43216h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
