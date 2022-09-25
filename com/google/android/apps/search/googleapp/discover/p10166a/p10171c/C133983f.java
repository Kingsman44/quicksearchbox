package com.google.android.apps.search.googleapp.discover.p10166a.p10171c;

import android.view.View;
import com.google.android.apps.search.googleapp.discover.p10166a.p10171c.p10172a.C133976a;
import com.google.android.apps.search.googleapp.discover.p10166a.p10171c.p10172a.C133978c;
import java.util.Arrays;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.c.f */
/* compiled from: PG */
final class C133983f implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C133984g f364947a;

    /* renamed from: b */
    final /* synthetic */ int f364948b;

    /* renamed from: c */
    final /* synthetic */ View f364949c;

    /* renamed from: d */
    final /* synthetic */ boolean f364950d;

    public C133983f(C133984g gVar, int i, View view, boolean z) {
        this.f364947a = gVar;
        this.f364948b = i;
        this.f364949c = view;
        this.f364950d = z;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Duration duration;
        C133978c cVar = (C133978c) obj;
        C69664n.m101061g(cVar, "debugView");
        C133975a aVar = (C133975a) this.f364947a.f364956e.get(Integer.valueOf(this.f364948b));
        if (aVar == null || (duration = aVar.f364922a) == null) {
            duration = Duration.ZERO;
        }
        Duration duration2 = duration;
        boolean z = aVar != null && this.f364947a.f364953b.mo111509a(aVar.f364922a);
        View view = this.f364949c;
        int i = this.f364948b;
        boolean z2 = this.f364950d;
        C69664n.m101060f(duration2, "viewDuration");
        C69664n.m101061g(view, "view");
        C69664n.m101061g(duration2, "viewDuration");
        List list = cVar.f364930a;
        String format = String.format("%x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        C69664n.m101060f(format, "format(this, *args)");
        list.add(new C133976a(view, format, z2, duration2, z));
        cVar.invalidate();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
