package com.google.apps.tiktok.p3648i.p3653d;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.apps.tiktok.i.d.a */
/* compiled from: PG */
public final /* synthetic */ class C47177a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f122835a;

    public /* synthetic */ C47177a(List list) {
        this.f122835a = list;
    }

    public final Object call() {
        for (C60870cx r : this.f122835a) {
            try {
                C60856cj.m92909r(r);
            } catch (ExecutionException e) {
                ((C59052c) ((C59052c) ((C59052c) C47179c.f122837a.mo56225c()).mo56382g(e.getCause())).mo56372aa(54760)).mo56386p("Wipeout task failed.");
            }
        }
        return null;
    }
}
