package com.google.android.apps.search.googleapp.discover.streamui.p10230f;

import com.facebook.litho.C6411u;
import com.facebook.litho.p329g.p331b.C6307i;
import com.facebook.litho.widget.C6465bx;
import com.facebook.litho.widget.C6474cf;
import com.facebook.litho.widget.DiscoverStaggeredGridLayoutInfo;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21252av;
import com.google.android.libraries.elements.interfaces.C21284c;
import com.google.android.libraries.elements.interfaces.C21318y;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.p1708c.p1710b.C20747a;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.f.b */
/* compiled from: PG */
public final class C134746b {
    /* renamed from: a */
    public static C6474cf m218589a(C6411u uVar, C40305b bVar, long j, double d, boolean z, boolean z2, int i, int i2) {
        C6465bx bxVar = new C6465bx();
        bxVar.f19155f = true;
        bxVar.f19156g = -1;
        bxVar.f19150a = (int) j;
        bxVar.f19151b = (float) d;
        bxVar.f19157h = z;
        bxVar.f19160k = true;
        bxVar.f19162m = bVar.mo32556t();
        if (z2) {
            bxVar.f19152c = new DiscoverStaggeredGridLayoutInfo(i, i2, uVar.f19009b.getResources().getDimensionPixelSize(R.dimen.googleapp_discover_two_column_layout_gutter_size_per_column));
        }
        return bxVar.mo13545a(uVar);
    }

    /* renamed from: b */
    public static C21319z m218590b(C40305b bVar, boolean z) {
        C21252av f = bVar.mo32547f();
        C21318y B = C21319z.m40292B();
        C21284c cVar = (C21284c) B;
        cVar.f59604b = f.mo26267c(f.mo26265a());
        C6307i iVar = new C6307i();
        iVar.f18615e = bVar.mo32556t();
        iVar.f18613c = bVar.mo32543a();
        cVar.f59605c = iVar.mo13308a();
        if (z) {
            cVar.f59612j = new C20747a();
        }
        return B.mo26839p();
    }
}
