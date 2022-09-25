package com.google.android.libraries.assistant.auto.tng.morris.p1096h;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.h.k */
/* compiled from: PG */
public final class C15383k {

    /* renamed from: a */
    private static final C59071e f46164a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.h.k");

    /* renamed from: b */
    private final Context f46165b;

    /* renamed from: c */
    private final C86124t f46166c;

    /* renamed from: d */
    private final Optional f46167d = Optional.empty();

    public C15383k(Context context, C86124t tVar) {
        this.f46165b = context;
        this.f46166c = tVar;
    }

    /* renamed from: a */
    public final int mo22275a() {
        int identifier = this.f46165b.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return this.f46165b.getResources().getDimensionPixelSize(identifier);
        }
        C59104x d = f46164a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.NavBarSettings");
        ((C59052c) ((C59052c) d).mo56372aa(46114)).mo56386p("Failed to get navigation bar height resource id.");
        return -1;
    }

    /* renamed from: b */
    public final boolean mo22276b() {
        if (this.f46167d.isPresent()) {
            return ((Boolean) this.f46167d.get()).booleanValue();
        }
        int identifier = this.f46165b.getResources().getIdentifier("config_navBarInteractionMode", "integer", "android");
        if (identifier != 0) {
            int integer = this.f46165b.getResources().getInteger(identifier);
            C58976aa aaVar = C58975e.f156826a;
            return integer == 2 || integer == 3;
        }
        C59104x d = f46164a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.NavBarSettings");
        ((C59052c) ((C59052c) d).mo56372aa(46115)).mo56386p("Failed to get navigation mode resource id.");
        return mo22275a() != -1 && ((long) ((int) (((float) mo22275a()) / this.f46165b.getResources().getDisplayMetrics().density))) < this.f46166c.mo79743a(C90051dc.f248886bo);
    }
}
