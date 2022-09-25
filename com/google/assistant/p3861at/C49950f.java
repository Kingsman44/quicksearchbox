package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.f */
/* compiled from: PG */
public final class C49950f extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C49950f f129847h;

    /* renamed from: j */
    private static volatile C63010eb f129848j;

    /* renamed from: a */
    public int f129849a;

    /* renamed from: b */
    public String f129850b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129851c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f129852d;

    /* renamed from: e */
    public C50139m f129853e;

    /* renamed from: f */
    public C49954fd f129854f;

    /* renamed from: g */
    public C50301s f129855g;

    /* renamed from: i */
    private byte f129856i = 2;

    static {
        C49950f fVar = new C49950f();
        f129847h = fVar;
        C62942bv.registerDefaultInstance(C49950f.class, fVar);
    }

    private C49950f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129856i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129856i = b;
                return null;
            case 2:
                return newMessageInfo(f129847h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0006ဇ\u0006\u0007ဉ\u0007\bᐉ\b\tဉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C49950f();
            case 4:
                return new C49923e();
            case 5:
                return f129847h;
            case 6:
                C63010eb ebVar = f129848j;
                if (ebVar == null) {
                    synchronized (C49950f.class) {
                        ebVar = f129848j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129847h);
                            f129848j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
