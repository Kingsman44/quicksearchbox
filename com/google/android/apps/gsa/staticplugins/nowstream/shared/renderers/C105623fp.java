package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.sidekick.shared.snackbar.Snackbar;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fp */
/* compiled from: PG */
public final /* synthetic */ class C105623fp implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105625fr f294694a;

    public /* synthetic */ C105623fp(C105625fr frVar) {
        this.f294694a = frVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105625fr frVar = this.f294694a;
        if (((Boolean) obj).booleanValue()) {
            Snackbar snackbar = frVar.f294700d;
            String str = (String) ((C23249a) frVar.f294697a.mo94655e()).mo28725a();
            if (!TextUtils.isEmpty(str)) {
                snackbar.f256330a.setText(str);
                snackbar.f256332c = false;
            }
            C58833ax axVar = (C58833ax) ((C23249a) frVar.f294697a.mo94652b()).mo28725a();
            if (axVar.mo56113h()) {
                frVar.f294700d.mo86576a((String) axVar.mo56107c(), frVar.f294702f);
            } else {
                frVar.f294700d.mo86576a(BuildConfig.FLAVOR, frVar.f294702f);
            }
        }
    }
}
