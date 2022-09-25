package com.google.android.libraries.p1649b.p1650a;

import android.support.p033v7.widget.C0658ft;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.p1649b.p1651b.C19611a;
import com.google.android.libraries.p1649b.p1651b.C19612b;
import com.google.android.libraries.p1649b.p1651b.C19613c;
import com.google.android.libraries.p1649b.p1651b.C19614d;
import com.google.android.libraries.p1649b.p1651b.C19615e;
import com.google.android.libraries.p1649b.p1651b.C19616f;
import com.google.android.libraries.p1649b.p1651b.C19617g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19619i;
import com.google.android.libraries.p1649b.p1652c.C19622a;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1653d.C19624b;
import com.google.android.libraries.p1649b.p1654e.C19626a;
import com.google.android.libraries.p1649b.p1655f.C19628b;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.b.a.b */
/* compiled from: PG */
public class C19605b {

    /* renamed from: d */
    public C19618h f54548d = new C19618h(this.f54550f);

    /* renamed from: e */
    protected C19607d f54549e = new C19607d();

    /* renamed from: f */
    public C19610g f54550f = new C19610g(this.f54549e);

    /* renamed from: b */
    public final void mo24920b() {
        C19618h hVar = this.f54548d;
        for (Map.Entry entry : hVar.f54588d.entrySet()) {
            for (C19611a d : (List) entry.getValue()) {
                hVar.f54587c.mo24963d((C19624b) entry.getKey(), d);
            }
            ((List) entry.getValue()).clear();
        }
        hVar.f54588d.clear();
        hVar.f54589e = null;
        hVar.f54590f = null;
        this.f54548d = null;
        this.f54550f = null;
        C19607d dVar = this.f54549e;
        dVar.f54554a = false;
        dVar.mo24935b();
        dVar.f54560g = null;
        dVar.f54561h = null;
        dVar.f54555b = null;
        this.f54549e = null;
    }

    /* renamed from: c */
    public final void mo24921c(C19624b bVar, C19628b bVar2) {
        C19618h hVar = this.f54548d;
        if (hVar != null) {
            hVar.f54587c.mo24960a(bVar, bVar2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo24922d(C19626a aVar) {
        C19618h hVar = this.f54548d;
        if (hVar != null) {
            hVar.f54591g = aVar;
            hVar.f54587c.f54625a = aVar;
        }
    }

    /* renamed from: e */
    public final void mo24923e(C19608e eVar) {
        C19607d dVar = this.f54549e;
        if (dVar != null) {
            dVar.f54555b = eVar;
        }
    }

    /* renamed from: f */
    public final void mo24924f(C19606c cVar) {
        cVar.f54551a = this.f54550f;
        C19618h hVar = this.f54548d;
        if (hVar != null && hVar.f54590f == null) {
            hVar.f54590f = cVar;
            hVar.f54589e = new C19619i(hVar.f54586b, cVar);
            C19622a aVar = hVar.f54592h;
            if (aVar != null) {
                hVar.f54589e.mo24951c(aVar);
            }
            hVar.mo24950a(new C19623a(2), hVar.f54589e);
            hVar.mo24950a(new C19623a(6), hVar.f54589e);
        }
    }

    /* renamed from: h */
    public final void mo24926h(View view) {
        C19618h hVar = this.f54548d;
        if (hVar != null) {
            view.addOnLayoutChangeListener(new C19612b(hVar));
        }
    }

    /* renamed from: i */
    public final C0658ft mo24927i() {
        return new C19604a(this, true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo24925g() {
        C19618h hVar = this.f54548d;
        if (hVar == null) {
            return;
        }
        if (hVar.f54591g == null) {
            Log.e(C19618h.f54585a, "Cannot initialize event listeners without executor.");
            return;
        }
        hVar.mo24950a(new C19623a(4), new C19615e(hVar));
        hVar.mo24950a(new C19623a(5), new C19616f(hVar));
        hVar.mo24950a(new C19623a(3), new C19613c(hVar));
        hVar.mo24950a(new C19623a(8), new C19617g(hVar));
        hVar.mo24950a(new C19623a(7), new C19614d(hVar));
    }
}
