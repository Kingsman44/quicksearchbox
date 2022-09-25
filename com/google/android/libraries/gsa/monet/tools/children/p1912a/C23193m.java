package com.google.android.libraries.gsa.monet.tools.children.p1912a;

import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23089c;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23253c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.a.m */
/* compiled from: PG */
public final class C23193m implements C23253c {

    /* renamed from: a */
    public final C23052c f63602a;

    /* renamed from: b */
    public final ArrayList f63603b = new ArrayList();

    /* renamed from: c */
    public List f63604c;

    /* renamed from: d */
    public int f63605d = 0;

    /* renamed from: e */
    private final String f63606e;

    /* renamed from: f */
    private final Map f63607f = new HashMap();

    public C23193m(String str, C23052c cVar, boolean z) {
        this.f63606e = str;
        this.f63602a = cVar;
        cVar.mo28427o(new C23192l(this, cVar, str, z));
    }

    /* renamed from: a */
    public final void mo28647a(String str, ProtoParcelable protoParcelable) {
        mo28648b(str, protoParcelable, this.f63603b.size());
    }

    /* renamed from: b */
    public final void mo28648b(String str, ProtoParcelable protoParcelable, int i) {
        C23129y b = ((C23015k) this.f63602a).f63312g.f63391d.mo28576b(str);
        String str2 = this.f63606e;
        int i2 = this.f63605d;
        this.f63605d = i2 + 1;
        C23186f fVar = new C23186f(str2 + "_" + i2, this.f63602a, false);
        this.f63603b.add(i, fVar);
        fVar.mo28630k(new C23191k(this, fVar));
        fVar.mo28623d(b, protoParcelable);
        mo28654h();
        this.f63604c = null;
    }

    /* renamed from: c */
    public final void mo28649c(C23186f fVar) {
        C23056g a = fVar.mo28620a();
        a.getClass();
        this.f63607f.put(a, fVar);
    }

    /* renamed from: d */
    public final void mo28650d(int i, C23109a aVar) {
        ((C23186f) this.f63603b.get(i)).mo28626g(aVar);
    }

    /* renamed from: e */
    public final void mo28651e(C23109a aVar) {
        ArrayList arrayList = new ArrayList(this.f63603b);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C23186f) arrayList.get(i)).mo28626g(aVar);
        }
    }

    /* renamed from: f */
    public final void mo28652f() {
        ArrayList arrayList = this.f63603b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C23186f fVar = (C23186f) arrayList.get(i);
            fVar.mo28630k((C23181a) null);
            fVar.mo28627h();
        }
        this.f63603b.clear();
        this.f63607f.clear();
        mo28654h();
    }

    /* renamed from: g */
    public final void mo28653g(C23056g gVar) {
        C23186f fVar = (C23186f) this.f63607f.remove(gVar);
        if (fVar == null) {
            Log.w("CntrRepeatedChildMngr", "Trying to remove a child that does not belong to this child manager");
            return;
        }
        fVar.mo28630k((C23181a) null);
        this.f63603b.remove(fVar);
        fVar.mo28627h();
        mo28654h();
    }

    /* renamed from: h */
    public final void mo28654h() {
        C23088b a = C23089c.m43272a(this.f63603b, C23189i.f63593a);
        String str = this.f63606e;
        int i = this.f63605d;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("child_array", a);
        bundle2.putInt("counter", i);
        bundle.putBundle("REPEATED_CHILD_BUNDLE_".concat(str), bundle2);
        this.f63602a.mo28332B(bundle);
    }
}
