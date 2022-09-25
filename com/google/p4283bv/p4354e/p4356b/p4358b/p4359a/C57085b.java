package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.evernote.android.state.BuildConfig;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57155l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.b */
/* compiled from: PG */
public final class C57085b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57085b f152395c;

    /* renamed from: f */
    private static volatile C63010eb f152396f;

    /* renamed from: a */
    public String f152397a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C57155l f152398b;

    /* renamed from: d */
    private int f152399d;

    /* renamed from: e */
    private byte f152400e = 2;

    static {
        C57085b bVar = new C57085b();
        f152395c = bVar;
        C62942bv.registerDefaultInstance(C57085b.class, bVar);
    }

    private C57085b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152400e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152400e = b;
                return null;
            case 2:
                return newMessageInfo(f152395c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57085b();
            case 4:
                return new C57058a();
            case 5:
                return f152395c;
            case 6:
                C63010eb ebVar = f152396f;
                if (ebVar == null) {
                    synchronized (C57085b.class) {
                        ebVar = f152396f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152395c);
                            f152396f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
