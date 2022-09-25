package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55522ab;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55541au;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.aw */
/* compiled from: PG */
public final class C55613aw extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C55613aw f146733j;

    /* renamed from: k */
    private static volatile C63010eb f146734k;

    /* renamed from: a */
    public int f146735a;

    /* renamed from: b */
    public String f146736b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C55659co f146737c;

    /* renamed from: d */
    public long f146738d;

    /* renamed from: e */
    public int f146739e;

    /* renamed from: f */
    public C55653ci f146740f;

    /* renamed from: g */
    public int f146741g;

    /* renamed from: h */
    public C62971cq f146742h = emptyProtobufList();

    /* renamed from: i */
    public C55543aw f146743i;

    static {
        C55613aw awVar = new C55613aw();
        f146733j = awVar;
        C62942bv.registerDefaultInstance(C55613aw.class, awVar);
    }

    private C55613aw() {
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
                return newMessageInfo(f146733j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0001\u0000\u0001ဈ\u0000\u0005ဌ\u0004\u0007ဂ\u0002\bဉ\u0001\tဉ\u0005\n\u001b\u000bဌ\u0006\fဉ\u0007", new Object[]{"a", "b", "e", C55541au.f146564a, "d", C45240c.f118157a, C10662f.f35572a, C19618h.f54585a, C55661cq.class, C30325g.f82003a, C55522ab.m87702b(), "i"});
            case 3:
                return new C55613aw();
            case 4:
                return new C55612av();
            case 5:
                return f146733j;
            case 6:
                C63010eb ebVar = f146734k;
                if (ebVar == null) {
                    synchronized (C55613aw.class) {
                        ebVar = f146734k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146733j);
                            f146734k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
