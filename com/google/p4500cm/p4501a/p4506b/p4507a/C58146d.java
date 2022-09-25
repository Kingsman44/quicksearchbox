package com.google.p4500cm.p4501a.p4506b.p4507a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62955cb;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.cm.a.b.a.d */
/* compiled from: PG */
public final class C58146d extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C58146d f155443h;

    /* renamed from: i */
    private static volatile C63010eb f155444i;

    /* renamed from: a */
    public int f155445a;

    /* renamed from: b */
    public String f155446b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62955cb f155447c = emptyBooleanList();

    /* renamed from: d */
    public C62964ck f155448d = emptyLongList();

    /* renamed from: e */
    public C62971cq f155449e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C62971cq f155450f = emptyProtobufList();

    /* renamed from: g */
    public C63088z f155451g = C63088z.f170246b;

    static {
        C58146d dVar = new C58146d();
        f155443h = dVar;
        C62942bv.registerDefaultInstance(C58146d.class, dVar);
    }

    private C58146d() {
        emptyDoubleList();
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
                return newMessageInfo(f155443h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0004\u0000\u0001ဈ\u0000\u0002\u0019\u0003\u0014\u0004\u001a\u0005\u001b\u0006ည\u0001", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C58148f.class, C30325g.f82003a});
            case 3:
                return new C58146d();
            case 4:
                return new C58145c();
            case 5:
                return f155443h;
            case 6:
                C63010eb ebVar = f155444i;
                if (ebVar == null) {
                    synchronized (C58146d.class) {
                        ebVar = f155444i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155443h);
                            f155444i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
