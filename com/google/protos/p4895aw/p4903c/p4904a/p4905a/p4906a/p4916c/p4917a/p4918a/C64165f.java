package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4917a.p4918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4381a.p4382a.p4383a.C57674b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.a.a.f */
/* compiled from: PG */
public final class C64165f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64165f f173481d;

    /* renamed from: e */
    public static final C62940bt f173482e;

    /* renamed from: g */
    private static volatile C63010eb f173483g;

    /* renamed from: a */
    public int f173484a;

    /* renamed from: b */
    public C57674b f173485b;

    /* renamed from: c */
    public String f173486c = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f173487f = 2;

    static {
        C64165f fVar = new C64165f();
        f173481d = fVar;
        C62942bv.registerDefaultInstance(C64165f.class, fVar);
        f173482e = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, fVar, fVar, (C62958ce) null, 317730344, C63066gd.MESSAGE, C64165f.class);
    }

    private C64165f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173487f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173487f = b;
                return null;
            case 2:
                return newMessageInfo(f173481d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64165f();
            case 4:
                return new C64164e();
            case 5:
                return f173481d;
            case 6:
                C63010eb ebVar = f173483g;
                if (ebVar == null) {
                    synchronized (C64165f.class) {
                        ebVar = f173483g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173481d);
                            f173483g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
