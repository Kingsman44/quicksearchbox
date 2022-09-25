package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.util.SizeF;
import android.widget.RemoteViews;
import androidx.p060c.C0977g;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.ag */
/* compiled from: PG */
public final /* synthetic */ class C117192ag implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Map f325320a;

    public /* synthetic */ C117192ag(Map map) {
        this.f325320a = map;
    }

    public final Object call() {
        Map map = this.f325320a;
        C0977g gVar = new C0977g();
        for (SizeF sizeF : map.keySet()) {
            gVar.put(sizeF, (RemoteViews) C60856cj.m92909r((Future) map.get(sizeF)));
        }
        return new RemoteViews(gVar);
    }
}
