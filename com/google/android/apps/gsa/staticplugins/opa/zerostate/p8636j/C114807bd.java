package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bd */
/* compiled from: PG */
public final /* synthetic */ class C114807bd implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114809bf f318559a;

    /* renamed from: b */
    public final /* synthetic */ long f318560b;

    /* renamed from: c */
    public final /* synthetic */ List f318561c;

    /* renamed from: d */
    public final /* synthetic */ long f318562d;

    public /* synthetic */ C114807bd(C114809bf bfVar, long j, List list, long j2) {
        this.f318559a = bfVar;
        this.f318560b = j;
        this.f318561c = list;
        this.f318562d = j2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C114809bf bfVar = this.f318559a;
        long j = this.f318560b;
        List list = this.f318561c;
        long j2 = this.f318562d;
        List list2 = (List) obj;
        long longValue = ((Long) list2.get(0)).longValue();
        long longValue2 = ((Long) list2.get(1)).longValue();
        long longValue3 = ((Long) list2.get(2)).longValue();
        if (longValue < j) {
            C114883o oVar = new C114883o();
            oVar.mo101614f(0);
            oVar.mo101612d(bfVar.f318567a.getString(R.string.good_morning));
            oVar.mo101613e(j2);
            list.add(oVar.mo101616h());
            if (longValue2 < j) {
                C114883o oVar2 = new C114883o();
                oVar2.mo101614f(1);
                oVar2.mo101612d(bfVar.f318567a.getString(R.string.whats_the_weather));
                oVar2.mo101613e(j2);
                list.add(oVar2.mo101616h());
            }
            if (longValue3 < j) {
                C114883o oVar3 = new C114883o();
                oVar3.mo101614f(2);
                oVar3.mo101612d(bfVar.f318567a.getString(R.string.play_news));
                oVar3.mo101613e(j2);
                list.add(oVar3.mo101616h());
            }
        }
        return list;
    }
}
