package com.google.android.enterprise.connectedapps;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.UserHandle;
import android.util.Log;
import com.google.android.enterprise.connectedapps.p10715b.C142560a;
import com.google.android.enterprise.connectedapps.p10715b.C142562c;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.enterprise.connectedapps.l */
/* compiled from: PG */
public final /* synthetic */ class C142590l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C142543ac f386904a;

    public /* synthetic */ C142590l(C142543ac acVar) {
        this.f386904a = acVar;
    }

    public final void run() {
        C142543ac acVar = this.f386904a;
        Log.i("CrossProfileSender", "Attempting to bind");
        ScheduledFuture scheduledFuture = (ScheduledFuture) acVar.f386814i.getAndSet((Object) null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (!acVar.f386811f) {
            acVar.mo117157i("Required APIs are unavailable. Binding is not possible.", (Exception) null, false);
        } else if (acVar.mo117166r()) {
            Log.i("CrossProfileSender", "Already bound");
            acVar.mo117158j();
        } else if (acVar.f386816k.isEmpty()) {
            acVar.mo117157i("Not trying to bind", (Exception) null, false);
        } else if (!acVar.f386823r.mo117142a(acVar.f386809d)) {
            acVar.mo117157i("Permission not granted", (Exception) null, false);
        } else if (!acVar.mo117165q()) {
            acVar.mo117157i("No profile available", (Exception) null, false);
        } else if (acVar.f386815j.get() != null) {
            Log.i("CrossProfileSender", "Already waiting to bind");
        } else {
            try {
                acVar.f386815j.set(acVar.f386808c.schedule(new C142591m(acVar), 1, TimeUnit.MINUTES));
                Context context = acVar.f386809d;
                ComponentName componentName = acVar.f386810e;
                ServiceConnection serviceConnection = acVar.f386820o;
                UserHandle b = C142543ac.m231103b(context, acVar.f386812g);
                if (b != null) {
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    try {
                        if (!((Boolean) context.getClass().getMethod("bindServiceAsUser", new Class[]{Intent.class, ServiceConnection.class, Integer.TYPE, UserHandle.class}).invoke(context, new Object[]{intent, serviceConnection, 1, b})).booleanValue()) {
                            context.unbindService(serviceConnection);
                        } else {
                            Log.i("CrossProfileSender", "binder.tryBind returned true, expecting onServiceConnected");
                            return;
                        }
                    } catch (IllegalAccessException e) {
                        e = e;
                        throw new C142560a(e);
                    } catch (NoSuchMethodException e2) {
                        e = e2;
                        throw new C142560a(e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        throw new C142560a(e);
                    }
                }
                acVar.mo117157i("No profile available, app not installed in other profile, or service not included in manifest", (Exception) null, false);
            } catch (C142560a e4) {
                Log.e("CrossProfileSender", "MissingApiException when trying to bind", e4);
                acVar.mo117157i("Missing API", e4, false);
            } catch (C142562c e5) {
                Log.e("CrossProfileSender", "Error while trying to bind", e5);
                acVar.mo117157i(e5.getMessage(), e5, false);
            }
        }
    }
}
