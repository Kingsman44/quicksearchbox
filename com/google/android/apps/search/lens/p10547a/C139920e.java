package com.google.android.apps.search.lens.p10547a;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.search.lens.a.e */
/* compiled from: PG */
final class C139920e {

    /* renamed from: a */
    public final Context f380362a;

    /* renamed from: b */
    private final boolean f380363b;

    public C139920e(Context context) {
        this.f380362a = context;
        boolean z = false;
        while (!z && (context instanceof ContextWrapper)) {
            z = context instanceof Activity;
            context = ((ContextWrapper) context).getBaseContext();
        }
        this.f380363b = !z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo115336a(Intent intent) {
        try {
            if (this.f380363b) {
                intent.addFlags(268435456);
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.setClassLoader(this.f380362a.getClassLoader());
            }
            KeyguardManager keyguardManager = (KeyguardManager) this.f380362a.getSystemService("keyguard");
            if (keyguardManager.isKeyguardLocked() && !keyguardManager.isDeviceLocked()) {
                Context context = this.f380362a;
                if (context instanceof Activity) {
                    keyguardManager.requestDismissKeyguard((Activity) context, new C139919d(this, intent));
                    return;
                }
            }
            this.f380362a.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((C58970a) ((C58970a) ((C58970a) C139921f.f380364a.mo56225c()).mo56382g(e)).mo56372aa(41484)).mo56389s("No activity found for %s", intent);
        } catch (SecurityException e2) {
            ((C58970a) ((C58970a) ((C58970a) C139921f.f380364a.mo56225c()).mo56382g(e2)).mo56372aa(41485)).mo56389s("Cannot start activity: %s", intent);
        }
    }
}
