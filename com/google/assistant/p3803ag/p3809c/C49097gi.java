package com.google.assistant.p3803ag.p3809c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.gi */
/* compiled from: PG */
public final class C49097gi extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C49097gi f126970k;

    /* renamed from: m */
    private static volatile C63010eb f126971m;

    /* renamed from: a */
    public int f126972a;

    /* renamed from: b */
    public C49096gh f126973b;

    /* renamed from: c */
    public int f126974c;

    /* renamed from: d */
    public int f126975d;

    /* renamed from: e */
    public int f126976e;

    /* renamed from: f */
    public int f126977f;

    /* renamed from: g */
    public String f126978g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public long f126979h;

    /* renamed from: i */
    public long f126980i;

    /* renamed from: j */
    public C62961ch f126981j = emptyIntList();

    /* renamed from: l */
    private int f126982l;

    static {
        C49097gi giVar = new C49097gi();
        f126970k = giVar;
        C62942bv.registerDefaultInstance(C49097gi.class, giVar);
    }

    private C49097gi() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f126970k, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004\u0006ဌ\u0006\u0007ဈ\u0007\bဂ\b\tဂ\t\u000b\u0016", new Object[]{"l", "a", "b", C45240c.f118157a, C49091gc.f126962a, "d", "e", C10662f.f35572a, C49093ge.f126963a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C49097gi();
            case 4:
                return new C49090gb();
            case 5:
                return f126970k;
            case 6:
                C63010eb ebVar = f126971m;
                if (ebVar == null) {
                    synchronized (C49097gi.class) {
                        ebVar = f126971m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126970k);
                            f126971m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
