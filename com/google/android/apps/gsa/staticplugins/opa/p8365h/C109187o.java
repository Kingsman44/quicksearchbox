package com.google.android.apps.gsa.staticplugins.opa.p8365h;

import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.o */
/* compiled from: PG */
final class C109187o extends Handler {

    /* renamed from: a */
    final /* synthetic */ C109191s f304015a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109187o(C109191s sVar, Looper looper) {
        super(looper);
        this.f304015a = sVar;
    }

    public final void handleMessage(Message message) {
        C47558bi a;
        super.handleMessage(message);
        C109191s sVar = this.f304015a;
        C47538ax c = sVar.f304026h.mo51613c("BroadcastReceiverServiceMessenger.handleMessage");
        try {
            if (!C109193u.m181710a((PackageManager) sVar.f304021c.mo27525b())) {
                ((C58970a) ((C58970a) sVar.f304019a.mo56225c()).mo56372aa(23871)).mo56386p("broadcast intent not from trusted package");
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (message.what == 1) {
                int i = message.arg1;
                a = C47831fm.m85006a("BroadcastReceiverServiceMessenger.handleMessageFuture");
                C109180h hVar = new C109180h(sVar, i);
                a.mo51417a(C60856cj.m92903l(C47810es.m84977q(hVar), sVar.f304024f));
                a.close();
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (c != null) {
                c.close();
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    C109179g.m181702a(th, th2);
                }
            }
            throw th;
        }
        throw th;
    }
}
