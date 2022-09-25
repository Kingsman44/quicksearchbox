package com.google.android.libraries.lens.view.session.ondevice;

import android.graphics.Bitmap;
import android.util.Size;
import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24229u;
import com.google.android.libraries.lens.view.p2093d.C25762k;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.x */
/* compiled from: PG */
final class C28015x {

    /* renamed from: a */
    final C24201ad f76229a;

    /* renamed from: b */
    final C56244ay f76230b;

    /* renamed from: c */
    final Bitmap f76231c;

    /* renamed from: d */
    final Size f76232d;

    /* renamed from: e */
    final C25762k f76233e;

    /* renamed from: f */
    C24229u f76234f = C24229u.f66273o;

    public C28015x(C24201ad adVar, C56244ay ayVar, C25762k kVar) {
        this.f76229a = adVar;
        this.f76230b = ayVar;
        this.f76233e = kVar;
        Bitmap c = adVar.mo29678a().mo29707c();
        this.f76231c = c;
        this.f76232d = new Size(c.getWidth(), c.getHeight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33464a(C24229u uVar) {
        ((C58970a) ((C58970a) C28017z.f76238a.mo56224b()).mo56372aa(49964)).mo56355H("Query.Image[%s] result (complete=%b)", this.f76229a.mo29680c(), uVar.mo29747n());
        this.f76233e.mo30913c(uVar, uVar.mo29747n());
        this.f76234f = uVar;
    }
}
