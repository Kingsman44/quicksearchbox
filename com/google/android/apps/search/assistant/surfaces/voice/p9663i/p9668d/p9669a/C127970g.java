package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a;

import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128041j;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128042k;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128045n;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.g */
/* compiled from: PG */
public final class C127970g implements C127974k {

    /* renamed from: a */
    public static final C59071e f352223a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.i.d.a.g");

    /* renamed from: b */
    public static final C58495hd f352224b = C58495hd.m89900n(C128045n.GYROSCOPE, Double.valueOf(67.0d));

    /* renamed from: c */
    private final C127960aj f352225c;

    public C127970g(C127961ak akVar) {
        C51347ei eiVar = C51347ei.ZERO_VELOCITY;
        C128041j d = C128042k.m209187d();
        d.f352339b.mo55433l((Map) Collection.EL.stream(f352224b.keySet()).collect(C58370cn.m89403c(C127966c.f352219a, C127967d.f352220a, C127968e.f352221a)));
        d.mo108308b(Duration.ofMillis(100));
        this.f352225c = akVar.mo108294a(eiVar, d.mo108330d(), C37176a.f97106fL, C37176a.f97107fM, C37176a.f97108fN.mo40804b(), C127969f.f352222a);
    }

    /* renamed from: a */
    public final C127951aa mo108295a() {
        return this.f352225c;
    }

    /* renamed from: b */
    public final /* synthetic */ C51347ei mo108292b() {
        return C127973j.m209101a(this);
    }

    /* renamed from: c */
    public final /* synthetic */ C60870cx mo108293c() {
        return C127973j.m209102b(this);
    }
}
