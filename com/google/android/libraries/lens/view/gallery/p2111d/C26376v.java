package com.google.android.libraries.lens.view.gallery.p2111d;

import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.lens.view.common.RoundedImageView;
import com.google.android.libraries.lens.view.gallery.data.C26404w;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59938ct;
import com.google.common.p4552o.p4563i.C59939cu;
import com.google.common.p4552o.p4563i.C59972v;
import com.google.common.p4552o.p4563i.C59973w;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.v */
/* compiled from: PG */
public final /* synthetic */ class C26376v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C26378x f71746a;

    /* renamed from: b */
    public final /* synthetic */ int f71747b;

    /* renamed from: c */
    public final /* synthetic */ C21370a f71748c;

    /* renamed from: d */
    public final /* synthetic */ C26404w f71749d;

    /* renamed from: e */
    public final /* synthetic */ C28443m f71750e;

    /* renamed from: f */
    public final /* synthetic */ int f71751f;

    public /* synthetic */ C26376v(C26378x xVar, int i, int i2, C21370a aVar, C26404w wVar, C28443m mVar) {
        this.f71746a = xVar;
        this.f71747b = i;
        this.f71751f = i2;
        this.f71748c = aVar;
        this.f71749d = wVar;
        this.f71750e = mVar;
    }

    public final void onClick(View view) {
        C26378x xVar = this.f71746a;
        int i = this.f71747b;
        int i2 = this.f71751f;
        C21370a aVar = this.f71748c;
        C26404w wVar = this.f71749d;
        C28443m mVar = this.f71750e;
        C59938ct ctVar = (C59938ct) C59939cu.f161993f.createBuilder();
        ctVar.copyOnWrite();
        C59939cu cuVar = (C59939cu) ctVar.instance;
        cuVar.f161995a |= 4;
        cuVar.f161997c = (long) i;
        ctVar.copyOnWrite();
        C59939cu cuVar2 = (C59939cu) ctVar.instance;
        cuVar2.f161996b = i2 - 1;
        cuVar2.f161995a |= 1;
        int i3 = xVar.f71756d;
        ctVar.copyOnWrite();
        C59939cu cuVar3 = (C59939cu) ctVar.instance;
        int i4 = i3 - 1;
        if (i3 != 0) {
            cuVar3.f161999e = i4;
            cuVar3.f161995a |= 128;
            long minutes = TimeUnit.SECONDS.toMinutes(TimeUnit.MILLISECONDS.toSeconds(aVar.mo26870b()) - wVar.mo31585a());
            ctVar.copyOnWrite();
            C59939cu cuVar4 = (C59939cu) ctVar.instance;
            cuVar4.f161995a |= 64;
            cuVar4.f161998d = minutes;
            C28440j h = C28442l.m53142h();
            C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
            C59972v vVar = (C59972v) C59973w.f162085d.createBuilder();
            C59939cu cuVar5 = (C59939cu) ctVar.build();
            vVar.copyOnWrite();
            C59973w wVar2 = (C59973w) vVar.instance;
            cuVar5.getClass();
            wVar2.f162088b = cuVar5;
            wVar2.f162087a |= 1;
            bhVar.copyOnWrite();
            C59900bi biVar = (C59900bi) bhVar.instance;
            C59973w wVar3 = (C59973w) vVar.build();
            wVar3.getClass();
            biVar.f161896d = wVar3;
            biVar.f161893a |= 256;
            h.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
            mVar.mo33853c(h.mo33894a(), C28485y.m53234a((RecyclerView) xVar.itemView.getParent()));
            RoundedImageView roundedImageView = xVar.f71755c;
            roundedImageView.getClass();
            C47393f.m84237h(new C26369o(wVar, roundedImageView), view);
            return;
        }
        throw null;
    }
}
