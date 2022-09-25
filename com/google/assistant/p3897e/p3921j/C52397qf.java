package com.google.assistant.p3897e.p3921j;

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

@Deprecated
/* renamed from: com.google.assistant.e.j.qf */
/* compiled from: PG */
public final class C52397qf extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C52397qf f137491j;

    /* renamed from: k */
    private static volatile C63010eb f137492k;

    /* renamed from: a */
    public int f137493a;

    /* renamed from: b */
    public int f137494b = 0;

    /* renamed from: c */
    public Object f137495c;

    /* renamed from: d */
    public C62961ch f137496d = emptyIntList();

    /* renamed from: e */
    public C62961ch f137497e = emptyIntList();

    /* renamed from: f */
    public C62961ch f137498f = emptyIntList();

    /* renamed from: g */
    public C62961ch f137499g = emptyIntList();

    /* renamed from: h */
    public int f137500h = 1;

    /* renamed from: i */
    public C52393qb f137501i;

    static {
        C52397qf qfVar = new C52397qf();
        f137491j = qfVar;
        C62942bv.registerDefaultInstance(C52397qf.class, qfVar);
    }

    private C52397qf() {
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo53855a() {
        C62961ch chVar = this.f137496d;
        if (!chVar.mo58948c()) {
            this.f137496d = C62942bv.mutableCopy(chVar);
        }
    }

    /* renamed from: b */
    public final void mo53856b() {
        C62961ch chVar = this.f137497e;
        if (!chVar.mo58948c()) {
            this.f137497e = C62942bv.mutableCopy(chVar);
        }
    }

    /* renamed from: c */
    public final void mo53857c() {
        C62961ch chVar = this.f137499g;
        if (!chVar.mo58948c()) {
            this.f137499g = C62942bv.mutableCopy(chVar);
        }
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
                return newMessageInfo(f137491j, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0004\u0000\u0001'\u0002'\u0003'\u0004'\u0005င\u0000\u0006ဉ\u0001\u0007ြ\u0000\b့\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C52393qb.class});
            case 3:
                return new C52397qf();
            case 4:
                return new C52396qe();
            case 5:
                return f137491j;
            case 6:
                C63010eb ebVar = f137492k;
                if (ebVar == null) {
                    synchronized (C52397qf.class) {
                        ebVar = f137492k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137491j);
                            f137492k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
