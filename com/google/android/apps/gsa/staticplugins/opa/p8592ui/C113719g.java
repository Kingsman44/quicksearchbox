package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.widget.Button;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assist.p506e.C9409b;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.g */
/* compiled from: PG */
public final class C113719g extends C0260w {

    /* renamed from: a */
    public C9388a f314943a;

    /* renamed from: b */
    public C9409b f314944b;

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog create = new AlertDialog.Builder(getContext()).setTitle(R.string.permission_screen_context_alert_title).setMessage(R.string.permission_screen_context_alert_message).create();
        create.setButton(-1, getResources().getString(R.string.common_yes), new C113717e(this, create));
        create.setButton(-2, getResources().getString(R.string.cancel), new C113718f(create));
        create.show();
        Button button = create.getButton(-1);
        C28292j jVar = new C28292j(94846);
        jVar.mo33795i(5);
        jVar.mo33794h(1);
        C28295m.m52919e(button, jVar);
        Button button2 = create.getButton(-2);
        C28292j jVar2 = new C28292j(94877);
        jVar2.mo33795i(5);
        jVar2.mo33794h(1);
        C28295m.m52919e(button2, jVar2);
        C89949q.m146521e(C28285c.m52875b(C28293k.m52908e(new C28292j(97038), C28295m.m52916b(create.getButton(-1)), C28295m.m52916b(create.getButton(-2))), 97032), false);
        return create;
    }
}
