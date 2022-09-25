package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.p060c.C0984n;
import com.google.android.gms.libs.p10835c.C144855c;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.cloudmessaging.w */
/* compiled from: PG */
public final class C143696w {

    /* renamed from: a */
    public static final Executor f389561a = C143694u.f389559a;

    /* renamed from: b */
    public static final Pattern f389562b = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: h */
    private static int f389563h;

    /* renamed from: i */
    private static PendingIntent f389564i;

    /* renamed from: c */
    public final C0984n f389565c = new C0984n(0);

    /* renamed from: d */
    public final Context f389566d;

    /* renamed from: e */
    public final C143688o f389567e;

    /* renamed from: f */
    public Messenger f389568f;

    /* renamed from: g */
    public CloudMessagingMessengerCompat f389569g;

    /* renamed from: j */
    private final ScheduledExecutorService f389570j;

    /* renamed from: k */
    private final Messenger f389571k;

    public C143696w(Context context) {
        this.f389566d = context;
        this.f389567e = new C143688o(context);
        this.f389571k = new Messenger(new C143695v(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f389570j = scheduledThreadPoolExecutor;
    }

    /* renamed from: c */
    public static boolean m233431c(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* renamed from: d */
    private static synchronized String m233432d() {
        String num;
        synchronized (C143696w.class) {
            int i = f389563h;
            f389563h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: e */
    private static synchronized void m233433e(Context context, Intent intent) {
        synchronized (C143696w.class) {
            if (f389564i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f389564i = PendingIntent.getBroadcast(context, 0, intent2, C144855c.f391705a);
            }
            intent.putExtra("app", f389564i);
        }
    }

    /* renamed from: a */
    public final C146006ab mo119065a(Bundle bundle) {
        String d = m233432d();
        C146010af afVar = new C146010af();
        synchronized (this.f389565c) {
            this.f389565c.put(d, afVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f389567e.mo119061b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m233433e(this.f389566d, intent);
        intent.putExtra("kid", "|ID|" + d + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(String.valueOf(intent.getExtras()))));
        }
        intent.putExtra("google.messenger", this.f389571k);
        if (!(this.f389568f == null && this.f389569g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f389568f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f389569g.mo119031b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            afVar.f394698a.mo122493l(f389561a, new C143692s(this, d, this.f389570j.schedule(new C143691r(afVar), 30, TimeUnit.SECONDS)));
            return afVar.f394698a;
        }
        if (this.f389567e.mo119061b() == 2) {
            this.f389566d.sendBroadcast(intent);
        } else {
            this.f389566d.startService(intent);
        }
        afVar.f394698a.mo122493l(f389561a, new C143692s(this, d, this.f389570j.schedule(new C143691r(afVar), 30, TimeUnit.SECONDS)));
        return afVar.f394698a;
    }

    /* renamed from: b */
    public final void mo119066b(String str, Bundle bundle) {
        synchronized (this.f389565c) {
            C146010af afVar = (C146010af) this.f389565c.remove(str);
            if (afVar != null) {
                afVar.f394698a.mo122508v(bundle);
                return;
            }
            Log.w("Rpc", "Missing callback for " + str);
        }
    }
}
