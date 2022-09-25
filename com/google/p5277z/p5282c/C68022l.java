package com.google.p5277z.p5282c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.c.l */
/* compiled from: PG */
public final class C68022l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68022l f184294b;

    /* renamed from: d */
    private static volatile C63010eb f184295d;

    /* renamed from: a */
    public C62995dn f184296a = C62995dn.f170057a;

    /* renamed from: c */
    private byte f184297c = 2;

    static {
        C68022l lVar = new C68022l();
        f184294b = lVar;
        C62942bv.registerDefaultInstance(C68022l.class, lVar);
    }

    private C68022l() {
        emptyProtobufList();
    }

    /* renamed from: a */
    public final C62995dn mo60078a() {
        C62995dn dnVar = this.f184296a;
        if (!dnVar.f170058b) {
            this.f184296a = dnVar.mo58980a();
        }
        return this.f184296a;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184297c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184297c = b;
                return null;
            case 2:
                return newMessageInfo(f184294b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"a", C68019i.f184292a});
            case 3:
                return new C68022l();
            case 4:
                return new C68015e();
            case 5:
                return f184294b;
            case 6:
                C63010eb ebVar = f184295d;
                if (ebVar == null) {
                    synchronized (C68022l.class) {
                        ebVar = f184295d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184294b);
                            f184295d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
