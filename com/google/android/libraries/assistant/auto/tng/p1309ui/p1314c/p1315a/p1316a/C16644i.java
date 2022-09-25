package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.a.a.i */
/* compiled from: PG */
public final class C16644i extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C16644i f48739j;

    /* renamed from: l */
    private static volatile C63010eb f48740l;

    /* renamed from: a */
    public int f48741a;

    /* renamed from: b */
    public C16654s f48742b;

    /* renamed from: c */
    public String f48743c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C16636ah f48744d;

    /* renamed from: e */
    public C16642g f48745e;

    /* renamed from: f */
    public C16639d f48746f;

    /* renamed from: g */
    public boolean f48747g;

    /* renamed from: h */
    public C16744be f48748h;

    /* renamed from: i */
    public boolean f48749i;

    /* renamed from: k */
    private byte f48750k = 2;

    static {
        C16644i iVar = new C16644i();
        f48739j = iVar;
        C62942bv.registerDefaultInstance(C16644i.class, iVar);
    }

    private C16644i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48750k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48750k = b;
                return null;
            case 2:
                return newMessageInfo(f48739j, "\u0001\b\u0000\u0001\u0002\r\b\u0000\u0000\u0001\u0002ဈ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\tဇ\u0007\u000bᐉ\b\fဉ\u0000\rဇ\t", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "b", "i"});
            case 3:
                return new C16644i();
            case 4:
                return new C16643h();
            case 5:
                return f48739j;
            case 6:
                C63010eb ebVar = f48740l;
                if (ebVar == null) {
                    synchronized (C16644i.class) {
                        ebVar = f48740l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48739j);
                            f48740l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
