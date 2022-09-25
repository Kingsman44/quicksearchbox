package com.google.android.libraries.lens.view.main;

import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2081au.C25560j;
import com.google.android.libraries.lens.view.p2148l.C27227g;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.android.libraries.lens.view.p2153o.C27459a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.io.FileNotFoundException;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.lens.view.main.aa */
/* compiled from: PG */
final class C27284aa implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C27228h f74654a;

    /* renamed from: b */
    final /* synthetic */ C27288ae f74655b;

    public C27284aa(C27288ae aeVar, C27228h hVar) {
        this.f74655b = aeVar;
        this.f74654a = hVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            ((C58970a) ((C58970a) ((C58970a) C27288ae.f74662a.mo56224b()).mo56382g(th)).mo56372aa(49687)).mo56386p("Image loading has been cancelled.");
        } else if (th instanceof FileNotFoundException) {
            ((C58970a) ((C58970a) ((C58970a) C27288ae.f74662a.mo56225c()).mo56382g(th)).mo56372aa(49686)).mo56386p("Image could not be loaded, FileNotFound!");
            C27286ac acVar = this.f74655b.f74679l;
            acVar.getClass();
            C27322bl blVar = ((C27326bp) acVar).f74752a.f74787ag;
            blVar.getClass();
            C27384dt dtVar = (C27384dt) blVar;
            Toast.makeText(dtVar.f75000t, R.string.lens_failed_to_open_image, 0).show();
            dtVar.mo32917C();
        } else {
            C27228h hVar = this.f74654a;
            C27288ae aeVar = this.f74655b;
            C58833ax j = hVar.mo32727j(aeVar.f74671d, (String) aeVar.f74672e.mo56111f());
            C58838bb.m90884s(j.mo56113h(), "Injected image data is invalid");
            throw new IllegalStateException(String.format("Failed to load image, caller: %s, imageFormat: %s", new Object[]{this.f74655b.f74671d.mo32701h(), ((C27227g) j.mo56107c()).name()}), th);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C25560j jVar = (C25560j) obj;
        C27459a aVar = this.f74655b.f74677j;
        if (aVar != null) {
            jVar.mo30614a().mo29705a();
            aVar.mo33000d();
        }
    }
}
