package com.google.android.libraries.lens.view.p2065ai;

import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.ai.z */
/* compiled from: PG */
public final /* synthetic */ class C25188z implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C25141ab f68603a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f68604b;

    public /* synthetic */ C25188z(C25141ab abVar, ImageView imageView) {
        this.f68603a = abVar;
        this.f68604b = imageView;
    }

    public final void onClick(View view) {
        C25141ab abVar = this.f68603a;
        ImageView imageView = this.f68604b;
        C25758g gVar = abVar.f68453b.f73043a;
        gVar.mo5708l(Boolean.valueOf(!((Boolean) gVar.mo3842a()).booleanValue()));
        abVar.f68455d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(imageView));
    }
}
