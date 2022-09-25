package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.populous.Autocompletion;
import com.google.android.libraries.social.populous.C42384e;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60845bz;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.populous.l */
/* compiled from: PG */
final class C42118l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ PopulousDataLayer f110162a;

    public C42118l(PopulousDataLayer populousDataLayer) {
        this.f110162a = populousDataLayer;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f110162a.mo44687b(new ArrayList(), 0);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C42384e eVar = (C42384e) obj;
        PopulousDataLayer populousDataLayer = this.f110162a;
        C58485gu guVar = eVar.f111154b;
        int i = eVar.f111153a;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < ((C58724pq) guVar).f156474d; i3++) {
            Person b = ((Autocompletion) guVar.get(i3)).mo44773b();
            C42114h hVar = new C42114h();
            ArrayList arrayList2 = new ArrayList();
            C58485gu guVar2 = b.f110371g;
            int i4 = ((C58724pq) guVar2).f156474d;
            for (int i5 = 0; i5 < i4; i5++) {
                C42111e b2 = C42112f.m73903b(b, (ContactMethodField) guVar2.get(i5), populousDataLayer.f110111b);
                b2.f110129a = 4;
                String str = BuildConfig.FLAVOR;
                if (i3 < i) {
                    b2.f110141m = str;
                    b2.f110142n = true;
                } else {
                    if (b.mo44833d().length != 0) {
                        str = b.mo44833d()[0].f110779c.toString();
                    }
                    b2.f110141m = str;
                    b2.f110142n = false;
                }
                arrayList2.add(b2.mo44727a());
            }
            hVar.f110155a = arrayList2;
            PopulousCoalescedChannels a = hVar.mo44731a();
            if (((Channel) a.f110098a.get(0)).mo44611C()) {
                i2++;
            }
            arrayList.add(a);
        }
        populousDataLayer.mo44687b(arrayList, i2);
    }
}
