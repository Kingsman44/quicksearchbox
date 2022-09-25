package com.google.android.libraries.elements.p1708c.p1709a;

import android.os.Build;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.C66260r;
import com.google.protos.youtube.elements.p5165a.C66026n;
import com.google.protos.youtube.elements.p5165a.C66028p;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5491a.p5492a.C69795a;
import p5488io.p5490b.p5491a.p5493b.C69797b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.c.a.x */
/* compiled from: PG */
public final class C20743x implements C21312s {

    /* renamed from: a */
    public static final C58495hd f58062a = C58495hd.m89904r(C66028p.HAPTIC_TYPE_LIGHT_IMPACT, new C20728i(1, 1), C66028p.HAPTIC_TYPE_MEDIUM_IMPACT, new C20728i(3, 3), C66028p.HAPTIC_TYPE_HEAVY_IMPACT, new C20728i(6, 6), C66028p.HAPTIC_TYPE_SELECTION_CLICK, new C20728i(4, 4), C66028p.HAPTIC_TYPE_SUCCESS, new C20728i(16, 16));

    /* renamed from: b */
    private final C21259bb f58063b;

    public C20743x(C21259bb bbVar) {
        this.f58063b = bbVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C66026n.f179560d;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C66026n nVar = (C66026n) obj;
        if ((nVar.f179562a & 1) != 0) {
            C58495hd hdVar = f58062a;
            C66028p a = C66028p.m96832a(nVar.f179563b);
            if (a == null) {
                a = C66028p.HAPTIC_TYPE_UNKNOWN;
            }
            if (!hdVar.containsKey(a)) {
                C21259bb bbVar = this.f58063b;
                C66260r rVar2 = C66260r.LOG_TYPE_COMMAND_EXECUTION_ERROR;
                Object[] objArr = new Object[1];
                C66028p a2 = C66028p.m96832a(nVar.f179563b);
                if (a2 == null) {
                    a2 = C66028p.HAPTIC_TYPE_UNKNOWN;
                }
                objArr[0] = a2.name();
                bbVar.mo25782a(rVar2, String.format("Haptic type %s is not available.", objArr), rVar.mo26734d(), (Throwable) null);
                C69794a aVar = C69874i.f186267a;
                C69822d dVar = C70101a.f186847o;
                return aVar;
            }
            int i = Build.VERSION.SDK_INT;
            C66028p a3 = C66028p.m96832a(nVar.f179563b);
            if (a3 == null) {
                a3 = C66028p.HAPTIC_TYPE_UNKNOWN;
            }
            if (i < ((C20742w) hdVar.get(a3)).mo25810b()) {
                C21259bb bbVar2 = this.f58063b;
                C66260r rVar3 = C66260r.LOG_TYPE_COMMAND_EXECUTION_ERROR;
                Object[] objArr2 = new Object[2];
                C66028p a4 = C66028p.m96832a(nVar.f179563b);
                if (a4 == null) {
                    a4 = C66028p.HAPTIC_TYPE_UNKNOWN;
                }
                objArr2[0] = a4.name();
                objArr2[1] = Integer.valueOf(Build.VERSION.SDK_INT);
                bbVar2.mo25782a(rVar3, String.format("Haptic type %s is not supported in Android version %d.", objArr2), rVar.mo26734d(), (Throwable) null);
                C69794a aVar2 = C69874i.f186267a;
                C69822d dVar2 = C70101a.f186847o;
                return aVar2;
            }
            C69794a h = C69794a.m101256h(new C20741v(rVar, nVar));
            C70128t tVar = C69797b.f186184a;
            C69795a.m101266a(tVar);
            return h.mo61452j(tVar);
        }
        this.f58063b.mo25782a(C66260r.LOG_TYPE_MISSING_FIELD, "HapticCommand is missing a type.", rVar.mo26734d(), (Throwable) null);
        C69794a aVar3 = C69874i.f186267a;
        C69822d dVar3 = C70101a.f186847o;
        return aVar3;
    }
}
