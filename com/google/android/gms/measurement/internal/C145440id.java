package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.id */
/* compiled from: PG */
final class C145440id extends C145231ak {

    /* renamed from: b */
    final /* synthetic */ C145456it f393224b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145440id(C145456it itVar, C145383ga gaVar) {
        super(gaVar);
        this.f393224b = itVar;
    }

    /* renamed from: b */
    public final void mo120830b() {
        C145456it itVar = this.f393224b;
        itVar.mo120904g();
        if (itVar.mo121165u()) {
            itVar.f393011w.mo120965ar().f392803k.mo120894a("Inactivity, disconnecting from the service");
            itVar.mo121154j();
        }
    }
}
