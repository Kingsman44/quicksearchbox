package com.google.android.apps.gsa.staticplugins.smartspace.p8761b;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.android.apps.gsa.staticplugins.smartspace.p8764e.C117383a;
import com.google.assistant.p3886c.C50818do;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.b.a */
/* compiled from: PG */
public final class C117352a extends C90953s {

    /* renamed from: a */
    final /* synthetic */ C117353b f325776a;

    /* renamed from: b */
    private final C83739ak f325777b;

    /* renamed from: c */
    private final SettableFuture f325778c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117352a(C117353b bVar, C83739ak akVar, SettableFuture settableFuture) {
        super("SSBirthdayUtils");
        this.f325776a = bVar;
        this.f325777b = akVar;
        this.f325778c = settableFuture;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            C50818do a = this.f325776a.mo103275a(this.f325777b);
            if (a == null) {
                this.f325778c.mo57356n(new C117383a());
                return;
            }
            this.f325778c.mo57356n(new C117383a(a, ((BitmapDrawable) drawable).getBitmap()));
        }
    }
}
