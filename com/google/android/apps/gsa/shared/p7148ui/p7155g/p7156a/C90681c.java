package com.google.android.apps.gsa.shared.p7148ui.p7155g.p7156a;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.shared.ui.g.a.c */
/* compiled from: PG */
final class C90681c implements C22869e {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f253581a;

    /* renamed from: b */
    final /* synthetic */ ImageView f253582b;

    /* renamed from: c */
    final /* synthetic */ Drawable f253583c;

    public C90681c(AtomicBoolean atomicBoolean, ImageView imageView, Drawable drawable) {
        this.f253581a = atomicBoolean;
        this.f253582b = imageView;
        this.f253583c = drawable;
    }

    public final void run() {
        synchronized (this.f253581a) {
            if (!this.f253581a.get() && this.f253582b.getDrawable() == null) {
                this.f253582b.setImageDrawable(this.f253583c);
            }
        }
    }
}
