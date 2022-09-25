package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.shared.p7148ui.C90638an;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.ai */
/* compiled from: PG */
public final class C93442ai extends C93507m {
    public C93442ai(Context context) {
        super(context, "EscapeHatchCard");
        C89941l.m146512c(this, 8439);
    }

    /* renamed from: t */
    public final View mo87752t(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.escape_hatch_action_button, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.button);
        C89941l.m146512c(findViewById, 8438);
        findViewById.setOnClickListener(new C93441ah(this));
        C90638an anVar = new C90638an(0);
        anVar.f253489r = 2;
        anVar.f253473b = false;
        anVar.f253474c = false;
        anVar.f253476e = true;
        anVar.f253487p = 300;
        setLayoutParams(anVar);
        return inflate;
    }
}
