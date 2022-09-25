package com.google.android.libraries.lens.view.p2133i;

import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.i.l */
/* compiled from: PG */
public final /* synthetic */ class C26927l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f73367a;

    public /* synthetic */ C26927l(WeakReference weakReference) {
        this.f73367a = weakReference;
    }

    public final Object call() {
        C26917d dVar = (C26917d) this.f73367a.get();
        if (dVar == null || dVar.getView() == null) {
            return null;
        }
        C26931p pVar = dVar.mo17754z().f73399n;
        if (dVar.mo17754z().f73391f.mo32270a() == 0) {
            dVar.mo17754z().f73391f.mo32276g(pVar.f73372a.getContext().getResources().getString(R.string.lens_cloud_copy_device_loading_error_toast_message));
            pVar.mo32315c(1);
            return null;
        }
        pVar.mo32315c(3);
        return null;
    }
}
