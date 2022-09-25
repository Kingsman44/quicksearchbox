package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.view.View;
import android.widget.Toast;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87845fs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87893hm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87896hp;
import com.google.android.apps.gsa.searchbox.p6960ui.C88704e;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.t */
/* compiled from: PG */
final class C88749t extends C88704e {

    /* renamed from: a */
    final /* synthetic */ C88750u f240086a;

    /* renamed from: b */
    private final String f240087b;

    /* renamed from: c */
    private final C88803an f240088c;

    /* renamed from: d */
    private final Suggestion f240089d;

    /* renamed from: e */
    private final int f240090e = 3;

    public C88749t(C88750u uVar, String str, C88803an anVar, int i) {
        this.f240086a = uVar;
        this.f240087b = str;
        this.f240088c = anVar;
        this.f240089d = anVar.mo82586t();
    }

    /* renamed from: a */
    public final void mo82426a(C87845fs fsVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C87893hm.f237772a);
        fsVar.mo58887l(r0);
        if (fsVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C87893hm.f237772a);
            fsVar.mo58887l(r02);
            Object l = fsVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            if (((C87896hp) obj).f237778b) {
                C88803an anVar = this.f240088c;
                if (anVar.mo82586t() == this.f240089d) {
                    ((View) anVar).setVisibility(8);
                }
                Toast.makeText(this.f240086a.f240093a, this.f240086a.f240093a.getResources().getString(R.string.suggest_toast_hide, new Object[]{this.f240087b}), 0).show();
                return;
            }
        }
        Toast.makeText(this.f240086a.f240093a, this.f240086a.f240093a.getResources().getString(R.string.suggest_toast_hide_fail, new Object[]{this.f240087b}), 0).show();
    }
}
