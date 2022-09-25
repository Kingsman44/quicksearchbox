package com.google.android.apps.gsa.sidekick.shared.snackbar;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.android.googlequicksearchbox.R;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.snackbar.d */
/* compiled from: PG */
public final class C91919d {

    /* renamed from: a */
    protected final Context f256338a;

    /* renamed from: b */
    public final C90932cb f256339b;

    /* renamed from: c */
    public final Rect f256340c = new Rect();

    /* renamed from: d */
    public final Set f256341d = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: e */
    public final C90936cf f256342e = new C91917b(this);

    static {
        TimeUnit.SECONDS.toMillis(5);
    }

    public C91919d(Context context, C90932cb cbVar) {
        new Rect();
        this.f256338a = context;
        this.f256339b = cbVar;
        context.getResources().getBoolean(R.bool.snackbar_use_phone_display);
    }
}
