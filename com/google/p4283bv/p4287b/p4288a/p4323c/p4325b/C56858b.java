package com.google.p4283bv.p4287b.p4288a.p4323c.p4325b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4298c.C56668b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.b.b */
/* compiled from: PG */
public final class C56858b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56858b f151695e;

    /* renamed from: f */
    public static final C62940bt f151696f;

    /* renamed from: g */
    private static volatile C63010eb f151697g;

    /* renamed from: a */
    public int f151698a;

    /* renamed from: b */
    public String f151699b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151700c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56668b f151701d;

    static {
        C56858b bVar = new C56858b();
        f151695e = bVar;
        C62942bv.registerDefaultInstance(C56858b.class, bVar);
        f151696f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 313216374, C63066gd.MESSAGE, C56858b.class);
    }

    private C56858b() {
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
                return newMessageInfo(f151695e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56858b();
            case 4:
                return new C56857a();
            case 5:
                return f151695e;
            case 6:
                C63010eb ebVar = f151697g;
                if (ebVar == null) {
                    synchronized (C56858b.class) {
                        ebVar = f151697g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151695e);
                            f151697g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
