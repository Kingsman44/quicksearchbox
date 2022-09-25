package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51544lq;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.j.ec */
/* compiled from: PG */
public final class C66913ec extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C66913ec f181884n;

    /* renamed from: p */
    private static volatile C63010eb f181885p;

    /* renamed from: a */
    public int f181886a;

    /* renamed from: b */
    public int f181887b = 0;

    /* renamed from: c */
    public Object f181888c;

    /* renamed from: d */
    public int f181889d;

    /* renamed from: e */
    public String f181890e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f181891f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f181892g;

    /* renamed from: h */
    public boolean f181893h;

    /* renamed from: i */
    public int f181894i;

    /* renamed from: j */
    public C63088z f181895j = C63088z.f170246b;

    /* renamed from: k */
    public long f181896k;

    /* renamed from: l */
    public String f181897l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public C51544lq f181898m;

    /* renamed from: o */
    private byte f181899o = 2;

    static {
        C66913ec ecVar = new C66913ec();
        f181884n = ecVar;
        C62942bv.registerDefaultInstance(C66913ec.class, ecVar);
    }

    private C66913ec() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181899o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181899o = b;
                return null;
            case 2:
                return newMessageInfo(f181884n, "\u0001\f\u0001\u0001\u0001\u000e\f\u0000\u0000\u0002\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0004\u0005ဌ\u0005\u0006ည\u0006\u0007ဂ\u0007\bျ\u0000\tᐼ\u0000\u000bဈ\u000b\fᐉ\f\u000eဇ\u0003", new Object[]{C45240c.f118157a, "b", "a", "d", C66912eb.f181883a, "e", C10662f.f35572a, C19618h.f54585a, "i", C66908dy.f181882a, "j", C19621k.f54601a, C60218r.class, "l", "m", C30325g.f82003a});
            case 3:
                return new C66913ec();
            case 4:
                return new C66911ea();
            case 5:
                return f181884n;
            case 6:
                C63010eb ebVar = f181885p;
                if (ebVar == null) {
                    synchronized (C66913ec.class) {
                        ebVar = f181885p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181884n);
                            f181885p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
