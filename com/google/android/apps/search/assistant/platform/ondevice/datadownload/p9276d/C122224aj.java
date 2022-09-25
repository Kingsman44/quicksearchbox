package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70883v;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.aj */
/* compiled from: PG */
public final /* synthetic */ class C122224aj implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f338956a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f338957b;

    /* renamed from: c */
    public final /* synthetic */ C70883v f338958c;

    public /* synthetic */ C122224aj(C58485gu guVar, C58485gu guVar2, C70883v vVar) {
        this.f338956a = guVar;
        this.f338957b = guVar2;
        this.f338958c = vVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58485gu guVar = this.f338956a;
        C58485gu guVar2 = this.f338957b;
        C70883v vVar = this.f338958c;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C60870cx) guVar.get(i)).cancel(true);
        }
        int size2 = guVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C122260bs bsVar = (C122260bs) guVar2.get(i2);
            if (bsVar.f339015f.equals(C17072q.DOWNLOADING)) {
                bsVar.f339015f = C17072q.FINISHED_CANCELLED;
            }
        }
        vVar.mo20123c(C122261bt.m201775d(guVar2));
        return null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
