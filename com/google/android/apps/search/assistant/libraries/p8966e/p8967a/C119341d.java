package com.google.android.apps.search.assistant.libraries.p8966e.p8967a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9342a.C124181k;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35477d;
import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35483j;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.libraries.e.a.d */
/* compiled from: PG */
public final class C119341d implements C119908e {

    /* renamed from: a */
    public static final C59071e f332737a = C59071e.m91332i("com.google.android.apps.search.assistant.libraries.e.a.d");

    /* renamed from: b */
    public static final C33480d f332738b = C33480d.m62053a("apa_execute_remote_args", "com.google.android.libraries.search.assistant.performer.crossdevice.proto.ApaExecuteRemoteArgs", C35477d.f93167e);

    /* renamed from: c */
    public static final C33480d f332739c = C33480d.m62053a("apa_execute_remote_result", "com.google.android.libraries.search.assistant.performer.crossdevice.proto.ApaExecuteRemoteResult", C35483j.f93186d);

    /* renamed from: d */
    public final Executor f332740d;

    /* renamed from: e */
    public final C47632e f332741e = new C47632e();

    /* renamed from: f */
    public final C124181k f332742f;

    /* renamed from: g */
    private final C51809dy f332743g;

    public C119341d(C51809dy dyVar, C124181k kVar, Executor executor) {
        this.f332743g = dyVar;
        this.f332742f = kVar;
        this.f332740d = executor;
    }

    /* renamed from: a */
    public final C60870cx mo104299a() {
        C51809dy dyVar = this.f332743g;
        String str = dyVar.f135936b;
        C33480d dVar = f332738b;
        return C36183e.m64583a(dyVar, dVar.f89601a, ((C35477d) dVar.f89602b.f89590a).getParserForType(), new C119338a(this));
    }

    /* renamed from: b */
    public final void mo104300b() {
        String str = this.f332743g.f135936b;
        String str2 = f332738b.f89601a;
    }
}
