package com.google.android.gms.phenotype;

import android.util.Log;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146036p;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.phenotype.ac */
/* compiled from: PG */
public final /* synthetic */ class C145719ac implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C145721ae f394043a;

    /* renamed from: b */
    public final /* synthetic */ int f394044b;

    /* renamed from: c */
    public final /* synthetic */ String f394045c;

    /* renamed from: d */
    public final /* synthetic */ Executor f394046d;

    /* renamed from: e */
    public final /* synthetic */ C145720ad f394047e;

    public /* synthetic */ C145719ac(C145721ae aeVar, int i, String str, Executor executor, C145720ad adVar) {
        this.f394043a = aeVar;
        this.f394044b = i;
        this.f394045c = str;
        this.f394046d = executor;
        this.f394047e = adVar;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C145721ae aeVar = this.f394043a;
        int i = this.f394044b;
        String str = this.f394045c;
        Executor executor = this.f394046d;
        C145720ad adVar = this.f394047e;
        boolean j = abVar.mo122491j();
        if (!j && i > 1) {
            String str2 = aeVar.f394049b;
            Log.w("PhenotypeFlagCommitter", "Committing snapshot for " + str2 + " failed, retrying");
            aeVar.mo121884c(str, executor, adVar, i + -1);
        } else if (adVar != null) {
            adVar.mo44743a(j);
        }
    }
}
