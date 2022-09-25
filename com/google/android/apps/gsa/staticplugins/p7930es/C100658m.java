package com.google.android.apps.gsa.staticplugins.p7930es;

import android.app.PendingIntent;
import com.google.android.apps.gsa.p496a.p499b.C9307a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.m */
/* compiled from: PG */
public final /* synthetic */ class C100658m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C100664s f281467a;

    /* renamed from: b */
    public final /* synthetic */ String f281468b;

    /* renamed from: c */
    public final /* synthetic */ String f281469c;

    public /* synthetic */ C100658m(C100664s sVar, String str, String str2) {
        this.f281467a = sVar;
        this.f281468b = str;
        this.f281469c = str2;
    }

    public final C60870cx apply(Object obj) {
        SettableFuture settableFuture;
        C100664s sVar = this.f281467a;
        String str = this.f281468b;
        String str2 = this.f281469c;
        Long l = (Long) obj;
        synchronized (sVar) {
            sVar.f281491i = sVar.mo91999a(1, l.longValue());
            try {
                PendingIntent pendingIntent = (PendingIntent) C100664s.m166823d(sVar.f281484b, 1).get(0);
                if (!((C9307a) sVar.f281487e.mo56107c()).mo17485a()) {
                    ((C89859i) sVar.f281489g.mo27525b()).mo83702b(C89849ae.OPA_CHAT_XMSWORKER_SMS_MAPCLIENT_INIT_FAILED);
                    sVar.f281491i.mo91997a(new ExecutionException(new Throwable("MAP failed to initialize.")));
                }
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) C100664s.f281482a.mo56225c()).mo56372aa(33958)).mo56354G("Recipient: %s.\n Message: %s ", str, str2);
                ((C89859i) sVar.f281489g.mo27525b()).mo83702b(C89849ae.OPA_CHAT_XMSWORKER_SMS_MAPCLIENT_ILLEGAL_EXCEPTION);
                C100663r rVar = sVar.f281491i;
                String message = e.getMessage();
                rVar.mo91997a(new C100662q("Exception while sending SMS message from MapClientManager. " + message));
            } catch (RuntimeException e2) {
                ((C59052c) ((C59052c) C100664s.f281482a.mo56225c()).mo56372aa(33959)).mo56354G("Recipient: %s.\n Message: %s ", str, str2);
                ((C89859i) sVar.f281489g.mo27525b()).mo83702b(C89849ae.OPA_CHAT_XMSWORKER_SMS_MAPCLIENT_UNKNOWN_ERR);
                C100663r rVar2 = sVar.f281491i;
                String message2 = e2.getMessage();
                rVar2.mo91997a(new C100662q("Unknown error: " + message2));
            }
            settableFuture = sVar.f281491i.f281477a;
        }
        return settableFuture;
    }
}
