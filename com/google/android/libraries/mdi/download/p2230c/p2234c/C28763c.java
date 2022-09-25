package com.google.android.libraries.mdi.download.p2230c.p2234c;

import android.util.Pair;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.mdi.download.p2230c.C28779n;
import com.google.android.libraries.mdi.download.p2230c.C28781p;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.p10983ae.p10984a.C147464i;
import com.google.android.libraries.p10983ae.p10984a.C147465j;
import com.google.android.libraries.storage.p3304a.p3309d.p3310a.C42770a;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import java.io.File;

/* renamed from: com.google.android.libraries.mdi.download.c.c.c */
/* compiled from: PG */
public final /* synthetic */ class C28763c implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C28766f f78188a;

    /* renamed from: b */
    public final /* synthetic */ C28781p f78189b;

    /* renamed from: c */
    public final /* synthetic */ File f78190c;

    /* renamed from: d */
    public final /* synthetic */ String f78191d;

    /* renamed from: e */
    public final /* synthetic */ C42770a f78192e;

    public /* synthetic */ C28763c(C28766f fVar, C28781p pVar, File file, String str, C42770a aVar) {
        this.f78188a = fVar;
        this.f78189b = pVar;
        this.f78190c = file;
        this.f78191d = str;
        this.f78192e = aVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C28766f fVar = this.f78188a;
        C28781p pVar = this.f78189b;
        File file = this.f78190c;
        String str = this.f78191d;
        File file2 = file;
        String str2 = str;
        C147465j jVar = new C147465j(fVar.f78197a, pVar.mo34402f(), file2, str2, new C28759a(cVar), this.f78192e);
        jVar.f398068i = null;
        if (C28779n.f78236c == pVar.mo34398c()) {
            jVar.mo124207f(C147464i.WIFI_OR_CELLULAR);
        } else {
            jVar.mo124207f(C147464i.WIFI_ONLY);
        }
        if (pVar.mo34396a() > 0) {
            jVar.f398069j = pVar.mo34396a();
        }
        C58485gu e = pVar.mo34400e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) e.get(i);
            jVar.f398064e.mo54920x((String) pair.first, (String) pair.second);
        }
        cVar.mo5436a(new C28762b(fVar, file, str), C60826bg.f164896a);
        boolean k = jVar.f398063d.mo124222k(jVar);
        C29045l.m53932d("%s: Data download scheduled for file: %s enqueued: %s", "OffroadFileDownloader", pVar.mo34402f(), Boolean.valueOf(k));
        if (!k) {
            cVar.mo5439d(new IllegalStateException("Duplicate request for: ".concat(String.valueOf(pVar.mo34402f()))));
        }
        return "Data download scheduled for file ".concat(String.valueOf(pVar.mo34402f()));
    }
}
