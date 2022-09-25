package com.google.android.libraries.places.api.p2437b;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.C146004a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.p2426a.p2436d.C31844b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.b.n */
/* compiled from: PG */
public abstract class C31858n implements C31844b {
    /* renamed from: j */
    public static C31857m m59252j() {
        C31848d dVar = new C31848d();
        dVar.f85485d = new ArrayList();
        dVar.f85488g = new ArrayList();
        return dVar;
    }

    /* renamed from: a */
    public abstract C146004a mo37404a();

    /* renamed from: b */
    public abstract LatLng mo37422b();

    /* renamed from: c */
    public abstract AutocompleteSessionToken mo37423c();

    /* renamed from: d */
    public abstract LocationBias mo37424d();

    /* renamed from: e */
    public abstract LocationRestriction mo37425e();

    @Deprecated
    /* renamed from: f */
    public abstract TypeFilter mo37427f();

    /* renamed from: g */
    public abstract String mo37428g();

    /* renamed from: h */
    public abstract List mo37429h();

    /* renamed from: i */
    public abstract List mo37431i();
}
