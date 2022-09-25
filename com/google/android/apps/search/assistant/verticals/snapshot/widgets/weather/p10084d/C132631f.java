package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10084d;

import com.google.assistant.p3994s.p3995a.C53228gc;
import com.google.assistant.p3994s.p3995a.C53232gg;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.assistant.p3994s.p3995a.C53262hj;
import com.google.assistant.p3994s.p3995a.C53263hk;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.d.f */
/* compiled from: PG */
public final /* synthetic */ class C132631f implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C132631f f361956a = new C132631f();

    private /* synthetic */ C132631f() {
    }

    public final Object apply(Object obj) {
        C53262hj hjVar = (C53262hj) C53263hk.f139627c.createBuilder();
        C53228gc gcVar = (C53228gc) ((C53245gt) obj).toBuilder();
        C53232gg ggVar = C53232gg.WEATHER_WIDGET;
        gcVar.copyOnWrite();
        C53245gt gtVar = (C53245gt) gcVar.instance;
        gtVar.f139568b = ggVar.f139522g;
        gtVar.f139567a |= 1;
        hjVar.copyOnWrite();
        C53263hk hkVar = (C53263hk) hjVar.instance;
        C53245gt gtVar2 = (C53245gt) gcVar.build();
        gtVar2.getClass();
        hkVar.f139630b = gtVar2;
        hkVar.f139629a |= 1;
        return (C53263hk) hjVar.build();
    }
}
