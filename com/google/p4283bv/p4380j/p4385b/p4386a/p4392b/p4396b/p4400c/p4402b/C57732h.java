package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4402b;

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

/* renamed from: com.google.bv.j.b.a.b.b.c.b.h */
/* compiled from: PG */
public final class C57732h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57732h f154234c;

    /* renamed from: d */
    public static final C62940bt f154235d;

    /* renamed from: f */
    private static volatile C63010eb f154236f;

    /* renamed from: a */
    public String f154237a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public long f154238b;

    /* renamed from: e */
    private int f154239e;

    static {
        C57732h hVar = new C57732h();
        f154234c = hVar;
        C62942bv.registerDefaultInstance(C57732h.class, hVar);
        f154235d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, hVar, hVar, (C62958ce) null, 435745429, C63066gd.MESSAGE, C57732h.class);
    }

    private C57732h() {
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
                return newMessageInfo(f154234c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C57732h();
            case 4:
                return new C57731g();
            case 5:
                return f154234c;
            case 6:
                C63010eb ebVar = f154236f;
                if (ebVar == null) {
                    synchronized (C57732h.class) {
                        ebVar = f154236f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154234c);
                            f154236f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
