package com.google.android.apps.gsa.staticplugins.smartspace.p8766g;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.android.apps.gsa.staticplugins.smartspace.p8764e.C117383a;
import com.google.assistant.p3886c.C50818do;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g.q */
/* compiled from: PG */
public final class C117413q extends C90953s {

    /* renamed from: a */
    final /* synthetic */ C117414r f325917a;

    /* renamed from: b */
    private final C57017i f325918b;

    /* renamed from: c */
    private final SettableFuture f325919c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117413q(C117414r rVar, C57017i iVar, SettableFuture settableFuture) {
        super("SmartspacePushMessageIH");
        this.f325917a = rVar;
        this.f325918b = iVar;
        this.f325919c = settableFuture;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            Optional d = this.f325917a.mo103292d(this.f325918b);
            if (d.isEmpty()) {
                this.f325919c.mo57356n(new C117383a());
                return;
            }
            this.f325919c.mo57356n(new C117383a((C50818do) d.get(), ((BitmapDrawable) drawable).getBitmap()));
        }
    }
}
