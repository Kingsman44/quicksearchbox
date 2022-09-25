package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.p2166a;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Size;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.gleam.C26566em;
import com.google.android.libraries.lens.view.p2069am.C25345u;
import com.google.android.libraries.lens.view.p2069am.C25346v;
import com.google.android.libraries.lens.view.p2074ap.C25464d;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27830m;
import com.google.apps.tiktok.inject.C47274n;
import com.google.common.base.C58833ax;
import com.google.lens.p4709l.p4710a.C62614b;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.a.b */
/* compiled from: PG */
public final class C27800b implements C27806h {

    /* renamed from: a */
    public final int f75854a;

    /* renamed from: b */
    public final boolean f75855b;

    /* renamed from: c */
    public final int f75856c;

    /* renamed from: d */
    private final C26566em f75857d;

    /* renamed from: e */
    private final C47274n f75858e;

    /* renamed from: f */
    private final C25466f f75859f;

    public C27800b(C26566em emVar, C47274n nVar, C25466f fVar, boolean z, long j, long j2) {
        this.f75857d = emVar;
        this.f75858e = nVar;
        this.f75855b = z;
        this.f75854a = (int) j;
        this.f75859f = fVar;
        this.f75856c = (int) j2;
    }

    /* renamed from: a */
    public final C58833ax mo33316a(C27830m mVar, C58833ax axVar, C58833ax axVar2) {
        Resources resources = this.f75858e.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.text_highlight_horizontal_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.text_highlight_vertical_margin);
        C58833ax a = this.f75857d.mo31828a();
        if (!a.mo56113h()) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            a = C58833ax.m90834k(new Size(displayMetrics.widthPixels, displayMetrics.heightPixels + ((C25464d) this.f75859f.f69401a.mo3842a()).mo30499a()));
        }
        C25345u uVar = (C25345u) C25346v.f68994b.createBuilder();
        uVar.mo30374a(mVar.mo33322b());
        return mVar.mo33321a(C62614b.LOTS_FEATURE_HYBRID_GANSLATE).mo56106b(new C27799a(this, axVar, (C25346v) uVar.build(), (Size) a.mo56107c(), dimensionPixelSize, dimensionPixelSize2, axVar2));
    }

    /* renamed from: b */
    public final boolean mo33317b(C27830m mVar, C58833ax axVar, C58833ax axVar2) {
        return !axVar.mo56113h() || mVar.mo33323c((String) axVar.mo56107c());
    }
}
