package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80017n;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80018o;
import com.google.assistant.p3781ad.p3789d.C48582b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.g */
/* compiled from: PG */
public final /* synthetic */ class C112552g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80017n f312142a;

    public /* synthetic */ C112552g(C80017n nVar) {
        this.f312142a = nVar;
    }

    public final void accept(Object obj) {
        C80017n nVar = this.f312142a;
        C48582b bVar = (C48582b) obj;
        nVar.copyOnWrite();
        C80018o oVar = (C80018o) nVar.instance;
        C80018o oVar2 = C80018o.f219583i;
        oVar.f219587c = bVar.f125574q;
        int i = 2;
        oVar.f219585a |= 2;
        switch (bVar.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
            case 6:
            case 7:
                i = 4;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                i = 3;
                break;
            case 12:
                i = 5;
                break;
            default:
                i = 1;
                break;
        }
        nVar.copyOnWrite();
        C80018o oVar3 = (C80018o) nVar.instance;
        oVar3.f219588d = i - 1;
        oVar3.f219585a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
