package com.google.protos.p4985f.p5030q;

import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p4280bt.C56488d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4851a.p4852a.C63324h;

/* renamed from: com.google.protos.f.q.fc */
/* compiled from: PG */
public final class C65196fc extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C65196fc f176453l;

    /* renamed from: n */
    private static volatile C63010eb f176454n;

    /* renamed from: a */
    public int f176455a;

    /* renamed from: b */
    public int f176456b = 0;

    /* renamed from: c */
    public Object f176457c;

    /* renamed from: d */
    public int f176458d;

    /* renamed from: e */
    public C61752n f176459e;

    /* renamed from: f */
    public C63324h f176460f;

    /* renamed from: g */
    public C52081en f176461g;

    /* renamed from: h */
    public C19088t f176462h;

    /* renamed from: i */
    public boolean f176463i;

    /* renamed from: j */
    public C65163dx f176464j;

    /* renamed from: k */
    public C62961ch f176465k;

    /* renamed from: m */
    private byte f176466m = 2;

    static {
        C65196fc fcVar = new C65196fc();
        f176453l = fcVar;
        C62942bv.registerDefaultInstance(C65196fc.class, fcVar);
    }

    private C65196fc() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.f176465k = emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176466m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176466m = b;
                return null;
            case 2:
                return newMessageInfo(f176453l, "\u0000\n\u0001\u0001\u0001\u0013\n\u0000\u0001\u0004\u0001Љ\u0002\f\u0003<\u0000\u0004\t\u0007Љ\bЉ\f\u0007\u0011<\u0000\u0012ᐉ\u0000\u0013'", new Object[]{C45240c.f118157a, "b", "a", "e", "d", C65159dt.class, C30325g.f82003a, C19618h.f54585a, C10662f.f35572a, "i", C56488d.class, "j", C19621k.f54601a});
            case 3:
                return new C65196fc();
            case 4:
                return new C65192ez();
            case 5:
                return f176453l;
            case 6:
                C63010eb ebVar = f176454n;
                if (ebVar == null) {
                    synchronized (C65196fc.class) {
                        ebVar = f176454n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176453l);
                            f176454n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
