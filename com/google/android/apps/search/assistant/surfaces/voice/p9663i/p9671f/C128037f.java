package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f;

import android.hardware.Sensor;
import androidx.p104d.p105a.C2169h;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.f.f */
/* compiled from: PG */
public final /* synthetic */ class C128037f implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C128043l f352325a;

    /* renamed from: b */
    public final /* synthetic */ Map f352326b;

    /* renamed from: c */
    public final /* synthetic */ C128042k f352327c;

    public /* synthetic */ C128037f(C128043l lVar, Map map, C128042k kVar) {
        this.f352325a = lVar;
        this.f352326b = map;
        this.f352327c = kVar;
    }

    public final void accept(Object obj, Object obj2) {
        C60870cx cxVar;
        C128043l lVar = this.f352325a;
        Map map = this.f352326b;
        C128042k kVar = this.f352327c;
        C128045n nVar = (C128045n) obj;
        int intValue = ((Integer) obj2).intValue();
        Sensor defaultSensor = lVar.f352342c.getDefaultSensor(nVar.f352350f);
        if (defaultSensor == null) {
            ((C58970a) ((C58970a) C128043l.f352340a.mo56225c()).mo56372aa(37764)).mo56389s("Cannot start missing sensor %s", nVar);
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            cxVar = C2169h.m6027a(new C128036e(lVar, kVar, nVar, defaultSensor, intValue));
        }
        map.put(nVar, cxVar);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
