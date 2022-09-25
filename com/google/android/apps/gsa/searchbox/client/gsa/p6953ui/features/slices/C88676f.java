package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.lifecycle.LiveData;
import androidx.slice.widget.C4134al;
import androidx.slice.widget.SliceView;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.f */
/* compiled from: PG */
public final /* synthetic */ class C88676f implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C88678h f239755a;

    /* renamed from: b */
    public final /* synthetic */ String f239756b;

    /* renamed from: c */
    public final /* synthetic */ Suggestion f239757c;

    /* renamed from: d */
    public final /* synthetic */ String f239758d;

    public /* synthetic */ C88676f(C88678h hVar, String str, Suggestion suggestion, String str2) {
        this.f239755a = hVar;
        this.f239756b = str;
        this.f239757c = suggestion;
        this.f239758d = str2;
    }

    public final void run() {
        C88678h hVar = this.f239755a;
        String str = this.f239756b;
        Suggestion suggestion = this.f239757c;
        String str2 = this.f239758d;
        C58976aa aaVar = C58975e.f156826a;
        if (C41670aj.m73084q(suggestion)) {
            hVar.f239761c.mo82364g(suggestion);
        }
        Context context = hVar.f239760b;
        C88709j jVar = hVar.f240013s;
        C88701b bVar = hVar.f240007m;
        C88675e eVar = hVar.f239761c;
        SliceView sliceView = new SliceView(context, (AttributeSet) null, 0, R.style.SlurchSliceView);
        C88682l lVar = new C88682l(context, sliceView);
        C88683m mVar = new C88683m(context, jVar, bVar, suggestion, lVar, eVar);
        mVar.f239774a = sliceView;
        sliceView.mo8669d(mVar);
        mVar.mo82371d();
        lVar.f239771c = mVar;
        hVar.f239763e.put(str, lVar);
        C88683m mVar2 = lVar.f239771c;
        mVar2.mo82370c(str2);
        LiveData a = C4134al.m11866a(hVar.f239760b, Uri.parse(C41670aj.m73080m(suggestion)));
        mVar2.f239775b = a;
        a.mo5705f(mVar2);
    }
}
