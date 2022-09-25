package com.google.android.libraries.assistant.soda;

import com.google.android.libraries.p1963i.C23846au;
import com.google.android.libraries.p1963i.C23847av;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.soda.u */
/* compiled from: PG */
public final /* synthetic */ class C19385u implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C19389y f54227a;

    public /* synthetic */ C19385u(C19389y yVar) {
        this.f54227a = yVar;
    }

    public final Object call() {
        C19389y yVar = this.f54227a;
        if (!yVar.mo24536i() || ((C19241ad) yVar.f54240f.mo56107c()).mo24356w()) {
            return null;
        }
        ((C59052c) ((C59052c) C19389y.f54228a.mo56224b()).mo56372aa(47658)).mo56386p("SODA starting detection");
        if (yVar.f54241g) {
            C23846au a = C23847av.m44395a(-16);
            try {
                ((C19241ad) yVar.f54240f.mo56107c()).mo24327d(yVar.mo24531d());
                a.close();
                return null;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            ((C19241ad) yVar.f54240f.mo56107c()).mo24327d(yVar.mo24531d());
            return null;
        }
        throw th;
    }
}
