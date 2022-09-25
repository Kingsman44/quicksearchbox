package com.google.android.apps.gsa.staticplugins.opa.p8365h;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a.C109140a;
import com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a.C109146b;
import com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a.C109149e;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.b */
/* compiled from: PG */
final class C109171b extends Handler {

    /* renamed from: a */
    final /* synthetic */ C109177e f303983a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109171b(C109177e eVar, Looper looper) {
        super(looper);
        this.f303983a = eVar;
    }

    public final void handleMessage(Message message) {
        C47558bi a;
        super.handleMessage(message);
        C109177e eVar = this.f303983a;
        C47538ax c = eVar.f303994e.mo51613c("BroadcastReceiverBinderProvider#handleMessage");
        try {
            if (!C109193u.m181710a((PackageManager) eVar.f303991b.mo27525b())) {
                ((C58970a) ((C58970a) eVar.f303990a.mo56225c()).mo56372aa(23865)).mo56386p("broadcast intent not from trusted package");
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            }
            Intent intent = (Intent) message.getData().getParcelable("pss_broadcast_intent");
            if (intent == null) {
                ((C58970a) ((C58970a) eVar.f303990a.mo56226d()).mo56372aa(23864)).mo56386p("broadcast intent is null, dropping broadcast");
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            }
            int i = message.arg1;
            ((C58970a) ((C58970a) eVar.f303990a.mo56224b()).mo56372aa(23862)).mo56395y("handleMessage(): id:%d action:%s", i, intent.getAction());
            a = C47831fm.m85006a("BroadcastReceiverBinderProvider#handleMessage handleCommonBroadcastIntent");
            C109176d dVar = eVar.f303993d;
            ((C58970a) ((C58970a) ((C109149e) dVar).f303952a.mo56224b()).mo56372aa(23883)).mo56389s("receive(): %s", intent.getAction());
            C60870cx a2 = C47638k.m84750a((C58485gu) Collection.EL.stream(((C109149e) dVar).f303953b).map(new C109140a((C109149e) dVar, intent)).collect(C58370cn.f155946a)).mo51520a(C109146b.f303948a, ((C109149e) dVar).f303955d);
            a.mo51417a(a2);
            Messenger messenger = message.replyTo;
            if (messenger == null) {
                ((C58970a) ((C58970a) eVar.f303990a.mo56226d()).mo56372aa(23863)).mo56386p("replyTo Messenger is null!");
                a.close();
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            }
            C60870cx q = C60856cj.m92908q(a2, 5, TimeUnit.MINUTES, eVar.f303992c);
            C109175c cVar = new C109175c(eVar, messenger, i);
            C60856cj.m92911t(q, C47810es.m84974n(cVar), eVar.f303992c);
            a.close();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    C109139a.m181665a(th, th2);
                }
            }
            throw th;
        }
        throw th;
    }
}
