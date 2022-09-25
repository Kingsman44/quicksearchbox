package com.google.common.p4552o.p4566l;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.h */
/* compiled from: PG */
public final class C60208h extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C60208h f162890l;

    /* renamed from: o */
    private static volatile C63010eb f162891o;

    /* renamed from: a */
    public int f162892a;

    /* renamed from: b */
    public int f162893b;

    /* renamed from: c */
    public long f162894c;

    /* renamed from: d */
    public String f162895d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f162896e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f162897f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f162898g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f162899h;

    /* renamed from: i */
    public C60206f f162900i;

    /* renamed from: j */
    public C62971cq f162901j;

    /* renamed from: k */
    public C60135b f162902k;

    /* renamed from: m */
    private C60212l f162903m;

    /* renamed from: n */
    private byte f162904n = 2;

    static {
        C60208h hVar = new C60208h();
        f162890l = hVar;
        C62942bv.registerDefaultInstance(C60208h.class, hVar);
    }

    private C60208h() {
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.f162901j = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162904n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162904n = b;
                return null;
            case 2:
                return newMessageInfo(f162890l, "\u0001\n\u0000\u0002\u0002;\n\u0000\u0001\u0001\u0002ဂ\u0001\tဈ\u000e\rဈ\u000b\u0011ဈ\u0011\u001fဆ\u001d!ဉ\u001f%ᐉ!(\u001b0ဉ);ဈ\u000f", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C30325g.f82003a, C19618h.f54585a, "i", "m", "j", C60189d.class, C19621k.f54601a, C10662f.f35572a});
            case 3:
                return new C60208h();
            case 4:
                return new C60207g();
            case 5:
                return f162890l;
            case 6:
                C63010eb ebVar = f162891o;
                if (ebVar == null) {
                    synchronized (C60208h.class) {
                        ebVar = f162891o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162890l);
                            f162891o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
