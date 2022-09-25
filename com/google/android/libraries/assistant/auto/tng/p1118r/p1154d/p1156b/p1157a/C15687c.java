package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1156b.p1157a;

import android.content.Context;
import android.provider.ContactsContract;
import com.google.android.libraries.assistant.auto.tng.common.permissions.p932a.C13315a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1156b.C15684a;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5218j.p5219a.C66698ab;
import com.google.speech.p5218j.p5219a.C66699ac;
import com.google.speech.p5218j.p5219a.C66700ad;
import com.google.speech.p5218j.p5219a.C66707ak;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.b.a.c */
/* compiled from: PG */
public final class C15687c implements C15684a {

    /* renamed from: a */
    public static final /* synthetic */ int f46817a = 0;

    /* renamed from: b */
    private static final String[] f46818b = {"display_name"};

    /* renamed from: c */
    private final Context f46819c;

    /* renamed from: d */
    private final Executor f46820d;

    /* renamed from: e */
    private final C46877q f46821e;

    public C15687c(Context context, Executor executor, C46877q qVar) {
        this.f46819c = context;
        this.f46820d = executor;
        this.f46821e = qVar;
    }

    /* renamed from: a */
    public final C60870cx mo22506a() {
        if (!C13315a.m29571a("android.permission.READ_CONTACTS", this.f46819c)) {
            C66698ab abVar = (C66698ab) C66707ak.f181458e.createBuilder();
            abVar.copyOnWrite();
            C66707ak akVar = (C66707ak) abVar.instance;
            akVar.f181460a |= 1;
            akVar.f181463d = "device-contacts";
            C66699ac acVar = (C66699ac) C66700ad.f181439d.createBuilder();
            acVar.copyOnWrite();
            C66700ad adVar = (C66700ad) acVar.instance;
            adVar.f181441a |= 1;
            adVar.f181442b = "$CONTACTS";
            abVar.copyOnWrite();
            C66707ak akVar2 = (C66707ak) abVar.instance;
            C66700ad adVar2 = (C66700ad) acVar.build();
            adVar2.getClass();
            akVar2.f181462c = adVar2;
            akVar2.f181461b = 3;
            return C60856cj.m92900i((C66707ak) abVar.build());
        }
        return this.f46821e.mo50872b(ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("limit", "100").build(), f46818b, (String) null, new String[0], "starred DESC, times_contacted DESC, last_time_contacted DESC").f121591a.mo57272e(C47810es.m84970j(C15686b.f46816a), this.f46820d).mo57275g();
    }
}
