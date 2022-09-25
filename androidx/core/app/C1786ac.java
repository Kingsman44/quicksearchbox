package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: androidx.core.app.ac */
/* compiled from: PG */
public final class C1786ac extends C1789af {

    /* renamed from: a */
    private final ArrayList f5567a = new ArrayList();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo4986a() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    /* renamed from: b */
    public final void mo4987b(C1830q qVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((C1792ai) qVar).f5598b).setBigContentTitle(this.f5580f);
        if (this.f5582h) {
            bigContentTitle.setSummaryText(this.f5581g);
        }
        ArrayList arrayList = this.f5567a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bigContentTitle.addLine((CharSequence) arrayList.get(i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo4991c(Bundle bundle) {
        super.mo4991c(bundle);
        this.f5567a.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(this.f5567a, bundle.getCharSequenceArray("android.textLines"));
        }
    }

    /* renamed from: g */
    public final void mo4992g(CharSequence charSequence) {
        if (charSequence != null) {
            this.f5567a.add(C1839z.m5037c(charSequence));
        }
    }
}
