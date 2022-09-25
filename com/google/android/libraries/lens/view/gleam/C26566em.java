package com.google.android.libraries.lens.view.gleam;

import android.app.Activity;
import android.util.Size;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.gleam.em */
/* compiled from: PG */
public final class C26566em {

    /* renamed from: a */
    private final Activity f72426a;

    public C26566em(Activity activity) {
        this.f72426a = activity;
    }

    /* renamed from: a */
    public final C58833ax mo31828a() {
        View findViewById = this.f72426a.findViewById(R.id.object_gleaming_view);
        return (findViewById == null || findViewById.getWidth() <= 0 || findViewById.getHeight() <= 0) ? C58836b.f156633a : C58833ax.m90834k(new Size(findViewById.getWidth(), findViewById.getHeight()));
    }
}
