package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.ao */
/* compiled from: PG */
public final class C119793ao extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C119793ao f333670e;

    /* renamed from: g */
    private static volatile C63010eb f333671g;

    /* renamed from: a */
    public C119834cb f333672a;

    /* renamed from: b */
    public int f333673b;

    /* renamed from: c */
    public String f333674c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C34053bp f333675d;

    /* renamed from: f */
    private byte f333676f = 2;

    static {
        C119793ao aoVar = new C119793ao();
        f333670e = aoVar;
        C62942bv.registerDefaultInstance(C119793ao.class, aoVar);
    }

    private C119793ao() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333676f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333676f = b;
                return null;
            case 2:
                return newMessageInfo(f333670e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0001\u0001\t\u0002\u0004\u0004Ȉ\u0005Љ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C119793ao();
            case 4:
                return new C119792an();
            case 5:
                return f333670e;
            case 6:
                C63010eb ebVar = f333671g;
                if (ebVar == null) {
                    synchronized (C119793ao.class) {
                        ebVar = f333671g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333670e);
                            f333671g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
