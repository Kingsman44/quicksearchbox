package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.google.android.apps.gsa.shared.p7007ay.C89331a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.aq */
/* compiled from: PG */
public final /* synthetic */ class C117202aq implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C117204as f325344a;

    /* renamed from: b */
    public final /* synthetic */ List f325345b;

    public /* synthetic */ C117202aq(C117204as asVar, List list) {
        this.f325344a = asVar;
        this.f325345b = list;
    }

    public final Object call() {
        boolean z;
        C117204as asVar = this.f325344a;
        Iterator it = this.f325345b.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((Boolean) C60856cj.m92909r((C60870cx) it.next())).booleanValue()) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        C89331a aVar = asVar.f325351e;
        synchronized (aVar.f242191a) {
            boolean z2 = aVar.f242194d;
            aVar.f242194d = z;
        }
        return null;
    }
}
