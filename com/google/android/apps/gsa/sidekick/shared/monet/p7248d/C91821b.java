package com.google.android.apps.gsa.sidekick.shared.monet.p7248d;

import android.support.p033v7.widget.C0653fo;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.d.b */
/* compiled from: PG */
public final class C91821b implements C91820a {

    /* renamed from: b */
    private static final C59071e f256085b = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.monet.d.b");

    /* renamed from: a */
    public C91820a f256086a;

    /* renamed from: a */
    public final void mo86297a(C91820a aVar) {
        if (aVar == null && this.f256086a == null) {
            ((C59052c) ((C59052c) f256085b.mo56226d()).mo56372aa(11914)).mo56386p("Clearing owner when already cleared");
            int i = C90755l.f253831a;
        } else if (aVar == null || this.f256086a == null) {
            this.f256086a = aVar;
        } else {
            ((C59052c) ((C59052c) f256085b.mo56226d()).mo56372aa(11913)).mo56386p("Trying to set the RecyclerView owner before clearing it.");
            int i2 = C90755l.f253831a;
        }
    }

    /* renamed from: jl */
    public final void mo86287jl(String str) {
        C91820a aVar = this.f256086a;
        if (aVar != null) {
            aVar.mo86287jl(str);
        } else {
            ((C59052c) ((C59052c) f256085b.mo56226d()).mo56372aa(11911)).mo56386p("Trying to scroll to Monet ID before recycler View Owner is set.");
        }
    }

    /* renamed from: t */
    public final void mo86293t() {
        C91820a aVar = this.f256086a;
        if (aVar != null) {
            aVar.mo86293t();
        } else {
            ((C59052c) ((C59052c) f256085b.mo56226d()).mo56372aa(11912)).mo56386p("Trying to scroll to top before recycler View Owner is set.");
        }
    }

    /* renamed from: u */
    public final void mo86294u() {
        throw null;
    }

    /* renamed from: v */
    public final boolean mo86295v() {
        return this.f256086a != null;
    }

    /* renamed from: i */
    public final int mo86285i() {
        C91820a aVar = this.f256086a;
        aVar.getClass();
        return aVar.mo86285i();
    }

    /* renamed from: jg */
    public final int mo86286jg() {
        C91820a aVar = this.f256086a;
        aVar.getClass();
        return aVar.mo86286jg();
    }

    /* renamed from: l */
    public final int mo86288l() {
        C91820a aVar = this.f256086a;
        aVar.getClass();
        return aVar.mo86288l();
    }

    /* renamed from: m */
    public final int mo86289m() {
        C91820a aVar = this.f256086a;
        aVar.getClass();
        return aVar.mo86289m();
    }

    /* renamed from: o */
    public final C0653fo mo86290o() {
        C91820a aVar = this.f256086a;
        aVar.getClass();
        return aVar.mo86290o();
    }

    /* renamed from: p */
    public final String mo86291p() {
        C91820a aVar = this.f256086a;
        aVar.getClass();
        return aVar.mo86291p();
    }

    /* renamed from: q */
    public final void mo86292q(int[] iArr) {
        C91820a aVar = this.f256086a;
        aVar.getClass();
        aVar.mo86292q(iArr);
    }

    /* renamed from: w */
    public final boolean mo86296w() {
        C91820a aVar = this.f256086a;
        aVar.getClass();
        return aVar.mo86296w();
    }
}
