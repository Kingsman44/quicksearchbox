package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.staticplugins.opa.inproducthelp.ChatUiHelpController;
import com.google.android.apps.gsa.staticplugins.opa.util.C113869cx;
import com.google.assistant.p3897e.p3921j.C52332nv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.cw */
/* compiled from: PG */
public final class C108516cw {

    /* renamed from: a */
    final /* synthetic */ C109040fj f301925a;

    public C108516cw(C109040fj fjVar) {
        this.f301925a = fjVar;
    }

    /* renamed from: a */
    public final void mo96955a(boolean z) {
        if (z) {
            C109040fj fjVar = this.f301925a;
            if (fjVar.f303460y != null) {
                fjVar.mo97452aN(false);
                ChatUiHelpController chatUiHelpController = this.f301925a.f303460y;
                int a = C52332nv.m86573a(chatUiHelpController.f304448i.f137382k);
                if (a != 0 && a == 3) {
                    C113869cx cxVar = chatUiHelpController.f304445f;
                    cxVar.mo100731d(cxVar.mo100734h(3), chatUiHelpController.f304445f.mo100729b(chatUiHelpController.f304444e), chatUiHelpController.f304443d);
                }
            }
        }
        this.f301925a.f303460y = null;
    }
}
