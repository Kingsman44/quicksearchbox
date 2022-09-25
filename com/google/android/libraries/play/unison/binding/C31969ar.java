package com.google.android.libraries.play.unison.binding;

import android.os.Parcelable;
import android.support.p033v7.p040e.C0429k;
import android.support.p033v7.p040e.C0430l;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.RecyclerView;
import android.util.SparseArray;
import com.google.android.apps.search.podcasts.p10600q.C140946e;
import com.google.android.apps.search.podcasts.p10600q.C140947f;
import com.google.common.base.C58838bb;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.play.unison.binding.ar */
/* compiled from: PG */
public final class C31969ar extends C31957af {

    /* renamed from: e */
    public static final Object f85961e = new C31961aj();

    /* renamed from: j */
    public static final C31998x f85962j = C31960ai.f85945a;

    /* renamed from: k */
    private final C31967ap f85963k;

    /* renamed from: l */
    private final C31964am f85964l;

    /* renamed from: m */
    private final SparseArray f85965m = new SparseArray();

    public C31969ar(RecyclerView recyclerView, C31958ag agVar, C31995u uVar, C31998x xVar, C31998x xVar2, C31958ag agVar2) {
        super(recyclerView, agVar, uVar);
        this.f85963k = new C31967ap(this, xVar, xVar2, agVar2);
        C31964am amVar = new C31964am();
        this.f85964l = amVar;
        recyclerView.setAdapter(amVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo37735a(Object obj, C31989o oVar) {
        C140946e eVar = (C140946e) obj;
        C31967ap apVar = this.f85963k;
        C140946e eVar2 = apVar.f85958i;
        boolean b = apVar.f85954e.mo37726b();
        boolean b2 = apVar.f85957h.f85974a.mo37760b(apVar.f85950a.mo37730a(apVar));
        C31969ar arVar = apVar.f85957h;
        C31998x xVar = apVar.f85951b;
        C31955ad c = arVar.mo37728c(apVar.f85952c, eVar);
        boolean b3 = c.mo37726b();
        apVar.f85954e = c;
        apVar.f85958i = eVar;
        C0430l lVar = apVar.f85953d;
        if (eVar2 != null) {
            int size = eVar2.f382699a.size();
            int size2 = eVar.f382699a.size();
            if (b) {
                apVar.notifyItemRemoved(size);
            }
            boolean z = true;
            if (eVar != eVar2) {
                C0429k.m1383a(new C140947f(eVar2.f382699a, eVar.f382699a, eVar.f382700b), true).mo1398a(lVar);
            }
            int i = apVar.f85956g;
            if (size2 != i) {
                z = false;
            }
            C58838bb.m90888w(z, "After successful ListData.consumeListUpdates or with no change to the ListData instance, expected %s items, got %s items", i, size2);
            if (b2) {
                apVar.mObservable.mo2881c(0, size2, f85961e);
            }
            if (b3) {
                apVar.notifyItemInserted(size2);
            }
        } else {
            int b4 = apVar.mo37733b();
            C31955ad[] adVarArr = apVar.f85955f;
            if (adVarArr.length >= b4) {
                Arrays.fill(adVarArr, 0, apVar.f85956g, (Object) null);
            } else {
                apVar.f85955f = C31965an.m59555a(b4);
            }
            apVar.f85956g = b4;
            apVar.mObservable.mo2879a();
        }
        RecyclerView recyclerView = (RecyclerView) mo37744f();
        C0640fb fbVar = recyclerView.mAdapter;
        C31967ap apVar2 = this.f85963k;
        if (fbVar != apVar2) {
            recyclerView.setAdapter(apVar2);
            C31987m mVar = (C31987m) oVar;
            if (mVar.f85986b != null) {
                this.f85965m.put(recyclerView.getId(), mVar.f85986b);
                recyclerView.restoreHierarchyState(this.f85965m);
                this.f85965m.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37736b() {
        ((RecyclerView) mo37744f()).setAdapter(this.f85964l);
        C31967ap apVar = this.f85963k;
        apVar.f85958i = null;
        apVar.f85954e = C31953ab.f85936a;
        Arrays.fill(apVar.f85955f, 0, apVar.f85956g, (Object) null);
        apVar.f85956g = 0;
        this.f85974a.mo37760b((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo37737i(C31983i iVar) {
        RecyclerView recyclerView = (RecyclerView) mo37744f();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C31951a.m59535a(((C31968aq) recyclerView.getChildViewHolder(recyclerView.getChildAt(i))).f85960a.f85939a);
        }
        recyclerView.saveHierarchyState(this.f85965m);
        iVar.mo37743a((Parcelable) this.f85965m.get(recyclerView.getId()));
        this.f85965m.clear();
    }
}
