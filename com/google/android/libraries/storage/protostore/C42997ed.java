package com.google.android.libraries.storage.protostore;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.protostore.ed */
/* compiled from: PG */
final class C42997ed implements C60930r {

    /* renamed from: a */
    public List f112443a;

    /* renamed from: b */
    final /* synthetic */ C43000eg f112444b;

    public C42997ed(C43000eg egVar) {
        this.f112444b = egVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        ArrayList arrayList;
        C43000eg egVar = this.f112444b;
        C47558bi b = egVar.f112453e.mo51389b("Initialize ".concat(String.valueOf(egVar.f112449a)));
        try {
            synchronized (this.f112444b.f112452d) {
                if (this.f112443a == null) {
                    C43000eg egVar2 = this.f112444b;
                    this.f112443a = egVar2.f112454f;
                    egVar2.f112454f = Collections.emptyList();
                }
            }
            arrayList = new ArrayList(this.f112443a.size());
            C42999ef efVar = new C42999ef(this.f112444b);
            for (C60931s apply : this.f112443a) {
                arrayList.add(apply.apply(efVar));
            }
        } catch (Exception e) {
            arrayList.add(C60856cj.m92899h(e));
        } catch (Throwable th) {
            if (b != null) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
        C60870cx a = C60856cj.m92894c(arrayList).mo57334a(new C42996ec(this), C60826bg.f164896a);
        b.mo51417a(a);
        if (b != null) {
            b.close();
        }
        return a;
    }
}
