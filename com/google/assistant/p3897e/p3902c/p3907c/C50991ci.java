package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ci */
/* compiled from: PG */
public final class C50991ci extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50991ci f132741h;

    /* renamed from: j */
    private static volatile C63010eb f132742j;

    /* renamed from: a */
    public int f132743a;

    /* renamed from: b */
    public String f132744b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f132745c;

    /* renamed from: d */
    public C51016dg f132746d;

    /* renamed from: e */
    public int f132747e;

    /* renamed from: f */
    public String f132748f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C52460so f132749g;

    /* renamed from: i */
    private byte f132750i = 2;

    static {
        C50991ci ciVar = new C50991ci();
        f132741h = ciVar;
        C62942bv.registerDefaultInstance(C50991ci.class, ciVar);
    }

    private C50991ci() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132750i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132750i = b;
                return null;
            case 2:
                return newMessageInfo(f132741h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C50989cg.f132740a, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C50991ci();
            case 4:
                return new C50988cf();
            case 5:
                return f132741h;
            case 6:
                C63010eb ebVar = f132742j;
                if (ebVar == null) {
                    synchronized (C50991ci.class) {
                        ebVar = f132742j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132741h);
                            f132742j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
