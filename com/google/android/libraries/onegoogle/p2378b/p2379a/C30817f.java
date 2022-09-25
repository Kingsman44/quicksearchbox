package com.google.android.libraries.onegoogle.p2378b.p2379a;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5593j;
import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.p2378b.C30826c;
import com.google.apps.tiktok.account.p3616e.p3623f.C46353a;

/* renamed from: com.google.android.libraries.onegoogle.b.a.f */
/* compiled from: PG */
public final class C30817f implements C30213m {

    /* renamed from: a */
    private final Context f83146a;

    /* renamed from: b */
    private final C30158c f83147b;

    /* renamed from: c */
    private final C46353a f83148c;

    public C30817f(C46353a aVar, Context context, C30158c cVar) {
        this.f83148c = aVar;
        this.f83146a = context;
        this.f83147b = cVar;
    }

    /* renamed from: a */
    public final void mo35680a(Object obj, ImageView imageView) {
        C30821j jVar;
        C46353a aVar = this.f83148c;
        if (obj == null) {
            jVar = null;
        } else {
            jVar = C30821j.m57556c(obj, this.f83147b);
        }
        ((C6007z) aVar.f121349a.mo51286a().mo11872j(jVar).mo11982o(C5593j.m14518b()).mo11954G(C30826c.m57574a(this.f83146a))).mo12454r(imageView);
    }
}
