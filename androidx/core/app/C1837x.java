package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;

/* renamed from: androidx.core.app.x */
/* compiled from: PG */
public final class C1837x extends C1789af {

    /* renamed from: a */
    public CharSequence f5669a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo4986a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    /* renamed from: b */
    public final void mo4987b(C1830q qVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(((C1792ai) qVar).f5598b).setBigContentTitle(this.f5580f).bigText(this.f5669a);
        if (this.f5582h) {
            bigText.setSummaryText(this.f5581g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo4991c(Bundle bundle) {
        super.mo4991c(bundle);
        this.f5669a = bundle.getCharSequence("android.bigText");
    }
}
