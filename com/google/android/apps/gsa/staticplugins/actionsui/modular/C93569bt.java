package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.AdapterView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.android.apps.gsa.shared.util.p7187ui.C91116o;
import com.google.android.apps.gsa.sidekick.main.p7227s.C91614c;
import com.google.android.apps.gsa.sidekick.main.p7227s.C91619h;
import com.google.android.googlequicksearchbox.R;
import com.google.p4152bb.p4153a.C55001ce;
import com.google.p4152bb.p4153a.C55003cg;
import com.google.p4152bb.p4153a.C55106gb;
import com.google.p4152bb.p4153a.C55108gd;
import com.google.p4152bb.p4153a.C55112gh;
import com.google.p4152bb.p4153a.C55114gj;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bt */
/* compiled from: PG */
public final class C93569bt extends C93555bf {

    /* renamed from: a */
    public final C93650g f261260a = new C93650g(getContext(), new ArrayList());

    /* renamed from: w */
    private final C91116o f261261w = new C91116o(getContext().getResources().getStringArray(R.array.edit_reminder_location)[2], (String) null, (Object) null, true);

    /* renamed from: x */
    private final AdapterView.OnItemClickListener f261262x = new C93568bs(this);

    public C93569bt(Context context, boolean z) {
        super(context, (AttributeSet) null, 0, z);
    }

    /* renamed from: E */
    private final Pair m154332E(C55112gh ghVar) {
        String str = ghVar.f145021c;
        String str2 = ghVar.f145028j;
        if ((ghVar.f145020b & 2) != 0) {
            C55003cg cgVar = ghVar.f145030l;
            if (cgVar == null) {
                cgVar = C55003cg.f144710c;
            }
            int a = C55001ce.m87556a(cgVar.f144713b);
            if (a == 0) {
                a = 1;
            }
            if (a - 1 != 0) {
                str = getContext().getResources().getStringArray(R.array.edit_reminder_location)[1];
            } else {
                str = getContext().getResources().getStringArray(R.array.edit_reminder_location)[0];
            }
        }
        int i = ghVar.f145020b;
        if ((i & 16) != 0) {
            C55108gd gdVar = ghVar.f145032n;
            if (gdVar == null) {
                gdVar = C55108gd.f145008d;
            }
            str = gdVar.f145012c;
            str2 = getContext().getString(R.string.all_chain_locations);
        } else if ((i & 32) != 0) {
            C55106gb gbVar = ghVar.f145033o;
            if (gbVar == null) {
                gbVar = C55106gb.f145002e;
            }
            str = gbVar.f145006c;
            C55106gb gbVar2 = ghVar.f145033o;
            if (gbVar2 == null) {
                gbVar2 = C55106gb.f145002e;
            }
            str2 = gbVar2.f145007d;
        }
        String str3 = null;
        if (true == str.equals(str2)) {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str3 = str2;
        } else {
            str = str2;
        }
        return new Pair(str, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87734a() {
        if (!((LocationArgument) this.f261447m).mo81311M()) {
            this.f261451q.mo87961i(this.f261447m, "locationpicker_tag");
        } else {
            mo87968v(this.f261260a, this.f261262x);
        }
    }

    /* renamed from: b */
    public final void mo87962b() {
        C55003cg cgVar = ((LocationArgument) this.f261447m).mo81312g().f145030l;
        if (cgVar == null) {
            cgVar = C55003cg.f144710c;
        }
        int a = C55001ce.m87556a(cgVar.f144713b);
        if (a == 0) {
            a = 1;
        }
        this.f261451q.mo87960d(C91614c.m149881a(C93570bu.m154337a("edit_place_location_tag", this.f261451q, getContext(), (C91619h) null), (String) null, a + -1 != 0 ? R.string.edit_reminder_set_work_location : R.string.edit_reminder_set_home_location), "locationpicker_tag");
    }

    /* renamed from: f */
    public final void mo87732f() {
        super.mo87732f();
        LocationArgument locationArgument = (LocationArgument) this.f261447m;
        if (locationArgument.mo81311M()) {
            ArrayList arrayList = new ArrayList();
            C55114gj gjVar = ((LocationArgument) this.f261447m).f236189i;
            if (gjVar != null) {
                for (C55112gh ghVar : gjVar.f145037b) {
                    Pair E = m154332E(ghVar);
                    arrayList.add(new C91116o((String) E.first, (String) E.second, ghVar, false));
                }
            }
            arrayList.add(this.f261261w);
            this.f261260a.mo88083e();
            this.f261260a.f261380a.addAll(arrayList);
            C55112gh g = ((LocationArgument) this.f261447m).mo81312g();
            if (g != null) {
                Pair E2 = m154332E(g);
                mo87970x((CharSequence) E2.first);
                mo87969w((CharSequence) E2.second);
                if (gjVar != null && gjVar.f145037b.size() != 0) {
                    int indexOf = gjVar.f145037b.indexOf(g);
                    if (indexOf != -1) {
                        this.f261260a.f261383d = indexOf;
                    } else {
                        this.f261260a.f261383d = -1;
                    }
                }
            }
        } else if (locationArgument.mo81263C()) {
            Pair E3 = m154332E(locationArgument.mo81312g());
            mo87970x((CharSequence) E3.first);
            mo87969w(!TextUtils.isEmpty((CharSequence) E3.second) ? (CharSequence) E3.second : BuildConfig.FLAVOR);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo87952k() {
        return ((LocationArgument) this.f261447m).mo81311M();
    }
}
