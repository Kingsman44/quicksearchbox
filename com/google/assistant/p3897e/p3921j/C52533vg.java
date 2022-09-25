package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.vg */
/* compiled from: PG */
public final class C52533vg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52533vg f137890f;

    /* renamed from: h */
    private static volatile C63010eb f137891h;

    /* renamed from: a */
    public int f137892a;

    /* renamed from: b */
    public int f137893b = 0;

    /* renamed from: c */
    public Object f137894c;

    /* renamed from: d */
    public String f137895d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f137896e;

    /* renamed from: g */
    private byte f137897g = 2;

    static {
        C52533vg vgVar = new C52533vg();
        f137890f = vgVar;
        C62942bv.registerDefaultInstance(C52533vg.class, vgVar);
    }

    private C52533vg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f137897g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f137897g = b;
                return null;
            case 2:
                return newMessageInfo(f137890f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐼ\u0000\u0003ျ\u0000\u0004င\u0003", new Object[]{C45240c.f118157a, "b", "a", "d", C51016dg.class, "e"});
            case 3:
                return new C52533vg();
            case 4:
                return new C52532vf();
            case 5:
                return f137890f;
            case 6:
                C63010eb ebVar = f137891h;
                if (ebVar == null) {
                    synchronized (C52533vg.class) {
                        ebVar = f137891h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137890f);
                            f137891h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
