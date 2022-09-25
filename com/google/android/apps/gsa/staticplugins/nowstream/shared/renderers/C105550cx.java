package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.graphics.Rect;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91820a;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105408p;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105446p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p579ar.sceneviewer.common.C10678R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.cx */
/* compiled from: PG */
public final class C105550cx extends C22939d implements C90315c {

    /* renamed from: a */
    public final C105408p f294474a;

    /* renamed from: b */
    private final Context f294475b;

    /* renamed from: c */
    private final C105446p f294476c;

    /* renamed from: d */
    private final C91820a f294477d;

    /* renamed from: e */
    private final C90314b f294478e;

    /* renamed from: f */
    private C58833ax f294479f = C58836b.f156633a;

    public C105550cx(C22945j jVar, C105446p pVar, C105408p pVar2, Context context, C91820a aVar, C90314b bVar) {
        super(jVar);
        this.f294475b = new ContextThemeWrapper(context, C10678R.style.Theme_GoogleMaterial_DayNight);
        this.f294476c = pVar;
        this.f294477d = aVar;
        this.f294478e = bVar;
        this.f294474a = pVar2;
    }

    /* renamed from: a */
    public final void mo83996a(Rect rect) {
        C58976aa aaVar = C58975e.f156826a;
        this.f294479f = C58833ax.m90834k(Integer.valueOf(rect.bottom));
        mo94877e();
    }

    /* renamed from: e */
    public final void mo94877e() {
        if (!this.f63126Q.mo28316z()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (!((Boolean) ((C105586ef) this.f294476c).f294597a.f63720e).booleanValue() || this.f294479f.mo56113h()) {
            View il = mo28297il();
            if (il.getWidth() != 0) {
                int[] iArr = new int[2];
                mo28297il().getLocationOnScreen(iArr);
                int i = iArr[1];
                if (i == 0) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    return;
                }
                int i2 = 0;
                int intValue = ((Boolean) ((C105586ef) this.f294476c).f294597a.f63720e).booleanValue() ? ((Integer) this.f294479f.mo56107c()).intValue() : 0;
                int i3 = true != ((Boolean) ((C105586ef) this.f294476c).f294600d.f63720e).booleanValue() ? intValue : 0;
                if (((LinearLayoutManager) this.f294477d.mo86290o()).findFirstCompletelyVisibleItemPosition() == 0) {
                    int[] iArr2 = new int[2];
                    this.f294477d.mo86292q(iArr2);
                    int i4 = iArr2[1] + this.f294477d.mo86285i();
                    if (i < i4) {
                        i2 = Math.max(0, (i4 - (i + il.findViewById(R.id.wrapper).getHeight())) - intValue);
                    }
                }
                if (i2 != il.getPaddingTop() || i3 != il.getPaddingBottom()) {
                    C58976aa aaVar3 = C58975e.f156826a;
                    il.setPadding(il.getPaddingLeft(), i2, il.getPaddingRight(), i3);
                    return;
                }
                return;
            }
            C58976aa aaVar4 = C58975e.f156826a;
        } else {
            C58976aa aaVar5 = C58975e.f156826a;
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        C58976aa aaVar = C58975e.f156826a;
        this.f294478e.mo83995b(this);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        View inflate = LayoutInflater.from(this.f294475b).inflate(R.layout.publication_judiciaire_footer, (ViewGroup) null);
        mo28295iC(inflate);
        View findViewById = inflate.findViewById(R.id.wrapper);
        C28292j jVar = new C28292j(86756);
        jVar.mo33795i(5);
        C28295m.m52919e(findViewById, jVar);
        findViewById.setOnClickListener(new C105547cu(this));
        ((C105586ef) this.f294476c).f294598b.mo28726b(new C105548cv((TextView) inflate.findViewById(R.id.footer_text_header)));
        ((C105586ef) this.f294476c).f294599c.mo28726b(new C105549cw((TextView) inflate.findViewById(R.id.footer_text_link)));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C58976aa aaVar = C58975e.f156826a;
        if (((Boolean) ((C105586ef) this.f294476c).f294597a.f63720e).booleanValue()) {
            this.f294478e.mo83994a(this);
        }
        View il = mo28297il();
        il.post(new C105546ct(this));
        C89949q.m146521e(C28285c.m52874a(il.findViewById(R.id.wrapper), 86757), false);
    }
}
