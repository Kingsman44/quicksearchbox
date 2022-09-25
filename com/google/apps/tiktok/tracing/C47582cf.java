package com.google.apps.tiktok.tracing;

import android.content.DialogInterface;
import com.google.android.apps.search.googleapp.search.suggest.feedback.C138083aa;

/* renamed from: com.google.apps.tiktok.tracing.cf */
/* compiled from: PG */
public final /* synthetic */ class C47582cf implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123481a;

    /* renamed from: b */
    public final /* synthetic */ DialogInterface.OnCancelListener f123482b;

    /* renamed from: c */
    public final /* synthetic */ String f123483c = "User tapped outside of feedback dialog.";

    public /* synthetic */ C47582cf(C47770dh dhVar, DialogInterface.OnCancelListener onCancelListener) {
        this.f123481a = dhVar;
        this.f123482b = onCancelListener;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C47538ax c;
        C47770dh dhVar = this.f123481a;
        DialogInterface.OnCancelListener onCancelListener = this.f123482b;
        String str = this.f123483c;
        C47831fm.m85022q();
        try {
            if (C47831fm.m85027v()) {
                ((C138083aa) onCancelListener).f375696a.mo114139d();
            } else {
                c = dhVar.mo51613c(str);
                ((C138083aa) onCancelListener).f375696a.mo114139d();
                if (c != null) {
                    c.close();
                }
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47831fm.m85019n();
            throw th;
        }
        throw th;
    }
}
