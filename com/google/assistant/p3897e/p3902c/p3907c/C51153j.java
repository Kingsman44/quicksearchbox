package com.google.assistant.p3897e.p3902c.p3907c;

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

/* renamed from: com.google.assistant.e.c.c.j */
/* compiled from: PG */
public final class C51153j extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C51153j f133156h;

    /* renamed from: i */
    private static volatile C63010eb f133157i;

    /* renamed from: a */
    public String f133158a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f133159b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f133160c = emptyProtobufList();

    /* renamed from: d */
    public boolean f133161d;

    /* renamed from: e */
    public boolean f133162e;

    /* renamed from: f */
    public boolean f133163f;

    /* renamed from: g */
    public boolean f133164g;

    static {
        C51153j jVar = new C51153j();
        f133156h = jVar;
        C62942bv.registerDefaultInstance(C51153j.class, jVar);
    }

    private C51153j() {
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
                return newMessageInfo(f133156h, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0002\u0000\u0001Ȉ\u0003\u001b\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u001b\b\u0007", new Object[]{"a", C45240c.f118157a, C51001cs.class, "d", "e", C10662f.f35572a, "b", C50972bq.class, C30325g.f82003a});
            case 3:
                return new C51153j();
            case 4:
                return new C51144i();
            case 5:
                return f133156h;
            case 6:
                C63010eb ebVar = f133157i;
                if (ebVar == null) {
                    synchronized (C51153j.class) {
                        ebVar = f133157i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133156h);
                            f133157i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
