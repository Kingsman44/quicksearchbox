package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.dc */
/* compiled from: PG */
public final class C14273dc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f43168b = new C14269cz();

    /* renamed from: d */
    public static final C62962ci f43169d = new C14271da();

    /* renamed from: h */
    public static final C14273dc f43170h;

    /* renamed from: i */
    private static volatile C63010eb f43171i;

    /* renamed from: a */
    public C62961ch f43172a = emptyIntList();

    /* renamed from: c */
    public C62961ch f43173c = emptyIntList();

    /* renamed from: e */
    public C62971cq f43174e = emptyProtobufList();

    /* renamed from: f */
    public boolean f43175f;

    /* renamed from: g */
    public boolean f43176g;

    static {
        C14273dc dcVar = new C14273dc();
        f43170h = dcVar;
        C62942bv.registerDefaultInstance(C14273dc.class, dcVar);
    }

    private C14273dc() {
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
                return newMessageInfo(f43170h, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0003\u0000\u0001,\u0002,\u0003\u0007\u0004\u001b\u0006\u0007", new Object[]{"a", C45240c.f118157a, C10662f.f35572a, "e", C14232bp.class, C30325g.f82003a});
            case 3:
                return new C14273dc();
            case 4:
                return new C14272db();
            case 5:
                return f43170h;
            case 6:
                C63010eb ebVar = f43171i;
                if (ebVar == null) {
                    synchronized (C14273dc.class) {
                        ebVar = f43171i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43170h);
                            f43171i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
