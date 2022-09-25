package com.google.android.gms.phenotype;

import android.util.Log;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146036p;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.phenotype.ab */
/* compiled from: PG */
public final /* synthetic */ class C145718ab implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C145721ae f394038a;

    /* renamed from: b */
    public final /* synthetic */ C145720ad f394039b;

    /* renamed from: c */
    public final /* synthetic */ Executor f394040c;

    /* renamed from: d */
    public final /* synthetic */ int f394041d;

    /* renamed from: e */
    public final /* synthetic */ String f394042e;

    public /* synthetic */ C145718ab(C145721ae aeVar, C145720ad adVar, Executor executor, int i, String str) {
        this.f394038a = aeVar;
        this.f394039b = adVar;
        this.f394040c = executor;
        this.f394041d = i;
        this.f394042e = str;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C145721ae aeVar = this.f394038a;
        C145720ad adVar = this.f394039b;
        Executor executor = this.f394040c;
        int i = this.f394041d;
        String str = this.f394042e;
        if (!abVar.mo122491j()) {
            String str2 = aeVar.f394049b;
            Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for " + str2 + " failed");
            if (adVar != null) {
                adVar.mo44743a(false);
            }
        } else if (aeVar.mo121885d((Configurations) abVar.mo122488g())) {
            String str3 = ((Configurations) abVar.mo122488g()).f393980a;
            if (str3 != null && !str3.isEmpty()) {
                aeVar.f394048a.mo121901a(str3).mo122493l(executor, new C145719ac(aeVar, i, str, executor, adVar));
            } else if (adVar != null) {
                adVar.mo44743a(true);
            }
        } else if (adVar != null) {
            adVar.mo44743a(false);
        }
    }
}
