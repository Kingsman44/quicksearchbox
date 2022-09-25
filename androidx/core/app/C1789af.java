package androidx.core.app;

import android.os.Bundle;
import android.widget.RemoteViews;

/* renamed from: androidx.core.app.af */
/* compiled from: PG */
public class C1789af {

    /* renamed from: e */
    protected C1839z f5579e;

    /* renamed from: f */
    public CharSequence f5580f;

    /* renamed from: g */
    public CharSequence f5581g;

    /* renamed from: h */
    public boolean f5582h = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4986a() {
        return null;
    }

    /* renamed from: b */
    public void mo4987b(C1830q qVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4991c(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f5581g = bundle.getCharSequence("android.summaryText");
            this.f5582h = true;
        }
        this.f5580f = bundle.getCharSequence("android.title.big");
    }

    /* renamed from: f */
    public RemoteViews mo4988f() {
        return null;
    }

    /* renamed from: h */
    public void mo4995h(Bundle bundle) {
        if (this.f5582h) {
            bundle.putCharSequence("android.summaryText", this.f5581g);
        }
        CharSequence charSequence = this.f5580f;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String a = mo4986a();
        if (a != null) {
            bundle.putString("android.support.v4.app.extra.COMPAT_TEMPLATE", a);
        }
    }

    /* renamed from: k */
    public RemoteViews mo4989k() {
        return null;
    }

    /* renamed from: l */
    public RemoteViews mo4990l() {
        return null;
    }
}
