package com.google.android.apps.gsa.staticplugins.smartspace.p8766g;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.android.apps.gsa.smartspace.C92109e;
import com.google.android.apps.gsa.staticplugins.smartspace.p8764e.C117383a;
import com.google.assistant.p3886c.C50818do;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g.f */
/* compiled from: PG */
final class C117402f extends C90953s {

    /* renamed from: a */
    final /* synthetic */ C117403g f325904a;

    /* renamed from: b */
    private final C92109e f325905b;

    /* renamed from: c */
    private final SettableFuture f325906c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117402f(C117403g gVar, C92109e eVar, SettableFuture settableFuture) {
        super("SmartspaceCommuteIH");
        this.f325904a = gVar;
        this.f325905b = eVar;
        this.f325906c = settableFuture;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            C50818do a = this.f325904a.mo103289a(this.f325905b);
            if (a == null) {
                this.f325906c.mo57356n(new C117383a());
                return;
            }
            this.f325906c.mo57356n(new C117383a(a, ((BitmapDrawable) drawable).getBitmap()));
        }
    }
}
