package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.aj */
/* compiled from: PG */
public final /* synthetic */ class C131957aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Function f360283a;

    public /* synthetic */ C131957aj(Function function) {
        this.f360283a = function;
    }

    public final Object apply(Object obj) {
        return (C58485gu) Collection.EL.stream((List) obj).flatMap(C131953af.f360277a).map(this.f360283a).collect(C58370cn.f155946a);
    }
}
