package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.app.Dialog;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10279x;
import com.google.android.apps.gsa.assistant.shared.appactions.C73834z;
import com.google.android.apps.gsa.assistant.shared.appactions.ShortcutConfirmationLayout;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28427h;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.bi */
/* compiled from: PG */
final class C10233bi implements C73834z {

    /* renamed from: a */
    final /* synthetic */ C10234bj f34713a;

    public C10233bi(C10234bj bjVar) {
        this.f34713a = bjVar;
    }

    /* renamed from: a */
    public final void mo18363a(boolean z) {
        if (this.f34713a.f34722i.mo79746e(C90019by.f248088v)) {
            Dialog dialog = this.f34713a.f34715b.getDialog();
            dialog.getClass();
            boolean z2 = !z;
            dialog.setCanceledOnTouchOutside(z2);
            Dialog dialog2 = this.f34713a.f34715b.getDialog();
            dialog2.getClass();
            dialog2.setCancelable(z2);
            ((ShortcutConfirmationLayout) ((View) this.f34713a.f34723j.get()).findViewById(R.id.shortcut_confirmation_layout)).findViewById(R.id.loading_ui).setVisibility(true != z ? 8 : 0);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18364b(View view) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18365c(View view) {
    }

    /* renamed from: d */
    public final void mo18366d(View view) {
        mo18363a(true);
        this.f34713a.f34718e.mo18354a(view);
        this.f34713a.f34719f.mo65296c(C89849ae.APP_ACTIONS_SETTINGS_UNDO_CLICKED);
        C10279x xVar = this.f34713a.f34716c.f34812c;
        if (xVar == null) {
            xVar = C10279x.f34833d;
        }
        if ((xVar.f34835a & 2) != 0) {
            C10234bj bjVar = this.f34713a;
            new C90873ag(bjVar.f34717d.mo28210j(bjVar.f34720g.mo18425g(xVar.f34836b, xVar.f34837c), "Send undo request", new C10232bh(this)), this.f34713a.f34717d, "Handle undo", new C10230bf(this)).mo85223a(new C10231bg(this));
        }
    }

    /* renamed from: e */
    public final void mo18367e(View view) {
        this.f34713a.f34721h.f76997b.mo33800a(C28427h.m53115a(107083)).mo33811d(view);
    }
}
