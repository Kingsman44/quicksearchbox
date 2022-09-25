package com.google.android.libraries.onegoogle.account.disc;

import com.google.android.libraries.onegoogle.p2378b.C30830g;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.u */
/* compiled from: PG */
public final /* synthetic */ class C30221u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30224x f81694a;

    /* renamed from: b */
    public final /* synthetic */ C30830g f81695b;

    /* renamed from: c */
    public final /* synthetic */ int f81696c;

    /* renamed from: d */
    public final /* synthetic */ String f81697d;

    public /* synthetic */ C30221u(C30224x xVar, C30830g gVar, int i, String str) {
        this.f81694a = xVar;
        this.f81695b = gVar;
        this.f81696c = i;
        this.f81697d = str;
    }

    public final void run() {
        C30224x xVar = this.f81694a;
        this.f81695b.mo35681a(xVar.f81703b, this.f81696c, new C30218r(xVar, this.f81697d));
    }
}
