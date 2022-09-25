package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14738h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14145o;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14152v;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14291du;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28376al;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4816ai.p4818b.C63204j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.be */
/* compiled from: PG */
final class C15023be extends C0673gh implements View.OnClickListener, C14145o {

    /* renamed from: a */
    public final TextView f45038a;

    /* renamed from: b */
    public final ImageView f45039b;

    /* renamed from: c */
    public final ImageView f45040c;

    /* renamed from: d */
    public final ViewGroup f45041d;

    /* renamed from: e */
    public C63204j f45042e = null;

    /* renamed from: f */
    public final boolean f45043f;

    /* renamed from: g */
    public Optional f45044g;

    /* renamed from: h */
    final /* synthetic */ C15024bf f45045h;

    /* renamed from: i */
    private final C15014aw f45046i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15023be(C15024bf bfVar, ViewGroup viewGroup, C15014aw awVar, boolean z) {
        super(viewGroup);
        this.f45045h = bfVar;
        this.f45041d = viewGroup;
        this.f45039b = (ImageView) viewGroup.findViewById(R.id.media_album);
        this.f45038a = (TextView) viewGroup.findViewById(R.id.media_title);
        this.f45040c = (ImageView) viewGroup.findViewById(R.id.app_icon);
        this.f45046i = awVar;
        this.f45043f = z;
        this.f45044g = Optional.empty();
        viewGroup.setOnClickListener(new C14129bc(bfVar.f45047a, Optional.empty(), this));
    }

    /* renamed from: a */
    public final void mo21470a() {
        int i = true != ((Boolean) this.f45044g.map(C15022bd.f45037a).orElse(false)).booleanValue() ? 109863 : 149446;
        C63204j jVar = this.f45042e;
        if (jVar == null || jVar.equals(C63204j.f170749e)) {
            this.f45045h.f45047a.mo21444a(this.f45041d, i);
        } else {
            this.f45045h.f45047a.mo21445b(this.f45041d, i, new C28353e(C28376al.f77109a, this.f45042e));
        }
    }

    /* renamed from: b */
    public final void mo21471b() {
        this.f45045h.f45047a.mo21447d(this.f45041d);
    }

    public final void onClick(View view) {
        C15014aw awVar = this.f45046i;
        int absoluteAdapterPosition = getAbsoluteAdapterPosition();
        C58976aa aaVar = C58975e.f156826a;
        C14292dv dvVar = (C14292dv) awVar.f44995a.f45026u.get(absoluteAdapterPosition);
        int a = C14291du.m30597a(dvVar.f43250p);
        if (a != 0 && a == 6) {
            C14986h hVar = awVar.f44995a.f45006a;
            C14216b bVar = dvVar.f43239e;
            if (bVar == null) {
                bVar = C14216b.f43007f;
            }
            String str = bVar.f43011c;
            C14216b bVar2 = dvVar.f43239e;
            if (bVar2 == null) {
                bVar2 = C14216b.f43007f;
            }
            hVar.mo21875g(C14738h.m31025c(str, bVar2.f43012d));
            return;
        }
        C14152v vVar = awVar.f44995a.f45010e;
        C37252a c = C15346t.m31929c(dvVar);
        C14216b bVar3 = dvVar.f43239e;
        if (bVar3 == null) {
            bVar3 = C14216b.f43007f;
        }
        String str2 = bVar3.f43011c;
        C14216b bVar4 = dvVar.f43239e;
        if (bVar4 == null) {
            bVar4 = C14216b.f43007f;
        }
        vVar.mo21478c(c, str2, bVar4.f43012d);
        C15017az azVar = awVar.f44995a;
        azVar.f45006a.mo21875g(C14738h.m31026d((C14292dv) azVar.f45026u.get(absoluteAdapterPosition)));
    }
}
