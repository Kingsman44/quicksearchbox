package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146021aq;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.mx */
/* compiled from: PG */
public final /* synthetic */ class C96417mx implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C96428nh f269733a;

    /* renamed from: b */
    public final /* synthetic */ String f269734b;

    /* renamed from: c */
    public final /* synthetic */ String f269735c = "/assistant/psk";

    /* renamed from: d */
    public final /* synthetic */ byte[] f269736d;

    /* renamed from: e */
    public final /* synthetic */ Duration f269737e;

    public /* synthetic */ C96417mx(C96428nh nhVar, String str, byte[] bArr, Duration duration) {
        this.f269733a = nhVar;
        this.f269734b = str;
        this.f269736d = bArr;
        this.f269737e = duration;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C96428nh nhVar = this.f269733a;
        C146006ab e = C146021aq.m237851e(nhVar.f269755b.mo123258a(this.f269734b, this.f269735c, this.f269736d), this.f269737e.toMillis(), TimeUnit.MILLISECONDS);
        C146014aj ajVar = (C146014aj) e;
        ajVar.mo122495n(C146013ai.f394700a, new C96411mr(cVar));
        ajVar.mo122494m(C146013ai.f394700a, new C96418my(cVar));
        return e;
    }
}
