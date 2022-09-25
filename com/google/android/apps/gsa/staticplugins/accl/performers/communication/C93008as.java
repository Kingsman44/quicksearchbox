package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.location.C38570a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.as */
/* compiled from: PG */
public final class C93008as extends C22538o {

    /* renamed from: a */
    public static final C59071e f259456a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.communication.as");

    /* renamed from: b */
    private static final Duration f259457b = Duration.ofSeconds(10);

    /* renamed from: c */
    private final C22871g f259458c;

    /* renamed from: d */
    private final C74637ae f259459d;

    /* renamed from: e */
    private final C85881bd f259460e;

    public C93008as(C22871g gVar, C74637ae aeVar, C85881bd bdVar) {
        this.f259458c = gVar;
        this.f259459d = aeVar;
        this.f259460e = bdVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (!"precise_user_location.GET".equals(dyVar.f135936b)) {
            throw new C22428d(dyVar);
        } else if (!this.f259460e.mo79513d(true)) {
            C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
            C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar = C52235kf.PERMISSION_DENIED;
            kdVar.copyOnWrite();
            C52236kg kgVar = (C52236kg) kdVar.instance;
            kgVar.f137092b = kfVar.f137088t;
            kgVar.f137091a |= 1;
            dzVar.copyOnWrite();
            C52070ec ecVar = (C52070ec) dzVar.instance;
            C52236kg kgVar2 = (C52236kg) kdVar.build();
            kgVar2.getClass();
            ecVar.f136654b = kgVar2;
            ecVar.f136653a = 1 | ecVar.f136653a;
            return C60856cj.m92900i((C52070ec) dzVar.build());
        } else {
            C74637ae aeVar = this.f259459d;
            C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_SERVICES_ACCL_LO);
            d.mo41493b(f259457b);
            ((C38570a) d).f101954b = 3;
            return C60846c.m92878g(C60846c.m92878g(C60838bs.m92859i(C90877ak.m148471e(C60922j.m93044g(C60838bs.m92859i(aeVar.mo71020c(d.mo41492a())), C93005ap.f259453a, C60826bg.f164896a), 30, TimeUnit.SECONDS, this.f259458c)), RuntimeException.class, C93006aq.f259454a, C60826bg.f164896a), TimeoutException.class, C93007ar.f259455a, C60826bg.f164896a);
        }
    }
}
