package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.lens.p4694a.C62033al;
import com.google.lens.p4694a.C62059bk;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.be */
/* compiled from: PG */
final class C27156be implements C5592i {

    /* renamed from: a */
    final /* synthetic */ C62059bk f74221a;

    public C27156be(C62059bk bkVar) {
        this.f74221a = bkVar;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        C58970a aVar = (C58970a) ((C58970a) ((C58970a) C27158bg.f74224a.mo56226d()).mo56382g(apVar)).mo56372aa(49586);
        C62033al alVar = this.f74221a.f167649a;
        if (alVar == null) {
            alVar = C62033al.f167607b;
        }
        aVar.mo56389s("Failed to load image for icon URL: %s", alVar.f167609a);
        return false;
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        return false;
    }
}
