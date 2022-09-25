package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.graphics.Bitmap;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.util.concurrent.C60856cj;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ar */
/* compiled from: PG */
public final /* synthetic */ class C132599ar implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f361869a;

    /* renamed from: b */
    public final /* synthetic */ C53245gt f361870b;

    public /* synthetic */ C132599ar(List list, C53245gt gtVar) {
        this.f361869a = list;
        this.f361870b = gtVar;
    }

    public final Object call() {
        int i;
        List list = this.f361869a;
        C53245gt gtVar = this.f361870b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        while (true) {
            i = 6;
            if (i2 < 6 && i2 < list.size()) {
                arrayList.add((Bitmap) C60856cj.m92909r((Future) list.get(i2)));
                i2++;
            }
        }
        while (i < 9 && i < list.size()) {
            arrayList2.add((Bitmap) C60856cj.m92909r((Future) list.get(i)));
            i++;
        }
        return new C132655r(gtVar, (Bitmap) C60856cj.m92909r((Future) list.get(0)), arrayList, arrayList2);
    }
}
