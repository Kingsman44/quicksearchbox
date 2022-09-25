package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8133c.p8134a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7113e.C90320d;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91768d;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91821b;
import com.google.android.apps.gsa.sidekick.shared.monet.p7249e.C91822a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8130a.C105134e;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8131b.C105145f;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105457d;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8152d.C105459b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.C105474ab;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23306v;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C8142xb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.c.a.s */
/* compiled from: PG */
public final class C105173s extends C105474ab {

    /* renamed from: M */
    private final C105145f f293218M;

    /* renamed from: N */
    private ChildStub f293219N;

    /* renamed from: O */
    private View f293220O;

    /* renamed from: R */
    private ChildStub f293221R;

    /* renamed from: S */
    private final C58833ax f293222S;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105173s(C22945j jVar, C105145f fVar, Context context, C105134e eVar, C23306v vVar, C90314b bVar, C105457d dVar, C91821b bVar2, C91768d dVar2, C105419b bVar3, C90323a aVar, C91825b bVar4, C91728l lVar, C91822a aVar2, C90320d dVar3, C105459b bVar5, C90479a aVar3, C58833ax axVar) {
        super(jVar, context, fVar, eVar, false, vVar, bVar, dVar, bVar2, dVar2, bVar3, aVar, bVar4, lVar, aVar3, aVar2, dVar3, bVar5);
        this.f293218M = fVar;
        this.f293222S = axVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final View mo94593C() {
        View inflate = LayoutInflater.from(this.f294180a).inflate(R.layout.second_screen_renderer, (ViewGroup) null, false);
        this.f293220O = inflate;
        this.f293219N = (ChildStub) inflate.findViewById(R.id.header);
        this.f293221R = (ChildStub) this.f293220O.findViewById(R.id.recycler_view_stub);
        this.f293221R.mo28718c(super.mo94593C());
        RecyclerView recyclerView = this.f294209q;
        recyclerView.setClipToPadding(false);
        C91115n.m148874f(recyclerView, 0, this.f294180a.getResources().getDimensionPixelOffset(R.dimen.header_padding));
        C91115n.m148874f(recyclerView, 1, this.f294180a.getResources().getDimensionPixelOffset(R.dimen.bottom_padding));
        return this.f293220O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final ViewGroup mo94594D() {
        return (ViewGroup) this.f293220O;
    }

    /* renamed from: E */
    public final C8142xb mo94595E() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo94596F(boolean z) {
        super.mo94596F(z);
        if (this.f293222S.mo56113h()) {
            Window window = ((Activity) this.f293222S.mo56107c()).getWindow();
            if (z) {
                window.getDecorView().setBackgroundDrawable(new ColorDrawable(this.f294180a.getResources().getColor(R.color.background_dark_color)));
                return;
            }
            window.setStatusBarColor(-1);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        super.mo28299iw();
        C105419b bVar = this.f294196d;
        bVar.f294039f = 1;
        bVar.mo94780b();
        ((C105167m) this.f293218M).f293182b.mo28685c(new C23243a(this.f293219N));
        ((C105167m) this.f293218M).f293181a.mo28685c(new C105172r(this, this.f293220O));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        super.mo28300ix();
        mo94596F(((Boolean) ((C105167m) this.f293218M).f293183c.f63720e).booleanValue());
    }

    /* renamed from: n */
    public final C23108e mo28302n() {
        return C105170p.f293215a;
    }
}
