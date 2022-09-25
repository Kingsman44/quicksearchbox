package com.google.android.apps.gsa.shared.p7195y;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.y.ai */
/* compiled from: PG */
final class C91177ai implements C5592i {

    /* renamed from: a */
    final /* synthetic */ C91194az f254549a;

    public C91177ai(C91194az azVar) {
        this.f254549a = azVar;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        if (apVar == null) {
            C59104x c = C91188at.f254565b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GlideImageLoader");
            ((C59052c) ((C59052c) c).mo56372aa(10630)).mo56386p("Image did not load without exception.");
            return false;
        }
        C59104x c2 = C91188at.f254565b.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "GlideImageLoader");
        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(apVar)).mo56372aa(10629)).mo56386p("Image did not load.");
        return false;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        this.f254549a.mo85446a();
        return false;
    }
}
