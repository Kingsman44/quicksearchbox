package com.google.p4283bv.p4287b.p4288a.p4323c.p4337n;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4321z.C56844b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.n.b */
/* compiled from: PG */
public final class C56920b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56920b f151905e;

    /* renamed from: f */
    public static final C62940bt f151906f;

    /* renamed from: h */
    private static volatile C63010eb f151907h;

    /* renamed from: a */
    public int f151908a;

    /* renamed from: b */
    public String f151909b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151910c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56844b f151911d;

    /* renamed from: g */
    private byte f151912g = 2;

    static {
        C56920b bVar = new C56920b();
        f151905e = bVar;
        C62942bv.registerDefaultInstance(C56920b.class, bVar);
        f151906f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 318078918, C63066gd.MESSAGE, C56920b.class);
    }

    private C56920b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151912g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151912g = b;
                return null;
            case 2:
                return newMessageInfo(f151905e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဈ\u0001\u0004ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56920b();
            case 4:
                return new C56919a();
            case 5:
                return f151905e;
            case 6:
                C63010eb ebVar = f151907h;
                if (ebVar == null) {
                    synchronized (C56920b.class) {
                        ebVar = f151907h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151905e);
                            f151907h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
