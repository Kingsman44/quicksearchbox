package com.google.assistant.p3897e.p3902c.p3907c;

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

/* renamed from: com.google.assistant.e.c.c.dr */
/* compiled from: PG */
public final class C51027dr extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C51027dr f132852m;

    /* renamed from: o */
    private static volatile C63010eb f132853o;

    /* renamed from: a */
    public int f132854a;

    /* renamed from: b */
    public int f132855b = 0;

    /* renamed from: c */
    public Object f132856c;

    /* renamed from: d */
    public int f132857d = 0;

    /* renamed from: e */
    public Object f132858e;

    /* renamed from: f */
    public boolean f132859f;

    /* renamed from: g */
    public String f132860g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f132861h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f132862i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f132863j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public C51012dc f132864k;

    /* renamed from: l */
    public int f132865l;

    /* renamed from: n */
    private byte f132866n = 2;

    static {
        C51027dr drVar = new C51027dr();
        f132852m = drVar;
        C62942bv.registerDefaultInstance(C51027dr.class, drVar);
    }

    private C51027dr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132866n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132866n = b;
                return null;
            case 2:
                return newMessageInfo(f132852m, "\u0001\f\u0002\u0001\u0001\f\f\u0000\u0000\u0002\u0001ဇ\u0000\u0002ျ\u0000\u0003ᐉ\u0007\u0004ᐼ\u0001\u0005ဈ\u0004\u0006ျ\u0000\u0007ြ\u0001\bြ\u0001\tဈ\u0005\nဈ\u0006\u000bင\u000b\fဈ\u0003", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C19621k.f54601a, C51016dg.class, C19618h.f54585a, C51098gh.class, C51026dq.class, "i", "j", "l", C30325g.f82003a});
            case 3:
                return new C51027dr();
            case 4:
                return new C51024do();
            case 5:
                return f132852m;
            case 6:
                C63010eb ebVar = f132853o;
                if (ebVar == null) {
                    synchronized (C51027dr.class) {
                        ebVar = f132853o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132852m);
                            f132853o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
