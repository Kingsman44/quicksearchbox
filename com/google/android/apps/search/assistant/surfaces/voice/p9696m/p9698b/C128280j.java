package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9698b;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.binaries.satin.app.amw;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.android.libraries.search.assistant.performer.communication.C35778x;
import com.google.android.libraries.search.assistant.performer.communication.C35779y;
import com.google.android.libraries.search.assistant.performer.communication.p2735c.C35571c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.assistant.performer.permissions.impl.DirectPermissionsRequesterImpl;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5369g.p5373b.p5374a.C68754r;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.b.j */
/* compiled from: PG */
public final class C128280j implements C35472h {

    /* renamed from: a */
    private static final C59071e f352838a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.m.b.j");

    /* renamed from: b */
    private final C35778x f352839b;

    /* renamed from: c */
    private final C126879a f352840c;

    public C128280j(C35779y yVar, C126879a aVar, C37215b bVar, amw amw) {
        C39226b bVar2 = C39226b.TAG_ASSISTANT_VOICE;
        C35571c a = amw.mo65972a(bVar);
        C46877q qVar = (C46877q) yVar.f93730a.mo17428b();
        qVar.getClass();
        Context context = (Context) yVar.f93731b.mo17428b();
        context.getClass();
        C60888db dbVar = (C60888db) yVar.f93732c.mo17428b();
        dbVar.getClass();
        PackageManager packageManager = (PackageManager) yVar.f93733d.mo17428b();
        packageManager.getClass();
        C46428ao aoVar = (C46428ao) yVar.f93734e.mo17428b();
        aoVar.getClass();
        Optional optional = (Optional) yVar.f93735f.mo17428b();
        optional.getClass();
        C68754r rVar = (C68754r) yVar.f93736g.mo17428b();
        rVar.getClass();
        bVar2.getClass();
        this.f352839b = new C35778x(qVar, context, dbVar, packageManager, optional, rVar, bVar2, new DirectPermissionsRequesterImpl(context, dbVar, aoVar), a);
        this.f352840c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        try {
            C36183e.m64586d(dyVar, "call.CALL");
            return this.f352839b.mo39834c((C52289mf) C36183e.m64584b(dyVar, "call_client_op_args", C52289mf.f137258j.getParserForType()), this.f352840c);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f352838a.mo56225c()).mo56382g(e)).mo56372aa(37838)).mo56386p("failed to execute call client op");
            return C60856cj.m92900i(C127406c.m208360b(C52235kf.INTERNAL, "CallPerformer Failed"));
        }
    }
}
