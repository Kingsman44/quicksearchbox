package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.p6884y.C87290c;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117089a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.b */
/* compiled from: PG */
public final class C117064b extends C23056g {

    /* renamed from: a */
    public C117052a f325017a;

    /* renamed from: b */
    private final C117089a f325018b;

    /* renamed from: c */
    private final Resources f325019c;

    /* renamed from: d */
    private final SharedPreferences f325020d;

    /* renamed from: e */
    private final C87290c f325021e;

    public C117064b(C23052c cVar, C117089a aVar, Context context, C87290c cVar2, SharedPreferences sharedPreferences) {
        super(cVar);
        this.f325018b = aVar;
        this.f325020d = sharedPreferences;
        this.f325021e = cVar2;
        this.f325019c = context.getResources();
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        if (!"CLICK".equals(str)) {
            return;
        }
        if ("DONE".equals(str2)) {
            if (!this.f325020d.getBoolean("search_widget_customization_dialog_shown", false)) {
                ((C117068f) this.f325018b).f325027a.mo28730f(true, false);
                return;
            }
            C117052a aVar = this.f325017a;
            aVar.getClass();
            aVar.mo103121a();
        } else if ("BACK".equals(str2)) {
            this.f325021e.mo80935a();
        } else if ("DIALOG_OK".equals(str2)) {
            this.f325020d.edit().putBoolean("search_widget_customization_dialog_shown", true).apply();
            C117052a aVar2 = this.f325017a;
            aVar2.getClass();
            aVar2.mo103121a();
        } else if ("DIALOG_DISMISSED".equals(str2)) {
            ((C117068f) this.f325018b).f325027a.mo28730f(false, false);
        }
    }

    /* renamed from: e */
    public final void mo103126e(String str) {
        ((C117068f) this.f325018b).f325028b.mo28730f(str, false);
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        ((C117068f) this.f325018b).f325027a.mo28730f(false, false);
        ((C117068f) this.f325018b).f325028b.mo28730f(this.f325019c.getString(R.string.customize_title), false);
    }
}
