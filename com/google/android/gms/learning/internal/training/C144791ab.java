package com.google.android.gms.learning.internal.training;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.C144759i;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.common.base.C58887cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.learning.internal.training.ab */
/* compiled from: PG */
public final class C144791ab implements C144759i {

    /* renamed from: a */
    private final C144814r f391630a;

    public C144791ab(C144814r rVar) {
        this.f391630a = rVar;
    }

    /* renamed from: b */
    public static C146006ab m235321b(Context context, Executor executor) {
        C146010af afVar = new C146010af();
        executor.execute(new C144821y(context, afVar, executor));
        return afVar.f394698a;
    }

    /* renamed from: a */
    public final C146006ab mo120195a() {
        C146010af afVar = new C146010af();
        try {
            this.f391630a.cancelJobsByType(0, new C144790aa(afVar));
        } catch (RemoteException e) {
            afVar.f394698a.mo122509w(new C143842n(new Status(1, 8, C58887cx.m90975b(e), (PendingIntent) null, (ConnectionResult) null)));
        }
        return afVar.f394698a;
    }
}
