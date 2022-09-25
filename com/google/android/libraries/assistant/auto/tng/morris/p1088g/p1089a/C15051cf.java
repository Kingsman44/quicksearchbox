package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.cf */
/* compiled from: PG */
final class C15051cf implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C15056ck f45135a;

    public C15051cf(C15056ck ckVar) {
        this.f45135a = ckVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof BitmapDrawable) {
            C15049cd cdVar = new C15049cd(this, ((BitmapDrawable) drawable).getBitmap());
            C60887da daVar = this.f45135a.f45176x;
            daVar.getClass();
            return C60856cj.m92904m(C47810es.m84978r(cdVar), daVar);
        }
        C59104x d = C15056ck.f45140a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.MediaFullRend");
        ((C59052c) ((C59052c) d).mo56372aa(45955)).mo56386p("Album art drawable is not a BitmapDrawable. Check ImageLoader.");
        C15050ce ceVar = new C15050ce(this);
        C60887da daVar2 = this.f45135a.f45176x;
        daVar2.getClass();
        return C60856cj.m92904m(C47810es.m84978r(ceVar), daVar2);
    }
}
