package android.support.p033v7.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.p060c.C0984n;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.f */
/* compiled from: PG */
public final class C0438f implements C0434b {

    /* renamed from: a */
    public final ActionMode.Callback f1450a;

    /* renamed from: b */
    public final Context f1451b;

    /* renamed from: c */
    final ArrayList f1452c = new ArrayList();

    /* renamed from: d */
    final C0984n f1453d = new C0984n(0);

    public C0438f(Context context, ActionMode.Callback callback) {
        this.f1451b = context;
        this.f1450a = callback;
    }

    /* renamed from: a */
    public final void mo1123a(C0435c cVar) {
        throw null;
    }

    /* renamed from: b */
    public final boolean mo1124b(C0435c cVar, MenuItem menuItem) {
        throw null;
    }

    /* renamed from: c */
    public final boolean mo1125c(C0435c cVar, Menu menu) {
        throw null;
    }

    /* renamed from: d */
    public final void mo1126d(C0435c cVar, Menu menu) {
        throw null;
    }

    /* renamed from: e */
    public final ActionMode mo1409e(C0435c cVar) {
        int size = this.f1452c.size();
        for (int i = 0; i < size; i++) {
            C0439g gVar = (C0439g) this.f1452c.get(i);
            if (gVar != null && gVar.f1455b == cVar) {
                return gVar;
            }
        }
        C0439g gVar2 = new C0439g(this.f1451b, cVar);
        this.f1452c.add(gVar2);
        return gVar2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.core.b.a.a, android.view.Menu, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Menu mo1410f(android.view.Menu r3) {
        /*
            r2 = this;
            androidx.c.n r0 = r2.f1453d
            java.lang.Object r0 = r0.get(r3)
            android.view.Menu r0 = (android.view.Menu) r0
            if (r0 != 0) goto L_0x0016
            android.support.v7.view.menu.ai r0 = new android.support.v7.view.menu.ai
            android.content.Context r1 = r2.f1451b
            r0.<init>(r1, r3)
            androidx.c.n r1 = r2.f1453d
            r1.put(r3, r0)
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.view.C0438f.mo1410f(android.view.Menu):android.view.Menu");
    }
}
