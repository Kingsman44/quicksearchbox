package com.google.android.gms.car.p10750a.p10751a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.C143134br;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.p10758a.C143185b;
import com.google.android.gms.car.display.p10758a.C143190g;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.p445a.C8850c;
import com.google.frameworks.client.p4624a.p4625a.C61301b;

/* renamed from: com.google.android.gms.car.a.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C142985ai {

    /* renamed from: a */
    public final /* synthetic */ C142995as f388017a;

    /* renamed from: b */
    public final /* synthetic */ CarDisplayId f388018b;

    public /* synthetic */ C142985ai(C142995as asVar, CarDisplayId carDisplayId) {
        this.f388017a = asVar;
        this.f388018b = carDisplayId;
    }

    /* renamed from: a */
    public final C143185b mo117923a() {
        C142995as asVar = this.f388017a;
        CarDisplayId carDisplayId = this.f388018b;
        C143134br s = asVar.mo117937s();
        C143185b bVar = null;
        if (s != null) {
            if (C143109au.m232164a("CAR.CLIENT", 3)) {
                C143316a.m232514d(3, "CAR.CLIENT", (Throwable) null, "Multi-display client enabled. Get ICarDisplay for: %s", C61301b.m93812a(carDisplayId));
            }
            C143190g q = s.mo118074q();
            Parcel gA = q.mo17260gA();
            C8850c.m23497f(gA, carDisplayId);
            Parcel gT = q.mo17261gT(3, gA);
            IBinder readStrongBinder = gT.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplay");
                bVar = queryLocalInterface instanceof C143185b ? (C143185b) queryLocalInterface : new C143185b(readStrongBinder);
            }
            gT.recycle();
            bVar.getClass();
        }
        return bVar;
    }
}
