package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.app.FragmentManager;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.android.p256b.C5033s;
import com.android.recurrencepicker.C5485i;
import com.android.recurrencepicker.C5487k;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.df */
/* compiled from: PG */
public final class C93609df extends C93555bf {
    public C93609df(Context context, byte[] bArr) {
        super(context, (AttributeSet) null, 0, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87734a() {
        this.f261451q.mo87961i(this.f261447m, "recurrencepicker_tag");
    }

    /* renamed from: f */
    public final void mo87732f() {
        String str;
        C5485i iVar;
        super.mo87732f();
        RecurrenceArgument recurrenceArgument = (RecurrenceArgument) this.f261447m;
        C5033s sVar = (C5033s) recurrenceArgument.f236203n;
        Resources resources = getResources();
        if (sVar != null) {
            if (((RecurrenceArgument) this.f261447m).mo81327O()) {
                str = C5487k.m14199b(sVar, resources);
            } else {
                str = C5487k.m14198a(getResources(), sVar);
            }
            if (str == null) {
                str = resources.getString(R.string.custom);
            }
        } else {
            str = resources.getString(R.string.none);
        }
        mo87970x(str);
        FragmentManager c = this.f261451q.mo87959c();
        if (c != null && (iVar = (C5485i) c.findFragmentByTag("recurrencepicker_tag")) != null) {
            iVar.f16626a.f16587k = new C93608de(recurrenceArgument);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo87952k() {
        return false;
    }

    /* renamed from: y */
    public final boolean mo87917y() {
        return !mo88130s() || ((RecurrenceArgument) this.f261447m).mo81263C();
    }

    public C93609df(Context context) {
        super(context, (AttributeSet) null, 0, true);
    }
}
