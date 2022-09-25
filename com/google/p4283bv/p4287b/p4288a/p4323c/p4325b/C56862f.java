package com.google.p4283bv.p4287b.p4288a.p4323c.p4325b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4298c.C56672f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.b.f */
/* compiled from: PG */
public final class C56862f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56862f f151709e;

    /* renamed from: f */
    public static final C62940bt f151710f;

    /* renamed from: g */
    private static volatile C63010eb f151711g;

    /* renamed from: a */
    public int f151712a;

    /* renamed from: b */
    public String f151713b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151714c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56672f f151715d;

    static {
        C56862f fVar = new C56862f();
        f151709e = fVar;
        C62942bv.registerDefaultInstance(C56862f.class, fVar);
        f151710f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, fVar, fVar, (C62958ce) null, 432337999, C63066gd.MESSAGE, C56862f.class);
    }

    private C56862f() {
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
                return newMessageInfo(f151709e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56862f();
            case 4:
                return new C56861e();
            case 5:
                return f151709e;
            case 6:
                C63010eb ebVar = f151711g;
                if (ebVar == null) {
                    synchronized (C56862f.class) {
                        ebVar = f151711g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151709e);
                            f151711g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
