package com.google.android.gms.usonia.p10881d.p10882a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.gms.usonia.d.a.h */
/* compiled from: PG */
public final class C146180h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C146180h f394962c;

    /* renamed from: d */
    private static volatile C63010eb f394963d;

    /* renamed from: a */
    public long f394964a;

    /* renamed from: b */
    public C63088z f394965b = C63088z.f170246b;

    static {
        C146180h hVar = new C146180h();
        f394962c = hVar;
        C62942bv.registerDefaultInstance(C146180h.class, hVar);
    }

    private C146180h() {
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
                return newMessageInfo(f394962c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\n", new Object[]{"a", "b"});
            case 3:
                return new C146180h();
            case 4:
                return new C146179g();
            case 5:
                return f394962c;
            case 6:
                C63010eb ebVar = f394963d;
                if (ebVar == null) {
                    synchronized (C146180h.class) {
                        ebVar = f394963d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f394962c);
                            f394963d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
