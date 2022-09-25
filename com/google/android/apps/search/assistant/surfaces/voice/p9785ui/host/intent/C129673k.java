package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent;

import android.os.Binder;
import android.os.Parcel;
import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.NavigatorArgs$Transition;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129629h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129630i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.C69788q;
import p5462h.p5463a.C69531o;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.k */
/* compiled from: PG */
final class C129673k extends Binder {

    /* renamed from: a */
    private C129630i f355887a;

    public C129673k(C129630i iVar) {
        this.f355887a = iVar;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C69788q qVar;
        C69664n.m101061g(parcel, "data");
        C129671i[] values = C129671i.values();
        C69664n.m101061g(values, "<this>");
        C129671i iVar = (i < 0 || i > C69531o.m100931h(values)) ? null : values[i];
        if (iVar == null) {
            return true;
        }
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            C129630i iVar2 = this.f355887a;
            if (iVar2 != null) {
                C129672j jVar = new C129672j(parcel);
                C129636o oVar = iVar2.f355763a;
                oVar.mo109147o(C71803m.m105043d(oVar.f355793m, (C69585o) null, (C71424ay) null, new C129629h(oVar, jVar, iVar2.f355764b, (C69577g) null), 3));
                qVar = C69788q.f186170a;
            } else {
                qVar = null;
            }
            if (qVar == null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeParcelable(NavigatorArgs$Transition.Data.NoData.f355869a, 0);
                C69664n.m101060f(obtain, "obtain().apply { writePa…nsition.Data.NoData, 0) }");
                parcel.readStrongBinder().transact(0, obtain, (Parcel) null, 0);
            }
        } else if (ordinal == 1) {
            C129630i iVar3 = this.f355887a;
            if (iVar3 != null) {
                C129636o oVar2 = iVar3.f355763a;
                oVar2.mo109140f();
                View requireView = oVar2.f355783c.requireView();
                C69664n.m101060f(requireView, "fragment.requireView()");
                C129636o.m211665s(requireView).setAlpha(0.0f);
                iVar3.f355763a.f355787g.mo109082c();
            }
            this.f355887a = null;
        } else if (ordinal == 2) {
            this.f355887a = null;
        }
        return true;
    }

    public final String toString() {
        String binder = super.toString();
        C129630i iVar = this.f355887a;
        return binder + "_sc=" + iVar;
    }
}
