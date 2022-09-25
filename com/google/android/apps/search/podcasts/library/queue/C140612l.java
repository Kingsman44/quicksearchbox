package com.google.android.apps.search.podcasts.library.queue;

import android.content.DialogInterface;
import com.google.android.apps.search.podcasts.library.p10580b.C140567b;
import com.google.android.apps.search.podcasts.library.queue.p10583a.C140597b;
import com.google.android.apps.search.podcasts.p10565f.C140294ao;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.apps.search.podcasts.library.queue.l */
/* compiled from: PG */
final class C140612l implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C140607h f381884a;

    public C140612l(C140607h hVar) {
        this.f381884a = hVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        List list;
        List list2;
        C140607h hVar = this.f381884a;
        C140597b bVar = hVar.f381876l;
        if (bVar == null || (list2 = bVar.f381850a.f382708a) == null) {
            list = C69496am.f185918a;
        } else {
            ArrayList<C140567b> arrayList = new ArrayList<>();
            for (Object next : list2) {
                if (next instanceof C140567b) {
                    arrayList.add(next);
                }
            }
            list = new ArrayList(C69540x.m100804k(arrayList, 10));
            for (C140567b bVar2 : arrayList) {
                list.add(bVar2.f381764a);
            }
        }
        C47393f.m84236g(new C140294ao(list), hVar.f381866b);
    }
}
