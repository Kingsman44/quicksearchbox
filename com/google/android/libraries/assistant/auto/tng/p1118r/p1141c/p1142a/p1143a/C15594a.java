package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1143a;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C15594a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C15594a f46635a = new C15594a();

    private /* synthetic */ C15594a() {
    }

    public final Object apply(Object obj) {
        C51809dy a = C15669a.m32462a((String) obj);
        if (a != null) {
            C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
            C52081en b = C15669a.m32463b(Arrays.asList(new C51809dy[]{a}), Arrays.asList(new Integer[]{26708}));
            eVar.copyOnWrite();
            C51195j jVar = (C51195j) eVar.instance;
            b.getClass();
            jVar.f133275j = b;
            jVar.f133266a |= 128;
            return C58833ax.m90834k((C51195j) eVar.build());
        }
        ((C59052c) ((C59052c) C15596c.f46638a.mo56224b()).mo56372aa(46174)).mo56386p("Could not produce tts response, return absent");
        return C58836b.f156633a;
    }
}
