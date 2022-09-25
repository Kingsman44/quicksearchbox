package com.google.android.libraries.web.contrib.contextmenu.p3362a;

import android.net.Uri;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p291h.C5622i;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.n */
/* compiled from: PG */
public final /* synthetic */ class C43427n implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C43431r f113452a;

    /* renamed from: b */
    public final /* synthetic */ String f113453b;

    public /* synthetic */ C43427n(C43431r rVar, String str) {
        this.f113452a = rVar;
        this.f113453b = str;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C43431r rVar = this.f113452a;
        String str = this.f113453b;
        C6007z g = rVar.f113461b.mo51286a().mo11863a(byte[].class).mo12445g(Uri.parse(str));
        g.mo12455s(new C43429p(rVar, cVar, str), (C5592i) null, g, C5622i.f16959a);
        return "Callback to LensStarter#ImageManager#loadUriToBitmap";
    }
}
