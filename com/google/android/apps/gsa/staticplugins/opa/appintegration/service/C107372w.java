package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119532a;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119533b;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17849l;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17873ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17882al;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.w */
/* compiled from: PG */
public final class C107372w {

    /* renamed from: a */
    public static final C59071e f298829a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.service.w");

    /* renamed from: b */
    public final Handler f298830b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final String f298831c;

    /* renamed from: d */
    public final C17849l f298832d;

    /* renamed from: e */
    public final C107367r f298833e;

    /* renamed from: f */
    public final C107371v f298834f;

    /* renamed from: g */
    public final C107374y f298835g;

    /* renamed from: h */
    public final C119533b f298836h;

    /* renamed from: i */
    boolean f298837i;

    /* renamed from: j */
    public final Set f298838j = new HashSet();

    /* renamed from: k */
    final C17873ac f298839k = ((C17873ac) C17880aj.f51221i.createBuilder());

    public C107372w(String str, C17849l lVar, C107367r rVar, C107374y yVar, C119533b bVar) {
        this.f298831c = str;
        this.f298832d = lVar;
        this.f298833e = rVar;
        this.f298835g = yVar;
        this.f298836h = bVar;
        this.f298834f = new C107371v(this);
        bVar.mo104418a(C119532a.MAESTRO, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo95990a() {
        this.f298837i = false;
        C107367r rVar = this.f298833e;
        C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
        alVar.copyOnWrite();
        C17883am amVar = (C17883am) alVar.instance;
        amVar.f51245b = 5;
        amVar.f51246c = true;
        String str = this.f298831c;
        alVar.copyOnWrite();
        C17883am amVar2 = (C17883am) alVar.instance;
        str.getClass();
        amVar2.f51244a = 1 | amVar2.f51244a;
        amVar2.f51247d = str;
        rVar.mo95987b((C17883am) alVar.build());
    }

    /* renamed from: b */
    public final void mo95991b(byte[] bArr) {
        try {
            this.f298832d.mo23472a(bArr);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) f298829a.mo56225c()).mo56382g(e)).mo56372aa(23763)).mo56386p("#forwardCallbackEvent(): failed to forward callback event.");
        }
    }
}
