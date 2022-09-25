package com.google.android.apps.gsa.search.shared.actions.util;

import android.content.res.Resources;
import com.google.android.googlequicksearchbox.R;
import com.google.p4152bb.p4153a.C55137hf;
import com.google.p4152bb.p4153a.C55138hg;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.util.h */
/* compiled from: PG */
public final class C87486h {
    /* renamed from: a */
    public static C55138hg m142002a(Resources resources) {
        C55137hf hfVar = (C55137hf) C55138hg.f145142g.createBuilder();
        String string = resources.getString(R.string.or_list_2);
        hfVar.copyOnWrite();
        C55138hg hgVar = (C55138hg) hfVar.instance;
        string.getClass();
        hgVar.f145144a |= 1;
        hgVar.f145145b = string;
        String string2 = resources.getString(R.string.or_list_start);
        hfVar.copyOnWrite();
        C55138hg hgVar2 = (C55138hg) hfVar.instance;
        string2.getClass();
        hgVar2.f145144a |= 4;
        hgVar2.f145146c = string2;
        String string3 = resources.getString(R.string.or_list_middle);
        hfVar.copyOnWrite();
        C55138hg hgVar3 = (C55138hg) hfVar.instance;
        string3.getClass();
        hgVar3.f145144a |= 16;
        hgVar3.f145147d = string3;
        String string4 = resources.getString(R.string.or_list_end);
        hfVar.copyOnWrite();
        C55138hg hgVar4 = (C55138hg) hfVar.instance;
        string4.getClass();
        hgVar4.f145144a |= 64;
        hgVar4.f145148e = string4;
        return (C55138hg) hfVar.build();
    }
}
