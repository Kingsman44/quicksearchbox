package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.assistant.p3897e.p3917i.p3918a.C51348ej;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.ai */
/* compiled from: PG */
final class C127959ai implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f352200a;

    /* renamed from: b */
    final /* synthetic */ C127960aj f352201b;

    public C127959ai(C127960aj ajVar, String str) {
        this.f352201b = ajVar;
        this.f352200a = str;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [com.google.android.libraries.search.b.i.a, com.google.android.libraries.search.b.i.c] */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.google.android.libraries.search.b.i.a, com.google.android.libraries.search.b.i.c] */
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            C127960aj ajVar = this.f352201b;
            C37215b bVar = ajVar.f352202a;
            ? r5 = ajVar.f352205d;
            r5.mo40781e(C62722b.CANCELLED);
            r5.mo40795s("motionSignalId", this.f352200a);
            bVar.mo19974a(r5);
            return;
        }
        C127960aj ajVar2 = this.f352201b;
        C37215b bVar2 = ajVar2.f352202a;
        ? r52 = ajVar2.f352205d;
        r52.mo40781e(C62722b.UNAVAILABLE);
        r52.mo40795s("motionSignalId", this.f352200a);
        bVar2.mo19974a(r52);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.libraries.search.b.i.a, com.google.android.libraries.search.b.i.c] */
    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C51348ej ejVar = (C51348ej) obj;
        C127960aj ajVar = this.f352201b;
        C37215b bVar = ajVar.f352202a;
        ? r0 = ajVar.f352205d;
        r0.mo40781e(C62722b.OK);
        r0.mo40795s("motionSignalId", this.f352200a);
        bVar.mo19974a(r0);
        C51347ei a = C51347ei.m86143a(ejVar.f133747b);
        if (a == null) {
            a = C51347ei.UNKNOWN_POSITIONAL_ATTRIBUTE;
        }
        a.name();
        float f = ejVar.f133748c;
    }
}
