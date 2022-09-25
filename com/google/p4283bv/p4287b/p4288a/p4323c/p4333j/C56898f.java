package com.google.p4283bv.p4287b.p4288a.p4323c.p4333j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56802j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.j.f */
/* compiled from: PG */
public final class C56898f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56898f f151839e;

    /* renamed from: f */
    public static final C62940bt f151840f;

    /* renamed from: g */
    private static volatile C63010eb f151841g;

    /* renamed from: a */
    public int f151842a;

    /* renamed from: b */
    public String f151843b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151844c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56802j f151845d;

    static {
        C56898f fVar = new C56898f();
        f151839e = fVar;
        C62942bv.registerDefaultInstance(C56898f.class, fVar);
        f151840f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, fVar, fVar, (C62958ce) null, 299863160, C63066gd.MESSAGE, C56898f.class);
    }

    private C56898f() {
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
                return newMessageInfo(f151839e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56898f();
            case 4:
                return new C56897e();
            case 5:
                return f151839e;
            case 6:
                C63010eb ebVar = f151841g;
                if (ebVar == null) {
                    synchronized (C56898f.class) {
                        ebVar = f151841g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151839e);
                            f151841g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
