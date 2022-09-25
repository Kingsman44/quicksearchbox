package com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a;

import com.google.android.libraries.search.assistant.p2828y.p2854o.C37043e;
import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a.C37026b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58882cs;
import com.google.common.p4522b.C58424en;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4117aw.p4118a.p4119a.C54624b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.assistant.y.o.a.d */
/* compiled from: PG */
public final class C37033d implements C37035f {

    /* renamed from: a */
    public static final C59071e f96469a = C59071e.m91332i("com.google.android.libraries.search.assistant.y.o.a.d");

    /* renamed from: b */
    public static final C58424en f96470b;

    /* renamed from: c */
    private final C58495hd f96471c;

    /* renamed from: d */
    private final Executor f96472d;

    /* renamed from: e */
    private final C58881cr f96473e;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C37026b.PKG_HOME_AUTOMATION_ROOM_NAMES, C54624b.PKG_HOME_AUTOMATION_ROOM_NAMES);
        gzVar.mo55429h(C37026b.PKG_HOME_AUTOMATION_STRUCTURE_NAMES, C54624b.PKG_HOME_AUTOMATION_STRUCTURE_NAMES);
        gzVar.mo55429h(C37026b.PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_ON_OFF_NAMES, C54624b.PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_ON_OFF_NAMES);
        gzVar.mo55429h(C37026b.PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_BRIGHTNESS_NAMES, C54624b.PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_BRIGHTNESS_NAMES);
        gzVar.mo55429h(C37026b.PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_TEMPERATURE_SETTING_NAMES, C54624b.PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_TEMPERATURE_SETTING_NAMES);
        gzVar.mo55429h(C37026b.PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_COLOR_SETTING_NAMES, C54624b.PKG_HOME_AUTOMATION_ITEM_WITH_FUNCTION_COLOR_SETTING_NAMES);
        gzVar.mo55429h(C37026b.PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_ASSISTANT_NAMES, C54624b.PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_ASSISTANT_NAMES);
        gzVar.mo55429h(C37026b.PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_CAST_NAMES, C54624b.PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_CAST_NAMES);
        gzVar.mo55429h(C37026b.PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_COMMUNICATION_CALL_NAMES, C54624b.PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_COMMUNICATION_CALL_NAMES);
        gzVar.mo55429h(C37026b.PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_COMMUNICATION_VIDEO_CALL_NAMES, C54624b.PKG_HOME_AUTOMATION_ITEM_WITH_TRAIT_COMMUNICATION_VIDEO_CALL_NAMES);
        C58495hd f = gzVar.mo55427f(false);
        C58838bb.m90868c(!f.isEmpty());
        Class declaringClass = ((Enum) f.keySet().iterator().next()).getDeclaringClass();
        C58838bb.m90868c(!f.isEmpty());
        C58424en enVar = new C58424en(declaringClass, ((Enum) f.values().iterator().next()).getDeclaringClass());
        enVar.putAll(f);
        f96470b = enVar;
    }

    public C37033d(Executor executor, C37043e eVar, C58495hd hdVar, Duration duration) {
        this.f96472d = executor;
        this.f96471c = hdVar;
        this.f96473e = new C58882cs(new C37024a(hdVar, eVar, executor), duration.toNanos(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public final C60870cx mo40545a(C37026b bVar) {
        if (!this.f96471c.containsKey(bVar)) {
            ((C59052c) ((C59052c) f96469a.mo56226d()).mo56372aa(52495)).mo56386p("Unexpected PkgContextDataType when calling fetchTopNamedEntities.");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C37031b bVar2 = new C37031b(bVar);
        return C60922j.m93044g((C60870cx) this.f96473e.mo6453a(), C47810es.m84963c(bVar2), this.f96472d);
    }

    /* renamed from: b */
    public final C60870cx mo40546b(C37026b bVar, int i) {
        if (!this.f96471c.containsKey(bVar) || ((Integer) this.f96471c.get(bVar)).intValue() == i) {
            return mo40545a(bVar);
        }
        ((C59052c) ((C59052c) f96469a.mo56226d()).mo56372aa(52496)).mo56386p("Unexpected maxCount for this type when calling fetchTopNamedEntities.");
        return C60856cj.m92900i(C58485gu.m89845m());
    }
}
