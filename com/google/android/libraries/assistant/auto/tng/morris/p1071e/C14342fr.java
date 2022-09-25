package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.fr */
/* compiled from: PG */
public final class C14342fr extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C14342fr f43389l;

    /* renamed from: m */
    private static volatile C63010eb f43390m;

    /* renamed from: a */
    public String f43391a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f43392b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C14216b f43393c;

    /* renamed from: d */
    public String f43394d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f43395e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f43396f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C14320ew f43397g;

    /* renamed from: h */
    public long f43398h;

    /* renamed from: i */
    public long f43399i;

    /* renamed from: j */
    public C14361gj f43400j;

    /* renamed from: k */
    public String f43401k = BuildConfig.FLAVOR;

    static {
        C14342fr frVar = new C14342fr();
        f43389l = frVar;
        C62942bv.registerDefaultInstance(C14342fr.class, frVar);
    }

    private C14342fr() {
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
                return newMessageInfo(f43389l, "\u0000\u000b\u0000\u0000\u0001\u0011\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\n\u0010\u000b\u0003\r\t\u000eȈ\u000fȈ\u0010\t\u0011\t", new Object[]{"a", "d", "e", C10662f.f35572a, C19618h.f54585a, "i", "j", C19621k.f54601a, "b", C30325g.f82003a, C45240c.f118157a});
            case 3:
                return new C14342fr();
            case 4:
                return new C14341fq();
            case 5:
                return f43389l;
            case 6:
                C63010eb ebVar = f43390m;
                if (ebVar == null) {
                    synchronized (C14342fr.class) {
                        ebVar = f43390m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43389l);
                            f43390m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
