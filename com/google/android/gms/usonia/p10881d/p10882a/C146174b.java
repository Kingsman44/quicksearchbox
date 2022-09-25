package com.google.android.gms.usonia.p10881d.p10882a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.usonia.d.a.b */
/* compiled from: PG */
public final class C146174b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C146174b f394952c;

    /* renamed from: d */
    private static volatile C63010eb f394953d;

    /* renamed from: a */
    public int f394954a;

    /* renamed from: b */
    public String f394955b = BuildConfig.FLAVOR;

    static {
        C146174b bVar = new C146174b();
        f394952c = bVar;
        C62942bv.registerDefaultInstance(C146174b.class, bVar);
    }

    private C146174b() {
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
                return newMessageInfo(f394952c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C146174b();
            case 4:
                return new C146173a();
            case 5:
                return f394952c;
            case 6:
                C63010eb ebVar = f394953d;
                if (ebVar == null) {
                    synchronized (C146174b.class) {
                        ebVar = f394953d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f394952c);
                            f394953d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
