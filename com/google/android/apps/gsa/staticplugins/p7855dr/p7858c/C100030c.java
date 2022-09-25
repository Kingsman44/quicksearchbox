package com.google.android.apps.gsa.staticplugins.p7855dr.p7858c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C100005d;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C100008g;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C100023v;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C99997ae;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C99999ag;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.c.c */
/* compiled from: PG */
public final class C100030c implements C23113i {

    /* renamed from: a */
    private final C100028a f279760a;

    public C100030c(C100028a aVar) {
        this.f279760a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SrpContentEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onResultsRendered")) {
                C100023v vVar = (C100023v) this.f279760a;
                C99997ae aeVar = vVar.f279740o;
                if (aeVar != null) {
                    C99999ag agVar = aeVar.f279664a;
                    C23109a aVar = aeVar.f279665b;
                    if (!((C100005d) agVar.f279667a).f279697f.mo28631l()) {
                        ((C100005d) agVar.f279667a).f279697f.mo28623d(new C23129y("doodlestatic", "TYPE_SRP_DOODLE_HEADER"), ProtoParcelable.f63423a);
                        ((C100005d) agVar.f279667a).f279697f.mo28626g(aVar);
                    }
                }
                vVar.f279729d.mo28213m("triggerBottomDialogCards", 500, new C100008g(vVar));
            } else if (str.equals("storeScrollPosition_int")) {
                ((C23251a) ((C100023v) this.f279760a).f279727b.mo91705f()).mo28730f(Integer.valueOf(Integer.valueOf(pVar.f63472a.getInt("scrollY")).intValue()), false);
            }
        }
    }
}
