package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9405a.C124729a;
import com.google.android.p10712d.C142324bc;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import java.util.Locale;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.r */
/* compiled from: PG */
public final class C124921r implements C46792di {

    /* renamed from: a */
    private final C124729a f344666a;

    /* renamed from: b */
    private final C46801dp f344667b;

    /* renamed from: c */
    private Consumer f344668c;

    public C124921r(C124729a aVar, C46801dp dpVar) {
        this.f344666a = aVar;
        this.f344667b = dpVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        Consumer consumer = this.f344668c;
        consumer.getClass();
        consumer.accept((C142324bc) obj);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }

    /* renamed from: d */
    public final void mo106718d(String str, Consumer consumer) {
        this.f344667b.mo50707a(this.f344666a.mo106595a(str, C124525f.m203991g(Locale.getDefault())), this);
        this.f344668c = consumer;
    }
}
