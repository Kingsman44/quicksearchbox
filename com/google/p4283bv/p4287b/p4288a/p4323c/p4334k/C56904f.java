package com.google.p4283bv.p4287b.p4288a.p4323c.p4334k;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4314s.C56815b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.k.f */
/* compiled from: PG */
public final class C56904f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56904f f151856e;

    /* renamed from: f */
    public static final C62940bt f151857f;

    /* renamed from: g */
    private static volatile C63010eb f151858g;

    /* renamed from: a */
    public int f151859a;

    /* renamed from: b */
    public String f151860b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151861c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56815b f151862d;

    static {
        C56904f fVar = new C56904f();
        f151856e = fVar;
        C62942bv.registerDefaultInstance(C56904f.class, fVar);
        f151857f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, fVar, fVar, (C62958ce) null, 377868401, C63066gd.MESSAGE, C56904f.class);
    }

    private C56904f() {
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
                return newMessageInfo(f151856e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56904f();
            case 4:
                return new C56903e();
            case 5:
                return f151856e;
            case 6:
                C63010eb ebVar = f151858g;
                if (ebVar == null) {
                    synchronized (C56904f.class) {
                        ebVar = f151858g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151856e);
                            f151858g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
