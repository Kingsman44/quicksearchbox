package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bl */
/* compiled from: PG */
public final /* synthetic */ class C138437bl implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C138445bt f376561a;

    /* renamed from: b */
    public final /* synthetic */ List f376562b;

    public /* synthetic */ C138437bl(C138445bt btVar, List list) {
        this.f376561a = btVar;
        this.f376562b = list;
    }

    public final Object call() {
        C138445bt btVar = this.f376561a;
        List list = this.f376562b;
        int i = 0;
        while (i < btVar.f376593p.size()) {
            Optional.empty();
            try {
                Optional optional = (Optional) C60856cj.m92909r((Future) list.get(i));
                if (optional.isPresent()) {
                    btVar.f376593p.get(i);
                    return optional;
                }
                i++;
            } catch (ExecutionException e) {
                ((C58970a) ((C58970a) ((C58970a) C138445bt.f376578a.mo56226d()).mo56382g(e)).mo56372aa(41224)).mo56389s("Got an Exception while trying to get a response from %s", btVar.f376593p.get(i));
                return Optional.empty();
            }
        }
        return Optional.empty();
    }
}
