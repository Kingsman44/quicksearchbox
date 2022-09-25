package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.oe */
/* compiled from: PG */
public final class C14572oe extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C14572oe f44055i;

    /* renamed from: k */
    private static volatile C63010eb f44056k;

    /* renamed from: a */
    public String f44057a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f44058b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f44059c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f44060d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C14286dp f44061e;

    /* renamed from: f */
    public C14320ew f44062f;

    /* renamed from: g */
    public boolean f44063g;

    /* renamed from: h */
    public C14286dp f44064h;

    /* renamed from: j */
    private byte f44065j = 2;

    static {
        C14572oe oeVar = new C14572oe();
        f44055i = oeVar;
        C62942bv.registerDefaultInstance(C14572oe.class, oeVar);
    }

    private C14572oe() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f44065j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f44065j = b;
                return null;
            case 2:
                return newMessageInfo(f44055i, "\u0000\b\u0000\u0000\u0001\u000b\b\u0000\u0000\u0002\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Љ\bȈ\t\t\n\u0007\u000bЉ", new Object[]{"a", C45240c.f118157a, "d", "e", "b", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C14572oe();
            case 4:
                return new C14571od();
            case 5:
                return f44055i;
            case 6:
                C63010eb ebVar = f44056k;
                if (ebVar == null) {
                    synchronized (C14572oe.class) {
                        ebVar = f44056k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44055i);
                            f44056k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
