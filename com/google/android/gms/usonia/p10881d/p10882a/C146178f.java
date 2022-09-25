package com.google.android.gms.usonia.p10881d.p10882a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.usonia.d.a.f */
/* compiled from: PG */
public final class C146178f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C146178f f394958c;

    /* renamed from: d */
    private static volatile C63010eb f394959d;

    /* renamed from: a */
    public C146174b f394960a;

    /* renamed from: b */
    public C146180h f394961b;

    static {
        C146178f fVar = new C146178f();
        f394958c = fVar;
        C62942bv.registerDefaultInstance(C146178f.class, fVar);
    }

    private C146178f() {
        emptyProtobufList();
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
                return newMessageInfo(f394958c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C146178f();
            case 4:
                return new C146177e();
            case 5:
                return f394958c;
            case 6:
                C63010eb ebVar = f394959d;
                if (ebVar == null) {
                    synchronized (C146178f.class) {
                        ebVar = f394959d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f394958c);
                            f394959d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
