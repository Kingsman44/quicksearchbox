package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.bc */
/* compiled from: PG */
public final class C8575bc extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8575bc f29690g;

    /* renamed from: h */
    private static volatile C63010eb f29691h;

    /* renamed from: a */
    public int f29692a;

    /* renamed from: b */
    public boolean f29693b;

    /* renamed from: c */
    public C62971cq f29694c = emptyProtobufList();

    /* renamed from: d */
    public String f29695d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f29696e;

    /* renamed from: f */
    public String f29697f = BuildConfig.FLAVOR;

    static {
        C8575bc bcVar = new C8575bc();
        f29690g = bcVar;
        C62942bv.registerDefaultInstance(C8575bc.class, bcVar);
    }

    private C8575bc() {
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
                return newMessageInfo(f29690g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဇ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C8574bb.class, "d", "e", C10662f.f35572a});
            case 3:
                return new C8575bc();
            case 4:
                return new C8546az();
            case 5:
                return f29690g;
            case 6:
                C63010eb ebVar = f29691h;
                if (ebVar == null) {
                    synchronized (C8575bc.class) {
                        ebVar = f29691h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29690g);
                            f29691h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
