package com.google.android.apps.gsa.staticplugins.opa.morris2.p8398i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Base64;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15111ae;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.i.o */
/* compiled from: PG */
public final class C109702o {

    /* renamed from: d */
    private static final C59071e f305605d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.i.o");

    /* renamed from: a */
    public final C86124t f305606a;

    /* renamed from: b */
    public final C14986h f305607b;

    /* renamed from: c */
    public final C15111ae f305608c;

    /* renamed from: e */
    private BroadcastReceiver f305609e;

    /* renamed from: f */
    private final Context f305610f;

    public C109702o(Context context, C86124t tVar, C14986h hVar, C15111ae aeVar) {
        this.f305610f = context;
        this.f305606a = tVar;
        this.f305607b = hVar;
        this.f305608c = aeVar;
    }

    /* renamed from: a */
    public static MessageLite m182623a(Class cls, C63010eb ebVar, Intent intent, String str) {
        try {
            String stringExtra = intent.getStringExtra(str);
            stringExtra.getClass();
            return (MessageLite) cls.cast(ebVar.mo59010i(Base64.decode(stringExtra, 0)));
        } catch (C62974ct | IllegalArgumentException e) {
            C59104x c = f305605d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.TestUiUpdateHdl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25171)).mo56386p("Error Invalid proto.");
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m182624d(Intent intent, String str) {
        return intent.getStringExtra(str) != null;
    }

    /* renamed from: b */
    public final void mo98021b() {
        if (this.f305606a.mo79746e(C90051dc.f248798aF)) {
            C109701n nVar = new C109701n(this);
            this.f305609e = nVar;
            this.f305610f.registerReceiver(nVar, new IntentFilter("com.google.android.apps.gsa.staticplugins.opa.morris2.INTENT_UI_TEST"));
        }
    }

    /* renamed from: c */
    public final void mo98022c() {
        BroadcastReceiver broadcastReceiver = this.f305609e;
        if (broadcastReceiver != null) {
            this.f305610f.unregisterReceiver(broadcastReceiver);
        }
    }
}
