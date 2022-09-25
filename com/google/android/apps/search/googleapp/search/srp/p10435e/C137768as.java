package com.google.android.apps.search.googleapp.search.srp.p10435e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.as */
/* compiled from: PG */
public final class C137768as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137768as f374783c;

    /* renamed from: d */
    private static volatile C63010eb f374784d;

    /* renamed from: a */
    public C62995dn f374785a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f374786b = C62995dn.f170057a;

    static {
        C137768as asVar = new C137768as();
        f374783c = asVar;
        C62942bv.registerDefaultInstance(C137768as.class, asVar);
    }

    private C137768as() {
    }

    /* renamed from: a */
    public final C62995dn mo113948a() {
        C62995dn dnVar = this.f374785a;
        if (!dnVar.f170058b) {
            this.f374785a = dnVar.mo58980a();
        }
        return this.f374785a;
    }

    /* renamed from: b */
    public final C62995dn mo113949b() {
        C62995dn dnVar = this.f374786b;
        if (!dnVar.f170058b) {
            this.f374786b = dnVar.mo58980a();
        }
        return this.f374786b;
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
                return newMessageInfo(f374783c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"a", C137766aq.f374781a, "b", C137767ar.f374782a});
            case 3:
                return new C137768as();
            case 4:
                return new C137765ap();
            case 5:
                return f374783c;
            case 6:
                C63010eb ebVar = f374784d;
                if (ebVar == null) {
                    synchronized (C137768as.class) {
                        ebVar = f374784d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f374783c);
                            f374784d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
