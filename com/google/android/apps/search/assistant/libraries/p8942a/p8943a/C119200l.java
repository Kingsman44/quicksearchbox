package com.google.android.apps.search.assistant.libraries.p8942a.p8943a;

import com.google.android.apps.search.assistant.libraries.p8942a.C119207d;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.libraries.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C119200l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f332421a;

    /* renamed from: b */
    public final /* synthetic */ C119207d f332422b;

    /* renamed from: c */
    public final /* synthetic */ int f332423c;

    /* renamed from: d */
    public final /* synthetic */ Callable f332424d;

    public /* synthetic */ C119200l(String str, C119207d dVar, int i, Callable callable) {
        this.f332421a = str;
        this.f332422b = dVar;
        this.f332423c = i;
        this.f332424d = callable;
    }

    public final Object call() {
        String str = this.f332421a;
        C119207d dVar = this.f332422b;
        int i = this.f332423c;
        Callable callable = this.f332424d;
        ((C59052c) ((C59052c) C119202n.f332431a.mo56224b()).mo56372aa(34338)).mo56359L("%s completed with retriable status %s; retry attempt %d", str, dVar.name(), Integer.valueOf(i + 1));
        return (C60870cx) callable.call();
    }
}
