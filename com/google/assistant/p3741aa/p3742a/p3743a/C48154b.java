package com.google.assistant.p3741aa.p3742a.p3743a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51261bd;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C52366pb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.a.a.b */
/* compiled from: PG */
public final class C48154b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C48154b f124594i;

    /* renamed from: k */
    private static volatile C63010eb f124595k;

    /* renamed from: a */
    public int f124596a;

    /* renamed from: b */
    public C51527l f124597b;

    /* renamed from: c */
    public C51594nm f124598c;

    /* renamed from: d */
    public C51450id f124599d;

    /* renamed from: e */
    public C52366pb f124600e;

    /* renamed from: f */
    public String f124601f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C51261bd f124602g;

    /* renamed from: h */
    public String f124603h = BuildConfig.FLAVOR;

    /* renamed from: j */
    private byte f124604j = 2;

    static {
        C48154b bVar = new C48154b();
        f124594i = bVar;
        C62942bv.registerDefaultInstance(C48154b.class, bVar);
    }

    private C48154b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124604j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f124604j = b;
                return null;
            case 2:
                return newMessageInfo(f124594i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0004\u0005ဉ\u0003\u0006ဉ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, "e", C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C48154b();
            case 4:
                return new C48131a();
            case 5:
                return f124594i;
            case 6:
                C63010eb ebVar = f124595k;
                if (ebVar == null) {
                    synchronized (C48154b.class) {
                        ebVar = f124595k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124594i);
                            f124595k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
