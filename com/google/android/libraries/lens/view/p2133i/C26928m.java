package com.google.android.libraries.lens.view.p2133i;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26897b;
import com.google.android.libraries.lens.view.p2133i.p2136c.C26911g;
import com.google.android.libraries.lens.view.p2133i.p2136c.C26912h;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.lens.view.i.m */
/* compiled from: PG */
public final class C26928m implements C26912h {

    /* renamed from: a */
    public final /* synthetic */ C26932q f73368a;

    public C26928m(C26932q qVar) {
        this.f73368a = qVar;
    }

    /* renamed from: a */
    public final void mo32309a(C26911g gVar, int i) {
        C26897b bVar = C26897b.READY_TO_SEND;
        int b = gVar.mo32281b();
        int i2 = b - 1;
        if (b == 0) {
            throw null;
        } else if (i2 == 1) {
            Duration between = Duration.between(gVar.mo32280a(), Instant.now());
            if (between.toMillis() >= 800) {
                between = Duration.ZERO;
            }
            WeakReference weakReference = new WeakReference(this.f73368a.f73389d);
            C26932q qVar = this.f73368a;
            qVar.f73400o = qVar.f73392g.mo29165e(new C26927l(weakReference), between.toMillis(), TimeUnit.MILLISECONDS);
        } else if (i2 == 4) {
            this.f73368a.f73399n.f73375d.setVisibility(8);
            if (i != 3) {
                this.f73368a.f73391f.mo32276g(this.f73368a.f73399n.f73372a.getContext().getResources().getString(R.string.lens_cloud_copy_device_picker_refresh_error_toast_message));
            }
        }
    }

    /* renamed from: b */
    public final void mo32300b(C26911g gVar, int i) {
        C26935t tVar = this.f73368a.f73397l;
        if (tVar != null) {
            tVar.mObservable.mo2879a();
        }
        mo32309a(gVar, i);
    }
}
