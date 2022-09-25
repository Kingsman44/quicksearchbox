package com.google.android.apps.gsa.staticplugins.p8163o;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.C2576ac;
import androidx.media3.exoplayer.p145h.C3038au;
import androidx.media3.exoplayer.p145h.C3086bx;
import androidx.media3.exoplayer.p145h.C3128w;
import androidx.media3.p132b.C2504h;
import androidx.media3.p132b.C2520x;
import androidx.media3.p132b.p133a.C2457b;
import androidx.media3.p132b.p133a.C2460e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.w */
/* compiled from: PG */
public final class C105851w implements C105791ab {

    /* renamed from: a */
    public final C89012aj f295343a;

    /* renamed from: b */
    public final C86124t f295344b;

    /* renamed from: c */
    private final C58833ax f295345c;

    public C105851w(C89012aj ajVar, C58833ax axVar, C86124t tVar) {
        this.f295343a = ajVar;
        this.f295345c = axVar;
        this.f295344b = tVar;
    }

    /* renamed from: b */
    private final C3038au m176321b(Uri uri, Bundle bundle) {
        C2504h hVar;
        if ("file".equals(uri.getScheme())) {
            hVar = new C2520x();
        } else {
            hVar = new C105850v(this);
            if (this.f295345c.mo56113h()) {
                C2460e eVar = new C2460e();
                eVar.f6757a = (C2457b) ((C68214a) this.f295345c.mo56107c()).mo27525b();
                eVar.f6758b = hVar;
                hVar = eVar;
            }
        }
        C3086bx bxVar = new C3086bx(hVar, C105849u.f295341a);
        C2576ac acVar = new C2576ac();
        acVar.f7104b = uri;
        acVar.f7107e = bundle;
        return bxVar.mo6760b(acVar.mo6082a());
    }

    /* renamed from: c */
    private final List m176322c(List list, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m176321b(Uri.parse((String) it.next()), bundle));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C3038au mo95058a(String str, Bundle bundle) {
        Uri parse = Uri.parse(str);
        ArrayList arrayList = new ArrayList();
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.google.android.apps.gsa.search.core.work.audioplayer.MediaIntroUrls");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("com.google.android.apps.gsa.search.core.work.audioplayer.IntroAudioChannelList");
        if (!bundle.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.IntroAudioChannelList") || integerArrayList == null) {
            arrayList.addAll(m176322c(stringArrayList, new Bundle()));
        } else {
            stringArrayList.getClass();
            C58838bb.m90869d(integerArrayList.size() == stringArrayList.size(), "The intro audio channels list and intro url list need to be the same length.");
            for (int i = 0; i < stringArrayList.size(); i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("com.google.android.apps.gsa.search.core.work.audioplayer.IntroAudioChannel", integerArrayList.get(i).intValue());
                arrayList.add(m176321b(Uri.parse(stringArrayList.get(i)), bundle2));
            }
        }
        arrayList.add(m176321b(parse, bundle));
        arrayList.addAll(m176322c(bundle.getStringArrayList("com.google.android.apps.gsa.search.core.work.audioplayer.MediaOutroUrls"), new Bundle()));
        return new C3128w((C3038au[]) arrayList.toArray(new C3038au[arrayList.size()]));
    }
}
