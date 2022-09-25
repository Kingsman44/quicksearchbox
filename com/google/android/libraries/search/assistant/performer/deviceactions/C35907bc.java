package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35864u;
import com.google.android.libraries.search.assistant.performer.p2728a.C35466b;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52119fy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.bc */
/* compiled from: PG */
public final class C35907bc implements C35472h {

    /* renamed from: a */
    public static final C59071e f94049a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.bc");

    /* renamed from: b */
    public final C35909be f94050b;

    /* renamed from: c */
    private final C35466b f94051c;

    /* renamed from: d */
    private final Executor f94052d;

    public C35907bc(Executor executor, C35909be beVar, C35466b bVar) {
        this.f94051c = bVar;
        this.f94052d = executor;
        this.f94050b = beVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (dyVar.f135936b.equals("device.SPRINGBOARD_SETTING")) {
            try {
                Intent b = C35864u.m64260b(C63490p.m96249a(((C52119fy) C36183e.m64584b(dyVar, "open_device_setting_args", C52119fy.f136769e.getParserForType())).f136774d));
                if (b == null) {
                    return C60856cj.m92900i(C36180b.m64579c(C52235kf.CANCELLED, "Failed to find intent."));
                }
                return C47633f.m84733g(this.f94051c.mo39653g(b)).mo51516i(new C35905ba(this), this.f94052d).mo51514f(Exception.class, new C35906bb(b), this.f94052d);
            } catch (IllegalArgumentException e) {
                throw new C35471g((Throwable) e);
            }
        } else {
            throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"device.SPRINGBOARD_SETTING", dyVar.f135936b}));
        }
    }
}
