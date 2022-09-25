package com.google.android.libraries.play.unison.binding;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.p060c.C0984n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.play.unison.binding.s */
/* compiled from: PG */
public abstract class C31993s extends C31976b {

    /* renamed from: b */
    public final Bundle f85992b;

    /* renamed from: c */
    private final C0984n f85993c = new C0984n(0);

    /* renamed from: d */
    private final C31992r f85994d = new C31992r(this);

    /* renamed from: e */
    private boolean f85995e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C31993s(android.view.View r3) {
        /*
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.libraries.play.unison.binding.q r1 = new com.google.android.libraries.play.unison.binding.q
            r1.<init>(r0)
            r2.<init>(r3, r1)
            r2.f85992b = r0
            androidx.c.n r3 = new androidx.c.n
            r0 = 0
            r3.<init>(r0)
            r2.f85993c = r3
            com.google.android.libraries.play.unison.binding.r r3 = new com.google.android.libraries.play.unison.binding.r
            r3.<init>(r2)
            r2.f85994d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.play.unison.binding.C31993s.<init>(android.view.View):void");
    }

    /* renamed from: m */
    public static /* synthetic */ void m59595m(C31993s sVar, C31978d dVar) {
        int i = sVar.f85993c.f3122d;
        C69664n.m101061g(dVar, "childBindable");
        if (!C31994t.m59603a(dVar.f85977f, sVar.f85977f)) {
            throw new IllegalArgumentException("childBindable.itemView() must be a descendant of the composite item view");
        } else if (!sVar.f85993c.containsKey(dVar)) {
            String str = i + dVar.getClass().getName();
            if (!sVar.f85993c.containsValue(str)) {
                sVar.f85993c.put(dVar, str);
                return;
            }
            throw new IllegalArgumentException("index already used");
        } else {
            throw new IllegalArgumentException("childBindable already added");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37735a(Object obj, C31989o oVar) {
        C69664n.m101061g(obj, "viewData");
        Parcelable parcelable = ((C31987m) oVar).f85986b;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(getClass().getClassLoader());
            this.f85992b.putAll(bundle);
        }
        this.f85995e = true;
        C31992r rVar = this.f85994d;
        rVar.f85990a = oVar;
        try {
            mo37761c(obj, rVar);
        } finally {
            this.f85994d.f85990a = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37736b() {
        mo37762d();
        this.f85995e = false;
        int i = this.f85993c.f3122d;
        for (int i2 = 0; i2 < i; i2++) {
            C31951a.m59536b((C31978d) this.f85993c.mo3702e(i2));
        }
        this.f85992b.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo37761c(Object obj, C31989o oVar);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo37762d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo37737i(C31983i iVar) {
        C69664n.m101061g(this.f85994d, "saver");
        int i = this.f85993c.f3122d;
        for (int i2 = 0; i2 < i; i2++) {
            C31951a.m59535a((C31978d) this.f85993c.mo3702e(i2));
        }
        iVar.mo37743a(new Bundle(this.f85992b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo37763k(C31978d dVar) {
        C69664n.m101061g(dVar, "childBindable");
        m59595m(this, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo37764l(C31978d dVar, Object obj) {
        C69664n.m101061g(dVar, "childBindable");
        if (this.f85995e) {
            Object obj2 = this.f85993c.get(dVar);
            if (obj2 != null) {
                mo37742e(dVar, obj, (String) obj2);
                return;
            }
            throw new IllegalArgumentException("addChild() not called for this childBindable");
        }
        throw new IllegalStateException("bindChild unavailable when CompositeBindable is not bound");
    }
}
