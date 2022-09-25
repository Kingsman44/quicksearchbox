package androidx.camera.camera2.p063b;

import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: androidx.camera.camera2.b.cj */
/* compiled from: PG */
public final /* synthetic */ class C1141cj implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C1147cp f3357a;

    public /* synthetic */ C1141cj(C1147cp cpVar) {
        this.f3357a = cpVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        String str;
        C1147cp cpVar = this.f3357a;
        synchronized (cpVar.f3361a) {
            C1974i.m5315c(cpVar.f3369i == null, "Release completer expected to be null");
            cpVar.f3369i = cVar;
            str = "Release[session=" + cpVar + "]";
        }
        return str;
    }
}
