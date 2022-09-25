package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.il */
/* compiled from: PG */
public final class C14417il extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C14417il f43604g;

    /* renamed from: h */
    private static volatile C63010eb f43605h;

    /* renamed from: a */
    public int f43606a;

    /* renamed from: b */
    public long f43607b;

    /* renamed from: c */
    public int f43608c;

    /* renamed from: d */
    public int f43609d;

    /* renamed from: e */
    public String f43610e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f43611f;

    static {
        C14417il ilVar = new C14417il();
        f43604g = ilVar;
        C62942bv.registerDefaultInstance(C14417il.class, ilVar);
    }

    private C14417il() {
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
                return newMessageInfo(f43604g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\f\u0002\u0003\u0004\f\u0005Ȉ\u0006\f\u0007\f", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C10662f.f35572a});
            case 3:
                return new C14417il();
            case 4:
                return new C14415ij();
            case 5:
                return f43604g;
            case 6:
                C63010eb ebVar = f43605h;
                if (ebVar == null) {
                    synchronized (C14417il.class) {
                        ebVar = f43605h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43604g);
                            f43605h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
