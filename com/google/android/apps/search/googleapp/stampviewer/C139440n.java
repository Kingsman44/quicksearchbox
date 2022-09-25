package com.google.android.apps.search.googleapp.stampviewer;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139326h;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139357m;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4552o.p4566l.C60200dk;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.n */
/* compiled from: PG */
final class C139440n implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139439m f379169a;

    public C139440n(C139439m mVar) {
        this.f379169a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139357m mVar = (C139357m) bVar;
        C139439m mVar2 = this.f379169a;
        View view = mVar2.f379149c.getView();
        view.getClass();
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.googleapp_stamp_viewer_view_pager);
        int a = viewPager.mo9122a();
        if (mVar.mo114924b()) {
            C139326h hVar = mVar2.f379148b.f378933g;
            if (hVar == null) {
                hVar = C139326h.f378938c;
            }
            if (hVar.f378941b && mVar2.f379155i > 0) {
                if (a >= mVar2.f379150d.mo114890a() - 1) {
                    mVar2.f379153g.mo114943c(false);
                } else if (a >= mVar2.f379163q - 1) {
                    mVar2.f379153g.mo114943c(true);
                    mVar2.f379163q = mVar2.f379150d.mo114890a();
                }
            }
        }
        if (mVar.mo114924b() && a < mVar2.f379150d.mo114890a() - 1) {
            mVar2.mo114965b(a + 1, viewPager, C60200dk.RIGHT, mVar.mo114923a());
        } else if (!mVar.mo114924b() && a > 0) {
            mVar2.mo114965b(a - 1, viewPager, C60200dk.LEFT, mVar.mo114923a());
        }
        return C47392e.f123115a;
    }
}
