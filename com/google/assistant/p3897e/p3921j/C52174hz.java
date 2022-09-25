package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.hz */
/* compiled from: PG */
public final class C52174hz extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C52174hz f136892m;

    /* renamed from: o */
    private static volatile C63010eb f136893o;

    /* renamed from: a */
    public int f136894a;

    /* renamed from: b */
    public String f136895b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51098gh f136896c;

    /* renamed from: d */
    public C52568wo f136897d;

    /* renamed from: e */
    public long f136898e;

    /* renamed from: f */
    public C62971cq f136899f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public C62971cq f136900g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public String f136901h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f136902i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f136903j;

    /* renamed from: k */
    public float f136904k;

    /* renamed from: l */
    public C62961ch f136905l = emptyIntList();

    /* renamed from: n */
    private byte f136906n = 2;

    static {
        C52174hz hzVar = new C52174hz();
        f136892m = hzVar;
        C62942bv.registerDefaultInstance(C52174hz.class, hzVar);
    }

    private C52174hz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136906n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136906n = b;
                return null;
            case 2:
                return newMessageInfo(f136892m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0003\u0001\u0001ဈ\u0000\u0002ဉ\u0002\u0003ᐉ\u0003\u0004ဂ\u0004\u0005\u001a\u0006\u001a\bဈ\u0005\tဌ\u0007\nဈ\u0006\u000bခ\b\r\u0016", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "j", C52172hx.f136891a, "i", C19621k.f54601a, "l"});
            case 3:
                return new C52174hz();
            case 4:
                return new C52171hw();
            case 5:
                return f136892m;
            case 6:
                C63010eb ebVar = f136893o;
                if (ebVar == null) {
                    synchronized (C52174hz.class) {
                        ebVar = f136893o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136892m);
                            f136893o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
