package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.view.View;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.googlequicksearchbox.R;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.bw */
/* compiled from: PG */
public final /* synthetic */ class C110364bw implements Callable {

    /* renamed from: a */
    public final /* synthetic */ View f307592a;

    public /* synthetic */ C110364bw(View view) {
        this.f307592a = view;
    }

    public final Object call() {
        this.f307592a.findViewById(R.id.photo_page_progress_bar).setVisibility(8);
        return C118826c.f331422a;
    }
}
