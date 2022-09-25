package com.google.assistant.p3803ag.p3809c;

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

/* renamed from: com.google.assistant.ag.c.ga */
/* compiled from: PG */
public final class C49089ga extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C49089ga f126948l;

    /* renamed from: n */
    private static volatile C63010eb f126949n;

    /* renamed from: a */
    public int f126950a;

    /* renamed from: b */
    public int f126951b;

    /* renamed from: c */
    public int f126952c;

    /* renamed from: d */
    public float f126953d;

    /* renamed from: e */
    public C62971cq f126954e = emptyProtobufList();

    /* renamed from: f */
    public boolean f126955f;

    /* renamed from: g */
    public String f126956g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f126957h = 1;

    /* renamed from: i */
    public int f126958i;

    /* renamed from: j */
    public int f126959j;

    /* renamed from: k */
    public int f126960k;

    /* renamed from: m */
    private int f126961m;

    static {
        C49089ga gaVar = new C49089ga();
        f126948l = gaVar;
        C62942bv.registerDefaultInstance(C49089ga.class, gaVar);
    }

    private C49089ga() {
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
                return newMessageInfo(f126948l, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0007\u001b\bဇ\u0005\tဈ\u0006\nဌ\u0007\u000bဌ\b\fဌ\n\rဌ\t", new Object[]{"m", "a", "b", C45240c.f118157a, "d", "e", C49097gi.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C49086fy.f126947a, "i", C49080fs.f126944a, C19621k.f54601a, C49084fw.f126946a, "j", C49082fu.f126945a});
            case 3:
                return new C49089ga();
            case 4:
                return new C49079fr();
            case 5:
                return f126948l;
            case 6:
                C63010eb ebVar = f126949n;
                if (ebVar == null) {
                    synchronized (C49089ga.class) {
                        ebVar = f126949n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126948l);
                            f126949n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
