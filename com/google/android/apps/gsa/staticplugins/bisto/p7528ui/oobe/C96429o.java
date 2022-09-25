package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.DialogInterface;
import com.google.android.apps.gsa.shared.p7066m.C90122ft;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.o */
/* compiled from: PG */
public final /* synthetic */ class C96429o implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96431q f269757a;

    /* renamed from: b */
    public final /* synthetic */ String f269758b;

    /* renamed from: c */
    public final /* synthetic */ String[] f269759c;

    /* renamed from: d */
    public final /* synthetic */ String f269760d;

    /* renamed from: e */
    public final /* synthetic */ String f269761e;

    public /* synthetic */ C96429o(C96431q qVar, String str, String[] strArr, String str2, String str3) {
        this.f269757a = qVar;
        this.f269758b = str;
        this.f269759c = strArr;
        this.f269760d = str2;
        this.f269761e = str3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C96431q qVar = this.f269757a;
        String str = this.f269758b;
        String[] strArr = this.f269759c;
        String str2 = this.f269760d;
        String str3 = this.f269761e;
        if (qVar.f269765e.mo79746e(C90122ft.f250862a)) {
            qVar.f269766f.mo28212l("recordConsent", new C96393m(qVar, str, strArr, str2, str3));
        } else {
            qVar.mo90119g(strArr, str2, str3);
        }
    }
}
