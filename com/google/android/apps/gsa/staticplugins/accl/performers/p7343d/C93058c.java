package com.google.android.apps.gsa.staticplugins.accl.performers.p7343d;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.staticplugins.accl.p7334d.C92822d;
import com.google.android.apps.gsa.staticplugins.accl.p7334d.C92827i;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35984w;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.d.c */
/* compiled from: PG */
public final class C93058c extends C22538o {

    /* renamed from: f */
    private static final C59071e f259580f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.d.c");

    /* renamed from: a */
    public final Context f259581a;

    /* renamed from: b */
    public final C92822d f259582b;

    /* renamed from: c */
    public final C92827i f259583c;

    /* renamed from: d */
    public final boolean f259584d;

    /* renamed from: e */
    public final boolean f259585e;

    /* renamed from: g */
    private final C86034c f259586g;

    /* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.d.c$a */
    /* compiled from: PG */
    public interface C93059a {
        /* renamed from: fl */
        C35984w mo87527fl();
    }

    public C93058c(Context context, C86034c cVar, boolean z, boolean z2, C92822d dVar, C92827i iVar) {
        this.f259581a = context;
        this.f259586g = cVar;
        this.f259584d = z;
        this.f259585e = z2;
        this.f259582b = dVar;
        this.f259583c = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C59104x b = f259580f.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CameraActionWrapper");
        ((C59052c) ((C59052c) b).mo56372aa(13281)).mo56386p("#perform");
        return C47633f.m84733g(this.f259586g.mo79697b()).mo51516i(new C93057b(this, dyVar), C60826bg.f164896a);
    }
}
