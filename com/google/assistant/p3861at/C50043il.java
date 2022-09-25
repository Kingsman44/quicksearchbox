package com.google.assistant.p3861at;

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

/* renamed from: com.google.assistant.at.il */
/* compiled from: PG */
public final class C50043il extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C50043il f130102i;

    /* renamed from: j */
    private static volatile C63010eb f130103j;

    /* renamed from: a */
    public int f130104a;

    /* renamed from: b */
    public String f130105b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130106c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130107d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f130108e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f130109f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f130110g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C50069jk f130111h;

    static {
        C50043il ilVar = new C50043il();
        f130102i = ilVar;
        C62942bv.registerDefaultInstance(C50043il.class, ilVar);
    }

    private C50043il() {
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
                return newMessageInfo(f130102i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C50043il();
            case 4:
                return new C50042ik();
            case 5:
                return f130102i;
            case 6:
                C63010eb ebVar = f130103j;
                if (ebVar == null) {
                    synchronized (C50043il.class) {
                        ebVar = f130103j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130102i);
                            f130103j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
