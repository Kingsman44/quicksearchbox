package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.common.internal.C143900ap;
import com.google.android.gms.location.internal.C144913ab;
import com.google.android.gms.location.internal.C144918ag;
import com.google.android.gms.location.internal.C144930h;
import com.google.android.gms.location.internal.C144935m;
import com.google.android.gms.location.internal.C144936n;
import com.google.android.gms.location.internal.C144937o;
import com.google.android.gms.location.internal.C144938p;
import com.google.android.gms.location.internal.C144939q;
import com.google.android.gms.location.internal.C144940r;
import com.google.android.gms.location.internal.C144941s;
import com.google.android.gms.location.internal.C144944v;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.tasks.C146004a;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146013ai;
import com.google.common.util.concurrent.C60826bg;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.location.r */
/* compiled from: PG */
public final /* synthetic */ class C144957r implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ CurrentLocationRequest f391920a;

    /* renamed from: b */
    public final /* synthetic */ C146004a f391921b;

    public /* synthetic */ C144957r(CurrentLocationRequest currentLocationRequest, C146004a aVar) {
        this.f391920a = currentLocationRequest;
        this.f391921b = aVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        CurrentLocationRequest currentLocationRequest = this.f391920a;
        C146004a aVar = this.f391921b;
        C144918ag agVar = (C144918ag) obj;
        Context context = agVar.f390156t;
        if (agVar.mo120420q(C144956q.f391912e)) {
            C143900ap q = ((C144930h) agVar.mo119451G()).mo120446q(currentLocationRequest, new C144941s((C146010af) obj2));
            if (aVar != null) {
                aVar.mo122481b(new C144935m(q));
                return;
            }
            return;
        }
        C146010af afVar = (C146010af) obj2;
        C143784ce c = C143785cf.m233681c(new C144938p(agVar, afVar), C60826bg.f164896a, "GetCurrentLocation");
        C143782cc ccVar = (C143782cc) Objects.requireNonNull(c.f389806b);
        C144939q qVar = new C144939q(c, afVar);
        C146010af afVar2 = new C146010af();
        C144890au auVar = new C144890au(currentLocationRequest.f391743c, 0);
        auVar.f391828b = 0;
        auVar.mo120384b(currentLocationRequest.f391744d);
        int i = currentLocationRequest.f391742b;
        C144879aj.m235477b(i);
        auVar.f391831e = i;
        auVar.mo120385c(currentLocationRequest.f391741a);
        auVar.f391833g = currentLocationRequest.f391745e;
        int i2 = currentLocationRequest.f391746f;
        C144902bf.m235502b(i2);
        auVar.f391832f = i2;
        boolean z = true;
        auVar.f391830d = true;
        auVar.mo120386d(currentLocationRequest.f391747g);
        auVar.f391834h = currentLocationRequest.f391748h;
        LocationRequest a = auVar.mo120383a();
        C143782cc ccVar2 = (C143782cc) Objects.requireNonNull(qVar.f391893a.f389806b);
        boolean q2 = agVar.mo120420q(C144956q.f391917j);
        synchronized (agVar.f391883b) {
            C144913ab abVar = (C144913ab) agVar.f391883b.get(ccVar2);
            if (abVar == null) {
                z = q2;
            } else if (!q2) {
                throw new IllegalStateException();
            }
            C144913ab abVar2 = new C144913ab(qVar);
            agVar.f391883b.put(ccVar2, abVar2);
            Context context2 = agVar.f390156t;
            String a2 = ccVar2.mo119232a();
            if (z) {
                ((C144930h) agVar.mo119451G()).mo120438i(LocationReceiver.m235510a(abVar, abVar2, a2), a, new C144940r((Object) null, afVar2));
            } else {
                C144890au auVar2 = new C144890au(a);
                auVar2.mo120386d((String) null);
                ((C144930h) agVar.mo119451G()).mo120444o(new LocationRequestUpdateData(1, LocationRequestInternal.m235512a(auVar2.mo120383a()), (IBinder) null, abVar2, (PendingIntent) null, new C144944v(afVar2, abVar2), a2));
            }
        }
        afVar2.f394698a.mo122493l(C146013ai.f394700a, new C144936n(afVar));
        if (aVar != null) {
            aVar.mo122481b(new C144937o(agVar, ccVar));
        }
    }
}
