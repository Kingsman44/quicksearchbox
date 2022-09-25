package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.c.a.x */
/* compiled from: PG */
public final class C20178x extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C20178x f56609g;

    /* renamed from: h */
    public static final C62940bt f56610h;

    /* renamed from: i */
    private static volatile C63010eb f56611i;

    /* renamed from: a */
    public int f56612a;

    /* renamed from: b */
    public C20176v f56613b;

    /* renamed from: c */
    public C62971cq f56614c = emptyProtobufList();

    /* renamed from: d */
    public C20174t f56615d;

    /* renamed from: e */
    public C20174t f56616e;

    /* renamed from: f */
    public String f56617f = BuildConfig.FLAVOR;

    static {
        C20178x xVar = new C20178x();
        f56609g = xVar;
        C62942bv.registerDefaultInstance(C20178x.class, xVar);
        f56610h = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, xVar, xVar, (C62958ce) null, 1234567, C63066gd.MESSAGE, C20178x.class);
    }

    private C20178x() {
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
                return newMessageInfo(f56609g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C20172r.class, "d", "e", C10662f.f35572a});
            case 3:
                return new C20178x();
            case 4:
                return new C20177w();
            case 5:
                return f56609g;
            case 6:
                C63010eb ebVar = f56611i;
                if (ebVar == null) {
                    synchronized (C20178x.class) {
                        ebVar = f56611i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56609g);
                            f56611i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
