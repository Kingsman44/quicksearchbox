package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.notifications.p2267d.C29785a;
import com.google.android.libraries.notifications.p2267d.C29786b;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2337h.p2338a.C30144a;
import com.google.apps.tiktok.tracing.C47538ax;

/* compiled from: PG */
public class SystemTrayActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        C29786b bVar;
        Context applicationContext = getApplicationContext();
        Intent intent = getIntent();
        if (intent == null) {
            C30058b.m55791c("SystemTrayActivity", "SystemTrayActivity received null intent", new Object[0]);
        } else {
            C30058b.m55793e("SystemTrayActivity", "Intent received for action [%s] package [%s].", intent.getAction(), intent.getPackage());
            try {
                bVar = C29785a.m54946a(getApplicationContext());
            } catch (IllegalStateException e) {
                C30058b.m55797i("SystemTrayActivity", e, "Chime component not initialized: Activity stopped.", new Object[0]);
                bVar = null;
            }
            if (bVar != null) {
                bVar.mo34988BS();
                C30144a.m56002a(applicationContext);
                C47538ax c = bVar.mo34994rW().f81524a.mo51613c("SystemTrayActivity");
                try {
                    super.onCreate(bundle);
                    if (c != null) {
                        c.close();
                    }
                    if (intent.getBooleanExtra("com.google.android.libraries.notifications.HANDLE_IN_FOREGROUND", false)) {
                        C29785a.m54946a(applicationContext).mo34990cs().mo34980b(new C29980a(applicationContext, intent));
                    } else {
                        Intent intent2 = new Intent(intent);
                        intent2.setFlags(268435456);
                        Class<SystemTrayBroadcastReceiver> cls = SystemTrayBroadcastReceiver.class;
                        C30058b.m55793e("SystemTrayActivity", "Forwarding Intent from Activity to %s", cls);
                        intent2.setClass(this, cls);
                        sendBroadcast(intent2);
                    }
                } catch (Throwable th) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                    } catch (Exception unused) {
                    }
                }
            }
        }
        finish();
        return;
        throw th;
    }
}
