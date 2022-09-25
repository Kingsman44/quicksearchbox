package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4397a.p4398a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.C57832e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.p5164b.C66011b;

/* renamed from: com.google.bv.j.b.a.b.b.a.a.b */
/* compiled from: PG */
public final class C57701b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57701b f154158e;

    /* renamed from: f */
    public static final C62940bt f154159f;

    /* renamed from: g */
    private static volatile C63010eb f154160g;

    /* renamed from: a */
    public int f154161a;

    /* renamed from: b */
    public C62971cq f154162b = emptyProtobufList();

    /* renamed from: c */
    public C66011b f154163c;

    /* renamed from: d */
    public String f154164d = BuildConfig.FLAVOR;

    static {
        C57701b bVar = new C57701b();
        f154158e = bVar;
        C62942bv.registerDefaultInstance(C57701b.class, bVar);
        f154159f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 292553553, C63066gd.MESSAGE, C57701b.class);
    }

    private C57701b() {
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
                return newMessageInfo(f154158e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C57832e.class, C45240c.f118157a, "d"});
            case 3:
                return new C57701b();
            case 4:
                return new C57700a();
            case 5:
                return f154158e;
            case 6:
                C63010eb ebVar = f154160g;
                if (ebVar == null) {
                    synchronized (C57701b.class) {
                        ebVar = f154160g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154158e);
                            f154160g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
