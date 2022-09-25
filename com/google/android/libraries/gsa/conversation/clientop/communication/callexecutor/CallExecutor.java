package com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.telecom.TelecomManager;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89129a;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89134f;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89135g;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89142n;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89143o;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22411a;
import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22412b;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.concurrent.ExecutorService;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class CallExecutor {

    /* renamed from: a */
    public static final C59071e f61911a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor");

    /* renamed from: b */
    public final Context f61912b;

    /* renamed from: c */
    public final C22695ah f61913c;

    /* renamed from: d */
    public final C68214a f61914d;

    /* renamed from: e */
    public final C22412b f61915e;

    /* renamed from: f */
    public final TelecomManager f61916f;

    /* renamed from: g */
    public final C22411a f61917g;

    /* renamed from: h */
    private final ExecutorService f61918h;

    /* renamed from: i */
    private final C89143o f61919i;

    /* renamed from: j */
    private final Optional f61920j;

    /* compiled from: PG */
    class PermissionsCallback extends ResultReceiver {

        /* renamed from: a */
        private final SettableFuture f61921a;

        public PermissionsCallback(SettableFuture settableFuture) {
            super(new Handler(Looper.getMainLooper()));
            this.f61921a = settableFuture;
        }

        /* access modifiers changed from: protected */
        public final void onReceiveResult(int i, Bundle bundle) {
            if (this.f61921a != null) {
                int[] intArray = bundle.getIntArray("permissions-grants");
                if (intArray != null && intArray.length == 1 && intArray[0] == 0) {
                    ((C59052c) ((C59052c) CallExecutor.f61911a.mo56224b()).mo56372aa(48250)).mo56386p("Call phone permission is granted.");
                    this.f61921a.mo57356n(true);
                    return;
                }
                ((C59052c) ((C59052c) CallExecutor.f61911a.mo56224b()).mo56372aa(48249)).mo56386p("Call phone permission is rejected.");
                this.f61921a.mo57356n(false);
            }
        }
    }

    public CallExecutor(Context context, C22695ah ahVar, C68214a aVar, ExecutorService executorService, TelecomManager telecomManager, C22412b bVar, C22411a aVar2, C89143o oVar, Optional optional) {
        this.f61912b = context;
        this.f61913c = ahVar;
        this.f61914d = aVar;
        this.f61918h = executorService;
        this.f61916f = telecomManager;
        this.f61915e = bVar;
        this.f61917g = aVar2;
        this.f61919i = oVar;
        this.f61920j = optional;
    }

    /* renamed from: b */
    public static void m41844b(boolean z, String str) {
        if (!z) {
            ((C59052c) ((C59052c) f61911a.mo56225c()).mo56372aa(48269)).mo56389s("%s", str);
            throw new C22534k();
        }
    }

    /* renamed from: f */
    public static boolean m41845f(C52289mf mfVar) {
        C51058ev evVar;
        if (mfVar.f137260a != 6) {
            return false;
        }
        C51098gh ghVar = (C51098gh) mfVar.f137261b;
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if (C58890d.m90990e("com.google.android.apps.tachyon", evVar.f132944b)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m41846g(C52289mf mfVar) {
        C51058ev evVar;
        if (mfVar.f137260a != 6) {
            return false;
        }
        C51098gh ghVar = (C51098gh) mfVar.f137261b;
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if (C58890d.m90990e("com.whatsapp", evVar.f132944b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C60870cx mo27607a(C52289mf mfVar, boolean z, boolean z2) {
        C60870cx cxVar;
        Context context = this.f61912b;
        C22695ah ahVar = this.f61913c;
        if (m41845f(mfVar) || (!mfVar.f137263d.equals("PHONE_NUMBER") && !mfVar.f137263d.equals("EMERGENCY") && !mfVar.f137263d.equals("VOICEMAIL"))) {
            cxVar = C60856cj.m92900i(true);
        } else {
            try {
                if (context.checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                    cxVar = C60856cj.m92900i(true);
                }
            } catch (RuntimeException unused) {
            }
            SettableFuture settableFuture = new SettableFuture();
            ahVar.mo27807a(new Intent(context, PermissionsRequestActivity.class).putExtra("permissions", new String[]{"android.permission.CALL_PHONE"}).putExtra("receiver", new PermissionsCallback(settableFuture)));
            cxVar = settableFuture;
        }
        return C60922j.m93045h(cxVar, new C22415a(this, z, mfVar, z2), this.f61918h);
    }

    /* renamed from: c */
    public final void mo27608c(String str) {
        C89135g gVar = (C89135g) C89142n.f241658n.createBuilder();
        C89134f fVar = C89134f.CLIENT_OP_EXECUTED;
        gVar.copyOnWrite();
        C89142n nVar = (C89142n) gVar.instance;
        nVar.f241661b = fVar.f241638y;
        nVar.f241660a |= 1;
        gVar.copyOnWrite();
        C89142n nVar2 = (C89142n) gVar.instance;
        nVar2.f241660a |= 2;
        nVar2.f241663d = "call.CALL";
        gVar.copyOnWrite();
        C89142n nVar3 = (C89142n) gVar.instance;
        nVar3.f241660a |= 4;
        nVar3.f241664e = str;
        C89143o oVar = this.f61919i;
        C89129a aVar = new C89129a();
        aVar.mo83116c((C89142n) gVar.build());
        aVar.mo83115b(this.f61920j);
        oVar.mo27606c(aVar.mo83114a());
    }

    /* renamed from: d */
    public final void mo27609d(C52289mf mfVar) {
        C22412b bVar;
        C22411a aVar;
        if (mo27610e(mfVar) && (bVar = this.f61915e) != null && (aVar = this.f61917g) != null) {
            try {
                bVar.mo27603c(mfVar.f137262c, aVar);
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f61911a.mo56225c()).mo56382g(e)).mo56372aa(48270)).mo56386p("Failed to start call tracking.");
            }
        }
    }

    /* renamed from: e */
    public final boolean mo27610e(C52289mf mfVar) {
        C51098gh ghVar;
        C51058ev evVar;
        if (mfVar.f137260a == 6) {
            ghVar = (C51098gh) mfVar.f137261b;
        } else {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if (evVar.f132944b.isEmpty() && mfVar.f137263d.equals("PHONE_NUMBER") && this.f61915e != null && this.f61917g != null) {
            return true;
        }
        return false;
    }
}
