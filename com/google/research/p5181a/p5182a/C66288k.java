package com.google.research.p5181a.p5182a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.research.a.a.k */
/* compiled from: PG */
public final class C66288k extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C66288k f180270j;

    /* renamed from: k */
    private static volatile C63010eb f180271k;

    /* renamed from: a */
    public int f180272a;

    /* renamed from: b */
    public String f180273b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f180274c = C63088z.f170246b;

    /* renamed from: d */
    public int f180275d;

    /* renamed from: e */
    public int f180276e;

    /* renamed from: f */
    public C62971cq f180277f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f180278g = emptyProtobufList();

    /* renamed from: h */
    public C62971cq f180279h = emptyProtobufList();

    /* renamed from: i */
    public C62971cq f180280i = emptyProtobufList();

    static {
        C66288k kVar = new C66288k();
        f180270j = kVar;
        C62942bv.registerDefaultInstance(C66288k.class, kVar);
    }

    private C66288k() {
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
                return newMessageInfo(f180270j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003င\u0002\u0004င\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C66293p.class, C30325g.f82003a, C66281d.class, C19618h.f54585a, C66281d.class, "i", C66281d.class});
            case 3:
                return new C66288k();
            case 4:
                return new C66287j();
            case 5:
                return f180270j;
            case 6:
                C63010eb ebVar = f180271k;
                if (ebVar == null) {
                    synchronized (C66288k.class) {
                        ebVar = f180271k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180270j);
                            f180271k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
