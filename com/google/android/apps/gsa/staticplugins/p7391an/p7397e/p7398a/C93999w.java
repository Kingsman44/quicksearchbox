package com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.a.w */
/* compiled from: PG */
final class C93999w implements C22868d {

    /* renamed from: a */
    final /* synthetic */ DoodleData f262522a;

    /* renamed from: b */
    final /* synthetic */ C94001y f262523b;

    public C93999w(C94001y yVar, DoodleData doodleData) {
        this.f262523b = yVar;
        this.f262522a = doodleData;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C94001y.f262525a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SprDoodleHeaderRndr");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(19405)).mo56386p("Doodle image not loaded");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Drawable drawable = (Drawable) obj;
        C94001y yVar = this.f262523b;
        if (!yVar.f262532h) {
            DoodleData doodleData = this.f262522a;
            if (!(drawable instanceof BitmapDrawable)) {
                yVar.mo88271h();
            } else {
                yVar.f262529e.mo28212l("Set doodle drawable", new C93988l(yVar, drawable, doodleData));
            }
        }
    }
}
