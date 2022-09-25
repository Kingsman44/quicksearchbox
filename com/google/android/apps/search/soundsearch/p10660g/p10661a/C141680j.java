package com.google.android.apps.search.soundsearch.p10660g.p10661a;

import com.google.android.apps.search.soundsearch.p10660g.C141670a;
import com.google.android.apps.search.soundsearch.p10660g.C141685b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.soundsearch.g.a.j */
/* compiled from: PG */
public final class C141680j {

    /* renamed from: a */
    public static final C59071e f384536a = C59071e.m91332i("com.google.android.apps.search.soundsearch.g.a.j");

    /* renamed from: b */
    public final C46723bg f384537b;

    /* renamed from: c */
    public final Executor f384538c;

    /* renamed from: d */
    public final C141685b f384539d;

    /* renamed from: e */
    public final C21370a f384540e;

    /* renamed from: f */
    public C141670a f384541f;

    /* renamed from: g */
    public C141684n f384542g = C141684n.f384546f;

    /* renamed from: h */
    public long f384543h;

    /* renamed from: i */
    private final C46778cv f384544i;

    public C141680j(C46723bg bgVar, C46778cv cvVar, C60887da daVar, C141685b bVar, C21370a aVar) {
        this.f384537b = bgVar;
        this.f384544i = cvVar;
        this.f384538c = new C60904dr(daVar);
        this.f384539d = bVar;
        this.f384540e = aVar;
    }

    /* renamed from: a */
    public final void mo116650a(C141684n nVar) {
        long c = this.f384540e.mo26871c();
        long j = this.f384543h;
        C141681k kVar = (C141681k) nVar.toBuilder();
        kVar.copyOnWrite();
        C141684n nVar2 = (C141684n) kVar.instance;
        nVar2.f384548a |= 4;
        nVar2.f384551d = (int) (c - j);
        this.f384542g = (C141684n) kVar.build();
        this.f384544i.mo50787a(C60866ct.f164955a, "RecognitionResult");
    }
}
