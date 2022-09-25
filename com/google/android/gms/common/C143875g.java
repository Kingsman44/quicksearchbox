package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.C1837x;
import androidx.core.app.C1839z;
import com.google.android.gms.common.api.internal.C143769bq;
import com.google.android.gms.common.api.internal.C143770br;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143949t;
import com.google.android.gms.common.internal.C143952w;
import com.google.android.gms.common.internal.C143954y;
import com.google.android.gms.common.util.C144007g;
import com.google.android.gms.libs.p10835c.C144854b;
import com.google.android.googlequicksearchbox.R;
import com.google.p3723ar.imp.view.C48004n;

/* renamed from: com.google.android.gms.common.g */
/* compiled from: PG */
public final class C143875g extends C143876h {

    /* renamed from: a */
    public static final C143875g f389987a = new C143875g();

    /* renamed from: b */
    public static final int f389988b = C143876h.f389990c;

    /* renamed from: e */
    private static final Object f389989e = new Object();

    /* renamed from: a */
    public final Dialog mo119353a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return mo119354b(activity, i, new C143952w(mo119363k(activity, i, "d"), activity, i2), onCancelListener);
    }

    /* renamed from: b */
    public final Dialog mo119354b(Context context, int i, C143954y yVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C143949t.m234114d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C143949t.m234113c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, yVar);
        }
        String g = C143949t.m234117g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: c */
    public final PendingIntent mo119355c(Context context, ConnectionResult connectionResult) {
        if (connectionResult.mo119067a()) {
            return connectionResult.f389575d;
        }
        return super.mo119364l(context, connectionResult.f389574c, (String) null);
    }

    /* renamed from: d */
    public final C143770br mo119356d(Context context, C143769bq bqVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C143770br brVar = new C143770br(bqVar);
        C144854b.m235443a(context, brVar, intentFilter);
        brVar.f389790a = context;
        if (C143700ab.m233446h(context, "com.google.android.gms")) {
            return brVar;
        }
        bqVar.mo119157a();
        brVar.mo119216a();
        return null;
    }

    /* renamed from: e */
    public final void mo119357e(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof C0167am) {
                FragmentManager jw = ((C0167am) activity).mo545jw();
                C143705ag agVar = new C143705ag();
                C143919bh.m233971n(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                agVar.f389608a = dialog;
                if (onCancelListener != null) {
                    agVar.f389609b = onCancelListener;
                }
                agVar.show(jw, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        C143857c cVar = new C143857c();
        C143919bh.m233971n(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f389949a = dialog;
        if (onCancelListener != null) {
            cVar.f389950b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    /* renamed from: f */
    public final void mo119358f(Context context) {
        new C143874f(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: g */
    public final void mo119359g(Context context, int i) {
        mo119360h(context, i, super.mo119364l(context, i, C48004n.f124238a));
    }

    /* renamed from: h */
    public final void mo119360h(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            mo119358f(context);
        } else if (pendingIntent != null) {
            String f = C143949t.m234116f(context, i);
            String e = C143949t.m234115e(context, i);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            C143919bh.m233958a(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            C1839z zVar = new C1839z(context, (String) null);
            zVar.f5702v = true;
            zVar.mo5015d(16, true);
            zVar.f5685e = C1839z.m5037c(f);
            C1837x xVar = new C1837x();
            xVar.f5669a = C1839z.m5037c(e);
            zVar.mo5022k(xVar);
            if (C144007g.m234185a(context.getPackageManager())) {
                zVar.f5679J.icon = context.getApplicationInfo().icon;
                zVar.f5690j = 2;
                if (C144007g.m234186b(context)) {
                    zVar.mo5016e(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    zVar.f5687g = pendingIntent;
                }
            } else {
                zVar.f5679J.icon = 17301642;
                zVar.mo5023l(resources.getString(R.string.common_google_play_services_notification_ticker));
                zVar.f5679J.when = System.currentTimeMillis();
                zVar.f5687g = pendingIntent;
                zVar.f5686f = C1839z.m5037c(e);
            }
            synchronized (f389989e) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String b = C143949t.m234112b(context);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", b, 4));
            } else if (!b.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(b);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            zVar.f5675F = "com.google.android.gms.availability";
            Notification a = zVar.mo5013a();
            if (i == 1 || i == 2 || i == 3) {
                C143700ab.f389599c.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* renamed from: i */
    public final void mo119361i(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a = mo119353a(activity, i, i2, onCancelListener);
        if (a != null) {
            mo119357e(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }
}
