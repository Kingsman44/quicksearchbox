package com.google.android.gms.wearable.p10888a.p10889a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.wearable.a.a.i */
/* compiled from: PG */
public final class C146404i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C146404i f395508d;

    /* renamed from: f */
    private static volatile C63010eb f395509f;

    /* renamed from: a */
    public int f395510a;

    /* renamed from: b */
    public String f395511b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C146403h f395512c;

    /* renamed from: e */
    private byte f395513e = 2;

    static {
        C146404i iVar = new C146404i();
        f395508d = iVar;
        C62942bv.registerDefaultInstance(C146404i.class, iVar);
    }

    private C146404i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f395513e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f395513e = b;
                return null;
            case 2:
                return newMessageInfo(f395508d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C146404i();
            case 4:
                return new C146397b();
            case 5:
                return f395508d;
            case 6:
                C63010eb ebVar = f395509f;
                if (ebVar == null) {
                    synchronized (C146404i.class) {
                        ebVar = f395509f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f395508d);
                            f395509f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
