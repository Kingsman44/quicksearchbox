package com.google.p4283bv.p4287b.p4288a.p4323c.p4341r;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.r.b */
/* compiled from: PG */
public final class C56932b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56932b f151950c;

    /* renamed from: d */
    public static final C62940bt f151951d;

    /* renamed from: e */
    private static volatile C63010eb f151952e;

    /* renamed from: a */
    public int f151953a;

    /* renamed from: b */
    public String f151954b = BuildConfig.FLAVOR;

    static {
        C56932b bVar = new C56932b();
        f151950c = bVar;
        C62942bv.registerDefaultInstance(C56932b.class, bVar);
        f151951d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 355632243, C63066gd.MESSAGE, C56932b.class);
    }

    private C56932b() {
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
                return newMessageInfo(f151950c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56932b();
            case 4:
                return new C56931a();
            case 5:
                return f151950c;
            case 6:
                C63010eb ebVar = f151952e;
                if (ebVar == null) {
                    synchronized (C56932b.class) {
                        ebVar = f151952e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151950c);
                            f151952e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
