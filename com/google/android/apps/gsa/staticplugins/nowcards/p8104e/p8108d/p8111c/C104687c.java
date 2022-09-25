package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8111c;

import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.p6884y.C87379h;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91430l;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91713a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.c.c */
/* compiled from: PG */
public final class C104687c {

    /* renamed from: d */
    private static final C59071e f291518d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.e.d.c.c");

    /* renamed from: a */
    public final C91713a f291519a;

    /* renamed from: b */
    public final C91430l f291520b;

    /* renamed from: c */
    public final C22871g f291521c;

    /* renamed from: e */
    private final C87379h f291522e;

    /* renamed from: f */
    private final C23052c f291523f;

    /* renamed from: g */
    private final int f291524g;

    public C104687c(C87379h hVar, C91713a aVar, C22871g gVar, C23052c cVar, C91430l lVar) {
        this.f291522e = hVar;
        this.f291519a = aVar;
        this.f291521c = gVar;
        this.f291523f = cVar;
        this.f291520b = lVar;
        this.f291524g = Math.abs((short) ((int) lVar.mo86358b()));
    }

    /* renamed from: a */
    public final void mo94295a() {
        this.f291522e.mo81039g(this.f291523f, this.f291524g, new C104686b(this));
    }

    /* renamed from: b */
    public final boolean mo94296b(String str, Parcelable parcelable) {
        if (!"EVENT_START_ACTIVITY_FOR_RESULT".equals(str)) {
            return false;
        }
        if (!(parcelable instanceof Intent)) {
            C59104x c = f291518d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SAForResultUtil");
            ((C59052c) ((C59052c) c).mo56372aa(22033)).mo56386p("Unable to start activity, intent not specified.");
            return false;
        }
        this.f291522e.mo81040h((Intent) parcelable, this.f291524g);
        return true;
    }
}
