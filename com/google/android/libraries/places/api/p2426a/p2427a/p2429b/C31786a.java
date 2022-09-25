package com.google.android.libraries.places.api.p2426a.p2427a.p2429b;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.places.api.p2426a.p2435c.C31842a;
import com.google.android.libraries.places.api.p2426a.p2436d.C31843a;
import com.google.android.libraries.places.p2424a.p2425a.C31773d;
import com.google.android.libraries.places.p2424a.p2425a.C31777h;
import com.google.android.libraries.places.p2424a.p2425a.C31778i;
import com.google.common.p4552o.p4564j.C60009ae;
import com.google.common.p4552o.p4564j.C60012ah;
import com.google.common.p4552o.p4564j.C60022ar;
import com.google.common.p4552o.p4564j.C60024at;
import com.google.common.p4552o.p4564j.C60043r;
import java.util.Locale;

/* renamed from: com.google.android.libraries.places.api.a.a.b.a */
/* compiled from: PG */
public final class C31786a implements C31842a {

    /* renamed from: a */
    public final C31773d f85409a;

    /* renamed from: b */
    public final C31843a f85410b;

    /* renamed from: c */
    private final C31777h f85411c;

    public C31786a(C31777h hVar, C31773d dVar, C31843a aVar) {
        this.f85411c = hVar;
        this.f85409a = dVar;
        this.f85410b = aVar;
    }

    /* renamed from: d */
    public static final int m59143d(C146006ab abVar) {
        C143842n nVar;
        if (abVar.mo122491j()) {
            return 2;
        }
        Exception f = abVar.mo122487f();
        f.getClass();
        if (f instanceof C143842n) {
            nVar = (C143842n) f;
        } else {
            nVar = new C143842n(new Status(1, 13, f.getMessage(), (PendingIntent) null, (ConnectionResult) null));
        }
        int i = nVar.f389919a.f389621g;
        if (i != 7) {
            return i != 15 ? 1 : 3;
        }
        return 4;
    }

    /* renamed from: a */
    public final C60022ar mo37384a() {
        Locale b = this.f85410b.mo37401b();
        Locale locale = Locale.getDefault();
        C60022ar arVar = (C60022ar) C60024at.f162232g.createBuilder();
        String locale2 = b.toString();
        arVar.copyOnWrite();
        C60024at atVar = (C60024at) arVar.instance;
        locale2.getClass();
        atVar.f162234a |= 2;
        atVar.f162236c = locale2;
        if (!b.equals(locale)) {
            String locale3 = locale.toString();
            arVar.copyOnWrite();
            C60024at atVar2 = (C60024at) arVar.instance;
            locale3.getClass();
            atVar2.f162234a |= 4;
            atVar2.f162237d = locale3;
        }
        return arVar;
    }

    /* renamed from: b */
    public final void mo37385b(C60043r rVar) {
        C60009ae b = C31778i.m59135b(this.f85409a);
        b.copyOnWrite();
        C60012ah ahVar = (C60012ah) b.instance;
        C60012ah ahVar2 = C60012ah.f162194m;
        ahVar.f162197b = 16;
        ahVar.f162196a |= 2;
        b.copyOnWrite();
        C60012ah ahVar3 = (C60012ah) b.instance;
        rVar.getClass();
        ahVar3.f162202g = rVar;
        ahVar3.f162196a |= 8388608;
        String a = this.f85410b.mo37400a();
        b.copyOnWrite();
        C60012ah ahVar4 = (C60012ah) b.instance;
        a.getClass();
        ahVar4.f162196a |= 1073741824;
        ahVar4.f162207l = a;
        mo37386c((C60012ah) b.build());
    }

    /* renamed from: c */
    public final void mo37386c(C60012ah ahVar) {
        this.f85411c.mo37382a(C31778i.m59134a(ahVar));
    }
}
