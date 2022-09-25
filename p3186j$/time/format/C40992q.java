package p3186j$.time.format;

import p3186j$.time.chrono.C40961d;
import p3186j$.util.function.Consumer;

/* renamed from: j$.time.format.q */
public final /* synthetic */ class C40992q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C40993r f107366a;

    /* renamed from: b */
    public final /* synthetic */ C40999x f107367b;

    /* renamed from: c */
    public final /* synthetic */ long f107368c;

    /* renamed from: d */
    public final /* synthetic */ int f107369d;

    /* renamed from: e */
    public final /* synthetic */ int f107370e;

    public /* synthetic */ C40992q(C40993r rVar, C40999x xVar, long j, int i, int i2) {
        this.f107366a = rVar;
        this.f107367b = xVar;
        this.f107368c = j;
        this.f107369d = i;
        this.f107370e = i2;
    }

    public final void accept(Object obj) {
        C40961d dVar = (C40961d) obj;
        this.f107366a.mo43307f(this.f107367b, this.f107368c, this.f107369d, this.f107370e);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
