package com.google.assistant.p4001w.p4002a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.w.a.j */
/* compiled from: PG */
public final class C53503j extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C53503j f140408h;

    /* renamed from: i */
    private static volatile C63010eb f140409i;

    /* renamed from: a */
    public int f140410a;

    /* renamed from: b */
    public String f140411b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f140412c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f140413d;

    /* renamed from: e */
    public C62910ar f140414e;

    /* renamed from: f */
    public C62971cq f140415f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f140416g = emptyProtobufList();

    static {
        C53503j jVar = new C53503j();
        f140408h = jVar;
        C62942bv.registerDefaultInstance(C53503j.class, jVar);
    }

    private C53503j() {
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
                return newMessageInfo(f140408h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0003ဉ\u0003\u0004\u001b\u0005\u001b\u0006ဈ\u0001", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C53505l.class, C30325g.f82003a, C53501h.class, C45240c.f118157a});
            case 3:
                return new C53503j();
            case 4:
                return new C53502i();
            case 5:
                return f140408h;
            case 6:
                C63010eb ebVar = f140409i;
                if (ebVar == null) {
                    synchronized (C53503j.class) {
                        ebVar = f140409i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140408h);
                            f140409i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
