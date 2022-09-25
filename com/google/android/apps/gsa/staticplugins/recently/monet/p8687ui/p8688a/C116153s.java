package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.recently.entry.C116077a;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.s */
/* compiled from: PG */
public final /* synthetic */ class C116153s implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ View f322077a;

    /* renamed from: b */
    public final /* synthetic */ long f322078b;

    /* renamed from: c */
    public final /* synthetic */ C116077a f322079c;

    public /* synthetic */ C116153s(View view, long j, C116077a aVar) {
        this.f322077a = view;
        this.f322078b = j;
        this.f322079c = aVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        View view = this.f322077a;
        long j = this.f322078b;
        C116077a aVar = this.f322079c;
        Bitmap bitmap = (Bitmap) obj;
        if (Objects.equals(view.getTag(), Long.valueOf(j))) {
            aVar.f321869a = bitmap;
            aVar.invalidateSelf();
            view.findViewById(R.id.entry_decorations_layout).setBackground((Drawable) null);
        }
    }
}
