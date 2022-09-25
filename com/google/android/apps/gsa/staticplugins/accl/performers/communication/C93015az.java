package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.apps.gsa.shared.util.permissions.ProxyIntentStarter;
import com.google.android.apps.gsa.shared.util.permissions.ProxyPermissionsRequester;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.az */
/* compiled from: PG */
public final class C93015az extends C22538o {

    /* renamed from: a */
    public static final C59071e f259469a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.communication.az");

    /* renamed from: b */
    public final Context f259470b;

    /* renamed from: c */
    private final ProxyIntentStarter f259471c;

    /* renamed from: d */
    private final C22871g f259472d;

    public C93015az(Context context, ProxyIntentStarter proxyIntentStarter, C22871g gVar) {
        this.f259470b = context;
        this.f259471c = proxyIntentStarter;
        this.f259472d = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C60870cx cxVar;
        if (C91077d.m148794e(this.f259470b, "android.permission.ANSWER_PHONE_CALLS")) {
            cxVar = C60856cj.m92900i(true);
        } else {
            SettableFuture settableFuture = new SettableFuture();
            new ProxyPermissionsRequester(this.f259471c, this.f259470b).mo81047ju(new String[]{"android.permission.ANSWER_PHONE_CALLS"}, 5, new C93013ax(settableFuture));
            cxVar = this.f259472d.mo28205e(C90877ak.m148471e(settableFuture, 10000, TimeUnit.MILLISECONDS, this.f259472d), "permission request timeout", TimeoutException.class, C93014ay.f259468a);
        }
        C60870cx h = C60922j.m93045h(cxVar, new C93012aw(this, dyVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }
}
