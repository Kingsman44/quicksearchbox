package com.google.android.apps.search.assistant.platform.p9141h.p9154e;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9800af;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9801ag;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9803ai;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a.C121053d;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a.C121055f;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.search.assistant.platform.h.e.d */
/* compiled from: PG */
public final class C121058d implements C43019v {

    /* renamed from: a */
    public static final C59071e f336460a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.h.e.d");

    /* renamed from: b */
    private final boolean f336461b;

    /* renamed from: c */
    private final boolean f336462c;

    /* renamed from: d */
    private final C60887da f336463d;

    /* renamed from: e */
    private final C9803ai f336464e;

    public C121058d(boolean z, boolean z2, C9803ai aiVar, C60887da daVar) {
        this.f336461b = z;
        this.f336464e = aiVar;
        this.f336463d = daVar;
        this.f336462c = z2;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        C121055f fVar = (C121055f) messageLite;
        if (!this.f336462c && (fVar.f336454a & 1) != 0) {
            C121053d a = C121053d.m200347a(fVar.f336455b);
            if (a == null) {
                a = C121053d.STANDBY_UNSPECIFIED;
            }
            if (a != C121053d.STANDBY_UNSPECIFIED) {
                ((C59052c) ((C59052c) f336460a.mo56224b()).mo56372aa(35694)).mo56386p("#migrate(): skip since AOL has been set up.");
                return C60856cj.m92900i(fVar);
            }
        }
        C9803ai aiVar = this.f336464e;
        ((C59052c) ((C59052c) C9803ai.f33787a.mo56224b()).mo56372aa(944)).mo56386p("#getLockscreenSettingsDataForTngDataMigration()");
        C60870cx h = C60922j.m93045h(C60922j.m93044g(aiVar.f33788b.mo79697b(), C47810es.m84963c(new C9800af(aiVar)), C60826bg.f164896a), C47810es.m84966f(C9801ag.f33786a), C60826bg.f164896a);
        C121057c cVar = new C121057c(fVar);
        return C60922j.m93044g(h, C47810es.m84963c(cVar), this.f336463d);
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        ((C59052c) ((C59052c) f336460a.mo56224b()).mo56372aa(35695)).mo56358K("#shouldMigrate(): allowLockscreenSettingsDataMigration = %b, alwaysUsingAGSASettingData = %b", this.f336461b, this.f336462c);
        boolean z = true;
        if (!this.f336461b && !this.f336462c) {
            z = false;
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }
}
