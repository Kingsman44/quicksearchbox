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

/* renamed from: com.google.bv.j.b.a.b.b.c.b.f */
/* compiled from: PG */
public final class C57730f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57730f f154228c;

    /* renamed from: d */
    public static final C62940bt f154229d;

    /* renamed from: f */
    private static volatile C63010eb f154230f;

    /* renamed from: a */
    public String f154231a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f154232b = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f154233e;

    static {
        C57730f fVar = new C57730f();
        f154228c = fVar;
        C62942bv.registerDefaultInstance(C57730f.class, fVar);
        f154229d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, fVar, fVar, (C62958ce) null, 428996471, C63066gd.MESSAGE, C57730f.class);
    }

    private C57730f() {
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
                return newMessageInfo(f154228c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C57730f();
            case 4:
                return new C57729e();
            case 5:
                return f154228c;
            case 6:
                C63010eb ebVar = f154230f;
                if (ebVar == null) {
                    synchronized (C57730f.class) {
                        ebVar = f154230f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154228c);
                            f154230f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
