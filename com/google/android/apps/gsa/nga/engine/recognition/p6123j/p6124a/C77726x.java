package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.p1730f.C21370a;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.x */
/* compiled from: PG */
final class C77726x {

    /* renamed from: a */
    public final C77732a f214120a;

    /* renamed from: b */
    public final C21370a f214121b;

    /* renamed from: c */
    public final C91142g f214122c;

    public C77726x(C77732a aVar, C21370a aVar2, C91142g gVar) {
        this.f214120a = aVar;
        this.f214121b = aVar2;
        this.f214122c = gVar;
    }

    /* renamed from: a */
    public final Duration mo72787a(C77566as asVar, Duration duration) {
        return (!this.f214122c.mo85405j(C90014bt.f247754nC) || !asVar.mo72682e().isPresent() || ((HotwordResult) asVar.mo72682e().get()).mo84693k() <= 0) ? duration : Duration.ofMillis(((HotwordResult) asVar.mo72682e().get()).mo84693k());
    }
}
