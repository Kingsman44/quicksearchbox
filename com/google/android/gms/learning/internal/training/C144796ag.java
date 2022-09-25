package com.google.android.gms.learning.internal.training;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.C144758h;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.common.base.C58887cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.learning.internal.training.ag */
/* compiled from: PG */
public final class C144796ag implements C144758h {

    /* renamed from: a */
    private final C144811o f391639a;

    public C144796ag(C144811o oVar) {
        this.f391639a = oVar;
    }

    /* renamed from: b */
    public static C146006ab m235326b(Context context, Executor executor, InAppTrainerOptions inAppTrainerOptions) {
        C146010af afVar = new C146010af();
        executor.execute(new C144793ad(context, afVar, executor, inAppTrainerOptions));
        return afVar.f394698a;
    }

    /* renamed from: c */
    public static boolean m235327c(Uri uri) {
        return uri != null && "appdir".equals(uri.getScheme());
    }

    /* renamed from: a */
    public final C146006ab mo120194a() {
        C146010af afVar = new C146010af();
        try {
            this.f391639a.start(0, new C144795af(afVar));
        } catch (RemoteException e) {
            afVar.f394698a.mo122509w(new C143842n(new Status(1, 8, C58887cx.m90975b(e), (PendingIntent) null, (ConnectionResult) null)));
        }
        return afVar.f394698a;
    }
}
