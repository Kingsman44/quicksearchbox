package com.google.frameworks.client.data.android.p4645l;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58827ar;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58526ih;
import com.google.frameworks.client.data.android.C61378at;
import com.google.frameworks.client.data.android.C61381b;
import com.google.frameworks.client.data.android.C61425g;
import com.google.frameworks.client.data.android.C61466h;
import com.google.frameworks.client.data.android.C61527l;
import com.google.frameworks.client.data.android.C61529m;
import com.google.frameworks.client.data.android.p4632a.C61343d;
import com.google.frameworks.client.data.android.p4639f.C61416c;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.frameworks.client.data.android.l.a */
/* compiled from: PG */
public final class C61528a {

    /* renamed from: a */
    private static final C58827ar f166326a = C58827ar.m90818c(' ');

    /* renamed from: a */
    public static C61527l m94259a() {
        throw new RuntimeException();
    }

    /* renamed from: b */
    public static C61529m m94260b() {
        throw new RuntimeException();
    }

    /* renamed from: c */
    public static Set m94261c(Set set) {
        C58526ih ihVar = new C58526ih();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ihVar.mo55373c(new C61416c((String) it.next()));
        }
        return ihVar.mo55486f();
    }

    /* renamed from: d */
    public static C61466h m94262d(Context context, C21370a aVar, ScheduledExecutorService scheduledExecutorService, Executor executor, Executor executor2, C61378at atVar, C58833ax axVar, Set set) {
        String str;
        C61425g s = C61466h.m94139s();
        s.mo57953c(context);
        s.mo57952b(aVar);
        s.mo57956f(executor);
        C61381b bVar = (C61381b) s;
        bVar.f165957b = scheduledExecutorService;
        s.mo57954d(executor);
        s.mo57955e(executor2);
        bVar.f165956a = atVar;
        bVar.f165958c = (C61343d) ((C58847bk) axVar).f156646a;
        if (set.isEmpty()) {
            str = null;
        } else {
            str = f166326a.mo56097d(new TreeSet(set));
        }
        bVar.f165959d = str;
        return s.mo58043g();
    }
}
