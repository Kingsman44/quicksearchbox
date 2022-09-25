package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.n */
/* compiled from: PG */
public final class C57653n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57653n f153960d;

    /* renamed from: g */
    private static volatile C63010eb f153961g;

    /* renamed from: a */
    public C57601br f153962a;

    /* renamed from: b */
    public String f153963b;

    /* renamed from: c */
    public String f153964c;

    /* renamed from: e */
    private C57582az f153965e;

    /* renamed from: f */
    private C62995dn f153966f = C62995dn.f170057a;

    static {
        C57653n nVar = new C57653n();
        f153960d = nVar;
        C62942bv.registerDefaultInstance(C57653n.class, nVar);
    }

    private C57653n() {
        emptyIntList();
        this.f153963b = BuildConfig.FLAVOR;
        this.f153964c = BuildConfig.FLAVOR;
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
                return newMessageInfo(f153960d, "\u0000\u0005\u0000\u0000\u0003\u000b\u0005\u0001\u0000\u0000\u0003Ȉ\u00052\u0006Ȉ\u0007\t\u000b\t", new Object[]{"b", C10662f.f35572a, C57652m.f153959a, C45240c.f118157a, "a", "e"});
            case 3:
                return new C57653n();
            case 4:
                return new C57651l();
            case 5:
                return f153960d;
            case 6:
                C63010eb ebVar = f153961g;
                if (ebVar == null) {
                    synchronized (C57653n.class) {
                        ebVar = f153961g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153960d);
                            f153961g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
