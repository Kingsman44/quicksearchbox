package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import android.car.hardware.CarPropertyValue;
import android.car.hardware.property.CarPropertyManager;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.ad */
/* compiled from: PG */
public final class C117682ad implements CarPropertyManager.CarPropertyEventCallback {

    /* renamed from: b */
    public static final /* synthetic */ int f326636b = 0;

    /* renamed from: a */
    final /* synthetic */ C117687ai f326637a;

    public C117682ad(C117687ai aiVar) {
        this.f326637a = aiVar;
    }

    public final void onChangeEvent(CarPropertyValue carPropertyValue) {
        C60870cx cxVar;
        C60870cx cxVar2;
        if (!this.f326637a.f326647d.mo56113h()) {
            cxVar = C60856cj.m92899h(new IllegalStateException("Test Drive Data Store is null"));
        } else {
            switch (carPropertyValue.getPropertyId()) {
                case 291504647:
                    double floatValue = (double) (((Float) carPropertyValue.getValue()).floatValue() * 3600.0f);
                    Double.isNaN(floatValue);
                    long round = Math.round(floatValue / 1609.344d);
                    C117687ai aiVar = this.f326637a;
                    cxVar = ((C42876ab) aiVar.f326647d.mo56107c()).mo46039a(new C117711y((int) round), aiVar.f326655l);
                    break;
                case 322964416:
                    C117687ai aiVar2 = this.f326637a;
                    int intValue = ((Integer) carPropertyValue.getValue()).intValue();
                    cxVar2 = ((C42876ab) aiVar2.f326647d.mo56107c()).mo46039a(new C117699m(carPropertyValue.getAreaId(), intValue), aiVar2.f326655l);
                    ((Integer) carPropertyValue.getValue()).intValue();
                    carPropertyValue.getAreaId();
                    break;
                case 354419973:
                    C117687ai aiVar3 = this.f326637a;
                    cxVar2 = ((C42876ab) aiVar3.f326647d.mo56107c()).mo46039a(new C117707u(((Boolean) carPropertyValue.getValue()).booleanValue()), aiVar3.f326655l);
                    carPropertyValue.getValue();
                    carPropertyValue.getAreaId();
                    break;
                case 356517120:
                    C117687ai aiVar4 = this.f326637a;
                    int intValue2 = ((Integer) carPropertyValue.getValue()).intValue();
                    cxVar2 = ((C42876ab) aiVar4.f326647d.mo56107c()).mo46039a(new C117710x(carPropertyValue.getAreaId(), intValue2), aiVar4.f326655l);
                    carPropertyValue.getValue();
                    carPropertyValue.getAreaId();
                    break;
                default:
                    cxVar2 = C60866ct.f164955a;
                    ((C59052c) ((C59052c) C117687ai.f326644a.mo56225c()).mo56372aa(18575)).mo56387q("Unrecognized property id %s", carPropertyValue.getPropertyId());
                    break;
            }
            cxVar = cxVar2;
        }
        C90875ai.m148465b(C117680ab.f326634a, cxVar, this.f326637a.f326645b, "Retrieve car info - check for exceptions").mo85223a(C117681ac.f326635a);
    }

    public final void onErrorEvent(int i, int i2) {
        ((C59052c) ((C59052c) C117687ai.f326644a.mo56225c()).mo56372aa(18580)).mo56393w("property id %d in zone %d has error", i, i2);
    }
}
