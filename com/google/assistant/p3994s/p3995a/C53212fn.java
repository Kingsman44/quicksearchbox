package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4985f.p5027o.C64973h;

/* renamed from: com.google.assistant.s.a.fn */
/* compiled from: PG */
public final class C53212fn extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53212fn f139467g;

    /* renamed from: h */
    public static final C62940bt f139468h;

    /* renamed from: j */
    private static volatile C63010eb f139469j;

    /* renamed from: a */
    public long f139470a;

    /* renamed from: b */
    public String f139471b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139472c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C64973h f139473d;

    /* renamed from: e */
    public C62971cq f139474e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public int f139475f;

    /* renamed from: i */
    private int f139476i;

    static {
        C53212fn fnVar = new C53212fn();
        f139467g = fnVar;
        C62942bv.registerDefaultInstance(C53212fn.class, fnVar);
        f139468h = C62942bv.newSingularGeneratedExtension(C53153di.f139315c, fnVar, fnVar, (C62958ce) null, 105, C63066gd.MESSAGE, C53212fn.class);
    }

    private C53212fn() {
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
                return newMessageInfo(f139467g, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0001\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0006ဈ\u0005\u0007ဉ\u0006\b\u001a\nင\b", new Object[]{"i", "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C53212fn();
            case 4:
                return new C53211fm();
            case 5:
                return f139467g;
            case 6:
                C63010eb ebVar = f139469j;
                if (ebVar == null) {
                    synchronized (C53212fn.class) {
                        ebVar = f139469j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139467g);
                            f139469j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
