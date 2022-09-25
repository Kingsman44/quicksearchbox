package com.google.android.gms.learning.internal.training;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.C144454a;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.internal.p10828b.C144766b;
import com.google.android.gms.learning.internal.p10828b.C144768d;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.gms.tasks.C146010af;
import com.google.common.base.C58887cx;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.learning.internal.training.ad */
/* compiled from: PG */
public final /* synthetic */ class C144793ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f391632a;

    /* renamed from: b */
    public final /* synthetic */ C146010af f391633b;

    /* renamed from: c */
    public final /* synthetic */ Executor f391634c;

    /* renamed from: d */
    public final /* synthetic */ InAppTrainerOptions f391635d;

    public /* synthetic */ C144793ad(Context context, C146010af afVar, Executor executor, InAppTrainerOptions inAppTrainerOptions) {
        this.f391632a = context;
        this.f391633b = afVar;
        this.f391634c = executor;
        this.f391635d = inAppTrainerOptions;
    }

    public final void run() {
        boolean z;
        Context context = this.f391632a;
        C146010af afVar = this.f391633b;
        Executor executor = this.f391634c;
        InAppTrainerOptions inAppTrainerOptions = this.f391635d;
        synchronized (C144454a.f391087a) {
            z = C144454a.f391088b;
        }
        if (!z) {
            Class<?> cls = context.getApplicationContext().getClass();
            if (!cls.equals(Application.class) && !"android.support.multidex.MultiDexApplication".equals(cls.getName())) {
                String name = cls.getName();
                afVar.f394698a.mo122509w(new C143842n(new Status(1, 10, "Cannot create in-app trainer: android.app.Application class has been subclassed (" + name + ") and BrellaInit.myAppCanHandleMultipleProcesses() was not called", (PendingIntent) null, (ConnectionResult) null)));
                return;
            }
        }
        try {
            C144811o oVar = (C144811o) C144768d.m235289a(context, "com.google.android.gms.learning.dynamite.training.InAppTrainerImpl", C144792ac.f391631a);
            C144794ae aeVar = new C144794ae(afVar, oVar);
            try {
                if (!oVar.initY2022W24(new C144166k(context), new C144166k(executor), inAppTrainerOptions, aeVar)) {
                    if (C144796ag.m235327c(inAppTrainerOptions.f391081m) || C144796ag.m235327c(inAppTrainerOptions.f391078j) || C144796ag.m235327c(inAppTrainerOptions.f391075g)) {
                        afVar.f394698a.mo122509w(new C143842n(new Status(1, 10, "appdata Uri scheme is not supported.", (PendingIntent) null, (ConnectionResult) null)));
                        return;
                    }
                    try {
                        if (oVar.initY2020W36(new C144166k(context), new C144166k(executor), inAppTrainerOptions, aeVar)) {
                            return;
                        }
                        if (inAppTrainerOptions.f391081m == null) {
                            try {
                                if (!oVar.initY2020W30(new C144166k(context), new C144166k(executor), inAppTrainerOptions, aeVar)) {
                                    byte[] bArr = inAppTrainerOptions.f391080l;
                                    if (Arrays.copyOf(bArr, bArr.length).length <= 0) {
                                        try {
                                            if (oVar.initY2020W18(new C144166k(context), new C144166k(executor), inAppTrainerOptions, aeVar)) {
                                                return;
                                            }
                                            if (inAppTrainerOptions.f391073d == null || inAppTrainerOptions.f391079k == null) {
                                                try {
                                                    if (!oVar.initW24(new C144166k(context), new C144166k(executor), inAppTrainerOptions, aeVar)) {
                                                        int i = inAppTrainerOptions.f391074e;
                                                        if (i == 0 || i == 1) {
                                                            try {
                                                                if (!oVar.initV26(new C144166k(context), new C144166k(executor), inAppTrainerOptions, aeVar)) {
                                                                    afVar.f394698a.mo122509w(new C143842n(new Status(1, 17, "Failed to init impl", (PendingIntent) null, (ConnectionResult) null)));
                                                                }
                                                            } catch (RemoteException e) {
                                                                afVar.f394698a.mo122509w(new C143842n(new Status(1, 8, C58887cx.m90975b(e), (PendingIntent) null, (ConnectionResult) null)));
                                                            }
                                                        } else {
                                                            afVar.f394698a.mo122509w(new C143842n(new Status(1, 10, "Unsupported AttestationMode", (PendingIntent) null, (ConnectionResult) null)));
                                                        }
                                                    }
                                                } catch (RemoteException e2) {
                                                    afVar.f394698a.mo122509w(new C143842n(new Status(1, 8, C58887cx.m90975b(e2), (PendingIntent) null, (ConnectionResult) null)));
                                                }
                                            } else {
                                                afVar.f394698a.mo122509w(new C143842n(new Status(1, 10, "Training interval is not supported for federated computation.", (PendingIntent) null, (ConnectionResult) null)));
                                            }
                                        } catch (RemoteException e3) {
                                            afVar.f394698a.mo122509w(new C143842n(new Status(1, 8, C58887cx.m90975b(e3), (PendingIntent) null, (ConnectionResult) null)));
                                        }
                                    } else {
                                        afVar.f394698a.mo122509w(new C143842n(new Status(1, 10, "Context data is not supported.", (PendingIntent) null, (ConnectionResult) null)));
                                    }
                                }
                            } catch (RemoteException e4) {
                                afVar.f394698a.mo122509w(new C143842n(new Status(1, 8, C58887cx.m90975b(e4), (PendingIntent) null, (ConnectionResult) null)));
                            }
                        } else {
                            afVar.f394698a.mo122509w(new C143842n(new Status(1, 10, "local computation plan with TensorflowSpec is not supported.", (PendingIntent) null, (ConnectionResult) null)));
                        }
                    } catch (RemoteException e5) {
                        afVar.f394698a.mo122509w(new C143842n(new Status(1, 8, C58887cx.m90975b(e5), (PendingIntent) null, (ConnectionResult) null)));
                    }
                }
            } catch (RemoteException e6) {
                afVar.f394698a.mo122509w(new C143842n(new Status(1, 8, C58887cx.m90975b(e6), (PendingIntent) null, (ConnectionResult) null)));
            }
        } catch (C144766b e7) {
            afVar.f394698a.mo122509w(new C143842n(new Status(1, 17, "Cannot create in-app trainer: ".concat(String.valueOf(e7.getMessage())), (PendingIntent) null, (ConnectionResult) null)));
        }
    }
}
