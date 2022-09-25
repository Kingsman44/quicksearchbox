package com.google.apps.tiktok.account.data.manager.p3615a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.account.data.manager.a.c */
/* compiled from: PG */
public final class C46222c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C46222c f121173d;

    /* renamed from: f */
    private static volatile C63010eb f121174f;

    /* renamed from: a */
    public int f121175a;

    /* renamed from: b */
    public int f121176b = 1;

    /* renamed from: c */
    public C62995dn f121177c = C62995dn.f170057a;

    /* renamed from: e */
    private byte f121178e = 2;

    static {
        C46222c cVar = new C46222c();
        f121173d = cVar;
        C62942bv.registerDefaultInstance(C46222c.class, cVar);
    }

    private C46222c() {
    }

    /* renamed from: a */
    public final C62995dn mo50271a() {
        C62995dn dnVar = this.f121177c;
        if (!dnVar.f170058b) {
            this.f121177c = dnVar.mo58980a();
        }
        return this.f121177c;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f121178e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f121178e = b;
                return null;
            case 2:
                return newMessageInfo(f121173d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001င\u0000\u0002в", new Object[]{"a", "b", C45240c.f118157a, C46220a.f121172a});
            case 3:
                return new C46222c();
            case 4:
                return new C46221b();
            case 5:
                return f121173d;
            case 6:
                C63010eb ebVar = f121174f;
                if (ebVar == null) {
                    synchronized (C46222c.class) {
                        ebVar = f121174f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f121173d);
                            f121174f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
