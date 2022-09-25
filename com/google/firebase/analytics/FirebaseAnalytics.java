package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.measurement.api.internal.C145192am;
import com.google.android.gms.measurement.api.internal.C145207p;
import com.google.android.gms.measurement.internal.C145417hh;
import com.google.android.gms.tasks.C146021aq;
import com.google.firebase.installations.C61255g;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
public final class FirebaseAnalytics {

    /* renamed from: b */
    private static volatile FirebaseAnalytics f165436b;

    /* renamed from: a */
    public final C145192am f165437a;

    public FirebaseAnalytics(C145192am amVar) {
        C143919bh.m233958a(amVar);
        this.f165437a = amVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f165436b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f165436b == null) {
                    f165436b = new FirebaseAnalytics(C145192am.m235849c(context, (Bundle) null));
                }
            }
        }
        return f165436b;
    }

    public static C145417hh getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C145192am c = C145192am.m235849c(context, bundle);
        if (c == null) {
            return null;
        }
        return new C61116a(c);
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) C146021aq.m237853g(C61255g.m93718b().mo57863a(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        C145192am amVar = this.f165437a;
        amVar.mo120702b(new C145207p(amVar, activity, str, str2));
    }
}
