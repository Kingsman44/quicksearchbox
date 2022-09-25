package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.b */
/* compiled from: PG */
public final /* synthetic */ class C115533b implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115541c f320469a;

    public /* synthetic */ C115533b(C115541c cVar) {
        this.f320469a = cVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        String str;
        C115541c cVar = this.f320469a;
        C52176ia iaVar = (C52176ia) obj;
        if (iaVar.f136914b.size() > 0) {
            C52567wn wnVar = C52567wn.UNKNOWN;
            C52568wo woVar = ((C52174hz) iaVar.f136914b.get(0)).f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            C52567wn b = C52567wn.m86649b(woVar.f138003j);
            if (b == null) {
                b = C52567wn.UNKNOWN;
            }
            if (b.ordinal() == 21) {
                str = cVar.f320483a.getResources().getString(R.string.omp_media_type_news);
                cVar.f320485c.mo2423x(str);
            }
        }
        str = BuildConfig.FLAVOR;
        cVar.f320485c.mo2423x(str);
    }
}
