package com.google.p4283bv.p4287b.p4288a.p4323c.p4335l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.l.b */
/* compiled from: PG */
public final class C56910b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56910b f151878c;

    /* renamed from: d */
    public static final C62940bt f151879d;

    /* renamed from: f */
    private static volatile C63010eb f151880f;

    /* renamed from: a */
    public int f151881a;

    /* renamed from: b */
    public CommandOuterClass$Command f151882b;

    /* renamed from: e */
    private byte f151883e = 2;

    static {
        C56910b bVar = new C56910b();
        f151878c = bVar;
        C62942bv.registerDefaultInstance(C56910b.class, bVar);
        f151879d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 445095581, C63066gd.MESSAGE, C56910b.class);
    }

    private C56910b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151883e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151883e = b;
                return null;
            case 2:
                return newMessageInfo(f151878c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56910b();
            case 4:
                return new C56909a();
            case 5:
                return f151878c;
            case 6:
                C63010eb ebVar = f151880f;
                if (ebVar == null) {
                    synchronized (C56910b.class) {
                        ebVar = f151880f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151878c);
                            f151880f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
