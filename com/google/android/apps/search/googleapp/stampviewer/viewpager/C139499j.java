package com.google.android.apps.search.googleapp.stampviewer.viewpager;

import android.view.View;
import androidx.viewpager.widget.C4277j;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60200dk;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.viewpager.j */
/* compiled from: PG */
public final class C139499j implements C4277j {

    /* renamed from: a */
    private static final C59071e f379298a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.viewpager.j");

    /* renamed from: b */
    private final C28443m f379299b;

    /* renamed from: c */
    private final C139491b f379300c;

    /* renamed from: d */
    private int f379301d;

    /* renamed from: e */
    private int f379302e = 0;

    /* renamed from: f */
    private boolean f379303f = false;

    public C139499j(C28443m mVar, int i, C139491b bVar) {
        this.f379299b = mVar;
        this.f379301d = i;
        this.f379300c = bVar;
    }

    /* renamed from: a */
    public final void mo9182a(int i) {
        if (i == 2 && this.f379302e == 1) {
            this.f379303f = true;
        }
        if (i == 2 && this.f379302e == 0) {
            this.f379303f = false;
        }
        this.f379302e = i;
    }

    /* renamed from: c */
    public final void mo9183c(int i, float f, int i2) {
    }

    /* renamed from: e */
    public final void mo9184e(int i) {
        if (this.f379301d != i) {
            if (this.f379303f) {
                Optional map = this.f379300c.mo115008o(i).map(C139498i.f379297a);
                if (map.isPresent()) {
                    C60200dk dkVar = i > this.f379301d ? C60200dk.RIGHT : C60200dk.LEFT;
                    C28443m mVar = this.f379299b;
                    C28440j g = C28442l.m53141g();
                    g.mo33895b(C28442l.m53143i(dkVar));
                    g.mo33895b(C28375ak.m53063e(1));
                    mVar.mo33853c(g.mo33894a(), C28485y.m53234a((View) map.get()));
                } else {
                    ((C59052c) ((C59052c) f379298a.mo56226d()).mo56372aa(41379)).mo56386p("Can't log stamp swipe event because view is not yet available");
                }
            }
            this.f379301d = i;
        }
    }
}
