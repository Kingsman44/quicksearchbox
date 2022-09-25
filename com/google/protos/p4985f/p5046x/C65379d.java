package com.google.protos.p4985f.p5046x;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.x.d */
/* compiled from: PG */
public final class C65379d extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C65379d f177776h;

    /* renamed from: i */
    private static volatile C63010eb f177777i;

    /* renamed from: a */
    public int f177778a;

    /* renamed from: b */
    public String f177779b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f177780c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f177781d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62971cq f177782e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C65378c f177783f;

    /* renamed from: g */
    public C62971cq f177784g = emptyProtobufList();

    static {
        C65379d dVar = new C65379d();
        f177776h = dVar;
        C62942bv.registerDefaultInstance(C65379d.class, dVar);
    }

    private C65379d() {
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
                return newMessageInfo(f177776h, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0003\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001a\u0006ဈ\u0002\u0007ဉ\u0003\b\u001b", new Object[]{"a", "b", "d", "e", C45240c.f118157a, C10662f.f35572a, C30325g.f82003a, C65379d.class});
            case 3:
                return new C65379d();
            case 4:
                return new C65376a();
            case 5:
                return f177776h;
            case 6:
                C63010eb ebVar = f177777i;
                if (ebVar == null) {
                    synchronized (C65379d.class) {
                        ebVar = f177777i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177776h);
                            f177777i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
