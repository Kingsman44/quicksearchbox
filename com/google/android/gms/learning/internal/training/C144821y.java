package com.google.android.gms.learning.internal.training;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.internal.p10828b.C144766b;
import com.google.android.gms.learning.internal.p10828b.C144768d;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.gms.tasks.C146010af;
import com.google.common.base.C58887cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.learning.internal.training.y */
/* compiled from: PG */
public final /* synthetic */ class C144821y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f391649a;

    /* renamed from: b */
    public final /* synthetic */ C146010af f391650b;

    /* renamed from: c */
    public final /* synthetic */ Executor f391651c;

    public /* synthetic */ C144821y(Context context, C146010af afVar, Executor executor) {
        this.f391649a = context;
        this.f391650b = afVar;
        this.f391651c = executor;
    }

    public final void run() {
        Context context = this.f391649a;
        C146010af afVar = this.f391650b;
        Executor executor = this.f391651c;
        try {
            C144814r rVar = (C144814r) C144768d.m235289a(context, "com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl", C144820x.f391648a);
            try {
                rVar.init(new C144166k(context), new C144166k(executor), new C144822z(afVar, rVar));
            } catch (RemoteException e) {
                afVar.f394698a.mo122509w(new C143842n(new Status(1, 8, C58887cx.m90975b(e), (PendingIntent) null, (ConnectionResult) null)));
            }
        } catch (C144766b e2) {
            afVar.f394698a.mo122509w(new C143842n(new Status(1, 17, "Cannot create in-app canceller: ".concat(String.valueOf(e2.getMessage())), (PendingIntent) null, (ConnectionResult) null)));
        }
    }
}
