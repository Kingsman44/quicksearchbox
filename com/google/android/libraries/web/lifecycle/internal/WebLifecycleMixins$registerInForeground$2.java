package com.google.android.libraries.web.lifecycle.internal;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.web.lifecycle.C43892g;
import com.google.android.libraries.web.p3428m.p3429a.C43924m;
import p5462h.p5473f.p5474a.C69626l;

/* compiled from: PG */
public final class WebLifecycleMixins$registerInForeground$2 implements C2376g {

    /* renamed from: a */
    final /* synthetic */ Class f114340a;

    /* renamed from: b */
    final /* synthetic */ C69626l f114341b;

    /* renamed from: c */
    final /* synthetic */ C69626l f114342c;

    /* renamed from: d */
    final /* synthetic */ C43924m f114343d;

    public WebLifecycleMixins$registerInForeground$2(C43924m mVar, Class cls, C69626l lVar, C69626l lVar2) {
        this.f114343d = mVar;
        this.f114340a = cls;
        this.f114341b = lVar;
        this.f114342c = lVar2;
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        C43901i iVar = this.f114343d.f114399a;
        Class cls = this.f114340a;
        C69626l lVar = this.f114341b;
        C69626l lVar2 = this.f114342c;
        C43900h a = iVar.mo46907a(cls);
        if (a == null) {
            a = new C43900h(cls);
            iVar.f114364b.put(cls, a);
        }
        a.f114359b = lVar;
        a.f114360c = lVar2;
        a.mo46906a((C43892g) iVar.f114363a.mo46769c());
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        C43900h a = this.f114343d.f114399a.mo46907a(this.f114340a);
        if (a != null) {
            a.mo46906a((C43892g) null);
            a.f114359b = null;
            a.f114360c = null;
        }
    }
}
