package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3832d.p3833a.C49351b;
import com.google.assistant.p3825an.p3836f.p3837a.C49374a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.zs */
/* compiled from: PG */
public final class C50509zs extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f131478e = new C50507zq();

    /* renamed from: j */
    public static final C50509zs f131479j;

    /* renamed from: k */
    private static volatile C63010eb f131480k;

    /* renamed from: a */
    public int f131481a;

    /* renamed from: b */
    public String f131482b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f131483c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62961ch f131484d = emptyIntList();

    /* renamed from: f */
    public String f131485f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f131486g;

    /* renamed from: h */
    public int f131487h;

    /* renamed from: i */
    public String f131488i;

    static {
        C50509zs zsVar = new C50509zs();
        f131479j = zsVar;
        C62942bv.registerDefaultInstance(C50509zs.class, zsVar);
    }

    private C50509zs() {
        emptyIntList();
        this.f131486g = C62942bv.emptyProtobufList();
        this.f131488i = BuildConfig.FLAVOR;
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
                return newMessageInfo(f131479j, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001e\u0004ဈ\u0001\u0006\u001a\u0007ဌ\u0002\bဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C49351b.m85420b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C49374a.f127616a, "i"});
            case 3:
                return new C50509zs();
            case 4:
                return new C50508zr();
            case 5:
                return f131479j;
            case 6:
                C63010eb ebVar = f131480k;
                if (ebVar == null) {
                    synchronized (C50509zs.class) {
                        ebVar = f131480k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131479j);
                            f131480k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
