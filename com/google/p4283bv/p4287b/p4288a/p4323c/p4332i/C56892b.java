package com.google.p4283bv.p4287b.p4288a.p4323c.p4332i;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4308m.C56741b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.i.b */
/* compiled from: PG */
public final class C56892b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56892b f151817e;

    /* renamed from: f */
    public static final C62940bt f151818f;

    /* renamed from: h */
    private static volatile C63010eb f151819h;

    /* renamed from: a */
    public int f151820a;

    /* renamed from: b */
    public String f151821b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151822c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56741b f151823d;

    /* renamed from: g */
    private byte f151824g = 2;

    static {
        C56892b bVar = new C56892b();
        f151817e = bVar;
        C62942bv.registerDefaultInstance(C56892b.class, bVar);
        f151818f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 433773063, C63066gd.MESSAGE, C56892b.class);
    }

    private C56892b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151824g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151824g = b;
                return null;
            case 2:
                return newMessageInfo(f151817e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဈ\u0001\u0004ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56892b();
            case 4:
                return new C56891a();
            case 5:
                return f151817e;
            case 6:
                C63010eb ebVar = f151819h;
                if (ebVar == null) {
                    synchronized (C56892b.class) {
                        ebVar = f151819h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151817e);
                            f151819h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
