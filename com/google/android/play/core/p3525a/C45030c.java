package com.google.android.play.core.p3525a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.C45197a;
import com.google.android.play.core.p3527b.C45051b;
import com.google.android.play.core.p3529c.C45053a;

/* renamed from: com.google.android.play.core.a.c */
/* compiled from: PG */
public final class C45030c extends C45051b {
    public C45030c(Context context) {
        super(new C45053a("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48865a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (!context.getPackageName().equals(intent2.getStringExtra("package.name"))) {
            this.f117689a.mo48883a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent2.getStringExtra("package.name"));
            return;
        }
        this.f117689a.mo48883a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f117689a.mo48883a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        C45053a aVar = this.f117689a;
        aVar.mo48883a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        aVar.mo48883a("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
        aVar.mo48883a("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
        C45197a aVar2 = new C45197a(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
        this.f117689a.mo48883a("ListenerRegistryBroadcastReceiver.onReceive: %s", aVar2);
        mo48881d(aVar2);
    }
}
