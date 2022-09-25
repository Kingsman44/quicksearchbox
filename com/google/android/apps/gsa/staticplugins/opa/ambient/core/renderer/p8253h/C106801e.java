package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8253h;

import android.support.p033v7.widget.AppCompatImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.h.e */
/* compiled from: PG */
final class C106801e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ AppCompatImageView f297640a;

    /* renamed from: b */
    final /* synthetic */ C106803g f297641b;

    public C106801e(C106803g gVar, AppCompatImageView appCompatImageView) {
        this.f297641b = gVar;
        this.f297640a = appCompatImageView;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f297640a.setBackgroundResource(R.drawable.quantum_gm_ic_contacts_product_white_48);
        ((C58970a) ((C58970a) ((C58970a) this.f297641b.f297645a.mo56225c()).mo56382g(th)).mo56372aa(23311)).mo56386p("Error fetching contact image");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && !bool.booleanValue()) {
            ((C58970a) ((C58970a) this.f297641b.f297645a.mo56225c()).mo56372aa(23313)).mo56386p("Image not set, setContactProfilePhoto returned false");
            this.f297640a.setBackgroundResource(R.drawable.quantum_gm_ic_contacts_product_white_48);
        }
    }
}
