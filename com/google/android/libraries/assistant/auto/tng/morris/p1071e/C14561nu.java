package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.nu */
/* compiled from: PG */
public final class C14561nu extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14561nu f44022f;

    /* renamed from: h */
    private static volatile C63010eb f44023h;

    /* renamed from: a */
    public String f44024a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C14492lf f44025b;

    /* renamed from: c */
    public long f44026c;

    /* renamed from: d */
    public int f44027d;

    /* renamed from: e */
    public C14528mo f44028e;

    /* renamed from: g */
    private byte f44029g = 2;

    static {
        C14561nu nuVar = new C14561nu();
        f44022f = nuVar;
        C62942bv.registerDefaultInstance(C14561nu.class, nuVar);
    }

    private C14561nu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f44029g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f44029g = b;
                return null;
            case 2:
                return newMessageInfo(f44022f, "\u0000\u0005\u0000\u0000\u0002\u0007\u0005\u0000\u0000\u0001\u0002Ȉ\u0003Љ\u0005\u0002\u0006\f\u0007\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C14561nu();
            case 4:
                return new C14559ns();
            case 5:
                return f44022f;
            case 6:
                C63010eb ebVar = f44023h;
                if (ebVar == null) {
                    synchronized (C14561nu.class) {
                        ebVar = f44023h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44022f);
                            f44023h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
