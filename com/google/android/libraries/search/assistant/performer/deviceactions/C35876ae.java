package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.android.libraries.search.assistant.invocation.p2651n.p2652a.C33975b;
import com.google.android.libraries.search.assistant.invocation.p2651n.p2652a.C33976c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52123gb;
import com.google.assistant.p3897e.p3921j.C52124gc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.ae */
/* compiled from: PG */
public final class C35876ae implements C35472h {

    /* renamed from: a */
    public static final C59071e f93988a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.ae");

    /* renamed from: b */
    private final C33975b f93989b;

    /* renamed from: c */
    private final Executor f93990c;

    public C35876ae(C33975b bVar, Executor executor) {
        this.f93989b = bVar;
        this.f93990c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        ((C59052c) ((C59052c) f93988a.mo56224b()).mo56372aa(51810)).mo56386p("TNG DevicePowerPerformer.");
        int i = 1;
        if (dyVar.f135936b.equals("device.POWER")) {
            C52124gc gcVar = (C52124gc) C36183e.m64584b(dyVar, "device_setting_params", C52124gc.f136780c.getParserForType());
            if ((gcVar.f136782a & 1) != 0) {
                int a = C52123gb.m86512a(gcVar.f136783b);
                if (a != 0) {
                    i = a;
                }
                if (i == 2 || i == 3) {
                    return C47633f.m84733g(this.f93989b.mo39172a()).mo51515h(C35873ab.f93985a, this.f93990c).mo51513e(C33976c.class, C35874ac.f93986a, this.f93990c).mo51513e(Exception.class, C35875ad.f93987a, this.f93990c);
                }
                throw new C35471g("Unable to do power control: only support POWER OFF and RESTART state.");
            }
            throw new C35471g("Unable to do power control: no state found.");
        }
        throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"device.POWER", dyVar.f135936b}));
    }
}
