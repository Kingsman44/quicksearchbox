package com.google.p375ai.p378b;

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

/* renamed from: com.google.ai.b.za */
/* compiled from: PG */
public final class C8195za extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C8195za f28790j;

    /* renamed from: k */
    private static volatile C63010eb f28791k;

    /* renamed from: a */
    public int f28792a;

    /* renamed from: b */
    public int f28793b;

    /* renamed from: c */
    public int f28794c;

    /* renamed from: d */
    public int f28795d;

    /* renamed from: e */
    public String f28796e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f28797f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f28798g;

    /* renamed from: h */
    public int f28799h;

    /* renamed from: i */
    public int f28800i;

    static {
        C8195za zaVar = new C8195za();
        f28790j = zaVar;
        C62942bv.registerDefaultInstance(C8195za.class, zaVar);
    }

    private C8195za() {
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
                return newMessageInfo(f28790j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\tင\t\nဌ\n\u000bဌ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C19618h.f54585a, "i", C8196zb.f28801a, C30325g.f82003a, C8192yy.f28776a});
            case 3:
                return new C8195za();
            case 4:
                return new C8191yx();
            case 5:
                return f28790j;
            case 6:
                C63010eb ebVar = f28791k;
                if (ebVar == null) {
                    synchronized (C8195za.class) {
                        ebVar = f28791k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28790j);
                            f28791k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
